package X0;

import D.F;
import H.m;
import H.n;
import H.o;
import I1.AbstractActivityC0027d;
import J1.e;
import K.C0038f;
import K.C0040h;
import K.C0044l;
import a0.C0087a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d2.C0275e;
import d2.C0279i;
import e2.AbstractC0286a;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.editing.k;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l.C1101u;
import l.r0;
import m0.C1120h;
import m0.E;
import m0.O;
import o1.i;
import o2.l;
import o2.p;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import p0.AbstractC1164b;
import s1.C1201h;
import s2.c;
import w2.AbstractC1222a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f1625a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1626b;

    /* renamed from: c, reason: collision with root package name */
    public static long f1627c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1628d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1629e;
    public static Method f;

    public static N1.a A(Context context) {
        String str;
        String str2;
        int i3;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = e.f706a.f704b;
            String str4 = e.f707b.f704b;
            String str5 = null;
            if (bundle == null) {
                str = null;
            } else {
                String string = bundle.getString(str3, null);
                if (string == null) {
                    string = bundle.getString(str4);
                }
                str = string;
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str6 = e.f.f704b;
            if (bundle2 != null) {
                bundle2.getString(str6, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str7 = e.f711g.f704b;
            if (bundle3 != null) {
                bundle3.getString(str7, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str8 = e.f708c.f704b;
            String str9 = e.f709d.f704b;
            if (bundle4 == null) {
                str2 = null;
            } else {
                String string2 = bundle4.getString(str8, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str9);
                }
                str2 = string2;
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i3 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i3);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                C(xml, jSONArray, false);
                            }
                        }
                    }
                    str5 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str10 = str5;
            String str11 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new N1.a(str, str2, str10, str11, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static MappedByteBuffer B(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void C(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z3) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z3);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    C(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static void D(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e3) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }

    public static final void F(Object[] objArr, int i3, int i4) {
        j.e(objArr, "<this>");
        while (i3 < i4) {
            objArr[i3] = null;
            i3++;
        }
    }

    public static void G(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            F.a(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void H(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void I(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    public static void J(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        r0 r0Var = r0.f9865j;
        if (r0Var != null && r0Var.f9867a == view) {
            r0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new r0(view, charSequence);
            return;
        }
        r0 r0Var2 = r0.f9866k;
        if (r0Var2 != null && r0Var2.f9867a == view) {
            r0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(p pVar, AbstractC1222a abstractC1222a, AbstractC1222a abstractC1222a2) {
        try {
            B2.a.g(F2.b.y(((AbstractC0343b) pVar).b(abstractC1222a2, abstractC1222a)), C0279i.f4852a);
        } catch (Throwable th) {
            abstractC1222a2.e(n(th));
            throw th;
        }
    }

    public static final void L(Object obj) {
        if (obj instanceof C0275e) {
            throw ((C0275e) obj).f4847a;
        }
    }

    public static String M(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static Object N(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(N(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                jSONArray2.put(N(Array.get(obj, i3)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), N(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static ActionMode.Callback O(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i3 > 27 || (callback instanceof H.p) || callback == null) ? callback : new H.p(callback, textView);
    }

    public static ArrayList P(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void Q(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static E R(Bundle bundle, String str) {
        C1120h c1120h = O.f9975i;
        if (bundle == null) {
            AbstractC0213o0.g("BillingClient", str.concat(" got null owned items list"));
            return new E(54, c1120h);
        }
        int a3 = AbstractC0213o0.a(bundle, "BillingClient");
        String e3 = AbstractC0213o0.e(bundle, "BillingClient");
        C0087a a4 = C1120h.a();
        a4.f1781b = a3;
        a4.f1780a = e3;
        C1120h a5 = a4.a();
        if (a3 != 0) {
            AbstractC0213o0.g("BillingClient", str + " failed. Response code: " + a3);
            return new E(23, a5);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC0213o0.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new E(55, c1120h);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC0213o0.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new E(56, c1120h);
        }
        if (stringArrayList2 == null) {
            AbstractC0213o0.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new E(57, c1120h);
        }
        if (stringArrayList3 != null) {
            return new E(1, O.f9976j);
        }
        AbstractC0213o0.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new E(58, c1120h);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void c(i iVar) {
        if (!iVar.f) {
            throw new IllegalStateException("AdSession is not started");
        }
        h(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(List list, C0044l c0044l, AbstractC0343b abstractC0343b) {
        C0038f c0038f;
        int i3;
        List list2;
        q qVar;
        Iterator it;
        Throwable th;
        if (abstractC0343b instanceof C0038f) {
            c0038f = (C0038f) abstractC0343b;
            int i4 = c0038f.f841g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0038f.f841g = i4 - Integer.MIN_VALUE;
                Object obj = c0038f.f;
                Object obj2 = EnumC0326a.f4994a;
                i3 = c0038f.f841g;
                if (i3 != 0) {
                    L(obj);
                    ArrayList arrayList = new ArrayList();
                    C0040h c0040h = new C0040h(list, arrayList, null);
                    c0038f.f839d = arrayList;
                    c0038f.f841g = 1;
                    if (c0044l.a(c0040h, c0038f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0038f.f840e;
                        qVar = (q) c0038f.f839d;
                        try {
                            L(obj);
                        } catch (Throwable th2) {
                            Object obj3 = qVar.f9672a;
                            if (obj3 == null) {
                                qVar.f9672a = th2;
                            } else {
                                F2.b.d((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0038f.f839d = qVar;
                            c0038f.f840e = it;
                            c0038f.f841g = 2;
                            if (lVar.invoke(c0038f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) qVar.f9672a;
                        if (th == null) {
                            return C0279i.f4852a;
                        }
                        throw th;
                    }
                    list2 = (List) c0038f.f839d;
                    L(obj);
                }
                qVar = new q();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) qVar.f9672a;
                if (th == null) {
                }
            }
        }
        c0038f = new C0038f(abstractC0343b);
        Object obj4 = c0038f.f;
        Object obj22 = EnumC0326a.f4994a;
        i3 = c0038f.f841g;
        if (i3 != 0) {
        }
        qVar = new q();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) qVar.f9672a;
        if (th == null) {
        }
    }

    public static final boolean e(Object[] objArr, int i3, int i4, List list) {
        if (i4 == list.size()) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (j.a(objArr[i3 + i5], list.get(i5))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String f(Object[] objArr, int i3, int i4, AbstractC0286a abstractC0286a) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == abstractC0286a) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static void g(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap hashMap = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
                try {
                    F2.b.a(C1201h.f10330b.f10331a.getApplicationContext(), (String) hashMap.get("mechanism"), new b0.j(hashMap));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static void h(i iVar) {
        if (iVar.f10173g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static final Bundle i(Map headers) {
        j.e(headers, "headers");
        Bundle bundle = new Bundle(headers.size());
        for (Map.Entry entry : headers.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean l(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean m3 = m(file, inputStream);
                j(inputStream);
                return m3;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean m(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final C0275e n(Throwable exception) {
        j.e(exception, "exception");
        return new C0275e(exception);
    }

    public static String o(Object value, String str) {
        j.e(value, "value");
        return str + " value: " + value;
    }

    public static void p(String str, String str2, Object obj) {
        String t3 = t(str);
        if (Log.isLoggable(t3, 3)) {
            Log.d(t3, String.format(str2, obj));
        }
    }

    public static boolean q(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable cVar = new c(0, objArr.length - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    Iterator it = cVar.iterator();
                    while (((s2.b) it).f10348c) {
                        int a3 = ((s2.b) it).a();
                        if (!q(objArr[a3], objArr2[a3])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Collection collection = (Collection) obj;
                j.e(collection, "<this>");
                Iterable cVar2 = new c(0, collection.size() - 1, 1);
                if (!(cVar2 instanceof Collection) || !((Collection) cVar2).isEmpty()) {
                    Iterator it2 = cVar2.iterator();
                    while (((s2.b) it2).f10348c) {
                        int a4 = ((s2.b) it2).a();
                        if (!q(list.get(a4), list2.get(a4))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return j.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (map2.containsKey(entry.getKey()) && q(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void r(String str, String str2, Exception exc) {
        String t3 = t(str);
        if (Log.isLoggable(t3, 6)) {
            Log.e(t3, str2, exc);
        }
    }

    public static final String s(AbstractActivityC0027d context, boolean z3, k kVar) {
        ResolveInfo resolveActivity;
        j.e(context, "context");
        f2.c cVar = new f2.c(10);
        cVar.addAll(AbstractC1164b.f10231a);
        Set set = (Set) kVar.f9216a;
        if (set != null) {
            cVar.addAll(set);
        }
        cVar.g();
        cVar.f4899c = true;
        if (cVar.f4898b <= 0) {
            cVar = f2.c.f4896d;
        }
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = cVar == null ? new ArrayList() : cVar;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z3 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (cVar != null) {
                arrayList2.addAll(cVar);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static String t(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + TokenBuilder.TOKEN_DELIMITER + Process.myTid() + TokenBuilder.TOKEN_DELIMITER;
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static B.b v(C1101u c1101u) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new B.b(o.c(c1101u));
        }
        TextPaint textPaint = new TextPaint(c1101u.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a3 = m.a(c1101u);
        int d3 = m.d(c1101u);
        if (c1101u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (c1101u.getInputType() & 15) != 3) {
                boolean z3 = c1101u.getLayoutDirection() == 1;
                switch (c1101u.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(o.b(n.a(c1101u.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new B.b(textPaint, textDirectionHeuristic, a3, d3);
    }

    public static void w(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean x() {
        if (Build.VERSION.SDK_INT >= 29) {
            return X.a.c();
        }
        try {
            if (f1628d == null) {
                f1627c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1628d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1628d.invoke(null, Long.valueOf(f1627c))).booleanValue();
        } catch (Exception e3) {
            w("isTagEnabled", e3);
            return false;
        }
    }

    public static boolean y(byte b3) {
        return b3 > -65;
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public abstract a E(String str, l lVar);

    public abstract Object k();
}

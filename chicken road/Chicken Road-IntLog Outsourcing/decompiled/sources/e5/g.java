package e5;

import E.M;
import M2.C0099c;
import T4.C0152b;
import T4.D;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import b2.AbstractC0279e;
import c0.C0301c;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import f2.C0420d;
import f4.C0431h;
import g4.AbstractC0464i;
import g4.AbstractC0465j;
import g4.AbstractC0476u;
import g4.C0471p;
import g4.C0473r;
import h2.C0482c;
import h4.C0485c;
import h4.C0488f;
import h4.C0491i;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l.q0;
import m1.InterfaceC1276c;
import n2.AbstractC1341c;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import u1.AbstractC1477a;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public abstract class g {
    public static final boolean A(String str, InterfaceC1430a interfaceC1430a) {
        try {
            boolean booleanValue = ((Boolean) interfaceC1430a.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Object B(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(B(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(B(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), B(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static ArrayList C(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0099c) {
            C0099c c0099c = (C0099c) th;
            arrayList.add(c0099c.f1858a);
            arrayList.add(c0099c.getMessage());
            arrayList.add(c0099c.f1859b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final void b(Logger logger, W4.a aVar, W4.c cVar, String str) {
        logger.fine(cVar.f3427b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3420a);
    }

    public static Q2.g c(s3.b bVar) {
        String str = bVar.f11813c;
        if (str != null) {
            return new Q2.f(2, str);
        }
        Long l2 = bVar.f11815e;
        if (l2 != null) {
            return new Q2.k(l2.longValue());
        }
        Double d6 = bVar.f11816f;
        if (d6 != null) {
            return new Q2.j(d6.doubleValue());
        }
        Boolean bool = bVar.f11814d;
        if (bool != null) {
            return new Q2.h(bool.booleanValue());
        }
        j5.i iVar = bVar.f11819i;
        if (iVar != null) {
            byte[] j2 = iVar.j();
            return new Q2.i(Arrays.copyOf(j2, j2.length));
        }
        s3.l lVar = bVar.f11818h;
        if (lVar == null) {
            s3.d dVar = bVar.f11817g;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            return new Q2.f(1, Collections.unmodifiableList((List) dVar.f11821c.stream().map(new A3.b(25)).collect(Collectors.toList())));
        }
        Map map = (Map) lVar.f11836c.stream().collect(Collectors.toMap(new A3.b(23), new A3.b(24)));
        Objects.requireNonNull(map, "value must not be null");
        Q2.d[] dVarArr = (Q2.d[]) map.entrySet().stream().map(new A3.b(13)).toArray(new Q2.e());
        Objects.requireNonNull(dVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(dVarArr.length);
        arrayList.addAll(Arrays.asList(dVarArr));
        return new Q2.f(0, Collections.unmodifiableList(arrayList));
    }

    public static void d(StringBuilder sb, Object obj, InterfaceC1441l interfaceC1441l) {
        if (interfaceC1441l != null) {
            sb.append((CharSequence) interfaceC1441l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static C0491i e(C0491i c0491i) {
        C0488f c0488f = c0491i.f5824a;
        c0488f.c();
        return c0488f.f5815i > 0 ? c0491i : C0491i.f5823b;
    }

    public static final N4.f h(String str, AbstractC1341c abstractC1341c, N4.e[] eVarArr, InterfaceC1441l builder) {
        kotlin.jvm.internal.i.e(builder, "builder");
        if (B4.k.Z(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC1341c.equals(N4.j.f2190b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        N4.a aVar = new N4.a(str);
        builder.invoke(aVar);
        return new N4.f(str, abstractC1341c, aVar.f2159b.size(), AbstractC0464i.a0(eVarArr), aVar);
    }

    public static final Bundle i(Map headers) {
        kotlin.jvm.internal.i.e(headers, "headers");
        Bundle bundle = new Bundle(headers.size());
        for (Map.Entry entry : headers.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static byte[] j(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static C0099c k(String str) {
        return new C0099c("channel-error", AbstractC0279e.f("Unable to establish connection on channel: ", str, "."), "");
    }

    public static final C0431h l(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new C0431h(exception);
    }

    public static boolean m(Method method, kotlin.jvm.internal.d dVar) {
        Class a6 = dVar.a();
        kotlin.jvm.internal.i.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a6);
    }

    public static final String n(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - PermissionsViewModel.DELAY_TIME_CALLBACK_CALL) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + PermissionsViewModel.DELAY_TIME_CALLBACK_CALL) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static T4.n o(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        T4.f b6 = T4.f.f2847b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        D.f2808b.getClass();
        D c2 = C0152b.c(protocol);
        try {
            obj = U4.e.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = C0471p.f5750a;
        }
        return new T4.n(c2, b6, U4.e.k(sSLSession.getLocalCertificates()), new T4.m(1, obj));
    }

    public static final String p(AbstractActivityC1515c context, boolean z, C0482c c0482c) {
        ResolveInfo resolveActivity;
        kotlin.jvm.internal.i.e(context, "context");
        C0485c c0485c = new C0485c(10);
        c0485c.addAll(K0.b.f1374a);
        Set set = (Set) c0482c.f5783b;
        if (set != null) {
            c0485c.addAll(set);
        }
        C0485c D5 = K1.b.D(c0485c);
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = D5 == null ? new ArrayList() : D5;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (D5 != null) {
                arrayList2.addAll(D5);
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
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }

    public static boolean q(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("ContentSizingFlag", "Could not get metadata", e3);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean r() {
        return h.f5539b;
    }

    public static Set s(Set set, Set elements) {
        kotlin.jvm.internal.i.e(set, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return AbstractC0465j.X0(set);
        }
        if (!(elements instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(elements);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!elements.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static void t(A2.e eVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = eVar.f38g;
                    int i6 = eVar.f37f;
                    if (integer != 90 && integer != 270) {
                        i6 = i3;
                        i3 = i6;
                    }
                    eVar.f33b = i3;
                    eVar.f32a = i6;
                    eVar.f34c = integer;
                    return;
                }
            }
        } catch (Exception e3) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
        }
    }

    public static final List u(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(OutcomeConstants.OUTCOME_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C0485c c0485c = new C0485c(10);
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.i.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.i.d(string2, "cursor.getString(toColumnIndex)");
            c0485c.add(new Z.c(string, i2, i3, string2));
        }
        return AbstractC0465j.P0(K1.b.D(c0485c));
    }

    public static final Z.d v(C0301c c0301c, String str, boolean z) {
        Cursor C2 = c0301c.C("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = C2;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i2 = cursor.getInt(columnIndex);
                        String columnName = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i2);
                        kotlin.jvm.internal.i.d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                Collection values = treeMap.values();
                kotlin.jvm.internal.i.d(values, "columnsMap.values");
                List S02 = AbstractC0465j.S0(values);
                Collection values2 = treeMap2.values();
                kotlin.jvm.internal.i.d(values2, "ordersMap.values");
                Z.d dVar = new Z.d(str, z, S02, AbstractC0465j.S0(values2));
                AbstractC1477a.e(C2, null);
                return dVar;
            }
            AbstractC1477a.e(C2, null);
            return null;
        } finally {
        }
    }

    public static void w(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            M.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static Set x(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C0473r.f5752a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0476u.W(objArr.length));
            AbstractC0464i.Y(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        kotlin.jvm.internal.i.d(singleton, "singleton(...)");
        return singleton;
    }

    public static final void y(Object obj) {
        if (obj instanceof C0431h) {
            throw ((C0431h) obj).f5670a;
        }
    }

    public static byte[] z(C0420d c0420d) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = c0420d.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return j(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j2 = min * (min < 4096 ? 4 : 2);
            min = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (c0420d.read() == -1) {
            return j(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public abstract void D();

    public InterfaceC1276c f(Context context, Looper looper, q0 q0Var, Object obj, m1.i iVar, m1.j jVar) {
        return g(context, looper, q0Var, obj, iVar, jVar);
    }

    public InterfaceC1276c g(Context context, Looper looper, q0 q0Var, Object obj, m1.i iVar, m1.j jVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

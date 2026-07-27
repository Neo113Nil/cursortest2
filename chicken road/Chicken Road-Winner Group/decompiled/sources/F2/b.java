package F2;

import B2.h;
import D.C0023y;
import D.H;
import D.J;
import D.K;
import D.V;
import D.z;
import H.c;
import H.d;
import Q0.g;
import R0.l;
import Y1.B;
import Y1.C0077a;
import Y1.C0079c;
import Y1.C0083g;
import Y1.m;
import Y1.n;
import Y1.v;
import Y1.w;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0132g;
import b2.InterfaceC0165b;
import b2.InterfaceC0166c;
import com.android.billingclient.api.Purchase;
import com.chicken.jump.road.pump.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import e2.AbstractC0290e;
import e2.q;
import e2.s;
import f2.f;
import f2.i;
import g0.C0314m;
import g0.InterfaceC0313l;
import g2.C0320d;
import g2.InterfaceC0319c;
import g2.InterfaceC0321e;
import i2.AbstractC0343b;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k0.C1080a;
import kotlin.jvm.internal.j;
import m0.C1113a;
import m0.C1120h;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.C1172b;
import v.C1213c;
import w2.AbstractC1239s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f380a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f381b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f382c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f383d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f384e = null;
    public static Boolean f = null;

    /* renamed from: g, reason: collision with root package name */
    public static int f385g = 2;

    public b() {
        new ConcurrentHashMap();
    }

    public static boolean A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f382c == null) {
            f382c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f382c.booleanValue();
        if (f383d == null) {
            f383d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f383d.booleanValue()) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        return i3 < 26 || i3 >= 30;
    }

    public static String B(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb.append(str2.charAt(i3));
            }
        }
        return sb.toString();
    }

    public static float C(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.c(edgeEffect, f3, f4);
        }
        c.a(edgeEffect, f3, f4);
        return f3;
    }

    public static void D(M1.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i3 = 0; i3 < trackCount; i3++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i4 = dVar.f977g;
                    int i5 = dVar.f;
                    if (integer != 90 && integer != 270) {
                        i5 = i4;
                        i4 = i5;
                    }
                    dVar.f973b = i4;
                    dVar.f972a = i5;
                    dVar.f974c = integer;
                    return;
                }
            }
        } catch (Exception e3) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
        }
    }

    public static Set E(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return q.f4879a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s.j0(objArr.length));
            AbstractC0290e.X(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(objArr[0]);
        j.d(singleton, "singleton(...)");
        return singleton;
    }

    public static String F(Throwable th) {
        j.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        j.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static v G(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3541555) {
            if (hashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return v.SUBS;
        }
        return v.INAPP;
    }

    public static ArrayList H(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B b3 = (B) it.next();
            C1113a c1113a = new C1113a();
            c1113a.f10005a = b3.f1638a;
            c1113a.f10006b = I(b3.f1639b);
            arrayList.add(c1113a.a());
        }
        return arrayList;
    }

    public static String I(v vVar) {
        int ordinal = vVar.ordinal();
        if (ordinal == 0) {
            return "inapp";
        }
        if (ordinal == 1) {
            return "subs";
        }
        throw new C0079c("UNKNOWN_TYPE", "Unknown product type: " + vVar, null);
    }

    public static boolean J(View view, InterfaceC0166c interfaceC0166c) {
        if (view != null) {
            if (interfaceC0166c.a(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    if (J(viewGroup.getChildAt(i3), interfaceC0166c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ArrayList K(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void L(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int Q2 = Q(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        R(parcel, Q2);
    }

    public static void M(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int Q2 = Q(parcel, i3);
        parcelable.writeToParcel(parcel, i4);
        R(parcel, Q2);
    }

    public static void N(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int Q2 = Q(parcel, i3);
        parcel.writeString(str);
        R(parcel, Q2);
    }

    public static void O(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int Q2 = Q(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        R(parcel, Q2);
    }

    public static void P(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int Q2 = Q(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        R(parcel, Q2);
    }

    public static int Q(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void R(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }

    public static void S(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: Exception -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0020, B:15:0x003a), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str, b0.j jVar) {
        q1.c cVar;
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            C1172b.b(context).getClass();
            q1.d dVar = (q1.d) C1172b.f10258c.get(str);
            if (!(dVar != null ? dVar.b() : false)) {
                return;
            }
            if ("FireTVFOSDAT".equals(str)) {
                cVar = new q1.c(context);
                if (cVar == null) {
                    cVar.a(jVar);
                    return;
                }
                return;
            }
            cVar = null;
            if (cVar == null) {
            }
        } catch (Exception unused) {
        }
    }

    public static boolean b(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!"omid-native".equals(parse.getScheme())) {
                return false;
            }
            X0.a.g(parse);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void d(Throwable th, Throwable exception) {
        j.e(th, "<this>");
        j.e(exception, "exception");
        if (th != exception) {
            Integer num = k2.a.f9658a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = j2.a.f9528a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static i e(i iVar) {
        f fVar = iVar.f4925a;
        fVar.b();
        fVar.f4920m = true;
        if (fVar.f4916i <= 0) {
            j.c(f.f4908n, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return fVar.f4916i > 0 ? iVar : i.f4924b;
    }

    public static A0.j h(Map map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("toolbarColor");
        Integer valueOf = str != null ? Integer.valueOf(Color.parseColor(str) | (-16777216)) : null;
        String str2 = (String) map.get("navigationBarColor");
        Integer valueOf2 = str2 != null ? Integer.valueOf((-16777216) | Color.parseColor(str2)) : null;
        String str3 = (String) map.get("navigationBarDividerColor");
        return new A0.j(valueOf, valueOf2, str3 != null ? Integer.valueOf(Color.parseColor(str3)) : null, 22);
    }

    public static void i(Context context, InterfaceC0165b interfaceC0165b) {
        Rect rect;
        V _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity u3 = u(context);
        if (u3 != null) {
            InterfaceC0313l.f4973a.getClass();
            int i3 = C0314m.f4974b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                maximumWindowMetrics = ((WindowManager) u3.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                j.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = u3.getSystemService("window");
                j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                j.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                _windowInsetsCompat = (i4 >= 30 ? new K() : i4 >= 29 ? new J() : new H()).b();
                j.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = C1080a.f9657a.a(u3);
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(B0.c.g(i5, i7, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i6 > i8) {
                throw new IllegalArgumentException(B0.c.g(i6, i8, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            j.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((FlutterEngine) interfaceC0165b).f9098a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Object j(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final void k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d(th, th2);
            }
        }
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = z.f259a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0023y.f255d;
        C0023y c0023y = (C0023y) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0023y == null) {
            c0023y = new C0023y();
            c0023y.f256a = null;
            c0023y.f257b = null;
            c0023y.f258c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0023y);
        }
        WeakReference weakReference2 = c0023y.f258c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0023y.f258c = new WeakReference(keyEvent);
        if (c0023y.f257b == null) {
            c0023y.f257b = new SparseArray();
        }
        SparseArray sparseArray = c0023y.f257b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static String q(C0132g c0132g) {
        StringBuilder sb = new StringBuilder(c0132g.size());
        for (int i3 = 0; i3 < c0132g.size(); i3++) {
            byte b3 = c0132g.b(i3);
            if (b3 == 34) {
                sb.append("\\\"");
            } else if (b3 == 39) {
                sb.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append((char) (((b3 >>> 6) & 3) + 48));
                            sb.append((char) (((b3 >>> 3) & 7) + 48));
                            sb.append((char) ((b3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b3);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static n s(C1120h c1120h) {
        m mVar;
        int i3 = c1120h.f10046a;
        if (i3 != 12) {
            mVar = m.ERROR;
            switch (i3) {
                case -2:
                    mVar = m.FEATURE_NOT_SUPPORTED;
                    break;
                case -1:
                    mVar = m.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    mVar = m.OK;
                    break;
                case 1:
                    mVar = m.USER_CANCELED;
                    break;
                case 2:
                    mVar = m.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    mVar = m.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    mVar = m.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    mVar = m.DEVELOPER_ERROR;
                    break;
                case 7:
                    mVar = m.ITEM_ALREADY_OWNED;
                    break;
                case 8:
                    mVar = m.ITEM_NOT_OWNED;
                    break;
            }
        } else {
            mVar = m.NETWORK_ERROR;
        }
        String str = c1120h.f10047b;
        n nVar = new n();
        nVar.f1707a = mVar;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
        }
        nVar.f1708b = str;
        return nVar;
    }

    public static List t(List list) {
        Iterator it;
        C1113a c1113a;
        C0083g c0083g;
        ArrayList arrayList;
        C0083g c0083g2;
        Y1.z zVar;
        Y1.q qVar;
        JSONArray optJSONArray;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            String optString = purchase.f2540c.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                optString = null;
            }
            JSONObject jSONObject = purchase.f2540c;
            String optString2 = jSONObject.optString("packageName");
            Long valueOf = Long.valueOf(jSONObject.optLong("purchaseTime"));
            String b3 = purchase.b();
            ArrayList a3 = purchase.a();
            Boolean valueOf2 = Boolean.valueOf(jSONObject.optBoolean("autoRenewing"));
            String optString3 = jSONObject.optString("developerPayload");
            Boolean valueOf3 = Boolean.valueOf(jSONObject.optBoolean("acknowledged", true));
            char c3 = jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
            Y1.z zVar2 = Y1.z.UNSPECIFIED;
            if (c3 != 0) {
                if (c3 == 1) {
                    zVar2 = Y1.z.PURCHASED;
                } else if (c3 == 2) {
                    zVar2 = Y1.z.PENDING;
                }
            }
            Long valueOf4 = Long.valueOf(jSONObject.optInt("quantity", 1));
            String optString4 = jSONObject.optString("obfuscatedAccountId");
            String optString5 = jSONObject.optString("obfuscatedProfileId");
            if (optString4 == null && optString5 == null) {
                it = it2;
                c1113a = null;
            } else {
                it = it2;
                c1113a = new C1113a();
                c1113a.f10005a = optString4;
                c1113a.f10006b = optString5;
            }
            if (c1113a != null) {
                c0083g = new C0083g();
                c0083g.f1678a = c1113a.f10005a;
                c0083g.f1679b = c1113a.f10006b;
            } else {
                c0083g = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
            b0.j jVar = optJSONObject == null ? null : new b0.j(optJSONObject);
            if (jVar != null) {
                JSONObject jSONObject2 = (JSONObject) jVar.f2462a;
                String optString6 = jSONObject2.optString("purchaseToken");
                arrayList = arrayList2;
                ArrayList arrayList3 = new ArrayList();
                c0083g2 = c0083g;
                if (!jSONObject2.has("productIds") || (optJSONArray = jSONObject2.optJSONArray("productIds")) == null) {
                    zVar = zVar2;
                } else {
                    zVar = zVar2;
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        arrayList3.add(optJSONArray.optString(i3));
                    }
                }
                qVar = new Y1.q();
                qVar.f1714a = arrayList3;
                if (optString6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                qVar.f1715b = optString6;
            } else {
                arrayList = arrayList2;
                c0083g2 = c0083g;
                zVar = zVar2;
                qVar = null;
            }
            w wVar = new w();
            wVar.f1734a = optString;
            if (optString2 == null) {
                throw new IllegalStateException("Nonnull field \"packageName\" is null.");
            }
            wVar.f1735b = optString2;
            wVar.f1736c = valueOf;
            if (b3 == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            wVar.f1737d = b3;
            String str = purchase.f2539b;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            wVar.f1738e = str;
            wVar.f = a3;
            wVar.f1739g = valueOf2;
            String str2 = purchase.f2538a;
            if (str2 == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            wVar.f1740h = str2;
            if (optString3 == null) {
                throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
            }
            wVar.f1741i = optString3;
            wVar.f1742j = valueOf3;
            wVar.f1743k = valueOf4;
            wVar.f1744l = zVar;
            wVar.f1745m = c0083g2;
            wVar.f1746n = qVar;
            ArrayList arrayList4 = arrayList;
            arrayList4.add(wVar);
            arrayList2 = arrayList4;
            it2 = it;
        }
        return arrayList2;
    }

    public static Activity u(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return u(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int v(Context context, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? i3 : i4;
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class x(t2.c cVar) {
        j.e(cVar, "<this>");
        Class a3 = ((kotlin.jvm.internal.d) cVar).a();
        if (a3.isPrimitive()) {
            String name = a3.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a3;
    }

    public static InterfaceC0319c y(InterfaceC0319c interfaceC0319c) {
        j.e(interfaceC0319c, "<this>");
        AbstractC0343b abstractC0343b = interfaceC0319c instanceof AbstractC0343b ? (AbstractC0343b) interfaceC0319c : null;
        if (abstractC0343b == null || (interfaceC0319c = abstractC0343b.f5030c) != null) {
            return interfaceC0319c;
        }
        InterfaceC0321e interfaceC0321e = (InterfaceC0321e) abstractC0343b.getContext().k(C0320d.f4980a);
        InterfaceC0319c hVar = interfaceC0321e != null ? new h((AbstractC1239s) interfaceC0321e, abstractC0343b) : abstractC0343b;
        abstractC0343b.f5030c = hVar;
        return hVar;
    }

    public static boolean z(Context context) {
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

    public Q0.c f(Context context, Looper looper, A0.h hVar, Object obj, g gVar, Q0.h hVar2) {
        return g(context, looper, hVar, obj, (l) gVar, (l) hVar2);
    }

    public Q0.c g(Context context, Looper looper, A0.h hVar, Object obj, l lVar, l lVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface l(Context context, C1213c c1213c, Resources resources, int i3);

    public abstract Typeface m(Context context, A.j[] jVarArr, int i3);

    public Typeface n(Context context, InputStream inputStream) {
        File u3 = X0.a.u(context);
        if (u3 == null) {
            return null;
        }
        try {
            if (X0.a.m(u3, inputStream)) {
                return Typeface.createFromFile(u3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u3.delete();
        }
    }

    public Typeface o(Context context, Resources resources, int i3, String str, int i4) {
        File u3 = X0.a.u(context);
        if (u3 == null) {
            return null;
        }
        try {
            if (X0.a.l(u3, resources, i3)) {
                return Typeface.createFromFile(u3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u3.delete();
        }
    }

    public A.j r(A.j[] jVarArr, int i3) {
        new C0077a(26);
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z3 = (i3 & 2) != 0;
        A.j jVar = null;
        int i5 = Integer.MAX_VALUE;
        for (A.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f26c - i4) * 2) + (jVar2.f27d == z3 ? 0 : 1);
            if (jVar == null || i5 > abs) {
                jVar = jVar2;
                i5 = abs;
            }
        }
        return jVar;
    }
}

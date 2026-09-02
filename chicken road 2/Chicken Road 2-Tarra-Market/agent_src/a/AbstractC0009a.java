package a;

import A.n;
import A.p;
import C0.g;
import J0.b;
import M0.e;
import M0.f;
import M0.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.lifecycle.l;
import b1.AbstractC0028p;
import g1.h;
import h0.c;
import i1.o;
import io.flutter.embedding.engine.FlutterEngine;
import j1.d;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import n.C0792f;
import n.C0793g;
import n.C0794h;
import n.r;
import org.json.JSONArray;
import org.json.JSONObject;
import p.AbstractC0819i;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0009a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f538b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f539c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f540d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f541e;

    /* renamed from: f, reason: collision with root package name */
    public static long f542f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f543g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f544h;

    /* renamed from: i, reason: collision with root package name */
    public static Method f545i;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f546a;

    public /* synthetic */ AbstractC0009a(int i2) {
        this.f546a = i2;
    }

    public static int A(Parcel parcel, int i2) {
        K(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int B(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static String C(o oVar) {
        int length = oVar.f1376a.length() + 3;
        String str = oVar.f1383h;
        int indexOf = str.indexOf(47, length);
        String substring = str.substring(indexOf, d.h(str, indexOf, str.length(), "?#"));
        String e2 = oVar.e();
        if (e2 == null) {
            return substring;
        }
        return substring + '?' + e2;
    }

    public static void F(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i2));
    }

    public static final K0.d G(String str, String str2) {
        return new K0.d(str, str2);
    }

    public static String H(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int I(Parcel parcel) {
        int readInt = parcel.readInt();
        int B2 = B(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new H.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = B2 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new H.a("Size read is invalid start=" + dataPosition + " end=" + i2, parcel);
    }

    public static Object J(Object obj) {
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
                jSONArray.put(J(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(J(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), J(entry.getValue()));
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

    public static void K(Parcel parcel, int i2, int i3) {
        int B2 = B(parcel, i2);
        if (B2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(B2);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(B2);
        sb.append(" (0x");
        throw new H.a(AbstractC0819i.b(sb, hexString, ")"), parcel);
    }

    public static void a(Context context, b bVar) {
        Rect rect;
        r _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity k2 = k(context);
        if (k2 != null) {
            n.f34a.getClass();
            int i2 = p.f35b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) k2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                j.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = k2.getSystemService("window");
                j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                j.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                _windowInsetsCompat = (i3 >= 30 ? new C0794h() : i3 >= 29 ? new C0793g() : new C0792f()).b();
                j.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = E.b.f171a.a(k2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            }
            if (i5 <= i7) {
                j.e(_windowInsetsCompat, "_windowInsetsCompat");
                ((FlutterEngine) bVar).f5719a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    public static final long e(InputStream inputStream, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static Parcelable f(Parcel parcel, int i2, Parcelable.Creator creator) {
        int B2 = B(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (B2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + B2);
        return parcelable;
    }

    public static String g(Parcel parcel, int i2) {
        int B2 = B(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (B2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + B2);
        return readString;
    }

    public static Object[] h(Parcel parcel, int i2, Parcelable.Creator creator) {
        int B2 = B(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (B2 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + B2);
        return createTypedArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Activity activity, androidx.lifecycle.d event) {
        l b2;
        j.e(activity, "activity");
        j.e(event, "event");
        if (!(activity instanceof androidx.lifecycle.j) || (b2 = ((androidx.lifecycle.j) activity).b()) == null) {
            return;
        }
        b2.d(event);
    }

    public static void j(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new H.a(g.g(i2, "Overread allowed size end="), parcel);
        }
    }

    public static Activity k(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return k(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void p(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static M0.d r(M0.d dVar) {
        j.e(dVar, "<this>");
        O0.b bVar = dVar instanceof O0.b ? (O0.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        M0.d dVar2 = bVar.f278c;
        if (dVar2 != null) {
            return dVar2;
        }
        i iVar = bVar.f277b;
        j.b(iVar);
        f fVar = (f) iVar.i(e.f225a);
        M0.d hVar = fVar != null ? new h((AbstractC0028p) fVar, bVar) : bVar;
        bVar.f278c = hVar;
        return hVar;
    }

    public static boolean s(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f538b == null) {
            f538b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f538b.booleanValue();
        if (f539c == null) {
            f539c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f539c.booleanValue()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 26 || i2 >= 30;
    }

    public static K0.g t(U0.a initializer) {
        j.e(initializer, "initializer");
        return new K0.g(initializer);
    }

    public static void u(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void v(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static i w(i iVar, i context) {
        j.e(context, "context");
        return context == M0.j.f226a ? iVar : (i) context.j(iVar, new M0.b(1));
    }

    public static void x(w0.e eVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = eVar.f6754g;
                    int i4 = eVar.f6753f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    eVar.f6749b = i3;
                    eVar.f6748a = i4;
                    eVar.f6750c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static boolean y(Parcel parcel, int i2) {
        K(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static final byte[] z(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        e(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public abstract void E(boolean z2);

    @Override // h0.c
    public void b(String str, HashMap hashMap) {
        o().b(str, hashMap);
    }

    @Override // h0.c
    public void c(Serializable serializable) {
        o().c(serializable);
    }

    public abstract List d(String str, List list);

    public abstract Object l(String str);

    public abstract String m();

    public boolean n() {
        return Boolean.TRUE.equals(l("noResult"));
    }

    public abstract c o();

    public abstract boolean q();

    public String toString() {
        switch (this.f546a) {
            case 17:
                return m() + " " + ((String) l("sql")) + " " + ((List) l("arguments"));
            default:
                return super.toString();
        }
    }

    public void D(boolean z2) {
    }
}

package a;

import B4.k;
import C1.b;
import D4.AbstractC0024y;
import D4.C0016p;
import E.F;
import E.G;
import I4.t;
import M0.g;
import T4.j;
import U4.e;
import W.B;
import W.o;
import W.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import b2.AbstractC0279e;
import com.chickyneer.roadway.R;
import f0.AbstractC0415a;
import f4.C0433j;
import f4.C0434k;
import f4.C0442s;
import f4.EnumC0429f;
import f4.InterfaceC0428e;
import f4.w;
import g4.AbstractC0466k;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
import l4.EnumC1260a;
import m5.n;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;
import y4.C1573b;
import y4.C1574c;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0169a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3814a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3815b;

    /* renamed from: c, reason: collision with root package name */
    public static long f3816c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f3817d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f3818e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3819f;

    public static C0434k A(InterfaceC1430a initializer) {
        i.e(initializer, "initializer");
        return new C0434k(initializer);
    }

    public static void B(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void C(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static long D(int i2, String str) {
        int g6 = g(str, 0, i2, false);
        Matcher matcher = j.f2889n.matcher(str);
        int i3 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (g6 < i2) {
            int g7 = g(str, g6 + 1, i2, true);
            matcher.region(g6, g7);
            if (i6 == -1 && matcher.usePattern(j.f2889n).matches()) {
                String group = matcher.group(1);
                i.d(group, "group(...)");
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i.d(group2, "group(...)");
                i9 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i.d(group3, "group(...)");
                i10 = Integer.parseInt(group3);
            } else if (i7 == -1 && matcher.usePattern(j.f2888m).matches()) {
                String group4 = matcher.group(1);
                i.d(group4, "group(...)");
                i7 = Integer.parseInt(group4);
            } else {
                if (i8 == -1) {
                    Pattern pattern = j.f2887l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        i.d(group5, "group(...)");
                        Locale US = Locale.US;
                        i.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        i.d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        i.d(pattern2, "pattern(...)");
                        i8 = k.X(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(j.f2886k).matches()) {
                    String group6 = matcher.group(1);
                    i.d(group6, "group(...)");
                    i3 = Integer.parseInt(group6);
                }
            }
            g6 = g(str, g7 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i7 || i7 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f3179a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i8 - 1);
        gregorianCalendar.set(5, i7);
        gregorianCalendar.set(11, i6);
        gregorianCalendar.set(12, i9);
        gregorianCalendar.set(13, i10);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final Object G(t tVar, t tVar2, InterfaceC1445p interfaceC1445p) {
        Object c0016p;
        Object M5;
        try {
            v.b(2, interfaceC1445p);
            c0016p = interfaceC1445p.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0016p = new C0016p(th, false);
        }
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (c0016p == enumC1260a || (M5 = tVar.M(c0016p)) == AbstractC0024y.f552e) {
            return enumC1260a;
        }
        if (M5 instanceof C0016p) {
            throw ((C0016p) M5).f526a;
        }
        return AbstractC0024y.u(M5);
    }

    public static boolean H(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static String I(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static List K(Throwable th) {
        if (th instanceof g) {
            g gVar = (g) th;
            return AbstractC0466k.A0(gVar.f1790a, gVar.f1791b, null);
        }
        return AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static void L(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int R5 = R(parcel, i2);
        parcel.writeBundle(bundle);
        S(parcel, R5);
    }

    public static void M(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int R5 = R(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        S(parcel, R5);
    }

    public static void N(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int R5 = R(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        S(parcel, R5);
    }

    public static void O(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int R5 = R(parcel, i2);
        parcel.writeString(str);
        S(parcel, R5);
    }

    public static void P(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int R5 = R(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        S(parcel, R5);
    }

    public static void Q(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int R5 = R(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
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
        S(parcel, R5);
    }

    public static int R(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void S(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void T(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap a(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else {
                        if (i2 != 5) {
                            return bitmap;
                        }
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
        }
        return bitmap;
    }

    public static void b(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder i3 = AbstractC0279e.i(i2, "radix ", " was not in valid range ");
            i3.append(new C1574c(2, 36, 1));
            throw new IllegalArgumentException(i3.toString());
        }
    }

    public static int d(B b6, o oVar, View view, View view2, W.t tVar, boolean z) {
        int s2;
        int t5;
        if (tVar.p() == 0 || b6.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            ((u) view.getLayoutParams()).getClass();
            throw null;
        }
        int b7 = oVar.b(view2) - oVar.c(view);
        switch (oVar.f3362b) {
            case 0:
                W.t tVar2 = oVar.f3361a;
                s2 = tVar2.f3372f - tVar2.s();
                t5 = tVar2.t();
                break;
            default:
                W.t tVar3 = oVar.f3361a;
                s2 = tVar3.f3373g - tVar3.u();
                t5 = tVar3.r();
                break;
        }
        return Math.min(s2 - t5, b7);
    }

    public static int e(B b6, o oVar, View view, View view2, W.t tVar, boolean z) {
        if (tVar.p() == 0 || b6.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b6.a();
        }
        oVar.b(view2);
        oVar.c(view);
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static int g(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean i(Object obj, Object obj2) {
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
                Iterable c1574c = new C1574c(0, objArr.length - 1, 1);
                if ((c1574c instanceof Collection) && ((Collection) c1574c).isEmpty()) {
                    return true;
                }
                Iterator it = c1574c.iterator();
                while (((C1573b) it).f12444c) {
                    int a6 = ((C1573b) it).a();
                    if (!i(objArr[a6], objArr2[a6])) {
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
                i.e(collection, "<this>");
                Iterable c1574c2 = new C1574c(0, collection.size() - 1, 1);
                if ((c1574c2 instanceof Collection) && ((Collection) c1574c2).isEmpty()) {
                    return true;
                }
                Iterator it2 = c1574c2.iterator();
                while (((C1573b) it2).f12444c) {
                    int a7 = ((C1573b) it2).a();
                    if (!i(list.get(a7), list2.get(a7))) {
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return i.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (map.isEmpty()) {
                return true;
            }
            for (Map.Entry entry : map.entrySet()) {
                if (map2.containsKey(entry.getKey()) && i(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean j(String current, String str) {
        i.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i6 = 0;
            while (true) {
                if (i2 < current.length()) {
                    char charAt = current.charAt(i2);
                    int i7 = i6 + 1;
                    if (i6 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i3 - 1 == 0 && i6 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i2++;
                    i6 = i7;
                } else if (i3 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return i.a(k.n0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = G.f566a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = F.f562d;
        F f3 = (F) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (f3 == null) {
            f3 = new F();
            f3.f563a = null;
            f3.f564b = null;
            f3.f565c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, f3);
        }
        WeakReference weakReference2 = f3.f565c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        f3.f565c = new WeakReference(keyEvent);
        if (f3.f564b == null) {
            f3.f564b = new SparseArray();
        }
        SparseArray sparseArray = f3.f564b;
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

    public static final boolean m(char c2, char c6, boolean z) {
        if (c2 == c6) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int n(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static String s(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static void t(String str, Exception exc) {
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
            return AbstractC0415a.c();
        }
        try {
            if (f3817d == null) {
                f3816c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3817d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3817d.invoke(null, Long.valueOf(f3816c))).booleanValue();
        } catch (Exception e3) {
            t("isTagEnabled", e3);
            return false;
        }
    }

    public static final boolean y(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static InterfaceC0428e z(EnumC0429f enumC0429f, InterfaceC1430a interfaceC1430a) {
        int ordinal = enumC0429f.ordinal();
        if (ordinal == 0) {
            return new C0434k(interfaceC1430a);
        }
        C0442s c0442s = C0442s.f5686a;
        if (ordinal == 1) {
            C0433j c0433j = new C0433j();
            c0433j.f5672a = interfaceC1430a;
            c0433j.f5673b = c0442s;
            return c0433j;
        }
        if (ordinal != 2) {
            throw new b();
        }
        w wVar = new w();
        wVar.f5690a = interfaceC1430a;
        wVar.f5691b = c0442s;
        return wVar;
    }

    public abstract void E();

    public abstract void F(l5.a aVar);

    public abstract void J();

    public abstract List c(String str, List list);

    public abstract String h(byte[] bArr, int i2, int i3);

    public abstract int l(String str, byte[] bArr, int i2, int i3);

    public abstract l5.a o();

    public abstract InterfaceC1430a p();

    public abstract InterfaceC1441l q();

    public abstract n r();

    public void u(int i2) {
        if (i2 == -2) {
            q().invoke(Boolean.TRUE);
        } else if (i2 == -1) {
            q().invoke(Boolean.FALSE);
        } else {
            if (i2 != 1) {
                return;
            }
            p().invoke();
        }
    }

    public abstract void v();

    public abstract boolean w();
}

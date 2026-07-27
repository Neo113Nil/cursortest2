package a;

import A.e;
import B2.s;
import T0.b;
import T1.l;
import U.D;
import U.u;
import U.v;
import Y1.C0079c;
import android.app.UiModeManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.webkit.WebView;
import b0.AbstractC0157c;
import b0.C0156b;
import b0.InterfaceC0158d;
import b0.m;
import d0.C0268h;
import g2.InterfaceC0322f;
import g2.g;
import g2.h;
import g2.i;
import h2.EnumC0326a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import o2.p;
import org.xmlpull.v1.XmlPullParserException;
import q.C1169c;
import q.f;
import r.AbstractC1173a;
import s2.c;
import v.AbstractC1211a;
import v.C1213c;
import v.C1214d;
import v.C1215e;
import v.InterfaceC1212b;
import w2.AbstractC1242v;
import w2.C1235n;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086a {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f1779a;

    public static boolean E(String str) {
        C0156b c0156b = m.f2465a;
        Set<InterfaceC0158d> unmodifiableSet = Collections.unmodifiableSet(AbstractC0157c.f2451c);
        HashSet hashSet = new HashSet();
        for (InterfaceC0158d interfaceC0158d : unmodifiableSet) {
            if (((AbstractC0157c) interfaceC0158d).f2452a.equals(str)) {
                hashSet.add(interfaceC0158d);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC0157c abstractC0157c = (AbstractC0157c) ((InterfaceC0158d) it.next());
            if (abstractC0157c.a() || abstractC0157c.b()) {
                return true;
            }
        }
        return false;
    }

    public static void F(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void G(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static h H(InterfaceC0322f interfaceC0322f, g key) {
        j.e(key, "key");
        return j.a(interfaceC0322f.getKey(), key) ? i.f4981a : interfaceC0322f;
    }

    public static C0268h I(String str) {
        String group;
        if (str == null || v2.m.n0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        j.d(description, "description");
        return new C0268h(description, parseInt, parseInt2, parseInt3);
    }

    public static InterfaceC1212b J(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            X(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1173a.f10270a);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, 500);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                X(xmlResourceParser);
            }
            return new C1215e(new e(string, string2, string3, O(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1173a.f10271b);
                    int i3 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i4 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i5 = obtainAttributes2.getInt(i4, 0);
                    int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                    String string6 = obtainAttributes2.getString(i6);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        X(xmlResourceParser);
                    }
                    arrayList.add(new C1214d(string6, i3, z3, string5, i5, resourceId2));
                } else {
                    X(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1213c((C1214d[]) arrayList.toArray(new C1214d[0]));
    }

    public static boolean M(Parcel parcel, int i3) {
        i0(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static final byte[] N(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static List O(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC1211a.a(obtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static IBinder P(Parcel parcel, int i3) {
        int S2 = S(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (S2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + S2);
        return readStrongBinder;
    }

    public static int Q(Parcel parcel, int i3) {
        i0(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long R(Parcel parcel, int i3) {
        i0(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int S(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void X(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static void Y(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + S(parcel, i3));
    }

    public static final Object Z(s sVar, s sVar2, p pVar) {
        Object c1235n;
        Object J2;
        try {
            t.a(2, pVar);
            c1235n = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            c1235n = new C1235n(th, false);
        }
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        if (c1235n == enumC0326a || (J2 = sVar.J(c1235n)) == AbstractC1242v.f10529d) {
            return enumC0326a;
        }
        if (J2 instanceof C1235n) {
            throw ((C1235n) J2).f10517a;
        }
        return AbstractC1242v.l(J2);
    }

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static boolean a0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] == bArr2[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final G2.a b(l lVar) {
        Boolean bool = (Boolean) lVar.a("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required");
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) lVar.a("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required");
        }
        boolean booleanValue2 = bool2.booleanValue();
        Integer num = (Integer) lVar.a("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required");
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) lVar.a("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required");
        }
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) lVar.a("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required");
        }
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) lVar.a("audioMode");
        if (num4 != null) {
            return new G2.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required");
    }

    public static final String b0(String str) {
        j.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        j.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        j.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        j.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static void c(StringBuilder sb, Object obj, o2.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
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

    public static c c0(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new c(i3, i4 - 1, 1);
        }
        c cVar = c.f10350d;
        return c.f10350d;
    }

    public static Bitmap d(Bitmap bitmap, int i3) {
        if (bitmap != null) {
            switch (i3) {
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
                    if (i3 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i3);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static int e0(Parcel parcel) {
        int readInt = parcel.readInt();
        int S2 = S(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i3 = S2 + dataPosition;
        if (i3 < dataPosition || i3 > parcel.dataSize()) {
            throw new b(B0.c.g(dataPosition, i3, "Size read is invalid start=", " end="), parcel);
        }
        return i3;
    }

    public static final boolean f0(String str, o2.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.invoke()).booleanValue();
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

    public static ArrayList g0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0079c) {
            C0079c c0079c = (C0079c) th;
            arrayList.add(c0079c.f1670a);
            arrayList.add(c0079c.getMessage());
            arrayList.add(c0079c.f1671b);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void h(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(B0.c.g(i3, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static int i(D d3, Q.b bVar, View view, View view2, u uVar, boolean z3) {
        if (uVar.p() == 0 || d3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z3) {
            return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static void i0(Parcel parcel, int i3, int i4) {
        int S2 = S(parcel, i3);
        if (S2 == i4) {
            return;
        }
        String hexString = Integer.toHexString(S2);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(S2);
        sb.append(" (0x");
        throw new b(B0.c.l(sb, hexString, ")"), parcel);
    }

    public static int j(D d3, Q.b bVar, View view, View view2, u uVar, boolean z3) {
        if (uVar.p() == 0 || d3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return d3.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static final long l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j3 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j3 += read;
            read = inputStream.read(bArr);
        }
        return j3;
    }

    public static C0079c m(String str) {
        return new C0079c("channel-error", B0.c.k("Unable to establish connection on channel: ", str, "."), "");
    }

    public static Parcelable n(Parcel parcel, int i3, Parcelable.Creator creator) {
        int S2 = S(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (S2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + S2);
        return parcelable;
    }

    public static String o(Parcel parcel, int i3) {
        int S2 = S(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (S2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + S2);
        return readString;
    }

    public static Object[] p(Parcel parcel, int i3, Parcelable.Creator creator) {
        int S2 = S(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (S2 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + S2);
        return createTypedArray;
    }

    public static ArrayList q(Parcel parcel, int i3, Parcelable.Creator creator) {
        int S2 = S(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (S2 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + S2);
        return createTypedArrayList;
    }

    public static boolean s(Method method, kotlin.jvm.internal.e eVar) {
        Class a3 = eVar.a();
        j.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a3);
    }

    public static void u(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new b(B0.c.h(i3, "Overread allowed size end="), parcel);
        }
    }

    public static InvocationHandler v() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static InterfaceC0322f w(InterfaceC0322f interfaceC0322f, g key) {
        j.e(key, "key");
        if (j.a(interfaceC0322f.getKey(), key)) {
            return interfaceC0322f;
        }
        return null;
    }

    public abstract H2.p A();

    public void B(int i3) {
        if (i3 == -2) {
            z().invoke(Boolean.TRUE);
        } else if (i3 == -1) {
            z().invoke(Boolean.FALSE);
        } else {
            if (i3 != 1) {
                return;
            }
            y().invoke();
        }
    }

    public abstract void C();

    public abstract boolean D();

    public abstract void K(f fVar, f fVar2);

    public abstract void L(f fVar, Thread thread);

    public abstract void T();

    public abstract void V(boolean z3);

    public abstract void W(G2.a aVar);

    public abstract void d0();

    public abstract boolean e(q.g gVar, C1169c c1169c);

    public abstract boolean f(q.g gVar, Object obj, Object obj2);

    public abstract boolean g(q.g gVar, f fVar, f fVar2);

    public abstract void h0(byte[] bArr, int i3, int i4);

    public abstract String r(byte[] bArr, int i3, int i4);

    public abstract int t(String str, byte[] bArr, int i3, int i4);

    public abstract G2.a x();

    public abstract o2.a y();

    public abstract o2.l z();

    public void U(boolean z3) {
    }
}

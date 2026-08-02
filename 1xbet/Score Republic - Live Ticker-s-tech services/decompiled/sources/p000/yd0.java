package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yd0 {

    /* JADX INFO: renamed from: j */
    public static Context f9275j = null;

    /* JADX INFO: renamed from: k */
    public static Boolean f9276k = null;

    /* JADX INFO: renamed from: l */
    public static final C0834wb f9277l = new C0834wb();

    /* JADX INFO: renamed from: m */
    public static final byte[] f9278m = {112, 114, 111, 0};

    /* JADX INFO: renamed from: n */
    public static final byte[] f9279n = {112, 114, 109, 0};

    /* JADX INFO: renamed from: o */
    public static volatile boolean f9280o = true;

    /* JADX INFO: renamed from: A */
    public static void m5756A(ByteArrayOutputStream byteArrayOutputStream, C0777us c0777us, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        wm1.m5364m(byteArrayOutputStream, str.getBytes(charset).length);
        wm1.m5364m(byteArrayOutputStream, c0777us.f7896e);
        wm1.m5363l(byteArrayOutputStream, c0777us.f7897f, 4);
        wm1.m5363l(byteArrayOutputStream, c0777us.f7894c, 4);
        wm1.m5363l(byteArrayOutputStream, c0777us.f7898g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: B */
    public static void m5757B(ByteArrayOutputStream byteArrayOutputStream, int i, C0777us c0777us) throws IOException {
        int i2 = c0777us.f7898g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0777us.f7900i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: C */
    public static void m5758C(ByteArrayOutputStream byteArrayOutputStream, C0777us c0777us) throws IOException {
        int i = 0;
        for (Map.Entry entry : c0777us.f7900i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                wm1.m5364m(byteArrayOutputStream, iIntValue - i);
                wm1.m5364m(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static String m5759D(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m5760E(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m5760E(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public static String m5760E(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM286i = AbstractC0024an.m286i(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM286i), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM286i.length() + 8 + name2.length() + 1);
            sb.append("<");
            sb.append(strM286i);
            sb.append(" threw ");
            sb.append(name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m5761F(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: a */
    public static C0650rc m5762a(int i, EnumC0576pc enumC0576pc, int i2) {
        int i3 = i2 & 2;
        EnumC0576pc enumC0576pc2 = EnumC0576pc.f6080j;
        if (i3 != 0) {
            enumC0576pc = enumC0576pc2;
        }
        if (i == -2) {
            if (enumC0576pc != enumC0576pc2) {
                return new C0178el(1, enumC0576pc);
            }
            InterfaceC0690sf.f7109a.getClass();
            return new C0650rc(C0653rf.f6834b);
        }
        if (i == -1) {
            if (enumC0576pc == enumC0576pc2) {
                return new C0178el(1, EnumC0576pc.f6081k);
            }
            C0270h1.m2190f("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return enumC0576pc == enumC0576pc2 ? new C0650rc(0) : new C0178el(1, enumC0576pc);
        }
        if (i != Integer.MAX_VALUE) {
            return enumC0576pc == enumC0576pc2 ? new C0650rc(i) : new C0178el(i, enumC0576pc);
        }
        return new C0650rc(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5763b(C0143dm c0143dm) {
        int[] iArr = c0143dm.f1736o0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0143dm c0143dm2 = c0143dm.f1699S;
        C0179em c0179em = c0143dm2 != null ? (C0179em) c0143dm2 : null;
        if (c0179em != null) {
            int i3 = c0179em.f1736o0[0];
        }
        if (c0179em != null) {
            int i4 = c0179em.f1736o0[1];
        }
        boolean z = i == 1 || c0143dm.mo1270y() || i == 2 || (i == 3 && c0143dm.f1739r == 0 && c0143dm.f1702V == 0.0f && c0143dm.m1263r(0)) || (i == 3 && c0143dm.f1739r == 1 && c0143dm.m1264s(0, c0143dm.m1260o()));
        boolean z2 = i2 == 1 || c0143dm.mo1271z() || i2 == 2 || (i2 == 3 && c0143dm.f1740s == 0 && c0143dm.f1702V == 0.0f && c0143dm.m1263r(1)) || (i2 == 3 && c0143dm.f1740s == 1 && c0143dm.m1264s(1, c0143dm.m1256i()));
        return (c0143dm.f1702V > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: c */
    public static void m5764c(Object obj) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h("Cannot return null from a non-@Nullable component method");
    }

    /* JADX INFO: renamed from: d */
    public static void m5765d(Object obj) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m5766e(C0777us[] c0777usArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C0777us c0777us : c0777usArr) {
            length += ((((c0777us.f7898g * 2) + 7) & (-8)) / 8) + (c0777us.f7896e * 2) + m5767f(c0777us.f7892a, c0777us.f7893b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0777us.f7897f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, af0.f168e)) {
            int length2 = c0777usArr.length;
            while (i < length2) {
                C0777us c0777us2 = c0777usArr[i];
                m5756A(byteArrayOutputStream, c0777us2, m5767f(c0777us2.f7892a, c0777us2.f7893b, bArr));
                m5787z(byteArrayOutputStream, c0777us2);
                i++;
            }
        } else {
            for (C0777us c0777us3 : c0777usArr) {
                m5756A(byteArrayOutputStream, c0777us3, m5767f(c0777us3.f7892a, c0777us3.f7893b, bArr));
            }
            int length3 = c0777usArr.length;
            while (i < length3) {
                m5787z(byteArrayOutputStream, c0777usArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: f */
    public static String m5767f(String str, String str2, byte[] bArr) {
        byte[] bArr2 = af0.f169f;
        byte[] bArr3 = af0.f170g;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0024an.m285h(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public static Drawable m5768g(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f9280o) {
                return m5774m(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f9280o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = k21.f4266a;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: h */
    public static int m5769h(List list, InputStream inputStream, nk0 nk0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h01(inputStream, nk0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo1766b = ((fc0) list.get(i)).mo1766b(inputStream, nk0Var);
                inputStream.reset();
                if (iMo1766b != -1) {
                    return iMo1766b;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static ImageHeaderParser$ImageType m5770i(List list, InputStream inputStream, nk0 nk0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h01(inputStream, nk0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1770f = ((fc0) list.get(i)).mo1770f(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo1770f != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo1770f;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: j */
    public static ImageHeaderParser$ImageType m5771j(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo1765a = ((fc0) list.get(i)).mo1765a(byteBuffer);
                AtomicReference atomicReference = AbstractC0429ld.f4762a;
                if (imageHeaderParser$ImageTypeMo1765a != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo1765a;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC0429ld.f4762a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: k */
    public static void m5772k(int i, C0770ul c0770ul, C0143dm c0143dm, boolean z) {
        C0585pl c0585pl;
        C0585pl c0585pl2;
        boolean z2;
        C0585pl c0585pl3;
        C0585pl c0585pl4;
        if (c0143dm.f1731m) {
            return;
        }
        if (!(c0143dm instanceof C0179em) && c0143dm.m1269x() && m5763b(c0143dm)) {
            C0179em.m1458R(c0143dm, c0770ul, new C0834wb());
        }
        C0585pl c0585plMo1254g = c0143dm.mo1254g(2);
        C0585pl c0585plMo1254g2 = c0143dm.mo1254g(4);
        int iM3956c = c0585plMo1254g.m3956c();
        int iM3956c2 = c0585plMo1254g2.m3956c();
        HashSet<C0585pl> hashSet = c0585plMo1254g.f6192a;
        if (hashSet != null && c0585plMo1254g.f6194c) {
            for (C0585pl c0585pl5 : hashSet) {
                C0143dm c0143dm2 = c0585pl5.f6195d;
                int i2 = i + 1;
                boolean zM5763b = m5763b(c0143dm2);
                C0585pl c0585pl6 = c0143dm2.f1688H;
                C0585pl c0585pl7 = c0143dm2.f1690J;
                if (c0143dm2.m1269x() && zM5763b) {
                    z2 = true;
                    C0179em.m1458R(c0143dm2, c0770ul, new C0834wb());
                } else {
                    z2 = true;
                }
                boolean z3 = ((c0585pl5 == c0585pl6 && (c0585pl4 = c0585pl7.f6197f) != null && c0585pl4.f6194c) || (c0585pl5 == c0585pl7 && (c0585pl3 = c0585pl6.f6197f) != null && c0585pl3.f6194c)) ? z2 : false;
                int i3 = c0143dm2.f1736o0[0];
                if (i3 != 3 || zM5763b) {
                    if (!c0143dm2.m1269x()) {
                        if (c0585pl5 == c0585pl6 && c0585pl7.f6197f == null) {
                            int iM3957d = c0585pl6.m3957d() + iM3956c;
                            c0143dm2.m1240F(iM3957d, c0143dm2.m1260o() + iM3957d);
                            m5772k(i2, c0770ul, c0143dm2, z);
                        } else if (c0585pl5 == c0585pl7 && c0585pl6.f6197f == null) {
                            int iM3957d2 = iM3956c - c0585pl7.m3957d();
                            c0143dm2.m1240F(iM3957d2 - c0143dm2.m1260o(), iM3957d2);
                            m5772k(i2, c0770ul, c0143dm2, z);
                        } else if (z3 && !c0143dm2.m1267v()) {
                            m5781t(i2, c0770ul, c0143dm2, z);
                        }
                    }
                } else if (i3 == 3 && c0143dm2.f1743v >= 0 && c0143dm2.f1742u >= 0 && (c0143dm2.f1718f0 == 8 || (c0143dm2.f1739r == 0 && c0143dm2.f1702V == 0.0f))) {
                    if (!c0143dm2.m1267v() && z3 && !c0143dm2.m1267v()) {
                        m5782u(i2, c0143dm, c0770ul, c0143dm2, z);
                    }
                }
            }
        }
        if (c0143dm instanceof ea0) {
            return;
        }
        HashSet<C0585pl> hashSet2 = c0585plMo1254g2.f6192a;
        if (hashSet2 != null && c0585plMo1254g2.f6194c) {
            for (C0585pl c0585pl8 : hashSet2) {
                C0143dm c0143dm3 = c0585pl8.f6195d;
                int i4 = i + 1;
                boolean zM5763b2 = m5763b(c0143dm3);
                C0585pl c0585pl9 = c0143dm3.f1688H;
                C0585pl c0585pl10 = c0143dm3.f1690J;
                if (c0143dm3.m1269x() && zM5763b2) {
                    C0179em.m1458R(c0143dm3, c0770ul, new C0834wb());
                }
                boolean z4 = (c0585pl8 == c0585pl9 && (c0585pl2 = c0585pl10.f6197f) != null && c0585pl2.f6194c) || (c0585pl8 == c0585pl10 && (c0585pl = c0585pl9.f6197f) != null && c0585pl.f6194c);
                int i5 = c0143dm3.f1736o0[0];
                if (i5 != 3 || zM5763b2) {
                    if (!c0143dm3.m1269x()) {
                        if (c0585pl8 == c0585pl9 && c0585pl10.f6197f == null) {
                            int iM3957d3 = c0585pl9.m3957d() + iM3956c2;
                            c0143dm3.m1240F(iM3957d3, c0143dm3.m1260o() + iM3957d3);
                            m5772k(i4, c0770ul, c0143dm3, z);
                        } else if (c0585pl8 == c0585pl10 && c0585pl9.f6197f == null) {
                            int iM3957d4 = iM3956c2 - c0585pl10.m3957d();
                            c0143dm3.m1240F(iM3957d4 - c0143dm3.m1260o(), iM3957d4);
                            m5772k(i4, c0770ul, c0143dm3, z);
                        } else if (z4 && !c0143dm3.m1267v()) {
                            m5781t(i4, c0770ul, c0143dm3, z);
                        }
                    }
                } else if (i5 == 3 && c0143dm3.f1743v >= 0 && c0143dm3.f1742u >= 0) {
                    if (c0143dm3.f1718f0 == 8 || (c0143dm3.f1739r == 0 && c0143dm3.f1702V == 0.0f)) {
                        if (!c0143dm3.m1267v() && z4 && !c0143dm3.m1267v()) {
                            m5782u(i4, c0143dm, c0770ul, c0143dm3, z);
                        }
                    }
                }
            }
        }
        c0143dm.f1731m = true;
    }

    /* JADX INFO: renamed from: l */
    public static synchronized boolean m5773l(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f9275j;
        if (context2 != null && (bool = f9276k) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f9276k = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f9276k = boolValueOf;
        f9275j = applicationContext;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public static Drawable m5774m(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0771um c0771um = new C0771um(context);
            c0771um.f7855b = theme;
            c0771um.m4935a(theme.getResources().getConfiguration());
            context = c0771um;
        }
        return j22.m2807p(context, i);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m5775n(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM5361i = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM5361i += (int) wm1.m5361i(byteArrayInputStream, 2);
            iArr[i2] = iM5361i;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static C0777us[] m5776o(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0777us[] c0777usArr) throws IOException {
        byte[] bArr3 = af0.f171h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, af0.f172i)) {
                C0270h1.m2191g("Unsupported meta version");
                return null;
            }
            int iM5361i = (int) wm1.m5361i(fileInputStream, 2);
            byte[] bArrM5360h = wm1.m5360h(fileInputStream, (int) wm1.m5361i(fileInputStream, 4), (int) wm1.m5361i(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C0270h1.m2191g("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5360h);
            try {
                C0777us[] c0777usArrM5778q = m5778q(byteArrayInputStream, bArr2, iM5361i, c0777usArr);
                byteArrayInputStream.close();
                return c0777usArrM5778q;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(af0.f166c, bArr2)) {
            C0270h1.m2191g("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C0270h1.m2191g("Unsupported meta version");
            return null;
        }
        int iM5361i2 = (int) wm1.m5361i(fileInputStream, 1);
        byte[] bArrM5360h2 = wm1.m5360h(fileInputStream, (int) wm1.m5361i(fileInputStream, 4), (int) wm1.m5361i(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0270h1.m2191g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM5360h2);
        try {
            C0777us[] c0777usArrM5777p = m5777p(byteArrayInputStream2, iM5361i2, c0777usArr);
            byteArrayInputStream2.close();
            return c0777usArrM5777p;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0777us[] m5777p(ByteArrayInputStream byteArrayInputStream, int i, C0777us[] c0777usArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0777us[0];
        }
        if (i != c0777usArr.length) {
            C0270h1.m2191g("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM5361i = (int) wm1.m5361i(byteArrayInputStream, 2);
            iArr[i2] = (int) wm1.m5361i(byteArrayInputStream, 2);
            strArr[i2] = new String(wm1.m5359g(byteArrayInputStream, iM5361i), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0777us c0777us = c0777usArr[i3];
            if (!c0777us.f7893b.equals(strArr[i3])) {
                C0270h1.m2191g("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c0777us.f7896e = i4;
            c0777us.f7899h = m5775n(byteArrayInputStream, i4);
        }
        return c0777usArr;
    }

    /* JADX INFO: renamed from: q */
    public static C0777us[] m5778q(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0777us[] c0777usArr) throws IOException {
        C0777us c0777us;
        if (byteArrayInputStream.available() == 0) {
            return new C0777us[0];
        }
        if (i != c0777usArr.length) {
            C0270h1.m2191g("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            wm1.m5361i(byteArrayInputStream, 2);
            String str = new String(wm1.m5359g(byteArrayInputStream, (int) wm1.m5361i(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM5361i = wm1.m5361i(byteArrayInputStream, 4);
            int iM5361i = (int) wm1.m5361i(byteArrayInputStream, 2);
            if (c0777usArr.length <= 0) {
                c0777us = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= c0777usArr.length) {
                    c0777us = null;
                    break;
                }
                if (c0777usArr[i3].f7893b.equals(strSubstring)) {
                    c0777us = c0777usArr[i3];
                    break;
                }
                i3++;
            }
            if (c0777us == null) {
                C0270h1.m2191g("Missing profile key: ".concat(str));
                return null;
            }
            c0777us.f7895d = jM5361i;
            int[] iArrM5775n = m5775n(byteArrayInputStream, iM5361i);
            if (Arrays.equals(bArr, af0.f170g)) {
                c0777us.f7896e = iM5361i;
                c0777us.f7899h = iArrM5775n;
            }
        }
        return c0777usArr;
    }

    /* JADX INFO: renamed from: r */
    public static C0777us[] m5779r(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, af0.f167d)) {
            C0270h1.m2191g("Unsupported version");
            return null;
        }
        int iM5361i = (int) wm1.m5361i(fileInputStream, 1);
        byte[] bArrM5360h = wm1.m5360h(fileInputStream, (int) wm1.m5361i(fileInputStream, 4), (int) wm1.m5361i(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C0270h1.m2191g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM5360h);
        try {
            C0777us[] c0777usArrM5780s = m5780s(byteArrayInputStream, str, iM5361i);
            byteArrayInputStream.close();
            return c0777usArrM5780s;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public static C0777us[] m5780s(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0777us[0];
        }
        C0777us[] c0777usArr = new C0777us[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM5361i = (int) wm1.m5361i(byteArrayInputStream, 2);
            int iM5361i2 = (int) wm1.m5361i(byteArrayInputStream, 2);
            c0777usArr[i3] = new C0777us(str, new String(wm1.m5359g(byteArrayInputStream, iM5361i), StandardCharsets.UTF_8), wm1.m5361i(byteArrayInputStream, 4), iM5361i2, (int) wm1.m5361i(byteArrayInputStream, 4), (int) wm1.m5361i(byteArrayInputStream, 4), new int[iM5361i2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C0777us c0777us = c0777usArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c0777us.f7897f;
            int i6 = c0777us.f7898g;
            TreeMap treeMap = c0777us.f7900i;
            int i7 = iAvailable - i5;
            int iM5361i3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM5361i3 += (int) wm1.m5361i(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM5361i3), 1);
                int iM5361i4 = (int) wm1.m5361i(byteArrayInputStream, 2);
                while (iM5361i4 > 0) {
                    wm1.m5361i(byteArrayInputStream, 2);
                    int iM5361i5 = (int) wm1.m5361i(byteArrayInputStream, 1);
                    if (iM5361i5 != 6 && iM5361i5 != 7) {
                        while (iM5361i5 > 0) {
                            wm1.m5361i(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM5361i6 = (int) wm1.m5361i(byteArrayInputStream, 1); iM5361i6 > 0; iM5361i6--) {
                                wm1.m5361i(byteArrayInputStream, 2);
                            }
                            iM5361i5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM5361i4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C0270h1.m2191g("Read too much data during profile line parse");
                return null;
            }
            c0777us.f7899h = m5775n(byteArrayInputStream, c0777us.f7896e);
            BitSet bitSetValueOf = BitSet.valueOf(wm1.m5359g(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c0777usArr;
    }

    /* JADX INFO: renamed from: t */
    public static void m5781t(int i, C0770ul c0770ul, C0143dm c0143dm, boolean z) {
        float f = c0143dm.f1712c0;
        C0585pl c0585pl = c0143dm.f1688H;
        int iM3956c = c0585pl.f6197f.m3956c();
        C0585pl c0585pl2 = c0143dm.f1690J;
        int iM3956c2 = c0585pl2.f6197f.m3956c();
        int iM3957d = c0585pl.m3957d() + iM3956c;
        int iM3957d2 = iM3956c2 - c0585pl2.m3957d();
        if (iM3956c == iM3956c2) {
            f = 0.5f;
        } else {
            iM3956c = iM3957d;
            iM3956c2 = iM3957d2;
        }
        int iM1260o = c0143dm.m1260o();
        int i2 = (iM3956c2 - iM3956c) - iM1260o;
        if (iM3956c > iM3956c2) {
            i2 = (iM3956c - iM3956c2) - iM1260o;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM3956c;
        int i4 = i3 + iM1260o;
        if (iM3956c > iM3956c2) {
            i4 = i3 - iM1260o;
        }
        c0143dm.m1240F(i3, i4);
        m5772k(i + 1, c0770ul, c0143dm, z);
    }

    /* JADX INFO: renamed from: u */
    public static void m5782u(int i, C0143dm c0143dm, C0770ul c0770ul, C0143dm c0143dm2, boolean z) {
        float f = c0143dm2.f1712c0;
        C0585pl c0585pl = c0143dm2.f1688H;
        int iM3957d = c0585pl.m3957d() + c0585pl.f6197f.m3956c();
        C0585pl c0585pl2 = c0143dm2.f1690J;
        int iM3956c = c0585pl2.f6197f.m3956c() - c0585pl2.m3957d();
        if (iM3956c >= iM3957d) {
            int iM1260o = c0143dm2.m1260o();
            if (c0143dm2.f1718f0 != 8) {
                int i2 = c0143dm2.f1739r;
                if (i2 == 2) {
                    iM1260o = (int) (c0143dm2.f1712c0 * 0.5f * (c0143dm instanceof C0179em ? c0143dm.m1260o() : c0143dm.f1699S.m1260o()));
                } else if (i2 == 0) {
                    iM1260o = iM3956c - iM3957d;
                }
                iM1260o = Math.max(c0143dm2.f1742u, iM1260o);
                int i3 = c0143dm2.f1743v;
                if (i3 > 0) {
                    iM1260o = Math.min(i3, iM1260o);
                }
            }
            int i4 = iM3957d + ((int) ((f * ((iM3956c - iM3957d) - iM1260o)) + 0.5f));
            c0143dm2.m1240F(i4, iM1260o + i4);
            m5772k(i + 1, c0770ul, c0143dm2, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5783v(int i, C0770ul c0770ul, C0143dm c0143dm) {
        float f = c0143dm.f1714d0;
        C0585pl c0585pl = c0143dm.f1689I;
        int iM3956c = c0585pl.f6197f.m3956c();
        C0585pl c0585pl2 = c0143dm.f1691K;
        int iM3956c2 = c0585pl2.f6197f.m3956c();
        int iM3957d = c0585pl.m3957d() + iM3956c;
        int iM3957d2 = iM3956c2 - c0585pl2.m3957d();
        if (iM3956c == iM3956c2) {
            f = 0.5f;
        } else {
            iM3956c = iM3957d;
            iM3956c2 = iM3957d2;
        }
        int iM1256i = c0143dm.m1256i();
        int i2 = (iM3956c2 - iM3956c) - iM1256i;
        if (iM3956c > iM3956c2) {
            i2 = (iM3956c - iM3956c2) - iM1256i;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM3956c + i3;
        int i5 = i4 + iM1256i;
        if (iM3956c > iM3956c2) {
            i4 = iM3956c - i3;
            i5 = i4 - iM1256i;
        }
        c0143dm.m1241G(i4, i5);
        m5786y(i + 1, c0770ul, c0143dm);
    }

    /* JADX INFO: renamed from: w */
    public static void m5784w(int i, C0143dm c0143dm, C0770ul c0770ul, C0143dm c0143dm2) {
        float f = c0143dm2.f1714d0;
        C0585pl c0585pl = c0143dm2.f1689I;
        int iM3957d = c0585pl.m3957d() + c0585pl.f6197f.m3956c();
        C0585pl c0585pl2 = c0143dm2.f1691K;
        int iM3956c = c0585pl2.f6197f.m3956c() - c0585pl2.m3957d();
        if (iM3956c >= iM3957d) {
            int iM1256i = c0143dm2.m1256i();
            if (c0143dm2.f1718f0 != 8) {
                int i2 = c0143dm2.f1740s;
                if (i2 == 2) {
                    iM1256i = (int) (f * 0.5f * (c0143dm instanceof C0179em ? c0143dm.m1256i() : c0143dm.f1699S.m1256i()));
                } else if (i2 == 0) {
                    iM1256i = iM3956c - iM3957d;
                }
                iM1256i = Math.max(c0143dm2.f1745x, iM1256i);
                int i3 = c0143dm2.f1746y;
                if (i3 > 0) {
                    iM1256i = Math.min(i3, iM1256i);
                }
            }
            int i4 = iM3957d + ((int) ((f * ((iM3956c - iM3957d) - iM1256i)) + 0.5f));
            c0143dm2.m1241G(i4, iM1256i + i4);
            m5786y(i + 1, c0770ul, c0143dm2);
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m5785x(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0777us[] c0777usArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = af0.f170g;
        byte[] bArr3 = af0.f169f;
        byte[] bArr4 = af0.f166c;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = af0.f167d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM5766e = m5766e(c0777usArr, bArr5);
                wm1.m5363l(byteArrayOutputStream, c0777usArr.length, 1);
                wm1.m5363l(byteArrayOutputStream, bArrM5766e.length, 4);
                byte[] bArrM5356c = wm1.m5356c(bArrM5766e);
                wm1.m5363l(byteArrayOutputStream, bArrM5356c.length, 4);
                byteArrayOutputStream.write(bArrM5356c);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                wm1.m5363l(byteArrayOutputStream, c0777usArr.length, 1);
                for (C0777us c0777us : c0777usArr) {
                    int size = c0777us.f7900i.size() * 4;
                    String strM5767f = m5767f(c0777us.f7892a, c0777us.f7893b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    wm1.m5364m(byteArrayOutputStream, strM5767f.getBytes(charset).length);
                    wm1.m5364m(byteArrayOutputStream, c0777us.f7899h.length);
                    wm1.m5363l(byteArrayOutputStream, size, 4);
                    wm1.m5363l(byteArrayOutputStream, c0777us.f7894c, 4);
                    byteArrayOutputStream.write(strM5767f.getBytes(charset));
                    Iterator it = c0777us.f7900i.keySet().iterator();
                    while (it.hasNext()) {
                        wm1.m5364m(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        wm1.m5364m(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0777us.f7899h) {
                        wm1.m5364m(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = af0.f168e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM5766e2 = m5766e(c0777usArr, bArr6);
                wm1.m5363l(byteArrayOutputStream, c0777usArr.length, 1);
                wm1.m5363l(byteArrayOutputStream, bArrM5766e2.length, 4);
                byte[] bArrM5356c2 = wm1.m5356c(bArrM5766e2);
                wm1.m5363l(byteArrayOutputStream, bArrM5356c2.length, 4);
                byteArrayOutputStream.write(bArrM5356c2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            wm1.m5364m(byteArrayOutputStream, c0777usArr.length);
            for (C0777us c0777us2 : c0777usArr) {
                String str = c0777us2.f7892a;
                TreeMap treeMap = c0777us2.f7900i;
                String strM5767f2 = m5767f(str, c0777us2.f7893b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                wm1.m5364m(byteArrayOutputStream, strM5767f2.getBytes(charset2).length);
                wm1.m5364m(byteArrayOutputStream, treeMap.size());
                wm1.m5364m(byteArrayOutputStream, c0777us2.f7899h.length);
                wm1.m5363l(byteArrayOutputStream, c0777us2.f7894c, 4);
                byteArrayOutputStream.write(strM5767f2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    wm1.m5364m(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0777us2.f7899h) {
                    wm1.m5364m(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            wm1.m5364m(byteArrayOutputStream2, c0777usArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0777us c0777us3 : c0777usArr) {
                wm1.m5363l(byteArrayOutputStream2, c0777us3.f7894c, 4);
                wm1.m5363l(byteArrayOutputStream2, c0777us3.f7895d, 4);
                wm1.m5363l(byteArrayOutputStream2, c0777us3.f7898g, 4);
                String strM5767f3 = m5767f(c0777us3.f7892a, c0777us3.f7893b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM5767f3.getBytes(charset3).length;
                wm1.m5364m(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM5767f3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            uk1 uk1Var = new uk1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(uk1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0777usArr.length) {
                try {
                    C0777us c0777us4 = c0777usArr[i7];
                    wm1.m5364m(byteArrayOutputStream3, i7);
                    wm1.m5364m(byteArrayOutputStream3, c0777us4.f7896e);
                    i8 = i8 + 4 + (c0777us4.f7896e * i5);
                    int[] iArr = c0777us4.f7899h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        wm1.m5364m(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            uk1 uk1Var2 = new uk1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(uk1Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < c0777usArr.length; i13++) {
                try {
                    C0777us c0777us5 = c0777usArr[i13];
                    Iterator it3 = c0777us5.f7900i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m5757B(byteArrayOutputStream5, iIntValue, c0777us5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m5758C(byteArrayOutputStream6, c0777us5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            wm1.m5364m(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            wm1.m5363l(byteArrayOutputStream4, length4, 4);
                            wm1.m5364m(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i14 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            uk1 uk1Var3 = new uk1(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(uk1Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            wm1.m5363l(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                uk1 uk1Var4 = (uk1) arrayList.get(i15);
                int i16 = uk1Var4.f7839a;
                byte[] bArr7 = uk1Var4.f7840b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                wm1.m5363l(byteArrayOutputStream, j, 4);
                wm1.m5363l(byteArrayOutputStream, size2, 4);
                if (uk1Var4.f7841c) {
                    long length5 = bArr7.length;
                    byte[] bArrM5356c3 = wm1.m5356c(bArr7);
                    arrayList2.add(bArrM5356c3);
                    wm1.m5363l(byteArrayOutputStream, bArrM5356c3.length, 4);
                    wm1.m5363l(byteArrayOutputStream, length5, 4);
                    length = bArrM5356c3.length;
                } else {
                    arrayList2.add(bArr7);
                    wm1.m5363l(byteArrayOutputStream, bArr7.length, 4);
                    wm1.m5363l(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5786y(int i, C0770ul c0770ul, C0143dm c0143dm) {
        boolean z;
        C0585pl c0585pl;
        C0585pl c0585pl2;
        C0585pl c0585pl3;
        C0585pl c0585pl4;
        if (c0143dm.f1733n) {
            return;
        }
        if (!(c0143dm instanceof C0179em) && c0143dm.m1269x() && m5763b(c0143dm)) {
            C0179em.m1458R(c0143dm, c0770ul, new C0834wb());
        }
        C0585pl c0585plMo1254g = c0143dm.mo1254g(3);
        C0585pl c0585plMo1254g2 = c0143dm.mo1254g(5);
        int iM3956c = c0585plMo1254g.m3956c();
        int iM3956c2 = c0585plMo1254g2.m3956c();
        HashSet<C0585pl> hashSet = c0585plMo1254g.f6192a;
        if (hashSet != null && c0585plMo1254g.f6194c) {
            for (C0585pl c0585pl5 : hashSet) {
                C0143dm c0143dm2 = c0585pl5.f6195d;
                int i2 = i + 1;
                boolean zM5763b = m5763b(c0143dm2);
                C0585pl c0585pl6 = c0143dm2.f1689I;
                C0585pl c0585pl7 = c0143dm2.f1691K;
                if (c0143dm2.m1269x() && zM5763b) {
                    C0179em.m1458R(c0143dm2, c0770ul, new C0834wb());
                }
                boolean z2 = (c0585pl5 == c0585pl6 && (c0585pl4 = c0585pl7.f6197f) != null && c0585pl4.f6194c) || (c0585pl5 == c0585pl7 && (c0585pl3 = c0585pl6.f6197f) != null && c0585pl3.f6194c);
                int i3 = c0143dm2.f1736o0[1];
                if (i3 != 3 || zM5763b) {
                    if (!c0143dm2.m1269x()) {
                        if (c0585pl5 == c0585pl6 && c0585pl7.f6197f == null) {
                            int iM3957d = c0585pl6.m3957d() + iM3956c;
                            c0143dm2.m1241G(iM3957d, c0143dm2.m1256i() + iM3957d);
                            m5786y(i2, c0770ul, c0143dm2);
                        } else if (c0585pl5 == c0585pl7 && c0585pl6.f6197f == null) {
                            int iM3957d2 = iM3956c - c0585pl7.m3957d();
                            c0143dm2.m1241G(iM3957d2 - c0143dm2.m1256i(), iM3957d2);
                            m5786y(i2, c0770ul, c0143dm2);
                        } else if (z2 && !c0143dm2.m1268w()) {
                            m5783v(i2, c0770ul, c0143dm2);
                        }
                    }
                } else if (i3 == 3 && c0143dm2.f1746y >= 0 && c0143dm2.f1745x >= 0 && (c0143dm2.f1718f0 == 8 || (c0143dm2.f1740s == 0 && c0143dm2.f1702V == 0.0f))) {
                    if (!c0143dm2.m1268w() && z2 && !c0143dm2.m1268w()) {
                        m5784w(i2, c0143dm, c0770ul, c0143dm2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (c0143dm instanceof ea0) {
            return;
        }
        HashSet<C0585pl> hashSet2 = c0585plMo1254g2.f6192a;
        if (hashSet2 != null && c0585plMo1254g2.f6194c) {
            for (C0585pl c0585pl8 : hashSet2) {
                C0143dm c0143dm3 = c0585pl8.f6195d;
                int i4 = i + 1;
                boolean zM5763b2 = m5763b(c0143dm3);
                C0585pl c0585pl9 = c0143dm3.f1689I;
                C0585pl c0585pl10 = c0143dm3.f1691K;
                if (c0143dm3.m1269x() && zM5763b2) {
                    C0179em.m1458R(c0143dm3, c0770ul, new C0834wb());
                }
                boolean z4 = (c0585pl8 == c0585pl9 && (c0585pl2 = c0585pl10.f6197f) != null && c0585pl2.f6194c) || (c0585pl8 == c0585pl10 && (c0585pl = c0585pl9.f6197f) != null && c0585pl.f6194c);
                int i5 = c0143dm3.f1736o0[1];
                if (i5 != 3 || zM5763b2) {
                    if (!c0143dm3.m1269x()) {
                        if (c0585pl8 == c0585pl9 && c0585pl10.f6197f == null) {
                            int iM3957d3 = c0585pl9.m3957d() + iM3956c2;
                            c0143dm3.m1241G(iM3957d3, c0143dm3.m1256i() + iM3957d3);
                            m5786y(i4, c0770ul, c0143dm3);
                        } else if (c0585pl8 == c0585pl10 && c0585pl9.f6197f == null) {
                            int iM3957d4 = iM3956c2 - c0585pl10.m3957d();
                            c0143dm3.m1241G(iM3957d4 - c0143dm3.m1256i(), iM3957d4);
                            m5786y(i4, c0770ul, c0143dm3);
                        } else if (z4 && !c0143dm3.m1268w()) {
                            m5783v(i4, c0770ul, c0143dm3);
                        }
                    }
                } else if (i5 == 3 && c0143dm3.f1746y >= 0 && c0143dm3.f1745x >= 0 && (c0143dm3.f1718f0 == 8 || (c0143dm3.f1740s == 0 && c0143dm3.f1702V == 0.0f))) {
                    if (!c0143dm3.m1268w() && z4 && !c0143dm3.m1268w()) {
                        m5784w(i4, c0143dm, c0770ul, c0143dm3);
                    }
                }
            }
        }
        C0585pl c0585plMo1254g3 = c0143dm.mo1254g(6);
        if (c0585plMo1254g3.f6192a != null && c0585plMo1254g3.f6194c) {
            int iM3956c3 = c0585plMo1254g3.m3956c();
            for (C0585pl c0585pl11 : c0585plMo1254g3.f6192a) {
                C0143dm c0143dm4 = c0585pl11.f6195d;
                int i6 = i + 1;
                boolean zM5763b3 = m5763b(c0143dm4);
                C0585pl c0585pl12 = c0143dm4.f1692L;
                if (c0143dm4.m1269x() && zM5763b3) {
                    C0179em.m1458R(c0143dm4, c0770ul, new C0834wb());
                }
                if (c0143dm4.f1736o0[z3 ? 1 : 0] != 3 || zM5763b3) {
                    if (!c0143dm4.m1269x()) {
                        if (c0585pl11 == c0585pl12) {
                            int iM3957d5 = c0585pl11.m3957d() + iM3956c3;
                            if (c0143dm4.f1685E) {
                                int i7 = iM3957d5 - c0143dm4.f1706Z;
                                int i8 = c0143dm4.f1701U + i7;
                                c0143dm4.f1705Y = i7;
                                c0143dm4.f1689I.m3962i(i7);
                                c0143dm4.f1691K.m3962i(i8);
                                c0585pl12.m3962i(iM3957d5);
                                z = z3 ? 1 : 0;
                                c0143dm4.f1729l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            m5786y(i6, c0770ul, c0143dm4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        c0143dm.f1733n = z3;
    }

    /* JADX INFO: renamed from: z */
    public static void m5787z(ByteArrayOutputStream byteArrayOutputStream, C0777us c0777us) throws IOException {
        m5758C(byteArrayOutputStream, c0777us);
        int i = c0777us.f7898g;
        int[] iArr = c0777us.f7899h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            wm1.m5364m(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0777us.f7900i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }
}

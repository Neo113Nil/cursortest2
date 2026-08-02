package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd0 {

    /* JADX INFO: renamed from: a */
    public static volatile wp0 f4349a;

    /* JADX INFO: renamed from: b */
    public static final int[] f4350b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f4351c = new Object[0];

    /* JADX INFO: renamed from: d */
    public static final aa0 f4352d = new aa0(9);

    /* JADX INFO: renamed from: a */
    public static final int m3008a(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: b */
    public static final int m3009b(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: f */
    public static void m3010f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m3011i(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m3012j(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m3017q(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m3017q(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m3017q(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m3017q(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m3013m(C0136df c0136df, InterfaceC0808vm interfaceC0808vm, boolean z) {
        Object objM1196v = c0136df.m1196v();
        Throwable thMo1184g = c0136df.mo1184g(objM1196v);
        Object o21Var = thMo1184g != null ? new o21(thMo1184g) : c0136df.mo1185i(objM1196v);
        if (!z) {
            interfaceC0808vm.mo476f(o21Var);
            return;
        }
        interfaceC0808vm.getClass();
        C0704st c0704st = (C0704st) interfaceC0808vm;
        AbstractC0882xm abstractC0882xm = c0704st.f7207n;
        Object obj = c0704st.f7209p;
        InterfaceC0180en interfaceC0180enMo475d = abstractC0882xm.mo475d();
        Object objM5199n = vt1.m5199n(interfaceC0180enMo475d, obj);
        gf1 gf1VarM5654p = objM5199n != vt1.f8268d ? AbstractC0875xf.m5654p(abstractC0882xm, interfaceC0180enMo475d, objM5199n) : null;
        try {
            abstractC0882xm.mo476f(o21Var);
        } finally {
            if (gf1VarM5654p == null || gf1VarM5654p.m2033d0()) {
                vt1.m5197j(interfaceC0180enMo475d, objM5199n);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m3014n(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c A[PHI: r15
      0x006c: PHI (r15v3 long) = (r15v2 long), (r15v4 long) binds: [B:30:0x005f, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a A[LOOP:0: B:25:0x004c->B:39:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0078 A[SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final long m3015o(String str, long j, long j2, long j3) {
        String property;
        Long lValueOf;
        boolean z;
        long j4;
        int i;
        int i2;
        long j5;
        int i3 = lc1.f4761a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        int length = property.length();
        if (length != 0) {
            int i4 = 0;
            char cCharAt = property.charAt(0);
            long j6 = -9223372036854775807L;
            if (cCharAt < '0') {
                z = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        z = false;
                        i4 = 1;
                    } else if (cCharAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
                lValueOf = null;
                break;
            }
            z = false;
            long j7 = 0;
            long j8 = -256204778801521550L;
            while (true) {
                if (i4 >= length) {
                    if (!z) {
                        lValueOf = Long.valueOf(-j7);
                        break;
                    }
                    lValueOf = Long.valueOf(j7);
                    break;
                }
                int iDigit = Character.digit((int) property.charAt(i4), 10);
                if (iDigit >= 0) {
                    if (j7 >= j8) {
                        j4 = j7 * 10;
                        i = length;
                        i2 = i4;
                        j5 = iDigit;
                        if (j4 < j6 + j5) {
                            j7 = j4 - j5;
                            i4 = i2 + 1;
                            length = i;
                        }
                    } else if (j8 == -256204778801521550L) {
                        j8 = j6 / 10;
                        if (j7 >= j8) {
                            j4 = j7 * 10;
                            i = length;
                            i2 = i4;
                            j5 = iDigit;
                            if (j4 < j6 + j5) {
                                j7 = j4 - j5;
                                i4 = i2 + 1;
                                length = i;
                            }
                        }
                    }
                }
                lValueOf = null;
                break;
            }
        }
        lValueOf = null;
        break;
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: p */
    public static int m3016p(int i, int i2, String str) {
        return (int) m3015o(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: q */
    public static void m3017q(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX INFO: renamed from: r */
    public static final Object m3018r(InterfaceC0180en interfaceC0180en, Object obj, Object obj2, v60 v60Var, InterfaceC0808vm interfaceC0808vm) {
        Object objMo1490g;
        Object objM5199n = vt1.m5199n(interfaceC0180en, obj2);
        try {
            u91 u91Var = new u91(interfaceC0808vm, interfaceC0180en);
            if (v60Var == null) {
                objMo1490g = d71.m1117r(v60Var, obj, u91Var);
            } else {
                xe1.m5634a(2, v60Var);
                objMo1490g = v60Var.mo1490g(obj, u91Var);
            }
            vt1.m5197j(interfaceC0180en, objM5199n);
            if (objMo1490g == EnumC0513nn.f5459j) {
                interfaceC0808vm.getClass();
            }
            return objMo1490g;
        } catch (Throwable th) {
            vt1.m5197j(interfaceC0180en, objM5199n);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182 A[Catch: all -> 0x017f, TRY_ENTER, TryCatch #16 {all -> 0x017f, blocks: (B:88:0x015e, B:90:0x016a, B:101:0x0182, B:102:0x0187), top: B:266:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0193 A[Catch: IllegalStateException -> 0x0179, IOException -> 0x017b, FileNotFoundException -> 0x017d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x017d, IOException -> 0x017b, IllegalStateException -> 0x0179, blocks: (B:86:0x0156, B:91:0x0174, B:109:0x0193, B:107:0x0190, B:106:0x018d), top: B:293:0x0156 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc A[Catch: all -> 0x01da, TRY_LEAVE, TryCatch #33 {all -> 0x01da, blocks: (B:124:0x01c0, B:126:0x01cc, B:135:0x01dd), top: B:282:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd A[Catch: all -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x01da, blocks: (B:124:0x01c0, B:126:0x01cc, B:135:0x01dd), top: B:282:0x01c0 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x0226 A[Catch: all -> 0x0264, TryCatch #1 {all -> 0x0264, blocks: (B:158:0x0220, B:160:0x0226, B:161:0x022a, B:163:0x0230), top: B:248:0x0220 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0230 A[Catch: all -> 0x0264, TRY_LEAVE, TryCatch #1 {all -> 0x0264, blocks: (B:158:0x0220, B:160:0x0226, B:161:0x022a, B:163:0x0230), top: B:248:0x0220 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:233:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:240:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:248:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0235 A[EDGE_INSN: B:294:0x0235->B:165:0x0235 BREAK  A[LOOP:0: B:161:0x022a->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:262:0x0105, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0129 A[Catch: all -> 0x0122, IllegalStateException -> 0x0125, IOException -> 0x0127, TRY_ENTER, TryCatch #12 {IllegalStateException -> 0x0125, blocks: (B:53:0x0105, B:55:0x010f, B:66:0x0129, B:67:0x012e), top: B:262:0x0105, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x016a A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #16 {all -> 0x017f, blocks: (B:88:0x015e, B:90:0x016a, B:101:0x0182, B:102:0x0187), top: B:266:0x015e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX INFO: renamed from: s */
    public static void m3019s(Context context, Executor executor, lx0 lx0Var, boolean z) {
        boolean z2;
        ?? M4842a;
        C0777us[] c0777usArrM5779r;
        C0777us[] c0777usArr;
        lx0 lx0Var2;
        C0777us[] c0777usArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        ?? r9;
        boolean z4;
        boolean z5;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        C0740ts c0740ts;
        ?? r11;
        String str;
        FileInputStream fileInputStreamM4842a;
        ?? r12;
        ?? r13;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                lx0Var.mo162k(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ox0.m3805c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = yd0.f9278m;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0740ts c0740ts2 = new C0740ts(assets, executor, lx0Var, name, file2);
            byte[] bArr5 = c0740ts2.f7581c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c0740ts2.f7584f = true;
                            M4842a = c0740ts2.m4842a(assets, "dexopt/baseline.prof");
                            if (M4842a != 0) {
                                if (Arrays.equals(bArr4, wm1.m5359g(M4842a, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c0777usArrM5779r = yd0.m5779r(M4842a, wm1.m5359g(M4842a, 4), c0740ts2.f7583e);
                                M4842a.close();
                                c0740ts2.f7585g = c0777usArrM5779r;
                            }
                            c0777usArr = c0740ts2.f7585g;
                            if (c0777usArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM4842a = c0740ts2.m4842a(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamM4842a == null) {
                                    if (fileInputStreamM4842a != null) {
                                        fileInputStreamM4842a.close();
                                        r11 = str;
                                    }
                                    c0740ts = null;
                                    M4842a = r11;
                                } else {
                                    if (Arrays.equals(yd0.f9279n, wm1.m5359g(fileInputStreamM4842a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrM5359g = wm1.m5359g(fileInputStreamM4842a, 4);
                                    c0740ts2.f7585g = yd0.m5776o(fileInputStreamM4842a, bArrM5359g, bArr5, c0777usArr);
                                    fileInputStreamM4842a.close();
                                    c0740ts = c0740ts2;
                                    M4842a = bArrM5359g;
                                }
                                if (c0740ts != null) {
                                    c0740ts2 = c0740ts;
                                }
                            }
                            lx0Var2 = c0740ts2.f7580b;
                            c0777usArr2 = c0740ts2.f7585g;
                            bArr = c0740ts2.f7581c;
                            r7 = M4842a;
                            r7 = M4842a;
                            if (c0777usArr2 != null) {
                                z5 = c0740ts2.f7584f;
                                if (z5) {
                                    C0270h1.m2191g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (yd0.m5785x(byteArrayOutputStream, bArr, c0777usArr2)) {
                                    c0740ts2.f7586h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    c0740ts2.f7585g = null;
                                    r7 = r10;
                                } else {
                                    lx0Var2.mo162k(5, null);
                                    c0740ts2.f7585g = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = c0740ts2.f7586h;
                            if (bArr2 != null) {
                                if (c0740ts2.f7584f) {
                                    C0270h1.m2191g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(c0740ts2.f7582d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i);
                                        }
                                        r9 = 1;
                                        c0740ts2.m4843b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        c0740ts2.f7586h = null;
                                        c0740ts2.f7585g = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                m3011i(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            c0740ts2.m4843b(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        c0740ts2.m4843b(4, null);
                    }
                } else if (file2.canWrite()) {
                    c0740ts2.f7584f = true;
                    try {
                        M4842a = c0740ts2.m4842a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        lx0Var.mo162k(6, e);
                        M4842a = 0;
                    } catch (IOException e2) {
                        lx0Var.mo162k(7, e2);
                        M4842a = 0;
                    }
                    try {
                        if (M4842a != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, wm1.m5359g(M4842a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0777usArrM5779r = yd0.m5779r(M4842a, wm1.m5359g(M4842a, 4), c0740ts2.f7583e);
                                    try {
                                        M4842a.close();
                                    } catch (IOException e3) {
                                        lx0Var.mo162k(7, e3);
                                    }
                                    c0740ts2.f7585g = c0777usArrM5779r;
                                } catch (IllegalStateException e4) {
                                    lx0Var.mo162k(8, e4);
                                    try {
                                        M4842a.close();
                                    } catch (IOException e5) {
                                        lx0Var.mo162k(7, e5);
                                    }
                                    c0777usArrM5779r = null;
                                }
                            } catch (IOException e6) {
                                lx0Var.mo162k(7, e6);
                                M4842a.close();
                                c0777usArrM5779r = null;
                            }
                        }
                        c0777usArr = c0740ts2.f7585g;
                        if (c0777usArr != null && (M4842a = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamM4842a = c0740ts2.m4842a(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamM4842a == null) {
                                    try {
                                        if (Arrays.equals(yd0.f9279n, wm1.m5359g(fileInputStreamM4842a, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrM5359g2 = wm1.m5359g(fileInputStreamM4842a, 4);
                                        c0740ts2.f7585g = yd0.m5776o(fileInputStreamM4842a, bArrM5359g2, bArr5, c0777usArr);
                                        fileInputStreamM4842a.close();
                                        c0740ts = c0740ts2;
                                        M4842a = bArrM5359g2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamM4842a.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM4842a != null) {
                                        fileInputStreamM4842a.close();
                                        r11 = str;
                                    }
                                    c0740ts = null;
                                    M4842a = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                lx0Var.mo162k(9, e7);
                                r11 = M4842a;
                            } catch (IOException e8) {
                                lx0Var.mo162k(7, e8);
                                r11 = M4842a;
                            } catch (IllegalStateException e9) {
                                c0740ts2.f7585g = null;
                                lx0Var.mo162k(8, e9);
                                r11 = M4842a;
                            }
                            if (c0740ts != null) {
                                c0740ts2 = c0740ts;
                            }
                        }
                        lx0Var2 = c0740ts2.f7580b;
                        c0777usArr2 = c0740ts2.f7585g;
                        bArr = c0740ts2.f7581c;
                        r7 = M4842a;
                        r7 = M4842a;
                        if (c0777usArr2 != null && bArr != null) {
                            z5 = c0740ts2.f7584f;
                            if (z5) {
                                C0270h1.m2191g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (yd0.m5785x(byteArrayOutputStream, bArr, c0777usArr2)) {
                                        lx0Var2.mo162k(5, null);
                                        c0740ts2.f7585g = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        c0740ts2.f7586h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        c0740ts2.f7585g = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                lx0Var2.mo162k(7, e10);
                                r10 = z5;
                            } catch (IllegalStateException e11) {
                                lx0Var2.mo162k(8, e11);
                                r10 = z5;
                            }
                        }
                        bArr2 = c0740ts2.f7586h;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (c0740ts2.f7584f) {
                                    C0270h1.m2191g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(c0740ts2.f7582d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr3);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                c0740ts2.m4843b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c0740ts2.f7586h = null;
                                                                                c0740ts2.f7585g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        r7 = 1;
                                        c0740ts2.m4843b(6, e);
                                        r8 = r7;
                                        c0740ts2.f7586h = null;
                                        c0740ts2.f7585g = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        r7 = 1;
                                        c0740ts2.m4843b(7, e);
                                        r8 = r7;
                                        c0740ts2.f7586h = null;
                                        c0740ts2.f7585g = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    c0740ts2.m4843b(6, e);
                                    r8 = r7;
                                    c0740ts2.f7586h = null;
                                    c0740ts2.f7585g = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    c0740ts2.m4843b(7, e);
                                    r8 = r7;
                                    c0740ts2.f7586h = null;
                                    c0740ts2.f7585g = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                c0740ts2.f7586h = null;
                                c0740ts2.f7585g = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            m3011i(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            M4842a.close();
                            throw th24;
                        } catch (IOException e16) {
                            lx0Var.mo162k(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    c0740ts2.m4843b(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                ox0.m3805c(context, r13);
            }
            c0740ts2.m4843b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            ox0.m3805c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            lx0Var.mo162k(7, e17);
            ox0.m3805c(context, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m3020t(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public static void m3021u(ha2 ha2Var) {
        if (m3023w(ha2Var) || ((n92) ha2Var).f5338j == null) {
            Trace.beginSection(((n92) ha2Var).f5340l);
            m3024x(ha2Var);
        } else {
            m3021u(((n92) ha2Var).f5338j);
            m3024x(ha2Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m3022v(ha2 ha2Var) {
        if (m3023w(ha2Var) || ((n92) ha2Var).f5338j == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            m3022v(((n92) ha2Var).f5338j);
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3023w(ha2 ha2Var) {
        return ((n92) ha2Var).f5342n != Thread.currentThread();
    }

    /* JADX INFO: renamed from: x */
    public static void m3024x(ha2 ha2Var) {
        String strSubstring = ((n92) ha2Var).f5341m;
        AtomicReference atomicReference = s92.f7076a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1540c(AbstractC0269h0 abstractC0269h0, C0785v c0785v, C0785v c0785v2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1541d(AbstractC0269h0 abstractC0269h0, Object obj, Object obj2);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1542e(AbstractC0269h0 abstractC0269h0, C0231g0 c0231g0, C0231g0 c0231g1);

    /* JADX INFO: renamed from: g */
    public abstract C0785v mo1543g(AbstractC0269h0 abstractC0269h0);

    /* JADX INFO: renamed from: h */
    public abstract C0231g0 mo1544h(AbstractC0269h0 abstractC0269h0);

    /* JADX INFO: renamed from: k */
    public abstract void mo1545k(C0231g0 c0231g0, C0231g0 c0231g1);

    /* JADX INFO: renamed from: l */
    public abstract void mo1546l(C0231g0 c0231g0, Thread thread);
}

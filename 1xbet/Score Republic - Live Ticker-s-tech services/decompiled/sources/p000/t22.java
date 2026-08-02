package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t22 {

    /* JADX INFO: renamed from: a */
    public static volatile su0 f7256a;

    /* JADX INFO: renamed from: d */
    public static final o31 f7259d;

    /* JADX INFO: renamed from: e */
    public static final nc1 f7260e;

    /* JADX INFO: renamed from: g */
    public static final C0451lz f7262g;

    /* JADX INFO: renamed from: h */
    public static final C0451lz f7263h;

    /* JADX INFO: renamed from: i */
    public static final C0451lz[] f7264i;

    /* JADX INFO: renamed from: b */
    public static final wa0 f7257b = new wa0(28);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0393ke f7258c = new RunnableC0393ke(2);

    /* JADX INFO: renamed from: f */
    public static final o31 f7261f = new o31(28);

    static {
        int i = 27;
        f7259d = new o31(i);
        f7260e = new nc1(i);
        C0451lz c0451lz = new C0451lz("CLIENT_TELEMETRY");
        f7262g = c0451lz;
        C0451lz c0451lz2 = new C0451lz("CLIENT_NOTIFICATION_TELEMETRY");
        f7263h = c0451lz2;
        f7264i = new C0451lz[]{c0451lz, c0451lz2};
    }

    /* JADX INFO: renamed from: a */
    public static C0805vj m4648a(String str, String str2) {
        C0131da c0131da = new C0131da(str, str2);
        C0768uj c0768ujM5164b = C0805vj.m5164b(C0131da.class);
        c0768ujM5164b.f7825e = 1;
        c0768ujM5164b.f7826f = new C0731tj(0, c0131da);
        return c0768ujM5164b.m4927b();
    }

    /* JADX INFO: renamed from: b */
    public static void m4649b(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        C0042ay.m530g(file, "Unable to create parent directories of ");
    }

    /* JADX INFO: renamed from: c */
    public static C0805vj m4650c(String str, C0042ay c0042ay) {
        C0768uj c0768ujM5164b = C0805vj.m5164b(C0131da.class);
        c0768ujM5164b.f7825e = 1;
        c0768ujM5164b.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5164b.f7826f = new C0615qe(11, str, c0042ay);
        return c0768ujM5164b.m4927b();
    }

    /* JADX INFO: renamed from: e */
    public static final Object m4651e(x51 x51Var, x51 x51Var2, v60 v60Var) throws Throwable {
        Object c0657rj;
        Object objM2612L;
        try {
            xe1.m5634a(2, v60Var);
            c0657rj = v60Var.mo1490g(x51Var2, x51Var);
        } catch (Throwable th) {
            c0657rj = new C0657rj(th, false);
        }
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        if (c0657rj == enumC0513nn || (objM2612L = x51Var.m2612L(c0657rj)) == AbstractC0959zp.f9884o) {
            return enumC0513nn;
        }
        if (objM2612L instanceof C0657rj) {
            throw ((C0657rj) objM2612L).f6860a;
        }
        return AbstractC0959zp.m5991y(objM2612L);
    }

    /* JADX INFO: renamed from: f */
    public static void m4652f(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeBundle(bundle);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: g */
    public static void m4653g(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeByteArray(bArr);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: h */
    public static void m4654h(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: i */
    public static void m4655i(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: j */
    public static void m4656j(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeIntArray(iArr);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: k */
    public static void m4657k(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: l */
    public static void m4658l(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeString(str);
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: m */
    public static void m4659m(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: n */
    public static void m4660n(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM4663q = m4663q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m4665s(parcel, iM4663q);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #4 }] */
    /* JADX INFO: renamed from: o */
    public static su0 m4661o(Context context) {
        su0 su0Var;
        su0 cx0Var;
        su0 cx0Var2;
        char c;
        su0 su0Var2 = f7256a;
        if (su0Var2 != null) {
            return su0Var2;
        }
        synchronized (t22.class) {
            try {
                su0Var = f7256a;
                if (su0Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C0089c8 c0089c8 = u22.f7657a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        su0Var = C0268h.f2972j;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c2 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                cx0Var = file.exists() ? new cx0(file) : C0268h.f2972j;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                cx0Var = C0268h.f2972j;
                            }
                            if (cx0Var.mo1040b()) {
                                File file2 = (File) cx0Var.mo1039a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        w71 w71Var = new w71(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c2]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                w71 w71Var2 = (w71) w71Var.get(str3);
                                                if (w71Var2 == null) {
                                                    c = 0;
                                                    w71Var2 = new w71(0);
                                                    w71Var.put(str3, w71Var2);
                                                } else {
                                                    c = 0;
                                                }
                                                w71Var2.put(strDecode, strDecode2);
                                                c2 = c;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        s22 s22Var = new s22(w71Var);
                                        bufferedReader.close();
                                        cx0Var2 = new cx0(s22Var);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                cx0Var2 = C0268h.f2972j;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            su0Var = cx0Var2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        su0Var = C0268h.f2972j;
                    }
                    f7256a = su0Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return su0Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m4662p(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX INFO: renamed from: q */
    public static int m4663q(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: r */
    public static Object m4664r(Class cls, String str, a81... a81VarArr) {
        int length = a81VarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < a81VarArr.length; i++) {
            a81 a81Var = a81VarArr[i];
            a81Var.getClass();
            clsArr[i] = (Class) a81Var.f63k;
            objArr[i] = a81VarArr[i].f64l;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m4665s(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4105d(String str);
}

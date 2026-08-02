package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: iv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0335iv {

    /* JADX INFO: renamed from: e */
    public static Boolean f3671e = null;

    /* JADX INFO: renamed from: f */
    public static String f3672f = null;

    /* JADX INFO: renamed from: g */
    public static boolean f3673g = false;

    /* JADX INFO: renamed from: h */
    public static int f3674h = -1;

    /* JADX INFO: renamed from: i */
    public static Boolean f3675i;

    /* JADX INFO: renamed from: m */
    public static r62 f3679m;

    /* JADX INFO: renamed from: n */
    public static k72 f3680n;

    /* JADX INFO: renamed from: a */
    public final Context f3681a;

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal f3676j = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public static final C0229fz f3677k = new C0229fz(2);

    /* JADX INFO: renamed from: l */
    public static final wu1 f3678l = new wu1(26);

    /* JADX INFO: renamed from: b */
    public static final dx1 f3668b = new dx1(3);

    /* JADX INFO: renamed from: c */
    public static final zw1 f3669c = new zw1(4);

    /* JADX INFO: renamed from: d */
    public static final bx1 f3670d = new bx1(4);

    public C0335iv(Context context) {
        this.f3681a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m2705a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC0477mo.m3406e(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x026c A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0274 A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027e A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d7 A[Catch: all -> 0x00b8, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e8, B:142:0x0314, B:143:0x031b, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031c, B:145:0x033c, B:146:0x033d, B:147:0x038a), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02e8 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e8, B:142:0x0314, B:143:0x031b, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031c, B:145:0x033c, B:146:0x033d, B:147:0x038a), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:136:0x0302  */
    /* JADX WARN: Code duplicated, block: B:139:0x030b  */
    /* JADX WARN: Code duplicated, block: B:144:0x031c A[Catch: all -> 0x00b8, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e8, B:142:0x0314, B:143:0x031b, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031c, B:145:0x033c, B:146:0x033d, B:147:0x038a), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a0, B:128:0x02af, B:130:0x02d7, B:132:0x02e8, B:142:0x0314, B:143:0x031b, B:123:0x02a3, B:124:0x02a4, B:125:0x02ab, B:144:0x031c, B:145:0x033c, B:146:0x033d, B:147:0x038a), top: B:167:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0288, TryCatch #3 {all -> 0x0288, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:161:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020a A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0212 A[Catch: all -> 0x0173, ev -> 0x0178, RemoteException -> 0x017d, TRY_LEAVE, TryCatch #11 {RemoteException -> 0x017d, ev -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022e A[Catch: all -> 0x0225, ev -> 0x0228, RemoteException -> 0x022b, TryCatch #10 {RemoteException -> 0x022b, ev -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:166:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [hv] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    /* JADX INFO: renamed from: c */
    public static C0335iv m2706c(Context context, InterfaceC0300hv interfaceC0300hv, String str) throws C0188ev {
        ?? r7;
        int i;
        xu0 xu0Var;
        C0335iv c0335iv;
        Cursor cursor;
        int i2;
        Boolean bool;
        r62 r62VarM2711h;
        int i3;
        xb0 xb0VarM4269H;
        Object objM5188H;
        l42 l42Var;
        k72 k72Var;
        l42 l42Var2;
        boolean z;
        xb0 xb0VarM2997H;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C0188ev("null application Context");
        }
        ThreadLocal threadLocal = f3676j;
        l42 l42Var3 = (l42) threadLocal.get();
        l42 l42Var4 = new l42();
        threadLocal.set(l42Var4);
        C0229fz c0229fz = f3677k;
        Long l = (Long) c0229fz.get();
        long jLongValue = l.longValue();
        try {
            c0229fz.set(Long.valueOf(SystemClock.uptimeMillis()));
            C0263gv c0263gvMo797b = interfaceC0300hv.mo797b(context, str, f3678l);
            int i4 = c0263gvMo797b.f2941a;
            int i5 = c0263gvMo797b.f2942b;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i4).length() + 19 + str.length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = c0263gvMo797b.f2943c;
            if (i6 != 0) {
                if (i6 != -1) {
                    if (i6 == 1 || c0263gvMo797b.f2942b != 0) {
                        if (i6 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            C0335iv c0335iv2 = new C0335iv(applicationContext);
                            if (jLongValue == 0) {
                                c0229fz.remove();
                            } else {
                                c0229fz.set(l);
                            }
                            cursor2 = l42Var4.f4676a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(l42Var3);
                            return c0335iv2;
                        }
                        if (i6 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i6);
                            throw new C0188ev(sb2.toString());
                        }
                        try {
                            try {
                                i2 = c0263gvMo797b.f2942b;
                                try {
                                    try {
                                        try {
                                            synchronized (C0335iv.class) {
                                                try {
                                                    if (m2708e(context)) {
                                                        throw new C0188ev("Remote loading disabled");
                                                    }
                                                    bool = f3671e;
                                                    if (bool != null) {
                                                        throw new C0188ev("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i2);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (C0335iv.class) {
                                                            k72Var = f3680n;
                                                        }
                                                        if (k72Var != null) {
                                                            throw new C0188ev("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        l42Var2 = (l42) threadLocal.get();
                                                        if (l42Var2 != null || l42Var2.f4676a == null) {
                                                            throw new C0188ev("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = l42Var2.f4676a;
                                                        new vs0(null);
                                                        synchronized (C0335iv.class) {
                                                            z = f3674h >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            xb0VarM2997H = k72Var.m2998I(new vs0(applicationContext2), str, i2, new vs0(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            xb0VarM2997H = k72Var.m2997H(new vs0(applicationContext2), str, i2, new vs0(cursor3));
                                                        }
                                                        Context context2 = (Context) vs0.m5188H(xb0VarM2997H);
                                                        if (context2 == null) {
                                                            throw new C0188ev("Failed to get module context");
                                                        }
                                                        c0335iv = new C0335iv(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i2);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        r62VarM2711h = m2711h(context);
                                                        if (r62VarM2711h != null) {
                                                            throw new C0188ev("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelM5808a = r62VarM2711h.m5808a(r62VarM2711h.m5810d(), 6);
                                                        i3 = parcelM5808a.readInt();
                                                        parcelM5808a.recycle();
                                                        if (i3 >= 3) {
                                                            l42Var = (l42) threadLocal.get();
                                                            if (l42Var != null) {
                                                                throw new C0188ev("No cached result cursor holder");
                                                            }
                                                            xb0VarM4269H = r62VarM2711h.m4272K(new vs0(context), str, i2, new vs0(l42Var.f4676a));
                                                        } else if (i3 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            xb0VarM4269H = r62VarM2711h.m4270I(new vs0(context), str, i2);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            xb0VarM4269H = r62VarM2711h.m4269H(new vs0(context), str, i2);
                                                        }
                                                        objM5188H = vs0.m5188H(xb0VarM4269H);
                                                        if (objM5188H != null) {
                                                            throw new C0188ev("Failed to load remote module.");
                                                        }
                                                        c0335iv = new C0335iv((Context) objM5188H);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f3677k.remove();
                                                    } else {
                                                        f3677k.set(l);
                                                    }
                                                    cursor = l42Var4.f4676a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f3676j.set(l42Var3);
                                                    return c0335iv;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (RemoteException e) {
                                        e = e;
                                        throw new C0188ev("Failed to load remote module.", e);
                                    } catch (C0188ev e2) {
                                        throw e2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new C0188ev("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    throw new C0188ev("Failed to load remote module.", e);
                                } catch (C0188ev e4) {
                                    throw e4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw new C0188ev("Failed to load remote module.", th);
                                }
                            } catch (C0188ev e5) {
                                e = e5;
                                r7 = c0229fz;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i = c0263gvMo797b.f2941a;
                                if (i != 0) {
                                    xu0Var = new xu0();
                                    xu0Var.f9057j = i;
                                    if (interfaceC0300hv.mo797b(r7, str, xu0Var).f2943c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                        c0335iv = new C0335iv(applicationContext);
                                    }
                                }
                                throw new C0188ev("Remote load failed. No local fallback found.", e);
                            }
                        } catch (C0188ev e6) {
                            e = e6;
                            r7 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i = c0263gvMo797b.f2941a;
                            if (i != 0) {
                                xu0Var = new xu0();
                                xu0Var.f9057j = i;
                                if (interfaceC0300hv.mo797b(r7, str, xu0Var).f2943c == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    c0335iv = new C0335iv(applicationContext);
                                }
                            }
                            throw new C0188ev("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (c0263gvMo797b.f2941a != 0) {
                    i6 = -1;
                    if (i6 == 1) {
                    }
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        C0335iv c0335iv3 = new C0335iv(applicationContext);
                        if (jLongValue == 0) {
                            c0229fz.remove();
                        } else {
                            c0229fz.set(l);
                        }
                        cursor2 = l42Var4.f4676a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(l42Var3);
                        return c0335iv3;
                    }
                    if (i6 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i6);
                        throw new C0188ev(sb7.toString());
                    }
                    i2 = c0263gvMo797b.f2942b;
                    synchronized (C0335iv.class) {
                        if (m2708e(context)) {
                            throw new C0188ev("Remote loading disabled");
                        }
                        bool = f3671e;
                        if (bool != null) {
                            throw new C0188ev("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i2);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (C0335iv.class) {
                                k72Var = f3680n;
                                if (k72Var != null) {
                                    throw new C0188ev("DynamiteLoaderV2 was not cached.");
                                }
                                l42Var2 = (l42) threadLocal.get();
                                if (l42Var2 != null) {
                                }
                                throw new C0188ev("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i2);
                        Log.i("DynamiteModule", sb9.toString());
                        r62VarM2711h = m2711h(context);
                        if (r62VarM2711h != null) {
                            throw new C0188ev("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM5808a2 = r62VarM2711h.m5808a(r62VarM2711h.m5810d(), 6);
                        i3 = parcelM5808a2.readInt();
                        parcelM5808a2.recycle();
                        if (i3 >= 3) {
                            l42Var = (l42) threadLocal.get();
                            if (l42Var != null) {
                                throw new C0188ev("No cached result cursor holder");
                            }
                            xb0VarM4269H = r62VarM2711h.m4272K(new vs0(context), str, i2, new vs0(l42Var.f4676a));
                        } else if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            xb0VarM4269H = r62VarM2711h.m4270I(new vs0(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            xb0VarM4269H = r62VarM2711h.m4269H(new vs0(context), str, i2);
                        }
                        objM5188H = vs0.m5188H(xb0VarM4269H);
                        if (objM5188H != null) {
                            throw new C0188ev("Failed to load remote module.");
                        }
                        c0335iv = new C0335iv((Context) objM5188H);
                        if (jLongValue == 0) {
                            f3677k.remove();
                        } else {
                            f3677k.set(l);
                        }
                        cursor = l42Var4.f4676a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f3676j.set(l42Var3);
                        return c0335iv;
                    }
                }
            }
            int i7 = c0263gvMo797b.f2941a;
            int i8 = c0263gvMo797b.f2942b;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i7);
            sb10.append(" and remote version is ");
            sb10.append(i8);
            sb10.append(".");
            throw new C0188ev(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                f3677k.remove();
            } else {
                f3677k.set(l);
            }
            Cursor cursor4 = l42Var4.f4676a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f3676j.set(l42Var3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: all -> 0x003b, TryCatch #7 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:49:0x00a5, B:17:0x0040, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:40:0x0084, B:41:0x008c, B:39:0x0076, B:44:0x008f, B:47:0x0092, B:48:0x009c, B:18:0x0043), top: B:142:0x002b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0175  */
    /* JADX INFO: renamed from: d */
    public static int m2707d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i;
        Cursor cursor;
        try {
            synchronized (C0335iv.class) {
                Boolean bool = f3671e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m2710g(classLoader);
                                    } catch (C0188ev unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m2708e(context)) {
                                        return 0;
                                    }
                                    if (f3673g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM2709f = m2709f(context, str, z, true);
                                                String str2 = f3672f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM5200o = vt1.m5200o();
                                                    if (classLoaderM5200o == null) {
                                                        String str3 = f3672f;
                                                        p80.m3863h(str3);
                                                        classLoaderM5200o = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    }
                                                    m2710g(classLoaderM5200o);
                                                    declaredField.set(null, classLoaderM5200o);
                                                    f3671e = bool2;
                                                    return iM2709f;
                                                }
                                                return iM2709f;
                                            } catch (C0188ev unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f3671e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m2709f(context, str, z, false);
                    } catch (C0188ev e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                r62 r62VarM2711h = m2711h(context);
                try {
                    if (r62VarM2711h == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM5808a = r62VarM2711h.m5808a(r62VarM2711h.m5810d(), 6);
                        int i2 = parcelM5808a.readInt();
                        parcelM5808a.recycle();
                        if (i2 >= 3) {
                            ThreadLocal threadLocal = f3676j;
                            l42 l42Var = (l42) threadLocal.get();
                            if (l42Var != null && (cursor = l42Var.f4676a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) vs0.m5188H(r62VarM2711h.m4271J(new vs0(context), str, z, ((Long) f3677k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i = cursor3.getInt(0);
                                        if (i > 0) {
                                            l42 l42Var2 = (l42) threadLocal.get();
                                            if (l42Var2 == null || l42Var2.f4676a != null) {
                                                z2 = false;
                                            } else {
                                                l42Var2.f4676a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e3) {
                                    remoteException = e3;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            vs0 vs0Var = new vs0(context);
                            Parcel parcelM5810d = r62VarM2711h.m5810d();
                            ru1.m4408b(parcelM5810d, vs0Var);
                            parcelM5810d.writeString(str);
                            parcelM5810d.writeInt(z ? 1 : 0);
                            Parcel parcelM5808a2 = r62VarM2711h.m5808a(parcelM5810d, 5);
                            i = parcelM5808a2.readInt();
                            parcelM5808a2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            vs0 vs0Var2 = new vs0(context);
                            Parcel parcelM5810d2 = r62VarM2711h.m5810d();
                            ru1.m4408b(parcelM5810d2, vs0Var2);
                            parcelM5810d2.writeString(str);
                            parcelM5810d2.writeInt(z ? 1 : 0);
                            Parcel parcelM5808a3 = r62VarM2711h.m5808a(parcelM5810d2, 3);
                            i = parcelM5808a3.readInt();
                            parcelM5808a3.recycle();
                        }
                        return i;
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                p80.m3863h(context);
                throw th5;
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2708e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f3675i)) {
            return true;
        }
        boolean z = false;
        if (f3675i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (i90.f3485b.m2575b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f3675i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f3673g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public static int m2709f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f3677k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (C0335iv.class) {
                                    try {
                                        f3672f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f3674h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f3673g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                l42 l42Var = (l42) f3676j.get();
                                if (l42Var == null || l42Var.f4676a != null) {
                                    z4 = false;
                                } else {
                                    l42Var.f4676a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new C0188ev("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof C0188ev) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new C0188ev(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C0188ev("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2710g(ClassLoader classLoader) throws C0188ev {
        try {
            k72 k72Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                k72Var = iInterfaceQueryLocalInterface instanceof k72 ? (k72) iInterfaceQueryLocalInterface : new k72(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f3680n = k72Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C0188ev("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static r62 m2711h(Context context) {
        r62 r62Var;
        synchronized (C0335iv.class) {
            r62 r62Var2 = f3679m;
            if (r62Var2 != null) {
                return r62Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    r62Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    r62Var = iInterfaceQueryLocalInterface instanceof r62 ? (r62) iInterfaceQueryLocalInterface : new r62(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (r62Var != null) {
                    f3679m = r62Var;
                    return r62Var;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m2712b(String str) throws C0188ev {
        try {
            return (IBinder) this.f3681a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C0188ev("Failed to instantiate module class: ".concat(str), e);
        }
    }
}

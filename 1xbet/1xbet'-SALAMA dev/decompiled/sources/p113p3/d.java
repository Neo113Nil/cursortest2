package p113p3;

import B4.V;
import C0.C0091j;
import H2.i;
import L3.b;
import M4.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p023d1.n;
import p036e6.c;
import p105o3.a;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f15686e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f15687f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f15688g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f15689h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f15690i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static i f15693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static j f15694n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15695a;
    public static final ThreadLocal j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f15691k = new b(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final V f15692l = new V(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f15683b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f15684c = new c(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1009l0 f15685d = new C1009l0(21);

    public d(Context context) {
        this.f15695a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (D.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0212 A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0271  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:132:0x029c A[Catch: all -> 0x029a, TryCatch #8 {all -> 0x029a, blocks: (B:132:0x029c, B:133:0x02b3, B:128:0x0292, B:129:0x0299, B:134:0x02b4, B:135:0x02e0, B:27:0x00b1, B:105:0x021c, B:106:0x0226, B:109:0x0229, B:110:0x022a, B:111:0x0231), top: B:159:0x007c, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x009d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #10 {all -> 0x008d, blocks: (B:9:0x0053, B:13:0x0081, B:21:0x0097, B:24:0x009d, B:27:0x00b1, B:105:0x021c, B:106:0x0226, B:109:0x0229, B:110:0x022a, B:111:0x0231, B:112:0x0232, B:114:0x0250, B:116:0x025d), top: B:162:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x0210, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01be A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f8 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0200 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0208 A[Catch: all -> 0x0127, a -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b), top: B:163:0x00b5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x029c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0173, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [p3.h] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static d c(Context context, c cVar, String str) throws Throwable {
        ?? r7;
        ?? r10;
        d dVar;
        int i7;
        Boolean bool;
        i iVarH;
        int i8;
        a aVarZ;
        Object objT0;
        d dVar2;
        h hVar;
        j jVar;
        h hVar2;
        boolean z4;
        a aVarZ2;
        Cursor cursor;
        int i9;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = j;
        h hVar3 = (h) threadLocal.get();
        h hVar4 = new h();
        threadLocal.set(hVar4);
        b bVar = f15691k;
        Long l7 = (Long) bVar.get();
        long jLongValue = l7.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0091j c0091jE = cVar.e(context2, str, f15692l);
            int i10 = c0091jE.f1289a;
            try {
                int i11 = c0091jE.f1290b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i10 + " and remote module " + str + ":" + i11);
                    int i12 = c0091jE.f1291c;
                    try {
                        if (i12 != 0) {
                            if (i12 != -1) {
                                i11 = i11;
                                if (i12 == 1 || (i9 = c0091jE.f1290b) != 0) {
                                    if (i12 == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                        dVar = new d(applicationContext);
                                    } else {
                                        if (i12 == 1) {
                                            throw new a("VersionPolicy returned invalid code:" + i12);
                                        }
                                        try {
                                            i7 = c0091jE.f1290b;
                                            try {
                                                synchronized (d.class) {
                                                    if (g(context)) {
                                                        throw new a("Remote loading disabled");
                                                    }
                                                    bool = f15686e;
                                                }
                                                if (bool != null) {
                                                    throw new a("Failed to determine which loading route to use.");
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                                    synchronized (d.class) {
                                                        jVar = f15694n;
                                                    }
                                                    if (jVar != null) {
                                                        throw new a("DynamiteLoaderV2 was not cached.");
                                                    }
                                                    hVar2 = (h) threadLocal.get();
                                                    if (hVar2 != null || hVar2.f15699a == null) {
                                                        throw new a("No result cursor");
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = hVar2.f15699a;
                                                    new p105o3.b(null);
                                                    synchronized (d.class) {
                                                        z4 = f15689h >= 2;
                                                    }
                                                    if (z4) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        aVarZ2 = jVar.t0(new p105o3.b(applicationContext2), str, i7, new p105o3.b(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        aVarZ2 = jVar.Z(new p105o3.b(applicationContext2), str, i7, new p105o3.b(cursor2));
                                                    }
                                                    Context context3 = (Context) p105o3.b.t0(aVarZ2);
                                                    if (context3 == null) {
                                                        throw new a("Failed to get module context");
                                                    }
                                                    dVar2 = new d(context3);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                                    iVarH = h(context);
                                                    if (iVarH != null) {
                                                        throw new a("Failed to create IDynamiteLoader.");
                                                    }
                                                    Parcel parcelZzB = iVarH.zzB(6, iVarH.zza());
                                                    i8 = parcelZzB.readInt();
                                                    parcelZzB.recycle();
                                                    if (i8 >= 3) {
                                                        hVar = (h) threadLocal.get();
                                                        if (hVar != null) {
                                                            throw new a("No cached result cursor holder");
                                                        }
                                                        aVarZ = iVarH.t0(new p105o3.b(context2), str, i7, new p105o3.b(hVar.f15699a));
                                                    } else if (i8 == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        aVarZ = iVarH.u0(new p105o3.b(context2), str, i7);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        aVarZ = iVarH.Z(new p105o3.b(context2), str, i7);
                                                    }
                                                    objT0 = p105o3.b.t0(aVarZ);
                                                    if (objT0 != null) {
                                                        throw new a("Failed to load remote module.");
                                                    }
                                                    dVar2 = new d((Context) objT0);
                                                }
                                                dVar = dVar2;
                                            } catch (RemoteException e7) {
                                                throw new a("Failed to load remote module.", e7);
                                            } catch (a e8) {
                                                throw e8;
                                            } catch (Throwable th) {
                                                p090m3.c.a(context2, th);
                                                throw new a("Failed to load remote module.", th);
                                            }
                                        } catch (a e9) {
                                            Log.w("DynamiteModule", "Failed to load remote module: " + e9.getMessage());
                                            int i13 = c0091jE.f1289a;
                                            if (i13 == 0 || cVar.e(context2, str, new n(i13)).f1291c != -1) {
                                                throw new a("Remote load failed. No local fallback found.", e9);
                                            }
                                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                            dVar = new d(applicationContext);
                                        }
                                    }
                                    if (jLongValue == 0) {
                                        f15691k.remove();
                                    } else {
                                        f15691k.set(l7);
                                    }
                                    cursor = hVar4.f15699a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    j.set(hVar3);
                                    return dVar;
                                }
                            } else if (c0091jE.f1289a != 0) {
                                i12 = -1;
                                i11 = i11;
                                if (i12 == 1) {
                                }
                                if (i12 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    dVar = new d(applicationContext);
                                } else {
                                    if (i12 == 1) {
                                        throw new a("VersionPolicy returned invalid code:" + i12);
                                    }
                                    i7 = c0091jE.f1290b;
                                    synchronized (d.class) {
                                        if (g(context)) {
                                            throw new a("Remote loading disabled");
                                        }
                                        bool = f15686e;
                                        if (bool != null) {
                                            throw new a("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                            synchronized (d.class) {
                                                jVar = f15694n;
                                                if (jVar != null) {
                                                    throw new a("DynamiteLoaderV2 was not cached.");
                                                }
                                                hVar2 = (h) threadLocal.get();
                                                if (hVar2 != null) {
                                                }
                                                throw new a("No result cursor");
                                            }
                                        }
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i7);
                                        iVarH = h(context);
                                        if (iVarH != null) {
                                            throw new a("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelZzB2 = iVarH.zzB(6, iVarH.zza());
                                        i8 = parcelZzB2.readInt();
                                        parcelZzB2.recycle();
                                        if (i8 >= 3) {
                                            hVar = (h) threadLocal.get();
                                            if (hVar != null) {
                                                throw new a("No cached result cursor holder");
                                            }
                                            aVarZ = iVarH.t0(new p105o3.b(context2), str, i7, new p105o3.b(hVar.f15699a));
                                        } else if (i8 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarZ = iVarH.u0(new p105o3.b(context2), str, i7);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarZ = iVarH.Z(new p105o3.b(context2), str, i7);
                                        }
                                        objT0 = p105o3.b.t0(aVarZ);
                                        if (objT0 != null) {
                                            throw new a("Failed to load remote module.");
                                        }
                                        dVar2 = new d((Context) objT0);
                                        dVar = dVar2;
                                    }
                                }
                                if (jLongValue == 0) {
                                    f15691k.remove();
                                } else {
                                    f15691k.set(l7);
                                }
                                cursor = hVar4.f15699a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                j.set(hVar3);
                                return dVar;
                            }
                        }
                        i11 = i9;
                        throw new a("No acceptable module " + str + " found. Local version is " + c0091jE.f1289a + " and remote version is " + c0091jE.f1290b + ".");
                    } catch (Throwable th2) {
                        th = th2;
                        r7 = context2;
                        r10 = i11;
                        if (jLongValue == 0) {
                            f15691k.remove();
                        } else {
                            f15691k.set(l7);
                        }
                        Cursor cursor3 = r7.f15699a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        j.set(r10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = hVar3;
                    r7 = hVar4;
                }
            } catch (Throwable th4) {
                th = th4;
                r7 = hVar4;
                r10 = hVar3;
            }
        } catch (Throwable th5) {
            th = th5;
            r7 = hVar4;
            r10 = hVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #8 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:141:0x0027, inners: #5 }] */
    public static int d(Context context, String str, boolean z4) {
        Throwable th;
        RemoteException e7;
        int i7;
        Cursor cursor;
        try {
            synchronized (d.class) {
                Boolean bool = f15686e;
                boolean z7 = true;
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
                                        f(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f15688g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z4, true);
                                                String str2 = f15687f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderK0 = f.k0();
                                                    if (classLoaderK0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            i.d();
                                                            String str3 = f15687f;
                                                            D.i(str3);
                                                            classLoaderK0 = i.c(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f15687f;
                                                            D.i(str4);
                                                            classLoaderK0 = new g(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderK0);
                                                    declaredField.set(null, classLoaderK0);
                                                    f15686e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f15686e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z4, false);
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                i iVarH = h(context);
                try {
                    if (iVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = iVarH.zzB(6, iVarH.zza());
                        int i8 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i8 >= 3) {
                            ThreadLocal threadLocal = j;
                            h hVar = (h) threadLocal.get();
                            if (hVar != null && (cursor = hVar.f15699a) != null) {
                                return cursor.getInt(0);
                            }
                            p105o3.b bVar = new p105o3.b(context);
                            long jLongValue = ((Long) f15691k.get()).longValue();
                            Parcel parcelZza = iVarH.zza();
                            zzc.zze(parcelZza, bVar);
                            parcelZza.writeString(str);
                            parcelZza.writeInt(z4 ? 1 : 0);
                            parcelZza.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) p105o3.b.t0(p150v0.a.h(iVarH.zzB(7, parcelZza)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i7 = cursor3.getInt(0);
                                        if (i7 > 0) {
                                            h hVar2 = (h) threadLocal.get();
                                            if (hVar2 == null || hVar2.f15699a != null) {
                                                z7 = false;
                                            } else {
                                                hVar2.f15699a = cursor3;
                                            }
                                            cursor2 = z7 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e10) {
                                    e7 = e10;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e7.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
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
                        if (i8 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            p105o3.b bVar2 = new p105o3.b(context);
                            Parcel parcelZza2 = iVarH.zza();
                            zzc.zze(parcelZza2, bVar2);
                            parcelZza2.writeString(str);
                            parcelZza2.writeInt(z4 ? 1 : 0);
                            Parcel parcelZzB2 = iVarH.zzB(5, parcelZza2);
                            i7 = parcelZzB2.readInt();
                            parcelZzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            p105o3.b bVar3 = new p105o3.b(context);
                            Parcel parcelZza3 = iVarH.zza();
                            zzc.zze(parcelZza3, bVar3);
                            parcelZza3.writeString(str);
                            parcelZza3.writeInt(z4 ? 1 : 0);
                            Parcel parcelZzB3 = iVarH.zzB(3, parcelZza3);
                            i7 = parcelZzB3.readInt();
                            parcelZzB3.recycle();
                        }
                        return i7;
                    } catch (RemoteException e11) {
                        e7 = e11;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            p090m3.c.a(context, th5);
            throw th5;
        }
    }

    public static int e(Context context, String str, boolean z4, boolean z7) throws Throwable {
        boolean z8;
        Cursor cursor = null;
        try {
            try {
                boolean z9 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f15691k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z10 = false;
                            int i7 = cursorQuery.getInt(0);
                            if (i7 > 0) {
                                synchronized (d.class) {
                                    try {
                                        f15687f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f15689h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z8 = cursorQuery.getInt(columnIndex2) != 0;
                                            f15688g = z8;
                                        } else {
                                            z8 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                h hVar = (h) j.get();
                                if (hVar == null || hVar.f15699a != null) {
                                    z9 = false;
                                } else {
                                    hVar.f15699a = cursorQuery;
                                }
                                cursor = z9 ? null : cursorQuery;
                                z10 = z8;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z7 && z10) {
                                throw new a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i7;
                            if (e instanceof a) {
                                throw e;
                            }
                            throw new a("V2 version check failed: " + e.getMessage(), e);
                        }
                    } catch (Exception e7) {
                        e = e7;
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }

    public static void f(ClassLoader classLoader) throws a {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f15694n = jVar;
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new a("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f15690i)) {
            return true;
        }
        boolean z4 = false;
        if (f15690i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.d.f11217b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z4 = true;
            }
            f15690i = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15688g = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    public static i h(Context context) {
        i iVar;
        synchronized (d.class) {
            i iVar2 = f15693m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (iVar != null) {
                    f15693m = iVar;
                    return iVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws a {
        try {
            return (IBinder) this.f15695a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new a("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}

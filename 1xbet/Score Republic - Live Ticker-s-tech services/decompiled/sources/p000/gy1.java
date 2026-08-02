package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2964j = 1;

    /* JADX INFO: renamed from: k */
    public final int f2965k;

    /* JADX INFO: renamed from: l */
    public final String f2966l;

    /* JADX INFO: renamed from: m */
    public final Object f2967m;

    /* JADX INFO: renamed from: n */
    public final Object f2968n;

    /* JADX INFO: renamed from: o */
    public final Object f2969o;

    /* JADX INFO: renamed from: p */
    public final Object f2970p;

    public /* synthetic */ gy1(String str, ny1 ny1Var, int i, IOException iOException, byte[] bArr, Map map) {
        p80.m3863h(ny1Var);
        this.f2967m = ny1Var;
        this.f2965k = i;
        this.f2968n = iOException;
        this.f2969o = bArr;
        this.f2966l = str;
        this.f2970p = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2964j) {
            case 0:
                ky1 ky1Var = (ky1) this.f2970p;
                fz1 fz1Var = ((f02) ky1Var.f7192j).f2246n;
                f02.m1558k(fz1Var);
                if (!fz1Var.f1519k) {
                    Log.println(6, ky1Var.m3114K(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (ky1Var.f4597l == 0) {
                    bt1 bt1Var = ((f02) ky1Var.f7192j).f2245m;
                    if (bt1Var.f985n == null) {
                        synchronized (bt1Var) {
                            try {
                                if (bt1Var.f985n == null) {
                                    f02 f02Var = (f02) bt1Var.f7192j;
                                    ApplicationInfo applicationInfo = f02Var.f2242j.getApplicationInfo();
                                    if (d71.f1569c == null) {
                                        d71.f1569c = Application.getProcessName();
                                    }
                                    String str = d71.f1569c;
                                    if (applicationInfo != null) {
                                        String str2 = applicationInfo.processName;
                                        bt1Var.f985n = Boolean.valueOf(str2 != null && str2.equals(str));
                                    }
                                    if (bt1Var.f985n == null) {
                                        bt1Var.f985n = Boolean.TRUE;
                                        ky1 ky1Var2 = f02Var.f2247o;
                                        f02.m1560m(ky1Var2);
                                        ky1Var2.f4600o.m5312a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (bt1Var.f985n.booleanValue()) {
                        ky1Var.f4597l = 'C';
                    } else {
                        ky1Var.f4597l = 'c';
                    }
                    break;
                }
                if (ky1Var.f4598m < 0) {
                    ((f02) ky1Var.f7192j).f2245m.m765G();
                    ky1Var.f4598m = 161000L;
                }
                int i = this.f2965k;
                char c = ky1Var.f4597l;
                long j = ky1Var.f4598m;
                String str3 = this.f2966l;
                Object obj = this.f2967m;
                Object obj2 = this.f2968n;
                Object obj3 = this.f2969o;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strM3107L = ky1.m3107L(true, str3, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strM3107L.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strM3107L);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str3.substring(0, 1024);
                }
                C0593pt c0593pt = fz1Var.f2551n;
                if (c0593pt != null) {
                    String str4 = (String) c0593pt.f6250m;
                    fz1 fz1Var2 = (fz1) c0593pt.f6251n;
                    fz1Var2.mo11z();
                    if (((fz1) c0593pt.f6251n).m1908E().getLong((String) c0593pt.f6248k, 0L) == 0) {
                        c0593pt.m3985d();
                    }
                    SharedPreferences sharedPreferencesM1908E = fz1Var2.m1908E();
                    String str5 = (String) c0593pt.f6249l;
                    long j2 = sharedPreferencesM1908E.getLong(str5, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = fz1Var2.m1908E().edit();
                        editorEdit.putString(str4, string);
                        editorEdit.putLong(str5, 1L);
                        editorEdit.apply();
                        return;
                    }
                    f72 f72Var = ((f02) fz1Var2.f7192j).f2250r;
                    f02.m1558k(f72Var);
                    long jNextLong = f72Var.m1697A0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = fz1Var2.m1908E().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str4, string);
                    }
                    editorEdit2.putLong(str5, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((ny1) this.f2967m).mo3600a(this.f2966l, this.f2965k, (Throwable) this.f2968n, (byte[]) this.f2969o, (Map) this.f2970p);
                return;
        }
    }

    public gy1(ky1 ky1Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f2965k = i;
        this.f2966l = str;
        this.f2967m = obj;
        this.f2968n = obj2;
        this.f2969o = obj3;
        this.f2970p = ky1Var;
    }
}

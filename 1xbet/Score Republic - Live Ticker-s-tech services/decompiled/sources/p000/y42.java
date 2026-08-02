package p000;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends k62 {

    /* JADX INFO: renamed from: m */
    public final HashMap f9147m;

    /* JADX INFO: renamed from: n */
    public final bz1 f9148n;

    /* JADX INFO: renamed from: o */
    public final bz1 f9149o;

    /* JADX INFO: renamed from: p */
    public final bz1 f9150p;

    /* JADX INFO: renamed from: q */
    public final bz1 f9151q;

    /* JADX INFO: renamed from: r */
    public final bz1 f9152r;

    /* JADX INFO: renamed from: s */
    public final bz1 f9153s;

    public y42(x62 x62Var) {
        super(x62Var);
        this.f9147m = new HashMap();
        fz1 fz1Var = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var);
        this.f9148n = new bz1(fz1Var, "last_delete_stale", 0L);
        fz1 fz1Var2 = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var2);
        this.f9149o = new bz1(fz1Var2, "last_delete_stale_batch", 0L);
        fz1 fz1Var3 = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var3);
        this.f9150p = new bz1(fz1Var3, "backoff", 0L);
        fz1 fz1Var4 = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var4);
        this.f9151q = new bz1(fz1Var4, "last_upload", 0L);
        fz1 fz1Var5 = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var5);
        this.f9152r = new bz1(fz1Var5, "last_upload_attempt", 0L);
        fz1 fz1Var6 = ((f02) this.f7192j).f2246n;
        f02.m1558k(fz1Var6);
        this.f9153s = new bz1(fz1Var6, "midnight_offset", 0L);
    }

    /* JADX INFO: renamed from: E */
    public final Pair m5723E(z72 z72Var, l12 l12Var) {
        String str = z72Var.f9655j;
        p80.m3860e(str);
        return (l12Var.m3157i(k12.f4249k) && z72Var.f9668w) ? m5724F(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    public final Pair m5724F(String str) {
        w42 w42Var;
        C0272h3 c0272h3M2522a;
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        wa0 wa0Var = f02Var.f2252t;
        bt1 bt1Var = f02Var.f2245m;
        wa0Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f9147m;
        w42 w42Var2 = (w42) map.get(str);
        if (w42Var2 != null && jElapsedRealtime < w42Var2.f8381c) {
            return new Pair(w42Var2.f8379a, Boolean.valueOf(w42Var2.f8380b));
        }
        long jM767I = bt1Var.m767I(str, jx1.f4167b) + jElapsedRealtime;
        try {
            try {
                c0272h3M2522a = C0309i3.m2522a(f02Var.f2242j);
            } catch (PackageManager.NameNotFoundException unused) {
                if (w42Var2 != null && jElapsedRealtime < w42Var2.f8381c + bt1Var.m767I(str, jx1.f4170c)) {
                    return new Pair(w42Var2.f8379a, Boolean.valueOf(w42Var2.f8380b));
                }
                c0272h3M2522a = null;
            }
            if (c0272h3M2522a == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = (String) c0272h3M2522a.f3021b;
            w42Var = str2 != null ? new w42(jM767I, str2, c0272h3M2522a.f3022c) : new w42(jM767I, "", c0272h3M2522a.f3022c);
            map.put(str, w42Var);
            return new Pair(w42Var.f8379a, Boolean.valueOf(w42Var.f8380b));
        } catch (Exception e) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5313b(e, "Unable to get advertising id");
            w42Var = new w42(jM767I, "", false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final String m5725G(z72 z72Var, l12 l12Var) {
        String str = z72Var.f9655j;
        p80.m3860e(str);
        if (!l12Var.m3157i(k12.f4249k) || !z72Var.f9668w) {
            return "";
        }
        mo11z();
        String str2 = (String) m5724F(str).first;
        MessageDigest messageDigestM1685T = f72.m1685T();
        if (messageDigestM1685T == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM1685T.digest(str2.getBytes())));
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
    }
}

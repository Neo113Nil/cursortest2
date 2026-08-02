package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 {

    /* JADX INFO: renamed from: a */
    public final String f992a;

    /* JADX INFO: renamed from: b */
    public final String f993b;

    /* JADX INFO: renamed from: c */
    public final String f994c;

    /* JADX INFO: renamed from: d */
    public final long f995d;

    /* JADX INFO: renamed from: e */
    public final long f996e;

    /* JADX INFO: renamed from: f */
    public final long f997f;

    /* JADX INFO: renamed from: g */
    public final eu1 f998g;

    public bu1(f02 f02Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        eu1 eu1Var;
        p80.m3860e(str2);
        p80.m3860e(str3);
        this.f992a = str2;
        this.f993b = str3;
        this.f994c = true == TextUtils.isEmpty(str) ? null : str;
        this.f995d = j;
        this.f996e = j2;
        this.f997f = j3;
        if (j3 != 0 && j3 > j) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(ky1.m3106I(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            eu1Var = new eu1(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5312a("Param name can't be null");
                    it.remove();
                } else {
                    f72 f72Var = f02Var.f2250r;
                    f02.m1558k(f72Var);
                    Object objM1708J = f72Var.m1708J(bundle2.get(next), next);
                    if (objM1708J == null) {
                        ky1 ky1Var3 = f02Var.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4603r.m5313b(f02Var.f2251s.m1044b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        f72 f72Var2 = f02Var.f2250r;
                        f02.m1558k(f72Var2);
                        f72Var2.m1720R(bundle2, next, objM1708J);
                    }
                }
            }
            eu1Var = new eu1(bundle2);
        }
        this.f998g = eu1Var;
    }

    /* JADX INFO: renamed from: a */
    public final bu1 m778a(f02 f02Var, long j) {
        return new bu1(f02Var, this.f994c, this.f992a, this.f993b, this.f995d, this.f996e, j, this.f998g);
    }

    public final String toString() {
        String string = this.f998g.toString();
        String str = this.f992a;
        int length = String.valueOf(str).length();
        String str2 = this.f993b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        return AbstractC0024an.m286i(sb, "', params=", string, "}");
    }

    public bu1(f02 f02Var, String str, String str2, String str3, long j, long j2, long j3, eu1 eu1Var) {
        p80.m3860e(str2);
        p80.m3860e(str3);
        p80.m3863h(eu1Var);
        this.f992a = str2;
        this.f993b = str3;
        this.f994c = true == TextUtils.isEmpty(str) ? null : str;
        this.f995d = j;
        this.f996e = j2;
        this.f997f = j3;
        if (j3 != 0 && j3 > j) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5314c(ky1.m3106I(str2), ky1.m3106I(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f998g = eu1Var;
    }
}

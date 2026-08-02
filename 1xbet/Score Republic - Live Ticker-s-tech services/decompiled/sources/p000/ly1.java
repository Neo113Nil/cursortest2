package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 {

    /* JADX INFO: renamed from: a */
    public final String f4923a;

    /* JADX INFO: renamed from: b */
    public final String f4924b;

    /* JADX INFO: renamed from: c */
    public final long f4925c;

    /* JADX INFO: renamed from: d */
    public final long f4926d;

    /* JADX INFO: renamed from: e */
    public final Bundle f4927e;

    public ly1(long j, long j2, Bundle bundle, String str, String str2) {
        this.f4923a = str;
        this.f4924b = str2;
        this.f4927e = bundle;
        this.f4925c = j;
        this.f4926d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static ly1 m3292a(fu1 fu1Var) {
        String str = fu1Var.f2501j;
        String str2 = fu1Var.f2503l;
        return new ly1(fu1Var.f2504m, fu1Var.f2505n, fu1Var.f2502k.m1507e(), str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final fu1 m3293b() {
        eu1 eu1Var = new eu1(new Bundle(this.f4927e));
        return new fu1(this.f4923a, eu1Var, this.f4924b, this.f4925c, this.f4926d);
    }

    public final String toString() {
        String string = this.f4927e.toString();
        String str = this.f4924b;
        int length = String.valueOf(str).length();
        String str2 = this.f4923a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return AbstractC0024an.m285h(sb, ",params=", string);
    }
}

package p000;

import java.util.Random;

/* JADX INFO: renamed from: py */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598py {

    /* JADX INFO: renamed from: a */
    public Random f6283a;

    /* JADX INFO: renamed from: b */
    public long f6284b;

    /* JADX INFO: renamed from: c */
    public double f6285c;

    /* JADX INFO: renamed from: d */
    public double f6286d;

    /* JADX INFO: renamed from: e */
    public long f6287e;

    /* JADX INFO: renamed from: a */
    public final long m4006a() {
        long j = this.f6287e;
        double d = j;
        this.f6287e = Math.min((long) (this.f6285c * d), this.f6284b);
        double d2 = this.f6286d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        a90.m123g(d4 >= d3);
        return j + ((long) ((this.f6283a.nextDouble() * (d4 - d3)) + d3));
    }
}

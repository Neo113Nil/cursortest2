package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class TE {

    /* renamed from: a, reason: collision with root package name */
    public final String f11636a;

    /* renamed from: b, reason: collision with root package name */
    public int f11637b;

    /* renamed from: c, reason: collision with root package name */
    public long f11638c;

    /* renamed from: d, reason: collision with root package name */
    public final C1603tG f11639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11640e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UE f11641g;

    public TE(UE ue, String str, int i, C1603tG c1603tG) {
        this.f11641g = ue;
        this.f11636a = str;
        this.f11637b = i;
        this.f11638c = c1603tG == null ? -1L : c1603tG.f15682d;
        if (c1603tG == null || !c1603tG.b()) {
            return;
        }
        this.f11639d = c1603tG;
    }

    public final boolean a(OE oe) {
        C1603tG c1603tG = oe.f10944d;
        if (c1603tG == null) {
            return this.f11637b != oe.f10943c;
        }
        long j5 = this.f11638c;
        if (j5 == -1) {
            return false;
        }
        if (c1603tG.f15682d > j5) {
            return true;
        }
        C1603tG c1603tG2 = this.f11639d;
        if (c1603tG2 == null) {
            return false;
        }
        AbstractC0715Xa abstractC0715Xa = oe.f10942b;
        int a5 = abstractC0715Xa.a(c1603tG.f15679a);
        int a6 = abstractC0715Xa.a(c1603tG2.f15679a);
        if (c1603tG.f15682d < c1603tG2.f15682d || a5 < a6) {
            return false;
        }
        if (a5 > a6) {
            return true;
        }
        boolean b3 = c1603tG.b();
        int i = c1603tG2.f15680b;
        if (!b3) {
            int i5 = c1603tG.f15683e;
            return i5 == -1 || i5 > i;
        }
        int i6 = c1603tG.f15680b;
        if (i6 > i) {
            return true;
        }
        if (i6 == i) {
            return c1603tG.f15681c > c1603tG2.f15681c;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.c()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(AbstractC0715Xa abstractC0715Xa, AbstractC0715Xa abstractC0715Xa2) {
        C1603tG c1603tG;
        int i = this.f11637b;
        if (i < abstractC0715Xa.c()) {
            UE ue = this.f11641g;
            abstractC0715Xa.e(i, ue.f11761a, 0L);
            C0603Ha c0603Ha = ue.f11761a;
            for (int i5 = c0603Ha.f9405k; i5 <= c0603Ha.f9406l; i5++) {
                int a5 = abstractC0715Xa2.a(abstractC0715Xa.f(i5));
                if (a5 != -1) {
                    i = abstractC0715Xa2.d(a5, ue.f11762b, false).f16290c;
                    break;
                }
            }
            i = -1;
        }
        this.f11637b = i;
        return i != -1 && ((c1603tG = this.f11639d) == null || abstractC0715Xa2.a(c1603tG.f15679a) != -1);
    }
}

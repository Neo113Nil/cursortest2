package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963f3 implements InterfaceC1008g3 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f13426m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f13427n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final HG f13428a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0737a0 f13429b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.h f13430c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13431d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13432e;
    public final C1617tm f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13433g;

    /* renamed from: h, reason: collision with root package name */
    public final C1407p f13434h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f13435j;

    /* renamed from: k, reason: collision with root package name */
    public int f13436k;

    /* renamed from: l, reason: collision with root package name */
    public long f13437l;

    public C0963f3(HG hg, InterfaceC0737a0 interfaceC0737a0, P0.h hVar) {
        this.f13428a = hg;
        this.f13429b = interfaceC0737a0;
        this.f13430c = hVar;
        int i = hVar.f4652m;
        int max = Math.max(1, i / 10);
        this.f13433g = max;
        C1617tm c1617tm = new C1617tm((byte[]) hVar.f4655p);
        c1617tm.t();
        int t5 = c1617tm.t();
        this.f13431d = t5;
        int i5 = hVar.f4651l;
        int i6 = hVar.f4653n;
        int i7 = (((i6 - (i5 * 4)) * 8) / (hVar.f4654o * i5)) + 1;
        if (t5 != i7) {
            throw B7.a(null, "Expected frames per block: " + i7 + "; got: " + t5);
        }
        int i8 = AbstractC1260lo.f14419a;
        int i9 = ((max + t5) - 1) / t5;
        this.f13432e = new byte[i9 * i6];
        this.f = new C1617tm((t5 + t5) * i5 * i9);
        int i10 = ((i6 * i) * 8) / t5;
        C1649uH c1649uH = new C1649uH();
        c1649uH.c("audio/raw");
        c1649uH.f15844g = i10;
        c1649uH.f15845h = i10;
        c1649uH.f15849m = (max + max) * i5;
        c1649uH.f15831A = i5;
        c1649uH.f15832B = i;
        c1649uH.f15833C = 2;
        this.f13434h = new C1407p(c1649uH);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    public final void a(long j5) {
        this.i = 0;
        this.f13435j = j5;
        this.f13436k = 0;
        this.f13437l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    public final void b(int i, long j5) {
        this.f13428a.x(new C1186k3(this.f13430c, this.f13431d, i, j5));
        this.f13429b.e(this.f13434h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0025->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC1008g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(com.google.android.gms.internal.ads.B r25, long r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0963f3.c(com.google.android.gms.internal.ads.B, long):boolean");
    }

    public final void d(int i) {
        P0.h hVar = this.f13430c;
        long u5 = this.f13435j + AbstractC1260lo.u(this.f13437l, 1000000L, hVar.f4652m, RoundingMode.DOWN);
        int i5 = (i + i) * hVar.f4651l;
        this.f13429b.d(u5, 1, i5, this.f13436k - i5, null);
        this.f13437l += i;
        this.f13436k -= i5;
    }
}

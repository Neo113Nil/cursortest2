package Q1;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import F1.m;
import F1.v;
import com.google.android.exoplayer2.Format$Builder;
import v2.t;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5757m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5758n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final m f5759a;

    /* renamed from: b, reason: collision with root package name */
    public final v f5760b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.e f5761c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5762d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5763e;

    /* renamed from: f, reason: collision with root package name */
    public final C0095a f5764f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5765g;

    /* renamed from: h, reason: collision with root package name */
    public final X f5766h;

    /* renamed from: i, reason: collision with root package name */
    public int f5767i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f5768k;

    /* renamed from: l, reason: collision with root package name */
    public long f5769l;

    public a(m mVar, v vVar, N1.e eVar) {
        this.f5759a = mVar;
        this.f5760b = vVar;
        this.f5761c = eVar;
        int i7 = eVar.f4647b;
        int max = Math.max(1, i7 / 10);
        this.f5765g = max;
        byte[] bArr = (byte[]) eVar.f4650e;
        int length = bArr.length;
        byte b7 = bArr[0];
        byte b8 = bArr[1];
        int i8 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f5762d = i8;
        int i9 = eVar.f4646a;
        int i10 = eVar.f4648c;
        int i11 = (((i10 - (i9 * 4)) * 8) / (eVar.f4649d * i9)) + 1;
        if (i8 != i11) {
            throw C0045t0.a(null, "Expected frames per block: " + i11 + "; got: " + i8);
        }
        int g3 = t.g(max, i8);
        this.f5763e = new byte[g3 * i10];
        this.f5764f = new C0095a(i8 * 2 * i9 * g3);
        int i12 = ((i10 * i7) * 8) / i8;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/raw";
        format$Builder.f10533f = i12;
        format$Builder.f10534g = i12;
        format$Builder.f10538l = max * 2 * i9;
        format$Builder.f10550x = i9;
        format$Builder.f10551y = i7;
        format$Builder.f10552z = 2;
        this.f5766h = new X(format$Builder);
    }

    @Override // Q1.b
    public final void a(long j) {
        this.f5767i = 0;
        this.j = j;
        this.f5768k = 0;
        this.f5769l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(F1.h r26, long r27) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.b(F1.h, long):boolean");
    }

    @Override // Q1.b
    public final void c(int i7, long j) {
        this.f5759a.m(new f(this.f5761c, this.f5762d, i7, j));
        this.f5760b.a(this.f5766h);
    }

    public final void d(int i7) {
        long j = this.j;
        long j3 = this.f5769l;
        N1.e eVar = this.f5761c;
        long K7 = j + t.K(j3, 1000000L, eVar.f4647b);
        int i8 = i7 * 2 * eVar.f4646a;
        this.f5760b.e(K7, 1, i8, this.f5768k - i8, null);
        this.f5769l += i7;
        this.f5768k -= i8;
    }
}

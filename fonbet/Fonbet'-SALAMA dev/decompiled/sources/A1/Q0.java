package A1;

import E3.AbstractC0167z;
import E3.C0165x;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class Q0 implements InterfaceC0027k {

    /* renamed from: I, reason: collision with root package name */
    public static final Object f200I = new Object();

    /* renamed from: J, reason: collision with root package name */
    public static final Object f201J = new Object();

    /* renamed from: K, reason: collision with root package name */
    public static final C0022h0 f202K;

    /* renamed from: A, reason: collision with root package name */
    public boolean f203A;

    /* renamed from: B, reason: collision with root package name */
    public C0014d0 f204B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f205C;

    /* renamed from: D, reason: collision with root package name */
    public long f206D;

    /* renamed from: E, reason: collision with root package name */
    public long f207E;

    /* renamed from: F, reason: collision with root package name */
    public int f208F;

    /* renamed from: G, reason: collision with root package name */
    public int f209G;

    /* renamed from: H, reason: collision with root package name */
    public long f210H;

    /* renamed from: b, reason: collision with root package name */
    public Object f212b;

    /* renamed from: d, reason: collision with root package name */
    public Object f214d;

    /* renamed from: e, reason: collision with root package name */
    public long f215e;

    /* renamed from: f, reason: collision with root package name */
    public long f216f;

    /* renamed from: x, reason: collision with root package name */
    public long f217x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f218y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f219z;

    /* renamed from: a, reason: collision with root package name */
    public Object f211a = f200I;

    /* renamed from: c, reason: collision with root package name */
    public C0022h0 f213c = f202K;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        E3.L l7 = E3.L.f2000e;
        List emptyList = Collections.emptyList();
        E3.L l8 = E3.L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        f202K = new C0022h0("com.google.android.exoplayer2.Timeline", new C0012c0(c0008a0), uri != null ? new C0016e0(uri, null, null, emptyList, l8, null) : null, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f0);
    }

    public final boolean a() {
        AbstractC1664a.h(this.f203A == (this.f204B != null));
        return this.f204B != null;
    }

    public final void b(Object obj, C0022h0 c0022h0, Object obj2, long j, long j3, long j7, boolean z4, boolean z7, C0014d0 c0014d0, long j8, long j9, int i7, int i8, long j10) {
        C0016e0 c0016e0;
        this.f211a = obj;
        this.f213c = c0022h0 != null ? c0022h0 : f202K;
        if (c0022h0 != null && (c0016e0 = c0022h0.f367b) != null) {
            String str = c0016e0.f349e;
        }
        this.f214d = obj2;
        this.f215e = j;
        this.f216f = j3;
        this.f217x = j7;
        this.f218y = z4;
        this.f219z = z7;
        this.f203A = c0014d0 != null;
        this.f204B = c0014d0;
        this.f206D = j8;
        this.f207E = j9;
        this.f208F = i7;
        this.f209G = i8;
        this.f210H = j10;
        this.f205C = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Q0.class.equals(obj.getClass())) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return v2.t.a(this.f211a, q02.f211a) && v2.t.a(this.f213c, q02.f213c) && v2.t.a(this.f214d, q02.f214d) && v2.t.a(this.f204B, q02.f204B) && this.f215e == q02.f215e && this.f216f == q02.f216f && this.f217x == q02.f217x && this.f218y == q02.f218y && this.f219z == q02.f219z && this.f205C == q02.f205C && this.f206D == q02.f206D && this.f207E == q02.f207E && this.f208F == q02.f208F && this.f209G == q02.f209G && this.f210H == q02.f210H;
    }

    public final int hashCode() {
        int hashCode = (this.f213c.hashCode() + ((this.f211a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f214d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0014d0 c0014d0 = this.f204B;
        int hashCode3 = (hashCode2 + (c0014d0 != null ? c0014d0.hashCode() : 0)) * 31;
        long j = this.f215e;
        int i7 = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f216f;
        int i8 = (i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f217x;
        int i9 = (((((((i8 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f218y ? 1 : 0)) * 31) + (this.f219z ? 1 : 0)) * 31) + (this.f205C ? 1 : 0)) * 31;
        long j8 = this.f206D;
        int i10 = (i9 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f207E;
        int i11 = (((((i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f208F) * 31) + this.f209G) * 31;
        long j10 = this.f210H;
        return i11 + ((int) (j10 ^ (j10 >>> 32)));
    }
}

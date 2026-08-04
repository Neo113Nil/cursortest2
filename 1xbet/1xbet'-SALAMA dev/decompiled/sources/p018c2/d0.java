package p018c2;

import A1.C0008a0;
import A1.C0014d0;
import A1.C0016e0;
import A1.C0018f0;
import A1.C0022h0;
import A1.C0026j0;
import A1.P0;
import A1.Q0;
import A1.R0;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p024d2.b;
import p151v2.a;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends R0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Object f10323E = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f10324A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1009l0 f10325B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0022h0 f10326C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0014d0 f10327D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10332f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f10333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f10334y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10335z;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        L l7 = L.f2000e;
        List listEmptyList = Collections.emptyList();
        L l8 = L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0016e0(uri, null, null, listEmptyList, l8, null);
        }
        c0008a0.a();
        C0026j0 c0026j0 = C0026j0.f414X;
    }

    public d0(long j, long j3, long j7, long j8, long j9, long j10, boolean z4, boolean z7, boolean z8, C1009l0 c1009l0, C0022h0 c0022h0, C0014d0 c0014d0) {
        this.f10328b = j;
        this.f10329c = j3;
        this.f10330d = j7;
        this.f10331e = j8;
        this.f10332f = j9;
        this.f10333x = j10;
        this.f10334y = z4;
        this.f10335z = z7;
        this.f10324A = z8;
        this.f10325B = c1009l0;
        c0022h0.getClass();
        this.f10326C = c0022h0;
        this.f10327D = c0014d0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        return f10323E.equals(obj) ? 0 : -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        a.g(i7, 1);
        Object obj = z4 ? f10323E : null;
        long j = -this.f10332f;
        p5.getClass();
        p5.h(null, obj, 0, this.f10330d, j, b.f12387f, false);
        return p5;
    }

    @Override // A1.R0
    public final int h() {
        return 1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        a.g(i7, 1);
        return f10323E;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        long j3;
        a.g(i7, 1);
        long j7 = this.f10333x;
        boolean z4 = this.f10335z;
        if (!z4 || this.f10324A || j == 0) {
            j3 = j7;
        } else {
            long j8 = this.f10331e;
            if (j8 != -9223372036854775807L) {
                j7 += j;
                if (j7 <= j8) {
                    j3 = j7;
                }
            }
            j3 = -9223372036854775807L;
        }
        q1.b(Q0.f200I, this.f10326C, this.f10325B, this.f10328b, this.f10329c, -9223372036854775807L, this.f10334y, z4, this.f10327D, j3, this.f10331e, 0, 0, this.f10332f);
        return q1;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}

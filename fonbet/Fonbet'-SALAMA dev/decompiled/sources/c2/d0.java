package c2;

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
import android.net.Uri;
import d2.C0959b;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;
import w1.C1718l0;

/* loaded from: classes.dex */
public final class d0 extends R0 {

    /* renamed from: E, reason: collision with root package name */
    public static final Object f10323E = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f10324A;

    /* renamed from: B, reason: collision with root package name */
    public final C1718l0 f10325B;

    /* renamed from: C, reason: collision with root package name */
    public final C0022h0 f10326C;

    /* renamed from: D, reason: collision with root package name */
    public final C0014d0 f10327D;

    /* renamed from: b, reason: collision with root package name */
    public final long f10328b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10329c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10330d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10331e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10332f;

    /* renamed from: x, reason: collision with root package name */
    public final long f10333x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10334y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10335z;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        E3.L l7 = E3.L.f2000e;
        List emptyList = Collections.emptyList();
        E3.L l8 = E3.L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0016e0(uri, null, null, emptyList, l8, null);
        }
        c0008a0.a();
        C0026j0 c0026j0 = C0026j0.f414X;
    }

    public d0(long j, long j3, long j7, long j8, long j9, long j10, boolean z4, boolean z7, boolean z8, C1718l0 c1718l0, C0022h0 c0022h0, C0014d0 c0014d0) {
        this.f10328b = j;
        this.f10329c = j3;
        this.f10330d = j7;
        this.f10331e = j8;
        this.f10332f = j9;
        this.f10333x = j10;
        this.f10334y = z4;
        this.f10335z = z7;
        this.f10324A = z8;
        this.f10325B = c1718l0;
        c0022h0.getClass();
        this.f10326C = c0022h0;
        this.f10327D = c0014d0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        return f10323E.equals(obj) ? 0 : -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        AbstractC1664a.g(i7, 1);
        Object obj = z4 ? f10323E : null;
        long j = -this.f10332f;
        p02.getClass();
        p02.h(null, obj, 0, this.f10330d, j, C0959b.f12381f, false);
        return p02;
    }

    @Override // A1.R0
    public final int h() {
        return 1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        AbstractC1664a.g(i7, 1);
        return f10323E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // A1.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q0 m(int i7, Q0 q02, long j) {
        long j3;
        AbstractC1664a.g(i7, 1);
        long j7 = this.f10333x;
        boolean z4 = this.f10335z;
        if (z4 && !this.f10324A && j != 0) {
            long j8 = this.f10331e;
            if (j8 != -9223372036854775807L) {
                j7 += j;
            }
            j3 = -9223372036854775807L;
            q02.b(Q0.f200I, this.f10326C, this.f10325B, this.f10328b, this.f10329c, -9223372036854775807L, this.f10334y, z4, this.f10327D, j3, this.f10331e, 0, 0, this.f10332f);
            return q02;
        }
        j3 = j7;
        q02.b(Q0.f200I, this.f10326C, this.f10325B, this.f10328b, this.f10329c, -9223372036854775807L, this.f10334y, z4, this.f10327D, j3, this.f10331e, 0, 0, this.f10332f);
        return q02;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}

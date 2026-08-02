package M4;

import L4.C;
import W3.o;
import java.io.IOException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;

/* loaded from: classes.dex */
public final class i extends m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f3655l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3656m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f3657n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f3658o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f3659p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f3660q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f3661r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f3662s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f3663t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, long j5, v vVar, C c5, v vVar2, v vVar3, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f3655l = sVar;
        this.f3656m = j5;
        this.f3657n = vVar;
        this.f3658o = c5;
        this.f3659p = vVar2;
        this.f3660q = vVar3;
        this.f3661r = wVar;
        this.f3662s = wVar2;
        this.f3663t = wVar3;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C c5 = this.f3658o;
        if (intValue == 1) {
            s sVar = this.f3655l;
            if (sVar.f17620k) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            sVar.f17620k = true;
            if (longValue < this.f3656m) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            v vVar = this.f3657n;
            long j5 = vVar.f17623k;
            if (j5 == 4294967295L) {
                j5 = c5.l();
            }
            vVar.f17623k = j5;
            v vVar2 = this.f3659p;
            vVar2.f17623k = vVar2.f17623k == 4294967295L ? c5.l() : 0L;
            v vVar3 = this.f3660q;
            vVar3.f17623k = vVar3.f17623k == 4294967295L ? c5.l() : 0L;
        } else if (intValue == 10) {
            if (longValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c5.t(4L);
            b.e(c5, (int) (longValue - 4), new h(this.f3661r, c5, this.f3662s, this.f3663t));
        }
        return o.f6046a;
    }
}

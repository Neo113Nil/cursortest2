package M4;

import B.A;
import L4.C;
import P.AbstractC0329z;
import P.C0315s;
import W3.o;
import b0.p;
import java.io.IOException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import m4.InterfaceC2104g;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class h extends m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3650l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3652n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3653o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3654p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C c5, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f3651m = c5;
        this.f3652n = wVar;
        this.f3653o = wVar2;
        this.f3654p = wVar3;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3650l) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 1) {
                    w wVar = (w) this.f3652n;
                    if (wVar.f17624k != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C c5 = (C) this.f3651m;
                    wVar.f17624k = Long.valueOf(c5.l());
                    ((w) this.f3653o).f17624k = Long.valueOf(c5.l());
                    ((w) this.f3654p).f17624k = Long.valueOf(c5.l());
                }
                return o.f6046a;
            case 1:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C c6 = (C) this.f3651m;
                    byte f = c6.f();
                    boolean z3 = (f & 1) == 1;
                    boolean z5 = (f & 2) == 2;
                    boolean z6 = (f & 4) == 4;
                    long j5 = z3 ? 5L : 1L;
                    if (z5) {
                        j5 += 4;
                    }
                    if (z6) {
                        j5 += 4;
                    }
                    if (longValue2 < j5) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z3) {
                        ((w) this.f3652n).f17624k = Integer.valueOf(c6.k());
                    }
                    if (z5) {
                        ((w) this.f3653o).f17624k = Integer.valueOf(c6.k());
                    }
                    if (z6) {
                        ((w) this.f3654p).f17624k = Integer.valueOf(c6.k());
                    }
                }
                return o.f6046a;
            default:
                ((Number) obj2).intValue();
                AbstractC2346c.b((InterfaceC2104g) this.f3652n, (p) this.f3653o, (A) this.f3654p, (i4.e) this.f3651m, (C0315s) obj, AbstractC0329z.B(1));
                return o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w wVar, C c5, w wVar2, w wVar3) {
        super(2);
        this.f3652n = wVar;
        this.f3651m = c5;
        this.f3653o = wVar2;
        this.f3654p = wVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC2104g interfaceC2104g, p pVar, A a5, i4.e eVar, int i) {
        super(2);
        this.f3652n = interfaceC2104g;
        this.f3653o = pVar;
        this.f3654p = a5;
        this.f3651m = eVar;
    }
}

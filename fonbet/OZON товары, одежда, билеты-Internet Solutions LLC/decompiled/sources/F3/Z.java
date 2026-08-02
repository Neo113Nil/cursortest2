package F3;

import F3.F;
import F3.InterfaceC3018x;
import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import j3.C7275q;
import p3.InterfaceC8846f;
import p3.i;

@Deprecated
/* loaded from: classes8.dex */
public final class Z extends AbstractC2996a {

    /* renamed from: a, reason: collision with root package name */
    private final p3.i f8610a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f.a f8611b;

    /* renamed from: c, reason: collision with root package name */
    private final C7272n f8612c;

    /* renamed from: e, reason: collision with root package name */
    private final J3.i f8614e;

    /* renamed from: g, reason: collision with root package name */
    private final X f8616g;

    /* renamed from: h, reason: collision with root package name */
    private final C7275q f8617h;

    /* renamed from: i, reason: collision with root package name */
    private p3.z f8618i;

    /* renamed from: d, reason: collision with root package name */
    private final long f8613d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8615f = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8846f.a f8619a;

        /* renamed from: b, reason: collision with root package name */
        private J3.i f8620b;

        public a(InterfaceC8846f.a aVar) {
            aVar.getClass();
            this.f8619a = aVar;
            this.f8620b = new J3.h();
        }

        public final Z a(C7275q.i iVar) {
            return new Z(iVar, this.f8619a, this.f8620b);
        }
    }

    Z(C7275q.i iVar, InterfaceC8846f.a aVar, J3.i iVar2) {
        this.f8611b = aVar;
        this.f8614e = iVar2;
        C7275q.a aVar2 = new C7275q.a();
        aVar2.i(Uri.EMPTY);
        aVar2.d(iVar.f69249a.toString());
        aVar2.g(AbstractC5880y.B(iVar));
        aVar2.h(null);
        C7275q a11 = aVar2.a();
        this.f8617h = a11;
        C7272n.a aVar3 = new C7272n.a();
        aVar3.y0((String) O7.g.a(iVar.f69250b, "text/x-unknown"));
        aVar3.n0(iVar.f69251c);
        aVar3.A0(iVar.f69252d);
        aVar3.w0(iVar.f69253e);
        aVar3.l0(iVar.f69254f);
        String str = iVar.f69255g;
        aVar3.j0(str != null ? str : null);
        this.f8612c = aVar3.P();
        i.a aVar4 = new i.a();
        aVar4.i(iVar.f69249a);
        aVar4.b(1);
        this.f8610a = aVar4.a();
        this.f8616g = new X(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, a11, null);
    }

    @Override // F3.InterfaceC3018x
    public final InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        p3.z zVar = this.f8618i;
        F.a createEventDispatcher = createEventDispatcher(bVar);
        return new Y(this.f8610a, this.f8611b, zVar, this.f8612c, this.f8613d, this.f8614e, createEventDispatcher, this.f8615f, null);
    }

    @Override // F3.InterfaceC3018x
    public final C7275q getMediaItem() {
        return this.f8617h;
    }

    @Override // F3.InterfaceC3018x
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // F3.AbstractC2996a
    protected final void prepareSourceInternal(p3.z zVar) {
        this.f8618i = zVar;
        refreshSourceInfo(this.f8616g);
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ((Y) interfaceC3017w).f8598i.k(null);
    }

    @Override // F3.AbstractC2996a
    protected final void releaseSourceInternal() {
    }
}

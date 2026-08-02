package X40;

import Sc.s;
import j3.y;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.H0;
import xe.M;
import xe.N;
import xe.Y;

@e(c = "ru.ozon.fintech.features.cbottomonboarding.picplayer.PicPlayer$startTimer$1", f = "PicPlayer.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34068d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f34069e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f34070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f34070f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f34070f, dVar);
        bVar.f34069e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        y.c cVar;
        B0 b02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34068d;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.f34069e;
            if (N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f34069e;
            s.b(obj);
            c cVar2 = this.f34070f;
            cVar2.o(cVar2.e() + 20);
            U40.c.a("PicPlayer", "timer currentPosition=" + cVar2.e());
            if (cVar2.e() > cVar2.f()) {
                cVar = cVar2.f34075e;
                if (cVar != null) {
                    cVar.onPlaybackStateChanged(4);
                }
                b02 = cVar2.f34076f;
                if (b02 != null) {
                    ((H0) b02).j(null);
                }
            }
            if (N.f(m11)) {
                this.f34069e = m11;
                this.f34068d = 1;
                if (Y.b(20L, this) == aVar) {
                    return aVar;
                }
                c cVar22 = this.f34070f;
                cVar22.o(cVar22.e() + 20);
                U40.c.a("PicPlayer", "timer currentPosition=" + cVar22.e());
                if (cVar22.e() > cVar22.f()) {
                }
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }
}

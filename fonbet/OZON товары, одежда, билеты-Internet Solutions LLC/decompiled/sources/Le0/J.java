package Le0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.maplibre.android.maps.MapView;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$onDidFinishRenderingFrameFlow$1", f = "LibreTilesController.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class J extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16896d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f16897e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f16898f;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f16899b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f16900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, b bVar) {
            super(0);
            this.f16899b = wVar;
            this.f16900c = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f16899b.removeOnDidFinishRenderingFrameListener(this.f16900c);
            return Unit.f71690a;
        }
    }

    public static final class b implements MapView.OnDidFinishRenderingFrameListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ze.u<Boolean> f16901a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ze.u<? super Boolean> uVar) {
            this.f16901a = uVar;
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFinishRenderingFrameListener
        public final void a(boolean z11) {
            this.f16901a.b(Boolean.valueOf(z11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(w wVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f16898f = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        J j11 = new J(this.f16898f, dVar);
        j11.f16897e = obj;
        return j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((J) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16896d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.u uVar = (ze.u) this.f16897e;
            b bVar = new b(uVar);
            w wVar = this.f16898f;
            wVar.addOnDidFinishRenderingFrameListener(bVar);
            a aVar2 = new a(wVar, bVar);
            this.f16896d = 1;
            if (ze.s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}

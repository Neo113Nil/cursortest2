package Mc0;

import Ae.C2417s0;
import Ae.InterfaceC2397i;
import Jb0.C3385c;
import Nc0.g;
import Sc.s;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import td0.q;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$$inlined$collectFlow$1", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17835d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2417s0 f17836e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17837f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17838g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3385c f17839a;

        public a(AuthFlowActivity authFlowActivity, C3385c c3385c) {
            this.f17839a = c3385c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            g.a aVar = (g.a) t2;
            int i11 = AuthFlowActivity.f97290u;
            boolean a11 = aVar.a();
            C3385c c3385c = this.f17839a;
            AppCompatImageView backButton = c3385c.f14401b;
            if (a11) {
                Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
                q.a(backButton, 1, 0L);
            } else {
                Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
                q.b(1, backButton);
            }
            boolean b11 = aVar.b();
            AppCompatImageView closeFlowButton = c3385c.f14402c;
            if (b11) {
                Intrinsics.checkNotNullExpressionValue(closeFlowButton, "closeFlowButton");
                q.a(closeFlowButton, 1, 0L);
            } else {
                Intrinsics.checkNotNullExpressionValue(closeFlowButton, "closeFlowButton");
                q.b(1, closeFlowButton);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C2417s0 c2417s0, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
        super(2, dVar);
        this.f17836e = c2417s0;
        this.f17837f = authFlowActivity;
        this.f17838g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f17836e, dVar, this.f17837f, this.f17838g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17835d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17837f, this.f17838g);
            this.f17835d = 1;
            if (this.f17836e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}

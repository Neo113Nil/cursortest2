package Mc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.C3385c;
import Sc.s;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$lambda$11$$inlined$collectFlow$3", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17856d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f17857e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17858f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17859g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3385c f17860a;

        public a(AuthFlowActivity authFlowActivity, C3385c c3385c) {
            this.f17860a = c3385c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            String str = (String) t2;
            int i11 = AuthFlowActivity.f97290u;
            C3385c c3385c = this.f17860a;
            if (str == null) {
                str = c3385c.a().getContext().getString(R.string.ozonid_error_technical_error_title);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            View rootView = c3385c.a().getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                Qc0.a.e(new Qc0.a(), str, viewGroup);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
        super(2, dVar);
        this.f17857e = interfaceC2395h;
        this.f17858f = authFlowActivity;
        this.f17859g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f17857e, dVar, this.f17858f, this.f17859g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17856d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17858f, this.f17859g);
            this.f17856d = 1;
            if (this.f17857e.collect(aVar2, this) == aVar) {
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

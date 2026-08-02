package X10;

import Sc.s;
import X10.e;
import a00.C4908c;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4908c f33951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RecyclerView f33952b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final He.c f33953c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final J<B0> f33954d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.widget.async.AsyncViewCreatorImpl$create$1", f = "AsyncViewCreator.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: X10.a$a, reason: collision with other inner class name */
    static final class C0601a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33955d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<ViewGroup, View> f33956e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f33957f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<View, Unit> f33958g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.widget.async.AsyncViewCreatorImpl$create$1$1", f = "AsyncViewCreator.kt", l = {}, m = "invokeSuspend")
        /* renamed from: X10.a$a$a, reason: collision with other inner class name */
        static final class C0602a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<View, Unit> f33959d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ View f33960e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0602a(Function1<? super View, Unit> function1, View view, kotlin.coroutines.d<? super C0602a> dVar) {
                super(2, dVar);
                this.f33959d = function1;
                this.f33960e = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0602a(this.f33959d, this.f33960e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0602a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f33959d.invoke(this.f33960e);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0601a(Function1<? super ViewGroup, ? extends View> function1, a aVar, Function1<? super View, Unit> function12, kotlin.coroutines.d<? super C0601a> dVar) {
            super(2, dVar);
            this.f33956e = function1;
            this.f33957f = aVar;
            this.f33958g = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C0601a(this.f33956e, this.f33957f, this.f33958g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0601a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f33955d;
            if (i11 == 0) {
                s.b(obj);
                View view = (View) ((e.a) this.f33956e).invoke(this.f33957f.f33952b);
                if (view == null) {
                    return Unit.f71690a;
                }
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                C0602a c0602a = new C0602a(this.f33958g, view, null);
                this.f33955d = 1;
                if (C10727i.f(l02, c0602a, this) == aVar) {
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

    public a(C4908c lifecycleOwner, RecyclerView parent) {
        He.c defaultDispatcher = C10720e0.a();
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.f33951a = lifecycleOwner;
        this.f33952b = parent;
        this.f33953c = defaultDispatcher;
        this.f33954d = new J<>((Object) null);
    }

    public final void b() {
        J<B0> j11 = this.f33954d;
        Object[] objArr = j11.f38646a;
        int i11 = j11.f38647b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((B0) objArr[i12]).j(null);
        }
        j11.c();
    }

    public final void c(@NotNull Function1<? super ViewGroup, ? extends View> createView, @NotNull Function1<? super View, Unit> onViewCreated) {
        Intrinsics.checkNotNullParameter(createView, "createView");
        Intrinsics.checkNotNullParameter(onViewCreated, "onViewCreated");
        this.f33954d.b(C10727i.c(K.a(this.f33951a), this.f33953c, null, new C0601a(createView, this, onViewCreated, null), 2));
    }
}

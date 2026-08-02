package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes.dex */
public final class S<T> implements Q<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C5423j<T> f43241a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f43242b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {Logger.NONE}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43243d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S<T> f43244e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f43245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S<T> s11, T t2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f43244e = s11;
            this.f43245f = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f43244e, this.f43245f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f43243d;
            S<T> s11 = this.f43244e;
            if (i11 == 0) {
                Sc.s.b(obj);
                C5423j<T> a11 = s11.a();
                this.f43243d = 1;
                if (a11.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            s11.a().setValue(this.f43245f);
            return Unit.f71690a;
        }
    }

    public S(@NotNull C5423j<T> target, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43241a = target;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f43242b = context.plus(De.s.f6650a.x());
    }

    @NotNull
    public final C5423j<T> a() {
        return this.f43241a;
    }

    @Override // androidx.lifecycle.Q
    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(this.f43242b, new a(this, t2, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}

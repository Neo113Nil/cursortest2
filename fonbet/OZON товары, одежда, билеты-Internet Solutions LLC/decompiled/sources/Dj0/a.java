package Dj0;

import Sc.r;
import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2", f = "Coroutines.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6740d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f6741e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object>[] f6742f;

    @e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2$1$1", f = "Coroutines.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: Dj0.a$a, reason: collision with other inner class name */
    public static final class C0146a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6743d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f6744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f6745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0146a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C0146a> dVar) {
            super(2, dVar);
            this.f6745f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0146a c0146a = new C0146a(this.f6745f, dVar);
            c0146a.f6744e = obj;
            return c0146a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0146a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6743d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f6745f;
                    r.Companion companion = r.INSTANCE;
                    this.f6743d = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Unit unit = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = r.INSTANCE;
                s.a(th2);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>[] function1Arr, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f6742f = function1Arr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        a aVar = new a(this.f6742f, dVar);
        aVar.f6741e = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6740d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f6741e;
            Function1<kotlin.coroutines.d<? super Unit>, Object>[] function1Arr = this.f6742f;
            ArrayList arrayList = new ArrayList(function1Arr.length);
            for (Function1<kotlin.coroutines.d<? super Unit>, Object> function1 : function1Arr) {
                arrayList.add(C10727i.c(m11, null, null, new C0146a(function1, null), 3));
            }
            this.f6740d = 1;
            if (C10721f.c(arrayList, this) == aVar) {
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

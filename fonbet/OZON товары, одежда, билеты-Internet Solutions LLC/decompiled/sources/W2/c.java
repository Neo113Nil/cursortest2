package W2;

import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements InterfaceC3917k<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<f> f33204a;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<f, kotlin.coroutines.d<? super f>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33205d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33206e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f33207f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super f, ? super kotlin.coroutines.d<? super f>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f33207f = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f33207f, dVar);
            aVar.f33206e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(f fVar, kotlin.coroutines.d<? super f> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f33205d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = (f) this.f33206e;
                this.f33205d = 1;
                obj = this.f33207f.invoke(fVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.g(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((b) fVar2).g();
            return fVar2;
        }
    }

    public c(@NotNull InterfaceC3917k<f> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33204a = delegate;
    }

    @Override // R2.InterfaceC3917k
    public final Object a(@NotNull Function2<? super f, ? super kotlin.coroutines.d<? super f>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super f> dVar) {
        return this.f33204a.a(new a(function2, null), dVar);
    }

    @Override // R2.InterfaceC3917k
    @NotNull
    public final InterfaceC2395h<f> getData() {
        return this.f33204a.getData();
    }
}

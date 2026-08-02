package W2;

import R2.InterfaceC3917k;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j {

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<f, kotlin.coroutines.d<? super f>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f33212d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33213e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f33214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f33214f = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f33214f, dVar);
            aVar.f33213e = obj;
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
            int i11 = this.f33212d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b bVar = (b) this.f33213e;
                s.b(obj);
                return bVar;
            }
            s.b(obj);
            b d11 = ((f) this.f33213e).d();
            this.f33213e = d11;
            this.f33212d = 1;
            return this.f33214f.invoke(d11, this) == aVar ? aVar : d11;
        }
    }

    public static final Object a(@NotNull InterfaceC3917k<f> interfaceC3917k, @NotNull Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super f> dVar) {
        return interfaceC3917k.a(new a(function2, null), dVar);
    }
}

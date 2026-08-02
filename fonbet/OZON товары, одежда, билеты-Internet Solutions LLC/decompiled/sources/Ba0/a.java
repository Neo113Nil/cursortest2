package Ba0;

import Ha0.b;
import Sc.s;
import android.app.Application;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kb0.EnumC7626a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mb0.C8123a;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class a extends w0 implements Ha0.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Ha0.b f3344a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ca0.d f3345b;

    @e(c = "ru.ozon.host.config.debug.menu.ComponentViewModel$1", f = "ComponentViewModel.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: Ba0.a$a, reason: collision with other inner class name */
    static final class C0078a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3346d;

        C0078a(kotlin.coroutines.d<? super C0078a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C0078a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0078a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3346d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = a.this;
                Ca0.b a02 = aVar2.a0();
                Ca0.a a11 = aVar2.f3345b.a();
                this.f3346d = 1;
                if (a02.a(a11, this) == aVar) {
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

    public a(@NotNull Application application, @NotNull Ca0.d externalActionProvider) {
        EnumC7626a enumC7626a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalActionProvider, "externalActionProvider");
        b.a a11 = Ha0.a.a();
        c.f3352a.getClass();
        InterfaceC11014a c11 = c.c();
        Fa0.a b11 = c.b();
        enumC7626a = C8123a.f74702d;
        this.f3344a = a11.a(application, c11, b11, enumC7626a);
        this.f3345b = externalActionProvider;
        C10727i.c(x0.a(this), null, null, new C0078a(null), 3);
    }

    @Override // Ha0.b
    @NotNull
    public final Ca0.b a0() {
        return this.f3344a.a0();
    }

    @Override // Ha0.b
    @NotNull
    public final Ia0.a getViewModelFactory() {
        return this.f3344a.getViewModelFactory();
    }
}

package Ng0;

import Lg0.c;
import Pg0.b;
import Sc.k;
import Sc.n;
import Sc.s;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f19562a;

    @e(c = "ru.ozon.push.dialog.internal.ProtectionAppDialogHostApiImpl$checkAndRequestProtection$1", f = "ProtectionAppDialogHostApiImpl.kt", l = {22, TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: Ng0.a$a, reason: collision with other inner class name */
    static final class C0389a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19563d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<G> f19565f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0389a(Function0<? extends G> function0, d<? super C0389a> dVar) {
            super(2, dVar);
            this.f19565f = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C0389a(this.f19565f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C0389a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
        
            if (r6.d(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19563d;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                Rg0.c l11 = a.b(aVar2).l();
                if (l11.f() == null) {
                    this.f19563d = 1;
                } else {
                    this.f19563d = 2;
                    obj = l11.h(this);
                }
                return aVar;
            }
            if (i11 == 1) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (((Boolean) obj).booleanValue()) {
                G invoke = this.f19565f.invoke();
                aVar2.getClass();
                if (!invoke.C0() && !invoke.H0()) {
                    invoke.c0();
                    if (invoke.g0("ru.ozon.push.dialog.internal.ui.ProtectionAppDialogFragment") == null) {
                        new Vg0.a().show(invoke, "ru.ozon.push.dialog.internal.ui.ProtectionAppDialogFragment");
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    public a(@NotNull Function0<b> serviceLocatorProvider) {
        Intrinsics.checkNotNullParameter(serviceLocatorProvider, "serviceLocatorProvider");
        this.f19562a = k.a(n.NONE, serviceLocatorProvider);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final b b(a aVar) {
        return (b) aVar.f19562a.getValue();
    }

    @Override // Lg0.c
    public final void a(@NotNull J viewLifecycleOwner, @NotNull Function0<? extends G> fragmentManagerProducer) {
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(fragmentManagerProducer, "fragmentManagerProducer");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new C0389a(fragmentManagerProducer, null), 3);
    }
}

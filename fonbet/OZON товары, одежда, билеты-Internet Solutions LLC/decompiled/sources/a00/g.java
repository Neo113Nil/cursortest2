package a00;

import Sc.InterfaceC4008j;
import a00.j;
import androidx.lifecycle.A0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import ed.C6345a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
final class g<VM extends w0> implements InterfaceC4008j<VM> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<VM> f36134a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<A0> f36135b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<VM> f36136c;

    /* renamed from: d, reason: collision with root package name */
    private VM f36137d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull kotlin.reflect.d<VM> viewModelClass, @NotNull Function0<? extends A0> storeProducer, @NotNull Function0<? extends VM> provider) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f36134a = viewModelClass;
        this.f36135b = storeProducer;
        this.f36136c = provider;
    }

    @Override // Sc.InterfaceC4008j
    public final Object getValue() {
        VM vm = this.f36137d;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new z0(((j.a) this.f36135b).f36139b.getViewModelStore(), new i(this.f36136c), 0).a(C6345a.b(this.f36134a));
        this.f36137d = vm2;
        return vm2;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this.f36137d != null;
    }
}

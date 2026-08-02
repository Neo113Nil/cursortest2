package androidx.lifecycle;

import Sc.InterfaceC4008j;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y0<VM extends w0> implements InterfaceC4008j<VM> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<VM> f43408a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f43409b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<z0.b> f43410c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f43411d;

    /* renamed from: e, reason: collision with root package name */
    private VM f43412e;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@NotNull kotlin.reflect.d<VM> viewModelClass, @NotNull Function0<? extends A0> storeProducer, @NotNull Function0<? extends z0.b> factoryProducer, @NotNull Function0<? extends AbstractC6409a> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f43408a = viewModelClass;
        this.f43409b = (AbstractC7737t) storeProducer;
        this.f43410c = factoryProducer;
        this.f43411d = (AbstractC7737t) extrasProducer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // Sc.InterfaceC4008j
    public final Object getValue() {
        VM vm = this.f43412e;
        if (vm != null) {
            return vm;
        }
        A0 store = (A0) this.f43409b.invoke();
        z0.b factory = this.f43410c.invoke();
        AbstractC6409a extras = (AbstractC6409a) this.f43411d.invoke();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        VM vm2 = (VM) new z0(store, factory, extras).d(this.f43408a);
        this.f43412e = vm2;
        return vm2;
    }

    @Override // Sc.InterfaceC4008j
    public final boolean isInitialized() {
        return this.f43412e != null;
    }
}

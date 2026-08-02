package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/ComputedProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "defaultComputation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ComputedValueHolder;", "defaultValueHolder", "Landroidx/compose/runtime/ComputedValueHolder;", "getDefaultValueHolder$runtime", "()Landroidx/compose/runtime/ComputedValueHolder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComputedProvidableCompositionLocal<T> extends androidx.compose.runtime.ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.ComputedValueHolder<T> defaultValueHolder;

    public ComputedProvidableCompositionLocal(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.CompositionLocalAccessorScope, ? extends T> function1) {
        super(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.ComputedProvidableCompositionLocal$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.runtime.ComputedProvidableCompositionLocal.m5242$r8$lambda$uWu9_wwZaM3cr4PlGlPiY2eJU();
            }
        });
        this.defaultValueHolder = new androidx.compose.runtime.ComputedValueHolder<>(function1);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public final androidx.compose.runtime.ComputedValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final androidx.compose.runtime.ProvidedValue<T> defaultProvidedValue$runtime(T value) {
        return new androidx.compose.runtime.ProvidedValue<>(this, value, value == null, null, null, null, true);
    }

    /* renamed from: $r8$lambda$-uWu9_wwZaM3cr4PlGlPiY2-eJU, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m5242$r8$lambda$uWu9_wwZaM3cr4PlGlPiY2eJU() {
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected call to default provider");
        throw new kotlin.KotlinNothingValueException();
    }
}

package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "Lkotlin/Function0;", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ProvidedValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "defaultValueHolder", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime", "()Landroidx/compose/runtime/ValueHolder;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "(Landroidx/compose/runtime/Composer;I)V", "current", "Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.ValueHolder<T> defaultValueHolder;

    public static /* synthetic */ void getCurrent$annotations(androidx.compose.runtime.Composer composer, int i) {
    }

    public abstract androidx.compose.runtime.ValueHolder<T> updatedStateOf$runtime(androidx.compose.runtime.ProvidedValue<T> value, androidx.compose.runtime.ValueHolder<T> previous);

    private CompositionLocal(kotlin.jvm.functions.Function0<? extends T> function0) {
        this.defaultValueHolder = new androidx.compose.runtime.LazyValueHolder(function0);
    }

    public androidx.compose.runtime.ValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    public final T getCurrent(androidx.compose.runtime.Composer composer, int i) {
        return (T) composer.consume(this);
    }

    public /* synthetic */ CompositionLocal(kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }
}

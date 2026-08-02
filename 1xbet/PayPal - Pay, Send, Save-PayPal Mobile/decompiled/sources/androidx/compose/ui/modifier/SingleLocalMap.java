package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ,\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u00102\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\n"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "forceValue$ui", "(Ljava/lang/Object;)V", "T", "set$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "get$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", "contains$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/modifier/ModifierLocal;", "p0", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleLocalMap extends androidx.compose.ui.modifier.ModifierLocalMap {
    public static final int $stable = 0;
    private final androidx.compose.ui.modifier.ModifierLocal<?> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRangesFor;

    public SingleLocalMap(androidx.compose.ui.modifier.ModifierLocal<?> modifierLocal) {
        super(null);
        this.getHighResolutionOutputSizeshNQ4ISI = modifierLocal;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.setValue(obj);
    }

    private final java.lang.Object getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public final void forceValue$ui(java.lang.Object value) {
        getHighSpeedVideoFpsRanges(value);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public final <T> void mo7494set$ui(androidx.compose.ui.modifier.ModifierLocal<T> key, T value) {
        if (key != this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getHighSpeedVideoFpsRanges(value);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final <T> T get$ui(androidx.compose.ui.modifier.ModifierLocal<T> key) {
        if (key != this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t = (T) getHighSpeedVideoFpsRangesFor();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean contains$ui(androidx.compose.ui.modifier.ModifierLocal<?> key) {
        return key == this.getHighResolutionOutputSizeshNQ4ISI;
    }
}

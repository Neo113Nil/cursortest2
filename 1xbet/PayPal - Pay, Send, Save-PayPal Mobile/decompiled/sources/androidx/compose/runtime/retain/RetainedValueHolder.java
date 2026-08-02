package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/retain/RetainedValueHolder;", "T", "Landroidx/compose/runtime/RememberObserver;", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/retain/RetainedValuesStore;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "isNewlyRetained", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/retain/RetainedValuesStore;Z)V", "newStore", "", "readoptUnder$runtime_retain", "(Landroidx/compose/runtime/retain/RetainedValuesStore;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getValue", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "p0", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "getOwner", "()Landroidx/compose/runtime/retain/RetainedValuesStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainedValueHolder<T> implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;
    private final java.lang.Object key;
    private androidx.compose.runtime.retain.RetainedValuesStore owner;
    private final T value;

    public RetainedValueHolder(java.lang.Object obj, T t, androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore, boolean z) {
        this.key = obj;
        this.value = t;
        this.getHighSpeedVideoFpsRanges = z;
        this.owner = retainedValuesStore;
        if (!(t instanceof androidx.compose.runtime.RememberObserver) || (t instanceof androidx.compose.runtime.retain.RetainObserver)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Retained a value that implements RememberObserver but not RetainObserver. To receive the correct callbacks, the retained value '");
        sb.append(t);
        sb.append("' must also implement RetainObserver.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public final T getValue() {
        return this.value;
    }

    public final androidx.compose.runtime.retain.RetainedValuesStore getOwner() {
        return this.owner;
    }

    public final void readoptUnder$runtime_retain(androidx.compose.runtime.retain.RetainedValuesStore newStore) {
        this.owner = newStore;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        T t = this.value;
        if (t instanceof androidx.compose.runtime.retain.RetainObserver) {
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = false;
                ((androidx.compose.runtime.retain.RetainObserver) t).onRetained();
            }
            ((androidx.compose.runtime.retain.RetainObserver) this.value).onEnteredComposition();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        T t = this.value;
        if (t instanceof androidx.compose.runtime.retain.RetainObserver) {
            ((androidx.compose.runtime.retain.RetainObserver) t).onExitedComposition();
        }
        this.owner.saveExitingValue(this.key, this.value);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        T t = this.value;
        if (t instanceof androidx.compose.runtime.retain.RetainObserver) {
            ((androidx.compose.runtime.retain.RetainObserver) t).onUnused();
        }
    }
}

package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0015\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR+\u0010#\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00130!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\""}, d2 = {"Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "transformedTextFieldState", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed", "", "beginBatchEdit", "()Z", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Lkotlin/ExtensionFunctionType;", "block", "edit", "(Lkotlin/jvm/functions/Function1;)V", "endBatchEdit", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getTransformedLength", "()I", "transformedLength", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultImeEditCommandScope implements androidx.compose.foundation.text.input.internal.ImeEditCommandScope {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit>> getHighSpeedVideoSizes = new androidx.compose.runtime.collection.MutableVector<>(new kotlin.jvm.functions.Function1[16], 0);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    public DefaultImeEditCommandScope(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState) {
        this.Camera2StreamConfigurationMap = transformedTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public final long mo2206mapFromTransformedGEjPoXI(long range) {
        return this.Camera2StreamConfigurationMap.m2271mapFromTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public final long mo2207mapToTransformedGEjPoXI(long range) {
        return this.Camera2StreamConfigurationMap.m2273mapToTransformedGEjPoXI(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final int getTransformedLength() {
        return this.Camera2StreamConfigurationMap.getVisualText().length();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final boolean beginBatchEdit() {
        this.getHighResolutionOutputSizeshNQ4ISI++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final void edit(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit> block) {
        beginBatchEdit();
        this.getHighSpeedVideoSizes.add(block);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public final boolean endBatchEdit() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI - 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == 0 && this.getHighSpeedVideoSizes.getSize() != 0) {
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = this.Camera2StreamConfigurationMap;
            androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
            androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
            androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit>> mutableVector = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit>[] function1Arr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                function1Arr[i2].invoke(mainBuffer);
            }
            transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
            androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, false, textFieldEditUndoBehavior);
            this.getHighSpeedVideoSizes.clear();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI > 0;
    }
}

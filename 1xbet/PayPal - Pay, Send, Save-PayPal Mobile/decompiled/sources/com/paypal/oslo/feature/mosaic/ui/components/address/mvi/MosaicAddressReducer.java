package com.paypal.oslo.feature.mosaic.ui.components.address.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicAddressReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MosaicAddressReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "MosaicAddressReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEffect>> reduce(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState state, com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 2;
        java.util.Map map = null;
        java.lang.Object[] objArr = 0;
        if (state instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial) {
            return event instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial) state, event);
        }
        if (state instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading) {
            return event instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded(((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded) event).getLayout(), map, i, objArr == true ? 1 : 0), null, 2, null) : event instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error(((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed) event).getMessage()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded)) {
            if (state instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error) {
                return event instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LoadLayout ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error) state, event);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded loaded = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded) state;
        if (event instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged) {
            com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.FieldValueChanged) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded.copy$default(loaded, null, kotlin.collections.MapsKt.plus(loaded.getFieldValues(), kotlin.TuplesKt.to(fieldValueChanged.getFieldId(), fieldValueChanged.getValue())), 1, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loaded, event);
    }
}

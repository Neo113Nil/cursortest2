package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Idle;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Idle;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Success;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Success;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Error;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Error;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AutoReloadReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.balance.common.AutoReloadConstants.ComponentNames.AUTO_RELOAD_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect>> reduce(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState state, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent event) {
        java.lang.String str;
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle) {
            return Camera2StreamConfigurationMap((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success) {
                return getHighSpeedVideoSizes((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success) state, event);
            }
            if (state instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error) {
                return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error) state, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff autoTransferTurnOff = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff) state;
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(autoTransferTurnOff, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) {
                com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess loadSuccess = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, loadSuccess.getConfig(), loadSuccess.getChoiceSheetUi()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(autoTransferTurnOff, event);
        }
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading loading = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, null, null, 4, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) {
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess loadSuccess2 = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) event;
            if (loadSuccess2.isAutoTransferEnabled()) {
                success = com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff.INSTANCE;
            } else {
                success = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, loadSuccess2.getConfig(), loadSuccess2.getChoiceSheetUi());
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent = loading.getFlowIntent();
            com.paypal.oslo.feature.balance.domain.error.AutoReloadError error = ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError) event).getError();
            if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Nsf.INSTANCE)) {
                str = "Insufficient funds";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FiDeclined.INSTANCE)) {
                str = "Funding instrument declined";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE)) {
                str = "Auto-reload error";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FundsError.INSTANCE)) {
                str = "Funds error";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericError.INSTANCE)) {
                str = "An error occurred";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE)) {
                str = "API error";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.RiskDeclined.INSTANCE)) {
                str = "Risk declined";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE)) {
                str = "Network error";
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(error, com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Business.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "Business error";
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error(flowIntent, str, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet flowIntent2 = loading.getFlowIntent();
            if (flowIntent2 == null) {
                flowIntent2 = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(flowIntent2, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE)));
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance(null, null, null, 7, null));
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) event).getResult()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent p1) {
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading(null, 1, 0 == true ? 1 : 0), null, 2, null);
        }
        if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss)) {
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance(null, null, null, 7, null));
            }
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled.INSTANCE);
            }
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) p1).getResult()));
            }
            if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) && !(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError) && !(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent p1) {
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading(null, 1, 0 == true ? 1 : 0), null, 2, null);
        }
        if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss)) {
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance(null, null, null, 7, null));
            }
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled.INSTANCE);
            }
            if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) p1).getResult()));
            }
            if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) && !(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
            }
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(p0.getFlowIntent(), com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent p1) {
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading(null, 1, 0 == true ? 1 : 0), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss) {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet flowIntent = p0.getFlowIntent();
            if (flowIntent == null) {
                flowIntent = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ChoiceSheet.INSTANCE;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(flowIntent, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed.INSTANCE)));
        }
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToLowBalance(null, null, null, 7, null));
        }
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.NavigateToScheduled.INSTANCE);
        }
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadEffect.CompleteAutoReloadFlowWithResult(((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) p1).getResult()));
        }
        if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) && !(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
        }
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}

package com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/reducer/PublicProfileReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PublicProfileReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PublicProfileReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect>> reduce(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState state, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent event) {
        com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile copy;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile copy2;
        com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile copy3;
        com.paypal.oslo.feature.publicprofile.domain.model.PublicProfile copy4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success)) {
                if (state instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error) {
                    return event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error) state, event);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success success = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnMoreOptionsClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ProfileActions(success.getProfile().isInContacts(), success.getProfile().isBlocked())));
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.RemoveConfirmation(success.getProfile().getFullName())));
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.ReportConfirmation(success.getProfile().getFullName())));
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.BlockConfirmation(success.getProfile().getFullName())));
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.UnblockConfirmation(success.getProfile().getFullName())));
            }
            if ((event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed) || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed) || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, true, false, null, 3, null), new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.None.INSTANCE));
            }
            if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnReportConfirmed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet(com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType.None.INSTANCE));
            }
            boolean z = event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked;
            if (z || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggled) || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed)) {
                if (!z) {
                    if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggled) {
                        com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success copy$default = com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, false, null, 29, null);
                        if (success.getProfile().isFavorite()) {
                            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.publicprofile.R.string.feature_public_profile_added_favorite_toast, new java.lang.Object[0]);
                        } else {
                            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.publicprofile.R.string.feature_public_profile_removed_favorite_toast, new java.lang.Object[0]);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast(stringResourceRef));
                    }
                    if (!(event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                    copy = r5.copy((r24 & 1) != 0 ? r5.handle : null, (r24 & 2) != 0 ? r5.fullName : null, (r24 & 4) != 0 ? r5.contactId : null, (r24 & 8) != 0 ? r5.profilePhotoUrl : null, (r24 & 16) != 0 ? r5.location : null, (r24 & 32) != 0 ? r5.joinedYear : null, (r24 & 64) != 0 ? r5.isInContacts : false, (r24 & 128) != 0 ? r5.mutualContacts : 0, (r24 & 256) != 0 ? r5.isBusiness : false, (r24 & 512) != 0 ? r5.isFavorite : !success.getProfile().isFavorite(), (r24 & 1024) != 0 ? success.getProfile().isBlocked : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, copy, false, false, true, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducerKt.access$toCode(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.FavoriteToggleFailed) event).getError()), 4, null), null, 2, null);
                }
                copy2 = r5.copy((r24 & 1) != 0 ? r5.handle : null, (r24 & 2) != 0 ? r5.fullName : null, (r24 & 4) != 0 ? r5.contactId : null, (r24 & 8) != 0 ? r5.profilePhotoUrl : null, (r24 & 16) != 0 ? r5.location : null, (r24 & 32) != 0 ? r5.joinedYear : null, (r24 & 64) != 0 ? r5.isInContacts : false, (r24 & 128) != 0 ? r5.mutualContacts : 0, (r24 & 256) != 0 ? r5.isBusiness : false, (r24 & 512) != 0 ? r5.isFavorite : !success.getProfile().isFavorite(), (r24 & 1024) != 0 ? success.getProfile().isBlocked : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, copy2, true, false, false, null, 4, null), null, 2, null);
            }
            boolean z2 = event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactSucceeded;
            if (z2 || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed) || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnOperationErrorDismissed)) {
                if (z2) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, false, null, 19, null), new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult(new com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult(success.getProfile().getContactId(), success.getProfile().getFullName())));
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, true, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducerKt.access$toCode(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.RemoveContactFailed) event).getError()), 3, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnOperationErrorDismissed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, false, null, 7, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            boolean z3 = event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactSucceeded;
            if (z3 || (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed)) {
                if (!z3) {
                    if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, true, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducerKt.access$toCode(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed) event).getError()), 3, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
                copy3 = r1.copy((r24 & 1) != 0 ? r1.handle : null, (r24 & 2) != 0 ? r1.fullName : null, (r24 & 4) != 0 ? r1.contactId : null, (r24 & 8) != 0 ? r1.profilePhotoUrl : null, (r24 & 16) != 0 ? r1.location : null, (r24 & 32) != 0 ? r1.joinedYear : null, (r24 & 64) != 0 ? r1.isInContacts : false, (r24 & 128) != 0 ? r1.mutualContacts : 0, (r24 & 256) != 0 ? r1.isBusiness : false, (r24 & 512) != 0 ? r1.isFavorite : false, (r24 & 1024) != 0 ? success.getProfile().isBlocked : true);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, copy3, false, false, false, null, 18, null), new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.publicprofile.R.string.feature_public_profile_block_confirmation_toast, success.getProfile().getFullName())));
            }
            boolean z4 = event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactSucceeded;
            if (!z4 && !(event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            if (!z4) {
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, null, false, false, true, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducerKt.access$toCode(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.UnblockContactFailed) event).getError()), 3, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            copy4 = r1.copy((r24 & 1) != 0 ? r1.handle : null, (r24 & 2) != 0 ? r1.fullName : null, (r24 & 4) != 0 ? r1.contactId : null, (r24 & 8) != 0 ? r1.profilePhotoUrl : null, (r24 & 16) != 0 ? r1.location : null, (r24 & 32) != 0 ? r1.joinedYear : null, (r24 & 64) != 0 ? r1.isInContacts : false, (r24 & 128) != 0 ? r1.mutualContacts : 0, (r24 & 256) != 0 ? r1.isBusiness : false, (r24 & 512) != 0 ? r1.isFavorite : false, (r24 & 1024) != 0 ? success.getProfile().isBlocked : false);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success.copy$default(success, copy4, false, false, false, null, 18, null), new com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.publicprofile.R.string.feature_public_profile_unblock_confirmation_toast, success.getProfile().getFullName())));
        }
        com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading loading = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.DataLoaded) event).getProfile(), false, false, false, null, 30, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.LoadFailed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Error.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}

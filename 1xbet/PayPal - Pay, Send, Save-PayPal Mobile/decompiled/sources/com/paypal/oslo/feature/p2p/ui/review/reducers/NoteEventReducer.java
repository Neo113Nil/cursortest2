package com.paypal.oslo.feature.p2p.ui.review.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/reducers/NoteEventReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/NoteUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/NoteEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/NoteUiState;Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NoteEventReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.reducers.NoteEventReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.reducers.NoteEventReducer();

    private NoteEventReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "NoteEventReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState, com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect>> reduce(com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState state, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent event) {
        com.paypal.oslo.core.mvi.Reducer.Output output;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy2;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy3;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy4;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy5;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy6;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy7;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy8;
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked) {
            output = new com.paypal.oslo.core.mvi.Reducer.Output(state, null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated) {
            java.lang.String memo = ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated) event).getMemo();
            com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails = state.getEnteredNoteDetails();
            copy9 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(memo, enteredNoteDetails != null ? enteredNoteDetails.getMedia() : null), (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
            output = new com.paypal.oslo.core.mvi.Reducer.Output(copy9, null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected) {
            com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails2 = state.getEnteredNoteDetails();
            copy8 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(enteredNoteDetails2 != null ? enteredNoteDetails2.getMemo() : null, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected) event).getTheme()), (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
            output = new com.paypal.oslo.core.mvi.Reducer.Output(copy8, null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected) {
            com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails3 = state.getEnteredNoteDetails();
            copy7 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(enteredNoteDetails3 != null ? enteredNoteDetails3.getMemo() : null, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected) event).getGif()), (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
            output = new com.paypal.oslo.core.mvi.Reducer.Output(copy7, null, 2, null);
        } else if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteDoneClicked.INSTANCE)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled.INSTANCE)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ClearFundingOptions.INSTANCE)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                output = new com.paypal.oslo.core.mvi.Reducer.Output(state, null, 2, null);
                            } else {
                                copy = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : state.getSavedNoteDetails(), (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
                                output = new com.paypal.oslo.core.mvi.Reducer.Output(copy, null, 2, null);
                            }
                        } else {
                            copy2 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow) event).getPaymentTransferAttemptId(), (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : null, (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
                            output = new com.paypal.oslo.core.mvi.Reducer.Output(copy2, null, 2, null);
                        }
                    } else {
                        copy3 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : true, (r20 & 8) != 0 ? state.enteredNoteDetails : null, (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
                        output = new com.paypal.oslo.core.mvi.Reducer.Output(copy3, null, 2, null);
                    }
                } else {
                    copy4 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : null, (r20 & 16) != 0 ? state.savedNoteDetails : state.getEnteredNoteDetails(), (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
                    output = new com.paypal.oslo.core.mvi.Reducer.Output(copy4, com.paypal.oslo.feature.p2p.ui.review.effects.NoteEffect.NavigateBack.INSTANCE);
                }
            } else {
                copy5 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : null, (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : null, (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : java.lang.Integer.valueOf(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_update_failed));
                output = new com.paypal.oslo.core.mvi.Reducer.Output(copy5, null, 2, null);
            }
        } else {
            copy6 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.paymentTransferAttemptId : ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized) event).getPaymentId(), (r20 & 4) != 0 ? state.isLoading : false, (r20 & 8) != 0 ? state.enteredNoteDetails : null, (r20 & 16) != 0 ? state.savedNoteDetails : null, (r20 & 32) != 0 ? state.noteCharacterLimit : 0, (r20 & 64) != 0 ? state.themes : null, (r20 & 128) != 0 ? state.gifs : null, (r20 & 256) != 0 ? state.errorResId : null);
            output = new com.paypal.oslo.core.mvi.Reducer.Output(copy6, null, 2, null);
        }
        return arrow.core.EitherKt.right(output);
    }
}

package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b\u0006\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001cR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b5\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/NoteUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "paymentTransferAttemptId", "", "isLoading", "Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", "enteredNoteDetails", "savedNoteDetails", "", "noteCharacterLimit", "", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "themes", "gifs", "errorResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;ILjava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", "component5", "component6", "()I", "component7", "()Ljava/util/List;", "component8", "component9", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;ILjava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/p2p/ui/review/state/NoteUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", "getPaymentTransferAttemptId", "Z", "Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", "getEnteredNoteDetails", "getSavedNoteDetails", com.visa.cbp.getEncExpo.warmup, "getNoteCharacterLimit", "Ljava/util/List;", "getThemes", "getGifs", "Ljava/lang/Integer;", "getErrorResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NoteUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails;
    private final java.lang.Integer errorResId;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> gifs;
    private final boolean isLoading;
    private final java.lang.String name;
    private final int noteCharacterLimit;
    private final java.lang.String paymentTransferAttemptId;
    private final com.paypal.oslo.feature.p2p.domain.model.NoteDetails savedNoteDetails;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> themes;

    public NoteUiState(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails2, int i, java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> list, java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> list2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.name = str;
        this.paymentTransferAttemptId = str2;
        this.isLoading = z;
        this.enteredNoteDetails = noteDetails;
        this.savedNoteDetails = noteDetails2;
        this.noteCharacterLimit = i;
        this.themes = list;
        this.gifs = list2;
        this.errorResId = num;
    }

    public /* synthetic */ NoteUiState(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails2, int i, java.util.List list, java.util.List list2, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "NoteUiState" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : noteDetails, (i2 & 16) != 0 ? null : noteDetails2, (i2 & 32) != 0 ? 250 : i, (i2 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 256) == 0 ? num : null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.NoteDetails getEnteredNoteDetails() {
        return this.enteredNoteDetails;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.NoteDetails getSavedNoteDetails() {
        return this.savedNoteDetails;
    }

    public final int getNoteCharacterLimit() {
        return this.noteCharacterLimit;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> getThemes() {
        return this.themes;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> getGifs() {
        return this.gifs;
    }

    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.paymentTransferAttemptId;
        boolean z = this.isLoading;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails = this.enteredNoteDetails;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails2 = this.savedNoteDetails;
        int i = this.noteCharacterLimit;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> list = this.themes;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> list2 = this.gifs;
        java.lang.Integer num = this.errorResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NoteUiState(name=");
        sb.append(str);
        sb.append(", paymentTransferAttemptId=");
        sb.append(str2);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", enteredNoteDetails=");
        sb.append(noteDetails);
        sb.append(", savedNoteDetails=");
        sb.append(noteDetails2);
        sb.append(", noteCharacterLimit=");
        sb.append(i);
        sb.append(", themes=");
        sb.append(list);
        sb.append(", gifs=");
        sb.append(list2);
        sb.append(", errorResId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.paymentTransferAttemptId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isLoading);
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails = this.enteredNoteDetails;
        int hashCode4 = noteDetails == null ? 0 : noteDetails.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails2 = this.savedNoteDetails;
        int hashCode5 = noteDetails2 == null ? 0 : noteDetails2.hashCode();
        int hashCode6 = java.lang.Integer.hashCode(this.noteCharacterLimit);
        int hashCode7 = this.themes.hashCode();
        int hashCode8 = this.gifs.hashCode();
        java.lang.Integer num = this.errorResId;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState noteUiState = (com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, noteUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttemptId, noteUiState.paymentTransferAttemptId) && this.isLoading == noteUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredNoteDetails, noteUiState.enteredNoteDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.savedNoteDetails, noteUiState.savedNoteDetails) && this.noteCharacterLimit == noteUiState.noteCharacterLimit && kotlin.jvm.internal.Intrinsics.areEqual(this.themes, noteUiState.themes) && kotlin.jvm.internal.Intrinsics.areEqual(this.gifs, noteUiState.gifs) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorResId, noteUiState.errorResId);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState copy(java.lang.String name2, java.lang.String paymentTransferAttemptId, boolean isLoading, com.paypal.oslo.feature.p2p.domain.model.NoteDetails enteredNoteDetails, com.paypal.oslo.feature.p2p.domain.model.NoteDetails savedNoteDetails, int noteCharacterLimit, java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> themes, java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> gifs, java.lang.Integer errorResId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(themes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gifs, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState(name2, paymentTransferAttemptId, isLoading, enteredNoteDetails, savedNoteDetails, noteCharacterLimit, themes, gifs, errorResId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> component8() {
        return this.gifs;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.MediaItem> component7() {
        return this.themes;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNoteCharacterLimit() {
        return this.noteCharacterLimit;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.NoteDetails getSavedNoteDetails() {
        return this.savedNoteDetails;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.NoteDetails getEnteredNoteDetails() {
        return this.enteredNoteDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public NoteUiState() {
        this(null, null, false, null, null, 0, null, null, null, 511, null);
    }
}

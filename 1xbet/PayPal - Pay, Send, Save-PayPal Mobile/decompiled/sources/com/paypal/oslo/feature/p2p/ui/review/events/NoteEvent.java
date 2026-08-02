package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "AddNoteClicked", "MemoUpdated", "ThemeSelected", "GifSelected", "PaymentIdInitialized", "UpdateNoteSuccess", "UpdateNoteFailed", "NoteDoneClicked", "ResetForNewFlow", "NoteCancelled", "ClearFundingOptions", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$AddNoteClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ClearFundingOptions;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$GifSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$MemoUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$NoteCancelled;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$NoteDoneClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$PaymentIdInitialized;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ResetForNewFlow;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ThemeSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$UpdateNoteFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$UpdateNoteSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class NoteEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private NoteEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$AddNoteClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddNoteClicked extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked();

        public final int hashCode() {
            return 752354626;
        }

        private AddNoteClicked() {
            super("AddNoteClicked", null);
        }

        public final java.lang.String toString() {
            return "AddNoteClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.AddNoteClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$MemoUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "", "memo", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$MemoUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MemoUpdated extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        private final java.lang.String memo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemoUpdated(java.lang.String str) {
            super("MemoUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.memo = str;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.memo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MemoUpdated(memo=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.memo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.memo, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated) other).memo);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated copy(java.lang.String memo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memo, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated(memo);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated copy$default(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.MemoUpdated memoUpdated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = memoUpdated.memo;
            }
            return memoUpdated.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ThemeSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ThemeSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "getTheme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThemeSelected extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.MediaItem theme;

        public ThemeSelected(com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem) {
            super("ThemeSelected", null);
            this.theme = mediaItem;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getTheme() {
            return this.theme;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.theme;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThemeSelected(theme=");
            sb.append(mediaItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.theme;
            if (mediaItem == null) {
                return 0;
            }
            return mediaItem.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.theme, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected) other).theme);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected copy(com.paypal.oslo.feature.p2p.domain.model.MediaItem theme) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected(theme);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getTheme() {
            return this.theme;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ThemeSelected themeSelected, com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaItem = themeSelected.theme;
            }
            return themeSelected.copy(mediaItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$GifSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "gif", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$GifSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "getGif"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GifSelected extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.MediaItem gif;

        public GifSelected(com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem) {
            super("GifSelected", null);
            this.gif = mediaItem;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getGif() {
            return this.gif;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.gif;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GifSelected(gif=");
            sb.append(mediaItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.gif;
            if (mediaItem == null) {
                return 0;
            }
            return mediaItem.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.gif, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected) other).gif);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected copy(com.paypal.oslo.feature.p2p.domain.model.MediaItem gif) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected(gif);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getGif() {
            return this.gif;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.GifSelected gifSelected, com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mediaItem = gifSelected.gif;
            }
            return gifSelected.copy(mediaItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$PaymentIdInitialized;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$PaymentIdInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentIdInitialized extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        private final java.lang.String paymentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentIdInitialized(java.lang.String str) {
            super("PaymentIdInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentId = str;
        }

        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentIdInitialized(paymentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized) other).paymentId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized copy(java.lang.String paymentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized(paymentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized copy$default(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized paymentIdInitialized, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentIdInitialized.paymentId;
            }
            return paymentIdInitialized.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$UpdateNoteSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateNoteSuccess extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess();

        public final int hashCode() {
            return -1064841318;
        }

        private UpdateNoteSuccess() {
            super("UpdateNoteSuccess", null);
        }

        public final java.lang.String toString() {
            return "UpdateNoteSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$UpdateNoteFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateNoteFailed extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed();

        public final int hashCode() {
            return 267924934;
        }

        private UpdateNoteFailed() {
            super("UpdateNoteFailed", null);
        }

        public final java.lang.String toString() {
            return "UpdateNoteFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$NoteDoneClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoteDoneClicked extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteDoneClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteDoneClicked();

        public final int hashCode() {
            return 318874597;
        }

        private NoteDoneClicked() {
            super("NoteDoneClicked", null);
        }

        public final java.lang.String toString() {
            return "NoteDoneClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteDoneClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ResetForNewFlow;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "", "paymentTransferAttemptId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ResetForNewFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetForNewFlow extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        private final java.lang.String paymentTransferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetForNewFlow(java.lang.String str) {
            super("ResetForNewFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentTransferAttemptId = str;
        }

        public final java.lang.String getPaymentTransferAttemptId() {
            return this.paymentTransferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentTransferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResetForNewFlow(paymentTransferAttemptId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentTransferAttemptId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttemptId, ((com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow) other).paymentTransferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow copy(java.lang.String paymentTransferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow(paymentTransferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentTransferAttemptId() {
            return this.paymentTransferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow copy$default(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow resetForNewFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resetForNewFlow.paymentTransferAttemptId;
            }
            return resetForNewFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$NoteCancelled;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoteCancelled extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled();

        public final int hashCode() {
            return -557103375;
        }

        private NoteCancelled() {
            super("NoteCancelled", null);
        }

        public final java.lang.String toString() {
            return "NoteCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.NoteCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent$ClearFundingOptions;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/NoteEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearFundingOptions extends com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ClearFundingOptions INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ClearFundingOptions();

        public final int hashCode() {
            return 867101824;
        }

        private ClearFundingOptions() {
            super("ClearFundingOptions", null);
        }

        public final java.lang.String toString() {
            return "ClearFundingOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ClearFundingOptions)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ NoteEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

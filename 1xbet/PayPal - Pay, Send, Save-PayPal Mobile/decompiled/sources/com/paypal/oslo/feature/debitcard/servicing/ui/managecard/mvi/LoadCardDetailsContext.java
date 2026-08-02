package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getPostLoadAction", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "postLoadAction", "RefreshByCardId", "RefreshAllCards", "PostLoadAction", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshAllCards;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshByCardId;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class LoadCardDetailsContext {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction();

    private LoadCardDetailsContext() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshByCardId;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "postLoadAction", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshByCardId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getPostLoadAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshByCardId extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshByCardId(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            this.cardId = str;
            this.postLoadAction = postLoadAction;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public /* synthetic */ RefreshByCardId(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None none, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE : none);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = this.postLoadAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RefreshByCardId(cardId=");
            sb.append(str);
            sb.append(", postLoadAction=");
            sb.append(postLoadAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.postLoadAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId refreshByCardId = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, refreshByCardId.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.postLoadAction, refreshByCardId.postLoadAction);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId copy(java.lang.String cardId, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(cardId, postLoadAction);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId refreshByCardId, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = refreshByCardId.cardId;
            }
            if ((i & 2) != 0) {
                postLoadAction = refreshByCardId.postLoadAction;
            }
            return refreshByCardId.copy(str, postLoadAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshAllCards;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "postLoadAction", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$RefreshAllCards;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getPostLoadAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshAllCards extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshAllCards(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            this.postLoadAction = postLoadAction;
        }

        public /* synthetic */ RefreshAllCards(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None none, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE : none);
        }

        @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = this.postLoadAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RefreshAllCards(postLoadAction=");
            sb.append(postLoadAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.postLoadAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards) && kotlin.jvm.internal.Intrinsics.areEqual(this.postLoadAction, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards) other).postLoadAction);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards copy(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards(postLoadAction);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards refreshAllCards, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                postLoadAction = refreshAllCards.postLoadAction;
            }
            return refreshAllCards.copy(postLoadAction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RefreshAllCards() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "ShowCardDetails", "ShowPushProvisioningBottomSheet", "ShowFundingSourceSelectorBottomSheet", "ShowCardLockedToast", "ShowCardUnlockedToast", "ShowCardAlreadyLockedToast", "ShowCardAlreadyUnlockedToast", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$None;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardAlreadyLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardAlreadyUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowFundingSourceSelectorBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowPushProvisioningBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class PostLoadAction {
        public static final int $stable = 0;

        private PostLoadAction() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$None;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class None extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None();

            public final int hashCode() {
                return 1422145419;
            }

            private None() {
                super(null);
            }

            public final java.lang.String toString() {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowCardDetails extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails();

            public final int hashCode() {
                return 270569378;
            }

            private ShowCardDetails() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowCardDetails";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowPushProvisioningBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowPushProvisioningBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowPushProvisioningBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowPushProvisioningBottomSheet();

            public final int hashCode() {
                return 1818616541;
            }

            private ShowPushProvisioningBottomSheet() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowPushProvisioningBottomSheet";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowPushProvisioningBottomSheet)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowFundingSourceSelectorBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowFundingSourceSelectorBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowFundingSourceSelectorBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowFundingSourceSelectorBottomSheet();

            public final int hashCode() {
                return 2133294957;
            }

            private ShowFundingSourceSelectorBottomSheet() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowFundingSourceSelectorBottomSheet";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowFundingSourceSelectorBottomSheet)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowCardLockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast();

            public final int hashCode() {
                return 1840232093;
            }

            private ShowCardLockedToast() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowCardLockedToast";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowCardUnlockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast();

            public final int hashCode() {
                return 1193338468;
            }

            private ShowCardUnlockedToast() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowCardUnlockedToast";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardAlreadyLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowCardAlreadyLockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast();

            public final int hashCode() {
                return 1537663077;
            }

            private ShowCardAlreadyLockedToast() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowCardAlreadyLockedToast";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction$ShowCardAlreadyUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowCardAlreadyUnlockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast();

            public final int hashCode() {
                return -1812677076;
            }

            private ShowCardAlreadyUnlockedToast() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ShowCardAlreadyUnlockedToast";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ PostLoadAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LoadCardDetailsContext(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

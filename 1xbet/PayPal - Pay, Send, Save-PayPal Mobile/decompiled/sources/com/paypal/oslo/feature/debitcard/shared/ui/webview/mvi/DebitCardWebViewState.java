package com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Success", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardWebViewState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardWebViewState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Initial;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial();

        public final int hashCode() {
            return 400926099;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Success;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "", "url", "", "isAuthRequired", "title", "hasAddedCardholder", "hasActivatedCard", "hasAddedAddress", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;ZZZ)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Z", "getTitle", "getHasAddedCardholder", "getHasActivatedCard", "getHasAddedAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState {
        public static final int $stable = 0;
        private final boolean hasActivatedCard;
        private final boolean hasAddedAddress;
        private final boolean hasAddedCardholder;
        private final boolean isAuthRequired;
        private final java.lang.String title;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3, boolean z4) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.isAuthRequired = z;
            this.title = str2;
            this.hasAddedCardholder = z2;
            this.hasActivatedCard = z3;
            this.hasAddedAddress = z4;
        }

        public /* synthetic */ Success(java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final boolean isAuthRequired() {
            return this.isAuthRequired;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final boolean getHasAddedCardholder() {
            return this.hasAddedCardholder;
        }

        public final boolean getHasActivatedCard() {
            return this.hasActivatedCard;
        }

        public final boolean getHasAddedAddress() {
            return this.hasAddedAddress;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            boolean z = this.isAuthRequired;
            java.lang.String str2 = this.title;
            boolean z2 = this.hasAddedCardholder;
            boolean z3 = this.hasActivatedCard;
            boolean z4 = this.hasAddedAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(url=");
            sb.append(str);
            sb.append(", isAuthRequired=");
            sb.append(z);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", hasAddedCardholder=");
            sb.append(z2);
            sb.append(", hasActivatedCard=");
            sb.append(z3);
            sb.append(", hasAddedAddress=");
            sb.append(z4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isAuthRequired);
            java.lang.String str = this.title;
            return (((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.hasAddedCardholder)) * 31) + java.lang.Boolean.hashCode(this.hasActivatedCard)) * 31) + java.lang.Boolean.hashCode(this.hasAddedAddress);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success success = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, success.url) && this.isAuthRequired == success.isAuthRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.title, success.title) && this.hasAddedCardholder == success.hasAddedCardholder && this.hasActivatedCard == success.hasActivatedCard && this.hasAddedAddress == success.hasAddedAddress;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success copy(java.lang.String url, boolean isAuthRequired, java.lang.String title, boolean hasAddedCardholder, boolean hasActivatedCard, boolean hasAddedAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success(url, isAuthRequired, title, hasAddedCardholder, hasActivatedCard, hasAddedAddress);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasAddedAddress() {
            return this.hasAddedAddress;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasActivatedCard() {
            return this.hasActivatedCard;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasAddedCardholder() {
            return this.hasAddedCardholder;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAuthRequired() {
            return this.isAuthRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success copy$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Success success, java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.url;
            }
            if ((i & 2) != 0) {
                z = success.isAuthRequired;
            }
            boolean z5 = z;
            if ((i & 4) != 0) {
                str2 = success.title;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                z2 = success.hasAddedCardholder;
            }
            boolean z6 = z2;
            if ((i & 16) != 0) {
                z3 = success.hasActivatedCard;
            }
            boolean z7 = z3;
            if ((i & 32) != 0) {
                z4 = success.hasAddedAddress;
            }
            return success.copy(str, z5, str3, z6, z7, z4);
        }
    }

    public /* synthetic */ DebitCardWebViewState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

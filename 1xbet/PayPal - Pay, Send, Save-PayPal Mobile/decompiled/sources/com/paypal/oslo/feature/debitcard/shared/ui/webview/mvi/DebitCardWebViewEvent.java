package com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "BackPressed", "NativeReturnUriDetected", "AddCardholderSuccess", "AddAddressSuccess", "ActivateCardSuccess", "LinkBankAccountClicked", "SeeDigitalCardClicked", "ManageCardClicked", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$ActivateCardSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$AddAddressSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$AddCardholderSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$BackPressed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$Initialize;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$LinkBankAccountClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$ManageCardClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$NativeReturnUriDetected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$SeeDigitalCardClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardWebViewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardWebViewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$Initialize;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "", "url", "", "isAuthRequired", "title", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$Initialize;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Z", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        private final boolean isAuthRequired;
        private final java.lang.String title;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, boolean z, java.lang.String str2) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.isAuthRequired = z;
            this.title = str2;
        }

        public /* synthetic */ Initialize(java.lang.String str, boolean z, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2);
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

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            boolean z = this.isAuthRequired;
            java.lang.String str2 = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(url=");
            sb.append(str);
            sb.append(", isAuthRequired=");
            sb.append(z);
            sb.append(", title=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isAuthRequired);
            java.lang.String str = this.title;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize initialize = (com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, initialize.url) && this.isAuthRequired == initialize.isAuthRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.title, initialize.title);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize copy(java.lang.String url, boolean isAuthRequired, java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize(url, isAuthRequired, title);
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

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize copy$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize initialize, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.url;
            }
            if ((i & 2) != 0) {
                z = initialize.isAuthRequired;
            }
            if ((i & 4) != 0) {
                str2 = initialize.title;
            }
            return initialize.copy(str, z, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$BackPressed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.BackPressed();

        public final int hashCode() {
            return -2109885293;
        }

        private BackPressed() {
            super("BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$NativeReturnUriDetected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeReturnUriDetected extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.NativeReturnUriDetected INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.NativeReturnUriDetected();

        public final int hashCode() {
            return -78457665;
        }

        private NativeReturnUriDetected() {
            super("NativeReturnUriDetected", null);
        }

        public final java.lang.String toString() {
            return "NativeReturnUriDetected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.NativeReturnUriDetected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$AddCardholderSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCardholderSuccess extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddCardholderSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddCardholderSuccess();

        public final int hashCode() {
            return -916727634;
        }

        private AddCardholderSuccess() {
            super("AddCardholderSuccess", null);
        }

        public final java.lang.String toString() {
            return "AddCardholderSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddCardholderSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$AddAddressSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "", "newAddressId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$AddAddressSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddAddressSuccess extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        private final java.lang.String newAddressId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddAddressSuccess(java.lang.String str) {
            super("AddAddressSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newAddressId = str;
        }

        public final java.lang.String getNewAddressId() {
            return this.newAddressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddAddressSuccess(newAddressId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newAddressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.newAddressId, ((com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess) other).newAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess copy(java.lang.String newAddressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAddressId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess(newAddressId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAddressId() {
            return this.newAddressId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess copy$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.AddAddressSuccess addAddressSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addAddressSuccess.newAddressId;
            }
            return addAddressSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$ActivateCardSuccess;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivateCardSuccess extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ActivateCardSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ActivateCardSuccess();

        public final int hashCode() {
            return 1452980024;
        }

        private ActivateCardSuccess() {
            super("ActivateCardSuccess", null);
        }

        public final java.lang.String toString() {
            return "ActivateCardSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ActivateCardSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$LinkBankAccountClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkBankAccountClicked extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.LinkBankAccountClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.LinkBankAccountClicked();

        public final int hashCode() {
            return 663264728;
        }

        private LinkBankAccountClicked() {
            super("LinkBankAccountClicked", null);
        }

        public final java.lang.String toString() {
            return "LinkBankAccountClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.LinkBankAccountClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$SeeDigitalCardClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SeeDigitalCardClicked extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.SeeDigitalCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.SeeDigitalCardClicked();

        public final int hashCode() {
            return 2102913226;
        }

        private SeeDigitalCardClicked() {
            super("SeeDigitalCardClicked", null);
        }

        public final java.lang.String toString() {
            return "SeeDigitalCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.SeeDigitalCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent$ManageCardClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageCardClicked extends com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ManageCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ManageCardClicked();

        public final int hashCode() {
            return -368059990;
        }

        private ManageCardClicked() {
            super("ManageCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ManageCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.ManageCardClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardWebViewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

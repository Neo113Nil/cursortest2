package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowToast", "OpenMultiSavingsSheet", "OpenDeeplink", "OpenReconSheet", "ShowReconSheetLoading", "DismissReconSheet", "ShowReconciliationSuccess", "ShowReconciliationFailure", "NavigateToSelfCorrectionFlow", "ShowSelfCorrectionFailure", "OpenDownloadedFile", "DismissMultiSavingsSheet", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$DismissMultiSavingsSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$DismissReconSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$NavigateToSelfCorrectionFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDeeplink;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDownloadedFile;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenMultiSavingsSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenReconSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconSheetLoading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconciliationFailure;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconciliationSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowSelfCorrectionFailure;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TaxDocumentsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private TaxDocumentsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(java.lang.String str) {
            super("ShowToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast showToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToast.message;
            }
            return showToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenMultiSavingsSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenMultiSavingsSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenMultiSavingsSheet extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenMultiSavingsSheet(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData) {
            super("OpenMultiSavingsSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiSavingsSheetData, "");
            this.data = multiSavingsSheetData;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenMultiSavingsSheet(data=");
            sb.append(multiSavingsSheetData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet) other).data);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet openMultiSavingsSheet, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                multiSavingsSheetData = openMultiSavingsSheet.data;
            }
            return openMultiSavingsSheet.copy(multiSavingsSheetData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDeeplink;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "", "url", "", "shouldRefreshOnReturn", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDeeplink;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Z", "getShouldRefreshOnReturn"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        private final boolean shouldRefreshOnReturn;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDeeplink(java.lang.String str, boolean z) {
            super("OpenDeeplink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.shouldRefreshOnReturn = z;
        }

        public /* synthetic */ OpenDeeplink(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final boolean getShouldRefreshOnReturn() {
            return this.shouldRefreshOnReturn;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            boolean z = this.shouldRefreshOnReturn;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenDeeplink(url=");
            sb.append(str);
            sb.append(", shouldRefreshOnReturn=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldRefreshOnReturn);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink openDeeplink = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openDeeplink.url) && this.shouldRefreshOnReturn == openDeeplink.shouldRefreshOnReturn;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink copy(java.lang.String url, boolean shouldRefreshOnReturn) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink(url, shouldRefreshOnReturn);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldRefreshOnReturn() {
            return this.shouldRefreshOnReturn;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink openDeeplink, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openDeeplink.url;
            }
            if ((i & 2) != 0) {
                z = openDeeplink.shouldRefreshOnReturn;
            }
            return openDeeplink.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenReconSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenReconSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenReconSheet extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenReconSheet(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData) {
            super("OpenReconSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetData, "");
            this.data = sheetData;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenReconSheet(data=");
            sb.append(sheetData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet) other).data);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet openReconSheet, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sheetData = openReconSheet.data;
            }
            return openReconSheet.copy(sheetData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconSheetLoading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowReconSheetLoading extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconSheetLoading INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconSheetLoading();

        public final int hashCode() {
            return 218750761;
        }

        private ShowReconSheetLoading() {
            super("ShowReconSheetLoading", null);
        }

        public final java.lang.String toString() {
            return "ShowReconSheetLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconSheetLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$DismissReconSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissReconSheet extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissReconSheet INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissReconSheet();

        public final int hashCode() {
            return 1862247700;
        }

        private DismissReconSheet() {
            super("DismissReconSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissReconSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissReconSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconciliationSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowReconciliationSuccess extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationSuccess INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationSuccess();

        public final int hashCode() {
            return -1512645283;
        }

        private ShowReconciliationSuccess() {
            super("ShowReconciliationSuccess", null);
        }

        public final java.lang.String toString() {
            return "ShowReconciliationSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowReconciliationFailure;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowReconciliationFailure extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationFailure INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationFailure();

        public final int hashCode() {
            return -732049692;
        }

        private ShowReconciliationFailure() {
            super("ShowReconciliationFailure", null);
        }

        public final java.lang.String toString() {
            return "ShowReconciliationFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$NavigateToSelfCorrectionFlow;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "", "deepLink", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$NavigateToSelfCorrectionFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSelfCorrectionFlow extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String deepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSelfCorrectionFlow(java.lang.String str) {
            super("NavigateToSelfCorrectionFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.deepLink = str;
        }

        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deepLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSelfCorrectionFlow(deepLink=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deepLink.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow) other).deepLink);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow copy(java.lang.String deepLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow(deepLink);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow navigateToSelfCorrectionFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSelfCorrectionFlow.deepLink;
            }
            return navigateToSelfCorrectionFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$ShowSelfCorrectionFailure;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSelfCorrectionFailure extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowSelfCorrectionFailure INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowSelfCorrectionFailure();

        public final int hashCode() {
            return 39978013;
        }

        private ShowSelfCorrectionFailure() {
            super("ShowSelfCorrectionFailure", null);
        }

        public final java.lang.String toString() {
            return "ShowSelfCorrectionFailure";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowSelfCorrectionFailure)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDownloadedFile;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "Landroid/net/Uri;", "fileUri", "", "fileName", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDownloadedFile;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getFileName", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenDownloadedFile extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 8;
        private final java.lang.String fileName;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDownloadedFile(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            super("OpenDownloadedFile", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fileUri = uri;
            this.fileName = str;
            this.mimeType = str2;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.fileUri;
            java.lang.String str = this.fileName;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenDownloadedFile(fileUri=");
            sb.append(uri);
            sb.append(", fileName=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fileUri.hashCode();
            int hashCode2 = this.fileName.hashCode();
            java.lang.String str = this.mimeType;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile openDownloadedFile = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, openDownloadedFile.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, openDownloadedFile.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, openDownloadedFile.mimeType);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile copy(android.net.Uri fileUri, java.lang.String fileName, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile(fileUri, fileName, mimeType);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile openDownloadedFile, android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = openDownloadedFile.fileUri;
            }
            if ((i & 2) != 0) {
                str = openDownloadedFile.fileName;
            }
            if ((i & 4) != 0) {
                str2 = openDownloadedFile.mimeType;
            }
            return openDownloadedFile.copy(uri, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$DismissMultiSavingsSheet;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissMultiSavingsSheet extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissMultiSavingsSheet INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissMultiSavingsSheet();

        public final int hashCode() {
            return 1291399835;
        }

        private DismissMultiSavingsSheet() {
            super("DismissMultiSavingsSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissMultiSavingsSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissMultiSavingsSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ TaxDocumentsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

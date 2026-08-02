package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DownloadClicked", "RetryClicked", "CloseClicked", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "DownloadStarted", "DownloadCompleted", "DownloadFailed", "OpenFileRequested", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$CloseClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DismissError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadCompleted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadStarted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$OpenFileRequested;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$RetryClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CustomStatementDownloadEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CustomStatementDownloadEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadClicked INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadClicked();

        public final int hashCode() {
            return -88336492;
        }

        private DownloadClicked() {
            super("DownloadClicked", null);
        }

        public final java.lang.String toString() {
            return "DownloadClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$RetryClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.RetryClicked INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.RetryClicked();

        public final int hashCode() {
            return -1659111574;
        }

        private RetryClicked() {
            super("RetryClicked", null);
        }

        public final java.lang.String toString() {
            return "RetryClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.RetryClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$CloseClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.CloseClicked();

        public final int hashCode() {
            return -315497958;
        }

        private CloseClicked() {
            super("CloseClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DismissError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DismissError INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DismissError();

        public final int hashCode() {
            return 577631401;
        }

        private DismissError() {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadStarted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "", "downloadUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadStarted extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadStarted(java.lang.String str) {
            super("DownloadStarted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.downloadUrl = str;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.downloadUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadStarted(downloadUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.downloadUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted) other).downloadUrl);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted copy(java.lang.String downloadUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted(downloadUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadStarted downloadStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloadStarted.downloadUrl;
            }
            return downloadStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadCompleted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadCompleted extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadCompleted INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadCompleted();

        public final int hashCode() {
            return 1569609336;
        }

        private DownloadCompleted() {
            super("DownloadCompleted", null);
        }

        public final java.lang.String toString() {
            return "DownloadCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "", "downloadUrl", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$DownloadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadFailed(java.lang.String str, java.lang.String str2) {
            super("DownloadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.downloadUrl = str;
            this.errorMessage = str2;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.downloadUrl;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadFailed(downloadUrl=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.downloadUrl.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed downloadFailed = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, downloadFailed.downloadUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, downloadFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed copy(java.lang.String downloadUrl, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed(downloadUrl, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.DownloadFailed downloadFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloadFailed.downloadUrl;
            }
            if ((i & 2) != 0) {
                str2 = downloadFailed.errorMessage;
            }
            return downloadFailed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$OpenFileRequested;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent;", "Landroid/net/Uri;", "fileUri", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "copy", "(Landroid/net/Uri;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadEvent$OpenFileRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenFileRequested extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent {
        public static final int $stable = 8;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenFileRequested(android.net.Uri uri, java.lang.String str) {
            super("OpenFileRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.fileUri = uri;
            this.mimeType = str;
        }

        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.fileUri;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenFileRequested(fileUri=");
            sb.append(uri);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.fileUri.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested openFileRequested = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, openFileRequested.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, openFileRequested.mimeType);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested copy(android.net.Uri fileUri, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested(fileUri, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getFileUri() {
            return this.fileUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadEvent.OpenFileRequested openFileRequested, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = openFileRequested.fileUri;
            }
            if ((i & 2) != 0) {
                str = openFileRequested.mimeType;
            }
            return openFileRequested.copy(uri, str);
        }
    }

    public /* synthetic */ CustomStatementDownloadEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

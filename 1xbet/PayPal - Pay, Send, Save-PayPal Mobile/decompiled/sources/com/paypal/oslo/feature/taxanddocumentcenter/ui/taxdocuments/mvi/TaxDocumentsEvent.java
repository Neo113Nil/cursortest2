package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001a\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001a$%&'()*+,-./0123456789:;<="}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "AvailableYearsLoaded", "YearSelected", "ShowLoader", "ReportsLoaded", "ReportsLoadFailed", "InitializationFailed", "FaqsLoaded", "FaqsLoadFailed", "FaqViewMoreClicked", "FaqItemClicked", "ReportCardClicked", "ReportLinkClicked", "MultiSavingFormSelected", "RequestReconTaxDocument", "ReconciliationRequestInProgress", "ReconciliationRequestSuccess", "ReconciliationRequestFailed", "SelfCorrectionRequestInProgress", "SelfCorrectionRequestSuccess", "SelfCorrectionRequestFailed", "DownloadStarted", "DownloadCompleted", "DownloadFailed", "RetryDownload", "DismissDownloadError", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$AvailableYearsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DismissDownloadError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadCompleted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadStarted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqItemClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqViewMoreClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqsLoadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$InitializationFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$Initialize;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$MultiSavingFormSelected;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestInProgress;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportCardClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportLinkClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportsLoadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RequestReconTaxDocument;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RetryDownload;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestInProgress;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ShowLoader;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$YearSelected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TaxDocumentsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private TaxDocumentsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$Initialize;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize();

        public final int hashCode() {
            return 2105428615;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$AvailableYearsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$AvailableYearsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableYearsLoaded extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvailableYearsLoaded(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData yearDropdownData) {
            super("AvailableYearsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearDropdownData, "");
            this.data = yearDropdownData;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData yearDropdownData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableYearsLoaded(data=");
            sb.append(yearDropdownData);
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
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded) other).data);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded availableYearsLoaded, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData yearDropdownData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                yearDropdownData = availableYearsLoaded.data;
            }
            return availableYearsLoaded.copy(yearDropdownData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$YearSelected;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$YearSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class YearSelected extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String year;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YearSelected(java.lang.String str) {
            super("YearSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.year = str;
        }

        public final java.lang.String getYear() {
            return this.year;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.year;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("YearSelected(year=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.year.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.year, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) other).year);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected copy(java.lang.String year) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected(year);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getYear() {
            return this.year;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected yearSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = yearSelected.year;
            }
            return yearSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ShowLoader;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowLoader extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader();

        public final int hashCode() {
            return 1811907687;
        }

        private ShowLoader() {
            super("ShowLoader", null);
        }

        public final java.lang.String toString() {
            return "ShowLoader";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "sections", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportsLoaded extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportsLoaded(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> list) {
            super("ReportsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sections = list;
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> getSections() {
            return this.sections;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> list = this.sections;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportsLoaded(sections=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) other).sections);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded copy(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> sections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded(sections);
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded reportsLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = reportsLoaded.sections;
            }
            return reportsLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportsLoadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportsLoadFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed();

        public final int hashCode() {
            return 1311430923;
        }

        private ReportsLoadFailed() {
            super("ReportsLoadFailed", null);
        }

        public final java.lang.String toString() {
            return "ReportsLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$InitializationFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$InitializationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializationFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializationFailed(java.lang.String str) {
            super("InitializationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializationFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed initializationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initializationFailed.errorMessage;
            }
            return initializationFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqsLoaded;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FaqsLoaded extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaqsLoaded(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list) {
            super("FaqsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FaqsLoaded(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded) other).items);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded copy(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded(items);
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded faqsLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = faqsLoaded.items;
            }
            return faqsLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqsLoadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FaqsLoadFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed();

        public final int hashCode() {
            return 647798839;
        }

        private FaqsLoadFailed() {
            super("FaqsLoadFailed", null);
        }

        public final java.lang.String toString() {
            return "FaqsLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqViewMoreClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FaqViewMoreClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqViewMoreClicked INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqViewMoreClicked();

        public final int hashCode() {
            return -1769755346;
        }

        private FaqViewMoreClicked() {
            super("FaqViewMoreClicked", null);
        }

        public final java.lang.String toString() {
            return "FaqViewMoreClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqViewMoreClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqItemClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$FaqItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FaqItemClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaqItemClicked(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem) {
            super("FaqItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
            this.item = faqItem;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FaqItemClicked(item=");
            sb.append(faqItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked) other).item);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked faqItemClicked, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem faqItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                faqItem = faqItemClicked.item;
            }
            return faqItemClicked.copy(faqItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportCardClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "reportId", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "reportStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "cta", "inlineNoteToastMessage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportCardClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReportId", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "getReportStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "getCta", "getInlineNoteToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportCardClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
        private final java.lang.String inlineNoteToastMessage;
        private final java.lang.String reportId;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportCardClicked(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, java.lang.String str2) {
            super("ReportCardClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reportId = str;
            this.reportStatus = reportStatus;
            this.cta = taxReportCta;
            this.inlineNoteToastMessage = str2;
        }

        public final java.lang.String getReportId() {
            return this.reportId;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus getReportStatus() {
            return this.reportStatus;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        public final java.lang.String getInlineNoteToastMessage() {
            return this.inlineNoteToastMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reportId;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = this.reportStatus;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
            java.lang.String str2 = this.inlineNoteToastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportCardClicked(reportId=");
            sb.append(str);
            sb.append(", reportStatus=");
            sb.append(reportStatus);
            sb.append(", cta=");
            sb.append(taxReportCta);
            sb.append(", inlineNoteToastMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reportId.hashCode();
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = this.reportStatus;
            int hashCode2 = reportStatus == null ? 0 : reportStatus.hashCode();
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
            int hashCode3 = taxReportCta == null ? 0 : taxReportCta.hashCode();
            java.lang.String str = this.inlineNoteToastMessage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked reportCardClicked = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reportId, reportCardClicked.reportId) && this.reportStatus == reportCardClicked.reportStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, reportCardClicked.cta) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineNoteToastMessage, reportCardClicked.inlineNoteToastMessage);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked copy(java.lang.String reportId, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta, java.lang.String inlineNoteToastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportId, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked(reportId, reportStatus, cta, inlineNoteToastMessage);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getInlineNoteToastMessage() {
            return this.inlineNoteToastMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus getReportStatus() {
            return this.reportStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReportId() {
            return this.reportId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked reportCardClicked, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportCardClicked.reportId;
            }
            if ((i & 2) != 0) {
                reportStatus = reportCardClicked.reportStatus;
            }
            if ((i & 4) != 0) {
                taxReportCta = reportCardClicked.cta;
            }
            if ((i & 8) != 0) {
                str2 = reportCardClicked.inlineNoteToastMessage;
            }
            return reportCardClicked.copy(str, reportStatus, taxReportCta, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportLinkClicked;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "reportId", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "reportStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "cta", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReportLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReportId", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportStatus;", "getReportStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportLinkClicked extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;
        private final java.lang.String reportId;
        private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportLinkClicked(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta) {
            super("ReportLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reportId = str;
            this.reportStatus = reportStatus;
            this.cta = taxReportCta;
        }

        public final java.lang.String getReportId() {
            return this.reportId;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus getReportStatus() {
            return this.reportStatus;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reportId;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = this.reportStatus;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportLinkClicked(reportId=");
            sb.append(str);
            sb.append(", reportStatus=");
            sb.append(reportStatus);
            sb.append(", cta=");
            sb.append(taxReportCta);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reportId.hashCode();
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = this.reportStatus;
            int hashCode2 = reportStatus == null ? 0 : reportStatus.hashCode();
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
            return (((hashCode * 31) + hashCode2) * 31) + (taxReportCta != null ? taxReportCta.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked reportLinkClicked = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reportId, reportLinkClicked.reportId) && this.reportStatus == reportLinkClicked.reportStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, reportLinkClicked.cta);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked copy(java.lang.String reportId, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportId, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked(reportId, reportStatus, cta);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus getReportStatus() {
            return this.reportStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReportId() {
            return this.reportId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked reportLinkClicked, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportLinkClicked.reportId;
            }
            if ((i & 2) != 0) {
                reportStatus = reportLinkClicked.reportStatus;
            }
            if ((i & 4) != 0) {
                taxReportCta = reportLinkClicked.cta;
            }
            return reportLinkClicked.copy(str, reportStatus, taxReportCta);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$MultiSavingFormSelected;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "formId", "downloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$MultiSavingFormSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormId", "getDownloadUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MultiSavingFormSelected extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;
        private final java.lang.String formId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiSavingFormSelected(java.lang.String str, java.lang.String str2) {
            super("MultiSavingFormSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.formId = str;
            this.downloadUrl = str2;
        }

        public final java.lang.String getFormId() {
            return this.formId;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formId;
            java.lang.String str2 = this.downloadUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiSavingFormSelected(formId=");
            sb.append(str);
            sb.append(", downloadUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formId.hashCode() * 31) + this.downloadUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected multiSavingFormSelected = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formId, multiSavingFormSelected.formId) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, multiSavingFormSelected.downloadUrl);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected copy(java.lang.String formId, java.lang.String downloadUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected(formId, downloadUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormId() {
            return this.formId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.MultiSavingFormSelected multiSavingFormSelected, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = multiSavingFormSelected.formId;
            }
            if ((i & 2) != 0) {
                str2 = multiSavingFormSelected.downloadUrl;
            }
            return multiSavingFormSelected.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RequestReconTaxDocument;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "cta", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RequestReconTaxDocument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "getCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestReconTaxDocument extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestReconTaxDocument(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta) {
            super("RequestReconTaxDocument", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportCta, "");
            this.cta = taxReportCta;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta = this.cta;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestReconTaxDocument(cta=");
            sb.append(taxReportCta);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cta.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument) && kotlin.jvm.internal.Intrinsics.areEqual(this.cta, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument) other).cta);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cta, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument(cta);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta getCta() {
            return this.cta;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RequestReconTaxDocument requestReconTaxDocument, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta taxReportCta, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taxReportCta = requestReconTaxDocument.cta;
            }
            return requestReconTaxDocument.copy(taxReportCta);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestInProgress;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReconciliationRequestInProgress extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestInProgress INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestInProgress();

        public final int hashCode() {
            return -498079961;
        }

        private ReconciliationRequestInProgress() {
            super("ReconciliationRequestInProgress", null);
        }

        public final java.lang.String toString() {
            return "ReconciliationRequestInProgress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestInProgress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReconciliationRequestSuccess extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess();

        public final int hashCode() {
            return -713925778;
        }

        private ReconciliationRequestSuccess() {
            super("ReconciliationRequestSuccess", null);
        }

        public final java.lang.String toString() {
            return "ReconciliationRequestSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$ReconciliationRequestFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReconciliationRequestFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed();

        public final int hashCode() {
            return 140697458;
        }

        private ReconciliationRequestFailed() {
            super("ReconciliationRequestFailed", null);
        }

        public final java.lang.String toString() {
            return "ReconciliationRequestFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestInProgress;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelfCorrectionRequestInProgress extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestInProgress INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestInProgress();

        public final int hashCode() {
            return -616453856;
        }

        private SelfCorrectionRequestInProgress() {
            super("SelfCorrectionRequestInProgress", null);
        }

        public final java.lang.String toString() {
            return "SelfCorrectionRequestInProgress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestInProgress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "deepLink", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelfCorrectionRequestSuccess extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String deepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfCorrectionRequestSuccess(java.lang.String str) {
            super("SelfCorrectionRequestSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.deepLink = str;
        }

        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deepLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelfCorrectionRequestSuccess(deepLink=");
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
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess) other).deepLink);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess copy(java.lang.String deepLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess(deepLink);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeepLink() {
            return this.deepLink;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess selfCorrectionRequestSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selfCorrectionRequestSuccess.deepLink;
            }
            return selfCorrectionRequestSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$SelfCorrectionRequestFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelfCorrectionRequestFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed();

        public final int hashCode() {
            return 351176171;
        }

        private SelfCorrectionRequestFailed() {
            super("SelfCorrectionRequestFailed", null);
        }

        public final java.lang.String toString() {
            return "SelfCorrectionRequestFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadStarted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "downloadUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadStarted extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
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
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted) other).downloadUrl);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted copy(java.lang.String downloadUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted(downloadUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted downloadStarted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloadStarted.downloadUrl;
            }
            return downloadStarted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadCompleted;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Landroid/net/Uri;", "fileUri", "", "fileName", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/net/Uri;", "getFileUri", "Ljava/lang/String;", "getFileName", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadCompleted extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 8;
        private final java.lang.String fileName;
        private final android.net.Uri fileUri;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadCompleted(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            super("DownloadCompleted", null);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadCompleted(fileUri=");
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
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted downloadCompleted = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileUri, downloadCompleted.fileUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, downloadCompleted.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, downloadCompleted.mimeType);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted copy(android.net.Uri fileUri, java.lang.String fileName, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted(fileUri, fileName, mimeType);
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

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted downloadCompleted, android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = downloadCompleted.fileUri;
            }
            if ((i & 2) != 0) {
                str = downloadCompleted.fileName;
            }
            if ((i & 4) != 0) {
                str2 = downloadCompleted.mimeType;
            }
            return downloadCompleted.copy(uri, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadFailed;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DownloadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadFailed extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadFailed(java.lang.String str) {
            super("DownloadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed downloadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloadFailed.errorMessage;
            }
            return downloadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RetryDownload;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "", "downloadUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$RetryDownload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryDownload extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryDownload(java.lang.String str) {
            super("RetryDownload", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.downloadUrl = str;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.downloadUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryDownload(downloadUrl=");
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
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload) other).downloadUrl);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload copy(java.lang.String downloadUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload(downloadUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload retryDownload, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryDownload.downloadUrl;
            }
            return retryDownload.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent$DismissDownloadError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDownloadError extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError();

        public final int hashCode() {
            return 952635949;
        }

        private DismissDownloadError() {
            super("DismissDownloadError", null);
        }

        public final java.lang.String toString() {
            return "DismissDownloadError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ TaxDocumentsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

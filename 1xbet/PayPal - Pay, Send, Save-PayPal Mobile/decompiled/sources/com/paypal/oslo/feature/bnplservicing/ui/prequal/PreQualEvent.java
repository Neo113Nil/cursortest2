package com.paypal.oslo.feature.bnplservicing.ui.prequal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadData", "Error", "DataLoaded", "BackPressed", "ClosePressed", "FaqToggled", "LegalConsentLinkClicked", "OnReloadingAmount", "AmountDataReloaded", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$AmountDataReloaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$FaqToggled;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$LegalConsentLinkClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$OnReloadingAmount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PreQualEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PreQualEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadData extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LoadData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LoadData();

        public final int hashCode() {
            return 261391189;
        }

        private LoadData() {
            super("LoadData", null);
        }

        public final java.lang.String toString() {
            return "LoadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LoadData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$Error;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error();

        public final int hashCode() {
            return 1134755459;
        }

        private Error() {
            super("Error", null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "model", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualUiModel;", "getModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preQualUiModel, "");
            this.model = preQualUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel = this.model;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(model=");
            sb.append(preQualUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded) other).model);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded copy(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded(model);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel getModel() {
            return this.model;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualUiModel preQualUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                preQualUiModel = dataLoaded.model;
            }
            return dataLoaded.copy(preQualUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$BackPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed();

        public final int hashCode() {
            return 2103501174;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed();

        public final int hashCode() {
            return 1176773167;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$FaqToggled;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "", "faqId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$FaqToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFaqId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FaqToggled extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        private final java.lang.String faqId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaqToggled(java.lang.String str) {
            super("FaqToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.faqId = str;
        }

        public final java.lang.String getFaqId() {
            return this.faqId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.faqId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FaqToggled(faqId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.faqId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) && kotlin.jvm.internal.Intrinsics.areEqual(this.faqId, ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled) other).faqId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled copy(java.lang.String faqId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled(faqId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFaqId() {
            return this.faqId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.FaqToggled faqToggled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = faqToggled.faqId;
            }
            return faqToggled.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$LegalConsentLinkClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$LegalConsentLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LegalConsentLinkClicked extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegalConsentLinkClicked(java.lang.String str) {
            super("LegalConsentLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalConsentLinkClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.LegalConsentLinkClicked legalConsentLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = legalConsentLinkClicked.url;
            }
            return legalConsentLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$OnReloadingAmount;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReloadingAmount extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.OnReloadingAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.OnReloadingAmount();

        public final int hashCode() {
            return 1195817341;
        }

        private OnReloadingAmount() {
            super("OnReloadingAmount", null);
        }

        public final java.lang.String toString() {
            return "OnReloadingAmount";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.OnReloadingAmount)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$AmountDataReloaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent;", "", "formattedAmount", "", "preQualificationEligible", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/bnplservicing/ui/prequal/PreQualEvent$AmountDataReloaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "Z", "getPreQualificationEligible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountDataReloaded extends com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final boolean preQualificationEligible;

        public AmountDataReloaded(java.lang.String str, boolean z) {
            super("AmountDataReloaded", null);
            this.formattedAmount = str;
            this.preQualificationEligible = z;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            boolean z = this.preQualificationEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountDataReloaded(formattedAmount=");
            sb.append(str);
            sb.append(", preQualificationEligible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.formattedAmount;
            return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preQualificationEligible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded amountDataReloaded = (com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, amountDataReloaded.formattedAmount) && this.preQualificationEligible == amountDataReloaded.preQualificationEligible;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded copy(java.lang.String formattedAmount, boolean preQualificationEligible) {
            return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded(formattedAmount, preQualificationEligible);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualEvent.AmountDataReloaded amountDataReloaded, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountDataReloaded.formattedAmount;
            }
            if ((i & 2) != 0) {
                z = amountDataReloaded.preQualificationEligible;
            }
            return amountDataReloaded.copy(str, z);
        }
    }

    public /* synthetic */ PreQualEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

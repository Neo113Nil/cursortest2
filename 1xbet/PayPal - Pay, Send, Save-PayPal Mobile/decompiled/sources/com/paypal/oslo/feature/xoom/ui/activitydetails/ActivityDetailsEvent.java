package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "OnInitialized", "OnSendAgainClick", "OnUnlinkedUserEncountered", "OnForbiddenUserEncountered", "OnInactiveUserEncountered", "OnNetworkError", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnForbiddenUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInactiveUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnNetworkError;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnSendAgainClick;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnUnlinkedUserEncountered;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ActivityDetailsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ActivityDetailsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$Initialize;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInvoiceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String invoiceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.invoiceId = str;
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.invoiceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(invoiceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.invoiceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize) other).invoiceId);
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize copy(java.lang.String invoiceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize(invoiceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize initialize, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.invoiceId;
            }
            return initialize.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInitialized;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitialized extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInitialized(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel) {
            super("OnInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsUiModel, "");
            this.uiModel = activityDetailsUiModel;
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitialized(uiModel=");
            sb.append(activityDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized copy(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized onInitialized, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel activityDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsUiModel = onInitialized.uiModel;
            }
            return onInitialized.copy(activityDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnSendAgainClick;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "", "url", "refTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnSendAgainClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getRefTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSendAgainClick extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        private final java.lang.String refTag;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSendAgainClick(java.lang.String str, java.lang.String str2) {
            super("OnSendAgainClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.url = str;
            this.refTag = str2;
        }

        public final java.lang.String getRefTag() {
            return this.refTag;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.refTag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSendAgainClick(url=");
            sb.append(str);
            sb.append(", refTag=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + this.refTag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick onSendAgainClick = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, onSendAgainClick.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.refTag, onSendAgainClick.refTag);
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick copy(java.lang.String url, java.lang.String refTag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refTag, "");
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick(url, refTag);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRefTag() {
            return this.refTag;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick onSendAgainClick, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSendAgainClick.url;
            }
            if ((i & 2) != 0) {
                str2 = onSendAgainClick.refTag;
            }
            return onSendAgainClick.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnUnlinkedUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUnlinkedUserEncountered extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnUnlinkedUserEncountered INSTANCE = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnUnlinkedUserEncountered();

        public final int hashCode() {
            return -1435165572;
        }

        private OnUnlinkedUserEncountered() {
            super("OnUnlinkedUserEncountered", null);
        }

        public final java.lang.String toString() {
            return "OnUnlinkedUserEncountered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnUnlinkedUserEncountered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnForbiddenUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "", "titleRes", "descriptionRes", "primaryButtonTextRes", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnForbiddenUserEncountered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "getPrimaryButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnForbiddenUserEncountered extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int primaryButtonTextRes;
        private final int titleRes;

        public OnForbiddenUserEncountered(int i, int i2, int i3) {
            super("OnForbiddenUserEncountered", null);
            this.titleRes = i;
            this.descriptionRes = i2;
            this.primaryButtonTextRes = i3;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            int i2 = this.descriptionRes;
            int i3 = this.primaryButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnForbiddenUserEncountered(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(i2);
            sb.append(", primaryButtonTextRes=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.titleRes) * 31) + java.lang.Integer.hashCode(this.descriptionRes)) * 31) + java.lang.Integer.hashCode(this.primaryButtonTextRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered)) {
                return false;
            }
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered onForbiddenUserEncountered = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered) other;
            return this.titleRes == onForbiddenUserEncountered.titleRes && this.descriptionRes == onForbiddenUserEncountered.descriptionRes && this.primaryButtonTextRes == onForbiddenUserEncountered.primaryButtonTextRes;
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered copy(int titleRes, int descriptionRes, int primaryButtonTextRes) {
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered(titleRes, descriptionRes, primaryButtonTextRes);
        }

        /* renamed from: component3, reason: from getter */
        public final int getPrimaryButtonTextRes() {
            return this.primaryButtonTextRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered onForbiddenUserEncountered, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = onForbiddenUserEncountered.titleRes;
            }
            if ((i4 & 2) != 0) {
                i2 = onForbiddenUserEncountered.descriptionRes;
            }
            if ((i4 & 4) != 0) {
                i3 = onForbiddenUserEncountered.primaryButtonTextRes;
            }
            return onForbiddenUserEncountered.copy(i, i2, i3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInactiveUserEncountered;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "failedPaymentInfo", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "copy", "(Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;)Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnInactiveUserEncountered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "getFailedPaymentInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInactiveUserEncountered extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInactiveUserEncountered(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            super("OnInactiveUserEncountered", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            this.failedPaymentInfo = failedPaymentInfo;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo = this.failedPaymentInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInactiveUserEncountered(failedPaymentInfo=");
            sb.append(failedPaymentInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedPaymentInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedPaymentInfo, ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered) other).failedPaymentInfo);
        }

        public final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered copy(com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedPaymentInfo, "");
            return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered(failedPaymentInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo getFailedPaymentInfo() {
            return this.failedPaymentInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered copy$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered onInactiveUserEncountered, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failedPaymentInfo = onInactiveUserEncountered.failedPaymentInfo;
            }
            return onInactiveUserEncountered.copy(failedPaymentInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent$OnNetworkError;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNetworkError extends com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError INSTANCE = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError();

        public final int hashCode() {
            return 1062326867;
        }

        private OnNetworkError() {
            super("OnNetworkError", null);
        }

        public final java.lang.String toString() {
            return "OnNetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ActivityDetailsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnAlertReceived", "OnAlertExpired", "OnYesClicked", "OnNoClicked", "OnConfirmSuccess", "OnDenySuccess", "OnProcessError", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertExpired;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertReceived;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnConfirmSuccess;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnDenySuccess;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnNoClicked;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnProcessError;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnYesClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UnifiedAlertEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private UnifiedAlertEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertReceived;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAlertReceived extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAlertReceived(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str) {
            super("OnAlertReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.alertData = unifiedAlert;
            this.source = str;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAlertReceived(alertData=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.alertData.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived onAlertReceived = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, onAlertReceived.alertData) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, onAlertReceived.source);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived(alertData, source);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived onAlertReceived, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = onAlertReceived.alertData;
            }
            if ((i & 2) != 0) {
                str = onAlertReceived.source;
            }
            return onAlertReceived.copy(unifiedAlert, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertExpired;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnAlertExpired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAlertExpired extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAlertExpired(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert) {
            super("OnAlertExpired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            this.alertData = unifiedAlert;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAlertExpired(alertData=");
            sb.append(unifiedAlert);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.alertData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired) other).alertData);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired(alertData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired onAlertExpired, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = onAlertExpired.alertData;
            }
            return onAlertExpired.copy(unifiedAlert);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnYesClicked;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnYesClicked extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnYesClicked INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnYesClicked();

        public final int hashCode() {
            return -323337038;
        }

        private OnYesClicked() {
            super("OnYesClicked", null);
        }

        public final java.lang.String toString() {
            return "OnYesClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnYesClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnNoClicked;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNoClicked extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnNoClicked INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnNoClicked();

        public final int hashCode() {
            return 442410868;
        }

        private OnNoClicked() {
            super("OnNoClicked", null);
        }

        public final java.lang.String toString() {
            return "OnNoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnNoClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnConfirmSuccess;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmSuccess extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess();

        public final int hashCode() {
            return 1926201749;
        }

        private OnConfirmSuccess() {
            super("OnConfirmSuccess", null);
        }

        public final java.lang.String toString() {
            return "OnConfirmSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnDenySuccess;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDenySuccess extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnDenySuccess INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnDenySuccess();

        public final int hashCode() {
            return 1643098405;
        }

        private OnDenySuccess() {
            super("OnDenySuccess", null);
        }

        public final java.lang.String toString() {
            return "OnDenySuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnDenySuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent$OnProcessError;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProcessError extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnProcessError INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnProcessError();

        public final int hashCode() {
            return -65761845;
        }

        private OnProcessError() {
            super("OnProcessError", null);
        }

        public final java.lang.String toString() {
            return "OnProcessError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnProcessError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ UnifiedAlertEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

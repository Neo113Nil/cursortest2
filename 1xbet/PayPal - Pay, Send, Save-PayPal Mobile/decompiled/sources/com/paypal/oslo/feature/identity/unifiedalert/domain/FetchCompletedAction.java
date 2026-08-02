package com.paypal.oslo.feature.identity.unifiedalert.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "ShowAlert", "ShowNoAlertScreen", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$None;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowAlert;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowNoAlertScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FetchCompletedAction {
    public static final int $stable = 0;

    private FetchCompletedAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$None;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None();

        public final int hashCode() {
            return 234086010;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowAlert;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alert", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowAlert;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlert", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAlert extends com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alert;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAlert(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
            this.alert = unifiedAlert;
            this.source = unifiedAlertSource;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlert() {
            return this.alert;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alert;
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowAlert(alert=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(unifiedAlertSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.alert.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert showAlert = (com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alert, showAlert.alert) && this.source == showAlert.source;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert(alert, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlert() {
            return this.alert;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert copy$default(com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert showAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = showAlert.alert;
            }
            if ((i & 2) != 0) {
                unifiedAlertSource = showAlert.source;
            }
            return showAlert.copy(unifiedAlert, unifiedAlertSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowNoAlertScreen;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)Lcom/paypal/oslo/feature/identity/unifiedalert/domain/FetchCompletedAction$ShowNoAlertScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowNoAlertScreen extends com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNoAlertScreen(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
            this.source = unifiedAlertSource;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowNoAlertScreen(source=");
            sb.append(unifiedAlertSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen) && this.source == ((com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen) other).source;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen(source);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen copy$default(com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen showNoAlertScreen, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlertSource = showNoAlertScreen.source;
            }
            return showNoAlertScreen.copy(unifiedAlertSource);
        }
    }

    public /* synthetic */ FetchCompletedAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

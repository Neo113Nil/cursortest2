package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "AppPermissions", "ConnectionDetail", "EmailPermissions", "ConsentAgreement", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$AppPermissions;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConnectionDetail;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConsentAgreement;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$EmailPermissions;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ConnectedAppsDetailState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$None;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None();

        public final int hashCode() {
            return 134006775;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$AppPermissions;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$AppPermissions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "getApp"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AppPermissions implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem app;

        public AppPermissions(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
            this.app = connectedAppItem;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem getApp() {
            return this.app;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem = this.app;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppPermissions(app=");
            sb.append(connectedAppItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.app.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.app, ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions) other).app);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions copy(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem app2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions(app2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem getApp() {
            return this.app;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions appPermissions, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                connectedAppItem = appPermissions.app;
            }
            return appPermissions.copy(connectedAppItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConnectionDetail;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConnectionDetail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "getApp"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConnectionDetail implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app;

        public ConnectionDetail(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
            this.app = sharingInfoAppItem;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getApp() {
            return this.app;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem = this.app;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionDetail(app=");
            sb.append(sharingInfoAppItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.app.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.app, ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail) other).app);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail copy(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail(app2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getApp() {
            return this.app;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail connectionDetail, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sharingInfoAppItem = connectionDetail.app;
            }
            return connectionDetail.copy(sharingInfoAppItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$EmailPermissions;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;)V", "component1", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "copy", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$EmailPermissions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "getApp"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailPermissions implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app;

        public EmailPermissions(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
            this.app = sharingInfoAppItem;
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getApp() {
            return this.app;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem = this.app;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailPermissions(app=");
            sb.append(sharingInfoAppItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.app.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions) && kotlin.jvm.internal.Intrinsics.areEqual(this.app, ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions) other).app);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions copy(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem app2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions(app2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getApp() {
            return this.app;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions emailPermissions, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sharingInfoAppItem = emailPermissions.app;
            }
            return emailPermissions.copy(sharingInfoAppItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConsentAgreement;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState$ConsentAgreement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsentAgreement implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState {
        public static final int $stable = 0;
        private final java.lang.String url;

        public ConsentAgreement(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsentAgreement(url=");
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
            return (other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement) other).url);
        }

        public final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement consentAgreement, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = consentAgreement.url;
            }
            return consentAgreement.copy(str);
        }
    }
}

package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode;", "", "<init>", "()V", "Foreground", "Deeplink", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Deeplink;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Foreground;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UnifiedAlertInitMode {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Foreground;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "source", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)V", "component1", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "component2", "()Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "copy", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Foreground;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getAlertData", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Foreground extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData;
        private final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Foreground(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlert, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertSource, "");
            this.alertData = unifiedAlert;
            this.source = unifiedAlertSource;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = this.alertData;
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Foreground(alertData=");
            sb.append(unifiedAlert);
            sb.append(", source=");
            sb.append(unifiedAlertSource);
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
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground foreground = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alertData, foreground.alertData) && this.source == foreground.source;
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground copy(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground(alertData, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getAlertData() {
            return this.alertData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground foreground, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource unifiedAlertSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                unifiedAlert = foreground.alertData;
            }
            if ((i & 2) != 0) {
                unifiedAlertSource = foreground.source;
            }
            return foreground.copy(unifiedAlert, unifiedAlertSource);
        }
    }

    private UnifiedAlertInitMode() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Deeplink;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode;", "", "docId", "", "expiryTime", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertInitMode$Deeplink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocId", "Ljava/lang/Long;", "getExpiryTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Deeplink extends com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode {
        public static final int $stable = 0;
        private final java.lang.String docId;
        private final java.lang.Long expiryTime;

        public Deeplink(java.lang.String str, java.lang.Long l) {
            super(null);
            this.docId = str;
            this.expiryTime = l;
        }

        public /* synthetic */ Deeplink(java.lang.String str, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : l);
        }

        public final java.lang.String getDocId() {
            return this.docId;
        }

        public final java.lang.Long getExpiryTime() {
            return this.expiryTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.docId;
            java.lang.Long l = this.expiryTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Deeplink(docId=");
            sb.append(str);
            sb.append(", expiryTime=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.docId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Long l = this.expiryTime;
            return (hashCode * 31) + (l != null ? l.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink deeplink = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.docId, deeplink.docId) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, deeplink.expiryTime);
        }

        public final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink copy(java.lang.String docId, java.lang.Long expiryTime) {
            return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink(docId, expiryTime);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getExpiryTime() {
            return this.expiryTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocId() {
            return this.docId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink copy$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink deeplink, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deeplink.docId;
            }
            if ((i & 2) != 0) {
                l = deeplink.expiryTime;
            }
            return deeplink.copy(str, l);
        }
    }

    public /* synthetic */ UnifiedAlertInitMode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

package com.paypal.oslo.feature.inappcheckout.analytics.econsent;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "", "<init>", "()V", "ScreenShown", "ScreenLoaded", "ScreenDismissed", "ComponentViewed", "ComponentClicked", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentClicked;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentViewed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenShown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EConsentAnalyticsEvent {
    public static final int $stable = 0;

    private EConsentAnalyticsEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenShown;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenShown extends com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenShown INSTANCE = new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenShown();

        public final int hashCode() {
            return -1545598700;
        }

        private ScreenShown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ScreenShown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenShown)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLoaded extends com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenLoaded INSTANCE = new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenLoaded();

        public final int hashCode() {
            return -863294366;
        }

        private ScreenLoaded() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ScreenLoaded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenLoaded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenDismissed extends com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenDismissed INSTANCE = new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenDismissed();

        public final int hashCode() {
            return -1373368532;
        }

        private ScreenDismissed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ScreenDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ScreenDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentViewed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "", "compName", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentViewed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompName", "getItemName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentViewed extends com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent {
        public static final int $stable = 0;
        private final java.lang.String compName;
        private final java.lang.String itemName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentViewed(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.compName = str;
            this.itemName = str2;
        }

        public /* synthetic */ ComponentViewed(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getCompName() {
            return this.compName;
        }

        public final java.lang.String getItemName() {
            return this.itemName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.compName;
            java.lang.String str2 = this.itemName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentViewed(compName=");
            sb.append(str);
            sb.append(", itemName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.compName.hashCode();
            java.lang.String str = this.itemName;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed componentViewed = (com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.compName, componentViewed.compName) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemName, componentViewed.itemName);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed copy(java.lang.String compName, java.lang.String itemName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compName, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed(compName, itemName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getItemName() {
            return this.itemName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompName() {
            return this.compName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed copy$default(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentViewed componentViewed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentViewed.compName;
            }
            if ((i & 2) != 0) {
                str2 = componentViewed.itemName;
            }
            return componentViewed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentClicked;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent;", "", "compName", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsEvent$ComponentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompName", "getItemName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentClicked extends com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent {
        public static final int $stable = 0;
        private final java.lang.String compName;
        private final java.lang.String itemName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentClicked(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.compName = str;
            this.itemName = str2;
        }

        public /* synthetic */ ComponentClicked(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getCompName() {
            return this.compName;
        }

        public final java.lang.String getItemName() {
            return this.itemName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.compName;
            java.lang.String str2 = this.itemName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentClicked(compName=");
            sb.append(str);
            sb.append(", itemName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.compName.hashCode();
            java.lang.String str = this.itemName;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked componentClicked = (com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.compName, componentClicked.compName) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemName, componentClicked.itemName);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked copy(java.lang.String compName, java.lang.String itemName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compName, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked(compName, itemName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getItemName() {
            return this.itemName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompName() {
            return this.compName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked copy$default(com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked componentClicked, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentClicked.compName;
            }
            if ((i & 2) != 0) {
                str2 = componentClicked.itemName;
            }
            return componentClicked.copy(str, str2);
        }
    }

    public /* synthetic */ EConsentAnalyticsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

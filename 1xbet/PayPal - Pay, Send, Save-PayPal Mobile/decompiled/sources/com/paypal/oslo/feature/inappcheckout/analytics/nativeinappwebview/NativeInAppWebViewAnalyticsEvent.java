package com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent;", "", "<init>", "()V", "ScreenShown", "ScreenLoaded", "ScreenDismissed", "ComponentClicked", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ComponentClicked;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenShown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class NativeInAppWebViewAnalyticsEvent {
    public static final int $stable = 0;

    private NativeInAppWebViewAnalyticsEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenShown;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent;", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenShown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenShown extends com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent {
        public static final int $stable = 0;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenShown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.source = str;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenShown(source=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown) other).source);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown copy(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown(source);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown copy$default(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenShown screenShown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = screenShown.source;
            }
            return screenShown.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenLoaded;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent;", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLoaded extends com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent {
        public static final int $stable = 0;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenLoaded(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.source = str;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenLoaded(source=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded) other).source);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded copy(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded(source);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded copy$default(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenLoaded screenLoaded, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = screenLoaded.source;
            }
            return screenLoaded.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenDismissed;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent;", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ScreenDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenDismissed extends com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent {
        public static final int $stable = 0;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenDismissed(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.source = str;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenDismissed(source=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed) other).source);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed copy(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed(source);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed copy$default(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ScreenDismissed screenDismissed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = screenDismissed.source;
            }
            return screenDismissed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ComponentClicked;", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent;", "", "compName", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsEvent$ComponentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompName", "getItemName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ComponentClicked extends com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent {
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
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked componentClicked = (com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.compName, componentClicked.compName) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemName, componentClicked.itemName);
        }

        public final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked copy(java.lang.String compName, java.lang.String itemName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compName, "");
            return new com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked(compName, itemName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getItemName() {
            return this.itemName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompName() {
            return this.compName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked copy$default(com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsEvent.ComponentClicked componentClicked, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentClicked.compName;
            }
            if ((i & 2) != 0) {
                str2 = componentClicked.itemName;
            }
            return componentClicked.copy(str, str2);
        }
    }

    public /* synthetic */ NativeInAppWebViewAnalyticsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

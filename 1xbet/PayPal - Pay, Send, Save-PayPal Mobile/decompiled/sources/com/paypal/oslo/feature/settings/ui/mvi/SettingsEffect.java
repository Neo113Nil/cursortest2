package com.paypal.oslo.feature.settings.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "NavigateToDestination", "LogoutSuccessful", "TurnOnPushNotificationsTapped", "NavigateToFingerprintConfirmation", "NavigateToLLSConfirmation", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$LogoutSuccessful;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToDestination;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToFingerprintConfirmation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToLLSConfirmation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$TurnOnPushNotificationsTapped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SettingsEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private SettingsEffect() {
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return "SettingsEffect";
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToDestination;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "itemId", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/lang/String;", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Ljava/lang/String;", "getItemId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDestination extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;
        private final java.lang.String itemId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
            this.itemId = str;
        }

        public /* synthetic */ NavigateToDestination(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(navKey, (i & 2) != 0 ? null : str);
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String getItemId() {
            return this.itemId;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.String str = this.itemId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDestination(destination=");
            sb.append(navKey);
            sb.append(", itemId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.destination.hashCode();
            java.lang.String str = this.itemId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination)) {
                return false;
            }
            com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination navigateToDestination = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, navigateToDestination.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, navigateToDestination.itemId);
        }

        public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination copy(androidx.navigation3.runtime.NavKey destination, java.lang.String itemId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination(destination, itemId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getItemId() {
            return this.itemId;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination navigateToDestination, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigateToDestination.destination;
            }
            if ((i & 2) != 0) {
                str = navigateToDestination.itemId;
            }
            return navigateToDestination.copy(navKey, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$LogoutSuccessful;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LogoutSuccessful extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.LogoutSuccessful INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.LogoutSuccessful();

        public final int hashCode() {
            return -114833328;
        }

        private LogoutSuccessful() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LogoutSuccessful";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.LogoutSuccessful)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$TurnOnPushNotificationsTapped;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TurnOnPushNotificationsTapped extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.TurnOnPushNotificationsTapped INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.TurnOnPushNotificationsTapped();

        public final int hashCode() {
            return 466592818;
        }

        private TurnOnPushNotificationsTapped() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TurnOnPushNotificationsTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.TurnOnPushNotificationsTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToFingerprintConfirmation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToFingerprintConfirmation extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToFingerprintConfirmation INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToFingerprintConfirmation();

        public final int hashCode() {
            return 1608451777;
        }

        private NavigateToFingerprintConfirmation() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToFingerprintConfirmation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToFingerprintConfirmation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect$NavigateToLLSConfirmation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLLSConfirmation extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToLLSConfirmation INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToLLSConfirmation();

        public final int hashCode() {
            return 411051600;
        }

        private NavigateToLLSConfirmation() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToLLSConfirmation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToLLSConfirmation)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SettingsEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

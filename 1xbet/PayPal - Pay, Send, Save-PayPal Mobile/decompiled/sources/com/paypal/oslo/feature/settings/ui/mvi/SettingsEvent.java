package com.paypal.oslo.feature.settings.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "UserIntent", "SystemEvent", "DataEvent", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SettingsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private SettingsEvent() {
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return "SettingsEvent";
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "<init>", "()V", "SettingsLaunched", "RetryAllTapped", "ToggleBiometrics", "ToggleLLS", "TapLogout", "TapCloseAccount", "TapLegalAgreements", "TapToNavigate", "TapTurnOnPushNotifications", "AcknowledgeLogoutFailure", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$AcknowledgeLogoutFailure;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$RetryAllTapped;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$SettingsLaunched;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapCloseAccount;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapLegalAgreements;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapLogout;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapToNavigate;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapTurnOnPushNotifications;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleBiometrics;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleLLS;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserIntent extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent {
        public static final int $stable = 0;

        private UserIntent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$SettingsLaunched;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SettingsLaunched extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.SettingsLaunched INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.SettingsLaunched();

            private SettingsLaunched() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$RetryAllTapped;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RetryAllTapped extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.RetryAllTapped INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.RetryAllTapped();

            private RetryAllTapped() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleBiometrics;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleBiometrics;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ToggleBiometrics extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            private final boolean enabled;

            public ToggleBiometrics(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleBiometrics(enabled=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics) && this.enabled == ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics) other).enabled;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics copy(boolean enabled) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics(enabled);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleBiometrics toggleBiometrics, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = toggleBiometrics.enabled;
                }
                return toggleBiometrics.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleLLS;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$ToggleLLS;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ToggleLLS extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            private final boolean enabled;

            public ToggleLLS(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleLLS(enabled=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS) && this.enabled == ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS) other).enabled;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS copy(boolean enabled) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS(enabled);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.ToggleLLS toggleLLS, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = toggleLLS.enabled;
                }
                return toggleLLS.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapLogout;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TapLogout extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLogout INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLogout();

            private TapLogout() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapCloseAccount;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TapCloseAccount extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapCloseAccount INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapCloseAccount();

            private TapCloseAccount() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapLegalAgreements;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TapLegalAgreements extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLegalAgreements INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLegalAgreements();

            private TapLegalAgreements() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapToNavigate;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "itemId", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/lang/String;", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapToNavigate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Ljava/lang/String;", "getItemId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TapToNavigate extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 8;
            private final androidx.navigation3.runtime.NavKey destination;
            private final java.lang.String itemId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TapToNavigate(androidx.navigation3.runtime.NavKey navKey, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
                this.destination = navKey;
                this.itemId = str;
            }

            public /* synthetic */ TapToNavigate(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TapToNavigate(destination=");
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
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate tapToNavigate = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, tapToNavigate.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, tapToNavigate.itemId);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate copy(androidx.navigation3.runtime.NavKey destination, java.lang.String itemId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate(destination, itemId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getItemId() {
                return this.itemId;
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.navigation3.runtime.NavKey getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapToNavigate tapToNavigate, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    navKey = tapToNavigate.destination;
                }
                if ((i & 2) != 0) {
                    str = tapToNavigate.itemId;
                }
                return tapToNavigate.copy(navKey, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$TapTurnOnPushNotifications;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TapTurnOnPushNotifications extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapTurnOnPushNotifications INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapTurnOnPushNotifications();

            private TapTurnOnPushNotifications() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent$AcknowledgeLogoutFailure;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$UserIntent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AcknowledgeLogoutFailure extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.AcknowledgeLogoutFailure INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.AcknowledgeLogoutFailure();

            private AcknowledgeLogoutFailure() {
                super(null);
            }
        }

        public /* synthetic */ UserIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "<init>", "()V", "LoadSettings", "PerformNavigation", "OnListScroll", "PerformPushNotificationOptInFlow", "PerformBiometricOptInFlow", "InitiateLogout", "LogoutCompleted", "LogoutFailed", "LogoutFailedAcknowledgementReceived", "PerformBiometricOptOutFlow", "ConfirmBiometricOptOut", "PerformLLSOptInFlow", "ConfirmLLSOptIn", "PerformLLSOptOutFlow", "RefreshPendingItems", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$ConfirmBiometricOptOut;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$ConfirmLLSOptIn;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$InitiateLogout;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LoadSettings;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutCompleted;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailedAcknowledgementReceived;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$OnListScroll;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformBiometricOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformBiometricOptOutFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformLLSOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformLLSOptOutFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformNavigation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformPushNotificationOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$RefreshPendingItems;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SystemEvent extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent {
        public static final int $stable = 0;

        private SystemEvent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LoadSettings;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LoadSettings extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LoadSettings();

            private LoadSettings() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformNavigation;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "itemId", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/lang/String;", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformNavigation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Ljava/lang/String;", "getItemId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PerformNavigation extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 8;
            private final androidx.navigation3.runtime.NavKey destination;
            private final java.lang.String itemId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformNavigation(androidx.navigation3.runtime.NavKey navKey, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
                this.destination = navKey;
                this.itemId = str;
            }

            public /* synthetic */ PerformNavigation(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PerformNavigation(destination=");
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
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation performNavigation = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, performNavigation.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, performNavigation.itemId);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation copy(androidx.navigation3.runtime.NavKey destination, java.lang.String itemId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation(destination, itemId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getItemId() {
                return this.itemId;
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.navigation3.runtime.NavKey getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformNavigation performNavigation, androidx.navigation3.runtime.NavKey navKey, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    navKey = performNavigation.destination;
                }
                if ((i & 2) != 0) {
                    str = performNavigation.itemId;
                }
                return performNavigation.copy(navKey, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$OnListScroll;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "Lkotlin/Pair;", "", "scrollIndex", "<init>", "(Lkotlin/Pair;)V", "component1", "()Lkotlin/Pair;", "copy", "(Lkotlin/Pair;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$OnListScroll;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Pair;", "getScrollIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnListScroll extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            private final kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnListScroll(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
                this.scrollIndex = pair;
            }

            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getScrollIndex() {
                return this.scrollIndex;
            }

            public final java.lang.String toString() {
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = this.scrollIndex;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OnListScroll(scrollIndex=");
                sb.append(pair);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scrollIndex.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollIndex, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll) other).scrollIndex);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll copy(kotlin.Pair<java.lang.Integer, java.lang.Integer> scrollIndex) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollIndex, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll(scrollIndex);
            }

            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component1() {
                return this.scrollIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.OnListScroll onListScroll, kotlin.Pair pair, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    pair = onListScroll.scrollIndex;
                }
                return onListScroll.copy(pair);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformPushNotificationOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PerformPushNotificationOptInFlow extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformPushNotificationOptInFlow INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformPushNotificationOptInFlow();

            private PerformPushNotificationOptInFlow() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformBiometricOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PerformBiometricOptInFlow extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow();

            public final int hashCode() {
                return -2004567801;
            }

            private PerformBiometricOptInFlow() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PerformBiometricOptInFlow";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptInFlow)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$InitiateLogout;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InitiateLogout extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.InitiateLogout INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.InitiateLogout();

            private InitiateLogout() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutCompleted;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LogoutCompleted extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutCompleted INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutCompleted();

            private LogoutCompleted() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LogoutFailed extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            private final java.lang.String errorMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LogoutFailed(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LogoutFailed(errorMessage=");
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
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed) other).errorMessage);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed copy(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed(errorMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed logoutFailed, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = logoutFailed.errorMessage;
                }
                return logoutFailed.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$LogoutFailedAcknowledgementReceived;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LogoutFailedAcknowledgementReceived extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailedAcknowledgementReceived INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailedAcknowledgementReceived();

            private LogoutFailedAcknowledgementReceived() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformBiometricOptOutFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PerformBiometricOptOutFlow extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptOutFlow INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformBiometricOptOutFlow();

            private PerformBiometricOptOutFlow() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$ConfirmBiometricOptOut;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ConfirmBiometricOptOut extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmBiometricOptOut INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmBiometricOptOut();

            private ConfirmBiometricOptOut() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformLLSOptInFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PerformLLSOptInFlow extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow();

            public final int hashCode() {
                return 1770647532;
            }

            private PerformLLSOptInFlow() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PerformLLSOptInFlow";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptInFlow)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$ConfirmLLSOptIn;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ConfirmLLSOptIn extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmLLSOptIn INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.ConfirmLLSOptIn();

            private ConfirmLLSOptIn() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$PerformLLSOptOutFlow;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PerformLLSOptOutFlow extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptOutFlow INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.PerformLLSOptOutFlow();

            private PerformLLSOptOutFlow() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent$RefreshPendingItems;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RefreshPendingItems extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems INSTANCE = new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems();

            public final int hashCode() {
                return 966948348;
            }

            private RefreshPendingItems() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RefreshPendingItems";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.RefreshPendingItems)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ SystemEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "<init>", "()V", "NetworkError", "SectionLoadedResult", "SectionLoadFailedResult", "UserStoreError", "BiometricsToggleSuccess", "BiometricsToggleFailed", "LLSToggleSuccess", "LLSToggleFailed", "AppVersionLoaded", "ItemStatusRefreshed", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$AppVersionLoaded;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleSuccess;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$ItemStatusRefreshed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleSuccess;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$NetworkError;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadFailedResult;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadedResult;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$UserStoreError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DataEvent extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent {
        public static final int $stable = 0;

        private DataEvent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$NetworkError;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NetworkError extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError) other).message);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = networkError.message;
                }
                return networkError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadedResult;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "component2", "()Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadedResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "getSection", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SectionLoadedResult extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded data;
            private final com.paypal.oslo.feature.settings.domain.model.SettingSection section;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionLoadedResult(com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingSection, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaded, "");
                this.section = settingSection;
                this.data = loaded;
            }

            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = this.section;
                com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionLoadedResult(section=");
                sb.append(settingSection);
                sb.append(", data=");
                sb.append(loaded);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.section.hashCode() * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult sectionLoadedResult = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult) other;
                return this.section == sectionLoadedResult.section && kotlin.jvm.internal.Intrinsics.areEqual(this.data, sectionLoadedResult.data);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult copy(com.paypal.oslo.feature.settings.domain.model.SettingSection section, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult(section, data);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult sectionLoadedResult, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    settingSection = sectionLoadedResult.section;
                }
                if ((i & 2) != 0) {
                    loaded = sectionLoadedResult.data;
                }
                return sectionLoadedResult.copy(settingSection, loaded);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadFailedResult;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "error", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "component2", "()Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadFailedResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "getSection", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Error;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SectionLoadFailedResult extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error;
            private final com.paypal.oslo.feature.settings.domain.model.SettingSection section;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionLoadFailedResult(com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingSection, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                this.section = settingSection;
                this.error = error;
            }

            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = this.section;
                com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionLoadFailedResult(section=");
                sb.append(settingSection);
                sb.append(", error=");
                sb.append(error);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.section.hashCode() * 31) + this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult sectionLoadFailedResult = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult) other;
                return this.section == sectionLoadFailedResult.section && kotlin.jvm.internal.Intrinsics.areEqual(this.error, sectionLoadFailedResult.error);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult copy(com.paypal.oslo.feature.settings.domain.model.SettingSection section, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult(section, error);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error getError() {
                return this.error;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult sectionLoadFailedResult, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error error, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    settingSection = sectionLoadFailedResult.section;
                }
                if ((i & 2) != 0) {
                    error = sectionLoadFailedResult.error;
                }
                return sectionLoadFailedResult.copy(settingSection, error);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$UserStoreError;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$UserStoreError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UserStoreError extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserStoreError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UserStoreError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError) other).message);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError userStoreError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = userStoreError.message;
                }
                return userStoreError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleSuccess;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BiometricsToggleSuccess extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final boolean enabled;

            public BiometricsToggleSuccess(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricsToggleSuccess(enabled=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess) && this.enabled == ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess) other).enabled;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess copy(boolean enabled) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess(enabled);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess biometricsToggleSuccess, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = biometricsToggleSuccess.enabled;
                }
                return biometricsToggleSuccess.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "enabled", "", "errorMessage", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getEnabled", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BiometricsToggleFailed extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final boolean enabled;
            private final java.lang.String errorMessage;

            public BiometricsToggleFailed(boolean z, java.lang.String str) {
                super(null);
                this.enabled = z;
                this.errorMessage = str;
            }

            public /* synthetic */ BiometricsToggleFailed(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : str);
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricsToggleFailed(enabled=");
                sb.append(z);
                sb.append(", errorMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Boolean.hashCode(this.enabled);
                java.lang.String str = this.errorMessage;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed biometricsToggleFailed = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed) other;
                return this.enabled == biometricsToggleFailed.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, biometricsToggleFailed.errorMessage);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed copy(boolean enabled, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed(enabled, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed biometricsToggleFailed, boolean z, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = biometricsToggleFailed.enabled;
                }
                if ((i & 2) != 0) {
                    str = biometricsToggleFailed.errorMessage;
                }
                return biometricsToggleFailed.copy(z, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleSuccess;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LLSToggleSuccess extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final boolean enabled;

            public LLSToggleSuccess(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LLSToggleSuccess(enabled=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.enabled);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess) && this.enabled == ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess) other).enabled;
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess copy(boolean enabled) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess(enabled);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleSuccess lLSToggleSuccess, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = lLSToggleSuccess.enabled;
                }
                return lLSToggleSuccess.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleFailed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "enabled", "", "errorMessage", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getEnabled", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LLSToggleFailed extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final boolean enabled;
            private final java.lang.String errorMessage;

            public LLSToggleFailed(boolean z, java.lang.String str) {
                super(null);
                this.enabled = z;
                this.errorMessage = str;
            }

            public /* synthetic */ LLSToggleFailed(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : str);
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LLSToggleFailed(enabled=");
                sb.append(z);
                sb.append(", errorMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Boolean.hashCode(this.enabled);
                java.lang.String str = this.errorMessage;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed lLSToggleFailed = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed) other;
                return this.enabled == lLSToggleFailed.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, lLSToggleFailed.errorMessage);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed copy(boolean enabled, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed(enabled, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed lLSToggleFailed, boolean z, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = lLSToggleFailed.enabled;
                }
                if ((i & 2) != 0) {
                    str = lLSToggleFailed.errorMessage;
                }
                return lLSToggleFailed.copy(z, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$AppVersionLoaded;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "", "appVersion", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$AppVersionLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAppVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AppVersionLoaded extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final java.lang.String appVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppVersionLoaded(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.appVersion = str;
            }

            public final java.lang.String getAppVersion() {
                return this.appVersion;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.appVersion;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AppVersionLoaded(appVersion=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.appVersion.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, ((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded) other).appVersion);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded copy(java.lang.String appVersion) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded(appVersion);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAppVersion() {
                return this.appVersion;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.AppVersionLoaded appVersionLoaded, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = appVersionLoaded.appVersion;
                }
                return appVersionLoaded.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b&\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$ItemStatusRefreshed;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "", "itemId", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "status", "statusText", "subtitle", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$ItemStatusRefreshed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "getSection", "Ljava/lang/String;", "getItemId", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "getStatus", "getStatusText", "getSubtitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ItemStatusRefreshed extends com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent {
            public static final int $stable = 0;
            private final java.lang.String itemId;
            private final com.paypal.oslo.feature.settings.domain.model.SettingSection section;
            private final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status;
            private final java.lang.String statusText;
            private final java.lang.String subtitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemStatusRefreshed(com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, java.lang.String str2, java.lang.String str3) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingSection, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.section = settingSection;
                this.itemId = str;
                this.status = settingsItemStatus;
                this.statusText = str2;
                this.subtitle = str3;
            }

            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public final java.lang.String getItemId() {
                return this.itemId;
            }

            public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus getStatus() {
                return this.status;
            }

            public final java.lang.String getStatusText() {
                return this.statusText;
            }

            public final java.lang.String getSubtitle() {
                return this.subtitle;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = this.section;
                java.lang.String str = this.itemId;
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = this.status;
                java.lang.String str2 = this.statusText;
                java.lang.String str3 = this.subtitle;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemStatusRefreshed(section=");
                sb.append(settingSection);
                sb.append(", itemId=");
                sb.append(str);
                sb.append(", status=");
                sb.append(settingsItemStatus);
                sb.append(", statusText=");
                sb.append(str2);
                sb.append(", subtitle=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.section.hashCode();
                int hashCode2 = this.itemId.hashCode();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = this.status;
                int hashCode3 = settingsItemStatus == null ? 0 : settingsItemStatus.hashCode();
                int hashCode4 = this.statusText.hashCode();
                java.lang.String str = this.subtitle;
                return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed)) {
                    return false;
                }
                com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed itemStatusRefreshed = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed) other;
                return this.section == itemStatusRefreshed.section && kotlin.jvm.internal.Intrinsics.areEqual(this.itemId, itemStatusRefreshed.itemId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, itemStatusRefreshed.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusText, itemStatusRefreshed.statusText) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, itemStatusRefreshed.subtitle);
            }

            public final com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed copy(com.paypal.oslo.feature.settings.domain.model.SettingSection section, java.lang.String itemId, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status, java.lang.String statusText, java.lang.String subtitle) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusText, "");
                return new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed(section, itemId, status, statusText, subtitle);
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getStatusText() {
                return this.statusText;
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus getStatus() {
                return this.status;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getItemId() {
                return this.itemId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.settings.domain.model.SettingSection getSection() {
                return this.section;
            }

            public static /* synthetic */ com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed copy$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed itemStatusRefreshed, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, java.lang.String str, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    settingSection = itemStatusRefreshed.section;
                }
                if ((i & 2) != 0) {
                    str = itemStatusRefreshed.itemId;
                }
                java.lang.String str4 = str;
                if ((i & 4) != 0) {
                    settingsItemStatus = itemStatusRefreshed.status;
                }
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus2 = settingsItemStatus;
                if ((i & 8) != 0) {
                    str2 = itemStatusRefreshed.statusText;
                }
                java.lang.String str5 = str2;
                if ((i & 16) != 0) {
                    str3 = itemStatusRefreshed.subtitle;
                }
                return itemStatusRefreshed.copy(settingSection, str4, settingsItemStatus2, str5, str3);
            }
        }

        public /* synthetic */ DataEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SettingsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

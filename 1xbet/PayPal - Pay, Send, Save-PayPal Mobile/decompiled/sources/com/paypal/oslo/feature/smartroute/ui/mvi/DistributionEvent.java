package com.paypal.oslo.feature.smartroute.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "UserIntent", "SystemEvent", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DistributionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;

    private DistributionEvent() {
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "DistributionEvent" : simpleName;
    }

    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "<init>", "()V", "Initialize", "SliderChanged", "AutoReloadToggled", "AutoReloadInfoClicked", "PrimaryButtonClicked", "CancelClicked", "TurnOffConfirmed", "TurnOffDialogDismissed", "AutoReloadInfoDialogDismissed", "SaveErrorRetryClicked", "SaveErrorDialogDismissed", "PyusdOptOutMaybeLaterClicked", "PyusdOptOutConfirmationConfirmed", "PyusdOptOutConfirmationCancelled", "PyusdOptOutConfirmationDismissed", "PyusdOptInButtonClicked", "PyusdOptInModalDismissed", "AutoReloadSettingsClicked", "BackClickedWithUnsavedChanges", "UnsavedChangesExitConfirmed", "UnsavedChangesBackModalDismissed", "SavingsOnboardingContinueClicked", "SavingsOnboardingDismissed", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadInfoClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadInfoDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadSettingsClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadToggled;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$BackClickedWithUnsavedChanges;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$CancelClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$Initialize;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PrimaryButtonClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptInButtonClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptInModalDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationCancelled;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationConfirmed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutMaybeLaterClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SaveErrorDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SaveErrorRetryClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SavingsOnboardingContinueClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SavingsOnboardingDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SliderChanged;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$TurnOffConfirmed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$TurnOffDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$UnsavedChangesBackModalDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$UnsavedChangesExitConfirmed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UserIntent extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent {
        public static final int $stable = 0;

        private UserIntent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$Initialize;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "initialState", "<init>", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "copy", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "getInitialState"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState initialState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initialize(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
                this.initialState = distributionScreenState;
            }

            public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getInitialState() {
                return this.initialState;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState = this.initialState;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(initialState=");
                sb.append(distributionScreenState);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.initialState.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialState, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize) other).initialState);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize copy(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState initialState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialState, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize(initialState);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getInitialState() {
                return this.initialState;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.Initialize initialize, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    distributionScreenState = initialize.initialState;
                }
                return initialize.copy(distributionScreenState);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SliderChanged;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "", "accountId", "", "newPercentage", "<init>", "(Ljava/lang/String;F)V", "component1", "()Ljava/lang/String;", "component2", "()F", "copy", "(Ljava/lang/String;F)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SliderChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getNewPercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SliderChanged extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            private final java.lang.String accountId;
            private final float newPercentage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SliderChanged(java.lang.String str, float f) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.accountId = str;
                this.newPercentage = f;
            }

            public final java.lang.String getAccountId() {
                return this.accountId;
            }

            public final float getNewPercentage() {
                return this.newPercentage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.accountId;
                float f = this.newPercentage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SliderChanged(accountId=");
                sb.append(str);
                sb.append(", newPercentage=");
                sb.append(f);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.accountId.hashCode() * 31) + java.lang.Float.hashCode(this.newPercentage);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged sliderChanged = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, sliderChanged.accountId) && java.lang.Float.compare(this.newPercentage, sliderChanged.newPercentage) == 0;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged copy(java.lang.String accountId, float newPercentage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged(accountId, newPercentage);
            }

            /* renamed from: component2, reason: from getter */
            public final float getNewPercentage() {
                return this.newPercentage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAccountId() {
                return this.accountId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged sliderChanged, java.lang.String str, float f, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = sliderChanged.accountId;
                }
                if ((i & 2) != 0) {
                    f = sliderChanged.newPercentage;
                }
                return sliderChanged.copy(str, f);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadToggled;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadToggled;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadToggled extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            private final boolean enabled;

            public AutoReloadToggled(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final java.lang.String toString() {
                boolean z = this.enabled;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadToggled(enabled=");
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
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled) && this.enabled == ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled) other).enabled;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled copy(boolean enabled) {
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled(enabled);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled autoReloadToggled, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = autoReloadToggled.enabled;
                }
                return autoReloadToggled.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadInfoClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadInfoClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoClicked();

            public final int hashCode() {
                return -267362483;
            }

            private AutoReloadInfoClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AutoReloadInfoClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PrimaryButtonClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PrimaryButtonClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked();

            public final int hashCode() {
                return -147152585;
            }

            private PrimaryButtonClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PrimaryButtonClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$CancelClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CancelClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.CancelClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.CancelClicked();

            public final int hashCode() {
                return -1070333623;
            }

            private CancelClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "CancelClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.CancelClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$TurnOffConfirmed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TurnOffConfirmed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffConfirmed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffConfirmed();

            public final int hashCode() {
                return -668594863;
            }

            private TurnOffConfirmed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "TurnOffConfirmed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffConfirmed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$TurnOffDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TurnOffDialogDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffDialogDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffDialogDismissed();

            public final int hashCode() {
                return -370481997;
            }

            private TurnOffDialogDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "TurnOffDialogDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffDialogDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadInfoDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadInfoDialogDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoDialogDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoDialogDismissed();

            public final int hashCode() {
                return 899490151;
            }

            private AutoReloadInfoDialogDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AutoReloadInfoDialogDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoDialogDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SaveErrorRetryClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveErrorRetryClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorRetryClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorRetryClicked();

            public final int hashCode() {
                return 1873691526;
            }

            private SaveErrorRetryClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SaveErrorRetryClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorRetryClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SaveErrorDialogDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveErrorDialogDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorDialogDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorDialogDismissed();

            public final int hashCode() {
                return -728127558;
            }

            private SaveErrorDialogDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SaveErrorDialogDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorDialogDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutMaybeLaterClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptOutMaybeLaterClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutMaybeLaterClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutMaybeLaterClicked();

            public final int hashCode() {
                return 811948559;
            }

            private PyusdOptOutMaybeLaterClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptOutMaybeLaterClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutMaybeLaterClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationConfirmed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptOutConfirmationConfirmed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationConfirmed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationConfirmed();

            public final int hashCode() {
                return -1232346570;
            }

            private PyusdOptOutConfirmationConfirmed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptOutConfirmationConfirmed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationConfirmed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationCancelled;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptOutConfirmationCancelled extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationCancelled INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationCancelled();

            public final int hashCode() {
                return 48351272;
            }

            private PyusdOptOutConfirmationCancelled() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptOutConfirmationCancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationCancelled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptOutConfirmationDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptOutConfirmationDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationDismissed();

            public final int hashCode() {
                return -268770432;
            }

            private PyusdOptOutConfirmationDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptOutConfirmationDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptInButtonClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptInButtonClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInButtonClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInButtonClicked();

            public final int hashCode() {
                return 141410294;
            }

            private PyusdOptInButtonClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptInButtonClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInButtonClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$PyusdOptInModalDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptInModalDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInModalDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInModalDismissed();

            public final int hashCode() {
                return 1333374267;
            }

            private PyusdOptInModalDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptInModalDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInModalDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$AutoReloadSettingsClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadSettingsClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadSettingsClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadSettingsClicked();

            public final int hashCode() {
                return -1964265416;
            }

            private AutoReloadSettingsClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AutoReloadSettingsClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadSettingsClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$BackClickedWithUnsavedChanges;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BackClickedWithUnsavedChanges extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.BackClickedWithUnsavedChanges INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.BackClickedWithUnsavedChanges();

            public final int hashCode() {
                return 362351639;
            }

            private BackClickedWithUnsavedChanges() {
                super(null);
            }

            public final java.lang.String toString() {
                return "BackClickedWithUnsavedChanges";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.BackClickedWithUnsavedChanges)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$UnsavedChangesExitConfirmed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnsavedChangesExitConfirmed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesExitConfirmed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesExitConfirmed();

            public final int hashCode() {
                return 1900618376;
            }

            private UnsavedChangesExitConfirmed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "UnsavedChangesExitConfirmed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesExitConfirmed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$UnsavedChangesBackModalDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnsavedChangesBackModalDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesBackModalDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesBackModalDismissed();

            public final int hashCode() {
                return 307414780;
            }

            private UnsavedChangesBackModalDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "UnsavedChangesBackModalDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesBackModalDismissed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SavingsOnboardingContinueClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SavingsOnboardingContinueClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingContinueClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingContinueClicked();

            public final int hashCode() {
                return 326111408;
            }

            private SavingsOnboardingContinueClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SavingsOnboardingContinueClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingContinueClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent$SavingsOnboardingDismissed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$UserIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SavingsOnboardingDismissed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingDismissed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingDismissed();

            public final int hashCode() {
                return -371476519;
            }

            private SavingsOnboardingDismissed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SavingsOnboardingDismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingDismissed)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ UserIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "<init>", "()V", "Initialize", "Retry", "LoadStarted", "ConfigurationLoaded", "LoadFailed", "SaveStarted", "SaveSuccess", "SaveFailed", "PyusdOptInStarted", "PyusdOptInSuccess", "PyusdOptInFailed", "RefreshAutoReload", "AutoReloadDataRefreshed", "AutoReloadRefreshFailed", "ZeroPercentAutoReloadBlocked", "AutoReloadFlowStarted", "AutoReloadFlowStepCompleted", "AutoReloadFlowSuccess", "AutoReloadFlowFailed", "AutoReloadFlowRetryClicked", "FeatureUnavailable", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadDataRefreshed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowRetryClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStepCompleted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadRefreshFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$ConfigurationLoaded;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$FeatureUnavailable;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$Initialize;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$LoadFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$LoadStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$RefreshAutoReload;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$Retry;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$ZeroPercentAutoReloadBlocked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class SystemEvent extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent {
        public static final int $stable = 0;

        private SystemEvent() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$Initialize;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Initialize extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize();

            public final int hashCode() {
                return 1330087190;
            }

            private Initialize() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Initialize";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$Retry;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "", "currentRetryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$Retry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCurrentRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Retry extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final int currentRetryCount;

            public Retry(int i) {
                super(null);
                this.currentRetryCount = i;
            }

            public final int getCurrentRetryCount() {
                return this.currentRetryCount;
            }

            public final java.lang.String toString() {
                int i = this.currentRetryCount;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Retry(currentRetryCount=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Integer.hashCode(this.currentRetryCount);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry) && this.currentRetryCount == ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry) other).currentRetryCount;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry copy(int currentRetryCount) {
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry(currentRetryCount);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCurrentRetryCount() {
                return this.currentRetryCount;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry retry, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = retry.currentRetryCount;
                }
                return retry.copy(i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$LoadStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadStarted extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadStarted INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadStarted();

            public final int hashCode() {
                return -1065985035;
            }

            private LoadStarted() {
                super(null);
            }

            public final java.lang.String toString() {
                return "LoadStarted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadStarted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$ConfigurationLoaded;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "screenState", "<init>", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "copy", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$ConfigurationLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "getScreenState"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfigurationLoaded extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfigurationLoaded(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
                this.screenState = distributionScreenState;
            }

            public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getScreenState() {
                return this.screenState;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState = this.screenState;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigurationLoaded(screenState=");
                sb.append(distributionScreenState);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.screenState.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenState, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded) other).screenState);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded copy(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded(screenState);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getScreenState() {
                return this.screenState;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded configurationLoaded, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    distributionScreenState = configurationLoaded.screenState;
                }
                return configurationLoaded.copy(distributionScreenState);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$LoadFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "", "errorMessage", "", "retryCount", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$LoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getErrorMessage", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final java.lang.String errorMessage;
            private final int retryCount;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadFailed(java.lang.String str, int i) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
                this.retryCount = i;
            }

            public /* synthetic */ LoadFailed(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? 0 : i);
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final int getRetryCount() {
                return this.retryCount;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                int i = this.retryCount;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadFailed(errorMessage=");
                sb.append(str);
                sb.append(", retryCount=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.errorMessage.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed loadFailed = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, loadFailed.errorMessage) && this.retryCount == loadFailed.retryCount;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed copy(java.lang.String errorMessage, int retryCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed(errorMessage, retryCount);
            }

            /* renamed from: component2, reason: from getter */
            public final int getRetryCount() {
                return this.retryCount;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed loadFailed, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = loadFailed.errorMessage;
                }
                if ((i2 & 2) != 0) {
                    i = loadFailed.retryCount;
                }
                return loadFailed.copy(str, i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveStarted extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveStarted INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveStarted();

            public final int hashCode() {
                return 137451390;
            }

            private SaveStarted() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SaveStarted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveStarted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "toastMessage", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "getConfiguration", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveSuccess extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration;
            private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaveSuccess(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionConfiguration, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
                this.configuration = distributionConfiguration;
                this.toastMessage = toastMessage;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
                return this.configuration;
            }

            public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
                return this.toastMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = this.configuration;
                com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage = this.toastMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveSuccess(configuration=");
                sb.append(distributionConfiguration);
                sb.append(", toastMessage=");
                sb.append(toastMessage);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.configuration.hashCode() * 31) + this.toastMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess saveSuccess = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, saveSuccess.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, saveSuccess.toastMessage);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess copy(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess(configuration, toastMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
                return this.toastMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
                return this.configuration;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess saveSuccess, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    distributionConfiguration = saveSuccess.configuration;
                }
                if ((i & 2) != 0) {
                    toastMessage = saveSuccess.toastMessage;
                }
                return saveSuccess.copy(distributionConfiguration, toastMessage);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "", "errorMessage", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;", "validationError", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$SaveFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;", "getValidationError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final java.lang.String errorMessage;
            private final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaveFailed(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
                this.validationError = validationError;
            }

            public /* synthetic */ SaveFailed(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : validationError);
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError getValidationError() {
                return this.validationError;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError = this.validationError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveFailed(errorMessage=");
                sb.append(str);
                sb.append(", validationError=");
                sb.append(validationError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorMessage.hashCode();
                com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError = this.validationError;
                return (hashCode * 31) + (validationError == null ? 0 : validationError.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed saveFailed = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, saveFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationError, saveFailed.validationError);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed copy(java.lang.String errorMessage, com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed(errorMessage, validationError);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError getValidationError() {
                return this.validationError;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed saveFailed, java.lang.String str, com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = saveFailed.errorMessage;
                }
                if ((i & 2) != 0) {
                    validationError = saveFailed.validationError;
                }
                return saveFailed.copy(str, validationError);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptInStarted extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInStarted INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInStarted();

            public final int hashCode() {
                return 1048221024;
            }

            private PyusdOptInStarted() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PyusdOptInStarted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInStarted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "getConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptInSuccess extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PyusdOptInSuccess(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionConfiguration, "");
                this.configuration = distributionConfiguration;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
                return this.configuration;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = this.configuration;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PyusdOptInSuccess(configuration=");
                sb.append(distributionConfiguration);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.configuration.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess) other).configuration);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess copy(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess(configuration);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
                return this.configuration;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInSuccess pyusdOptInSuccess, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    distributionConfiguration = pyusdOptInSuccess.configuration;
                }
                return pyusdOptInSuccess.copy(distributionConfiguration);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$PyusdOptInFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PyusdOptInFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final java.lang.String errorMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PyusdOptInFailed(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PyusdOptInFailed(errorMessage=");
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
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed) other).errorMessage);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed copy(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed(errorMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInFailed pyusdOptInFailed, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = pyusdOptInFailed.errorMessage;
                }
                return pyusdOptInFailed.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$RefreshAutoReload;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RefreshAutoReload extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.RefreshAutoReload INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.RefreshAutoReload();

            public final int hashCode() {
                return 1188071709;
            }

            private RefreshAutoReload() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RefreshAutoReload";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.RefreshAutoReload)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadDataRefreshed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "", "autoReloadEnabled", "", "autoReloadThresholdAmount", "autoReloadAmount", "autoReloadFinancialInstrumentId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadDataRefreshed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getAutoReloadEnabled", "Ljava/lang/String;", "getAutoReloadThresholdAmount", "getAutoReloadAmount", "getAutoReloadFinancialInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadDataRefreshed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final java.lang.String autoReloadAmount;
            private final boolean autoReloadEnabled;
            private final java.lang.String autoReloadFinancialInstrumentId;
            private final java.lang.String autoReloadThresholdAmount;

            public AutoReloadDataRefreshed(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                super(null);
                this.autoReloadEnabled = z;
                this.autoReloadThresholdAmount = str;
                this.autoReloadAmount = str2;
                this.autoReloadFinancialInstrumentId = str3;
            }

            public final boolean getAutoReloadEnabled() {
                return this.autoReloadEnabled;
            }

            public final java.lang.String getAutoReloadThresholdAmount() {
                return this.autoReloadThresholdAmount;
            }

            public final java.lang.String getAutoReloadAmount() {
                return this.autoReloadAmount;
            }

            public final java.lang.String getAutoReloadFinancialInstrumentId() {
                return this.autoReloadFinancialInstrumentId;
            }

            public final java.lang.String toString() {
                boolean z = this.autoReloadEnabled;
                java.lang.String str = this.autoReloadThresholdAmount;
                java.lang.String str2 = this.autoReloadAmount;
                java.lang.String str3 = this.autoReloadFinancialInstrumentId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadDataRefreshed(autoReloadEnabled=");
                sb.append(z);
                sb.append(", autoReloadThresholdAmount=");
                sb.append(str);
                sb.append(", autoReloadAmount=");
                sb.append(str2);
                sb.append(", autoReloadFinancialInstrumentId=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Boolean.hashCode(this.autoReloadEnabled);
                java.lang.String str = this.autoReloadThresholdAmount;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.autoReloadAmount;
                int hashCode3 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.autoReloadFinancialInstrumentId;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed autoReloadDataRefreshed = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed) other;
                return this.autoReloadEnabled == autoReloadDataRefreshed.autoReloadEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadThresholdAmount, autoReloadDataRefreshed.autoReloadThresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadAmount, autoReloadDataRefreshed.autoReloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadFinancialInstrumentId, autoReloadDataRefreshed.autoReloadFinancialInstrumentId);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed copy(boolean autoReloadEnabled, java.lang.String autoReloadThresholdAmount, java.lang.String autoReloadAmount, java.lang.String autoReloadFinancialInstrumentId) {
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed(autoReloadEnabled, autoReloadThresholdAmount, autoReloadAmount, autoReloadFinancialInstrumentId);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getAutoReloadFinancialInstrumentId() {
                return this.autoReloadFinancialInstrumentId;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getAutoReloadAmount() {
                return this.autoReloadAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getAutoReloadThresholdAmount() {
                return this.autoReloadThresholdAmount;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getAutoReloadEnabled() {
                return this.autoReloadEnabled;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed autoReloadDataRefreshed, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = autoReloadDataRefreshed.autoReloadEnabled;
                }
                if ((i & 2) != 0) {
                    str = autoReloadDataRefreshed.autoReloadThresholdAmount;
                }
                if ((i & 4) != 0) {
                    str2 = autoReloadDataRefreshed.autoReloadAmount;
                }
                if ((i & 8) != 0) {
                    str3 = autoReloadDataRefreshed.autoReloadFinancialInstrumentId;
                }
                return autoReloadDataRefreshed.copy(z, str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadRefreshFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadRefreshFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadRefreshFailed INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadRefreshFailed();

            public final int hashCode() {
                return -418261014;
            }

            private AutoReloadRefreshFailed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AutoReloadRefreshFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadRefreshFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$ZeroPercentAutoReloadBlocked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ZeroPercentAutoReloadBlocked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ZeroPercentAutoReloadBlocked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ZeroPercentAutoReloadBlocked();

            public final int hashCode() {
                return -1874489939;
            }

            private ZeroPercentAutoReloadBlocked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ZeroPercentAutoReloadBlocked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ZeroPercentAutoReloadBlocked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStarted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadFlowStarted extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoReloadFlowStarted(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
                this.flowType = autoReloadFlowType;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType = this.flowType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadFlowStarted(flowType=");
                sb.append(autoReloadFlowType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.flowType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted) && this.flowType == ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted) other).flowType;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted copy(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted(flowType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted autoReloadFlowStarted, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    autoReloadFlowType = autoReloadFlowStarted.flowType;
                }
                return autoReloadFlowStarted.copy(autoReloadFlowType);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStepCompleted;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "step", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowStepCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "getStep", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadFlowStepCompleted extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType;
            private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep step;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoReloadFlowStepCompleted(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowStep, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
                this.step = autoReloadFlowStep;
                this.flowType = autoReloadFlowType;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep getStep() {
                return this.step;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep = this.step;
                com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType = this.flowType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadFlowStepCompleted(step=");
                sb.append(autoReloadFlowStep);
                sb.append(", flowType=");
                sb.append(autoReloadFlowType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.step.hashCode() * 31) + this.flowType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted autoReloadFlowStepCompleted = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted) other;
                return this.step == autoReloadFlowStepCompleted.step && this.flowType == autoReloadFlowStepCompleted.flowType;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted copy(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep step, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted(step, flowType);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep getStep() {
                return this.step;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted autoReloadFlowStepCompleted, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    autoReloadFlowStep = autoReloadFlowStepCompleted.step;
                }
                if ((i & 2) != 0) {
                    autoReloadFlowType = autoReloadFlowStepCompleted.flowType;
                }
                return autoReloadFlowStepCompleted.copy(autoReloadFlowStep, autoReloadFlowType);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowSuccess;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadFlowSuccess extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoReloadFlowSuccess(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
                this.flowType = autoReloadFlowType;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType = this.flowType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadFlowSuccess(flowType=");
                sb.append(autoReloadFlowType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.flowType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess) && this.flowType == ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess) other).flowType;
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess copy(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess(flowType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess autoReloadFlowSuccess, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    autoReloadFlowType = autoReloadFlowSuccess.flowType;
                }
                return autoReloadFlowSuccess.copy(autoReloadFlowType);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowFailed;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "error", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;)Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "getFlowType", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadFlowFailed extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError error;
            private final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoReloadFlowFailed(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError autoReloadFlowError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowError, "");
                this.flowType = autoReloadFlowType;
                this.error = autoReloadFlowError;
            }

            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType = this.flowType;
                com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError autoReloadFlowError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadFlowFailed(flowType=");
                sb.append(autoReloadFlowType);
                sb.append(", error=");
                sb.append(autoReloadFlowError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.flowType.hashCode() * 31) + this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed autoReloadFlowFailed = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed) other;
                return this.flowType == autoReloadFlowFailed.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.error, autoReloadFlowFailed.error);
            }

            public final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed copy(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType flowType, com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed(flowType, error);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError getError() {
                return this.error;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getFlowType() {
                return this.flowType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed copy$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed autoReloadFlowFailed, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError autoReloadFlowError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    autoReloadFlowType = autoReloadFlowFailed.flowType;
                }
                if ((i & 2) != 0) {
                    autoReloadFlowError = autoReloadFlowFailed.error;
                }
                return autoReloadFlowFailed.copy(autoReloadFlowType, autoReloadFlowError);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$AutoReloadFlowRetryClicked;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AutoReloadFlowRetryClicked extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowRetryClicked INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowRetryClicked();

            public final int hashCode() {
                return 1822828155;
            }

            private AutoReloadFlowRetryClicked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AutoReloadFlowRetryClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowRetryClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent$FeatureUnavailable;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent$SystemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FeatureUnavailable extends com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.FeatureUnavailable INSTANCE = new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.FeatureUnavailable();

            public final int hashCode() {
                return -1429830912;
            }

            private FeatureUnavailable() {
                super(null);
            }

            public final java.lang.String toString() {
                return "FeatureUnavailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.FeatureUnavailable)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ SystemEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DistributionEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

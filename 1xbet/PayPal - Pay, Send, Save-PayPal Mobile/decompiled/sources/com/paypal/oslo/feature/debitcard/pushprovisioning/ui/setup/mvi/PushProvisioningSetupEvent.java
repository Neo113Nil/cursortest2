package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "InitiateGoogleWalletStatusCheck", "RetryPushProvisioning", "InitiatePushProvisioning", "InitiatedPushProvisioning", "LaunchGoogleSetupWallet", "ProvisioningSuccess", "CloseButtonClicked", "ProvisioningError", "ProvisioningCancelled", "PinSetUpCompleted", "PinSetUpFailed", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$CloseButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiateGoogleWalletStatusCheck;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiatePushProvisioning;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiatedPushProvisioning;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$LaunchGoogleSetupWallet;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$PinSetUpCompleted;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$PinSetUpFailed;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningCancelled;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningError;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningSuccess;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$RetryPushProvisioning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PushProvisioningSetupEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PushProvisioningSetupEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiateGoogleWalletStatusCheck;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "component3", "()Landroidx/activity/compose/ManagedActivityResultLauncher;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiateGoogleWalletStatusCheck;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "getLauncher"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitiateGoogleWalletStatusCheck extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
        private final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiateGoogleWalletStatusCheck(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher) {
            super("InitiateGoogleWalletStatusCheck", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
            this.starPayClient = starPayClient;
            this.debitInstrument = debitInstrument;
            this.launcher = managedActivityResultLauncher;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getLauncher() {
            return this.launcher;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
            androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.launcher;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiateGoogleWalletStatusCheck(starPayClient=");
            sb.append(starPayClient);
            sb.append(", debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", launcher=");
            sb.append(managedActivityResultLauncher);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.starPayClient.hashCode() * 31) + this.debitInstrument.hashCode()) * 31) + this.launcher.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck initiateGoogleWalletStatusCheck = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, initiateGoogleWalletStatusCheck.starPayClient) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, initiateGoogleWalletStatusCheck.debitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.launcher, initiateGoogleWalletStatusCheck.launcher);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcher, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck(starPayClient, debitInstrument, launcher);
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> component3() {
            return this.launcher;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck initiateGoogleWalletStatusCheck, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = initiateGoogleWalletStatusCheck.starPayClient;
            }
            if ((i & 2) != 0) {
                debitInstrument = initiateGoogleWalletStatusCheck.debitInstrument;
            }
            if ((i & 4) != 0) {
                managedActivityResultLauncher = initiateGoogleWalletStatusCheck.launcher;
            }
            return initiateGoogleWalletStatusCheck.copy(starPayClient, debitInstrument, managedActivityResultLauncher);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$RetryPushProvisioning;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "component3", "()Landroidx/activity/compose/ManagedActivityResultLauncher;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$RetryPushProvisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "getLauncher"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryPushProvisioning extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
        private final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryPushProvisioning(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher) {
            super("RetryPushProvisioning", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
            this.starPayClient = starPayClient;
            this.debitInstrument = debitInstrument;
            this.launcher = managedActivityResultLauncher;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getLauncher() {
            return this.launcher;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
            androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.launcher;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryPushProvisioning(starPayClient=");
            sb.append(starPayClient);
            sb.append(", debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", launcher=");
            sb.append(managedActivityResultLauncher);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.starPayClient.hashCode() * 31) + this.debitInstrument.hashCode()) * 31) + this.launcher.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning retryPushProvisioning = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, retryPushProvisioning.starPayClient) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, retryPushProvisioning.debitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.launcher, retryPushProvisioning.launcher);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcher, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning(starPayClient, debitInstrument, launcher);
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> component3() {
            return this.launcher;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning retryPushProvisioning, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = retryPushProvisioning.starPayClient;
            }
            if ((i & 2) != 0) {
                debitInstrument = retryPushProvisioning.debitInstrument;
            }
            if ((i & 4) != 0) {
                managedActivityResultLauncher = retryPushProvisioning.launcher;
            }
            return retryPushProvisioning.copy(starPayClient, debitInstrument, managedActivityResultLauncher);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiatePushProvisioning;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "component3", "()Landroidx/activity/compose/ManagedActivityResultLauncher;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Landroidx/activity/compose/ManagedActivityResultLauncher;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiatePushProvisioning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "getLauncher"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitiatePushProvisioning extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
        private final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatePushProvisioning(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher) {
            super("InitiatePushProvisioning", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
            this.starPayClient = starPayClient;
            this.debitInstrument = debitInstrument;
            this.launcher = managedActivityResultLauncher;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> getLauncher() {
            return this.launcher;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
            androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> managedActivityResultLauncher = this.launcher;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiatePushProvisioning(starPayClient=");
            sb.append(starPayClient);
            sb.append(", debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", launcher=");
            sb.append(managedActivityResultLauncher);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.starPayClient.hashCode() * 31) + this.debitInstrument.hashCode()) * 31) + this.launcher.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning initiatePushProvisioning = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, initiatePushProvisioning.starPayClient) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, initiatePushProvisioning.debitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.launcher, initiatePushProvisioning.launcher);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> launcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcher, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning(starPayClient, debitInstrument, launcher);
        }

        public final androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> component3() {
            return this.launcher;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning initiatePushProvisioning, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = initiatePushProvisioning.starPayClient;
            }
            if ((i & 2) != 0) {
                debitInstrument = initiatePushProvisioning.debitInstrument;
            }
            if ((i & 4) != 0) {
                managedActivityResultLauncher = initiatePushProvisioning.launcher;
            }
            return initiatePushProvisioning.copy(starPayClient, debitInstrument, managedActivityResultLauncher);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$InitiatedPushProvisioning;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitiatedPushProvisioning extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatedPushProvisioning INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatedPushProvisioning();

        public final int hashCode() {
            return 224690781;
        }

        private InitiatedPushProvisioning() {
            super("InitiatedPushProvisioning", null);
        }

        public final java.lang.String toString() {
            return "InitiatedPushProvisioning";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatedPushProvisioning)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$LaunchGoogleSetupWallet;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "<init>", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;)V", "component1", "()Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "copy", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$LaunchGoogleSetupWallet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getStarPayClient"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchGoogleSetupWallet extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchGoogleSetupWallet(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient) {
            super("LaunchGoogleSetupWallet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            this.starPayClient = starPayClient;
        }

        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.starPayClient;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchGoogleSetupWallet(starPayClient=");
            sb.append(starPayClient);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.starPayClient.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet) && kotlin.jvm.internal.Intrinsics.areEqual(this.starPayClient, ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet) other).starPayClient);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet copy(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet(starPayClient);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.starpay.api.StarPayClient getStarPayClient() {
            return this.starPayClient;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet launchGoogleSetupWallet, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                starPayClient = launchGoogleSetupWallet.starPayClient;
            }
            return launchGoogleSetupWallet.copy(starPayClient);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningSuccess;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningSuccess extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningSuccess();

        public final int hashCode() {
            return 1210466497;
        }

        private ProvisioningSuccess() {
            super("ProvisioningSuccess", null);
        }

        public final java.lang.String toString() {
            return "ProvisioningSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$CloseButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseButtonClicked extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.CloseButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.CloseButtonClicked();

        public final int hashCode() {
            return -280592462;
        }

        private CloseButtonClicked() {
            super("CloseButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.CloseButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningError;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningError extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("ProvisioningError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.errorCode = str;
        }

        public /* synthetic */ ProvisioningError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisioningError(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.errorCode;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError provisioningError = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError) other;
            return this.errorType == provisioningError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, provisioningError.errorCode);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError(errorType, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError provisioningError, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = provisioningError.errorType;
            }
            if ((i & 2) != 0) {
                str = provisioningError.errorCode;
            }
            return provisioningError.copy(debitErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$ProvisioningCancelled;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningCancelled extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningCancelled INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningCancelled();

        public final int hashCode() {
            return -1147407729;
        }

        private ProvisioningCancelled() {
            super("ProvisioningCancelled", null);
        }

        public final java.lang.String toString() {
            return "ProvisioningCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$PinSetUpCompleted;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinSetUpCompleted extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted();

        public final int hashCode() {
            return 1702536270;
        }

        private PinSetUpCompleted() {
            super("PinSetUpCompleted", null);
        }

        public final java.lang.String toString() {
            return "PinSetUpCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent$PinSetUpFailed;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinSetUpFailed extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpFailed INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpFailed();

        public final int hashCode() {
            return 564944154;
        }

        private PinSetUpFailed() {
            super("PinSetUpFailed", null);
        }

        public final java.lang.String toString() {
            return "PinSetUpFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PushProvisioningSetupEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

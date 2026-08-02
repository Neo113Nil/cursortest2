package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_SUCCESS, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_ERROR, "NavigateToLowBalance", "NavigateToScheduled", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_PROPAGATE_CHILD_RESULT, "TurnOffAutoTransfer", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$Dismiss;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadSuccess;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$NavigateToLowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$NavigateToScheduled;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$PropagateChildResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$TurnOffAutoTransfer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoReloadIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutoReloadIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize();

        public final int hashCode() {
            return 320244747;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$Dismiss;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss();

        public final int hashCode() {
            return 1856912367;
        }

        private Dismiss() {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadSuccess;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "", "isAutoTransferEnabled", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "config", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "choiceSheetUi", "<init>", "(ZLcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "component3", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "copy", "(ZLcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "getConfig", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "getChoiceSheetUi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadSuccess extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi choiceSheetUi;
        private final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig config;
        private final boolean isAutoTransferEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadSuccess(boolean z, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi) {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_SUCCESS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChoiceSheetUi, "");
            this.isAutoTransferEnabled = z;
            this.config = autoReloadConfig;
            this.choiceSheetUi = autoReloadChoiceSheetUi;
        }

        public final boolean isAutoTransferEnabled() {
            return this.isAutoTransferEnabled;
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig getConfig() {
            return this.config;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi getChoiceSheetUi() {
            return this.choiceSheetUi;
        }

        public final java.lang.String toString() {
            boolean z = this.isAutoTransferEnabled;
            com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = this.config;
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi = this.choiceSheetUi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadSuccess(isAutoTransferEnabled=");
            sb.append(z);
            sb.append(", config=");
            sb.append(autoReloadConfig);
            sb.append(", choiceSheetUi=");
            sb.append(autoReloadChoiceSheetUi);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.isAutoTransferEnabled) * 31) + this.config.hashCode()) * 31) + this.choiceSheetUi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess loadSuccess = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess) other;
            return this.isAutoTransferEnabled == loadSuccess.isAutoTransferEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.config, loadSuccess.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.choiceSheetUi, loadSuccess.choiceSheetUi);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess copy(boolean isAutoTransferEnabled, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig config, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi choiceSheetUi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceSheetUi, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess(isAutoTransferEnabled, config, choiceSheetUi);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi getChoiceSheetUi() {
            return this.choiceSheetUi;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig getConfig() {
            return this.config;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAutoTransferEnabled() {
            return this.isAutoTransferEnabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadSuccess loadSuccess, boolean z, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = loadSuccess.isAutoTransferEnabled;
            }
            if ((i & 2) != 0) {
                autoReloadConfig = loadSuccess.config;
            }
            if ((i & 4) != 0) {
                autoReloadChoiceSheetUi = loadSuccess.choiceSheetUi;
            }
            return loadSuccess.copy(z, autoReloadConfig, autoReloadChoiceSheetUi);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "error", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "copy", "(Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$LoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadError extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.domain.error.AutoReloadError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadError(com.paypal.oslo.feature.balance.domain.error.AutoReloadError autoReloadError) {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadError, "");
            this.error = autoReloadError;
        }

        public final com.paypal.oslo.feature.balance.domain.error.AutoReloadError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.domain.error.AutoReloadError autoReloadError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadError(error=");
            sb.append(autoReloadError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError) other).error);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError copy(com.paypal.oslo.feature.balance.domain.error.AutoReloadError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.error.AutoReloadError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError loadError, com.paypal.oslo.feature.balance.domain.error.AutoReloadError autoReloadError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadError = loadError.error;
            }
            return loadError.copy(autoReloadError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$NavigateToLowBalance;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLowBalance extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance();

        public final int hashCode() {
            return 1715397775;
        }

        private NavigateToLowBalance() {
            super("NavigateToLowBalance", null);
        }

        public final java.lang.String toString() {
            return "NavigateToLowBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToLowBalance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$NavigateToScheduled;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToScheduled extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled();

        public final int hashCode() {
            return -1621456858;
        }

        private NavigateToScheduled() {
            super("NavigateToScheduled", null);
        }

        public final java.lang.String toString() {
            return "NavigateToScheduled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.NavigateToScheduled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$PropagateChildResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$PropagateChildResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PropagateChildResult extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PropagateChildResult(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult) {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_PROPAGATE_CHILD_RESULT, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowNavResult, "");
            this.result = autoReloadFlowNavResult;
        }

        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PropagateChildResult(result=");
            sb.append(autoReloadFlowNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult) other).result);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult copy(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.PropagateChildResult propagateChildResult, com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowNavResult = propagateChildResult.result;
            }
            return propagateChildResult.copy(autoReloadFlowNavResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent$TurnOffAutoTransfer;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TurnOffAutoTransfer extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer();

        public final int hashCode() {
            return -243706511;
        }

        private TurnOffAutoTransfer() {
            super("AutoTransfer", null);
        }

        public final java.lang.String toString() {
            return "TurnOffAutoTransfer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.TurnOffAutoTransfer)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutoReloadIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

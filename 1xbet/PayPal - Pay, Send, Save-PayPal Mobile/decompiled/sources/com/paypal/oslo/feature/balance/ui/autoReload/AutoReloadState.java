package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Idle", "Loading", "Success", "Error", "AutoTransferTurnOff", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$AutoTransferTurnOff;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoReloadState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutoReloadState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle();

        public final int hashCode() {
            return -1514052216;
        }

        private Idle() {
            super("Idle", null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "flowIntent", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "getFlowIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent;

        public Loading(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent) {
            super("Loading", null);
            this.flowIntent = autoReloadFlowIntent;
        }

        public /* synthetic */ Loading(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : autoReloadFlowIntent);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.flowIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(flowIntent=");
            sb.append(autoReloadFlowIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.flowIntent;
            if (autoReloadFlowIntent == null) {
                return 0;
            }
            return autoReloadFlowIntent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowIntent, ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading) other).flowIntent);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading copy(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading(flowIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Loading loading, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowIntent = loading.flowIntent;
            }
            return loading.copy(autoReloadFlowIntent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Success;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "flowIntent", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "config", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "choiceSheetUi", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "component3", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "getFlowIntent", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "getConfig", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadViewModel$AutoReloadChoiceSheetUi;", "getChoiceSheetUi"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi choiceSheetUi;
        private final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig config;
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadChoiceSheetUi, "");
            this.flowIntent = autoReloadFlowIntent;
            this.config = autoReloadConfig;
            this.choiceSheetUi = autoReloadChoiceSheetUi;
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig getConfig() {
            return this.config;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(autoReloadFlowIntent, (i & 2) != 0 ? null : autoReloadConfig, (i & 4) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi(null, null, null, 7, null) : autoReloadChoiceSheetUi);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi getChoiceSheetUi() {
            return this.choiceSheetUi;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.flowIntent;
            com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = this.config;
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi = this.choiceSheetUi;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(flowIntent=");
            sb.append(autoReloadFlowIntent);
            sb.append(", config=");
            sb.append(autoReloadConfig);
            sb.append(", choiceSheetUi=");
            sb.append(autoReloadChoiceSheetUi);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flowIntent.hashCode();
            com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = this.config;
            return (((hashCode * 31) + (autoReloadConfig == null ? 0 : autoReloadConfig.hashCode())) * 31) + this.choiceSheetUi.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success success = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flowIntent, success.flowIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, success.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.choiceSheetUi, success.choiceSheetUi);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success copy(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig config, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi choiceSheetUi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choiceSheetUi, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success(flowIntent, config, choiceSheetUi);
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
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Success success, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.AutoReloadChoiceSheetUi autoReloadChoiceSheetUi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowIntent = success.flowIntent;
            }
            if ((i & 2) != 0) {
                autoReloadConfig = success.config;
            }
            if ((i & 4) != 0) {
                autoReloadChoiceSheetUi = success.choiceSheetUi;
            }
            return success.copy(autoReloadFlowIntent, autoReloadConfig, autoReloadChoiceSheetUi);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "flowIntent", "", "errorMessage", "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadFlowIntent;", "getFlowIntent", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Integer;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState {
        public static final int $stable = 8;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent;

        public Error(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, java.lang.String str, java.lang.Integer num) {
            super("Error", null);
            this.flowIntent = autoReloadFlowIntent;
            this.errorMessage = str;
            this.errorCode = num;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : autoReloadFlowIntent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
        }

        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.flowIntent;
            java.lang.String str = this.errorMessage;
            java.lang.Integer num = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(flowIntent=");
            sb.append(autoReloadFlowIntent);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent = this.flowIntent;
            int hashCode = autoReloadFlowIntent == null ? 0 : autoReloadFlowIntent.hashCode();
            java.lang.String str = this.errorMessage;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.errorCode;
            return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error error = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.flowIntent, error.flowIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error copy(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent flowIntent, java.lang.String errorMessage, java.lang.Integer errorCode) {
            return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error(flowIntent, errorMessage, errorCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error copy$default(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.Error error, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent autoReloadFlowIntent, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFlowIntent = error.flowIntent;
            }
            if ((i & 2) != 0) {
                str = error.errorMessage;
            }
            if ((i & 4) != 0) {
                num = error.errorCode;
            }
            return error.copy(autoReloadFlowIntent, str, num);
        }

        public Error() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState$AutoTransferTurnOff;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutoTransferTurnOff extends com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff();

        public final int hashCode() {
            return 959634276;
        }

        private AutoTransferTurnOff() {
            super("AutoTransfer", null);
        }

        public final java.lang.String toString() {
            return "AutoTransferTurnOff";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState.AutoTransferTurnOff)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutoReloadState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

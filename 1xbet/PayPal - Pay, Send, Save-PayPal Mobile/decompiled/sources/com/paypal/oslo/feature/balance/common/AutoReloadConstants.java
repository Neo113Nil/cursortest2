package com.paypal.oslo.feature.balance.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/AutoReloadConstants;", "", "<init>", "()V", "ComponentNames", "StateNames", "IntentNames", "EffectNames"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.common.AutoReloadConstants INSTANCE = new com.paypal.oslo.feature.balance.common.AutoReloadConstants();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/AutoReloadConstants$ComponentNames;", "", "<init>", "()V", "", "AUTO_RELOAD_VIEWMODEL_STORE", "Ljava/lang/String;", "AUTO_RELOAD_REDUCER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ComponentNames {
        public static final int $stable = 0;
        public static final java.lang.String AUTO_RELOAD_REDUCER = "AutoReloadReducer";
        public static final java.lang.String AUTO_RELOAD_VIEWMODEL_STORE = "AutoReloadViewModel.store";
        public static final com.paypal.oslo.feature.balance.common.AutoReloadConstants.ComponentNames INSTANCE = new com.paypal.oslo.feature.balance.common.AutoReloadConstants.ComponentNames();

        private ComponentNames() {
        }
    }

    private AutoReloadConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/AutoReloadConstants$StateNames;", "", "<init>", "()V", "", "STATE_IDLE", "Ljava/lang/String;", "STATE_LOADING", "STATE_SUCCESS", "STATE_AUTO_TRANSFER", "STATE_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StateNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.common.AutoReloadConstants.StateNames INSTANCE = new com.paypal.oslo.feature.balance.common.AutoReloadConstants.StateNames();
        public static final java.lang.String STATE_AUTO_TRANSFER = "AutoTransfer";
        public static final java.lang.String STATE_ERROR = "Error";
        public static final java.lang.String STATE_IDLE = "Idle";
        public static final java.lang.String STATE_LOADING = "Loading";
        public static final java.lang.String STATE_SUCCESS = "Success";

        private StateNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/AutoReloadConstants$IntentNames;", "", "<init>", "()V", "", "INTENT_INITIALIZE", "Ljava/lang/String;", "INTENT_CANCEL", "INTENT_DISMISS", "INTENT_LOAD_SUCCESS", "INTENT_LOAD_ERROR", "INTENT_AUTO_TRANSFER", "INTENT_NAVIGATE_TO_LOW_BALANCE", "INTENT_NAVIGATE_TO_SCHEDULED", "INTENT_PROPAGATE_CHILD_RESULT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IntentNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames INSTANCE = new com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames();
        public static final java.lang.String INTENT_AUTO_TRANSFER = "AutoTransfer";
        public static final java.lang.String INTENT_CANCEL = "Cancel";
        public static final java.lang.String INTENT_DISMISS = "Dismiss";
        public static final java.lang.String INTENT_INITIALIZE = "Initialize";
        public static final java.lang.String INTENT_LOAD_ERROR = "LoadError";
        public static final java.lang.String INTENT_LOAD_SUCCESS = "LoadSuccess";
        public static final java.lang.String INTENT_NAVIGATE_TO_LOW_BALANCE = "NavigateToLowBalance";
        public static final java.lang.String INTENT_NAVIGATE_TO_SCHEDULED = "NavigateToScheduled";
        public static final java.lang.String INTENT_PROPAGATE_CHILD_RESULT = "PropagateChildResult";

        private IntentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/AutoReloadConstants$EffectNames;", "", "<init>", "()V", "", "EFFECT_COMPLETE_FLOW_WITH_RESULT", "Ljava/lang/String;", "EFFECT_NAVIGATE_TO_LOW_BALANCE", "EFFECT_NAVIGATE_TO_SCHEDULED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EffectNames {
        public static final int $stable = 0;
        public static final java.lang.String EFFECT_COMPLETE_FLOW_WITH_RESULT = "CompleteAutoReloadFlowWithResult";
        public static final java.lang.String EFFECT_NAVIGATE_TO_LOW_BALANCE = "NavigateToLowBalance";
        public static final java.lang.String EFFECT_NAVIGATE_TO_SCHEDULED = "NavigateToScheduled";
        public static final com.paypal.oslo.feature.balance.common.AutoReloadConstants.EffectNames INSTANCE = new com.paypal.oslo.feature.balance.common.AutoReloadConstants.EffectNames();

        private EffectNames() {
        }
    }
}

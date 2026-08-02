package com.paypal.oslo.feature.pools.constants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants;", "", "<init>", "()V", "ComponentNames", "StateNames", "IntentNames", "EffectNames", "Pagination", "UI", "ActivityWidget"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pools.constants.PoolsConstants INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants();

    private PoolsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$ComponentNames;", "", "<init>", "()V", "", "POOLS_LIST_VIEWMODEL_STORE", "Ljava/lang/String;", "POOLS_LIST_REDUCER", "POOL_DETAILS_VIEWMODEL_STORE", "POOL_DETAILS_REDUCER", "CREATE_POOL_VIEWMODEL_STORE", "CREATE_POOL_REDUCER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ComponentNames {
        public static final int $stable = 0;
        public static final java.lang.String CREATE_POOL_REDUCER = "CreatePoolReducer";
        public static final java.lang.String CREATE_POOL_VIEWMODEL_STORE = "CreatePoolViewModel.store";
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames();
        public static final java.lang.String POOLS_LIST_REDUCER = "PoolsListReducer";
        public static final java.lang.String POOLS_LIST_VIEWMODEL_STORE = "PoolsListViewModel.store";
        public static final java.lang.String POOL_DETAILS_REDUCER = "PoolDetailsReducer";
        public static final java.lang.String POOL_DETAILS_VIEWMODEL_STORE = "PoolDetailsViewModel.store";

        private ComponentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$StateNames;", "", "<init>", "()V", "", "STATE_INITIAL", "Ljava/lang/String;", "STATE_EDITING", "STATE_LOADING", "STATE_SUCCESS", "STATE_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StateNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.StateNames INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.StateNames();
        public static final java.lang.String STATE_EDITING = "Editing";
        public static final java.lang.String STATE_ERROR = "Error";
        public static final java.lang.String STATE_INITIAL = "Initial";
        public static final java.lang.String STATE_LOADING = "Loading";
        public static final java.lang.String STATE_SUCCESS = "Success";

        private StateNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$IntentNames;", "", "<init>", "()V", "", "INTENT_INITIALIZE", "Ljava/lang/String;", "INTENT_ERROR", "INTENT_RETRY_REQUESTED", "INTENT_NAVIGATE_TO_POOL_DETAILS", "INTENT_NAVIGATE_TO_ERROR", "INTENT_POOL_DETAILS_LOADED", "INTENT_NAME_CHANGED", "INTENT_DESCRIPTION_CHANGED", "INTENT_BACKGROUND_IMAGE_URL_CHANGED", "INTENT_TARGET_AMOUNT_CHANGED", "INTENT_TARGET_DATE_CHANGED", "INTENT_SUBMIT_CLICKED", "INTENT_CREATION_SUCCEEDED", "INTENT_CREATION_FAILED", "INTENT_DISMISS_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IntentNames {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames();
        public static final java.lang.String INTENT_BACKGROUND_IMAGE_URL_CHANGED = "BackgroundImageUrlChanged";
        public static final java.lang.String INTENT_CREATION_FAILED = "CreationFailed";
        public static final java.lang.String INTENT_CREATION_SUCCEEDED = "CreationSucceeded";
        public static final java.lang.String INTENT_DESCRIPTION_CHANGED = "DescriptionChanged";
        public static final java.lang.String INTENT_DISMISS_ERROR = "DismissError";
        public static final java.lang.String INTENT_ERROR = "Error";
        public static final java.lang.String INTENT_INITIALIZE = "Initialize";
        public static final java.lang.String INTENT_NAME_CHANGED = "NameChanged";
        public static final java.lang.String INTENT_NAVIGATE_TO_ERROR = "OnLoadError";
        public static final java.lang.String INTENT_NAVIGATE_TO_POOL_DETAILS = "NavigateToPoolDetails";
        public static final java.lang.String INTENT_POOL_DETAILS_LOADED = "PoolDetailsLoaded";
        public static final java.lang.String INTENT_RETRY_REQUESTED = "RetryRequested";
        public static final java.lang.String INTENT_SUBMIT_CLICKED = "SubmitClicked";
        public static final java.lang.String INTENT_TARGET_AMOUNT_CHANGED = "TargetAmountChanged";
        public static final java.lang.String INTENT_TARGET_DATE_CHANGED = "TargetDateChanged";

        private IntentNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$EffectNames;", "", "<init>", "()V", "", "EFFECT_NAVIGATE_TO_POOL_DETAILS", "Ljava/lang/String;", "EFFECT_NAVIGATE_TO_ERROR", "EFFECT_POOL_DETAILS_NAVIGATE_TO_ERROR", "EFFECT_CREATE_POOL_NAVIGATE_TO_POOL_DETAILS", "EFFECT_CREATE_POOL_SHOW_ERROR_SNACKBAR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EffectNames {
        public static final int $stable = 0;
        public static final java.lang.String EFFECT_CREATE_POOL_NAVIGATE_TO_POOL_DETAILS = "CreatePoolNavigateToPoolDetails";
        public static final java.lang.String EFFECT_CREATE_POOL_SHOW_ERROR_SNACKBAR = "CreatePoolShowErrorSnackbar";
        public static final java.lang.String EFFECT_NAVIGATE_TO_ERROR = "NavigateToError";
        public static final java.lang.String EFFECT_NAVIGATE_TO_POOL_DETAILS = "NavigateToPoolDetails";
        public static final java.lang.String EFFECT_POOL_DETAILS_NAVIGATE_TO_ERROR = "PoolDetailsNavigateToError";
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames();

        private EffectNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$Pagination;", "", "<init>", "()V", "", "INIT_OFFSET", com.visa.cbp.getEncExpo.warmup, "DEFAULT_LIMIT", "INITIAL_LOAD_SIZE", "PREFETCH_DISTANCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Pagination {
        public static final int $stable = 0;
        public static final int DEFAULT_LIMIT = 10;
        public static final int INITIAL_LOAD_SIZE = 20;
        public static final int INIT_OFFSET = 1;
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.Pagination INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.Pagination();
        public static final int PREFETCH_DISTANCE = 5;

        private Pagination() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$UI;", "", "<init>", "()V", "", "LOADING_MORE_KEY", "Ljava/lang/String;", "ERROR_MORE_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UI {
        public static final int $stable = 0;
        public static final java.lang.String ERROR_MORE_KEY = "error-more";
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.UI INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.UI();
        public static final java.lang.String LOADING_MORE_KEY = "loading-more";

        private UI() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/pools/constants/PoolsConstants$ActivityWidget;", "", "<init>", "()V", "", "WIDGET_ACTIVITY_ITEMS", com.visa.cbp.getEncExpo.warmup, "", "WIDGET_SOURCE", "Ljava/lang/String;", "WIDGET_FULL_SCREEN_TITLE", "WIDGET_ANONYMOUS_AMOUNT_TEXT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityWidget {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.constants.PoolsConstants.ActivityWidget INSTANCE = new com.paypal.oslo.feature.pools.constants.PoolsConstants.ActivityWidget();
        public static final int WIDGET_ACTIVITY_ITEMS = 6;
        public static final java.lang.String WIDGET_ANONYMOUS_AMOUNT_TEXT = "--.--";
        public static final java.lang.String WIDGET_FULL_SCREEN_TITLE = "";
        public static final java.lang.String WIDGET_SOURCE = "moneypools";

        private ActivityWidget() {
        }
    }
}

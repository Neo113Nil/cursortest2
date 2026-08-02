package com.paypal.oslo.feature.activity.ui.search.model.states;

/* loaded from: classes10.dex */
public final class ActivitySearchReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer_Factory create() {
        return com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer newInstance() {
        return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer_Factory();

        private InstanceHolder() {
        }
    }
}

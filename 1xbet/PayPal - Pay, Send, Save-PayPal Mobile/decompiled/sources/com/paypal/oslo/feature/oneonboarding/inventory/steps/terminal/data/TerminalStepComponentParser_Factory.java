package com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data;

/* loaded from: classes13.dex */
public final class TerminalStepComponentParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser_Factory create() {
        return com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser newInstance() {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.oneonboarding.inventory.steps.terminal.data.TerminalStepComponentParser_Factory();

        private InstanceHolder() {
        }
    }
}

package com.paypal.oslo.feature.activity.ui.widget;

/* renamed from: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl_Factory, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C0305ActivityWidgetImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.activity.ui.widget.C0305ActivityWidgetImpl_Factory create() {
        return com.paypal.oslo.feature.activity.ui.widget.C0305ActivityWidgetImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl newInstance() {
        return new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl();
    }

    /* renamed from: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.activity.ui.widget.C0305ActivityWidgetImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.activity.ui.widget.C0305ActivityWidgetImpl_Factory();

        private InstanceHolder() {
        }
    }
}

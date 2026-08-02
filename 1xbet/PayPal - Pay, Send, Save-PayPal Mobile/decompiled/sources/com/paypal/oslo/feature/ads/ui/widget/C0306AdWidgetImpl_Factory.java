package com.paypal.oslo.feature.ads.ui.widget;

/* renamed from: com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0306AdWidgetImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.ads.ui.widget.C0306AdWidgetImpl_Factory create() {
        return com.paypal.oslo.feature.ads.ui.widget.C0306AdWidgetImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl newInstance() {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl();
    }

    /* renamed from: com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.ads.ui.widget.C0306AdWidgetImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.ads.ui.widget.C0306AdWidgetImpl_Factory();

        private InstanceHolder() {
        }
    }
}

package com.paypal.oslo.feature.bnplservicing.ui.changefi.content;

/* loaded from: classes11.dex */
public final class ChangeFiContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}

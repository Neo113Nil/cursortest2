package com.paypal.oslo.downloads.impl.util;

/* loaded from: classes10.dex */
public final class DefaultFileDeleter_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.util.DefaultFileDeleter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.util.DefaultFileDeleter get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.util.DefaultFileDeleter_Factory create() {
        return com.paypal.oslo.downloads.impl.util.DefaultFileDeleter_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.downloads.impl.util.DefaultFileDeleter newInstance() {
        return new com.paypal.oslo.downloads.impl.util.DefaultFileDeleter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.util.DefaultFileDeleter_Factory getHighSpeedVideoSizes = new com.paypal.oslo.downloads.impl.util.DefaultFileDeleter_Factory();

        private InstanceHolder() {
        }
    }
}

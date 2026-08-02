package com.paypal.oslo.core.security.clipboard;

/* loaded from: classes10.dex */
public final class ClipboardOwnershipTracker_Factory implements dagger.internal.Factory<com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker_Factory create() {
        return com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker newInstance() {
        return new com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker_Factory getHighSpeedVideoSizes = new com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker_Factory();

        private InstanceHolder() {
        }
    }
}

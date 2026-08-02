package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007\u001a\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "getO11YWrapper", "()Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "", "userId", "", "setDataDogUserId", "(Ljava/lang/String;)V", "org_uuid", "setDataDogUserOrganizationUUID", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "setDataDogUserUUID", "Lcom/zettle/o11y/android/core/O11YWrapper;", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "getDDCustomAttributeTracker", "(Lcom/zettle/o11y/android/core/O11YWrapper;)Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "Landroid/content/Context;", "initializeDataDogRum", "(Landroid/content/Context;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DataDogUtilsKt {
    public static final void initializeDataDogRum(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.zettle.o11y.android.core.O11YWrapper.INSTANCE.startObservability(context, com.zettle.o11y.android.core.configuration.PaymentSDKO11YConfiguration.INSTANCE.getProdConfiguration());
    }

    public static final com.zettle.o11y.android.core.O11YDataDogManagerInterface getO11YWrapper() {
        return com.zettle.o11y.android.core.O11YWrapper.INSTANCE.getInstance(com.zettle.o11y.android.core.configuration.PaymentSDKO11YConfiguration.INSTANCE.getProdConfiguration().getInstanceName());
    }

    public static final void setDataDogUserId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        getDDCustomAttributeTracker(com.zettle.o11y.android.core.O11YWrapper.INSTANCE).trackUserId(str);
    }

    public static final void setDataDogUserUUID(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        getDDCustomAttributeTracker(com.zettle.o11y.android.core.O11YWrapper.INSTANCE).trackUserUUID(str);
    }

    public static final void setDataDogUserOrganizationUUID(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        getDDCustomAttributeTracker(com.zettle.o11y.android.core.O11YWrapper.INSTANCE).trackOrganizationUUID(str);
    }

    public static final com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager getDDCustomAttributeTracker(com.zettle.o11y.android.core.O11YWrapper o11YWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o11YWrapper, "");
        return com.zettle.o11y.android.core.O11YWrapper.INSTANCE.getDDCustomAttributeTracker(com.zettle.o11y.android.core.configuration.PaymentSDKO11YConfiguration.INSTANCE.getProdConfiguration().getInstanceName());
    }
}

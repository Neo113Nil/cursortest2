package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "", "", "requestPermission", "()V", "openSettings", "requestPermissionOrOpenSettings", "refreshStatus", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "getPermissionStatus", "()Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "permissionStatus", "", "getShouldShowRationale", "()Z", "shouldShowRationale", "getRequiresSettings", "requiresSettings", "isOptInRequired", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "getResultFlow", "()Lkotlinx/coroutines/flow/Flow;", "resultFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PushOptInState {
    com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus getPermissionStatus();

    boolean getRequiresSettings();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult> getResultFlow();

    boolean getShouldShowRationale();

    void openSettings();

    void refreshStatus();

    void requestPermission();

    void requestPermissionOrOpenSettings();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isOptInRequired(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState) {
            return com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState.super.isOptInRequired();
        }
    }

    default boolean isOptInRequired() {
        return (kotlin.jvm.internal.Intrinsics.areEqual(getPermissionStatus(), com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(getPermissionStatus(), com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired.INSTANCE)) ? false : true;
    }
}

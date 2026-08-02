package com.paypal.oslo.core.userstore.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/UserState;", "", "isLoggedOut", "(Lcom/paypal/oslo/core/userstore/model/UserState;)Z", "isLoggingIn", "isLoggedIn", "isProfileLoading", "isProfileLoaded", "isProfileError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UserStateKt {
    public static final boolean isLoggedOut(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut;
    }

    public static final boolean isLoggingIn(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggingIn;
    }

    public static final boolean isLoggedIn(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedIn;
    }

    public static final boolean isProfileLoading(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading;
    }

    public static final boolean isProfileLoaded(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded;
    }

    public static final boolean isProfileError(com.paypal.oslo.core.userstore.model.UserState userState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userState, "");
        return userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError;
    }
}

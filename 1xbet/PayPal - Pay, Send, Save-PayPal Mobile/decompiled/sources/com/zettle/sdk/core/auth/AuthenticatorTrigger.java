package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JF\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\b\u0002\u0010\u000b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJJ\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\"\b\u0002\u0010\u000b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\nH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JV\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\"\b\u0002\u0010\u000b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\nH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0014J>\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00122\"\b\u0002\u0010\u000b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\nH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0016J@\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\b2\"\b\u0002\u0010\u000b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\nH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthenticatorTrigger;", "", "Landroid/app/Activity;", "activity", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "Lcom/zettle/sdk/core/auth/OnResult;", "onResult", "elevate", "(Landroid/app/Activity;Lcom/zettle/sdk/commons/network/Scope;Lkotlin/jvm/functions/Function1;)V", "", "toolbarColor", "login", "(Landroid/app/Activity;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "enforcedUserAccount", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "refreshToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "invalidate", "logout", "(ZLkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AuthenticatorTrigger {
    void elevate(android.app.Activity activity, com.zettle.sdk.commons.network.Scope scope, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    void login(android.app.Activity activity, java.lang.Integer toolbarColor, java.lang.String enforcedUserAccount, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    void login(android.app.Activity activity, java.lang.Integer toolbarColor, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    void login(java.lang.String refreshToken, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    void logout(boolean invalidate, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logout$default(com.zettle.sdk.core.auth.AuthenticatorTrigger authenticatorTrigger, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            authenticatorTrigger.logout(z, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void login$default(com.zettle.sdk.core.auth.AuthenticatorTrigger authenticatorTrigger, android.app.Activity activity, java.lang.Integer num, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            authenticatorTrigger.login(activity, num, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void login$default(com.zettle.sdk.core.auth.AuthenticatorTrigger authenticatorTrigger, android.app.Activity activity, java.lang.Integer num, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            authenticatorTrigger.login(activity, num, str, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void login$default(com.zettle.sdk.core.auth.AuthenticatorTrigger authenticatorTrigger, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            authenticatorTrigger.login(str, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void elevate$default(com.zettle.sdk.core.auth.AuthenticatorTrigger authenticatorTrigger, android.app.Activity activity, com.zettle.sdk.commons.network.Scope scope, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: elevate");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            authenticatorTrigger.elevate(activity, scope, function1);
        }
    }
}

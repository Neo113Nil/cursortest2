package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/user/UserModule;", "", "timeMillis", "", "awaitUserId", "(Lcom/zettle/sdk/core/user/UserModule;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserModuleKt {
    public static final java.lang.Object awaitUserId(com.zettle.sdk.core.user.UserModule userModule, long j, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, new com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2(userModule, null), continuation);
    }

    public static /* synthetic */ java.lang.Object awaitUserId$default(com.zettle.sdk.core.user.UserModule userModule, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 10000;
        }
        return awaitUserId(userModule, j, continuation);
    }
}

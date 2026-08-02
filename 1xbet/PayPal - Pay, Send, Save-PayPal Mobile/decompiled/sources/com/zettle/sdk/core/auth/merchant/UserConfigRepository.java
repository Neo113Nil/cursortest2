package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;", "", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "fetchRemoteUserConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface UserConfigRepository {
    java.lang.Object fetchRemoteUserConfig(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.UserConfig> continuation);
}

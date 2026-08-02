package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/Environment;", "", "isForTestingPurpose", "(Lcom/zettle/sdk/core/auth/Environment;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EnvironmentKt {
    public static final boolean isForTestingPurpose(com.zettle.sdk.core.auth.Environment environment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        return (environment instanceof com.zettle.sdk.core.auth.Sandbox) || (environment instanceof com.zettle.sdk.core.auth.Staging);
    }
}

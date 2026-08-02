package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/Environment;", "environment", "", "isUatMode", "", "clientId", "Lcom/izettle/android/auth/BackendEnvironment;", "makeEnvironment", "(Lcom/zettle/sdk/core/auth/Environment;ZLjava/lang/String;)Lcom/izettle/android/auth/BackendEnvironment;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleSDKKt {
    public static final com.izettle.android.auth.BackendEnvironment makeEnvironment(com.zettle.sdk.core.auth.Environment environment, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(environment, com.zettle.sdk.core.auth.Staging.INSTANCE) ? com.zettle.sdk.core.auth.MakeEnvironmentKt.makeStagingEnvironment(z, str) : kotlin.jvm.internal.Intrinsics.areEqual(environment, com.zettle.sdk.core.auth.Sandbox.INSTANCE) ? com.zettle.sdk.core.auth.MakeEnvironmentKt.makeSandboxEnvironment(z, str) : com.zettle.sdk.core.auth.MakeEnvironmentKt.makeProdEnvironment(z, str);
    }
}

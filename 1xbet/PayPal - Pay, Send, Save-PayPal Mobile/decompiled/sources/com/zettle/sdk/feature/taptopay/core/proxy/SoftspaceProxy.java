package com.zettle.sdk.feature.taptopay.core.proxy;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceBehaviour;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SoftspaceProxy extends com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviour {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isRunningOnRemoteProcess", "(Landroid/content/Context;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy.Companion();

        private Companion() {
        }

        public final boolean isRunningOnRemoteProcess(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return my.com.softspace.ssfasstapsdk.SSFasstapSDK.isRunningOnRemoteProcess(context);
        }
    }
}

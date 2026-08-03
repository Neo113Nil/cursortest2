package com.facebook.internal;

/* compiled from: InstagramCustomTab.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/facebook/internal/InstagramCustomTab;", "Lcom/facebook/internal/CustomTab;", "action", "", "parameters", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstagramCustomTab extends com.facebook.internal.CustomTab {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.InstagramCustomTab.Companion INSTANCE = new com.facebook.internal.InstagramCustomTab.Companion(null);

    /* compiled from: InstagramCustomTab.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/InstagramCustomTab$Companion;", "", "()V", "getURIForAction", "Landroid/net/Uri;", "action", "", "parameters", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final android.net.Uri getURIForAction(java.lang.String action, android.os.Bundle parameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
            if (kotlin.jvm.internal.Intrinsics.areEqual(action, com.facebook.login.CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
                return com.facebook.internal.Utility.buildUri(com.facebook.internal.ServerProtocol.getInstagramDialogAuthority(), com.facebook.internal.ServerProtocol.INSTAGRAM_OAUTH_PATH, parameters);
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol2 = com.facebook.internal.ServerProtocol.INSTANCE;
            java.lang.String instagramDialogAuthority = com.facebook.internal.ServerProtocol.getInstagramDialogAuthority();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            sb.append(com.facebook.FacebookSdk.getGraphApiVersion());
            sb.append("/dialog/");
            sb.append(action);
            return com.facebook.internal.Utility.buildUri(instagramDialogAuthority, sb.toString(), parameters);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramCustomTab(java.lang.String action, android.os.Bundle bundle) {
        super(action, bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        setUri(INSTANCE.getURIForAction(action, bundle == null ? new android.os.Bundle() : bundle));
    }
}

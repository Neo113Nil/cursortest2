package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/plaid/link/OpenPlaidLink;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "Lcom/plaid/link/result/LinkResult;", "<init>", "()V", "Landroid/content/Context;", "context", "linkConfiguration", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;)Landroid/content/Intent;", "", "resultCode", "result", "parseResult", "(ILandroid/content/Intent;)Lcom/plaid/link/result/LinkResult;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OpenPlaidLink extends androidx.view.result.contract.ActivityResultContract<com.plaid.link.configuration.LinkTokenConfiguration, com.plaid.link.result.LinkResult> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public final android.content.Intent createIntent(android.content.Context context, com.plaid.link.configuration.LinkTokenConfiguration linkConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkConfiguration, "");
        com.plaid.link.Plaid plaid = com.plaid.link.Plaid.INSTANCE;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        plaid.createWithoutPreload$link_sdk_release((android.app.Application) applicationContext, linkConfiguration);
        int i = com.plaid.internal.link.LinkActivity.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        plaid.trackSdkOpen$link_sdk_release();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.plaid.internal.link.LinkActivity.class);
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public final com.plaid.link.result.LinkResult parseResult(int resultCode, android.content.Intent result) {
        com.plaid.link.result.LinkExit b;
        com.plaid.link.result.LinkExit b2;
        if (result == null) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Null result returned ".concat(java.lang.String.valueOf(resultCode)));
            b2 = com.plaid.internal.L2.b(new com.plaid.link.exception.LinkException("No result returned."), null);
            return b2;
        }
        try {
            if (resultCode == 96171) {
                com.plaid.link.result.LinkSuccess linkSuccess = (com.plaid.link.result.LinkSuccess) result.getParcelableExtra("link_result");
                kotlin.jvm.internal.Intrinsics.checkNotNull(linkSuccess);
                return linkSuccess;
            }
            com.plaid.link.result.LinkExit linkExit = (com.plaid.link.result.LinkExit) result.getParcelableExtra("link_result");
            kotlin.jvm.internal.Intrinsics.checkNotNull(linkExit);
            return linkExit;
        } catch (java.lang.Throwable th) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th, "Invalid result returned ".concat(java.lang.String.valueOf(resultCode)));
            b = com.plaid.internal.L2.b(new com.plaid.link.exception.LinkException("Invalid result returned, please ensure you aren't using 3364 as a request code to open other activities"), null);
            return b;
        }
    }
}

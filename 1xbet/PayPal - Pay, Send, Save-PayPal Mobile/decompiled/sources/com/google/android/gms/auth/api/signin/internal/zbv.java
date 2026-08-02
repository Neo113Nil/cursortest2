package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
final class zbv implements androidx.loader.app.LoaderManager.LoaderCallbacks {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity zba;

    /* synthetic */ zbv(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity, byte[] bArr) {
        java.util.Objects.requireNonNull(signInHubActivity);
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final androidx.loader.content.Loader onCreateLoader(int i, android.os.Bundle bundle) {
        return new com.google.android.gms.auth.api.signin.internal.zbc(this.zba, com.google.android.gms.common.api.GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* synthetic */ void onLoadFinished(androidx.loader.content.Loader loader, java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zba(), signInHubActivity.zbb());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(androidx.loader.content.Loader loader) {
    }
}

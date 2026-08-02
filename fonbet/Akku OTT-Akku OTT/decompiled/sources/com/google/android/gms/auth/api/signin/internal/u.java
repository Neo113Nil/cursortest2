package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.util.Set;

/* loaded from: classes4.dex */
public final class u implements LoaderManager.LoaderCallbacks {
    public final /* synthetic */ SignInHubActivity a;

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, Bundle bundle) {
        SignInHubActivity signInHubActivity = this.a;
        Set set = com.google.android.gms.common.api.h.a;
        synchronized (set) {
        }
        return new f(signInHubActivity, set);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.d, signInHubActivity.e);
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}

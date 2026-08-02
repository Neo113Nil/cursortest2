package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014"}, d2 = {"Lcom/izettle/android/auth/BrowserAuthTaskSpec;", "", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "", "", "getQueryParams", "()Ljava/util/Map;", "queryParams", "", "getScopes", "()[Ljava/lang/String;", "scopes", "", "getToolbarColor", "()I", "toolbarColor", "Lcom/izettle/android/auth/OAuthBrowserLoginSpec;", "Lcom/izettle/android/auth/VerifySpec;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BrowserAuthTaskSpec {
    android.app.Activity getActivity();

    java.util.Map<java.lang.String, java.lang.String> getQueryParams();

    java.lang.String[] getScopes();

    int getToolbarColor();
}

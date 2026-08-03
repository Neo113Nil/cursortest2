package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface GamesSignInClient {
    com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> isAuthenticated();

    com.google.android.gms.tasks.Task<java.lang.String> requestServerSideAccess(java.lang.String str, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> signIn();
}

package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class FriendsResolutionRequiredException extends com.google.android.gms.common.api.ResolvableApiException {
    private FriendsResolutionRequiredException(com.google.android.gms.common.api.Status status) {
        super(status);
    }

    public static com.google.android.gms.games.FriendsResolutionRequiredException zza(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.games.FriendsResolutionRequiredException(status);
    }
}

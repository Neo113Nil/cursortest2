package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface GamesMetadataClient {
    com.google.android.gms.tasks.Task<com.google.android.gms.games.Game> getCurrentGame();

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.Game>> loadGame();
}

package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zze extends com.google.android.gms.common.api.GoogleApi {
    public zze(android.content.Context context, com.google.android.gms.games.zzn zznVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.games.zzn>) com.google.android.gms.games.Games.zze, zznVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected final com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            java.lang.String str = ((com.google.android.gms.games.zzn) getApiOptions()).zzl;
        }
        return createClientSettingsBuilder;
    }
}

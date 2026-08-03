package com.google.android.libraries.play.games.inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zza implements com.google.android.libraries.play.games.inputmapping.InputMappingClient {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzv zzc = com.google.android.gms.internal.play_games_inputmapping.zzv.zzg("com/google/android/libraries/play/games/inputmapping/InputMappingClientImpl");
    private final com.google.android.libraries.play.hpe.InputMappingManager zza;

    @javax.annotation.Nullable
    private com.google.android.libraries.play.hpe.InputMappingManager.MappingProvider zzb;

    zza(android.content.Context context) {
        this.zza = new com.google.android.libraries.play.hpe.InputMappingManager(context);
    }

    @Override // com.google.android.libraries.play.games.inputmapping.InputMappingClient
    public final synchronized void clearInputMappingProvider() {
        com.google.android.libraries.play.hpe.InputMappingManager.MappingProvider mappingProvider = this.zzb;
        if (mappingProvider == null) {
            ((com.google.android.gms.internal.play_games_inputmapping.zzs) zzc.zzb().zzn("com/google/android/libraries/play/games/inputmapping/InputMappingClientImpl", "clearInputMappingProvider", 32, "InputMappingClientImpl.java")).zzo("Attempt to clear a non-registered provider detected. No provider was cleared");
        } else {
            this.zza.unregister(mappingProvider);
            this.zzb = null;
        }
    }

    @Override // com.google.android.libraries.play.games.inputmapping.InputMappingClient
    public final synchronized void setInputMappingProvider(com.google.android.libraries.play.games.inputmapping.InputMappingProvider inputMappingProvider) {
        com.google.android.libraries.play.games.inputmapping.zzb zzbVar = new com.google.android.libraries.play.games.inputmapping.zzb(inputMappingProvider);
        this.zzb = zzbVar;
        this.zza.register(zzbVar);
    }
}

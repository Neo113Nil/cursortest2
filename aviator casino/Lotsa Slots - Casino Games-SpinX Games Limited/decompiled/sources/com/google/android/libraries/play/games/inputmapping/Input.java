package com.google.android.libraries.play.games.inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class Input {
    private static final java.lang.String HPE_FEATURE = "com.google.android.play.feature.HPE_EXPERIENCE";
    private static final com.google.android.gms.internal.play_games_inputmapping.zzv logger = com.google.android.gms.internal.play_games_inputmapping.zzv.zzg("com/google/android/libraries/play/games/inputmapping/Input");

    private Input() {
    }

    public static java.lang.String getGranuleName() {
        return "inputmapping";
    }

    public static com.google.android.libraries.play.games.inputmapping.InputMappingClient getInputMappingClient(android.content.Context context) {
        if (isHpeDevice(context)) {
            return new com.google.android.libraries.play.games.inputmapping.zza(context);
        }
        ((com.google.android.gms.internal.play_games_inputmapping.zzs) logger.zzc().zzn("com/google/android/libraries/play/games/inputmapping/Input", "getInputMappingClient", 28, "Input.java")).zzo("Device support for input sdk not detected, input sdk methods calls will be ignored.");
        return new com.google.android.libraries.play.games.inputmapping.zzc(context);
    }

    private static boolean isHpeDevice(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return packageManager != null && packageManager.hasSystemFeature(HPE_FEATURE);
    }
}

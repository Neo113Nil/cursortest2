package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.internal.services.n {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f7307a;

    public o(android.content.Context context) {
        android.media.AudioManager audioManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            audioManager = (android.media.AudioManager) androidx.core.content.ContextCompat.getSystemService(context.getApplicationContext(), android.media.AudioManager.class);
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.p.f7308a, "couldn't get android.media.AudioManager service", e, false, 8, null);
            audioManager = null;
        }
        this.f7307a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.n
    public com.moloco.sdk.internal.services.z a() {
        android.media.AudioManager audioManager = this.f7307a;
        java.lang.Integer valueOf = audioManager != null ? java.lang.Integer.valueOf(audioManager.getRingerMode()) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? com.moloco.sdk.internal.services.z.f7323a : (valueOf != null && valueOf.intValue() == 1) ? com.moloco.sdk.internal.services.z.b : (valueOf != null && valueOf.intValue() == 2) ? com.moloco.sdk.internal.services.z.c : com.moloco.sdk.internal.services.z.c;
    }

    @Override // com.moloco.sdk.internal.services.n
    public int b() {
        android.media.AudioManager audioManager = this.f7307a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    @Override // com.moloco.sdk.internal.services.n
    public boolean c() {
        android.media.AudioManager audioManager = this.f7307a;
        if (audioManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                return audioManager.isStreamMute(3);
            }
            if (audioManager.getStreamVolume(3) == 0) {
                return true;
            }
        }
        return false;
    }
}

package com.inmobi.media;

/* renamed from: com.inmobi.media.in, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2494in {
    public static final boolean a(android.content.Context context, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        java.lang.Object systemService = context.getSystemService("power");
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        java.lang.Object systemService2 = context.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService2 instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z || !keyguardManager.isKeyguardLocked());
    }

    public static final android.media.MediaPlayer a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return new android.media.MediaPlayer(context);
        }
        return new android.media.MediaPlayer();
    }

    public static final void a(android.media.MediaPlayer mediaPlayer, com.inmobi.media.Q1 audioFocusManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioFocusManager, "audioFocusManager");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(audioFocusManager.d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}

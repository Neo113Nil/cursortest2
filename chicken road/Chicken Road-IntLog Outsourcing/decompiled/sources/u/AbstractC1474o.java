package u;

import android.media.AudioAttributes;

/* renamed from: u.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1474o {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i2) {
        return builder.setContentType(i2);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i2) {
        return builder.setLegacyStreamType(i2);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i2) {
        return builder.setUsage(i2);
    }
}

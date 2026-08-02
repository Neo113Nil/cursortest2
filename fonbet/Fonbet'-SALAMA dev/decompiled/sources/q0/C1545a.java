package q0;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545a extends R4.c {
    @Override // R4.c
    public final R4.c E(int i7) {
        ((AudioAttributes.Builder) this.f6064b).setUsage(i7);
        return this;
    }

    @Override // R4.c
    public final R4.c F(int i7) {
        ((AudioAttributes.Builder) this.f6064b).setUsage(i7);
        return this;
    }

    @Override // R4.c
    public final AudioAttributesImpl z() {
        return new AudioAttributesImplApi26(((AudioAttributes.Builder) this.f6064b).build());
    }
}

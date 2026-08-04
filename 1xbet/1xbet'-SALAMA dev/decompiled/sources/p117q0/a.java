package p117q0;

import R4.c;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    @Override // R4.c
    public final c E(int i7) {
        ((AudioAttributes.Builder) this.f6064b).setUsage(i7);
        return this;
    }

    @Override // R4.c
    public final c F(int i7) {
        ((AudioAttributes.Builder) this.f6064b).setUsage(i7);
        return this;
    }

    @Override // R4.c
    public final AudioAttributesImpl z() {
        return new AudioAttributesImplApi26(((AudioAttributes.Builder) this.f6064b).build());
    }
}

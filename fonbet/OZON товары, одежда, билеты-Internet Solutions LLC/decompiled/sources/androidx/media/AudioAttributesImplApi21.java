package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f43446a;

    /* renamed from: b, reason: collision with root package name */
    public int f43447b = -1;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        final AudioAttributes.Builder f43448a = new AudioAttributes.Builder();

        a() {
        }
    }

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return this.f43446a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f43446a.equals(((AudioAttributesImplApi21) obj).f43446a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43446a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f43446a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f43446a = audioAttributes;
    }
}

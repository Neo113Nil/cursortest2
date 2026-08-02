package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Objects;
import zY.C11007a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    static final AudioAttributesCompat f43453g;

    /* renamed from: a, reason: collision with root package name */
    private final int f43454a;

    /* renamed from: b, reason: collision with root package name */
    private final C11007a f43455b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f43456c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioAttributesCompat f43457d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43458e;

    /* renamed from: f, reason: collision with root package name */
    private final AudioFocusRequest f43459f;

    /* renamed from: androidx.media.a$a, reason: collision with other inner class name */
    private static class C0806a {
        static AudioFocusRequest a(int i11, AudioAttributes audioAttributes, boolean z11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i11).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        private C11007a f43461b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f43462c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43464e;

        /* renamed from: d, reason: collision with root package name */
        private AudioAttributesCompat f43463d = a.f43453g;

        /* renamed from: a, reason: collision with root package name */
        private int f43460a = 4;

        public final a a() {
            if (this.f43461b != null) {
                return new a(this.f43460a, this.f43461b, this.f43462c, this.f43463d, this.f43464e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @NonNull
        public final void b(@NonNull AudioAttributesCompat audioAttributesCompat) {
            this.f43463d = audioAttributesCompat;
        }

        @NonNull
        public final void c(@NonNull C11007a c11007a) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f43461b = c11007a;
            this.f43462c = handler;
        }

        @NonNull
        public final void d() {
            this.f43464e = true;
        }
    }

    static {
        int i11 = AudioAttributesCompat.f43443b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        f43453g = new AudioAttributesCompat(new AudioAttributesImplApi26(builder.build()));
    }

    a(int i11, C11007a c11007a, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z11) {
        this.f43454a = i11;
        this.f43456c = handler;
        this.f43457d = audioAttributesCompat;
        this.f43458e = z11;
        this.f43455b = c11007a;
        this.f43459f = C0806a.a(i11, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f43444a.a() : null, z11, c11007a, handler);
    }

    final AudioFocusRequest a() {
        return this.f43459f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f43454a == aVar.f43454a && this.f43458e == aVar.f43458e && Objects.equals(this.f43455b, aVar.f43455b) && Objects.equals(this.f43456c, aVar.f43456c) && Objects.equals(this.f43457d, aVar.f43457d);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f43454a);
        Boolean valueOf2 = Boolean.valueOf(this.f43458e);
        return Objects.hash(valueOf, this.f43455b, this.f43456c, this.f43457d, valueOf2);
    }
}

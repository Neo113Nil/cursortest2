package p117q0;

import R4.c;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f15731g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f15733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f15735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15737f;

    static {
        int i7 = AudioAttributesCompat.f9649b;
        c aVar = Build.VERSION.SDK_INT >= 26 ? new a(22) : new c(22);
        aVar.F(1);
        f15731g = new AudioAttributesCompat(aVar.z());
    }

    public d(int i7, p043f5.c cVar, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z4) {
        this.f15732a = i7;
        this.f15734c = handler;
        this.f15735d = audioAttributesCompat;
        this.f15736e = z4;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f15733b = cVar;
        } else {
            this.f15733b = new c(cVar, handler);
        }
        if (i8 >= 26) {
            this.f15737f = b.a(i7, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f9650a.b() : null, z4, this.f15733b, handler);
        } else {
            this.f15737f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15732a == dVar.f15732a && this.f15736e == dVar.f15736e && Objects.equals(this.f15733b, dVar.f15733b) && Objects.equals(this.f15734c, dVar.f15734c) && Objects.equals(this.f15735d, dVar.f15735d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15732a), this.f15733b, this.f15734c, this.f15735d, Boolean.valueOf(this.f15736e));
    }
}

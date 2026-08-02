package q0;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import f5.C1103c;
import java.util.Objects;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548d {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f15725g;

    /* renamed from: a, reason: collision with root package name */
    public final int f15726a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f15727b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15728c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f15729d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15730e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15731f;

    static {
        int i7 = AudioAttributesCompat.f9649b;
        R4.c c1545a = Build.VERSION.SDK_INT >= 26 ? new C1545a(22) : new R4.c(22);
        c1545a.F(1);
        f15725g = new AudioAttributesCompat(c1545a.z());
    }

    public C1548d(int i7, C1103c c1103c, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z4) {
        this.f15726a = i7;
        this.f15728c = handler;
        this.f15729d = audioAttributesCompat;
        this.f15730e = z4;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f15727b = c1103c;
        } else {
            this.f15727b = new C1547c(c1103c, handler);
        }
        if (i8 >= 26) {
            this.f15731f = AbstractC1546b.a(i7, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f9650a.b() : null, z4, this.f15727b, handler);
        } else {
            this.f15731f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1548d)) {
            return false;
        }
        C1548d c1548d = (C1548d) obj;
        return this.f15726a == c1548d.f15726a && this.f15730e == c1548d.f15730e && Objects.equals(this.f15727b, c1548d.f15727b) && Objects.equals(this.f15728c, c1548d.f15728c) && Objects.equals(this.f15729d, c1548d.f15729d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15726a), this.f15727b, this.f15728c, this.f15729d, Boolean.valueOf(this.f15730e));
    }
}

package androidx.media3.exoplayer;

import Ij.C3261b;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import j3.C7263e;
import java.util.Objects;
import k3.C7476a;

/* renamed from: androidx.media3.exoplayer.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5443e {

    /* renamed from: a, reason: collision with root package name */
    private final O7.p<AudioManager> f43756a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f43757b;

    /* renamed from: c, reason: collision with root package name */
    private a f43758c;

    /* renamed from: d, reason: collision with root package name */
    private C7263e f43759d;

    /* renamed from: f, reason: collision with root package name */
    private int f43761f;

    /* renamed from: h, reason: collision with root package name */
    private C7476a f43763h;

    /* renamed from: g, reason: collision with root package name */
    private float f43762g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f43760e = 0;

    /* renamed from: androidx.media3.exoplayer.e$a */
    public interface a {
    }

    public C5443e(final Context context, Looper looper, a aVar) {
        this.f43756a = O7.q.a(new O7.p() { // from class: t3.b
            @Override // O7.p
            public final Object get() {
                return k3.c.c(context);
            }
        });
        this.f43758c = aVar;
        this.f43757b = new Handler(looper);
    }

    public static void a(C5443e c5443e, int i11) {
        c5443e.getClass();
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2) {
                c5443e.f(4);
                return;
            }
            a aVar = c5443e.f43758c;
            if (aVar != null) {
                ((K) aVar).u(0);
            }
            c5443e.f(3);
            return;
        }
        if (i11 == -1) {
            a aVar2 = c5443e.f43758c;
            if (aVar2 != null) {
                ((K) aVar2).u(-1);
            }
            c5443e.b();
            c5443e.f(1);
            return;
        }
        if (i11 != 1) {
            C3261b.f(i11, "Unknown focus change type: ", "AudioFocusManager");
            return;
        }
        c5443e.f(2);
        a aVar3 = c5443e.f43758c;
        if (aVar3 != null) {
            ((K) aVar3).u(1);
        }
    }

    private void b() {
        int i11 = this.f43760e;
        if (i11 == 1 || i11 == 0 || this.f43763h == null) {
            return;
        }
        k3.c.b(this.f43756a.get(), this.f43763h);
    }

    private void f(int i11) {
        if (this.f43760e == i11) {
            return;
        }
        this.f43760e = i11;
        float f7 = i11 == 4 ? 0.2f : 1.0f;
        if (this.f43762g == f7) {
            return;
        }
        this.f43762g = f7;
        a aVar = this.f43758c;
        if (aVar != null) {
            ((K) aVar).O0();
        }
    }

    public final float c() {
        return this.f43762g;
    }

    public final void d() {
        this.f43758c = null;
        b();
        f(0);
    }

    public final void e(C7263e c7263e) {
        if (Objects.equals(this.f43759d, c7263e)) {
            return;
        }
        this.f43759d = c7263e;
        int i11 = c7263e == null ? 0 : 1;
        this.f43761f = i11;
        G10.a.b("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i11 == 1 || i11 == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.media3.exoplayer.d] */
    public final int g(int i11, boolean z11) {
        int i12;
        if (i11 == 1 || (i12 = this.f43761f) != 1) {
            b();
            f(0);
            return 1;
        }
        if (!z11) {
            int i13 = this.f43760e;
            if (i13 == 1) {
                return -1;
            }
            if (i13 == 3) {
                return 0;
            }
        } else if (this.f43760e != 2) {
            C7476a c7476a = this.f43763h;
            if (c7476a == null) {
                C7476a.C1153a c1153a = c7476a == null ? new C7476a.C1153a(i12) : c7476a.a();
                C7263e c7263e = this.f43759d;
                c7263e.getClass();
                c1153a.b(c7263e);
                c1153a.d(false);
                c1153a.c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.d
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i14) {
                        C5443e.a(C5443e.this, i14);
                    }
                }, this.f43757b);
                this.f43763h = c1153a.a();
            }
            if (k3.c.d(this.f43756a.get(), this.f43763h) == 1) {
                f(2);
                return 1;
            }
            f(1);
            return -1;
        }
        return 1;
    }
}

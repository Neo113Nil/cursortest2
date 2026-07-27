package m5;

import B0.t;
import a.AbstractC0169a;
import android.media.MediaPlayer;
import android.os.Build;
import f4.C0430g;
import f4.C0431h;
import g4.AbstractC0476u;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final l5.c f11246a;

    /* renamed from: b, reason: collision with root package name */
    public final t f11247b;

    /* renamed from: c, reason: collision with root package name */
    public l5.a f11248c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.c f11249d;

    /* renamed from: e, reason: collision with root package name */
    public h f11250e;

    /* renamed from: f, reason: collision with root package name */
    public n5.c f11251f;

    /* renamed from: g, reason: collision with root package name */
    public float f11252g;

    /* renamed from: h, reason: collision with root package name */
    public float f11253h;

    /* renamed from: i, reason: collision with root package name */
    public float f11254i;

    /* renamed from: j, reason: collision with root package name */
    public l5.e f11255j;

    /* renamed from: k, reason: collision with root package name */
    public l5.d f11256k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11257l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11258m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11259n;

    /* renamed from: o, reason: collision with root package name */
    public int f11260o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0169a f11261p;

    public n(l5.c ref, t tVar, l5.a aVar, B0.c soundPoolManager) {
        kotlin.jvm.internal.i.e(ref, "ref");
        kotlin.jvm.internal.i.e(soundPoolManager, "soundPoolManager");
        this.f11246a = ref;
        this.f11247b = tVar;
        this.f11248c = aVar;
        this.f11249d = soundPoolManager;
        this.f11252g = 1.0f;
        this.f11254i = 1.0f;
        this.f11255j = l5.e.f11078a;
        this.f11256k = l5.d.f11076a;
        this.f11257l = true;
        this.f11260o = -1;
        T4.m mVar = new T4.m(6, this);
        B4.g gVar = new B4.g(2, this);
        this.f11261p = Build.VERSION.SDK_INT >= 26 ? new b(this, mVar, gVar, 1) : new b(this, mVar, gVar, 0);
    }

    public static void j(h hVar, float f3, float f6) {
        hVar.k(Math.min(1.0f, 1.0f - f6) * f3, Math.min(1.0f, f6 + 1.0f) * f3);
    }

    public final void a(h hVar) {
        j(hVar, this.f11252g, this.f11253h);
        hVar.b(this.f11255j == l5.e.f11079b);
        hVar.d();
    }

    public final h b() {
        int ordinal = this.f11256k.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new l(this, this.f11249d);
            }
            throw new C1.b();
        }
        kotlin.jvm.internal.i.e(this, "wrappedPlayer");
        x1.e eVar = new x1.e();
        eVar.f12265a = this;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: m5.c
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                h hVar;
                h hVar2;
                n nVar = n.this;
                nVar.h(true);
                nVar.f11246a.getClass();
                Integer num = null;
                if (nVar.f11258m && (hVar2 = nVar.f11250e) != null) {
                    num = hVar2.e();
                }
                nVar.f11247b.m("audio.onDuration", AbstractC0476u.V(new C0430g("value", Integer.valueOf(num != null ? num.intValue() : 0))));
                if (nVar.f11259n) {
                    nVar.f();
                }
                if (nVar.f11260o >= 0) {
                    h hVar3 = nVar.f11250e;
                    if ((hVar3 == null || !hVar3.f()) && (hVar = nVar.f11250e) != null) {
                        hVar.h(nVar.f11260o);
                    }
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: m5.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                n nVar = n.this;
                if (nVar.f11255j != l5.e.f11079b) {
                    nVar.k();
                }
                nVar.f11246a.getClass();
                nVar.f11247b.m("audio.onComplete", new HashMap());
            }
        });
        mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: m5.e
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                n nVar = n.this;
                nVar.f11246a.getClass();
                nVar.f11247b.m("audio.onSeekComplete", new HashMap());
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: m5.f
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i2, int i3) {
                String str;
                String str2;
                n nVar = n.this;
                nVar.getClass();
                if (i2 == 100) {
                    str = "MEDIA_ERROR_SERVER_DIED";
                } else {
                    str = "MEDIA_ERROR_UNKNOWN {what:" + i2 + '}';
                }
                if (i3 == Integer.MIN_VALUE) {
                    str2 = "MEDIA_ERROR_SYSTEM";
                } else if (i3 == -1010) {
                    str2 = "MEDIA_ERROR_UNSUPPORTED";
                } else if (i3 == -1007) {
                    str2 = "MEDIA_ERROR_MALFORMED";
                } else if (i3 == -1004) {
                    str2 = "MEDIA_ERROR_IO";
                } else if (i3 != -110) {
                    str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i3 + '}';
                } else {
                    str2 = "MEDIA_ERROR_TIMED_OUT";
                }
                boolean z = nVar.f11258m;
                t tVar = nVar.f11247b;
                l5.c cVar = nVar.f11246a;
                if (z || !kotlin.jvm.internal.i.a(str2, "MEDIA_ERROR_SYSTEM")) {
                    nVar.h(false);
                    cVar.getClass();
                    tVar.d("AndroidAudioError", str, str2);
                } else {
                    cVar.getClass();
                    tVar.d("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
                }
                return false;
            }
        });
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: m5.g
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i2) {
                n.this.getClass();
            }
        });
        mediaPlayer.setAudioAttributes(this.f11248c.a());
        eVar.f12266b = mediaPlayer;
        return eVar;
    }

    public final void c(String message) {
        kotlin.jvm.internal.i.e(message, "message");
        this.f11246a.getClass();
        this.f11247b.m("audio.onLog", AbstractC0476u.V(new C0430g("value", message)));
    }

    public final void d() {
        h hVar;
        if (this.f11259n) {
            this.f11259n = false;
            if (!this.f11258m || (hVar = this.f11250e) == null) {
                return;
            }
            hVar.a();
        }
    }

    public final void e() {
        h hVar;
        this.f11261p.v();
        if (this.f11257l) {
            return;
        }
        if (this.f11259n && (hVar = this.f11250e) != null) {
            hVar.stop();
        }
        i(null);
        this.f11250e = null;
    }

    public final void f() {
        AbstractC0169a abstractC0169a = this.f11261p;
        if (!kotlin.jvm.internal.i.a(abstractC0169a.o(), abstractC0169a.r().f11248c)) {
            abstractC0169a.F(abstractC0169a.r().f11248c);
            abstractC0169a.J();
        }
        if (abstractC0169a.w()) {
            abstractC0169a.E();
        } else {
            abstractC0169a.p().invoke();
        }
    }

    public final void g(l5.d dVar) {
        Object obj;
        if (this.f11256k != dVar) {
            this.f11256k = dVar;
            h hVar = this.f11250e;
            if (hVar != null) {
                try {
                    Integer m6 = hVar.m();
                    if (m6 == null) {
                        obj = m6;
                    } else {
                        int intValue = m6.intValue();
                        obj = m6;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = e5.g.l(th);
                }
                Integer num = (Integer) (obj instanceof C0431h ? null : obj);
                this.f11260o = num != null ? num.intValue() : -1;
                h(false);
                hVar.release();
            }
            h b6 = b();
            this.f11250e = b6;
            n5.c cVar = this.f11251f;
            if (cVar != null) {
                b6.c(cVar);
                a(b6);
            }
        }
    }

    public final void h(boolean z) {
        if (this.f11258m != z) {
            this.f11258m = z;
            this.f11246a.getClass();
            l5.c.c(this, z);
        }
    }

    public final void i(n5.c cVar) {
        if (kotlin.jvm.internal.i.a(this.f11251f, cVar)) {
            this.f11246a.getClass();
            l5.c.c(this, true);
            return;
        }
        if (cVar != null) {
            h hVar = this.f11250e;
            if (this.f11257l || hVar == null) {
                hVar = b();
                this.f11250e = hVar;
                this.f11257l = false;
            } else if (this.f11258m) {
                hVar.n();
                h(false);
            }
            hVar.c(cVar);
            a(hVar);
        } else {
            this.f11257l = true;
            h(false);
            this.f11259n = false;
            h hVar2 = this.f11250e;
            if (hVar2 != null) {
                hVar2.release();
            }
        }
        this.f11251f = cVar;
    }

    public final void k() {
        h hVar;
        this.f11261p.v();
        if (this.f11257l) {
            return;
        }
        if (this.f11255j == l5.e.f11078a) {
            e();
            return;
        }
        d();
        if (this.f11258m) {
            h hVar2 = this.f11250e;
            int i2 = 0;
            if (hVar2 == null || !hVar2.f()) {
                if (this.f11258m && ((hVar = this.f11250e) == null || !hVar.f())) {
                    h hVar3 = this.f11250e;
                    if (hVar3 != null) {
                        hVar3.h(0);
                    }
                    i2 = -1;
                }
                this.f11260o = i2;
                return;
            }
            h hVar4 = this.f11250e;
            if (hVar4 != null) {
                hVar4.stop();
            }
            h(false);
            h hVar5 = this.f11250e;
            if (hVar5 != null) {
                hVar5.d();
            }
        }
    }

    public final void l(l5.a aVar) {
        if (this.f11248c.equals(aVar)) {
            return;
        }
        if (this.f11248c.f11066e != 0 && aVar.f11066e == 0) {
            this.f11261p.v();
        }
        this.f11248c = l5.a.b(aVar);
        l5.c cVar = this.f11246a;
        cVar.a().setMode(this.f11248c.f11067f);
        cVar.a().setSpeakerphoneOn(this.f11248c.f11062a);
        h hVar = this.f11250e;
        if (hVar != null) {
            hVar.stop();
            h(false);
            hVar.i(this.f11248c);
            n5.c cVar2 = this.f11251f;
            if (cVar2 != null) {
                hVar.c(cVar2);
                a(hVar);
            }
        }
    }
}

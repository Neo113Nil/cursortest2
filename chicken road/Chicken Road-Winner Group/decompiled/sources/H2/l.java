package H2;

import android.media.SoundPool;
import e2.AbstractC0292g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w2.AbstractC1242v;
import w2.B;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final p f532a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.e f533b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.e f534c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f535d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f536e;
    public G2.a f;

    /* renamed from: g, reason: collision with root package name */
    public m f537g;

    /* renamed from: h, reason: collision with root package name */
    public I2.d f538h;

    public l(p wrappedPlayer, a1.e soundPoolManager) {
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f532a = wrappedPlayer;
        this.f533b = soundPoolManager;
        D2.d dVar = B.f10462a;
        this.f534c = AbstractC1242v.a(B2.o.f177a);
        G2.a aVar = wrappedPlayer.f548c;
        this.f = aVar;
        soundPoolManager.w(aVar);
        G2.a audioContext = this.f;
        kotlin.jvm.internal.j.e(audioContext, "audioContext");
        m mVar = (m) ((HashMap) soundPoolManager.f1789c).get(audioContext.a());
        if (mVar != null) {
            this.f537g = mVar;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.f).toString());
        }
    }

    @Override // H2.h
    public final void a() {
        Integer num = this.f536e;
        if (num != null) {
            this.f537g.f539a.pause(num.intValue());
        }
    }

    @Override // H2.h
    public final void b(boolean z3) {
        Integer num = this.f536e;
        if (num != null) {
            this.f537g.f539a.setLoop(num.intValue(), z3 ? -1 : 0);
        }
    }

    @Override // H2.h
    public final void c() {
        Integer num = this.f536e;
        if (num != null) {
            this.f537g.f539a.stop(num.intValue());
            this.f536e = null;
        }
    }

    @Override // H2.h
    public final void d() {
        Integer num = this.f536e;
        Integer num2 = this.f535d;
        if (num != null) {
            this.f537g.f539a.resume(num.intValue());
            return;
        }
        if (num2 != null) {
            SoundPool soundPool = this.f537g.f539a;
            int intValue = num2.intValue();
            p pVar = this.f532a;
            float f = pVar.f551g;
            this.f536e = Integer.valueOf(soundPool.play(intValue, f, f, 0, pVar.f554j == G2.f.f450b ? -1 : 0, pVar.f553i));
        }
    }

    public final void e(I2.d dVar) {
        l lVar;
        I2.d dVar2;
        Throwable th;
        if (dVar != null) {
            synchronized (this.f537g.f541c) {
                try {
                    Map map = this.f537g.f541c;
                    Object obj = map.get(dVar);
                    if (obj == null) {
                        try {
                            obj = new ArrayList();
                            map.put(dVar, obj);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    List list = (List) obj;
                    l lVar2 = (l) AbstractC0292g.X(list);
                    if (lVar2 != null) {
                        boolean z3 = lVar2.f532a.f557m;
                        this.f532a.h(z3);
                        this.f535d = lVar2.f535d;
                        this.f532a.c("Reusing soundId " + this.f535d + " for " + dVar + " is prepared=" + z3 + ' ' + this);
                        lVar = this;
                        dVar2 = dVar;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f532a.h(false);
                        this.f532a.c("Fetching actual URL for " + dVar);
                        lVar = this;
                        dVar2 = dVar;
                        try {
                            AbstractC1242v.g(this.f534c, B.f10463b, new k(dVar2, lVar, this, currentTimeMillis, null), 2);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                    list.add(this);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else {
            lVar = this;
            dVar2 = dVar;
        }
        lVar.f538h = dVar2;
    }

    @Override // H2.h
    public final /* bridge */ /* synthetic */ Integer g() {
        return null;
    }

    @Override // H2.h
    public final boolean h() {
        return false;
    }

    @Override // H2.h
    public final void i(float f) {
        Integer num = this.f536e;
        if (num != null) {
            this.f537g.f539a.setRate(num.intValue(), f);
        }
    }

    @Override // H2.h
    public final void j(int i3) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
        }
        Integer num = this.f536e;
        if (num != null) {
            int intValue = num.intValue();
            c();
            if (this.f532a.f558n) {
                this.f537g.f539a.resume(intValue);
            }
        }
    }

    @Override // H2.h
    public final void k(G2.a aVar) {
        if (!this.f.a().equals(aVar.a())) {
            release();
            a1.e eVar = this.f533b;
            eVar.w(aVar);
            m mVar = (m) ((HashMap) eVar.f1789c).get(aVar.a());
            if (mVar == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f537g = mVar;
        }
        this.f = aVar;
    }

    @Override // H2.h
    public final void m(float f, float f3) {
        Integer num = this.f536e;
        if (num != null) {
            this.f537g.f539a.setVolume(num.intValue(), f, f3);
        }
    }

    @Override // H2.h
    public final /* bridge */ /* synthetic */ Integer n() {
        return null;
    }

    @Override // H2.h
    public final void p(I2.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        source.a(this);
    }

    @Override // H2.h
    public final void release() {
        c();
        Integer num = this.f535d;
        if (num != null) {
            int intValue = num.intValue();
            I2.d dVar = this.f538h;
            if (dVar == null) {
                return;
            }
            synchronized (this.f537g.f541c) {
                try {
                    List list = (List) this.f537g.f541c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if ((list.size() == 1 ? list.get(0) : null) == this) {
                        this.f537g.f541c.remove(dVar);
                        this.f537g.f539a.unload(intValue);
                        this.f537g.f540b.remove(num);
                        this.f532a.c("unloaded soundId " + intValue);
                    } else {
                        list.remove(this);
                    }
                    this.f535d = null;
                    e(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // H2.h
    public final void f() {
    }

    @Override // H2.h
    public final void reset() {
    }
}

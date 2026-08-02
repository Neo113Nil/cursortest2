package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: c, reason: collision with root package name */
    public boolean f8055c;

    /* renamed from: e, reason: collision with root package name */
    public R1.c f8057e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8053a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final l f8054b = new l(this);

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f8056d = new WeakReference(null);

    public void A(long j) {
    }

    public void B() {
    }

    public final void a(o oVar, Handler handler) {
        if (this.f8055c) {
            this.f8055c = false;
            handler.removeMessages(1);
            PlaybackStateCompat d7 = oVar.d();
            long j = d7 == null ? 0L : d7.f8031e;
            boolean z4 = d7 != null && d7.f8027a == 3;
            boolean z7 = (516 & j) != 0;
            boolean z8 = (j & 514) != 0;
            if (z4 && z8) {
                g();
            } else {
                if (z4 || !z7) {
                    return;
                }
                h();
            }
        }
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
    }

    public void d(String str, Bundle bundle) {
    }

    public void e() {
    }

    public boolean f(Intent intent) {
        o oVar;
        R1.c cVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.f8053a) {
            oVar = (o) this.f8056d.get();
            cVar = this.f8057e;
        }
        if (oVar == null || cVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        q0.t c3 = oVar.c();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            a(oVar, cVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            a(oVar, cVar);
        } else if (this.f8055c) {
            cVar.removeMessages(1);
            this.f8055c = false;
            PlaybackStateCompat d7 = oVar.d();
            if (((d7 == null ? 0L : d7.f8031e) & 32) != 0) {
                y();
            }
        } else {
            this.f8055c = true;
            cVar.sendMessageDelayed(cVar.obtainMessage(1, c3), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    public void g() {
    }

    public void h() {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(Uri uri, Bundle bundle) {
    }

    public void l() {
    }

    public void m(String str, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(Uri uri, Bundle bundle) {
    }

    public void p(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void q() {
    }

    public void r(long j) {
    }

    public void s(boolean z4) {
    }

    public void t(float f7) {
    }

    public void u(RatingCompat ratingCompat) {
    }

    public void v(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void w(int i7) {
    }

    public void x(int i7) {
    }

    public void y() {
    }

    public void z() {
    }
}

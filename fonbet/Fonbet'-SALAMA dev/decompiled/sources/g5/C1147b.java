package g5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import com.ryanheise.audioservice.AudioService;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1147b extends android.support.v4.media.session.m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudioService f13230f;

    public C1147b(AudioService audioService) {
        this.f13230f = audioService;
    }

    @Override // android.support.v4.media.session.m
    public final void A(long j) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToQueueItem", l.k("index", Long.valueOf(j)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void B() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("stop", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("addQueueItem", l.k("mediaItem", l.b((MediaMetadataCompat) AudioService.f12304T.get(mediaDescriptionCompat.f7978a))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("insertQueueItem", l.k("mediaItem", l.b((MediaMetadataCompat) AudioService.f12304T.get(mediaDescriptionCompat.f7978a)), "index", Integer.valueOf(i7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void d(String str, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
            I4.j jVar = AudioService.f12302R;
            jVar.getClass();
            jVar.g("stop", l.k(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
            I4.j jVar2 = AudioService.f12302R;
            jVar2.getClass();
            jVar2.g("fastForward", l.k(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
            I4.j jVar3 = AudioService.f12302R;
            jVar3.getClass();
            jVar3.g("rewind", l.k(new Object[0]), null);
        } else {
            I4.j jVar4 = AudioService.f12302R;
            jVar4.getClass();
            jVar4.g("customAction", l.k("name", str, "extras", l.e(bundle)), null);
        }
    }

    @Override // android.support.v4.media.session.m
    public final void e() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("fastForward", l.k(new Object[0]), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.media.session.m
    public final boolean f(Intent intent) {
        int i7;
        if (AudioService.f12302R == null) {
            return false;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    g();
                } else if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 86:
                            B();
                            break;
                        case 89:
                            q();
                            break;
                        case 90:
                            e();
                            break;
                        case 91:
                            h();
                            break;
                    }
                }
            }
            I4.j jVar = AudioService.f12302R;
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 79 && keyCode2 != 85) {
                if (keyCode2 == 87) {
                    i7 = 2;
                } else if (keyCode2 == 88) {
                    i7 = 3;
                }
                jVar.getClass();
                jVar.g("click", l.k("button", Integer.valueOf(t.e.e(i7))), null);
            }
            i7 = 1;
            jVar.getClass();
            jVar.g("click", l.k("button", Integer.valueOf(t.e.e(i7))), null);
        }
        return true;
    }

    @Override // android.support.v4.media.session.m
    public final void g() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("pause", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void h() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("play", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void i(String str, Bundle bundle) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("playFromMediaId", l.k("mediaId", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void j(String str, Bundle bundle) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("playFromSearch", l.k("query", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void k(Uri uri, Bundle bundle) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("playFromUri", l.k("uri", uri.toString(), "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void l() {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13230f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        I4.j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepare", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void m(String str, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13230f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        I4.j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromMediaId", l.k("mediaId", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void n(String str, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13230f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        I4.j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromSearch", l.k("query", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void o(Uri uri, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13230f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        I4.j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromUri", l.k("uri", uri.toString(), "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void p(MediaDescriptionCompat mediaDescriptionCompat) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("removeQueueItem", l.k("mediaItem", l.b((MediaMetadataCompat) AudioService.f12304T.get(mediaDescriptionCompat.f7978a))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void q() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("rewind", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void r(long j) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("seek", l.k("position", Long.valueOf(j * 1000)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void s(boolean z4) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setCaptioningEnabled", l.k("enabled", Boolean.valueOf(z4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void t(float f7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setSpeed", l.k("speed", Float.valueOf(f7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void u(RatingCompat ratingCompat) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRating", l.k("rating", l.n(ratingCompat), "extras", null), null);
    }

    @Override // android.support.v4.media.session.m
    public final void v(RatingCompat ratingCompat, Bundle bundle) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRating", l.k("rating", l.n(ratingCompat), "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void w(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRepeatMode", l.k("repeatMode", Integer.valueOf(i7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void x(int i7) {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setShuffleMode", l.k("shuffleMode", Integer.valueOf(i7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void y() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToNext", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void z() {
        I4.j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToPrevious", l.k(new Object[0]), null);
    }
}

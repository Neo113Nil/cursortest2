package p049g5;

import I4.j;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.m;
import android.view.KeyEvent;
import com.ryanheise.audioservice.AudioService;
import p136t.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudioService f13236f;

    public b(AudioService audioService) {
        this.f13236f = audioService;
    }

    @Override // android.support.v4.media.session.m
    public final void A(long j) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToQueueItem", l.k("index", Long.valueOf(j)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void B() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("stop", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("addQueueItem", l.k("mediaItem", l.b((MediaMetadataCompat) AudioService.f12304T.get(mediaDescriptionCompat.f7978a))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        j jVar = AudioService.f12302R;
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
            j jVar = AudioService.f12302R;
            jVar.getClass();
            jVar.g("stop", l.k(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
            j jVar2 = AudioService.f12302R;
            jVar2.getClass();
            jVar2.g("fastForward", l.k(new Object[0]), null);
        } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
            j jVar3 = AudioService.f12302R;
            jVar3.getClass();
            jVar3.g("rewind", l.k(new Object[0]), null);
        } else {
            j jVar4 = AudioService.f12302R;
            jVar4.getClass();
            jVar4.g("customAction", l.k("name", str, "extras", l.e(bundle)), null);
        }
    }

    @Override // android.support.v4.media.session.m
    public final void e() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("fastForward", l.k(new Object[0]), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    @Override // android.support.v4.media.session.m
    public final boolean f(Intent intent) {
        int keyCode;
        int i7;
        if (AudioService.f12302R == null) {
            return false;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent.getAction() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79) {
                j jVar = AudioService.f12302R;
                keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 || keyCode == 85) {
                    i7 = 1;
                } else if (keyCode == 87) {
                    i7 = 2;
                } else if (keyCode != 88) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                jVar.getClass();
                jVar.g("click", l.k("button", Integer.valueOf(e.e(i7))), null);
            } else if (keyCode2 == 130) {
                g();
            } else if (keyCode2 != 126 && keyCode2 != 127) {
                switch (keyCode2) {
                    case 85:
                    case 87:
                    case 88:
                        j jVar2 = AudioService.f12302R;
                        keyCode = keyEvent.getKeyCode();
                        if (keyCode != 79) {
                            i7 = 1;
                        } else {
                            i7 = 1;
                        }
                        jVar2.getClass();
                        jVar2.g("click", l.k("button", Integer.valueOf(e.e(i7))), null);
                        break;
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
            } else {
                j jVar3 = AudioService.f12302R;
                keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    i7 = 1;
                } else {
                    i7 = 1;
                }
                jVar3.getClass();
                jVar3.g("click", l.k("button", Integer.valueOf(e.e(i7))), null);
            }
        }
        return true;
    }

    @Override // android.support.v4.media.session.m
    public final void g() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("pause", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void h() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("play", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void i(String str, Bundle bundle) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("playFromMediaId", l.k("mediaId", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void j(String str, Bundle bundle) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("playFromSearch", l.k("query", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void k(Uri uri, Bundle bundle) {
        j jVar = AudioService.f12302R;
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
        AudioService audioService = this.f13236f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepare", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void m(String str, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13236f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromMediaId", l.k("mediaId", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void n(String str, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13236f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromSearch", l.k("query", str, "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void o(Uri uri, Bundle bundle) {
        if (AudioService.f12302R == null) {
            return;
        }
        AudioService audioService = this.f13236f;
        if (!audioService.f12306B.p0()) {
            audioService.f12306B.w0(true);
        }
        j jVar = AudioService.f12302R;
        jVar.getClass();
        jVar.g("prepareFromUri", l.k("uri", uri.toString(), "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void p(MediaDescriptionCompat mediaDescriptionCompat) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("removeQueueItem", l.k("mediaItem", l.b((MediaMetadataCompat) AudioService.f12304T.get(mediaDescriptionCompat.f7978a))), null);
    }

    @Override // android.support.v4.media.session.m
    public final void q() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("rewind", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void r(long j) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("seek", l.k("position", Long.valueOf(j * 1000)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void s(boolean z4) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setCaptioningEnabled", l.k("enabled", Boolean.valueOf(z4)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void t(float f7) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setSpeed", l.k("speed", Float.valueOf(f7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void u(RatingCompat ratingCompat) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRating", l.k("rating", l.n(ratingCompat), "extras", null), null);
    }

    @Override // android.support.v4.media.session.m
    public final void v(RatingCompat ratingCompat, Bundle bundle) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRating", l.k("rating", l.n(ratingCompat), "extras", l.e(bundle)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void w(int i7) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setRepeatMode", l.k("repeatMode", Integer.valueOf(i7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void x(int i7) {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("setShuffleMode", l.k("shuffleMode", Integer.valueOf(i7)), null);
    }

    @Override // android.support.v4.media.session.m
    public final void y() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToNext", l.k(new Object[0]), null);
    }

    @Override // android.support.v4.media.session.m
    public final void z() {
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("skipToPrevious", l.k(new Object[0]), null);
    }
}

package A1;

import C1.C0101g;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: renamed from: A1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0017f f357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0101g f359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f362g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f363h;

    public C0019g(Context context, Handler handler, K k7) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f356a = audioManager;
        this.f358c = k7;
        this.f357b = new C0017f(this, handler);
        this.f360e = 0;
    }

    public final void a() {
        if (this.f360e == 0) {
            return;
        }
        int i7 = p151v2.t.f17159a;
        AudioManager audioManager = this.f356a;
        if (i7 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f363h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f357b);
        }
        c(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public final void b(C0101g c0101g) {
        int i7;
        if (p151v2.t.a(this.f359d, c0101g)) {
            return;
        }
        this.f359d = c0101g;
        if (c0101g != null) {
            i7 = 3;
            int i8 = c0101g.f1487c;
            switch (i8) {
                case 0:
                    Log.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i7 = 1;
                    break;
                case 1:
                case 14:
                    i7 = 1;
                    break;
                case 2:
                case 4:
                    i7 = 2;
                    break;
                case 3:
                    i7 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    break;
                case 11:
                    if (c0101g.f1485a == 1) {
                        i7 = 2;
                    }
                    break;
                case 15:
                default:
                    p150v0.a.j(i8, "Unidentified audio usage: ", "AudioFocusManager");
                    i7 = 0;
                    break;
                case 16:
                    i7 = p151v2.t.f17159a < 19 ? 2 : 4;
                    break;
            }
        } else {
            i7 = 0;
        }
        this.f361f = i7;
        p151v2.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 == 1 || i7 == 0);
    }

    public final void c(int i7) {
        if (this.f360e == i7) {
            return;
        }
        this.f360e = i7;
        float f7 = i7 == 3 ? 0.2f : 1.0f;
        if (this.f362g == f7) {
            return;
        }
        this.f362g = f7;
        K k7 = this.f358c;
        if (k7 != null) {
            N n2 = k7.f109a;
            n2.M(1, 2, Float.valueOf(n2.f146U * n2.f176x.f362g));
        }
    }

    public final int d(int i7, boolean z4) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderI;
        int i8 = 1;
        if (i7 == 1 || this.f361f != 1) {
            a();
            return z4 ? 1 : -1;
        }
        if (!z4) {
            return -1;
        }
        if (this.f360e != 1) {
            int i9 = p151v2.t.f17159a;
            AudioManager audioManager = this.f356a;
            C0017f c0017f = this.f357b;
            if (i9 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f363h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        AbstractC0013d.t();
                        builderI = AbstractC0013d.e(this.f361f);
                    } else {
                        AbstractC0013d.t();
                        builderI = AbstractC0013d.i(this.f363h);
                    }
                    C0101g c0101g = this.f359d;
                    boolean z7 = c0101g != null && c0101g.f1485a == 1;
                    c0101g.getClass();
                    this.f363h = builderI.setAudioAttributes((AudioAttributes) c0101g.a().f16597b).setWillPauseWhenDucked(z7).setOnAudioFocusChangeListener(c0017f).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f363h);
            } else {
                C0101g c0101g2 = this.f359d;
                c0101g2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(c0017f, p151v2.t.y(c0101g2.f1487c), this.f361f);
            }
            if (iRequestAudioFocus == 1) {
                c(1);
            } else {
                c(0);
                i8 = -1;
            }
        }
        return i8;
    }
}

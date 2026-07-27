package m5;

import a.AbstractC0169a;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class b extends AbstractC0169a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11212g;

    /* renamed from: h, reason: collision with root package name */
    public final n f11213h;

    /* renamed from: i, reason: collision with root package name */
    public final T4.m f11214i;

    /* renamed from: j, reason: collision with root package name */
    public final B4.g f11215j;

    /* renamed from: k, reason: collision with root package name */
    public l5.a f11216k;

    /* renamed from: l, reason: collision with root package name */
    public Object f11217l;

    public b(n player, T4.m mVar, B4.g gVar, int i2) {
        this.f11212g = i2;
        switch (i2) {
            case 1:
                kotlin.jvm.internal.i.e(player, "player");
                this.f11213h = player;
                this.f11214i = mVar;
                this.f11215j = gVar;
                this.f11216k = player.f11248c;
                J();
                break;
            default:
                kotlin.jvm.internal.i.e(player, "player");
                this.f11213h = player;
                this.f11214i = mVar;
                this.f11215j = gVar;
                this.f11216k = player.f11248c;
                J();
                break;
        }
    }

    @Override // a.AbstractC0169a
    public final void E() {
        int requestAudioFocus;
        switch (this.f11212g) {
            case 0:
                u(r().f11246a.a().requestAudioFocus((a) this.f11217l, 3, this.f11216k.f11066e));
                break;
            default:
                AudioManager a6 = r().f11246a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f11217l;
                kotlin.jvm.internal.i.b(audioFocusRequest);
                requestAudioFocus = a6.requestAudioFocus(audioFocusRequest);
                u(requestAudioFocus);
                break;
        }
    }

    @Override // a.AbstractC0169a
    public final void F(l5.a aVar) {
        switch (this.f11212g) {
            case 0:
                this.f11216k = aVar;
                break;
            default:
                this.f11216k = aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [m5.a] */
    @Override // a.AbstractC0169a
    public final void J() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        switch (this.f11212g) {
            case 0:
                if (this.f11216k.f11066e == 0) {
                    onAudioFocusChangeListener = null;
                } else {
                    final int i2 = 0;
                    onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: m5.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i3) {
                            switch (i2) {
                                case 0:
                                    ((b) this).u(i3);
                                    break;
                                default:
                                    ((b) this).u(i3);
                                    break;
                            }
                        }
                    };
                }
                this.f11217l = onAudioFocusChangeListener;
                break;
            default:
                if (this.f11216k.f11066e == 0) {
                    build = null;
                } else {
                    l1.e.u();
                    audioAttributes = l1.e.k(this.f11216k.f11066e).setAudioAttributes(this.f11216k.a());
                    final int i3 = 1;
                    onAudioFocusChangeListener2 = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: m5.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i32) {
                            switch (i3) {
                                case 0:
                                    ((b) this).u(i32);
                                    break;
                                default:
                                    ((b) this).u(i32);
                                    break;
                            }
                        }
                    });
                    build = onAudioFocusChangeListener2.build();
                }
                this.f11217l = build;
                break;
        }
    }

    @Override // a.AbstractC0169a
    public final l5.a o() {
        switch (this.f11212g) {
        }
        return this.f11216k;
    }

    @Override // a.AbstractC0169a
    public final InterfaceC1430a p() {
        switch (this.f11212g) {
        }
        return this.f11214i;
    }

    @Override // a.AbstractC0169a
    public final InterfaceC1441l q() {
        switch (this.f11212g) {
        }
        return this.f11215j;
    }

    @Override // a.AbstractC0169a
    public final n r() {
        switch (this.f11212g) {
        }
        return this.f11213h;
    }

    @Override // a.AbstractC0169a
    public final void v() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f11212g) {
            case 0:
                if (w()) {
                    r().f11246a.a().abandonAudioFocus((a) this.f11217l);
                    break;
                }
                break;
            default:
                if (w() && (audioFocusRequest = (AudioFocusRequest) this.f11217l) != null) {
                    r().f11246a.a().abandonAudioFocusRequest(audioFocusRequest);
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0169a
    public final boolean w() {
        switch (this.f11212g) {
            case 0:
                if (((a) this.f11217l) != null) {
                }
                break;
            default:
                if (((AudioFocusRequest) this.f11217l) != null) {
                }
                break;
        }
        return false;
    }
}

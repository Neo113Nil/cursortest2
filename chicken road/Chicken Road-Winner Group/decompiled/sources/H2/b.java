package H2;

import a.AbstractC0086a;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0086a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f512b;

    /* renamed from: c, reason: collision with root package name */
    public final p f513c;

    /* renamed from: d, reason: collision with root package name */
    public final n f514d;

    /* renamed from: e, reason: collision with root package name */
    public final o f515e;
    public G2.a f;

    /* renamed from: g, reason: collision with root package name */
    public Object f516g;

    public b(p player, n nVar, o oVar, int i3) {
        this.f512b = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.j.e(player, "player");
                this.f513c = player;
                this.f514d = nVar;
                this.f515e = oVar;
                this.f = player.f548c;
                d0();
                break;
            default:
                kotlin.jvm.internal.j.e(player, "player");
                this.f513c = player;
                this.f514d = nVar;
                this.f515e = oVar;
                this.f = player.f548c;
                d0();
                break;
        }
    }

    @Override // a.AbstractC0086a
    public final p A() {
        switch (this.f512b) {
        }
        return this.f513c;
    }

    @Override // a.AbstractC0086a
    public final void C() {
        AudioFocusRequest audioFocusRequest;
        switch (this.f512b) {
            case 0:
                if (D()) {
                    A().f546a.a().abandonAudioFocus((a) this.f516g);
                    break;
                }
                break;
            default:
                if (D() && (audioFocusRequest = (AudioFocusRequest) this.f516g) != null) {
                    A().f546a.a().abandonAudioFocusRequest(audioFocusRequest);
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0086a
    public final boolean D() {
        switch (this.f512b) {
            case 0:
                if (((a) this.f516g) != null) {
                }
                break;
            default:
                if (((AudioFocusRequest) this.f516g) != null) {
                }
                break;
        }
        return false;
    }

    @Override // a.AbstractC0086a
    public final void T() {
        int requestAudioFocus;
        switch (this.f512b) {
            case 0:
                B(A().f546a.a().requestAudioFocus((a) this.f516g, 3, this.f.f438e));
                break;
            default:
                AudioManager a3 = A().f546a.a();
                AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f516g;
                kotlin.jvm.internal.j.b(audioFocusRequest);
                requestAudioFocus = a3.requestAudioFocus(audioFocusRequest);
                B(requestAudioFocus);
                break;
        }
    }

    @Override // a.AbstractC0086a
    public final void W(G2.a aVar) {
        switch (this.f512b) {
            case 0:
                this.f = aVar;
                break;
            default:
                this.f = aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [H2.a] */
    @Override // a.AbstractC0086a
    public final void d0() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        switch (this.f512b) {
            case 0:
                if (this.f.f438e == 0) {
                    onAudioFocusChangeListener = null;
                } else {
                    final int i3 = 0;
                    onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: H2.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            switch (i3) {
                                case 0:
                                    ((b) this).B(i4);
                                    break;
                                default:
                                    ((b) this).B(i4);
                                    break;
                            }
                        }
                    };
                }
                this.f516g = onAudioFocusChangeListener;
                break;
            default:
                if (this.f.f438e == 0) {
                    build = null;
                } else {
                    A1.a.u();
                    audioAttributes = A1.a.j(this.f.f438e).setAudioAttributes(this.f.a());
                    final int i4 = 1;
                    onAudioFocusChangeListener2 = audioAttributes.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: H2.a
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i42) {
                            switch (i4) {
                                case 0:
                                    ((b) this).B(i42);
                                    break;
                                default:
                                    ((b) this).B(i42);
                                    break;
                            }
                        }
                    });
                    build = onAudioFocusChangeListener2.build();
                }
                this.f516g = build;
                break;
        }
    }

    @Override // a.AbstractC0086a
    public final G2.a x() {
        switch (this.f512b) {
        }
        return this.f;
    }

    @Override // a.AbstractC0086a
    public final o2.a y() {
        switch (this.f512b) {
        }
        return this.f514d;
    }

    @Override // a.AbstractC0086a
    public final o2.l z() {
        switch (this.f512b) {
        }
        return this.f515e;
    }
}

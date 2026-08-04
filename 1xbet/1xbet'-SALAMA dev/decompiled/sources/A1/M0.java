package A1;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Stack;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f125h;

    public M0(Context context, Handler handler, K k7) {
        Context applicationContext = context.getApplicationContext();
        this.f121d = applicationContext;
        this.f122e = handler;
        this.f123f = k7;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        p151v2.a.i(audioManager);
        this.f124g = audioManager;
        this.f118a = 3;
        this.f119b = d(audioManager, 3);
        int i7 = this.f118a;
        this.f120c = p151v2.t.f17159a >= 23 ? audioManager.isStreamMute(i7) : d(audioManager, i7) == 0;
        L0 l7 = new L0(this, 0);
        try {
            applicationContext.registerReceiver(l7, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f125h = l7;
        } catch (RuntimeException e7) {
            p151v2.a.G(e7, "StreamVolumeManager", "Error registering stream volume receiver");
        }
    }

    public static int d(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            p151v2.a.G(e7, "StreamVolumeManager", "Could not retrieve stream volume for stream type " + i7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    public C0934g a(int i7) {
        v4.c[] cVarArr = new v4.c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            cVarArr[i8] = (v4.c) ((Stack) this.f122e).get(i8);
        }
        return new C0934g(cVarArr);
    }

    public void b() {
        p120q4.k.b("Can't end range without starting a range!", ((StringBuilder) this.f121d) != null);
        for (int i7 = 0; i7 < this.f119b; i7++) {
            ((StringBuilder) this.f121d).append(")");
        }
        ((StringBuilder) this.f121d).append(")");
        C0934g c0934gA = a(this.f118a);
        ((ArrayList) this.f124g).add(p120q4.k.e(((StringBuilder) this.f121d).toString()));
        ((ArrayList) this.f123f).add(c0934gA);
        this.f121d = null;
    }

    public void c() {
        if (((StringBuilder) this.f121d) != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f121d = sb;
        sb.append("(");
        p075k4.k kVar = new p075k4.k(a(this.f119b));
        while (kVar.hasNext()) {
            ((StringBuilder) this.f121d).append(p120q4.k.f(((v4.c) kVar.next()).f17179a));
            ((StringBuilder) this.f121d).append(":(");
        }
        this.f120c = false;
    }

    public void e(int i7) {
        if (this.f118a == i7) {
            return;
        }
        this.f118a = i7;
        f();
        N n2 = ((K) this.f123f).f109a;
        C0039q c0039qS = N.s(n2.f177y);
        if (c0039qS.equals(n2.f151Z)) {
            return;
        }
        n2.f151Z = c0039qS;
        n2.f164l.k(29, new C0042s(c0039qS, 7));
    }

    public void f() {
        final boolean zIsStreamMute;
        int i7 = this.f118a;
        AudioManager audioManager = (AudioManager) this.f124g;
        final int iD = d(audioManager, i7);
        int i8 = this.f118a;
        if (p151v2.t.f17159a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i8);
        } else {
            zIsStreamMute = d(audioManager, i8) == 0;
        }
        if (this.f119b == iD && this.f120c == zIsStreamMute) {
            return;
        }
        this.f119b = iD;
        this.f120c = zIsStreamMute;
        ((K) this.f123f).f109a.f164l.k(30, new p151v2.e() { // from class: A1.I
            @Override // p151v2.e
            public final void invoke(Object obj) {
                ((z0) obj).u(iD, zIsStreamMute);
            }
        });
    }

    public M0(E4.y yVar) {
        this.f121d = null;
        this.f122e = new Stack();
        this.f118a = -1;
        this.f120c = true;
        this.f123f = new ArrayList();
        this.f124g = new ArrayList();
        this.f125h = yVar;
    }
}

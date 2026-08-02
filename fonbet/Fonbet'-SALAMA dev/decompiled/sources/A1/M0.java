package A1;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Stack;
import k4.C1349k;
import n4.C1473g;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public int f118a;

    /* renamed from: b, reason: collision with root package name */
    public int f119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f120c;

    /* renamed from: d, reason: collision with root package name */
    public Object f121d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f122e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f123f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f124g;

    /* renamed from: h, reason: collision with root package name */
    public Object f125h;

    public M0(Context context, Handler handler, K k7) {
        Context applicationContext = context.getApplicationContext();
        this.f121d = applicationContext;
        this.f122e = handler;
        this.f123f = k7;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        AbstractC1664a.i(audioManager);
        this.f124g = audioManager;
        this.f118a = 3;
        this.f119b = d(audioManager, 3);
        int i7 = this.f118a;
        this.f120c = v2.t.f17153a >= 23 ? audioManager.isStreamMute(i7) : d(audioManager, i7) == 0;
        L0 l02 = new L0(this, 0);
        try {
            applicationContext.registerReceiver(l02, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f125h = l02;
        } catch (RuntimeException e7) {
            AbstractC1664a.G(e7, "StreamVolumeManager", "Error registering stream volume receiver");
        }
    }

    public static int d(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            AbstractC1664a.G(e7, "StreamVolumeManager", "Could not retrieve stream volume for stream type " + i7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    public C1473g a(int i7) {
        v4.c[] cVarArr = new v4.c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            cVarArr[i8] = (v4.c) ((Stack) this.f122e).get(i8);
        }
        return new C1473g(cVarArr);
    }

    public void b() {
        q4.k.b("Can't end range without starting a range!", ((StringBuilder) this.f121d) != null);
        for (int i7 = 0; i7 < this.f119b; i7++) {
            ((StringBuilder) this.f121d).append(")");
        }
        ((StringBuilder) this.f121d).append(")");
        C1473g a2 = a(this.f118a);
        ((ArrayList) this.f124g).add(q4.k.e(((StringBuilder) this.f121d).toString()));
        ((ArrayList) this.f123f).add(a2);
        this.f121d = null;
    }

    public void c() {
        if (((StringBuilder) this.f121d) != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        this.f121d = sb;
        sb.append("(");
        C1349k c1349k = new C1349k(a(this.f119b));
        while (c1349k.hasNext()) {
            ((StringBuilder) this.f121d).append(q4.k.f(((v4.c) c1349k.next()).f17173a));
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
        C0039q s7 = N.s(n2.f177y);
        if (s7.equals(n2.f151Z)) {
            return;
        }
        n2.f151Z = s7;
        n2.f164l.k(29, new C0042s(s7, 7));
    }

    public void f() {
        int i7 = this.f118a;
        AudioManager audioManager = (AudioManager) this.f124g;
        final int d7 = d(audioManager, i7);
        int i8 = this.f118a;
        final boolean isStreamMute = v2.t.f17153a >= 23 ? audioManager.isStreamMute(i8) : d(audioManager, i8) == 0;
        if (this.f119b == d7 && this.f120c == isStreamMute) {
            return;
        }
        this.f119b = d7;
        this.f120c = isStreamMute;
        ((K) this.f123f).f109a.f164l.k(30, new v2.e() { // from class: A1.I
            @Override // v2.e
            public final void invoke(Object obj) {
                ((z0) obj).u(d7, isStreamMute);
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

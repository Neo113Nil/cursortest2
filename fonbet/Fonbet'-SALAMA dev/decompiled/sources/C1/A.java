package C1;

import A1.X;
import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final X f1325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1328d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1329e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1330f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1331g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1332h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0106l[] f1333i;

    public A(X x4, int i7, int i8, int i9, int i10, int i11, int i12, int i13, InterfaceC0106l[] interfaceC0106lArr) {
        this.f1325a = x4;
        this.f1326b = i7;
        this.f1327c = i8;
        this.f1328d = i9;
        this.f1329e = i10;
        this.f1330f = i11;
        this.f1331g = i12;
        this.f1332h = i13;
        this.f1333i = interfaceC0106lArr;
    }

    public static AudioAttributes c(C0101g c0101g, boolean z4) {
        return z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0101g.a().f16591b;
    }

    public final AudioTrack a(boolean z4, C0101g c0101g, int i7) {
        int i8 = this.f1327c;
        try {
            AudioTrack b7 = b(z4, c0101g, i7);
            int state = b7.getState();
            if (state == 1) {
                return b7;
            }
            try {
                b7.release();
            } catch (Exception unused) {
            }
            throw new p(state, this.f1329e, this.f1330f, this.f1332h, this.f1325a, i8 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new p(0, this.f1329e, this.f1330f, this.f1332h, this.f1325a, i8 == 1, e7);
        }
    }

    public final AudioTrack b(boolean z4, C0101g c0101g, int i7) {
        AudioTrack.Builder offloadedPlayback;
        int i8 = v2.t.f17153a;
        int i9 = this.f1331g;
        int i10 = this.f1330f;
        int i11 = this.f1329e;
        if (i8 >= 29) {
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(c(c0101g, z4)).setAudioFormat(E.e(i11, i10, i9)).setTransferMode(1).setBufferSizeInBytes(this.f1332h).setSessionId(i7).setOffloadedPlayback(this.f1327c == 1);
            return offloadedPlayback.build();
        }
        if (i8 >= 21) {
            return new AudioTrack(c(c0101g, z4), E.e(i11, i10, i9), this.f1332h, 1, i7);
        }
        int y4 = v2.t.y(c0101g.f1487c);
        if (i7 == 0) {
            return new AudioTrack(y4, this.f1329e, this.f1330f, this.f1331g, this.f1332h, 1);
        }
        return new AudioTrack(y4, this.f1329e, this.f1330f, this.f1331g, this.f1332h, 1, i7);
    }
}

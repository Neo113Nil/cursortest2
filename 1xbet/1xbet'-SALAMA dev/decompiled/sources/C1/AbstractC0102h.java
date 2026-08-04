package C1;

import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.O;
import E3.P;
import E3.Q;
import E3.a0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: renamed from: C1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0102h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f1491a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        C0165x c0165x = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        Q q7 = C0103i.f1494e;
        O o7 = q7.f2014b;
        if (o7 == null) {
            O o8 = new O(q7, new P(q7.f2017e, 0, q7.f2018f));
            q7.f2014b = o8;
            o7 = o8;
        }
        a0 it = o7.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f1491a)) {
                c0164w.b(num);
            }
        }
        c0164w.b(2);
        return Q0.a.Z(c0164w.d());
    }

    public static int b(int i7, int i8) {
        for (int i9 = 8; i9 > 0; i9--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(p151v2.t.o(i9)).build(), f1491a)) {
                return i9;
            }
        }
        return 0;
    }
}

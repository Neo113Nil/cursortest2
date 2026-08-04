package D1;

import android.media.MediaCodec;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f1676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f1680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f1684i;
    public final V0 j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f1684i = cryptoInfo;
        this.j = t.f17159a >= 24 ? new V0(cryptoInfo) : null;
    }
}

package D1;

import android.media.MediaCodec;
import v2.t;
import w1.V0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1676a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1677b;

    /* renamed from: c, reason: collision with root package name */
    public int f1678c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1679d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1680e;

    /* renamed from: f, reason: collision with root package name */
    public int f1681f;

    /* renamed from: g, reason: collision with root package name */
    public int f1682g;

    /* renamed from: h, reason: collision with root package name */
    public int f1683h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f1684i;
    public final V0 j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f1684i = cryptoInfo;
        this.j = t.f17153a >= 24 ? new V0(cryptoInfo) : null;
    }
}

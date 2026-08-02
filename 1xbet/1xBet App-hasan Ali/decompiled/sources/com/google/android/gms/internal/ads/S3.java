package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class S3 extends AbstractC1600tD {

    /* renamed from: A, reason: collision with root package name */
    public long f11490A;

    /* renamed from: s, reason: collision with root package name */
    public int f11491s;

    /* renamed from: t, reason: collision with root package name */
    public Date f11492t;

    /* renamed from: u, reason: collision with root package name */
    public Date f11493u;

    /* renamed from: v, reason: collision with root package name */
    public long f11494v;

    /* renamed from: w, reason: collision with root package name */
    public long f11495w;

    /* renamed from: x, reason: collision with root package name */
    public double f11496x;

    /* renamed from: y, reason: collision with root package name */
    public float f11497y;

    /* renamed from: z, reason: collision with root package name */
    public C1870zD f11498z;

    @Override // com.google.android.gms.internal.ads.AbstractC1600tD
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f11491s = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f15645l) {
            d();
        }
        if (this.f11491s == 1) {
            this.f11492t = AbstractC0952et.o(AbstractC1803xs.X(byteBuffer));
            this.f11493u = AbstractC0952et.o(AbstractC1803xs.X(byteBuffer));
            this.f11494v = AbstractC1803xs.Q(byteBuffer);
            this.f11495w = AbstractC1803xs.X(byteBuffer);
        } else {
            this.f11492t = AbstractC0952et.o(AbstractC1803xs.Q(byteBuffer));
            this.f11493u = AbstractC0952et.o(AbstractC1803xs.Q(byteBuffer));
            this.f11494v = AbstractC1803xs.Q(byteBuffer);
            this.f11495w = AbstractC1803xs.Q(byteBuffer);
        }
        this.f11496x = AbstractC1803xs.q(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f11497y = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        AbstractC1803xs.Q(byteBuffer);
        AbstractC1803xs.Q(byteBuffer);
        this.f11498z = new C1870zD(AbstractC1803xs.q(byteBuffer), AbstractC1803xs.q(byteBuffer), AbstractC1803xs.q(byteBuffer), AbstractC1803xs.q(byteBuffer), AbstractC1803xs.a(byteBuffer), AbstractC1803xs.a(byteBuffer), AbstractC1803xs.a(byteBuffer), AbstractC1803xs.q(byteBuffer), AbstractC1803xs.q(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f11490A = AbstractC1803xs.Q(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f11492t + ";modificationTime=" + this.f11493u + ";timescale=" + this.f11494v + ";duration=" + this.f11495w + ";rate=" + this.f11496x + ";volume=" + this.f11497y + ";matrix=" + this.f11498z + ";nextTrackId=" + this.f11490A + "]";
    }
}

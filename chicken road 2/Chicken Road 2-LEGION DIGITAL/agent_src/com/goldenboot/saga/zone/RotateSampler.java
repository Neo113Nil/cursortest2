package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class RotateSampler implements SocketDownloader {
    public final int detachStream;
    public final GlowFormatter evictLayout;
    public final String growPayload;
    public final Object[] injectMetric;

    public RotateSampler(GlowFormatter glowFormatter, String str, Object[] objArr) {
        this.evictLayout = glowFormatter;
        this.growPayload = str;
        this.injectMetric = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.detachStream = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.detachStream = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public Object[] detachStream() {
        return this.injectMetric;
    }

    @Override // com.goldenboot.saga.zone.SocketDownloader
    public boolean evictLayout() {
        return (this.detachStream & 2) == 2;
    }

    @Override // com.goldenboot.saga.zone.SocketDownloader
    public GlowFormatter growPayload() {
        return this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.SocketDownloader
    public PinchEdge injectMetric() {
        return (this.detachStream & 1) == 1 ? PinchEdge.PROTO2 : PinchEdge.PROTO3;
    }

    public String releaseHeader() {
        return this.growPayload;
    }
}

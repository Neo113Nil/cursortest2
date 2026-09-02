package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SessionRegistry {
    public int detachStream;
    public long[] evictLayout;
    public Object[] growPayload;
    public int[] injectMetric;
    public int releaseHeader;

    public /* synthetic */ SessionRegistry(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int clipOrigin() {
        return this.releaseHeader;
    }

    public final int detachStream() {
        return this.detachStream;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionRegistry)) {
            return false;
        }
        SessionRegistry sessionRegistry = (SessionRegistry) obj;
        if (sessionRegistry.clipOrigin() != clipOrigin()) {
            return false;
        }
        Object[] objArr = this.growPayload;
        int[] iArr = this.injectMetric;
        long[] jArr = this.evictLayout;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int growPayload = sessionRegistry.growPayload(obj2);
                            if (growPayload < 0 || i5 != sessionRegistry.injectMetric[growPayload]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final boolean evictLayout(Object obj) {
        return growPayload(obj) >= 0;
    }

    public final boolean flushSample() {
        return this.releaseHeader == 0;
    }

    public final int growPayload(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.detachStream;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.evictLayout;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.growPayload[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public int hashCode() {
        Object[] objArr = this.growPayload;
        int[] iArr = this.injectMetric;
        long[] jArr = this.evictLayout;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final int injectMetric(Object obj) {
        int growPayload = growPayload(obj);
        if (growPayload < 0) {
            LifecycleCreator.detachStream("There is no key " + obj + " in the map");
        }
        return this.injectMetric[growPayload];
    }

    public final int releaseHeader(Object obj, int i) {
        int growPayload = growPayload(obj);
        return growPayload >= 0 ? this.injectMetric[growPayload] : i;
    }

    public String toString() {
        if (flushSample()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.growPayload;
        int[] iArr = this.injectMetric;
        long[] jArr = this.evictLayout;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.releaseHeader) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final boolean updateTimer() {
        return this.releaseHeader != 0;
    }

    public SessionRegistry() {
        this.evictLayout = TileRunner.evictLayout;
        this.growPayload = IndicatorProvider.injectMetric;
        this.injectMetric = EndpointCache.evictLayout();
    }
}

package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", "get", "(J)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "trySet", "(JLjava/lang/Object;)Z", "newWith", "(JLjava/lang/Object;)Landroidx/compose/runtime/internal/ThreadMap;", "p0", "Camera2StreamConfigurationMap", "(J)I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "[J", "[Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    public ThreadMap(int i, long[] jArr, java.lang.Object[] objArr) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = jArr;
        this.getHighSpeedVideoFpsRangesFor = objArr;
    }

    public final java.lang.Object get(long key) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(key);
        if (Camera2StreamConfigurationMap >= 0) {
            return this.getHighSpeedVideoFpsRangesFor[Camera2StreamConfigurationMap];
        }
        return null;
    }

    public final boolean trySet(long key, java.lang.Object value) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(key);
        if (Camera2StreamConfigurationMap < 0) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor[Camera2StreamConfigurationMap] = value;
        return true;
    }

    public final androidx.compose.runtime.internal.ThreadMap newWith(long key, java.lang.Object value) {
        int i = this.getHighSpeedVideoSizes;
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : this.getHighSpeedVideoFpsRangesFor) {
            if (obj != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        java.lang.Object[] objArr = new java.lang.Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j = this.getHighResolutionOutputSizeshNQ4ISI[i5];
                java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor[i5];
                if (j > key) {
                    jArr[i2] = key;
                    objArr[i2] = value;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j;
                    objArr[i2] = obj2;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = key;
                objArr[i3] = value;
            } else {
                while (i2 < i4) {
                    long j2 = this.getHighResolutionOutputSizeshNQ4ISI[i5];
                    java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor[i5];
                    if (obj3 != null) {
                        jArr[i2] = j2;
                        objArr[i2] = obj3;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new androidx.compose.runtime.internal.ThreadMap(i4, jArr, objArr);
    }

    private final int Camera2StreamConfigurationMap(long p0) {
        int i = this.getHighSpeedVideoSizes - 1;
        if (i != -1) {
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j = this.getHighResolutionOutputSizeshNQ4ISI[i3] - p0;
                    if (j < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI[0];
            if (j2 == p0) {
                return 0;
            }
            if (j2 > p0) {
                return -2;
            }
        }
        return -1;
    }
}

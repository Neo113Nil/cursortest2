package okio;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokio/PriorityQueue;", "", "<init>", "()V", "Lokio/AsyncTimeout;", "first", "()Lokio/AsyncTimeout;", "node", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Lokio/AsyncTimeout;)V", "remove", "", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(ILokio/AsyncTimeout;)V", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "", "array", "[Lokio/AsyncTimeout;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PriorityQueue {
    public okio.AsyncTimeout[] array = new okio.AsyncTimeout[8];
    public int size;

    public final okio.AsyncTimeout first() {
        return this.array[1];
    }

    public final void add(okio.AsyncTimeout node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        int i = this.size + 1;
        this.size = i;
        okio.AsyncTimeout[] asyncTimeoutArr = this.array;
        if (i == asyncTimeoutArr.length) {
            okio.AsyncTimeout[] asyncTimeoutArr2 = new okio.AsyncTimeout[i * 2];
            kotlin.collections.ArraysKt.copyInto$default(asyncTimeoutArr, asyncTimeoutArr2, 0, 0, 0, 14, (java.lang.Object) null);
            this.array = asyncTimeoutArr2;
        }
        getHighSpeedVideoFpsRangesFor(i, node);
    }

    public final void remove(okio.AsyncTimeout node) {
        okio.AsyncTimeout asyncTimeout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        if (node.index == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i = this.size;
        int i2 = node.index;
        okio.AsyncTimeout asyncTimeout2 = this.array[i];
        kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout2);
        node.index = -1;
        this.array[i] = null;
        this.size = i - 1;
        if (node == asyncTimeout2) {
            return;
        }
        int compare = kotlin.jvm.internal.Intrinsics.compare(0L, asyncTimeout2.getTimeoutAt() - node.getTimeoutAt());
        if (compare == 0) {
            this.array[i2] = asyncTimeout2;
            asyncTimeout2.index = i2;
            return;
        }
        if (compare >= 0) {
            getHighSpeedVideoFpsRangesFor(i2, asyncTimeout2);
            return;
        }
        while (true) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            int i5 = this.size;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                asyncTimeout = this.array[i3];
                kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            } else {
                asyncTimeout = this.array[i3];
                kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
                okio.AsyncTimeout asyncTimeout3 = this.array[i4];
                kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout3);
                if (kotlin.jvm.internal.Intrinsics.compare(0L, asyncTimeout3.getTimeoutAt() - asyncTimeout.getTimeoutAt()) >= 0) {
                    asyncTimeout = asyncTimeout3;
                }
            }
            if (kotlin.jvm.internal.Intrinsics.compare(0L, asyncTimeout.getTimeoutAt() - asyncTimeout2.getTimeoutAt()) <= 0) {
                break;
            }
            int i6 = asyncTimeout.index;
            asyncTimeout.index = i2;
            this.array[i2] = asyncTimeout;
            i2 = i6;
        }
        this.array[i2] = asyncTimeout2;
        asyncTimeout2.index = i2;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, okio.AsyncTimeout p1) {
        while (true) {
            int i = p0 >> 1;
            if (i == 0) {
                break;
            }
            okio.AsyncTimeout asyncTimeout = this.array[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(asyncTimeout);
            if (kotlin.jvm.internal.Intrinsics.compare(0L, p1.getTimeoutAt() - asyncTimeout.getTimeoutAt()) <= 0) {
                break;
            }
            asyncTimeout.index = p0;
            this.array[p0] = asyncTimeout;
            p0 = i;
        }
        this.array[p0] = p1;
        p1.index = p0;
    }
}

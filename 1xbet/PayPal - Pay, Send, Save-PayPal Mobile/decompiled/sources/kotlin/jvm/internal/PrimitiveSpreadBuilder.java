package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00038\u0005@\u0005X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0006R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "T", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "spreadArgument", "", "addSpread", "(Ljava/lang/Object;)V", "()I", "values", "result", "toArray", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, com.daon.sdk.face.license.License.FEATURE_POSITION, "getPosition", "setPosition", "", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PrimitiveSpreadBuilder<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final T[] getHighSpeedVideoSizes;
    private final int getHighSpeedVideoFpsRangesFor;
    private int position;

    protected abstract int getSize(T t);

    public PrimitiveSpreadBuilder(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = (T[]) new java.lang.Object[i];
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int i) {
        this.position = i;
    }

    public final void addSpread(T spreadArgument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spreadArgument, "");
        T[] tArr = this.getHighSpeedVideoSizes;
        int i = this.position;
        this.position = i + 1;
        tArr[i] = spreadArgument;
    }

    protected final int size() {
        int i = this.getHighSpeedVideoFpsRangesFor - 1;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            T t = this.getHighSpeedVideoSizes[i2];
            i3 += t != null ? getSize(t) : 1;
            if (i2 == i) {
                return i3;
            }
            i2++;
        }
    }

    protected final T toArray(T values, T result) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        int i2 = this.getHighSpeedVideoFpsRangesFor - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t = this.getHighSpeedVideoSizes[i4];
                if (t != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        java.lang.System.arraycopy(values, i5, result, i, i6);
                        i += i6;
                    }
                    int size = getSize(t);
                    java.lang.System.arraycopy(t, 0, result, i, size);
                    i += size;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.getHighSpeedVideoFpsRangesFor;
        if (i3 < i7) {
            java.lang.System.arraycopy(values, i3, result, i, i7 - i3);
        }
        return result;
    }
}

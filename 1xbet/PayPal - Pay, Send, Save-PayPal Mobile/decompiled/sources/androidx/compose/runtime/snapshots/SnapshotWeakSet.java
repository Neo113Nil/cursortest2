package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\tH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&0%8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "T", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;I)I", "p2", "getHighSpeedVideoFpsRanges", "(ILjava/lang/Object;I)I", "isValid$runtime", "()Z", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize$runtime", "()I", "setSize$runtime", "(I)V", "", "hashes", "[I", "getHashes$runtime", "()[I", "setHashes$runtime", "([I)V", "", "Landroidx/compose/runtime/internal/WeakReference;", "values", "[Landroidx/compose/runtime/internal/WeakReference;", "getValues$runtime", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime", "([Landroidx/compose/runtime/internal/WeakReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private androidx.compose.runtime.internal.WeakReference<T>[] values = new androidx.compose.runtime.internal.WeakReference[16];

    /* renamed from: getSize$runtime, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void setSize$runtime(int i) {
        this.size = i;
    }

    /* renamed from: getHashes$runtime, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final void setHashes$runtime(int[] iArr) {
        this.hashes = iArr;
    }

    public final androidx.compose.runtime.internal.WeakReference<T>[] getValues$runtime() {
        return this.values;
    }

    public final void setValues$runtime(androidx.compose.runtime.internal.WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }

    public final boolean add(T value) {
        int i;
        int i2 = this.size;
        int identityHashCode = androidx.compose.runtime.internal.System_jvmKt.identityHashCode(value);
        if (i2 > 0) {
            i = getHighSpeedVideoFpsRangesFor(value, identityHashCode);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        androidx.compose.runtime.internal.WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            androidx.compose.runtime.internal.WeakReference<T>[] weakReferenceArr2 = new androidx.compose.runtime.internal.WeakReference[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            java.lang.System.arraycopy(weakReferenceArr, i3, weakReferenceArr2, i5, i2 - i3);
            java.lang.System.arraycopy(this.values, 0, weakReferenceArr2, 0, i3);
            kotlin.collections.ArraysKt.copyInto(this.hashes, iArr, i5, i3, i2);
            kotlin.collections.ArraysKt.copyInto$default(this.hashes, iArr, 0, 0, i3, 6, (java.lang.Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i6 = i3 + 1;
            java.lang.System.arraycopy(weakReferenceArr, i3, weakReferenceArr, i6, i2 - i3);
            int[] iArr2 = this.hashes;
            kotlin.collections.ArraysKt.copyInto(iArr2, iArr2, i6, i3, i2);
        }
        this.values[i3] = new androidx.compose.runtime.internal.WeakReference<>(value);
        this.hashes[i3] = identityHashCode;
        this.size++;
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> block) {
        int size = getSize();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            androidx.compose.runtime.internal.WeakReference<T> weakReference = getValues$runtime()[i];
            T t = weakReference != null ? weakReference.get() : null;
            if (t != null && !block.invoke(t).booleanValue()) {
                if (i2 != i) {
                    getValues$runtime()[i2] = weakReference;
                    getHashes()[i2] = getHashes()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < size; i3++) {
            getValues$runtime()[i3] = null;
            getHashes()[i3] = 0;
        }
        if (i2 != size) {
            setSize$runtime(i2);
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(T p0, int p1) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.hashes[i3];
            if (i4 < p1) {
                i2 = i3 + 1;
            } else {
                if (i4 <= p1) {
                    androidx.compose.runtime.internal.WeakReference<T> weakReference = this.values[i3];
                    return p0 == (weakReference != null ? weakReference.get() : null) ? i3 : getHighSpeedVideoFpsRanges(i3, p0, p1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int getHighSpeedVideoFpsRanges(int p0, T p1, int p2) {
        int i = p0 - 1;
        while (true) {
            if (i < 0 || this.hashes[i] != p2) {
                break;
            }
            androidx.compose.runtime.internal.WeakReference<T> weakReference = this.values[i];
            if ((weakReference != null ? weakReference.get() : null) == p1) {
                return i;
            }
            i--;
        }
        int i2 = p0 + 1;
        int i3 = this.size;
        while (true) {
            if (i2 < i3) {
                if (this.hashes[i2] != p2) {
                    break;
                }
                androidx.compose.runtime.internal.WeakReference<T> weakReference2 = this.values[i2];
                if ((weakReference2 != null ? weakReference2.get() : null) == p1) {
                    return i2;
                }
                i2++;
            } else {
                i2 = this.size;
                break;
            }
        }
        return -(i2 + 1);
    }

    public final boolean isValid$runtime() {
        androidx.compose.runtime.internal.WeakReference<T> weakReference;
        int i = this.size;
        androidx.compose.runtime.internal.WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i > length) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            if (i4 < i2 || (weakReference = weakReferenceArr[i3]) == null) {
                return false;
            }
            T t = weakReference.get();
            if (t != null && i4 != androidx.compose.runtime.internal.System_jvmKt.identityHashCode(t)) {
                return false;
            }
            i3++;
            i2 = i4;
        }
        while (i < length) {
            if (iArr[i] != 0 || weakReferenceArr[i] != null) {
                return false;
            }
            i++;
        }
        return true;
    }
}

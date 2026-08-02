package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "", "index", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i, T t) {
        this.index = i;
        this.value = t;
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndexedValue(index=");
        sb.append(this.index);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.index);
        T t = this.value;
        return (hashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.collections.IndexedValue)) {
            return false;
        }
        kotlin.collections.IndexedValue indexedValue = (kotlin.collections.IndexedValue) other;
        return this.index == indexedValue.index && kotlin.jvm.internal.Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final kotlin.collections.IndexedValue<T> copy(int index, T value) {
        return new kotlin.collections.IndexedValue<>(index, value);
    }

    public final T component2() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.collections.IndexedValue copy$default(kotlin.collections.IndexedValue indexedValue, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = indexedValue.index;
        }
        if ((i2 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i, obj);
    }
}

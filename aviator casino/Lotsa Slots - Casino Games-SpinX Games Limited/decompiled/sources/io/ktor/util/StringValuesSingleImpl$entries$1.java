package io.ktor.util;

/* compiled from: StringValues.kt */
@kotlin.Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001J\u000f\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/ktor/util/StringValuesSingleImpl$entries$1", "", "", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.ironsource.X3.i.W, "Ljava/lang/String;", "getKey", "value", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringValuesSingleImpl$entries$1 implements java.util.Map.Entry<java.lang.String, java.util.List<? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.lang.String key;
    private final java.util.List<java.lang.String> value;

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.String> setValue(java.util.List<? extends java.lang.String> list) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: setValue, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.String> setValue2(java.util.List<java.lang.String> list) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    StringValuesSingleImpl$entries$1(io.ktor.util.StringValuesSingleImpl stringValuesSingleImpl) {
        this.key = stringValuesSingleImpl.getName();
        this.value = stringValuesSingleImpl.getValues();
    }

    @Override // java.util.Map.Entry
    public java.lang.String getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public java.util.List<? extends java.lang.String> getValue() {
        return this.value;
    }

    public java.lang.String toString() {
        return getKey() + com.ironsource.B5.U + getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object other) {
        if (other instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), getKey()) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return getKey().hashCode() ^ getValue().hashCode();
    }
}

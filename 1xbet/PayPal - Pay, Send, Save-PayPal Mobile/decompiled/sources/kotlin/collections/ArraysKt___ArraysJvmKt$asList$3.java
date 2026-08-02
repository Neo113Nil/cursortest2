package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/collections/ArraysKt___ArraysJvmKt$asList$3;", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "isEmpty", "()Z", "element", "contains", "(I)Z", "index", "get", "(I)Ljava/lang/Integer;", "indexOf", "(I)I", "lastIndexOf", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArraysKt___ArraysJvmKt$asList$3 extends kotlin.collections.AbstractList<java.lang.Integer> implements java.util.RandomAccess {
    final /* synthetic */ int[] Camera2StreamConfigurationMap;

    ArraysKt___ArraysJvmKt$asList$3(int[] iArr) {
        this.Camera2StreamConfigurationMap = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return contains(((java.lang.Number) obj).intValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return indexOf(((java.lang.Number) obj).intValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return lastIndexOf(((java.lang.Number) obj).intValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.Camera2StreamConfigurationMap.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.length == 0;
    }

    public final boolean contains(int element) {
        return kotlin.collections.ArraysKt.contains(this.Camera2StreamConfigurationMap, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final java.lang.Integer get(int index) {
        return java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap[index]);
    }

    public final int indexOf(int element) {
        return kotlin.collections.ArraysKt.indexOf(this.Camera2StreamConfigurationMap, element);
    }

    public final int lastIndexOf(int element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.Camera2StreamConfigurationMap, element);
    }
}

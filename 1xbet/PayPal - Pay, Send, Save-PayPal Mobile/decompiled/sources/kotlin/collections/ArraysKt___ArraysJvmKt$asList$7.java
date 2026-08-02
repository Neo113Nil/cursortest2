package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/collections/ArraysKt___ArraysJvmKt$asList$7;", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "isEmpty", "()Z", "element", "contains", "(Z)Z", "", "index", "get", "(I)Ljava/lang/Boolean;", "indexOf", "(Z)I", "lastIndexOf", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArraysKt___ArraysJvmKt$asList$7 extends kotlin.collections.AbstractList<java.lang.Boolean> implements java.util.RandomAccess {
    final /* synthetic */ boolean[] getHighResolutionOutputSizeshNQ4ISI;

    ArraysKt___ArraysJvmKt$asList$7(boolean[] zArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = zArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return contains(((java.lang.Boolean) obj).booleanValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return indexOf(((java.lang.Boolean) obj).booleanValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return lastIndexOf(((java.lang.Boolean) obj).booleanValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length == 0;
    }

    public final boolean contains(boolean element) {
        return kotlin.collections.ArraysKt.contains(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final java.lang.Boolean get(int index) {
        return java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI[index]);
    }

    public final int indexOf(boolean element) {
        return kotlin.collections.ArraysKt.indexOf(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }

    public final int lastIndexOf(boolean element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }
}

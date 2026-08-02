package kotlin.collections.unsigned;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1;", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "isEmpty", "()Z", "element", "contains-WZ4Q5Ns", "(I)Z", "contains", "", "index", "get-pVg5ArA", "(I)I", "get", "indexOf-WZ4Q5Ns", "indexOf", "lastIndexOf-WZ4Q5Ns", "lastIndexOf", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends kotlin.collections.AbstractList<kotlin.UInt> implements java.util.RandomAccess {
    final /* synthetic */ int[] getHighSpeedVideoSizes;

    UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.getHighSpeedVideoSizes = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m23594containsWZ4Q5Ns(((kotlin.UInt) obj).getCamera2StreamConfigurationMap());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return kotlin.UInt.m23469boximpl(m23595getpVg5ArA(i));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m23596indexOfWZ4Q5Ns(((kotlin.UInt) obj).getCamera2StreamConfigurationMap());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m23597lastIndexOfWZ4Q5Ns(((kotlin.UInt) obj).getCamera2StreamConfigurationMap());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return kotlin.UIntArray.m23484getSizeimpl(this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return kotlin.UIntArray.m23486isEmptyimpl(this.getHighSpeedVideoSizes);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public final boolean m23594containsWZ4Q5Ns(int element) {
        return kotlin.UIntArray.m23479containsWZ4Q5Ns(this.getHighSpeedVideoSizes, element);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public final int m23595getpVg5ArA(int index) {
        return kotlin.UIntArray.m23483getpVg5ArA(this.getHighSpeedVideoSizes, index);
    }

    /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public final int m23596indexOfWZ4Q5Ns(int element) {
        return kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoSizes, element);
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public final int m23597lastIndexOfWZ4Q5Ns(int element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.getHighSpeedVideoSizes, element);
    }
}

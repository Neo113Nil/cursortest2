package kotlin.collections.unsigned;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2;", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "isEmpty", "()Z", "element", "contains-VKZWuLQ", "(J)Z", "contains", "", "index", "get-s-VKNKU", "(I)J", "get", "indexOf-VKZWuLQ", "(J)I", "indexOf", "lastIndexOf-VKZWuLQ", "lastIndexOf", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraysKt___UArraysJvmKt$asList$2 extends kotlin.collections.AbstractList<kotlin.ULong> implements java.util.RandomAccess {
    final /* synthetic */ long[] getHighSpeedVideoFpsRanges;

    UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.getHighSpeedVideoFpsRanges = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.ULong) {
            return m23598containsVKZWuLQ(((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return kotlin.ULong.m23493boximpl(m23599getsVKNKU(i));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.ULong) {
            return m23600indexOfVKZWuLQ(((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.ULong) {
            return m23601lastIndexOfVKZWuLQ(((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return kotlin.ULongArray.m23508getSizeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return kotlin.ULongArray.m23510isEmptyimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public final boolean m23598containsVKZWuLQ(long element) {
        return kotlin.ULongArray.m23503containsVKZWuLQ(this.getHighSpeedVideoFpsRanges, element);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public final long m23599getsVKNKU(int index) {
        return kotlin.ULongArray.m23507getsVKNKU(this.getHighSpeedVideoFpsRanges, index);
    }

    /* renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public final int m23600indexOfVKZWuLQ(long element) {
        return kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoFpsRanges, element);
    }

    /* renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public final int m23601lastIndexOfVKZWuLQ(long element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.getHighSpeedVideoFpsRanges, element);
    }
}

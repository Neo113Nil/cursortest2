package kotlin.collections.unsigned;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4;", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "isEmpty", "()Z", "element", "contains-xj2QHRw", "(S)Z", "contains", "", "index", "get-Mh2AYeg", "(I)S", "get", "indexOf-xj2QHRw", "(S)I", "indexOf", "lastIndexOf-xj2QHRw", "lastIndexOf", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraysKt___UArraysJvmKt$asList$4 extends kotlin.collections.AbstractList<kotlin.UShort> implements java.util.RandomAccess {
    final /* synthetic */ short[] getHighResolutionOutputSizeshNQ4ISI;

    UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UShort) {
            return m23606containsxj2QHRw(((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return kotlin.UShort.m23517boximpl(m23607getMh2AYeg(i));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UShort) {
            return m23608indexOfxj2QHRw(((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UShort) {
            return m23609lastIndexOfxj2QHRw(((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return kotlin.UShortArray.m23532getSizeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return kotlin.UShortArray.m23534isEmptyimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public final boolean m23606containsxj2QHRw(short element) {
        return kotlin.UShortArray.m23527containsxj2QHRw(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public final short m23607getMh2AYeg(int index) {
        return kotlin.UShortArray.m23531getMh2AYeg(this.getHighResolutionOutputSizeshNQ4ISI, index);
    }

    /* renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public final int m23608indexOfxj2QHRw(short element) {
        return kotlin.collections.ArraysKt.indexOf(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }

    /* renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public final int m23609lastIndexOfxj2QHRw(short element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.getHighResolutionOutputSizeshNQ4ISI, element);
    }
}

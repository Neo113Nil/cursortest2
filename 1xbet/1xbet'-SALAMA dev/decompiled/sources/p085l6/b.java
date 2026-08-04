package p085l6;

import W5.AbstractC0486a1;
import java.io.Serializable;
import p050g6.d;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends d implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f15044a;

    public b(Enum[] enumArr) {
        h.e(enumArr, "entries");
        this.f15044a = enumArr;
    }

    @Override // p050g6.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r7 = (Enum) obj;
        h.e(r7, "element");
        int iOrdinal = r7.ordinal();
        Enum[] enumArr = this.f15044a;
        h.e(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f15044a;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // p050g6.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r7 = (Enum) obj;
        h.e(r7, "element");
        int iOrdinal = r7.ordinal();
        Enum[] enumArr = this.f15044a;
        h.e(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r7) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p050g6.d
    public final int l() {
        return this.f15044a.length;
    }

    @Override // p050g6.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r7 = (Enum) obj;
        h.e(r7, "element");
        return indexOf(r7);
    }
}

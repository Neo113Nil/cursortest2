package l6;

import W5.AbstractC0486a1;
import g6.AbstractC1155d;
import java.io.Serializable;
import t6.h;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1412b extends AbstractC1155d implements InterfaceC1411a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f15038a;

    public C1412b(Enum[] enumArr) {
        h.e(enumArr, "entries");
        this.f15038a = enumArr;
    }

    @Override // g6.AbstractC1155d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r52 = (Enum) obj;
        h.e(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f15038a;
        h.e(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r52;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f15038a;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // g6.AbstractC1155d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        h.e(r52, "element");
        int ordinal = r52.ordinal();
        Enum[] enumArr = this.f15038a;
        h.e(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r52) {
            return ordinal;
        }
        return -1;
    }

    @Override // g6.AbstractC1155d
    public final int l() {
        return this.f15038a.length;
    }

    @Override // g6.AbstractC1155d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        h.e(r22, "element");
        return indexOf(r22);
    }
}

package d4;

import X3.e;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917b extends e implements InterfaceC1916a, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Enum[] f16885k;

    public C1917b(Enum[] enumArr) {
        this.f16885k = enumArr;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f16885k.length;
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        l.f("element", r42);
        Enum[] enumArr = this.f16885k;
        int ordinal = r42.ordinal();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f16885k;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(L1.a.k(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // X3.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        l.f("element", r42);
        int ordinal = r42.ordinal();
        Enum[] enumArr = this.f16885k;
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r42) {
            return ordinal;
        }
        return -1;
    }

    @Override // X3.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        l.f("element", r22);
        return indexOf(r22);
    }
}

package n4;

import B0.o;
import g4.AbstractC0459d;
import g4.AbstractC0464i;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345b extends AbstractC0459d implements InterfaceC1344a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f11469a;

    public C1345b(Enum[] entries) {
        i.e(entries, "entries");
        this.f11469a = entries;
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return this.f11469a.length;
    }

    @Override // g4.AbstractC0456a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return ((Enum) AbstractC0464i.U(element.ordinal(), this.f11469a)) == element;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Enum[] enumArr = this.f11469a;
        int length = enumArr.length;
        if (i2 < 0 || i2 >= length) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, length, ", size: "));
        }
        return enumArr[i2];
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC0464i.U(ordinal, this.f11469a)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC0464i.U(ordinal, this.f11469a)) == element) {
            return ordinal;
        }
        return -1;
    }
}

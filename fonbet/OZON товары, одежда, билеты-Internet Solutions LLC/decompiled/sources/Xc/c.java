package Xc;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class c<T extends Enum<T>> extends AbstractC7696c<T> implements a<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T[] f34277b;

    public c(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f34277b = entries;
    }

    private final Object writeReplace() {
        return new d(this.f34277b);
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) C7705l.K(element.ordinal(), this.f34277b)) == element;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        T[] tArr = this.f34277b;
        int length = tArr.length;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, length);
        return tArr[i11];
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f34277b.length;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) C7705l.K(ordinal, this.f34277b)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}

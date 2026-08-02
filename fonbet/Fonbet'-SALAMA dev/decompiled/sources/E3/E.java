package E3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class E implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final E f1991a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ E[] f1992b;

    static {
        E e7 = new E("INSTANCE", 0);
        f1991a = e7;
        f1992b = new E[]{e7};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f1992b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        p3.f.q("no calls to next() since the last call to remove()", false);
    }
}

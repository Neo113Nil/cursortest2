package e2;

import java.util.AbstractList;
import java.util.List;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0286a extends AbstractList implements List, p2.a {
    public abstract int b();

    public abstract Object c(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return c(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}

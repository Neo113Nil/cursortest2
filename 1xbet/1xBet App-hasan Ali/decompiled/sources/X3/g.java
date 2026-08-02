package X3;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends AbstractList implements List, j4.c {
    public abstract int c();

    public abstract Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}

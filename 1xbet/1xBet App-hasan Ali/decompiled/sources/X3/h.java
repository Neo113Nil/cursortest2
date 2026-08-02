package X3;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h extends AbstractSet implements Set, j4.e {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}

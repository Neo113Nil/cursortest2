package n2;

import g4.AbstractC0459d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339a extends AbstractC0459d implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11463a;

    public C1339a(List list) {
        i.e(list, "list");
        this.f11463a = new ArrayList(list);
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return this.f11463a.size();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f11463a.get(i2);
    }

    @Override // g4.AbstractC0456a, java.util.Collection
    public final Object[] toArray() {
        return this.f11463a.toArray(new Object[0]);
    }
}

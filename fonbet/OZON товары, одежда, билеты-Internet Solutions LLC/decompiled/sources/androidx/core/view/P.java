package androidx.core.view;

import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class P<T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<T, Iterator<T>> f42237a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f42238b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Iterator<? extends T> f42239c;

    public P(@NotNull C5314e0 c5314e0, @NotNull Function1 function1) {
        this.f42237a = function1;
        this.f42239c = c5314e0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42239c.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f42239c.next();
        Iterator<? extends T> it = (Iterator) ((C5312d0) this.f42237a).invoke(next);
        ArrayList arrayList = this.f42238b;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f42239c);
            this.f42239c = it;
            return next;
        }
        while (!this.f42239c.hasNext() && !arrayList.isEmpty()) {
            this.f42239c = (Iterator) C7714v.X(arrayList);
            C7714v.w0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

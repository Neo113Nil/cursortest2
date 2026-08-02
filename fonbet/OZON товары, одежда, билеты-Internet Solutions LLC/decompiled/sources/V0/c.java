package V0;

import W0.f;
import gd.InterfaceC6712a;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface c<E> extends a<E>, Collection, InterfaceC6712a {
    @Override // java.util.List
    @NotNull
    c<E> add(int i11, E e11);

    @Override // java.util.List, java.util.Collection
    @NotNull
    c<E> add(E e11);

    @Override // java.util.List, java.util.Collection
    @NotNull
    c<E> addAll(@NotNull Collection<? extends E> collection);

    @NotNull
    f d();

    @NotNull
    c<E> d1(int i11);

    @Override // java.util.List, java.util.Collection
    @NotNull
    c<E> remove(E e11);

    @Override // java.util.List, java.util.Collection
    @NotNull
    c<E> removeAll(@NotNull Collection<? extends E> collection);

    @NotNull
    c<E> s0(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.List
    @NotNull
    c<E> set(int i11, E e11);
}

package B1;

import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import kotlin.jvm.internal.C7728j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface A0 {

    public static final class a implements Collection<Object>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashSet f2026a = new LinkedHashSet();

        public a(int i11) {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f2026a.add(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void b(Object obj) {
            this.f2026a.add(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f2026a.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f2026a.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
            return this.f2026a.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f2026a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<Object> iterator() {
            return this.f2026a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f2026a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
            return this.f2026a.remove(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
            return this.f2026a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f2026a.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return C7728j.a(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C7728j.b(this, tArr);
        }
    }

    void a(@NotNull a aVar);

    boolean b(Object obj, Object obj2);
}

package V0;

import Bl0.j0;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC7696c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface a<E> extends List<E>, Collection, InterfaceC6712a {

    /* renamed from: V0.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static final class C0568a<E> extends AbstractC7696c<E> implements a<E> {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a<E> f27896b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27897c;

        /* renamed from: d, reason: collision with root package name */
        private int f27898d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0568a(@NotNull a<? extends E> aVar, int i11, int i12) {
            this.f27896b = aVar;
            this.f27897c = i11;
            j0.f(i11, i12, aVar.size());
            this.f27898d = i12 - i11;
        }

        @Override // java.util.List
        public final E get(int i11) {
            j0.d(i11, this.f27898d);
            return this.f27896b.get(this.f27897c + i11);
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return this.f27898d;
        }

        @Override // kotlin.collections.AbstractC7696c, java.util.List
        public final List subList(int i11, int i12) {
            j0.f(i11, i12, this.f27898d);
            int i13 = this.f27897c;
            return new C0568a(this.f27896b, i11 + i13, i13 + i12);
        }
    }

    @Override // java.util.List
    @NotNull
    default a<E> subList(int i11, int i12) {
        return new C0568a(this, i11, i12);
    }
}

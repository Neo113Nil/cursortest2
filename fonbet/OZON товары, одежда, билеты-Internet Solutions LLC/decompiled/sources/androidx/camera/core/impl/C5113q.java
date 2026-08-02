package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5113q {

    /* renamed from: androidx.camera.core.impl.q$a */
    public static final class a extends AbstractC5111p {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f38380a = new ArrayList();

        a(@NonNull List<AbstractC5111p> list) {
            for (AbstractC5111p abstractC5111p : list) {
                if (!(abstractC5111p instanceof b)) {
                    this.f38380a.add(abstractC5111p);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void a(int i11) {
            Iterator it = this.f38380a.iterator();
            while (it.hasNext()) {
                ((AbstractC5111p) it.next()).a(i11);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
            Iterator it = this.f38380a.iterator();
            while (it.hasNext()) {
                ((AbstractC5111p) it.next()).b(i11, interfaceC5130z);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void c(int i11, @NonNull r rVar) {
            Iterator it = this.f38380a.iterator();
            while (it.hasNext()) {
                ((AbstractC5111p) it.next()).c(i11, rVar);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void d(int i11) {
            Iterator it = this.f38380a.iterator();
            while (it.hasNext()) {
                ((AbstractC5111p) it.next()).d(i11);
            }
        }

        @NonNull
        public final ArrayList e() {
            return this.f38380a;
        }
    }

    /* renamed from: androidx.camera.core.impl.q$b */
    static final class b extends AbstractC5111p {
        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void c(int i11, @NonNull r rVar) {
        }

        @Override // androidx.camera.core.impl.AbstractC5111p
        public final void d(int i11) {
        }
    }

    @NonNull
    public static AbstractC5111p a(@NonNull AbstractC5111p... abstractC5111pArr) {
        List asList = Arrays.asList(abstractC5111pArr);
        return asList.isEmpty() ? new b() : asList.size() == 1 ? (AbstractC5111p) asList.get(0) : new a(asList);
    }
}

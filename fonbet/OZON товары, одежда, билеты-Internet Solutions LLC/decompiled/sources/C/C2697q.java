package C;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5108n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: C.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2697q {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public static final C2697q f4214b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final C2697q f4215c;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<InterfaceC2693m> f4216a;

    /* renamed from: C.q$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final LinkedHashSet<InterfaceC2693m> f4217a = new LinkedHashSet<>();

        @NonNull
        public final void a(@NonNull yi.b bVar) {
            this.f4217a.add(bVar);
        }

        @NonNull
        public final C2697q b() {
            return new C2697q(this.f4217a);
        }

        @NonNull
        public final void c(int i11) {
            x2.i.f("The specified lens facing is invalid.", i11 != -1);
            this.f4217a.add(new C5108n0(i11));
        }
    }

    static {
        a aVar = new a();
        aVar.c(0);
        f4214b = aVar.b();
        a aVar2 = new a();
        aVar2.c(1);
        f4215c = aVar2.b();
    }

    C2697q(@NonNull LinkedHashSet linkedHashSet) {
        this.f4216a = linkedHashSet;
    }

    @NonNull
    public final List a(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<InterfaceC2693m> it = this.f4216a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    @NonNull
    public final LinkedHashSet<InterfaceC2693m> b() {
        return this.f4216a;
    }

    public final Integer c() {
        Iterator<InterfaceC2693m> it = this.f4216a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC2693m next = it.next();
            if (next instanceof C5108n0) {
                Integer valueOf = Integer.valueOf(((C5108n0) next).b());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    @NonNull
    public final androidx.camera.core.impl.I d(@NonNull LinkedHashSet<androidx.camera.core.impl.I> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.I> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List a11 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<androidx.camera.core.impl.I> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.I next = it2.next();
            if (a11.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (androidx.camera.core.impl.I) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}

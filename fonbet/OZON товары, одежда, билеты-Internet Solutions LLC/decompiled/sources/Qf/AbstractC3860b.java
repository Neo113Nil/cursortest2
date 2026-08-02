package Qf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3860b extends e {

    /* renamed from: e, reason: collision with root package name */
    boolean f23393e;

    /* renamed from: c, reason: collision with root package name */
    int f23391c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f23392d = 0;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<e> f23389a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f23390b = new ArrayList();

    /* renamed from: Qf.b$a */
    public static final class a extends AbstractC3860b {
        public a(List list) {
            this.f23389a.addAll(list);
            c();
        }

        public final String toString() {
            return Of.k.j("", this.f23389a);
        }
    }

    AbstractC3860b() {
    }

    @Override // Qf.e
    protected final int a() {
        return this.f23392d;
    }

    @Override // Qf.e
    final boolean b() {
        return this.f23393e;
    }

    final void c() {
        ArrayList<e> arrayList = this.f23389a;
        this.f23391c = arrayList.size();
        this.f23392d = 0;
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f23392d += it.next().a();
        }
        ArrayList arrayList2 = this.f23390b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new C3859a()));
        Iterator<e> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (it2.next().b()) {
                this.f23393e = true;
                return;
            }
        }
    }

    /* renamed from: Qf.b$b, reason: collision with other inner class name */
    public static final class C0471b extends AbstractC3860b {
        C0471b(e... eVarArr) {
            List asList = Arrays.asList(eVarArr);
            if (this.f23391c > 1) {
                this.f23389a.add(new a(asList));
            } else {
                this.f23389a.addAll(asList);
            }
            c();
        }

        public final String toString() {
            return Of.k.j(", ", this.f23389a);
        }

        C0471b() {
        }
    }
}

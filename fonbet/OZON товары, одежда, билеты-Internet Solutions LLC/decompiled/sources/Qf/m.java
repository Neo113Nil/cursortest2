package Qf;

import java.util.ArrayList;

/* loaded from: classes10.dex */
abstract class m extends Qf.e {

    /* renamed from: a, reason: collision with root package name */
    final Qf.e f23431a;

    /* renamed from: b, reason: collision with root package name */
    boolean f23432b;

    static class a extends m {
        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() * 8;
        }

        public final String toString() {
            return String.format("%s ", this.f23431a);
        }
    }

    static class b extends m {
        static {
            new Of.e(new n());
        }

        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() * 10;
        }

        public final String toString() {
            return String.format(":has(%s)", this.f23431a);
        }
    }

    static class c extends m {

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<Qf.e> f23433c;

        /* renamed from: d, reason: collision with root package name */
        int f23434d;

        public c(Qf.e eVar) {
            super(eVar);
            ArrayList<Qf.e> arrayList = new ArrayList<>();
            this.f23433c = arrayList;
            this.f23434d = 2;
            arrayList.add(eVar);
            this.f23434d += eVar.a();
        }

        @Override // Qf.e
        protected final int a() {
            return this.f23434d;
        }

        public final String toString() {
            return Of.k.j(" > ", this.f23433c);
        }
    }

    static class d extends m {
        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() + 2;
        }

        public final String toString() {
            return String.format("%s + ", this.f23431a);
        }
    }

    static class e extends m {
        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() + 2;
        }

        public final String toString() {
            return String.format(":is(%s)", this.f23431a);
        }
    }

    static class f extends m {
        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() + 2;
        }

        public final String toString() {
            return String.format(":not(%s)", this.f23431a);
        }
    }

    static class g extends m {
        @Override // Qf.e
        protected final int a() {
            return this.f23431a.a() * 3;
        }

        public final String toString() {
            return String.format("%s ~ ", this.f23431a);
        }
    }

    static class h extends Qf.e {
        @Override // Qf.e
        protected final int a() {
            return 1;
        }

        public final String toString() {
            return ">";
        }
    }

    public m(Qf.e eVar) {
        ThreadLocal.withInitial(new l());
        this.f23431a = eVar;
        this.f23432b = eVar.b();
    }

    @Override // Qf.e
    final boolean b() {
        return this.f23432b;
    }
}

package V5;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f28204a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f28205b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f28206c;

    final class a extends k {
        @Override // V5.k
        public final boolean a() {
            return true;
        }

        @Override // V5.k
        public final boolean b() {
            return true;
        }

        @Override // V5.k
        public final boolean c(T5.a aVar) {
            return aVar == T5.a.REMOTE;
        }

        @Override // V5.k
        public final boolean d(boolean z11, T5.a aVar, T5.c cVar) {
            return (aVar == T5.a.RESOURCE_DISK_CACHE || aVar == T5.a.MEMORY_CACHE) ? false : true;
        }
    }

    final class b extends k {
        @Override // V5.k
        public final boolean a() {
            return false;
        }

        @Override // V5.k
        public final boolean b() {
            return false;
        }

        @Override // V5.k
        public final boolean c(T5.a aVar) {
            return false;
        }

        @Override // V5.k
        public final boolean d(boolean z11, T5.a aVar, T5.c cVar) {
            return false;
        }
    }

    final class c extends k {
        @Override // V5.k
        public final boolean a() {
            return true;
        }

        @Override // V5.k
        public final boolean b() {
            return false;
        }

        @Override // V5.k
        public final boolean c(T5.a aVar) {
            return (aVar == T5.a.DATA_DISK_CACHE || aVar == T5.a.MEMORY_CACHE) ? false : true;
        }

        @Override // V5.k
        public final boolean d(boolean z11, T5.a aVar, T5.c cVar) {
            return false;
        }
    }

    final class d extends k {
        @Override // V5.k
        public final boolean a() {
            return false;
        }

        @Override // V5.k
        public final boolean b() {
            return true;
        }

        @Override // V5.k
        public final boolean c(T5.a aVar) {
            return false;
        }

        @Override // V5.k
        public final boolean d(boolean z11, T5.a aVar, T5.c cVar) {
            return (aVar == T5.a.RESOURCE_DISK_CACHE || aVar == T5.a.MEMORY_CACHE) ? false : true;
        }
    }

    final class e extends k {
        @Override // V5.k
        public final boolean a() {
            return true;
        }

        @Override // V5.k
        public final boolean b() {
            return true;
        }

        @Override // V5.k
        public final boolean c(T5.a aVar) {
            return aVar == T5.a.REMOTE;
        }

        @Override // V5.k
        public final boolean d(boolean z11, T5.a aVar, T5.c cVar) {
            return ((z11 && aVar == T5.a.DATA_DISK_CACHE) || aVar == T5.a.LOCAL) && cVar == T5.c.TRANSFORMED;
        }
    }

    static {
        new a();
        f28204a = new b();
        f28205b = new c();
        new d();
        f28206c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(T5.a aVar);

    public abstract boolean d(boolean z11, T5.a aVar, T5.c cVar);
}

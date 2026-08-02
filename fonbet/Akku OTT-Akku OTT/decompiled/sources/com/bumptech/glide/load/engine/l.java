package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public abstract class l {
    public static final b a;
    public static final c b;
    public static final e c;

    public class a extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.b;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.d || aVar == com.bumptech.glide.load.a.e) ? false : true;
        }
    }

    public class b extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    public class c extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.c || aVar == com.bumptech.glide.load.a.e) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    public class d extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return (aVar == com.bumptech.glide.load.a.d || aVar == com.bumptech.glide.load.a.e) ? false : true;
        }
    }

    public class e extends l {
        @Override // com.bumptech.glide.load.engine.l
        public final boolean a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.b;
        }

        @Override // com.bumptech.glide.load.engine.l
        public final boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z && aVar == com.bumptech.glide.load.a.c) || aVar == com.bumptech.glide.load.a.a) && cVar == com.bumptech.glide.load.c.b;
        }
    }

    static {
        new a();
        a = new b();
        b = new c();
        new d();
        c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a aVar);

    public abstract boolean d(boolean z, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);
}

package Ld;

import Ld.y;
import Xd.C4884a;
import Xd.l;
import fe.C6528g;
import ie.C7056e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9819J;
import td.C9856v;
import td.d0;
import ud.C10026d;
import ud.InterfaceC10025c;
import wd.L;

/* loaded from: classes.dex */
public final class j extends AbstractC3578e<InterfaceC10025c, Xd.g<?>> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final L f16773c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9819J f16774d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6528g f16775e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Rd.e f16776f;

    /* JADX INFO: Access modifiers changed from: private */
    abstract class a implements y.a {

        /* renamed from: Ld.j$a$a, reason: collision with other inner class name */
        public static final class C0319a implements y.a {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ k f16778a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f16779b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f16780c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Sd.f f16781d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<InterfaceC10025c> f16782e;

            C0319a(k kVar, a aVar, Sd.f fVar, ArrayList arrayList) {
                this.f16779b = kVar;
                this.f16780c = aVar;
                this.f16781d = fVar;
                this.f16782e = arrayList;
                this.f16778a = kVar;
            }

            @Override // Ld.y.a
            public final void a() {
                this.f16779b.a();
                C4884a c4884a = new C4884a((InterfaceC10025c) C7714v.B0(this.f16782e));
                this.f16780c.h(this.f16781d, c4884a);
            }

            @Override // Ld.y.a
            public final y.b b(Sd.f fVar) {
                return this.f16778a.b(fVar);
            }

            @Override // Ld.y.a
            public final void c(Sd.f fVar, Sd.b enumClassId, Sd.f enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.f16778a.c(fVar, enumClassId, enumEntryName);
            }

            @Override // Ld.y.a
            public final void d(Sd.f fVar, Xd.f value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f16778a.d(fVar, value);
            }

            @Override // Ld.y.a
            public final y.a e(Sd.b classId, Sd.f fVar) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                return this.f16778a.e(classId, fVar);
            }

            @Override // Ld.y.a
            public final void f(Sd.f fVar, Object obj) {
                this.f16778a.f(fVar, obj);
            }
        }

        public static final class b implements y.b {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList<Xd.g<?>> f16783a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f16784b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Sd.f f16785c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f16786d;

            /* renamed from: Ld.j$a$b$a, reason: collision with other inner class name */
            public static final class C0320a implements y.a {

                /* renamed from: a, reason: collision with root package name */
                private final /* synthetic */ k f16787a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ k f16788b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f16789c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<InterfaceC10025c> f16790d;

                C0320a(k kVar, b bVar, ArrayList arrayList) {
                    this.f16788b = kVar;
                    this.f16789c = bVar;
                    this.f16790d = arrayList;
                    this.f16787a = kVar;
                }

                @Override // Ld.y.a
                public final void a() {
                    this.f16788b.a();
                    this.f16789c.f16783a.add(new C4884a((InterfaceC10025c) C7714v.B0(this.f16790d)));
                }

                @Override // Ld.y.a
                public final y.b b(Sd.f fVar) {
                    return this.f16787a.b(fVar);
                }

                @Override // Ld.y.a
                public final void c(Sd.f fVar, Sd.b enumClassId, Sd.f enumEntryName) {
                    Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                    Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                    this.f16787a.c(fVar, enumClassId, enumEntryName);
                }

                @Override // Ld.y.a
                public final void d(Sd.f fVar, Xd.f value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.f16787a.d(fVar, value);
                }

                @Override // Ld.y.a
                public final y.a e(Sd.b classId, Sd.f fVar) {
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    return this.f16787a.e(classId, fVar);
                }

                @Override // Ld.y.a
                public final void f(Sd.f fVar, Object obj) {
                    this.f16787a.f(fVar, obj);
                }
            }

            b(j jVar, Sd.f fVar, a aVar) {
                this.f16784b = jVar;
                this.f16785c = fVar;
                this.f16786d = aVar;
            }

            @Override // Ld.y.b
            public final void a() {
                ArrayList<Xd.g<?>> arrayList = this.f16783a;
                this.f16786d.g(this.f16785c, arrayList);
            }

            @Override // Ld.y.b
            public final void b(Object obj) {
                this.f16783a.add(j.x(this.f16784b, this.f16785c, obj));
            }

            @Override // Ld.y.b
            public final void c(Sd.b enumClassId, Sd.f enumEntryName) {
                Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
                Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
                this.f16783a.add(new Xd.k(enumClassId, enumEntryName));
            }

            @Override // Ld.y.b
            public final y.a d(Sd.b classId) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                ArrayList arrayList = new ArrayList();
                d0 NO_SOURCE = d0.f99392a;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                return new C0320a(this.f16784b.t(classId, NO_SOURCE, arrayList), this, arrayList);
            }

            @Override // Ld.y.b
            public final void e(Xd.f value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f16783a.add(new Xd.t(value));
            }
        }

        public a() {
        }

        @Override // Ld.y.a
        public final y.b b(Sd.f fVar) {
            return new b(j.this, fVar, this);
        }

        @Override // Ld.y.a
        public final void c(Sd.f fVar, @NotNull Sd.b enumClassId, @NotNull Sd.f enumEntryName) {
            Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            h(fVar, new Xd.k(enumClassId, enumEntryName));
        }

        @Override // Ld.y.a
        public final void d(Sd.f fVar, @NotNull Xd.f value) {
            Intrinsics.checkNotNullParameter(value, "value");
            h(fVar, new Xd.t(value));
        }

        @Override // Ld.y.a
        public final y.a e(@NotNull Sd.b classId, Sd.f fVar) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            ArrayList arrayList = new ArrayList();
            d0 NO_SOURCE = d0.f99392a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new C0319a(j.this.t(classId, NO_SOURCE, arrayList), this, fVar, arrayList);
        }

        @Override // Ld.y.a
        public final void f(Sd.f fVar, Object obj) {
            h(fVar, j.x(j.this, fVar, obj));
        }

        public abstract void g(Sd.f fVar, @NotNull ArrayList<Xd.g<?>> arrayList);

        public abstract void h(Sd.f fVar, @NotNull Xd.g<?> gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull L module, @NotNull C9819J notFoundClasses, @NotNull C7056e storageManager, @NotNull yd.g kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f16773c = module;
        this.f16774d = notFoundClasses;
        this.f16775e = new C6528g(module, notFoundClasses);
        this.f16776f = Rd.e.f25015g;
    }

    public static final Xd.g x(j jVar, Sd.f fVar, Object obj) {
        Xd.g b11 = Xd.i.f34402a.b(obj, jVar.f16773c);
        if (b11 != null) {
            return b11;
        }
        return l.a.a("Unsupported annotation argument: " + fVar);
    }

    @Override // Ld.AbstractC3579f
    @NotNull
    public final Rd.e q() {
        return this.f16776f;
    }

    @Override // Ld.AbstractC3579f
    protected final k t(@NotNull Sd.b annotationClassId, @NotNull d0 source, @NotNull List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        return new k(this, C9856v.c(this.f16773c, annotationClassId, this.f16774d), annotationClassId, result, source);
    }

    public final C10026d y(Nd.a proto, Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.f16775e.a(proto, nameResolver);
    }

    public final void z(@NotNull Rd.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f16776f = eVar;
    }
}

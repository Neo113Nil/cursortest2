package Ie0;

import Ae.C0;
import Ae.InterfaceC2397i;
import Ie0.a;
import Sc.C4005g;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.mapsdk.common.tilescontroller.BaseTilesController$ensureProcessingStarted$1", f = "BaseTilesController.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12324d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f12325e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Ie0.a f12326f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<a.EnumC0243a> f12327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<B0> f12328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f12329c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ie0.a f12330d;

        @e(c = "ru.ozon.mapsdk.common.tilescontroller.BaseTilesController$ensureProcessingStarted$1$1$1", f = "BaseTilesController.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
        /* renamed from: Ie0.b$a$a, reason: collision with other inner class name */
        static final class C0244a extends j implements Function2<M, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f12331d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ie0.a f12332e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0244a(Ie0.a aVar, d<? super C0244a> dVar) {
                super(2, dVar);
                this.f12332e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C0244a(this.f12332e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C0244a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
            
                if (r8.emit(r1, r7) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
            
                if (xe.Y.b(r5, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C0 c02;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f12331d;
                Ie0.a aVar2 = this.f12332e;
                if (i11 == 0) {
                    s.b(obj);
                    long e11 = aVar2.e();
                    this.f12331d = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                }
                c02 = aVar2.f12317b;
                Boolean bool = Boolean.FALSE;
                this.f12331d = 2;
            }
        }

        @e(c = "ru.ozon.mapsdk.common.tilescontroller.BaseTilesController$ensureProcessingStarted$1$1", f = "BaseTilesController.kt", l = {42, 51, 52}, m = "emit")
        /* renamed from: Ie0.b$a$b, reason: collision with other inner class name */
        static final class C0245b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f12333d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f12334e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<T> f12335f;

            /* renamed from: g, reason: collision with root package name */
            int f12336g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0245b(a<? super T> aVar, d<? super C0245b> dVar) {
                super(dVar);
                this.f12335f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f12334e = obj;
                this.f12336g |= LinearLayoutManager.INVALID_OFFSET;
                return this.f12335f.emit(null, this);
            }
        }

        a(kotlin.jvm.internal.M<a.EnumC0243a> m11, kotlin.jvm.internal.M<B0> m12, M m13, Ie0.a aVar) {
            this.f12327a = m11;
            this.f12328b = m12;
            this.f12329c = m13;
            this.f12330d = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
        
            if (r9.emit(r10, r0) != r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        
            if (xe.E0.c(r9, r0) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
        
            if (xe.E0.c(r9, r0) == r1) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Ae.InterfaceC2397i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(a.EnumC0243a enumC0243a, d<? super Unit> dVar) {
            C0245b c0245b;
            int i11;
            a<T> aVar;
            a<T> aVar2;
            C0 c02;
            if (dVar instanceof C0245b) {
                c0245b = (C0245b) dVar;
                int i12 = c0245b.f12336g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0245b.f12336g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0245b.f12334e;
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0245b.f12336g;
                    if (i11 != 0) {
                        s.b(obj);
                        T t2 = (T) a.EnumC0243a.LOADING;
                        kotlin.jvm.internal.M<B0> m11 = this.f12328b;
                        kotlin.jvm.internal.M<a.EnumC0243a> m12 = this.f12327a;
                        if (enumC0243a == t2) {
                            m12.f71787a = t2;
                            B0 b02 = m11.f71787a;
                            if (b02 != null) {
                                c0245b.f12333d = this;
                                c0245b.f12336g = 1;
                            }
                            aVar2 = this;
                            aVar2.f12328b.f71787a = (T) C10727i.c(aVar2.f12329c, null, null, new C0244a(aVar2.f12330d, null), 3);
                            return Unit.f71690a;
                        }
                        T t11 = (T) a.EnumC0243a.LOADED;
                        if (enumC0243a == t11 && m12.f71787a == t2) {
                            m12.f71787a = t11;
                            B0 b03 = m11.f71787a;
                            if (b03 != null) {
                                c0245b.f12333d = this;
                                c0245b.f12336g = 2;
                            }
                            aVar = this;
                            c02 = aVar.f12330d.f12317b;
                            Boolean bool = Boolean.TRUE;
                            c0245b.f12333d = null;
                            c0245b.f12336g = 3;
                        }
                        return Unit.f71690a;
                        return aVar3;
                    }
                    if (i11 == 1) {
                        aVar2 = (a) c0245b.f12333d;
                        s.b(obj);
                        aVar2.f12328b.f71787a = (T) C10727i.c(aVar2.f12329c, null, null, new C0244a(aVar2.f12330d, null), 3);
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    aVar = (a) c0245b.f12333d;
                    s.b(obj);
                    c02 = aVar.f12330d.f12317b;
                    Boolean bool2 = Boolean.TRUE;
                    c0245b.f12333d = null;
                    c0245b.f12336g = 3;
                }
            }
            c0245b = new C0245b(this, dVar);
            Object obj2 = c0245b.f12334e;
            Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0245b.f12336g;
            if (i11 != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Ie0.a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f12326f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f12326f, dVar);
        bVar.f12325e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Ie0.a$a, T] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12324d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f12325e;
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            m12.f71787a = a.EnumC0243a.LOADING;
            kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
            Ie0.a aVar2 = this.f12326f;
            C0 f7 = aVar2.f();
            a aVar3 = new a(m12, m13, m11, aVar2);
            this.f12324d = 1;
            if (f7.collect(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}

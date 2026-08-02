package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.C2857A;
import Ee.C2968b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fd.InterfaceC6511n;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10727i;
import xe.M;
import ze.C11115c;

/* loaded from: classes.dex */
public final class p {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, ModuleDescriptor.MODULE_VERSION, 76}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        ze.h f3624d;

        /* renamed from: e, reason: collision with root package name */
        byte[] f3625e;

        /* renamed from: f, reason: collision with root package name */
        int f3626f;

        /* renamed from: g, reason: collision with root package name */
        int f3627g;

        /* renamed from: h, reason: collision with root package name */
        int f3628h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f3629i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object>[] f3630j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Object[]> f3631k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f3632l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f3633m;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: Be.p$a$a, reason: collision with other inner class name */
        static final class C0091a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f3634d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h<Object>[] f3635e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f3636f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f3637g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C11115c f3638h;

            /* renamed from: Be.p$a$a$a, reason: collision with other inner class name */
            static final class C0092a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C11115c f3639a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f3640b;

                @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "emit")
                /* renamed from: Be.p$a$a$a$a, reason: collision with other inner class name */
                static final class C0093a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f3641d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C0092a<T> f3642e;

                    /* renamed from: f, reason: collision with root package name */
                    int f3643f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0093a(C0092a<? super T> c0092a, kotlin.coroutines.d<? super C0093a> dVar) {
                        super(dVar);
                        this.f3642e = c0092a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f3641d = obj;
                        this.f3643f |= LinearLayoutManager.INVALID_OFFSET;
                        return this.f3642e.emit(null, this);
                    }
                }

                C0092a(C11115c c11115c, int i11) {
                    this.f3639a = c11115c;
                    this.f3640b = i11;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (xe.l1.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
                
                    if (r5.f3639a.n(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C0093a c0093a;
                    int i11;
                    if (dVar instanceof C0093a) {
                        c0093a = (C0093a) dVar;
                        int i12 = c0093a.f3643f;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c0093a.f3643f = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj = c0093a.f3641d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c0093a.f3643f;
                            if (i11 != 0) {
                                Sc.s.b(obj);
                                IndexedValue indexedValue = new IndexedValue(this.f3640b, t2);
                                c0093a.f3643f = 1;
                            } else {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Sc.s.b(obj);
                                    return Unit.f71690a;
                                }
                                Sc.s.b(obj);
                            }
                            c0093a.f3643f = 2;
                        }
                    }
                    c0093a = new C0093a(this, dVar);
                    Object obj2 = c0093a.f3641d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0093a.f3643f;
                    if (i11 != 0) {
                    }
                    c0093a.f3643f = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0091a(InterfaceC2395h[] interfaceC2395hArr, int i11, AtomicInteger atomicInteger, C11115c c11115c, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f3635e = interfaceC2395hArr;
                this.f3636f = i11;
                this.f3637g = atomicInteger;
                this.f3638h = c11115c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0091a(this.f3635e, this.f3636f, this.f3637g, this.f3638h, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0091a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f3634d;
                AtomicInteger atomicInteger = this.f3637g;
                C11115c c11115c = this.f3638h;
                try {
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        InterfaceC2395h<Object>[] interfaceC2395hArr = this.f3635e;
                        int i12 = this.f3636f;
                        InterfaceC2395h<Object> interfaceC2395h = interfaceC2395hArr[i12];
                        C0092a c0092a = new C0092a(c11115c, i12);
                        this.f3634d = 1;
                        if (interfaceC2395h.collect(c0092a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        c11115c.l(null);
                    }
                    return Unit.f71690a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        c11115c.l(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2397i interfaceC2397i, InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar, Function0 function0, InterfaceC2395h[] interfaceC2395hArr) {
            super(2, dVar);
            this.f3630j = interfaceC2395hArr;
            this.f3631k = function0;
            this.f3632l = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
            this.f3633m = interfaceC2397i;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            ?? r22 = this.f3632l;
            InterfaceC2395h<Object>[] interfaceC2395hArr = this.f3630j;
            a aVar = new a(this.f3633m, r22, dVar, this.f3631k, interfaceC2395hArr);
            aVar.f3629i = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
        
            if (r11.invoke(r12, r15, r17) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
        
            if (r11.invoke(r12, r9, r17) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
        
            if (r8 != 0) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[LOOP:0: B:16:0x00bc->B:31:?, LOOP_START, PHI: r8 r9
          0x00bc: PHI (r8v7 int) = (r8v6 int), (r8v8 int) binds: [B:12:0x00b7, B:31:?] A[DONT_GENERATE, DONT_INLINE]
          0x00bc: PHI (r9v3 kotlin.collections.IndexedValue) = (r9v2 kotlin.collections.IndexedValue), (r9v9 kotlin.collections.IndexedValue) binds: [B:12:0x00b7, B:31:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v4, types: [ze.h, ze.w] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v8, types: [ze.h] */
        /* JADX WARN: Type inference failed for: r10v9, types: [ze.h] */
        /* JADX WARN: Type inference failed for: r11v2, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.CoroutineContext, xe.O] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ff -> B:7:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0118 -> B:7:0x011b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            C11115c a11;
            byte[] bArr;
            int i11;
            byte b11;
            Object obj2;
            ?? r102;
            IndexedValue indexedValue;
            Object f7;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f3628h;
            C2857A c2857a = z.f3697b;
            if (i12 == 0) {
                Sc.s.b(obj);
                M m11 = (M) this.f3629i;
                InterfaceC2395h<Object>[] interfaceC2395hArr = this.f3630j;
                int length = interfaceC2395hArr.length;
                if (length == 0) {
                    return Unit.f71690a;
                }
                objArr = new Object[length];
                C7705l.x(objArr, c2857a, 0, length);
                a11 = ze.k.a(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                Object obj3 = null;
                int i13 = 0;
                while (i13 < length) {
                    ?? r13 = obj3;
                    C10727i.c(m11, r13, r13, new C0091a(interfaceC2395hArr, i13, atomicInteger, a11, null), 3);
                    i13++;
                    obj3 = r13;
                }
                bArr = new byte[length];
                i11 = length;
                b11 = 0;
                b11 = (byte) (b11 + 1);
                this.f3629i = objArr;
                this.f3624d = a11;
                this.f3625e = bArr;
                this.f3626f = i11;
                this.f3627g = b11;
                this.f3628h = 1;
                f7 = a11.f(this);
                if (f7 != aVar) {
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    ?? r22 = this.f3627g;
                    i11 = this.f3626f;
                    byte[] bArr2 = this.f3625e;
                    r102 = this.f3624d;
                    Object[] objArr2 = (Object[]) this.f3629i;
                    Sc.s.b(obj);
                    b11 = r22;
                    bArr = bArr2;
                    objArr = objArr2;
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r23 = this.f3627g;
                    i11 = this.f3626f;
                    byte[] bArr3 = this.f3625e;
                    r102 = this.f3624d;
                    Object[] objArr3 = (Object[]) this.f3629i;
                    Sc.s.b(obj);
                    objArr = objArr3;
                    b11 = r23;
                    bArr = bArr3;
                }
                a11 = r102;
                b11 = (byte) (b11 + 1);
                this.f3629i = objArr;
                this.f3624d = a11;
                this.f3625e = bArr;
                this.f3626f = i11;
                this.f3627g = b11;
                this.f3628h = 1;
                f7 = a11.f(this);
                if (f7 != aVar) {
                    r102 = a11;
                    obj2 = f7;
                    indexedValue = (IndexedValue) ze.l.d(obj2);
                    if (indexedValue != null) {
                        return Unit.f71690a;
                    }
                    while (true) {
                        int c11 = indexedValue.c();
                        Object obj4 = objArr[c11];
                        objArr[c11] = indexedValue.d();
                        if (obj4 == c2857a) {
                            i11--;
                        }
                        if (bArr[c11] != b11) {
                            bArr[c11] = b11;
                            indexedValue = (IndexedValue) ze.l.d(r102.e());
                            if (indexedValue != null) {
                            }
                        }
                        if (i11 == 0) {
                            Object[] invoke = this.f3631k.invoke();
                            ?? r11 = this.f3632l;
                            InterfaceC2397i<Object> interfaceC2397i = this.f3633m;
                            if (invoke == null) {
                                this.f3629i = objArr;
                                this.f3624d = r102;
                                this.f3625e = bArr;
                                this.f3626f = i11;
                                this.f3627g = b11;
                                this.f3628h = 2;
                            } else {
                                C7705l.u(objArr, 0, invoke, 0, 14);
                                this.f3629i = objArr;
                                this.f3624d = r102;
                                this.f3625e = bArr;
                                this.f3626f = i11;
                                this.f3627g = b11;
                                this.f3628h = 3;
                            }
                            b11 = (byte) (b11 + 1);
                            this.f3629i = objArr;
                            this.f3624d = a11;
                            this.f3625e = bArr;
                            this.f3626f = i11;
                            this.f3627g = b11;
                            this.f3628h = 1;
                            f7 = a11.f(this);
                            if (f7 != aVar) {
                            }
                        }
                    }
                    a11 = r102;
                    b11 = (byte) (b11 + 1);
                    this.f3629i = objArr;
                    this.f3624d = a11;
                    this.f3625e = bArr;
                    this.f3626f = i11;
                    this.f3627g = b11;
                    this.f3628h = 1;
                    f7 = a11.f(this);
                    if (f7 != aVar) {
                    }
                }
                return aVar;
            }
            ?? r24 = this.f3627g;
            i11 = this.f3626f;
            byte[] bArr4 = this.f3625e;
            ze.h hVar = this.f3624d;
            Object[] objArr4 = (Object[]) this.f3629i;
            Sc.s.b(obj);
            obj2 = ((ze.l) obj).e();
            b11 = r24;
            bArr = bArr4;
            objArr = objArr4;
            r102 = hVar;
            indexedValue = (IndexedValue) ze.l.d(obj2);
            if (indexedValue != null) {
            }
        }
    }

    public static final Object a(@NotNull InterfaceC2397i interfaceC2397i, @NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.d frame, @NotNull Function0 function0, @NotNull InterfaceC2395h[] interfaceC2395hArr) {
        a aVar = new a(interfaceC2397i, interfaceC6511n, null, function0, interfaceC2395hArr);
        t tVar = new t(frame, frame.getContext());
        Object a11 = C2968b.a(tVar, tVar, aVar);
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        if (a11 == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11 == aVar2 ? a11 : Unit.f71690a;
    }
}

package androidx.collection;

import Sc.C;
import gd.InterfaceC6712a;
import gd.InterfaceC6716e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M<E> extends X<E> {

    /* renamed from: e, reason: collision with root package name */
    private int f38617e;

    private final class a extends X<E>.a implements InterfaceC6716e {

        /* renamed from: androidx.collection.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C0718a implements Iterator<E>, InterfaceC6712a {

            /* renamed from: a, reason: collision with root package name */
            private int f38619a = -1;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final Iterator<E> f38620b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M<E> f38621c;

            @kotlin.coroutines.jvm.internal.e(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1057}, m = "invokeSuspend")
            /* renamed from: androidx.collection.M$a$a$a, reason: collision with other inner class name */
            static final class C0719a extends kotlin.coroutines.jvm.internal.i implements Function2<kotlin.sequences.k<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                C0718a f38622d;

                /* renamed from: e, reason: collision with root package name */
                M f38623e;

                /* renamed from: f, reason: collision with root package name */
                long[] f38624f;

                /* renamed from: g, reason: collision with root package name */
                int f38625g;

                /* renamed from: h, reason: collision with root package name */
                int f38626h;

                /* renamed from: i, reason: collision with root package name */
                int f38627i;

                /* renamed from: j, reason: collision with root package name */
                int f38628j;

                /* renamed from: k, reason: collision with root package name */
                long f38629k;

                /* renamed from: l, reason: collision with root package name */
                int f38630l;

                /* renamed from: m, reason: collision with root package name */
                private /* synthetic */ Object f38631m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ M<E> f38632n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ C0718a f38633o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0719a(M m11, C0718a c0718a, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f38632n = m11;
                    this.f38633o = c0718a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    C0719a c0719a = new C0719a(this.f38632n, this.f38633o, dVar);
                    c0719a.f38631m = obj;
                    return c0719a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0719a) create((kotlin.sequences.k) obj, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0091 -> B:5:0x0094). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:15:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.sequences.k kVar;
                    M<E> m11;
                    long[] jArr;
                    int length;
                    C0718a c0718a;
                    int i11;
                    long j11;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i12 = this.f38630l;
                    if (i12 == 0) {
                        Sc.s.b(obj);
                        kVar = (kotlin.sequences.k) this.f38631m;
                        m11 = this.f38632n;
                        jArr = m11.f38662a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            c0718a = this.f38633o;
                            i11 = 0;
                            j11 = jArr[i11];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            }
                            if (i11 != length) {
                            }
                        }
                        return Unit.f71690a;
                    }
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = this.f38628j;
                    int i14 = this.f38627i;
                    long j12 = this.f38629k;
                    int i15 = this.f38626h;
                    int i16 = this.f38625g;
                    long[] jArr2 = this.f38624f;
                    M<E> m12 = this.f38623e;
                    C0718a c0718a2 = this.f38622d;
                    kotlin.sequences.k kVar2 = (kotlin.sequences.k) this.f38631m;
                    Sc.s.b(obj);
                    j12 >>= 8;
                    i13++;
                    if (i13 < i14) {
                        if (i14 == 8) {
                            length = i16;
                            jArr = jArr2;
                            m11 = m12;
                            kVar = kVar2;
                            i11 = i15;
                            c0718a = c0718a2;
                            if (i11 != length) {
                                i11++;
                                j11 = jArr[i11];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    kVar2 = kVar;
                                    i13 = 0;
                                    m12 = m11;
                                    jArr2 = jArr;
                                    i14 = 8 - ((~(i11 - length)) >>> 31);
                                    c0718a2 = c0718a;
                                    i15 = i11;
                                    i16 = length;
                                    j12 = j11;
                                    if (i13 < i14) {
                                        if ((255 & j12) < 128) {
                                            int i17 = (i15 << 3) + i13;
                                            c0718a2.b(i17);
                                            Object obj2 = m12.f38663b[i17];
                                            this.f38631m = kVar2;
                                            this.f38622d = c0718a2;
                                            this.f38623e = m12;
                                            this.f38624f = jArr2;
                                            this.f38625g = i16;
                                            this.f38626h = i15;
                                            this.f38629k = j12;
                                            this.f38627i = i14;
                                            this.f38628j = i13;
                                            this.f38630l = 1;
                                            if (kVar2.b(obj2, this) == aVar) {
                                                return aVar;
                                            }
                                        }
                                        j12 >>= 8;
                                        i13++;
                                        if (i13 < i14) {
                                        }
                                    }
                                }
                                if (i11 != length) {
                                }
                            }
                        }
                        return Unit.f71690a;
                    }
                }
            }

            C0718a(M<E> m11) {
                this.f38621c = m11;
                this.f38620b = kotlin.sequences.l.s(new C0719a(m11, this, null));
            }

            public final void b(int i11) {
                this.f38619a = i11;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f38620b.hasNext();
            }

            @Override // java.util.Iterator
            public final E next() {
                return this.f38620b.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                int i11 = this.f38619a;
                if (i11 != -1) {
                    this.f38621c.m(i11);
                    this.f38619a = -1;
                }
            }
        }

        public a() {
            super(M.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(E e11) {
            return M.this.d(e11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Collection<? extends E> elements2 = elements;
            M<E> m11 = M.this;
            m11.getClass();
            Intrinsics.checkNotNullParameter(elements2, "elements");
            int i11 = m11.f38665d;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            Iterator<T> it = elements2.iterator();
            while (it.hasNext()) {
                m11.k(it.next());
            }
            return i11 != m11.f38665d;
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            M.this.f();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<E> iterator() {
            return new C0718a(M.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            return M.this.l(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        
            if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        
            r14 = -1;
         */
        @Override // java.util.Set, java.util.Collection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
            int i11;
            int i12;
            Intrinsics.checkNotNullParameter(elements, "elements");
            M<E> m11 = M.this;
            int i13 = m11.f38665d;
            Iterator<? extends Object> it = elements.iterator();
            while (true) {
                int i14 = 1;
                int i15 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    m11.getClass();
                    i11 = next.hashCode();
                } else {
                    i11 = 0;
                }
                int i16 = i11 * (-862048943);
                int i17 = i16 ^ (i16 << 16);
                int i18 = i17 & 127;
                int i19 = m11.f38664c;
                int i21 = (i17 >>> 7) & i19;
                while (true) {
                    long[] jArr = m11.f38662a;
                    int i22 = i21 >> 3;
                    int i23 = (i21 & 7) << 3;
                    int i24 = i14;
                    int i25 = i15;
                    long j11 = (((-i23) >> 63) & (jArr[i22 + i14] << (64 - i23))) | (jArr[i22] >>> i23);
                    long j12 = (i18 * 72340172838076673L) ^ j11;
                    long j13 = -9187201950435737472L;
                    long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j14 == 0) {
                            break;
                        }
                        i12 = ((Long.numberOfTrailingZeros(j14) >> 3) + i21) & i19;
                        long j15 = j13;
                        if (Intrinsics.d(m11.f38663b[i12], next)) {
                            break;
                        }
                        j14 &= j14 - 1;
                        j13 = j15;
                    }
                    i15 = i25 + 8;
                    i21 = (i21 + i15) & i19;
                    i14 = i24;
                }
                if (i12 >= 0) {
                    m11.m(i12);
                }
            }
            return i13 != m11.f38665d;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            M<E> m11 = M.this;
            long[] jArr = m11.f38662a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!elements.contains(m11.f38663b[i14])) {
                                m11.m(i14);
                                z11 = true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return z11;
                    }
                }
                if (i11 == length) {
                    return z11;
                }
                i11++;
            }
        }
    }

    public M() {
        this((Object) null);
    }

    private final int g(E e11) {
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i11 = 1;
        int i12 = -862048943;
        int hashCode = (e11 != null ? e11.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f38664c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f38662a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            int i22 = i11;
            long j13 = (((-i21) >> 63) & (jArr3[i19 + i11] << (64 - i21))) | (jArr3[i19] >>> i21);
            long j14 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i17) & i16;
                int i23 = i12;
                if (Intrinsics.d(this.f38663b[numberOfTrailingZeros], e11)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int h11 = h(i14);
                long j17 = 255;
                if (this.f38617e != 0 || ((this.f38662a[h11 >> 3] >> ((h11 & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i25 = this.f38664c;
                    if (i25 > 8) {
                        long j18 = this.f38665d;
                        C.Companion companion = Sc.C.INSTANCE;
                        boolean z11 = 8;
                        j12 = 128;
                        if (Long.compareUnsigned(j18 * 32, i25 * 25) <= 0) {
                            long[] jArr4 = this.f38662a;
                            int i26 = this.f38664c;
                            Object[] objArr = this.f38663b;
                            W.a(jArr4, i26);
                            int i27 = 0;
                            int i28 = -1;
                            while (i27 != i26) {
                                int i29 = i27 >> 3;
                                int i31 = (i27 & 7) << 3;
                                long j19 = (jArr4[i29] >> i31) & j17;
                                if (j19 == 128) {
                                    i28 = i27;
                                    i27++;
                                } else if (j19 != 254) {
                                    i27++;
                                } else {
                                    Object obj = objArr[i27];
                                    int hashCode2 = (obj != null ? obj.hashCode() : 0) * i24;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int h12 = h(i32);
                                    int i33 = i32 & i26;
                                    boolean z12 = z11;
                                    long j21 = j17;
                                    if (((h12 - i33) & i26) / 8 == ((i27 - i33) & i26) / 8) {
                                        jArr4[i29] = (jArr4[i29] & (~(j21 << i31))) | ((r14 & 127) << i31);
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    } else {
                                        int i34 = h12 >> 3;
                                        long j22 = jArr4[i34];
                                        int i35 = (h12 & 7) << 3;
                                        if (((j22 >> i35) & j21) == 128) {
                                            jArr4[i34] = ((r14 & 127) << i35) | (j22 & (~(j21 << i35)));
                                            jArr4[i29] = (jArr4[i29] & (~(j21 << i31))) | (128 << i31);
                                            objArr[h12] = objArr[i27];
                                            objArr[i27] = null;
                                            i28 = i27;
                                        } else {
                                            jArr4[i34] = (j22 & (~(j21 << i35))) | ((r14 & 127) << i35);
                                            if (i28 == -1) {
                                                i28 = W.b(jArr4, i27 + 1, i26);
                                            }
                                            objArr[i28] = objArr[h12];
                                            objArr[h12] = objArr[i27];
                                            objArr[i27] = objArr[i28];
                                            i27--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr4, "<this>");
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    }
                                    i27++;
                                    z11 = z12;
                                    j17 = j21;
                                }
                            }
                            j11 = j17;
                            this.f38617e = W.c(this.f38664c) - this.f38665d;
                            h11 = h(i14);
                        }
                    } else {
                        j12 = 128;
                    }
                    j11 = 255;
                    int d11 = W.d(this.f38664c);
                    long[] jArr5 = this.f38662a;
                    Object[] objArr2 = this.f38663b;
                    int i36 = this.f38664c;
                    i(d11);
                    long[] jArr6 = this.f38662a;
                    Object[] objArr3 = this.f38663b;
                    int i37 = this.f38664c;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j12) {
                            Object obj2 = objArr2[i38];
                            int hashCode3 = (obj2 != null ? obj2.hashCode() : 0) * i24;
                            int i39 = hashCode3 ^ (hashCode3 << 16);
                            int h13 = h(i39 >>> 7);
                            long j23 = i39 & 127;
                            int i41 = h13 >> 3;
                            int i42 = (h13 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = (jArr6[i41] & (~(255 << i42))) | (j23 << i42);
                            jArr[i41] = j24;
                            jArr[(((h13 - 7) & i37) + (i37 & 7)) >> 3] = j24;
                            objArr3[h13] = obj2;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    h11 = h(i14);
                }
                this.f38665d++;
                int i43 = this.f38617e;
                long[] jArr7 = this.f38662a;
                int i44 = h11 >> 3;
                long j25 = jArr7[i44];
                int i45 = (h11 & 7) << 3;
                if (((j25 >> i45) & j11) != j12) {
                    i22 = 0;
                }
                this.f38617e = i43 - i22;
                int i46 = this.f38664c;
                long j26 = (j25 & (~(j11 << i45))) | (j14 << i45);
                jArr7[i44] = j26;
                jArr7[(((h11 - 7) & i46) + (i46 & 7)) >> 3] = j26;
                return h11;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i11 = i22;
            i12 = i24;
        }
    }

    private final int h(int i11) {
        int i12 = this.f38664c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f38662a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void i(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, W.e(i11)) : 0;
        this.f38664c = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        this.f38662a = jArr;
        int i12 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        this.f38617e = W.c(this.f38664c) - this.f38665d;
        this.f38663b = new Object[max];
    }

    public final boolean d(E e11) {
        int i11 = this.f38665d;
        this.f38663b[g(e11)] = e11;
        return this.f38665d != i11;
    }

    @NotNull
    public final Set<E> e() {
        return new a();
    }

    public final void f() {
        this.f38665d = 0;
        long[] jArr = this.f38662a;
        if (jArr != W.f38661a) {
            C7705l.z(jArr);
            long[] jArr2 = this.f38662a;
            int i11 = this.f38664c;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        C7705l.x(this.f38663b, null, 0, this.f38664c);
        this.f38617e = W.c(this.f38664c) - this.f38665d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(@NotNull X<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f38663b;
        long[] jArr = elements.f38662a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        k(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void k(E e11) {
        this.f38663b[g(e11)] = e11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(E e11) {
        int i11;
        int hashCode = (e11 != null ? e11.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f38664c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f38662a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (Intrinsics.d(this.f38663b[i11], e11)) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        boolean z11 = i11 >= 0;
        if (z11) {
            m(i11);
        }
        return z11;
    }

    public final void m(int i11) {
        this.f38665d--;
        long[] jArr = this.f38662a;
        int i12 = this.f38664c;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.f38663b[i11] = null;
    }

    public M(int i11) {
        super(0);
        if (i11 >= 0) {
            i(W.f(i11));
        } else {
            k0.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ M(Object obj) {
        this(6);
    }
}

package U0;

import Sc.s;
import androidx.collection.X;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7728j;
import kotlin.sequences.k;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c<T> implements Set<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X<T> f27251a;

    @e(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class a extends i implements Function2<k<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object[] f27252d;

        /* renamed from: e, reason: collision with root package name */
        long[] f27253e;

        /* renamed from: f, reason: collision with root package name */
        int f27254f;

        /* renamed from: g, reason: collision with root package name */
        int f27255g;

        /* renamed from: h, reason: collision with root package name */
        int f27256h;

        /* renamed from: i, reason: collision with root package name */
        int f27257i;

        /* renamed from: j, reason: collision with root package name */
        long f27258j;

        /* renamed from: k, reason: collision with root package name */
        int f27259k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f27260l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ c<T> f27261m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27261m = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f27261m, dVar);
            aVar.f27260l = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((k) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008b -> B:5:0x008e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:15:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:6:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x008e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            k kVar;
            Object[] objArr;
            long[] jArr;
            int length;
            int i11;
            long j11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f27259k;
            if (i12 == 0) {
                s.b(obj);
                kVar = (k) this.f27260l;
                X<T> b11 = this.f27261m.b();
                objArr = b11.f38663b;
                jArr = b11.f38662a;
                length = jArr.length - 2;
                if (length >= 0) {
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
            int i13 = this.f27257i;
            int i14 = this.f27256h;
            long j12 = this.f27258j;
            i11 = this.f27255g;
            int i15 = this.f27254f;
            long[] jArr2 = this.f27253e;
            Object[] objArr2 = this.f27252d;
            k kVar2 = (k) this.f27260l;
            s.b(obj);
            j12 >>= 8;
            i13++;
            if (i13 < i14) {
                if (i14 == 8) {
                    length = i15;
                    jArr = jArr2;
                    objArr = objArr2;
                    kVar = kVar2;
                    if (i11 != length) {
                        i11++;
                        j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            kVar2 = kVar;
                            i13 = 0;
                            jArr2 = jArr;
                            i15 = length;
                            i14 = 8 - ((~(i11 - length)) >>> 31);
                            objArr2 = objArr;
                            j12 = j11;
                            if (i13 < i14) {
                                if ((255 & j12) < 128) {
                                    Object obj2 = objArr2[(i11 << 3) + i13];
                                    this.f27260l = kVar2;
                                    this.f27252d = objArr2;
                                    this.f27253e = jArr2;
                                    this.f27254f = i15;
                                    this.f27255g = i11;
                                    this.f27258j = j12;
                                    this.f27256h = i14;
                                    this.f27257i = i13;
                                    this.f27259k = 1;
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

    public c(@NotNull X<T> x11) {
        this.f27251a = x11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final X<T> b() {
        return this.f27251a;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27251a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f27251a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f27251a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return l.s(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f27251a.f38665d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }
}

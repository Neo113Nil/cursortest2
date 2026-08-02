package androidx.collection;

import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k0.C7445a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class X<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f38662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f38663b;

    /* renamed from: c, reason: collision with root package name */
    public int f38664c;

    /* renamed from: d, reason: collision with root package name */
    public int f38665d;

    public class a implements Set<E>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f38666a;

        public a(M m11) {
            this.f38666a = m11;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f38666a.a(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.f38666a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return this.f38666a.b();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return this.f38666a.f38665d;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return C7728j.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) C7728j.b(this, array);
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<E, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X<E> f38667b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X<E> x11) {
            super(1);
            this.f38667b = x11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.f38667b ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ X(int i11) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(E e11) {
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
        return i11 >= 0;
    }

    public final boolean b() {
        return this.f38665d == 0;
    }

    public final boolean c() {
        return this.f38665d != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x11 = (X) obj;
        if (x11.f38665d != this.f38665d) {
            return false;
        }
        Object[] objArr = this.f38663b;
        long[] jArr = this.f38662a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !x11.a(objArr[(i11 << 3) + i13])) {
                            return false;
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f38663b;
        long[] jArr = this.f38662a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        Object obj = objArr[(i11 << 3) + i14];
                        i12 += obj != null ? obj.hashCode() : 0;
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    @NotNull
    public final String toString() {
        int i11;
        b bVar = new b(this);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f38663b;
        long[] jArr = this.f38662a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            i11 = i14;
                            Object obj = objArr[(i12 << 3) + i16];
                            if (i13 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) bVar.invoke(obj));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private X() {
        this.f38662a = W.f38661a;
        this.f38663b = C7445a.f70246c;
    }
}

package c1;

import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5718i implements Iterable<Integer>, InterfaceC6712a {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C5718i f56238e = new C5718i(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    private final long f56239a;

    /* renamed from: b, reason: collision with root package name */
    private final long f56240b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56241c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f56242d;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    /* renamed from: c1.i$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<kotlin.sequences.k<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int[] f56243d;

        /* renamed from: e, reason: collision with root package name */
        int f56244e;

        /* renamed from: f, reason: collision with root package name */
        int f56245f;

        /* renamed from: g, reason: collision with root package name */
        int f56246g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f56247h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = C5718i.this.new a(dVar);
            aVar.f56247h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.k<? super Integer> kVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(kVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        
            if (r14.b(r7, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        
            if (r6.b(r10, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00c5 -> B:8:0x00e4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e2 -> B:7:0x00e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:22:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00aa -> B:22:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0075 -> B:33:0x0079). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            long j11;
            kotlin.sequences.k kVar;
            int[] iArr;
            int i11;
            kotlin.sequences.k kVar2;
            int i12;
            kotlin.sequences.k kVar3;
            int i13;
            kotlin.sequences.k kVar4;
            int i14;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i15 = this.f56246g;
            C5718i c5718i = C5718i.this;
            if (i15 == 0) {
                j11 = 1;
                Sc.s.b(obj);
                kVar = (kotlin.sequences.k) this.f56247h;
                int[] iArr2 = c5718i.f56242d;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    iArr = iArr2;
                    i11 = 0;
                    kVar2 = kVar;
                    i12 = length;
                    if (i11 < i12) {
                    }
                }
                if (c5718i.f56240b != 0) {
                }
                if (c5718i.f56239a != 0) {
                }
                return Unit.f71690a;
            }
            if (i15 == 1) {
                i12 = this.f56245f;
                i11 = this.f56244e;
                iArr = this.f56243d;
                j11 = 1;
                kVar2 = (kotlin.sequences.k) this.f56247h;
                Sc.s.b(obj);
                i11++;
                if (i11 < i12) {
                    kVar = kVar2;
                    if (c5718i.f56240b != 0) {
                        kVar3 = kVar;
                        i13 = 0;
                        if (i13 >= 64) {
                        }
                    }
                    if (c5718i.f56239a != 0) {
                    }
                    return Unit.f71690a;
                }
                Integer num = new Integer(iArr[i11]);
                this.f56247h = kVar2;
                this.f56243d = iArr;
                this.f56244e = i11;
                this.f56245f = i12;
                this.f56246g = 1;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = this.f56244e;
                    kVar4 = (kotlin.sequences.k) this.f56247h;
                    Sc.s.b(obj);
                    j11 = 1;
                    i14 = i16;
                    i14++;
                    if (i14 < 64) {
                        if ((c5718i.f56239a & (j11 << i14)) != 0) {
                            Integer num2 = new Integer(c5718i.f56241c + i14 + 64);
                            this.f56247h = kVar4;
                            this.f56243d = null;
                            this.f56244e = i14;
                            this.f56246g = 3;
                            if (kVar4.b(num2, this) != aVar) {
                                i16 = i14;
                                i14 = i16;
                            }
                            return aVar;
                        }
                        i14++;
                        if (i14 < 64) {
                        }
                    }
                    return Unit.f71690a;
                }
                i13 = this.f56244e;
                kVar3 = (kotlin.sequences.k) this.f56247h;
                Sc.s.b(obj);
                j11 = 1;
                i13++;
                if (i13 >= 64) {
                    kVar = kVar3;
                    if (c5718i.f56239a != 0) {
                        kVar4 = kVar;
                        i14 = 0;
                        if (i14 < 64) {
                        }
                    }
                    return Unit.f71690a;
                }
                if ((c5718i.f56240b & (j11 << i13)) != 0) {
                    Integer num3 = new Integer(c5718i.f56241c + i13);
                    this.f56247h = kVar3;
                    this.f56243d = null;
                    this.f56244e = i13;
                    this.f56246g = 2;
                }
                i13++;
                if (i13 >= 64) {
                }
            }
        }
    }

    private C5718i(long j11, long j12, int i11, int[] iArr) {
        this.f56239a = j11;
        this.f56240b = j12;
        this.f56241c = i11;
        this.f56242d = iArr;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Integer> iterator() {
        a block = new a(null);
        Intrinsics.checkNotNullParameter(block, "block");
        return new kotlin.sequences.m(block).iterator();
    }

    @NotNull
    public final C5718i k(@NotNull C5718i c5718i) {
        C5718i c5718i2;
        int[] iArr;
        C5718i c5718i3 = f56238e;
        if (c5718i == c5718i3) {
            return this;
        }
        if (this == c5718i3) {
            return c5718i3;
        }
        int i11 = c5718i.f56241c;
        int[] iArr2 = c5718i.f56242d;
        long j11 = c5718i.f56240b;
        long j12 = c5718i.f56239a;
        int i12 = this.f56241c;
        if (i11 == i12 && iArr2 == (iArr = this.f56242d)) {
            return new C5718i(this.f56239a & (~j12), this.f56240b & (~j11), i12, iArr);
        }
        if (iArr2 != null) {
            c5718i2 = this;
            for (int i13 : iArr2) {
                c5718i2 = c5718i2.l(i13);
            }
        } else {
            c5718i2 = this;
        }
        int i14 = c5718i.f56241c;
        if (j11 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j11) != 0) {
                    c5718i2 = c5718i2.l(i15 + i14);
                }
            }
        }
        if (j12 != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if (((1 << i16) & j12) != 0) {
                    c5718i2 = c5718i2.l(i16 + 64 + i14);
                }
            }
        }
        return c5718i2;
    }

    @NotNull
    public final C5718i l(int i11) {
        int[] iArr;
        int a11;
        int i12 = this.f56241c;
        int i13 = i11 - i12;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            long j12 = this.f56240b;
            if ((j12 & j11) != 0) {
                return new C5718i(this.f56239a, j12 & (~j11), i12, this.f56242d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j13 = 1 << (i13 - 64);
            long j14 = this.f56239a;
            if ((j14 & j13) != 0) {
                return new C5718i((~j13) & j14, this.f56240b, i12, this.f56242d);
            }
        } else if (i13 < 0 && (iArr = this.f56242d) != null && (a11 = C5719j.a(iArr, i11)) >= 0) {
            int length = iArr.length;
            int i14 = length - 1;
            if (i14 == 0) {
                return new C5718i(this.f56239a, this.f56240b, this.f56241c, null);
            }
            int[] iArr2 = new int[i14];
            if (a11 > 0) {
                C7705l.p(0, 0, iArr, iArr2, a11);
            }
            if (a11 < i14) {
                C7705l.p(a11, a11 + 1, iArr, iArr2, length);
            }
            return new C5718i(this.f56239a, this.f56240b, this.f56241c, iArr2);
        }
        return this;
    }

    public final boolean m(int i11) {
        int[] iArr;
        int i12 = i11 - this.f56241c;
        return (i12 < 0 || i12 >= 64) ? (i12 < 64 || i12 >= 128) ? i12 <= 0 && (iArr = this.f56242d) != null && C5719j.a(iArr, i11) >= 0 : ((1 << (i12 - 64)) & this.f56239a) != 0 : ((1 << i12) & this.f56240b) != 0;
    }

    public final int n(int i11) {
        int[] iArr = this.f56242d;
        if (iArr != null) {
            return iArr[0];
        }
        long j11 = this.f56240b;
        int i12 = this.f56241c;
        if (j11 != 0) {
            return Long.numberOfTrailingZeros(j11) + i12;
        }
        long j12 = this.f56239a;
        if (j12 == 0) {
            return i11;
        }
        return Long.numberOfTrailingZeros(j12) + i12 + 64;
    }

    @NotNull
    public final C5718i o(@NotNull C5718i c5718i) {
        C5718i c5718i2;
        int[] iArr;
        C5718i c5718i3 = c5718i;
        C5718i c5718i4 = f56238e;
        if (c5718i3 == c5718i4) {
            return this;
        }
        if (this == c5718i4) {
            return c5718i3;
        }
        int i11 = c5718i3.f56241c;
        long j11 = this.f56240b;
        long j12 = this.f56239a;
        int[] iArr2 = c5718i3.f56242d;
        long j13 = c5718i3.f56240b;
        long j14 = c5718i3.f56239a;
        int i12 = this.f56241c;
        if (i11 == i12 && iArr2 == (iArr = this.f56242d)) {
            return new C5718i(j12 | j14, j11 | j13, i12, iArr);
        }
        int i13 = 0;
        int[] iArr3 = this.f56242d;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i14 : iArr3) {
                    c5718i3 = c5718i3.q(i14);
                }
            }
            int i15 = this.f56241c;
            if (j11 != 0) {
                for (int i16 = 0; i16 < 64; i16++) {
                    if (((1 << i16) & j11) != 0) {
                        c5718i3 = c5718i3.q(i16 + i15);
                    }
                }
            }
            if (j12 != 0) {
                while (i13 < 64) {
                    if (((1 << i13) & j12) != 0) {
                        c5718i3 = c5718i3.q(i13 + 64 + i15);
                    }
                    i13++;
                }
            }
            return c5718i3;
        }
        if (iArr2 != null) {
            c5718i2 = this;
            for (int i17 : iArr2) {
                c5718i2 = c5718i2.q(i17);
            }
        } else {
            c5718i2 = this;
        }
        int i18 = c5718i3.f56241c;
        if (j13 != 0) {
            for (int i19 = 0; i19 < 64; i19++) {
                if (((1 << i19) & j13) != 0) {
                    c5718i2 = c5718i2.q(i19 + i18);
                }
            }
        }
        if (j14 != 0) {
            while (i13 < 64) {
                if (((1 << i13) & j14) != 0) {
                    c5718i2 = c5718i2.q(i13 + 64 + i18);
                }
                i13++;
            }
        }
        return c5718i2;
    }

    @NotNull
    public final C5718i q(int i11) {
        long j11;
        int i12;
        long j12;
        int i13 = this.f56241c;
        int i14 = i11 - i13;
        long j13 = this.f56240b;
        long j14 = 1;
        if (i14 < 0 || i14 >= 64) {
            long j15 = this.f56239a;
            if (i14 < 64 || i14 >= 128) {
                int[] iArr = this.f56242d;
                if (i14 < 128) {
                    if (iArr == null) {
                        return new C5718i(j15, j13, i13, new int[]{i11});
                    }
                    int a11 = C5719j.a(iArr, i11);
                    if (a11 < 0) {
                        int i15 = -(a11 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        C7705l.p(0, 0, iArr, iArr2, i15);
                        C7705l.p(i15 + 1, i15, iArr, iArr2, length);
                        iArr2[i15] = i11;
                        return new C5718i(this.f56239a, this.f56240b, this.f56241c, iArr2);
                    }
                } else if (!m(i11)) {
                    int i16 = ((i11 + 1) / 64) * 64;
                    int i17 = this.f56241c;
                    ArrayList arrayList = null;
                    long j16 = j15;
                    while (true) {
                        if (i17 >= i16) {
                            j11 = j13;
                            i12 = i17;
                            break;
                        }
                        if (j13 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArr != null) {
                                    int length2 = iArr.length;
                                    int i18 = 0;
                                    while (i18 < length2) {
                                        arrayList.add(Integer.valueOf(iArr[i18]));
                                        i18++;
                                        j14 = j14;
                                    }
                                }
                            }
                            j12 = j14;
                            for (int i19 = 0; i19 < 64; i19++) {
                                if (((j12 << i19) & j13) != 0) {
                                    arrayList.add(Integer.valueOf(i19 + i17));
                                }
                            }
                        } else {
                            j12 = j14;
                        }
                        if (j16 == 0) {
                            i12 = i16;
                            j11 = 0;
                            break;
                        }
                        i17 += 64;
                        j13 = j16;
                        j14 = j12;
                        j16 = 0;
                    }
                    if (arrayList != null) {
                        iArr = C7714v.T0(arrayList);
                    }
                    return new C5718i(j16, j11, i12, iArr).q(i11);
                }
            } else {
                long j17 = 1 << (i14 - 64);
                if ((j15 & j17) == 0) {
                    return new C5718i(j17 | j15, j13, i13, this.f56242d);
                }
            }
        } else {
            long j18 = 1 << i14;
            if ((j13 & j18) == 0) {
                return new C5718i(this.f56239a, j13 | j18, i13, this.f56242d);
            }
        }
        return this;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C7714v.z(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = arrayList.get(i12);
            i11++;
            if (i11 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}

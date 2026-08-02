package F3;

import E0.C2946s0;
import F3.InterfaceC3017w;
import com.google.common.collect.AbstractC5880y;
import j3.C7253I;
import j3.C7272n;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
final class H implements InterfaceC3017w, InterfaceC3017w.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3017w[] f8410a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean[] f8411b;

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<U, Integer> f8412c;

    /* renamed from: d, reason: collision with root package name */
    private final C2946s0 f8413d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<InterfaceC3017w> f8414e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<C7253I, C7253I> f8415f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3017w.a f8416g;

    /* renamed from: h, reason: collision with root package name */
    private d0 f8417h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3017w[] f8418i;

    /* renamed from: j, reason: collision with root package name */
    private C3003h f8419j;

    private static final class a extends I3.A {

        /* renamed from: b, reason: collision with root package name */
        private final C7253I f8420b;

        public a(I3.y yVar, C7253I c7253i) {
            super(yVar);
            this.f8420b = c7253i;
        }

        @Override // I3.A
        public final boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f8420b.equals(((a) obj).f8420b);
            }
            return false;
        }

        @Override // I3.A, I3.C
        public final C7253I g() {
            return this.f8420b;
        }

        @Override // I3.A
        public final int hashCode() {
            return this.f8420b.hashCode() + (super.hashCode() * 31);
        }

        @Override // I3.A, I3.y
        public final C7272n j() {
            return this.f8420b.a(s().i());
        }

        @Override // I3.A, I3.C
        public final C7272n m(int i11) {
            return this.f8420b.a(s().c(i11));
        }
    }

    public H(C2946s0 c2946s0, long[] jArr, InterfaceC3017w... interfaceC3017wArr) {
        this.f8413d = c2946s0;
        this.f8410a = interfaceC3017wArr;
        c2946s0.getClass();
        this.f8419j = new C3003h(AbstractC5880y.v(), AbstractC5880y.v());
        this.f8412c = new IdentityHashMap<>();
        this.f8418i = new InterfaceC3017w[0];
        this.f8411b = new boolean[interfaceC3017wArr.length];
        for (int i11 = 0; i11 < interfaceC3017wArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.f8411b[i11] = true;
                this.f8410a[i11] = new b0(interfaceC3017wArr[i11], j11);
            }
        }
    }

    public final InterfaceC3017w a(int i11) {
        boolean z11 = this.f8411b[i11];
        InterfaceC3017w[] interfaceC3017wArr = this.f8410a;
        return z11 ? ((b0) interfaceC3017wArr[i11]).a() : interfaceC3017wArr[i11];
    }

    @Override // F3.V.a
    public final void c(InterfaceC3017w interfaceC3017w) {
        InterfaceC3017w.a aVar = this.f8416g;
        aVar.getClass();
        aVar.c(this);
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        ArrayList<InterfaceC3017w> arrayList = this.f8414e;
        if (arrayList.isEmpty()) {
            return this.f8419j.continueLoading(m11);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).continueLoading(m11);
        }
        return false;
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        for (InterfaceC3017w interfaceC3017w : this.f8418i) {
            interfaceC3017w.discardBuffer(j11, z11);
        }
    }

    @Override // F3.InterfaceC3017w.a
    public final void e(InterfaceC3017w interfaceC3017w) {
        ArrayList<InterfaceC3017w> arrayList = this.f8414e;
        arrayList.remove(interfaceC3017w);
        if (arrayList.isEmpty()) {
            InterfaceC3017w[] interfaceC3017wArr = this.f8410a;
            int i11 = 0;
            for (InterfaceC3017w interfaceC3017w2 : interfaceC3017wArr) {
                i11 += interfaceC3017w2.getTrackGroups().f8644a;
            }
            C7253I[] c7253iArr = new C7253I[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < interfaceC3017wArr.length; i13++) {
                d0 trackGroups = interfaceC3017wArr[i13].getTrackGroups();
                int i14 = trackGroups.f8644a;
                int i15 = 0;
                while (i15 < i14) {
                    C7253I a11 = trackGroups.a(i15);
                    C7272n[] c7272nArr = new C7272n[a11.f68962a];
                    for (int i16 = 0; i16 < a11.f68962a; i16++) {
                        C7272n a12 = a11.a(i16);
                        C7272n.a a13 = a12.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i13);
                        sb2.append(ProductContainerDTO.RATIO_DELIMITER);
                        String str = a12.f69113a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        a13.j0(sb2.toString());
                        c7272nArr[i16] = a13.P();
                    }
                    C7253I c7253i = new C7253I(i13 + ProductContainerDTO.RATIO_DELIMITER + a11.f68963b, c7272nArr);
                    this.f8415f.put(c7253i, a11);
                    c7253iArr[i12] = c7253i;
                    i15++;
                    i12++;
                }
            }
            this.f8417h = new d0(c7253iArr);
            InterfaceC3017w.a aVar = this.f8416g;
            aVar.getClass();
            aVar.e(this);
        }
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        InterfaceC3017w[] interfaceC3017wArr = this.f8418i;
        return (interfaceC3017wArr.length > 0 ? interfaceC3017wArr[0] : this.f8410a[0]).getAdjustedSeekPositionUs(j11, i11);
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        return this.f8419j.getBufferedPositionUs();
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        return this.f8419j.getNextLoadPositionUs();
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        d0 d0Var = this.f8417h;
        d0Var.getClass();
        return d0Var;
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f8419j.isLoading();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        for (InterfaceC3017w interfaceC3017w : this.f8410a) {
            interfaceC3017w.maybeThrowPrepareError();
        }
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        this.f8416g = aVar;
        ArrayList<InterfaceC3017w> arrayList = this.f8414e;
        InterfaceC3017w[] interfaceC3017wArr = this.f8410a;
        Collections.addAll(arrayList, interfaceC3017wArr);
        for (InterfaceC3017w interfaceC3017w : interfaceC3017wArr) {
            interfaceC3017w.prepare(this, j11);
        }
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        long j11 = -9223372036854775807L;
        for (InterfaceC3017w interfaceC3017w : this.f8418i) {
            long readDiscontinuity = interfaceC3017w.readDiscontinuity();
            if (readDiscontinuity != -9223372036854775807L) {
                if (j11 == -9223372036854775807L) {
                    for (InterfaceC3017w interfaceC3017w2 : this.f8418i) {
                        if (interfaceC3017w2 == interfaceC3017w) {
                            break;
                        }
                        if (interfaceC3017w2.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j11 = readDiscontinuity;
                } else if (readDiscontinuity != j11) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j11 != -9223372036854775807L && interfaceC3017w.seekToUs(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j11;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        this.f8419j.reevaluateBuffer(j11);
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        long seekToUs = this.f8418i[0].seekToUs(j11);
        int i11 = 1;
        while (true) {
            InterfaceC3017w[] interfaceC3017wArr = this.f8418i;
            if (i11 >= interfaceC3017wArr.length) {
                return seekToUs;
            }
            if (interfaceC3017wArr[i11].seekToUs(seekToUs) != seekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        IdentityHashMap<U, Integer> identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[yVarArr.length];
        int[] iArr3 = new int[yVarArr.length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = yVarArr.length;
            identityHashMap = this.f8412c;
            if (i12 >= length) {
                break;
            }
            U u11 = uArr[i12];
            Integer num = u11 == null ? null : identityHashMap.get(u11);
            iArr2[i12] = num == null ? -1 : num.intValue();
            I3.y yVar = yVarArr[i12];
            if (yVar != null) {
                String str = yVar.g().f68963b;
                iArr3[i12] = Integer.parseInt(str.substring(0, str.indexOf(ProductContainerDTO.RATIO_DELIMITER)));
            } else {
                iArr3[i12] = -1;
            }
            i12++;
        }
        identityHashMap.clear();
        int length2 = yVarArr.length;
        U[] uArr2 = new U[length2];
        U[] uArr3 = new U[yVarArr.length];
        I3.y[] yVarArr2 = new I3.y[yVarArr.length];
        InterfaceC3017w[] interfaceC3017wArr = this.f8410a;
        ArrayList arrayList = new ArrayList(interfaceC3017wArr.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < interfaceC3017wArr.length) {
            int i14 = i11;
            while (i14 < yVarArr.length) {
                uArr3[i14] = iArr2[i14] == i13 ? uArr[i14] : null;
                if (iArr3[i14] == i13) {
                    I3.y yVar2 = yVarArr[i14];
                    yVar2.getClass();
                    iArr = iArr2;
                    C7253I c7253i = this.f8415f.get(yVar2.g());
                    c7253i.getClass();
                    yVarArr2[i14] = new a(yVar2, c7253i);
                } else {
                    iArr = iArr2;
                    yVarArr2[i14] = null;
                }
                i14++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC3017w[] interfaceC3017wArr2 = interfaceC3017wArr;
            int i15 = i13;
            long selectTracks = interfaceC3017wArr2[i13].selectTracks(yVarArr2, zArr, uArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = selectTracks;
            } else if (selectTracks != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < yVarArr.length; i16++) {
                if (iArr3[i16] == i15) {
                    U u12 = uArr3[i16];
                    u12.getClass();
                    uArr2[i16] = uArr3[i16];
                    identityHashMap.put(u12, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr4[i16] == i15) {
                    G10.a.h(uArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList.add(interfaceC3017wArr2[i15]);
            }
            i13 = i15 + 1;
            interfaceC3017wArr = interfaceC3017wArr2;
            iArr2 = iArr4;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(uArr2, i17, uArr, i17, length2);
        this.f8418i = (InterfaceC3017w[]) arrayList.toArray(new InterfaceC3017w[i17]);
        AbstractList a11 = com.google.common.collect.G.a(arrayList, new G());
        this.f8413d.getClass();
        this.f8419j = new C3003h(arrayList, a11);
        return j12;
    }
}

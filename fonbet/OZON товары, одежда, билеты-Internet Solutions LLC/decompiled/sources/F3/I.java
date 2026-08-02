package F3;

import E0.C2946s0;
import F3.InterfaceC3018x;
import j3.AbstractC7252H;
import j3.C7275q;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class I extends AbstractC3002g<Integer> {

    /* renamed from: m, reason: collision with root package name */
    private static final C7275q f8421m;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3018x[] f8422d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f8423e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7252H[] f8424f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<InterfaceC3018x> f8425g;

    /* renamed from: h, reason: collision with root package name */
    private final C2946s0 f8426h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.common.collect.J<Object, C2999d> f8427i;

    /* renamed from: j, reason: collision with root package name */
    private int f8428j;

    /* renamed from: k, reason: collision with root package name */
    private long[][] f8429k;

    /* renamed from: l, reason: collision with root package name */
    private a f8430l;

    public static final class a extends IOException {
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3018x.b f8431a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3017w f8432b;

        b(InterfaceC3018x.b bVar, InterfaceC3017w interfaceC3017w) {
            this.f8431a = bVar;
            this.f8432b = interfaceC3017w;
        }
    }

    static {
        C7275q.a aVar = new C7275q.a();
        aVar.d("MergingMediaSource");
        f8421m = aVar.a();
    }

    public I(InterfaceC3018x... interfaceC3018xArr) {
        C2946s0 c2946s0 = new C2946s0();
        this.f8422d = interfaceC3018xArr;
        this.f8426h = c2946s0;
        this.f8425g = new ArrayList<>(Arrays.asList(interfaceC3018xArr));
        this.f8428j = -1;
        this.f8423e = new ArrayList(interfaceC3018xArr.length);
        for (int i11 = 0; i11 < interfaceC3018xArr.length; i11++) {
            this.f8423e.add(new ArrayList());
        }
        this.f8424f = new AbstractC7252H[interfaceC3018xArr.length];
        this.f8429k = new long[0][];
        new HashMap();
        this.f8427i = com.google.common.collect.M.a().a().c();
    }

    @Override // F3.AbstractC3002g
    protected final InterfaceC3018x.b c(Integer num, InterfaceC3018x.b bVar) {
        ArrayList arrayList = this.f8423e;
        List list = (List) arrayList.get(num.intValue());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((b) list.get(i11)).f8431a.equals(bVar)) {
                return ((b) ((List) arrayList.get(0)).get(i11)).f8431a;
            }
        }
        return null;
    }

    @Override // F3.InterfaceC3018x
    public final InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        InterfaceC3018x[] interfaceC3018xArr = this.f8422d;
        int length = interfaceC3018xArr.length;
        InterfaceC3017w[] interfaceC3017wArr = new InterfaceC3017w[length];
        AbstractC7252H[] abstractC7252HArr = this.f8424f;
        int indexOfPeriod = abstractC7252HArr[0].getIndexOfPeriod(bVar.f8751a);
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC3018x.b a11 = bVar.a(abstractC7252HArr[i11].getUidOfPeriod(indexOfPeriod));
            interfaceC3017wArr[i11] = interfaceC3018xArr[i11].createPeriod(a11, bVar2, j11 - this.f8429k[indexOfPeriod][i11]);
            ((List) this.f8423e.get(i11)).add(new b(a11, interfaceC3017wArr[i11]));
        }
        return new H(this.f8426h, this.f8429k[indexOfPeriod], interfaceC3017wArr);
    }

    @Override // F3.AbstractC3002g
    protected final void f(Object obj, AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H) {
        Integer num = (Integer) obj;
        if (this.f8430l != null) {
            return;
        }
        if (this.f8428j == -1) {
            this.f8428j = abstractC7252H.getPeriodCount();
        } else if (abstractC7252H.getPeriodCount() != this.f8428j) {
            this.f8430l = new a();
            return;
        }
        int length = this.f8429k.length;
        AbstractC7252H[] abstractC7252HArr = this.f8424f;
        if (length == 0) {
            this.f8429k = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8428j, abstractC7252HArr.length);
        }
        ArrayList<InterfaceC3018x> arrayList = this.f8425g;
        arrayList.remove(abstractC2996a);
        abstractC7252HArr[num.intValue()] = abstractC7252H;
        if (arrayList.isEmpty()) {
            refreshSourceInfo(abstractC7252HArr[0]);
        }
    }

    @Override // F3.InterfaceC3018x
    public final C7275q getMediaItem() {
        InterfaceC3018x[] interfaceC3018xArr = this.f8422d;
        return interfaceC3018xArr.length > 0 ? interfaceC3018xArr[0].getMediaItem() : f8421m;
    }

    @Override // F3.AbstractC3002g, F3.InterfaceC3018x
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        a aVar = this.f8430l;
        if (aVar != null) {
            throw aVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // F3.AbstractC3002g, F3.AbstractC2996a
    protected final void prepareSourceInternal(p3.z zVar) {
        super.prepareSourceInternal(zVar);
        int i11 = 0;
        while (true) {
            InterfaceC3018x[] interfaceC3018xArr = this.f8422d;
            if (i11 >= interfaceC3018xArr.length) {
                return;
            }
            g(Integer.valueOf(i11), interfaceC3018xArr[i11]);
            i11++;
        }
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        H h11 = (H) interfaceC3017w;
        int i11 = 0;
        while (true) {
            InterfaceC3018x[] interfaceC3018xArr = this.f8422d;
            if (i11 >= interfaceC3018xArr.length) {
                return;
            }
            List list = (List) this.f8423e.get(i11);
            InterfaceC3017w a11 = h11.a(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    break;
                }
                if (((b) list.get(i12)).f8432b.equals(a11)) {
                    list.remove(i12);
                    break;
                }
                i12++;
            }
            interfaceC3018xArr[i11].releasePeriod(h11.a(i11));
            i11++;
        }
    }

    @Override // F3.AbstractC3002g, F3.AbstractC2996a
    protected final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f8424f, (Object) null);
        this.f8428j = -1;
        this.f8430l = null;
        ArrayList<InterfaceC3018x> arrayList = this.f8425g;
        arrayList.clear();
        Collections.addAll(arrayList, this.f8422d);
    }

    @Override // F3.InterfaceC3018x
    public final void updateMediaItem(C7275q c7275q) {
        this.f8422d[0].updateMediaItem(c7275q);
    }
}

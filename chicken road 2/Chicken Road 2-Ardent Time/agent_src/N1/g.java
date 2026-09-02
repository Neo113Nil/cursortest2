package N1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final M1.i f1150a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f1151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1152c;

    /* renamed from: d, reason: collision with root package name */
    public final M1.e f1153d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.v f1154e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1155f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1156g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1157h;

    /* renamed from: i, reason: collision with root package name */
    public int f1158i;

    public g(M1.i call, java.util.ArrayList arrayList, int i2, M1.e eVar, I1.v request, int i3, int i4, int i5) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(request, "request");
        this.f1150a = call;
        this.f1151b = arrayList;
        this.f1152c = i2;
        this.f1153d = eVar;
        this.f1154e = request;
        this.f1155f = i3;
        this.f1156g = i4;
        this.f1157h = i5;
    }

    public static N1.g a(N1.g gVar, int i2, M1.e eVar, I1.v vVar, int i3) {
        if ((i3 & 1) != 0) {
            i2 = gVar.f1152c;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            eVar = gVar.f1153d;
        }
        M1.e eVar2 = eVar;
        if ((i3 & 4) != 0) {
            vVar = gVar.f1154e;
        }
        I1.v request = vVar;
        int i5 = gVar.f1155f;
        int i6 = gVar.f1156g;
        int i7 = gVar.f1157h;
        gVar.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        return new N1.g(gVar.f1150a, gVar.f1151b, i4, eVar2, request, i5, i6, i7);
    }

    public final I1.y b(I1.v request) {
        kotlin.jvm.internal.i.e(request, "request");
        java.util.ArrayList arrayList = this.f1151b;
        int size = arrayList.size();
        int i2 = this.f1152c;
        if (i2 >= size) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f1158i++;
        M1.e eVar = this.f1153d;
        if (eVar != null) {
            if (!((M1.f) eVar.f1039c).b(request.f834a)) {
                throw new java.lang.IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f1158i != 1) {
                throw new java.lang.IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i3 = i2 + 1;
        N1.g a2 = a(this, i3, null, request, 58);
        I1.p pVar = (I1.p) arrayList.get(i2);
        I1.y a3 = pVar.a(a2);
        if (a3 == null) {
            throw new java.lang.NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i3 < arrayList.size() && a2.f1158i != 1) {
            throw new java.lang.IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (a3.f863g != null) {
            return a3;
        }
        throw new java.lang.IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }
}

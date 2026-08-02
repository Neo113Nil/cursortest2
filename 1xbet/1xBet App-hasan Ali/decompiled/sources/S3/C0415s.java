package S3;

import P.AbstractC0329z;
import P.C0315s;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import java.util.LinkedHashMap;

/* renamed from: S3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0415s implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5545k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5548n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0.p f5549o;

    public /* synthetic */ C0415s(Object obj, Object obj2, Object obj3, b0.p pVar, int i, int i5) {
        this.f5545k = i5;
        this.f5546l = obj;
        this.f5547m = obj2;
        this.f5548n = obj3;
        this.f5549o = pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5545k) {
            case 0:
                ((Integer) obj2).getClass();
                N4.b.J((String) this.f5546l, (String) this.f5547m, (LinkedHashMap) this.f5548n, this.f5549o, (C0315s) obj, AbstractC0329z.B(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                N4.b.J((String) this.f5546l, (String) this.f5547m, (LinkedHashMap) this.f5548n, this.f5549o, (C0315s) obj, AbstractC0329z.B(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(1);
                AquaMatchDigest aquaMatchDigest = (AquaMatchDigest) this.f5546l;
                i4.e eVar = (i4.e) this.f5548n;
                b0.p pVar = this.f5549o;
                AbstractC0412o.b(aquaMatchDigest, (i4.c) this.f5547m, eVar, pVar, (C0315s) obj, B5);
                break;
        }
        return W3.o.f6046a;
    }
}

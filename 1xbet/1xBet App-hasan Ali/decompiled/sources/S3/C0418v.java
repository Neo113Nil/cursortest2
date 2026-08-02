package S3;

import A.C0003c;
import P.C0315s;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import java.util.List;
import java.util.Map;

/* renamed from: S3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418v extends kotlin.jvm.internal.m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f5554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0418v(int i, List list) {
        super(4);
        this.f5553l = i;
        this.f5554m = list;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i5;
        switch (this.f5553l) {
            case 0:
                C0003c c0003c = (C0003c) obj;
                int intValue = ((Number) obj2).intValue();
                C0315s c0315s = (C0315s) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c0315s.f(c0003c) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c0315s.d(intValue) ? 32 : 16;
                }
                if ((i & 147) == 146 && c0315s.B()) {
                    c0315s.S();
                } else {
                    AquaMatchMoment aquaMatchMoment = (AquaMatchMoment) this.f5554m.get(intValue);
                    c0315s.X(-187674899);
                    N4.b.B(aquaMatchMoment, c0315s, 0);
                    c0315s.q(false);
                }
                break;
            default:
                C0003c c0003c2 = (C0003c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0315s c0315s2 = (C0315s) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i5 = (c0315s2.f(c0003c2) ? 4 : 2) | intValue4;
                } else {
                    i5 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i5 |= c0315s2.d(intValue3) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    Map.Entry entry = (Map.Entry) this.f5554m.get(intValue3);
                    c0315s2.X(2142577721);
                    String str = (String) entry.getKey();
                    W3.h hVar = (W3.h) entry.getValue();
                    N4.b.K(str, (String) hVar.f6036k, (String) hVar.f6037l, c0315s2, 0);
                    c0315s2.q(false);
                }
                break;
        }
        return W3.o.f6046a;
    }
}

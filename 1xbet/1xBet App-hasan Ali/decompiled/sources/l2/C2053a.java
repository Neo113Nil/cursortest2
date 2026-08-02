package l2;

import android.os.Build;
import k2.C2030a;
import m2.AbstractC2087d;
import o2.i;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2053a(AbstractC2087d abstractC2087d, int i) {
        super(abstractC2087d);
        this.f17764e = i;
    }

    @Override // l2.b
    public final boolean a(i iVar) {
        switch (this.f17764e) {
            case 0:
                return iVar.f18640j.f16983b;
            case 1:
                return iVar.f18640j.f16985d;
            case 2:
                return iVar.f18640j.f16982a == 2;
            case 3:
                int i = iVar.f18640j.f16982a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return iVar.f18640j.f16986e;
        }
    }

    @Override // l2.b
    public final boolean b(Object obj) {
        switch (this.f17764e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C2030a c2030a = (C2030a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c2030a.f17578a && c2030a.f17579b) ? false : true : true ^ c2030a.f17578a;
            case 3:
                C2030a c2030a2 = (C2030a) obj;
                return !c2030a2.f17578a || c2030a2.f17580c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}

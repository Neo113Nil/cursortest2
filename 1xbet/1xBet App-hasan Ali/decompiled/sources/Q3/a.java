package Q3;

import W3.o;
import c.n;
import com.google.android.gms.ads.MobileAds;
import d.AbstractC1904d;
import game.betting133.sports1xbet.aqua_bootstrap.AquaLaunchBridgeActivity;
import i4.InterfaceC2015a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5072k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AquaLaunchBridgeActivity f5073l;

    public /* synthetic */ a(AquaLaunchBridgeActivity aquaLaunchBridgeActivity, int i) {
        this.f5072k = i;
        this.f5073l = aquaLaunchBridgeActivity;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        int i = 0;
        o oVar = o.f6046a;
        int i5 = 1;
        AquaLaunchBridgeActivity aquaLaunchBridgeActivity = this.f5073l;
        switch (this.f5072k) {
            case 0:
                int i6 = AquaLaunchBridgeActivity.J;
                n.a(aquaLaunchBridgeActivity);
                return oVar;
            case 1:
                int i7 = AquaLaunchBridgeActivity.J;
                aquaLaunchBridgeActivity.getClass();
                Iterator it = X3.n.O(4, 2, 4096).iterator();
                while (it.hasNext()) {
                    i |= ((Number) it.next()).intValue();
                }
                aquaLaunchBridgeActivity.getWindow().getDecorView().setSystemUiVisibility(i);
                return oVar;
            case 2:
                int i8 = AquaLaunchBridgeActivity.J;
                MobileAds.a(aquaLaunchBridgeActivity, new P3.a(i5));
                return oVar;
            case 3:
                int i9 = AquaLaunchBridgeActivity.J;
                aquaLaunchBridgeActivity.k();
                return oVar;
            case 4:
                int i10 = AquaLaunchBridgeActivity.J;
                AbstractC1904d.a(aquaLaunchBridgeActivity, new X.d(-12736095, new e(new a(aquaLaunchBridgeActivity, 5), i5), true));
                return oVar;
            default:
                return Boolean.valueOf(((b) aquaLaunchBridgeActivity.f17164E.getValue()) == b.f5076m);
        }
    }
}

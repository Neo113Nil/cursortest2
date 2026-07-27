package sg.bigo.ads.x;

import androidx.core.view.ViewCompat;
import java.util.Map;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f13374a;
    public final /* synthetic */ k b;

    public i(k kVar, Map map) {
        this.b = kVar;
        this.f13374a = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num = (Integer) this.f13374a.get(2);
        Integer valueOf = Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
        if (num == null) {
            num = valueOf;
        }
        Integer num2 = (Integer) this.f13374a.get(1);
        if (num2 != null) {
            valueOf = num2;
        }
        AbstractC4954k.a(this.b.f0, R.color.bigo_ad_black, num.intValue(), valueOf.intValue());
    }
}

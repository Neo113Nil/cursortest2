package sg.bigo.ads.X0;

import android.app.Activity;
import android.content.Intent;
import java.util.WeakHashMap;
import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* loaded from: classes3.dex */
public abstract class s extends BaseAdActivityImpl {
    public final sg.bigo.ads.e.h d;

    public s(Activity activity) {
        super(activity);
        try {
            this.d = sg.bigo.ads.Y0.D.a(activity.getIntent().getIntExtra("ad_identifier", -1));
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void t() {
        if (this.d != null) {
            WeakHashMap weakHashMap = sg.bigo.ads.Y0.D.f12627a;
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void u() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void v() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void x() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void y() {
    }
}

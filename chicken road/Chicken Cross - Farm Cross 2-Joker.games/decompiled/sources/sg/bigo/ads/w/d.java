package sg.bigo.ads.w;

import android.webkit.ValueCallback;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public final class d implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13363a;

    public d(i iVar) {
        this.f13363a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        c cVar;
        Double d = (Double) obj;
        if (this.f13363a.f0 == null) {
            return;
        }
        if (d.doubleValue() <= 3.0d) {
            cVar = this.f13363a.f0;
            cVar.e = 0;
            cVar.f.setColor(ViewCompat.MEASURED_STATE_MASK);
            cVar.g.setColor(855638016);
        } else {
            cVar = this.f13363a.f0;
            cVar.e = 1;
            cVar.f.setColor(-1);
            cVar.g.setColor(872415231);
        }
        cVar.invalidate();
    }
}

package sg.bigo.ads.p;

import android.view.ViewGroup;
import android.widget.Button;
import sg.bigo.ads.C.l;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.n.AbstractC5391n;

/* renamed from: sg.bigo.ads.p.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5426a extends AbstractC5391n {
    public MediaView C;

    public C5426a(l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final MediaView k() {
        return this.C;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final ViewGroup m() {
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final Button n() {
        return null;
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final void q() {
        ViewGroup viewGroup = this.u;
        if (viewGroup != null) {
            this.C = (MediaView) viewGroup.findViewById(R.id.inter_media);
        }
    }
}

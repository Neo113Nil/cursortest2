package sg.bigo.ads.d1;

import android.view.View;
import android.widget.Toast;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.R;

/* renamed from: sg.bigo.ads.d1.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5072h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12731a;
    public final /* synthetic */ m b;

    public ViewOnClickListenerC5072h(m mVar, View view) {
        this.b = mVar;
        this.f12731a = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC4956m.a(this.b.f12736a.f12737a.b, this.f12731a.getContext())) {
            Toast.makeText(this.f12731a.getContext(), AbstractC4944a.a(this.f12731a.getContext(), R.string.bigo_ad_feedback_copied, new Object[0]), 0).show();
        }
        this.b.dismiss();
    }
}

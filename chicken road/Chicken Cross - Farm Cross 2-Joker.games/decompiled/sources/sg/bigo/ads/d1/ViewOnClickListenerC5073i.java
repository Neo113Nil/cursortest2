package sg.bigo.ads.d1;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.R;

/* renamed from: sg.bigo.ads.d1.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5073i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12732a;
    public final /* synthetic */ m b;

    public ViewOnClickListenerC5073i(m mVar, Context context) {
        this.b = mVar;
        this.f12732a = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC4956m.a(this.b.f12736a.f12737a.d, this.f12732a)) {
            Context context = this.f12732a;
            Toast.makeText(context, AbstractC4944a.a(context, R.string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
        }
        this.b.dismiss();
    }
}

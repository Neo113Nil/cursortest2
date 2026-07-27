package sg.bigo.ads.W0;

import android.view.View;
import sg.bigo.ads.controller.form.AdFormActivity;

/* loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdFormActivity f12593a;

    public a(AdFormActivity adFormActivity) {
        this.f12593a = adFormActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f12593a.finish();
    }
}

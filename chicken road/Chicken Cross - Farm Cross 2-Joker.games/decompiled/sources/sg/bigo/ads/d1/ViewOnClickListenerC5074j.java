package sg.bigo.ads.d1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import sg.bigo.ads.api.AdActivity;

/* renamed from: sg.bigo.ads.d1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5074j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12733a;

    public ViewOnClickListenerC5074j(m mVar) {
        this.f12733a = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = view.getContext();
        String str = this.f12733a.f12736a.f12737a.e;
        int i = AdActivity.b;
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", sg.bigo.ads.j1.h.class.getName());
        intent.putExtra("url", str);
        context.startActivity(intent);
        this.f12733a.dismiss();
    }
}

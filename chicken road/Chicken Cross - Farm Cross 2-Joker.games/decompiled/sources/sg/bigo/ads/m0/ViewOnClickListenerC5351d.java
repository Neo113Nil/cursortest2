package sg.bigo.ads.m0;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.n0.AbstractC5416a;

/* renamed from: sg.bigo.ads.m0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5351d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5353f f13112a;

    public ViewOnClickListenerC5351d(C5353f c5353f) {
        this.f13112a = c5353f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5353f c5353f = this.f13112a;
        c5353f.a(3, c5353f.i, System.currentTimeMillis() - this.f13112a.h);
        sg.bigo.ads.n0.e eVar = this.f13112a.c;
        View view2 = null;
        if (eVar != null) {
            ArrayList arrayList = eVar.h;
            int size = arrayList == null ? 0 : arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    AbstractC5416a abstractC5416a = (AbstractC5416a) eVar.h.get(i);
                    if (abstractC5416a != null && abstractC5416a.a()) {
                        view2 = abstractC5416a.h;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (view2 != null) {
            RelativeLayout relativeLayout = this.f13112a.e;
            HeightScrollView heightScrollView = (HeightScrollView) relativeLayout.findViewById(R.id.inter_form_scroll);
            View findViewById = relativeLayout.findViewById(R.id.inter_blank_viewholder);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (heightScrollView != null) {
                heightScrollView.scrollTo(0, view2.getTop() + height);
                return;
            }
            return;
        }
        C5353f c5353f2 = this.f13112a;
        PrivacyCheckBox privacyCheckBox = c5353f2.c.g;
        if (privacyCheckBox != null && privacyCheckBox.f) {
            sg.bigo.ads.common.form.render.a.a(c5353f2.e, c5353f2.f13113a, c5353f2.b, c5353f2, 1);
            return;
        }
        sg.bigo.ads.common.form.render.a.a(c5353f2.e, c5353f2.f13113a, c5353f2.b, c5353f2);
        C5353f c5353f3 = this.f13112a;
        c5353f3.a(4, c5353f3.i, System.currentTimeMillis() - this.f13112a.h);
    }
}

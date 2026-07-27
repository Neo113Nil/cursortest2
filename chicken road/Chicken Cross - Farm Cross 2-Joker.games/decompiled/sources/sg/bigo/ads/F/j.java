package sg.bigo.ads.F;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f12290a;
    public sg.bigo.ads.C.l b;

    public j(sg.bigo.ads.C.l lVar) {
        ImageView imageView;
        Context context;
        this.b = lVar;
        if (lVar == null || (context = lVar.k.f) == null) {
            imageView = null;
        } else {
            imageView = new ImageView(context);
            int a2 = AbstractC4963u.a(context, 38);
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(a2, a2));
            imageView.setVisibility(8);
        }
        this.f12290a = imageView;
    }
}

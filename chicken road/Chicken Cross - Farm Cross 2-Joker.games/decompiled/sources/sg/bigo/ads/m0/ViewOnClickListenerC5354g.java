package sg.bigo.ads.m0;

import android.view.View;
import sg.bigo.ads.K0.X;

/* renamed from: sg.bigo.ads.m0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5354g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13114a;
    public final /* synthetic */ C5353f b;

    public ViewOnClickListenerC5354g(View view, C5353f c5353f) {
        this.f13114a = view;
        this.b = c5353f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        X.c(this.f13114a);
        C5353f c5353f = this.b;
        if (c5353f != null) {
            c5353f.a(5, c5353f.i, System.currentTimeMillis() - c5353f.h);
        }
    }
}

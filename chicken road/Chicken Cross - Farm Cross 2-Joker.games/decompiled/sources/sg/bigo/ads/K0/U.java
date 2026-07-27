package sg.bigo.ads.K0;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public final class U implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12351a = false;
    public final /* synthetic */ W b;
    public final /* synthetic */ View c;

    public U(View view, W w) {
        this.b = w;
        this.c = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        W w = this.b;
        if (w != null && !this.f12351a) {
            this.f12351a = true;
            w.a(view, new Rect(i, i2, i3, i4), new Rect(i5, i6, i7, i8));
        }
        this.c.post(new T(this, this));
    }
}

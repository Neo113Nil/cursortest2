package sg.bigo.ads.t;

import android.view.ViewGroup;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class j implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f13311a;
    public final /* synthetic */ v b;

    public j(v vVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.b = vVar;
        this.f13311a = marginLayoutParams;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13311a.topMargin = ((Integer) obj).intValue();
        this.b.w0.requestLayout();
        int measuredWidth = this.b.w0.getMeasuredWidth();
        v vVar = this.b;
        vVar.b(measuredWidth, vVar.s0 - this.f13311a.topMargin);
    }
}

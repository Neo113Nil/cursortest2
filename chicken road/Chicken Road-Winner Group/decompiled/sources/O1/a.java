package O1;

import A0.r;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.j;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1064a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f1065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f1066c;

    public a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f1065b = onFocusChangeListener;
        this.f1066c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f1064a) {
            case 0:
                b bVar = (b) this.f1066c;
                this.f1065b.onFocusChange(bVar, F2.b.J(bVar, new r(5)));
                break;
            default:
                j jVar = (j) this.f1066c;
                this.f1065b.onFocusChange(jVar, F2.b.J(jVar, new r(5)));
                break;
        }
    }

    public a(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f1066c = jVar;
        this.f1065b = onFocusChangeListener;
    }
}

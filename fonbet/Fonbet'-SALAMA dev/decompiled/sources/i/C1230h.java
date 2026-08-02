package i;

import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1230h implements e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserActivity f13705a;

    public C1230h(InAppBrowserActivity inAppBrowserActivity) {
        this.f13705a = inAppBrowserActivity;
    }

    @Override // e.b
    public final void a(androidx.activity.o oVar) {
        InAppBrowserActivity inAppBrowserActivity = this.f13705a;
        m delegate = inAppBrowserActivity.getDelegate();
        delegate.a();
        inAppBrowserActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.f();
    }
}

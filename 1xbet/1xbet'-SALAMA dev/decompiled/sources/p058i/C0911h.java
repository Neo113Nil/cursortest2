package p058i;

import androidx.activity.o;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import p029e.b;

/* JADX INFO: renamed from: i.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserActivity f13711a;

    public C0911h(InAppBrowserActivity inAppBrowserActivity) {
        this.f13711a = inAppBrowserActivity;
    }

    @Override // p029e.b
    public final void a(o oVar) {
        InAppBrowserActivity inAppBrowserActivity = this.f13711a;
        m delegate = inAppBrowserActivity.getDelegate();
        delegate.a();
        inAppBrowserActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.f();
    }
}

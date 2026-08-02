package G0;

import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2835a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2836b;

    public a(f fVar) {
        t6.h.e(fVar, "registry");
        this.f2836b = new LinkedHashSet();
        fVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // G0.e
    public final Bundle a() {
        switch (this.f2835a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2836b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((InAppBrowserActivity) this.f2836b).getDelegate().getClass();
                return bundle2;
        }
    }

    public a(InAppBrowserActivity inAppBrowserActivity) {
        this.f2836b = inAppBrowserActivity;
    }
}

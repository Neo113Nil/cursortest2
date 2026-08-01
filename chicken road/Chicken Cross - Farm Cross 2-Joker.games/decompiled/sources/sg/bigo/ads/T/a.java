package sg.bigo.ads.T;

import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;

/* loaded from: classes3.dex */
public final class a extends CustomTabsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12542a;

    public a(c cVar) {
        this.f12542a = cVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        super.extraCallback(str, bundle);
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        super.onMessageChannelReady(bundle);
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        CustomTabsCallback customTabsCallback = this.f12542a.d;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        super.onPostMessage(str, bundle);
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        super.onRelationshipValidationResult(i, uri, z, bundle);
    }
}

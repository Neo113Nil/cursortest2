package com.inmobi.ads.rendering;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiInAppBrowserActivity;", "Lcom/inmobi/ads/rendering/InMobiAdActivity;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InMobiInAppBrowserActivity extends com.inmobi.ads.rendering.InMobiAdActivity {
    @Override // com.inmobi.ads.rendering.InMobiAdActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        getWindow().getDecorView().setBackgroundColor(0);
    }
}

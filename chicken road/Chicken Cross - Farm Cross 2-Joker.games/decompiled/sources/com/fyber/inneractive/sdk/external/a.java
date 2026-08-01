package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.i1;

/* loaded from: classes4.dex */
public final class a implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5311a;
    public final /* synthetic */ OnFyberMarketplaceInitializedListener b;

    public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f5311a = context;
        this.b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        if (this.f5311a.getApplicationContext() != null) {
            InneractiveAdManager.a();
            IAConfigManager.removeListener(this);
            InneractiveAdManager.d = null;
            if (z) {
                InneractiveAdManager.a(this.b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.a(this.b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc != null ? exc.getLocalizedMessage() : null);
            }
            try {
                i1.a();
            } catch (Throwable th) {
                IAlog.a("%s : SdkPublisherDiagnostics.initialize() : %s", "InneractiveAdManager", th);
                InneractiveAdManager.a(this.f5311a, th);
            }
        }
    }
}

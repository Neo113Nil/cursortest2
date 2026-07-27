package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f2886a;

    public a(BannerBase bannerBase) {
        this.f2886a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1 || i3 == 2) {
            this.f2886a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}

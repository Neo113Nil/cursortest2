package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f6020a;

    public w(x xVar) {
        this.f6020a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6020a.f6022a.getClass();
        com.fyber.inneractive.sdk.util.r.b.post(new v("Image failed to download."));
        this.f6020a.f6022a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}

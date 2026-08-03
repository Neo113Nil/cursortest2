package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.x f4362a;

    public w(com.fyber.inneractive.sdk.web.x xVar) {
        this.f4362a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4362a.f4364a.getClass();
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.web.v("Image failed to download."));
        this.f4362a.f4364a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        com.fyber.inneractive.sdk.util.IAlog.a("failed to download and save the image file.", new java.lang.Object[0]);
    }
}

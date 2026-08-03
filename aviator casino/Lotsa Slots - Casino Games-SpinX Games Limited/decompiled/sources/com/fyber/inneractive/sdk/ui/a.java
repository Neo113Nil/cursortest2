package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal f4273a;

    public a(com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f4273a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (exc != null || bitmap == null) {
            return;
        }
        this.f4273a.r = bitmap;
    }
}

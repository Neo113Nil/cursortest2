package com.inmobi.media;

/* renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2789u implements com.squareup.picasso.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2841w f5475a;
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl b;

    public C2789u(com.inmobi.media.C2841w c2841w, kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl) {
        this.f5475a = c2841w;
        this.b = cancellableContinuationImpl;
    }

    @Override // com.squareup.picasso.Callback
    public final void onError(java.lang.Exception exc) {
        com.inmobi.media.C2799u9 c2799u9 = this.f5475a.d;
        if (c2799u9 != null) {
            c2799u9.a("AdChoiceViewManager", "onError Called " + exc);
        }
        com.inmobi.media.T4.a(this.b, java.lang.Boolean.FALSE);
    }

    @Override // com.squareup.picasso.Callback
    public final void onSuccess() {
        com.inmobi.media.C2799u9 c2799u9 = this.f5475a.d;
        if (c2799u9 != null) {
            c2799u9.a("AdChoiceViewManager", "onSuccess Called");
        }
        com.inmobi.media.T4.a(this.b, java.lang.Boolean.TRUE);
    }
}

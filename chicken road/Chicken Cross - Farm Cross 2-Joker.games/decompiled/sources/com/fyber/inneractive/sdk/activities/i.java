package com.fyber.inneractive.sdk.activities;

/* loaded from: classes4.dex */
public final class i implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f5175a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f5175a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f5221a != com.fyber.inneractive.sdk.click.q.FAILED) {
            InneractiveInternalBrowserActivity.a(this.f5175a, bVar);
            this.f5175a.finish();
        }
    }
}

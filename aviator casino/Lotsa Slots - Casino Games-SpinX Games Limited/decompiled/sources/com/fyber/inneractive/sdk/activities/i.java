package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class i implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3526a;

    public i(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3526a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f3570a != com.fyber.inneractive.sdk.click.q.FAILED) {
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.a(this.f3526a, bVar);
            this.f3526a.finish();
        }
    }
}

package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ignite.h f3771a;

    public b(com.fyber.inneractive.sdk.ignite.h hVar) {
        this.f3771a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = (com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse) obj;
        this.f3771a.getClass();
        if (exc == null && igniteResponseOuterClass$IgniteResponse != null && igniteResponseOuterClass$IgniteResponse.hasClientId() && igniteResponseOuterClass$IgniteResponse.hasClientSecret()) {
            this.f3771a.onCredentialsRequestSuccess(igniteResponseOuterClass$IgniteResponse.getClientId(), igniteResponseOuterClass$IgniteResponse.getClientSecret());
            return;
        }
        java.lang.String str = "";
        com.fyber.inneractive.sdk.util.IAlog.a("Failed to fetch ignite client credentials with error: %s", exc != null ? exc.getMessage() : "");
        this.f3771a.getClass();
        if (!(exc instanceof com.fyber.inneractive.sdk.network.k1) || ((com.fyber.inneractive.sdk.network.k1) exc).f3844a != 204) {
            this.f3771a.a(com.fyber.inneractive.sdk.ignite.j.FAILED_TO_RETRIEVE_CREDENTIALS, exc != null ? exc.getMessage() : null);
        }
        if (exc != null && exc.getMessage() != null) {
            str = exc.getMessage();
        }
        this.f3771a.onCredentialsRequestFailed(str);
    }
}

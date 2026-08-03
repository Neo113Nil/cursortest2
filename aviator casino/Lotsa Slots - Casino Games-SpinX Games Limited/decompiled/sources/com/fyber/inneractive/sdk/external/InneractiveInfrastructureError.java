package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveInfrastructureError extends com.fyber.inneractive.sdk.external.InneractiveError {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode f3653a;
    public final com.fyber.inneractive.sdk.flow.i b;
    public final java.lang.Throwable c;
    public java.lang.Exception d;
    public final java.util.ArrayList e;

    public InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public void addReportedError(com.fyber.inneractive.sdk.network.t tVar) {
        this.e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public java.lang.String description() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f3653a);
        if (this.c != null) {
            sb.append(" : ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    public java.lang.Throwable getCause() {
        java.lang.Exception exc = this.d;
        return exc == null ? this.c : exc;
    }

    public com.fyber.inneractive.sdk.external.InneractiveErrorCode getErrorCode() {
        return this.f3653a;
    }

    public com.fyber.inneractive.sdk.flow.i getFyberMarketplaceAdLoadFailureReason() {
        return this.b;
    }

    public boolean isErrorAlreadyReported(com.fyber.inneractive.sdk.network.t tVar) {
        return this.e.contains(tVar);
    }

    public void setCause(java.lang.Exception exc) {
        this.d = exc;
    }

    public InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i iVar, java.lang.Throwable th) {
        this.e = new java.util.ArrayList();
        this.f3653a = inneractiveErrorCode;
        this.b = iVar;
        this.c = th;
    }
}

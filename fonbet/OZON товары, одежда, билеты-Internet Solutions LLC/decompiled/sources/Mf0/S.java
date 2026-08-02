package Mf0;

import pf0.AbstractC8919b;

/* loaded from: classes3.dex */
public final class S extends pf0.i {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18001a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18002b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18003c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8919b.a f18004d = AbstractC8919b.a.f80501a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18005e = true;

    S(boolean z11, boolean z12) {
        this.f18001a = z11;
        this.f18002b = z12;
    }

    @Override // pf0.i
    public final AbstractC8919b getConsumer() {
        return this.f18004d;
    }

    @Override // pf0.i
    public final boolean getShouldReadResponseBodyBeforeResponse() {
        return this.f18005e;
    }

    @Override // pf0.i
    /* renamed from: isCronetEnabled */
    public final boolean getIsCronetEnabled() {
        return this.f18001a;
    }

    @Override // pf0.i
    /* renamed from: isGostTlsEnabled */
    public final boolean getIsGostTlsEnabled() {
        return this.f18002b;
    }

    @Override // pf0.i
    /* renamed from: isPerfMetricsEnabled */
    public final boolean getIsPerfMetricsEnabled() {
        return this.f18003c;
    }

    @Override // pf0.i
    public final void setCronetEnabled(boolean z11) {
        this.f18001a = z11;
    }

    @Override // pf0.i
    public final void setGostTlsEnabled(boolean z11) {
        this.f18002b = z11;
    }

    @Override // pf0.i
    public final void setPerfMetricsEnabled(boolean z11) {
        this.f18003c = z11;
    }

    @Override // pf0.i
    public final void setShouldReadResponseBodyBeforeResponse(boolean z11) {
        this.f18005e = z11;
    }
}

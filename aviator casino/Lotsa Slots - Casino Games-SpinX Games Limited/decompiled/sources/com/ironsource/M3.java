package com.ironsource;

/* loaded from: classes5.dex */
public class M3 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5819a = true;
    private com.ironsource.mediationsdk.logger.IronSourceError b = null;

    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5819a = false;
        this.b = ironSourceError;
    }

    public boolean b() {
        return this.f5819a;
    }

    public void c() {
        this.f5819a = true;
        this.b = null;
    }

    public java.lang.String toString() {
        if (b()) {
            return "valid:" + this.f5819a;
        }
        return "valid:" + this.f5819a + ", IronSourceError:" + this.b;
    }

    public com.ironsource.mediationsdk.logger.IronSourceError a() {
        return this.b;
    }
}

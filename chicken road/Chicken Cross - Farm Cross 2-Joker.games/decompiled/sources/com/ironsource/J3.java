package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public class J3 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7710a = true;
    private IronSourceError b = null;

    public void a(IronSourceError ironSourceError) {
        this.f7710a = false;
        this.b = ironSourceError;
    }

    public boolean b() {
        return this.f7710a;
    }

    public void c() {
        this.f7710a = true;
        this.b = null;
    }

    public String toString() {
        return b() ? "valid:" + this.f7710a : "valid:" + this.f7710a + ", IronSourceError:" + this.b;
    }

    public IronSourceError a() {
        return this.b;
    }
}

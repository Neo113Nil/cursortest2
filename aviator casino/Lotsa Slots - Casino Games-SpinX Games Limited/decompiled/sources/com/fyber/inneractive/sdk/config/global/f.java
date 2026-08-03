package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.config.global.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3603a;
    public final boolean b;

    public f(boolean z, java.lang.String str) {
        this.f3603a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(com.fyber.inneractive.sdk.config.global.e eVar) {
        java.lang.String str = this.f3603a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.b : this.b;
        }
        return false;
    }

    public final java.lang.String toString() {
        return "os - " + this.f3603a + " include: " + this.b;
    }
}

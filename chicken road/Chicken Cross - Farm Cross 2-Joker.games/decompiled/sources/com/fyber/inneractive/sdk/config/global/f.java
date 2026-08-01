package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5253a;
    public final boolean b;

    public f(boolean z, String str) {
        this.f5253a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f5253a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.b : this.b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f5253a + " include: " + this.b;
    }
}

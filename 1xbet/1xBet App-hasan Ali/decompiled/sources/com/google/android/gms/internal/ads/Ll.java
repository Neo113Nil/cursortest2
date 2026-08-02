package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Ll implements Ji {

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f10458k = new Bundle();

    @Override // com.google.android.gms.internal.ads.Ji
    public final synchronized void C(String str) {
        this.f10458k.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.Ji
    public final synchronized void H(String str) {
        this.f10458k.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.Ji
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Ji
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Ji
    public final void d(String str) {
    }

    @Override // com.google.android.gms.internal.ads.Ji
    public final synchronized void j(String str, String str2) {
        this.f10458k.putInt(str, 3);
    }
}

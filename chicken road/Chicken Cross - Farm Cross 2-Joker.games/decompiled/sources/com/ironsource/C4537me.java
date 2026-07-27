package com.ironsource;

import com.ironsource.F8;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4537me implements F8, F8.a {

    /* renamed from: a, reason: collision with root package name */
    private C4519le f8363a;
    private boolean b;

    @Override // com.ironsource.F8
    public Sa a() {
        C4519le c4519le = this.f8363a;
        if (c4519le != null) {
            return new Sa(c4519le);
        }
        return null;
    }

    @Override // com.ironsource.F8
    public L9 b() {
        C4519le c4519le = this.f8363a;
        if (c4519le != null) {
            return new L9(c4519le);
        }
        return null;
    }

    @Override // com.ironsource.F8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.F8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.F8.a
    public void a(C4519le sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f8363a = sdkConfig;
    }
}

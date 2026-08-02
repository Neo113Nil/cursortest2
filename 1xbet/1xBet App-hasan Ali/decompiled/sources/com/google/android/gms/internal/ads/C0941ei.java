package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941ei extends BC implements InterfaceC1462q9 {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f13325m;

    public C0941ei(Set set) {
        super(set);
        this.f13325m = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1462q9
    public final synchronized void Q(String str, Bundle bundle) {
        this.f13325m.putAll(bundle);
        n1(new Jh(10));
    }
}

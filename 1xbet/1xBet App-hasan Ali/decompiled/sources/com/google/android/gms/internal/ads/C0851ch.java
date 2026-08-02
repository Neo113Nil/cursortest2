package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851ch implements InterfaceC0896dh {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13028a;

    public C0851ch(Map map) {
        this.f13028a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0896dh
    public final InterfaceC1259ln a(String str, int i) {
        return (InterfaceC1259ln) this.f13028a.get(str);
    }
}

package com.ironsource;

/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3189nd implements com.ironsource.E0 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6500a;

    public C3189nd(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f6500a = placementName;
    }

    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("placement", this.f6500a);
        return hashMap;
    }
}

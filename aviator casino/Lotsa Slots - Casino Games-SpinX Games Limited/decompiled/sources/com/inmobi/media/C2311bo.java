package com.inmobi.media;

/* renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2311bo implements com.inmobi.media.InterfaceC2418fo {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2285ao f5130a;
    public final com.inmobi.media.C2727rj b;

    public C2311bo(com.inmobi.media.C2285ao visibilityConfig, com.inmobi.media.C2727rj simpleViewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityConfig, "visibilityConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleViewHolder, "simpleViewHolder");
        this.f5130a = visibilityConfig;
        this.b = simpleViewHolder;
    }

    @Override // com.inmobi.media.InterfaceC2418fo
    public final com.inmobi.media.EnumC2391eo a() {
        com.inmobi.media.C2555l5 c2555l5 = this.b.f5430a;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!c2555l5.getGlobalVisibleRect(rect)) {
            return com.inmobi.media.EnumC2391eo.f5188a;
        }
        com.inmobi.media.C2285ao c2285ao = this.f5130a;
        return (com.inmobi.media.AbstractC2600mo.a(c2555l5, rect, c2285ao.f5110a, c2285ao.b) && com.inmobi.media.AbstractC2600mo.a(c2555l5, rect, this.f5130a.f5110a, this.b.b)) ? com.inmobi.media.EnumC2391eo.b : com.inmobi.media.EnumC2391eo.f5188a;
    }
}

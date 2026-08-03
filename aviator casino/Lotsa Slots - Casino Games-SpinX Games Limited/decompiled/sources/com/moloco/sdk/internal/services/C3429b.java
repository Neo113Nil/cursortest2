package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3429b implements com.moloco.sdk.internal.services.InterfaceC3428a {
    public static final com.moloco.sdk.internal.services.C3429b.a b = new com.moloco.sdk.internal.services.C3429b.a(null);
    public static final int c = 8;
    public static final java.lang.String d = "AccessibilityInfoService";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7213a;

    /* renamed from: com.moloco.sdk.internal.services.b$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C3429b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7213a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3428a
    public boolean a() {
        return android.provider.Settings.Secure.getInt(this.f7213a.getContentResolver(), "reduce_bright_colors_activated") == 1;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3428a
    public boolean b() {
        java.lang.Object systemService = this.f7213a.getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((android.view.accessibility.AccessibilityManager) systemService).isEnabled() && android.provider.Settings.Secure.getInt(this.f7213a.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3428a
    public boolean c() {
        try {
            java.lang.Object systemService = this.f7213a.getSystemService("captioning");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
            return ((android.view.accessibility.CaptioningManager) systemService).isEnabled();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3428a
    public float getFontScale() {
        java.lang.Object systemService = this.f7213a.getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((android.view.accessibility.AccessibilityManager) systemService).isEnabled()) {
            return this.f7213a.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}

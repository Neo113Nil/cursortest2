package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class y implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.x> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.y.a f = new com.moloco.sdk.internal.services.bidtoken.providers.y.a(null);
    public static final int g = 8;
    public static final java.lang.String h = "TCSignalProvider";
    public static final java.lang.String i;
    public static final java.lang.String j = "test_config";
    public final android.content.Context b;
    public final java.lang.String c;
    public final java.lang.String d;
    public com.moloco.sdk.internal.services.bidtoken.providers.x e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        byte[] decode = android.util.Base64.decode(new byte[]{98, 87, 57, 115, 98, 50, 78, 118, 88, 50, 82, 108, 98, 87, 57, 102, 100, 71, 86, 122, 100, 71, 108, 117, 90, 119, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 10}, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        i = kotlin.text.StringsKt.decodeToString(decode);
    }

    public y(android.content.Context context, java.lang.String preferencesName, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferencesName, "preferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.b = context;
        this.c = preferencesName;
        this.d = key;
        this.e = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.e = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.x f2 = f();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(f2, this.e);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "[CBT] TCS needsRefresh: " + z + ", current: " + f2.b() + ", cached: " + this.e.b(), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return h;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.x d() {
        com.moloco.sdk.internal.services.bidtoken.providers.x xVar = this.e;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "[CBT] TCS providing: " + xVar.b(), false, 4, null);
        return xVar;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.x f() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.x(this.b.getSharedPreferences(this.c, 0).getString(this.d, null));
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "[CBT] TCS Error", e, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.x(null);
        }
    }

    public /* synthetic */ y(android.content.Context context, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? i : str, (i2 & 4) != 0 ? j : str2);
    }
}

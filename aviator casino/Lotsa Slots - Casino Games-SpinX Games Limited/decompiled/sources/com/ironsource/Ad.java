package com.ironsource;

/* loaded from: classes5.dex */
public final class Ad {
    public static final com.ironsource.Ad.a b = new com.ironsource.Ad.a(null);
    public static final java.lang.String c = "type";
    public static final java.lang.String d = "single";
    public static final java.lang.String e = "onShowSuccess";
    public static final java.lang.String f = "onLoadSuccess";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3307u6.c f5616a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Ad(org.json.JSONObject features) {
        com.ironsource.InterfaceC3307u6.c cVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        java.lang.String optString = features.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = com.ironsource.InterfaceC3307u6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = com.ironsource.InterfaceC3307u6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = com.ironsource.InterfaceC3307u6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.f5616a = cVar;
        }
        cVar = null;
        this.f5616a = cVar;
    }

    public final com.ironsource.InterfaceC3307u6.c a() {
        return this.f5616a;
    }
}

package com.unity3d.ironsourceads.internal.services;

/* loaded from: classes5.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3050g f8021a;
    private final com.ironsource.InterfaceC3068h b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8022a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3131k9.values().length];
            try {
                iArr[com.ironsource.EnumC3131k9.DIRECT_INTENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.EnumC3131k9.APP_ACTIVITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f8022a = iArr;
        }
    }

    public b(com.ironsource.InterfaceC3050g actionIntentFactory, com.ironsource.InterfaceC3068h activityIntentFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.f8021a = actionIntentFactory;
        this.b = activityIntentFactory;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0329a b(android.app.Activity activity, android.content.Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, com.ironsource.EnumC3378y5.INLINE_STORE_LAUNCHED, com.ironsource.EnumC3131k9.DIRECT_INTENT, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.b.f8020a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(android.content.Context context, com.ironsource.C3096i9 request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        try {
            a(this, com.ironsource.EnumC3378y5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
            if (android.text.TextUtils.isEmpty(request.h())) {
                a(com.ironsource.EnumC3378y5.INLINE_STORE_FAILED, request.g(), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", "storeUrl is empty")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a("storeUrl is empty");
            }
            if (!(context instanceof android.app.Activity)) {
                a(com.ironsource.EnumC3378y5.INLINE_STORE_FAILED, request.g(), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a("context is not an Activity");
            }
            android.content.Intent a2 = a(request);
            if (!a(context, a2)) {
                a(com.ironsource.EnumC3378y5.INLINE_STORE_FAILED, request.g(), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", "Failed to resolve for packageManager")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a("Failed to resolve for packageManager");
            }
            int i = com.unity3d.ironsourceads.internal.services.b.a.f8022a[request.g().ordinal()];
            if (i == 1) {
                return b((android.app.Activity) context, a2);
            }
            if (i == 2) {
                return a((android.app.Activity) context, a2);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.String str = "Failed to open inline store: " + e.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            a(com.ironsource.EnumC3378y5.INLINE_STORE_FAILED, request.g(), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", str)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a(str);
        }
    }

    public b() {
        this(new com.ironsource.sdk.controller.k.a(), new com.ironsource.sdk.controller.k.b());
    }

    private final android.content.Intent a(com.ironsource.C3096i9 c3096i9) {
        android.content.Intent a2 = this.f8021a.a();
        a2.setPackage(c3096i9.f());
        a2.setData(android.net.Uri.parse(c3096i9.h()));
        org.json.JSONObject e = c3096i9.e();
        if (e != null) {
            java.util.Iterator<java.lang.String> keys = e.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object value = e.get(next);
                if (value instanceof java.lang.String) {
                    a2.putExtra(next, (java.lang.String) value);
                } else if (value instanceof java.lang.Boolean) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((java.lang.Boolean) value).booleanValue());
                } else if (value instanceof java.lang.Integer) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((java.lang.Number) value).intValue());
                } else if (value instanceof java.lang.Long) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((java.lang.Number) value).longValue());
                } else if (value instanceof java.lang.Float) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((java.lang.Number) value).floatValue());
                } else if (value instanceof java.lang.Double) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((java.lang.Number) value).doubleValue());
                } else {
                    a2.putExtra(next, value.toString());
                }
            }
        }
        return a2;
    }

    private final boolean a(android.content.Context context, android.content.Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(android.app.Activity activity, android.content.Intent intent) {
        activity.startActivity(new com.unity3d.ironsourceads.internal.services.InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, com.ironsource.EnumC3378y5.INLINE_STORE_ACTIVITY_LAUNCHED, com.ironsource.EnumC3131k9.APP_ACTIVITY, null, 4, null);
        return com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.b.f8020a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public com.unity3d.ironsourceads.internal.services.a.AbstractC0329a a(android.content.Context context, com.ironsource.EnumC3131k9 strategy) {
        android.content.Intent intent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            a(this, com.ironsource.EnumC3378y5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof android.app.Activity)) {
                a(com.ironsource.EnumC3378y5.INLINE_STORE_DESTROY_FAILED, strategy, kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", "context is not an Activity")));
                return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a("context is not an Activity");
            }
            int i = com.unity3d.ironsourceads.internal.services.b.a.f8022a[strategy.ordinal()];
            if (i == 1) {
                intent = new android.content.Intent(context, (java.lang.Class<?>) com.ironsource.sdk.controller.ControllerActivity.class);
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                intent = new android.content.Intent(context, (java.lang.Class<?>) com.unity3d.ironsourceads.internal.services.InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, com.ironsource.EnumC3378y5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.b.f8020a;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            java.lang.String str = "Failed to destroy inline store: " + e.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            a(com.ironsource.EnumC3378y5.INLINE_STORE_DESTROY_FAILED, strategy, kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", str)));
            return new com.unity3d.ironsourceads.internal.services.a.AbstractC0329a.C0330a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(com.unity3d.ironsourceads.internal.services.b bVar, com.ironsource.EnumC3378y5 enumC3378y5, com.ironsource.EnumC3131k9 enumC3131k9, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = new java.util.LinkedHashMap();
        }
        bVar.a(enumC3378y5, enumC3131k9, map);
    }

    private final void a(com.ironsource.EnumC3378y5 enumC3378y5, com.ironsource.EnumC3131k9 enumC3131k9, java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            map.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC3131k9.b());
            com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(enumC3378y5, new org.json.JSONObject(kotlin.collections.MapsKt.toMap(map))));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }
}

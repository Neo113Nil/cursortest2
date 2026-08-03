package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    public static com.google.android.gms.appset.AppSetIdInfo f4611a;

    static {
        b();
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static void b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null && a()) {
            com.google.android.gms.appset.AppSetIdClient client = com.google.android.gms.appset.AppSet.getClient(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.B1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.inmobi.media.B1.a((com.google.android.gms.appset.AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.inmobi.media.B1$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    com.inmobi.media.B1.a(kotlin.jvm.functions.Function1.this, obj);
                }
            });
        }
    }

    public static final kotlin.Unit a(com.google.android.gms.appset.AppSetIdInfo appSetIdInfo) {
        f4611a = appSetIdInfo;
        return kotlin.Unit.INSTANCE;
    }

    public static boolean a() {
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.appset.AppSetIdInfo.class).getSimpleName();
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.tasks.Task.class).getSimpleName();
            return true;
        } catch (java.lang.NoClassDefFoundError e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B1", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
            e.toString();
            return false;
        }
    }

    public static void a(java.util.LinkedHashMap mutableMap) {
        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        if (a() && (appSetIdInfo = f4611a) != null) {
            mutableMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(scope);
        }
    }
}

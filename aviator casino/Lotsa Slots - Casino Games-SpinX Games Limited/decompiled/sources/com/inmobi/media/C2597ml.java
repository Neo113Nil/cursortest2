package com.inmobi.media;

/* renamed from: com.inmobi.media.ml, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2597ml extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5341a;
    public final /* synthetic */ android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597ml(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2597ml(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2597ml(this.b, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        ?? emptyList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5341a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Lazy lazy = com.inmobi.media.AbstractC2639o9.f5371a;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.lang.String[] databaseList = context.databaseList();
                if (databaseList != null) {
                    emptyList = new java.util.ArrayList();
                    for (java.lang.String str : databaseList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        if (new kotlin.text.Regex("com\\.im_([0-9]+\\.){2}[0-9]+([-.\\w]*).db(-wal)?(-shm)?").matches(str) && !kotlin.jvm.internal.Intrinsics.areEqual(str, "com.im_11.2.0.db")) {
                            emptyList.add(str);
                        }
                    }
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                for (java.lang.String str2 : emptyList) {
                    java.io.File databasePath = context.getDatabasePath(str2);
                    if (databasePath != null && databasePath.exists()) {
                        context.deleteDatabase(str2);
                    }
                }
            }
            com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.J4(null), 1, null);
            if (com.inmobi.media.E0.b == null) {
                com.inmobi.media.E0.b = new com.inmobi.media.A0();
            }
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            com.inmobi.media.AbstractC2318c4.a("ads", com.inmobi.media.E0.d);
            com.inmobi.media.A0 a0 = com.inmobi.media.E0.b;
            if (a0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("executor");
                a0 = null;
            }
            if (!a0.f4590a.get()) {
                com.inmobi.media.A0 a02 = com.inmobi.media.E0.b;
                if (a02 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("executor");
                    a02 = null;
                }
                if (!a02.f4590a.get()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
                    if (((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getAdQuality().getEnabled()) {
                        a02.a();
                    }
                }
            }
            com.inmobi.media.M9.b();
            com.inmobi.media.M9.a();
            com.inmobi.media.P5 p5 = com.inmobi.media.N5.f4847a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            com.inmobi.media.core.config.models.AdConfig adConfig = (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
            com.inmobi.media.N0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
            boolean a2 = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
            com.inmobi.media.N5.e = a2;
            if (!a2 && com.inmobi.media.N5.c == null) {
                android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                if (context2 == null) {
                    string = null;
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                    com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context2, "display_info_store");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                    string = a3.f4815a.getString("gesture_margin", null);
                }
                com.inmobi.media.N5.c = string;
            }
            if (adConfig.getRendering().getEnableImmersive()) {
                com.inmobi.media.N5.j();
                com.inmobi.media.N5.i();
            }
            com.inmobi.media.AbstractC2383eh.b();
            com.inmobi.media.C2678pl c2678pl = com.inmobi.media.C2678pl.f5396a;
            this.f5341a = 1;
            if (c2678pl.b(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Context context3 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context3, "context");
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.embedding.ActivityFilter.class).getSimpleName();
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.embedding.ActivityRule.class).getSimpleName();
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.embedding.RuleController.class).getSimpleName();
            androidx.window.embedding.RuleController.Companion.getInstance(context3).addRule(new androidx.window.embedding.ActivityRule.Builder(kotlin.collections.SetsKt.setOf(new androidx.window.embedding.ActivityFilter(new android.content.ComponentName(context3, (java.lang.Class<?>) com.inmobi.ads.rendering.InMobiAdActivity.class), (java.lang.String) null))).setAlwaysExpand(true).build());
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        android.content.Context context4 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context4, "context");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
        com.inmobi.media.Ka.a(context4, "sdk_version_store").a("sdk_version", "11.2.0", false);
        com.inmobi.media.C2678pl.b = true;
        return kotlin.Unit.INSTANCE;
    }
}

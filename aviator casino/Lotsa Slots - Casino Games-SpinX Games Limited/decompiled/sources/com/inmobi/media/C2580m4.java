package com.inmobi.media;

/* renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2580m4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2634o4 f5327a;
    public final com.inmobi.media.C2606n4 b;

    public C2580m4(com.inmobi.media.C2634o4 configManagerState, com.inmobi.media.C2606n4 configManagerDI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configManagerState, "configManagerState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configManagerDI, "configManagerDI");
        this.f5327a = configManagerState;
        this.b = configManagerDI;
    }

    public final com.inmobi.media.core.config.models.Config a(java.lang.Class clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        java.lang.String a2 = com.inmobi.media.AbstractC2872x4.a(clazz);
        com.inmobi.media.core.config.models.Config config = (com.inmobi.media.core.config.models.Config) this.f5327a.b.get(a2);
        if (config == null) {
            java.lang.String[] strArr = com.inmobi.media.C2820v4.f5501a;
            for (int i = 0; i < 5; i++) {
                java.lang.String str = strArr[i];
                if (this.f5327a.b.get(str) == null) {
                    this.f5327a.b.put(str, com.inmobi.media.AbstractC2688q5.a(str));
                }
            }
            config = (com.inmobi.media.core.config.models.Config) this.f5327a.b.get(a2);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.f5349a, null, null, new com.inmobi.media.C2501j4(this, null), 3, null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2527k4 c2527k4;
        int i;
        int i2;
        if (continuationImpl instanceof com.inmobi.media.C2527k4) {
            c2527k4 = (com.inmobi.media.C2527k4) continuationImpl;
            int i3 = c2527k4.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2527k4.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2527k4.f5286a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2527k4.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.f5327a.f5366a.getAndSet(true)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    c2527k4.c = 1;
                    if (a(c2527k4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String[] strArr = com.inmobi.media.C2820v4.f5501a;
                for (i2 = 0; i2 < 5; i2++) {
                    java.lang.String str = strArr[i2];
                    if (this.f5327a.b.get(str) == null) {
                        this.f5327a.b.put(str, com.inmobi.media.AbstractC2688q5.a(str));
                    }
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.f5349a, null, null, new com.inmobi.media.C2554l4(this, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        c2527k4 = new com.inmobi.media.C2527k4(this, continuationImpl);
        java.lang.Object obj2 = c2527k4.f5286a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2527k4.c;
        if (i != 0) {
        }
        java.lang.String[] strArr2 = com.inmobi.media.C2820v4.f5501a;
        while (i2 < 5) {
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.f5349a, null, null, new com.inmobi.media.C2554l4(this, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004d->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2450h4 c2450h4;
        int i;
        if (continuationImpl instanceof com.inmobi.media.C2450h4) {
            c2450h4 = (com.inmobi.media.C2450h4) continuationImpl;
            int i2 = c2450h4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2450h4.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2450h4.f5232a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2450h4.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2370e4 c2370e4 = (com.inmobi.media.C2370e4) this.b.b.getValue();
                    c2450h4.c = 1;
                    obj = c2370e4.a(c2450h4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                for (com.inmobi.media.core.config.models.Config config : (java.lang.Iterable) obj) {
                    config.getType();
                    this.f5327a.b.put(config.getType(), config);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2450h4 = new com.inmobi.media.C2450h4(this, continuationImpl);
        java.lang.Object obj2 = c2450h4.f5232a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2450h4.c;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}

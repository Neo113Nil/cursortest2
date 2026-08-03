package com.inmobi.media;

/* renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2678pl {
    public static boolean b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2678pl f5396a = new com.inmobi.media.C2678pl();
    public static final com.inmobi.media.C2518jl c = new com.inmobi.media.C2518jl();

    public static boolean a() {
        int i;
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(okhttp3.OkHttpClient.class).getSimpleName();
            i = 0;
        } catch (java.lang.NoClassDefFoundError e) {
            android.util.Log.d("pl", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e);
            i = 1;
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(okio.BufferedSource.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e2) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e2);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e3) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e3);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Dispatchers.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e4) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e4);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.android.gms.ads.identifier.AdvertisingIdClient.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e5) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e5);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.core.content.ContextCompat.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e6) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e6);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.enums.EnumEntries.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e7) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e7);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.browser.customtabs.CustomTabsClient.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e8) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e8);
        }
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.iab.omid.library.inmobi.Omid.class).getSimpleName();
        } catch (java.lang.NoClassDefFoundError e9) {
            i++;
            android.util.Log.d("pl", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e9);
        }
        if (i > 0) {
            android.util.Log.d("pl", "Total no missing dependencies = " + i);
        }
        return i > 0;
    }

    public static boolean b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "sdk_version_store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("sdk_version", com.ironsource.X3.i.W);
        if (a2.f4815a.getString("sdk_version", null) == null) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context, "sdk_version_store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("sdk_version", com.ironsource.X3.i.W);
        return !kotlin.jvm.internal.Intrinsics.areEqual(a3.f4815a.getString("sdk_version", null), "11.2.0");
    }

    public static void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (b(context)) {
                com.inmobi.media.X6.a(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La.a(com.inmobi.media.Ka.a(context, "sdk_version_store"), "db_deletion_failed", true);
                android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                android.content.Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                com.inmobi.media.Xi.a(applicationContext);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.d("pl", "Error in cleaning cache directory", e);
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(8:11|12|(3:14|(2:17|15)|18)|19|(3:21|(1:23)|24)|25|26|27)(2:30|31))(1:32))(6:36|37|(3:39|(1:41)|42)|43|(1:45)(1:48)|(2:47|35))|33))|51|6|7|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r7.b(r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "TAG");
        r7.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "TAG");
        com.inmobi.media.Sb.a((byte) 1, "pl", "SDK encountered unexpected error while stopping internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2544kl c2544kl;
        int i;
        if (continuationImpl instanceof com.inmobi.media.C2544kl) {
            c2544kl = (com.inmobi.media.C2544kl) continuationImpl;
            int i2 = c2544kl.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2544kl.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2544kl.f5299a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2544kl.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2624nk.f.set(false);
                    com.inmobi.media.C2662p6 c2662p6 = com.inmobi.media.C2624nk.g;
                    if (c2662p6 != null) {
                        c2662p6.f.set(false);
                        c2662p6.g.set(true);
                        kotlinx.coroutines.Job job = c2662p6.j;
                        if (job != null) {
                            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        }
                        c2662p6.j = null;
                        c2662p6.i = null;
                    }
                    com.inmobi.media.C2624nk.g = null;
                    com.inmobi.media.C2624nk.j = null;
                    ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(com.inmobi.media.C2624nk.i);
                    com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
                    c2544kl.b = 1;
                    java.lang.Object a2 = com.inmobi.media.J3.a(com.inmobi.media.AbstractC2676pj.f5394a, new com.inmobi.media.C2649oj(null), c2544kl);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = kotlin.Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.C2898y5 c2898y5 = com.inmobi.media.W9.c;
                        if (c2898y5 != null) {
                            java.util.Iterator it = c2898y5.c.iterator();
                            while (it.hasNext()) {
                                ((com.inmobi.media.AbstractC2873x5) it.next()).b();
                            }
                        }
                        com.inmobi.media.Sa sa = com.inmobi.media.W9.d;
                        com.inmobi.media.C2662p6 c2662p62 = sa.b;
                        if (c2662p62 != null) {
                            c2662p62.f.set(false);
                            c2662p62.g.set(true);
                            kotlinx.coroutines.Job job2 = c2662p62.j;
                            if (job2 != null) {
                                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            }
                            c2662p62.j = null;
                            c2662p62.i = null;
                        }
                        sa.b = null;
                        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(sa.d);
                        com.inmobi.media.AbstractC2335ck.a();
                        com.inmobi.media.Hc.f4743a.compareAndSet(true, false);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.inmobi.media.Sh.c.set(false);
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(com.inmobi.media.Sh.f);
                com.inmobi.media.Sh.b = null;
                com.inmobi.media.C2331cg c2331cg = com.inmobi.media.C2331cg.f5141a;
                c2544kl.b = 2;
            }
        }
        c2544kl = new com.inmobi.media.C2544kl(continuationImpl);
        java.lang.Object obj2 = c2544kl.f5299a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2544kl.b;
        if (i != 0) {
        }
        com.inmobi.media.Sh.c.set(false);
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(com.inmobi.media.Sh.f);
        com.inmobi.media.Sh.b = null;
        com.inmobi.media.C2331cg c2331cg2 = com.inmobi.media.C2331cg.f5141a;
        c2544kl.b = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(2:20|21))(1:24))(3:31|32|(2:34|23))|25|(1:27)(1:30)|(2:29|23)|21))|37|6|7|(0)(0)|25|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0040, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "TAG");
        r8.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("pl", "TAG");
        com.inmobi.media.Sb.a((byte) 2, "pl", "SDK encountered unexpected error while starting internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:12:0x002b, B:13:0x00a6, B:20:0x0038, B:21:0x0075, B:24:0x003c, B:25:0x0059, B:30:0x0070, B:32:0x0046), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2571ll c2571ll;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object a2;
        if (continuationImpl instanceof com.inmobi.media.C2571ll) {
            c2571ll = (com.inmobi.media.C2571ll) continuationImpl;
            int i2 = c2571ll.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2571ll.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2571ll.f5321a;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2571ll.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.Qk.a();
                    com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = com.inmobi.media.B1.f4611a;
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.A3.f();
                    c2571ll.c = 1;
                    if (com.inmobi.media.C2624nk.b(c2571ll) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.W9.c();
                        java.util.HashMap hashMap = new java.util.HashMap();
                        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                        com.inmobi.media.C2624nk.b("SessionStarted", hashMap, com.inmobi.media.EnumC2728rk.f5431a);
                        com.inmobi.media.AbstractC2335ck.b();
                        com.inmobi.media.Hc.a();
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.Ao ao = com.inmobi.media.Ao.f4610a;
                    com.inmobi.media.Sh.c.set(true);
                    com.inmobi.media.Sh.b();
                    ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, 100, 151, androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION}, com.inmobi.media.Sh.f);
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    com.inmobi.media.AbstractC2318c4.a("telemetry", com.inmobi.media.Sh.d);
                    com.inmobi.media.C2331cg c2331cg = com.inmobi.media.C2331cg.f5141a;
                    c2571ll.c = 3;
                }
                com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
                c2571ll.c = 2;
                a2 = com.inmobi.media.J3.a(com.inmobi.media.AbstractC2676pj.f5394a, new com.inmobi.media.C2623nj(null), c2571ll);
                if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.inmobi.media.Ao ao2 = com.inmobi.media.Ao.f4610a;
                com.inmobi.media.Sh.c.set(true);
                com.inmobi.media.Sh.b();
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, 100, 151, androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION}, com.inmobi.media.Sh.f);
                com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
                com.inmobi.media.AbstractC2318c4.a("telemetry", com.inmobi.media.Sh.d);
                com.inmobi.media.C2331cg c2331cg2 = com.inmobi.media.C2331cg.f5141a;
                c2571ll.c = 3;
            }
        }
        c2571ll = new com.inmobi.media.C2571ll(this, continuationImpl);
        java.lang.Object obj2 = c2571ll.f5321a;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2571ll.c;
        if (i != 0) {
        }
        com.inmobi.media.C2935zh c2935zh2 = com.inmobi.media.AbstractC2676pj.f5394a;
        c2571ll.c = 2;
        a2 = com.inmobi.media.J3.a(com.inmobi.media.AbstractC2676pj.f5394a, new com.inmobi.media.C2623nj(null), c2571ll);
        if (a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (a2 == coroutine_suspended) {
        }
        com.inmobi.media.Ao ao22 = com.inmobi.media.Ao.f4610a;
        com.inmobi.media.Sh.c.set(true);
        com.inmobi.media.Sh.b();
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, 100, 151, androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION}, com.inmobi.media.Sh.f);
        com.inmobi.media.C2580m4 c2580m422 = com.inmobi.media.AbstractC2318c4.f5134a;
        com.inmobi.media.AbstractC2318c4.a("telemetry", com.inmobi.media.Sh.d);
        com.inmobi.media.C2331cg c2331cg22 = com.inmobi.media.C2331cg.f5141a;
        c2571ll.c = 3;
    }
}

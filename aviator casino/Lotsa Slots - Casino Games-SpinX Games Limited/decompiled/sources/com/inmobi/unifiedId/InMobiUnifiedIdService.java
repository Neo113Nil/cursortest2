package com.inmobi.unifiedId;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", com.adjust.sdk.Constants.PUSH, "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InMobiUnifiedIdService {
    public static final com.inmobi.unifiedId.InMobiUnifiedIdService INSTANCE = new com.inmobi.unifiedId.InMobiUnifiedIdService();

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f5601a = new java.util.concurrent.atomic.AtomicBoolean();
    public static final kotlinx.coroutines.sync.Mutex b = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        org.json.JSONObject b2 = com.inmobi.media.M9.b();
        if (!com.inmobi.media.AbstractC2415fl.b(b2) && b2 != null && com.inmobi.media.AbstractC2415fl.c(b2)) {
            com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
            java.lang.Object a2 = com.inmobi.media.C2282al.a(inMobiUnifiedIdInterface, continuation);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!com.inmobi.media.AbstractC2415fl.b(b2)) {
                com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, b2, null);
            } else {
                if (f5601a.get()) {
                    com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
                    java.lang.Object a3 = com.inmobi.media.C2282al.a(inMobiUnifiedIdInterface, continuation);
                    return a3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : kotlin.Unit.INSTANCE;
                }
                com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (com.inmobi.media.C2373e7.a(null, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object access$resetInternal(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.S9 s9;
        int i;
        java.lang.Object a2;
        if (continuation instanceof com.inmobi.media.S9) {
            s9 = (com.inmobi.media.S9) continuation;
            int i2 = s9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = s9.f4952a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s9.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    f5601a.set(false);
                    s9.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.M9.b(null);
                        com.inmobi.media.M9.a(null);
                        com.inmobi.media.M9.d = false;
                        com.inmobi.media.M9.c = false;
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
                s9.b = 2;
                a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Zk(null), s9);
                if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = kotlin.Unit.INSTANCE;
                }
            }
        }
        s9 = new com.inmobi.media.S9(continuation);
        java.lang.Object obj2 = s9.f4952a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s9.b;
        if (i != 0) {
        }
        com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
        s9.b = 2;
        a2 = com.inmobi.media.J3.a(com.inmobi.media.C2282al.b, new com.inmobi.media.Zk(null), s9);
        if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void fetchUnifiedIds(com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (com.inmobi.media.Xi.d()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.N9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new com.inmobi.ads.exceptions.SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|(1:(6:(1:(1:11)(2:22|23))(1:24)|12|13|14|15|16)(1:25))(3:40|(1:42)|(2:44|45)(2:46|(2:48|49)(4:50|(1:52)(5:58|(1:60)|61|(1:63)|56)|(2:54|55)|56)))|26|27|(6:29|(3:31|32|33)|35|14|15|16)(1:36)|19|20|21))|64|6|(0)(0)|26|27|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0127, code lost:
    
        if (a(r11, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0131, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
    
        r10 = r12;
        r12 = r11;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
    
        if (r12.lock(null, r0) != r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110 A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:27:0x0104, B:29:0x0110, B:36:0x011d), top: B:26:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:27:0x0104, B:29:0x0110, B:36:0x011d), top: B:26:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.inmobi.media.O9 o9;
        int i;
        boolean booleanValue;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        if (continuation instanceof com.inmobi.media.O9) {
            o9 = (com.inmobi.media.O9) continuation;
            int i2 = o9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o9.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = o9.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = o9.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                    com.inmobi.media.C2624nk.b("FetchApiInvoked", hashMap, com.inmobi.media.EnumC2728rk.f5431a);
                    com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                    boolean enabled = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (com.inmobi.media.AbstractC2415fl.c()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.Boolean bool = com.inmobi.media.AbstractC2332ch.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        android.content.Context context = com.inmobi.media.Xi.f5051a;
                        if (context != null) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                            com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a2.f4815a.getBoolean("user_age_restricted", false));
                        }
                        java.lang.Boolean bool2 = com.inmobi.media.AbstractC2332ch.b;
                        if (bool2 != null) {
                            booleanValue = bool2.booleanValue();
                        }
                        mutex = b;
                        o9.f4872a = inMobiUnifiedIdInterface;
                        o9.b = mutex;
                        o9.d = 1;
                    }
                    if (booleanValue) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        com.inmobi.media.AbstractC2415fl.a(inMobiUnifiedIdInterface, null, new java.lang.Error(com.inmobi.unifiedId.InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
                        return kotlin.Unit.INSTANCE;
                    }
                    mutex = b;
                    o9.f4872a = inMobiUnifiedIdInterface;
                    o9.b = mutex;
                    o9.d = 1;
                } else if (i != 1) {
                    if (i == 2) {
                        mutex2 = (kotlinx.coroutines.sync.Mutex) o9.f4872a;
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (kotlinx.coroutines.sync.Mutex) o9.f4872a;
                    }
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable th2 = th;
                    }
                } else {
                    kotlinx.coroutines.sync.Mutex mutex3 = o9.b;
                    com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 = (com.inmobi.unifiedId.InMobiUnifiedIdInterface) o9.f4872a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    inMobiUnifiedIdInterface = inMobiUnifiedIdInterface2;
                }
                com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
                if (com.inmobi.media.C2282al.b.b.get() == null) {
                    o9.f4872a = mutex;
                    o9.b = null;
                    o9.d = 2;
                    if (com.inmobi.media.C2282al.a(inMobiUnifiedIdInterface, o9) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                }
                o9.f4872a = mutex;
                o9.b = null;
                o9.d = 3;
                java.lang.Throwable th22 = th;
                mutex2.unlock(null);
                throw th22;
            }
        }
        o9 = new com.inmobi.media.O9(continuation);
        java.lang.Object obj2 = o9.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o9.d;
        if (i != 0) {
        }
        com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
        if (com.inmobi.media.C2282al.b.b.get() == null) {
        }
        java.lang.Throwable th222 = th;
        mutex2.unlock(null);
        throw th222;
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static final void push(com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        java.util.Objects.toString(inMobiUserDataModel);
        if (com.inmobi.media.Xi.d()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.P9(inMobiUserDataModel, null), 3, null);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new com.inmobi.ads.exceptions.SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void reset() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (com.inmobi.media.Xi.d()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.R9(null), 3, null);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new com.inmobi.ads.exceptions.SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public final java.util.concurrent.atomic.AtomicBoolean isPushCalled() {
        return f5601a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f0, code lost:
    
        if (r8.a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (com.inmobi.media.C2373e7.a(r8, r0) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Q9 q9;
        int i;
        boolean booleanValue;
        com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel2;
        if (continuation instanceof com.inmobi.media.Q9) {
            q9 = (com.inmobi.media.Q9) continuation;
            int i2 = q9.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = q9.f4913a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q9.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                    java.util.Objects.toString(inMobiUserDataModel);
                    com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
                    com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                    boolean enabled = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
                    if (!enabled) {
                        reset();
                    }
                    if (!enabled) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return kotlin.Unit.INSTANCE;
                    }
                    if (com.inmobi.media.AbstractC2415fl.c()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.Boolean bool = com.inmobi.media.AbstractC2332ch.b;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        android.content.Context context = com.inmobi.media.Xi.f5051a;
                        if (context != null) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                            com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a2.f4815a.getBoolean("user_age_restricted", false));
                        }
                        java.lang.Boolean bool2 = com.inmobi.media.AbstractC2332ch.b;
                        if (bool2 != null) {
                            booleanValue = bool2.booleanValue();
                        }
                        com.inmobi.media.C2373e7 c2373e7 = com.inmobi.media.C2373e7.f5172a;
                        if (((inMobiUserDataModel != null && com.inmobi.media.C2373e7.b == null) || (inMobiUserDataModel != null && (inMobiUserDataModel2 = com.inmobi.media.C2373e7.b) != null && kotlin.jvm.internal.Intrinsics.areEqual(inMobiUserDataModel, inMobiUserDataModel2))) && f5601a.get()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                            return kotlin.Unit.INSTANCE;
                        }
                        q9.b = 1;
                    }
                    if (booleanValue) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
                        return kotlin.Unit.INSTANCE;
                    }
                    com.inmobi.media.C2373e7 c2373e72 = com.inmobi.media.C2373e7.f5172a;
                    if (inMobiUserDataModel != null) {
                    }
                    q9.b = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                f5601a.set(true);
                com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
                q9.b = 2;
            }
        }
        q9 = new com.inmobi.media.Q9(continuation);
        java.lang.Object obj2 = q9.f4913a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q9.b;
        if (i != 0) {
        }
        f5601a.set(true);
        com.inmobi.media.C2282al c2282al2 = com.inmobi.media.C2282al.f5108a;
        q9.b = 2;
    }
}

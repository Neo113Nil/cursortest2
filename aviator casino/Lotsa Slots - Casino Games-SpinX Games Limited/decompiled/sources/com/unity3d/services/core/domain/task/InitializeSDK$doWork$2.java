package com.unity3d.services.core.domain.task;

/* compiled from: InitializeSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configResult", "configuration", "$this$withContext", "configResult", "configuration", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
/* loaded from: classes6.dex */
final class InitializeSDK$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(com.unity3d.services.core.domain.task.InitializeSDK initializeSDK, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 initializeSDK$doWork$2 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cf A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0344 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0313 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c2 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0252 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0260 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5 A[Catch: all -> 0x035b, CancellationException -> 0x0388, TryCatch #2 {CancellationException -> 0x0388, all -> 0x035b, blocks: (B:7:0x0015, B:8:0x0345, B:18:0x0026, B:19:0x0326, B:23:0x0031, B:24:0x030d, B:26:0x0313, B:30:0x0044, B:31:0x02d7, B:32:0x02e7, B:37:0x004f, B:40:0x02bc, B:42:0x02c2, B:46:0x005f, B:47:0x024c, B:49:0x0252, B:50:0x025f, B:53:0x0077, B:55:0x022d, B:57:0x0233, B:60:0x0260, B:62:0x026b, B:64:0x0275, B:66:0x027b, B:67:0x0298, B:70:0x02e1, B:72:0x034f, B:73:0x035a, B:75:0x0093, B:76:0x020a, B:80:0x00a4, B:82:0x01ee, B:84:0x01f4, B:88:0x00b4, B:89:0x01bb, B:91:0x01c1, B:92:0x01ce, B:95:0x00ca, B:97:0x019f, B:99:0x01a5, B:102:0x01cf, B:107:0x00e0, B:108:0x015c, B:110:0x0162, B:111:0x0175, B:114:0x0181, B:118:0x00f2, B:119:0x013d, B:124:0x0100, B:126:0x011d), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK;
        java.lang.Object handleInitializationException;
        com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage;
        java.lang.Object obj2;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        java.lang.Throwable m10801exceptionOrNullimpl;
        com.unity3d.services.core.configuration.Configuration configuration;
        com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset;
        java.lang.Object obj3;
        java.lang.Object obj4;
        com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK2;
        java.lang.Object obj5;
        com.unity3d.services.core.configuration.Configuration configuration2;
        java.lang.Object m10363executeErrorStateBWLJW6A;
        java.lang.Throwable m10801exceptionOrNullimpl2;
        java.lang.Object handleInitializationException2;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.String webViewData;
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb;
        java.lang.Object obj8;
        java.lang.Object m10363executeErrorStateBWLJW6A2;
        java.lang.Throwable m10801exceptionOrNullimpl3;
        java.lang.Object obj9;
        java.lang.Object handleInitializationException3;
        com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate;
        java.lang.Object obj10;
        java.lang.Object obj11;
        com.unity3d.services.core.domain.task.InitializeSDK initializeSDK3;
        java.lang.Object handleInitializationException4;
        com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete;
        java.lang.Object obj12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                initializeSDK = this.this$0;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                com.unity3d.services.core.properties.SdkProperties.setInitializationTime(com.unity3d.services.core.device.Device.getElapsedRealtime());
                com.unity3d.services.core.properties.SdkProperties.setInitializationTimeSinceEpoch(java.lang.System.currentTimeMillis());
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didInitStart();
                if (com.unity3d.services.core.properties.ClientProperties.getGameId() == null) {
                    com.unity3d.services.core.domain.task.InitializationException initializationException = new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.InvalidGameId, new java.lang.Exception("gameId is null."), new com.unity3d.services.core.configuration.Configuration());
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK;
                    this.label = 1;
                    handleInitializationException = initializeSDK.handleInitializationException(initializationException, this);
                    if (handleInitializationException == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params(null, 1, null);
                this.L$0 = coroutineScope;
                this.L$1 = initializeSDK;
                this.label = 2;
                obj2 = configFileFromLocalStorage.mo10359invokegIAlus(params, this);
                if (obj2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj2);
                if (m10801exceptionOrNullimpl != null) {
                    com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + m10801exceptionOrNullimpl.getMessage());
                }
                com.unity3d.services.core.configuration.Configuration configuration3 = new com.unity3d.services.core.configuration.Configuration();
                if (kotlin.Result.m10804isFailureimpl(obj2)) {
                    obj2 = configuration3;
                }
                configuration = (com.unity3d.services.core.configuration.Configuration) obj2;
                initializeStateReset = initializeSDK.initializeStateReset;
                com.unity3d.services.core.domain.task.InitializeStateReset.Params params2 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(configuration);
                this.L$0 = coroutineScope2;
                this.L$1 = initializeSDK;
                this.L$2 = configuration;
                this.label = 3;
                obj3 = initializeStateReset.mo10359invokegIAlus(params2, this);
                if (obj3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                com.unity3d.services.core.configuration.Configuration configuration4 = configuration;
                obj4 = obj3;
                if (!kotlin.Result.m10804isFailureimpl(obj4)) {
                    initializeStateConfig = initializeSDK.initializeStateConfig;
                    com.unity3d.services.core.domain.task.InitializeStateConfig.Params params3 = new com.unity3d.services.core.domain.task.InitializeStateConfig.Params(configuration4);
                    this.L$0 = coroutineScope2;
                    this.L$1 = initializeSDK;
                    this.L$2 = configuration4;
                    this.label = 5;
                    java.lang.Object obj13 = initializeStateConfig.mo10359invokegIAlus(params3, this);
                    if (obj13 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope2;
                    initializeSDK2 = initializeSDK;
                    obj5 = obj13;
                    configuration2 = configuration4;
                    if (kotlin.Result.m10804isFailureimpl(obj5)) {
                        com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                        this.L$0 = coroutineScope3;
                        this.L$1 = initializeSDK2;
                        this.L$2 = obj5;
                        this.L$3 = configuration2;
                        this.label = 6;
                        handleInitializationException2 = initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this);
                        if (handleInitializationException2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                    kotlin.ResultKt.throwOnFailure(obj5);
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params4 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) obj5);
                    this.L$0 = coroutineScope3;
                    this.L$1 = initializeSDK2;
                    this.L$2 = obj5;
                    this.L$3 = configuration2;
                    this.label = 7;
                    obj6 = initializeStateLoadCache.mo10359invokegIAlus(params4, this);
                    if (obj6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.services.core.configuration.Configuration configuration5 = configuration2;
                    obj7 = obj6;
                    if (!kotlin.Result.m10804isFailureimpl(obj7)) {
                        com.unity3d.services.core.configuration.ErrorState errorState = com.unity3d.services.core.configuration.ErrorState.LoadCache;
                        java.lang.Throwable m10801exceptionOrNullimpl4 = kotlin.Result.m10801exceptionOrNullimpl(obj7);
                        this.L$0 = obj7;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        m10363executeErrorStateBWLJW6A2 = initializeSDK2.m10363executeErrorStateBWLJW6A(errorState, m10801exceptionOrNullimpl4, configuration5, this);
                        if (m10363executeErrorStateBWLJW6A2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        m10801exceptionOrNullimpl3 = kotlin.Result.m10801exceptionOrNullimpl(obj7);
                        if (m10801exceptionOrNullimpl3 != null) {
                            throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.LoadCache.toString());
                        }
                        throw m10801exceptionOrNullimpl3;
                    }
                    kotlin.ResultKt.throwOnFailure(obj7);
                    com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) obj7;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (configuration5.getExperiments().isWebViewAsyncDownloadEnabled() && loadCacheResult.getWebViewData() != null) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, new kotlinx.coroutines.CoroutineName("LaunchLoadWeb"), null, new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1(initializeSDK2, obj5, null), 2, null);
                            webViewData = loadCacheResult.getWebViewData();
                        } else {
                            initializeStateLoadWeb = initializeSDK2.initializeStateLoadWeb;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params5 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params((com.unity3d.services.core.configuration.Configuration) obj5);
                            this.L$0 = initializeSDK2;
                            this.L$1 = obj5;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 9;
                            obj8 = initializeStateLoadWeb.mo10359invokegIAlus(params5, this);
                            if (obj8 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj9 = obj8;
                            if (kotlin.Result.m10804isFailureimpl(obj9)) {
                                com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow2 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj9);
                                this.L$0 = initializeSDK2;
                                this.L$1 = obj5;
                                this.L$2 = obj9;
                                this.label = 10;
                                handleInitializationException3 = initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this);
                                if (handleInitializationException3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            kotlin.ResultKt.throwOnFailure(obj9);
                            webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                        }
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new java.lang.IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    initializeStateCreate = initializeSDK2.initializeStateCreate;
                    kotlin.ResultKt.throwOnFailure(obj5);
                    com.unity3d.services.core.domain.task.InitializeStateCreate.Params params6 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) obj5, webViewData);
                    this.L$0 = initializeSDK2;
                    this.L$1 = obj5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    obj10 = initializeStateCreate.mo10359invokegIAlus(params6, this);
                    if (obj10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj11 = obj5;
                    initializeSDK3 = initializeSDK2;
                    if (kotlin.Result.m10804isFailureimpl(obj10)) {
                        com.unity3d.services.core.domain.task.InitializationException initializationExceptionOrThrow3 = com.unity3d.services.core.domain.ResultExtensionsKt.getInitializationExceptionOrThrow(obj10);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj11;
                        this.label = 12;
                        handleInitializationException4 = initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this);
                        if (handleInitializationException4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    initializeStateComplete = initializeSDK3.initializeStateComplete;
                    kotlin.ResultKt.throwOnFailure(obj11);
                    com.unity3d.services.core.domain.task.InitializeStateComplete.Params params7 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj11);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    obj12 = initializeStateComplete.mo10359invokegIAlus(params7, this);
                    if (obj12 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.ResultKt.throwOnFailure(obj12);
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                    if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                        java.lang.Throwable m10801exceptionOrNullimpl5 = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                        if (m10801exceptionOrNullimpl5 != null) {
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl5));
                        }
                    } else {
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
                    }
                    return kotlin.Result.m10797boximpl(m10798constructorimpl);
                }
                com.unity3d.services.core.configuration.ErrorState errorState2 = com.unity3d.services.core.configuration.ErrorState.ResetWebApp;
                java.lang.Throwable m10801exceptionOrNullimpl6 = kotlin.Result.m10801exceptionOrNullimpl(obj4);
                this.L$0 = obj4;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                m10363executeErrorStateBWLJW6A = initializeSDK.m10363executeErrorStateBWLJW6A(errorState2, m10801exceptionOrNullimpl6, configuration4, this);
                if (m10363executeErrorStateBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(obj4);
                if (m10801exceptionOrNullimpl2 != null) {
                    throw new java.lang.Exception(com.unity3d.services.core.configuration.ErrorState.ResetWebApp.toString());
                }
                throw m10801exceptionOrNullimpl2;
            case 1:
                initializeSDK = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params8 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params(null, 1, null);
                this.L$0 = coroutineScope;
                this.L$1 = initializeSDK;
                this.label = 2;
                obj2 = configFileFromLocalStorage.mo10359invokegIAlus(params8, this);
                if (obj2 != coroutine_suspended) {
                }
                break;
            case 2:
                initializeSDK = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = ((kotlin.Result) obj).getValue();
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj2);
                if (m10801exceptionOrNullimpl != null) {
                }
                com.unity3d.services.core.configuration.Configuration configuration32 = new com.unity3d.services.core.configuration.Configuration();
                if (kotlin.Result.m10804isFailureimpl(obj2)) {
                }
                configuration = (com.unity3d.services.core.configuration.Configuration) obj2;
                initializeStateReset = initializeSDK.initializeStateReset;
                com.unity3d.services.core.domain.task.InitializeStateReset.Params params22 = new com.unity3d.services.core.domain.task.InitializeStateReset.Params(configuration);
                this.L$0 = coroutineScope2;
                this.L$1 = initializeSDK;
                this.L$2 = configuration;
                this.label = 3;
                obj3 = initializeStateReset.mo10359invokegIAlus(params22, this);
                if (obj3 == coroutine_suspended) {
                }
                com.unity3d.services.core.configuration.Configuration configuration42 = configuration;
                obj4 = obj3;
                if (!kotlin.Result.m10804isFailureimpl(obj4)) {
                }
                break;
            case 3:
                configuration = (com.unity3d.services.core.configuration.Configuration) this.L$2;
                initializeSDK = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj3 = ((kotlin.Result) obj).getValue();
                com.unity3d.services.core.configuration.Configuration configuration422 = configuration;
                obj4 = obj3;
                if (!kotlin.Result.m10804isFailureimpl(obj4)) {
                }
                break;
            case 4:
                obj4 = this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                ((kotlin.Result) obj).getValue();
                m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(obj4);
                if (m10801exceptionOrNullimpl2 != null) {
                }
                break;
            case 5:
                configuration2 = (com.unity3d.services.core.configuration.Configuration) this.L$2;
                com.unity3d.services.core.domain.task.InitializeSDK initializeSDK4 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                kotlinx.coroutines.CoroutineScope coroutineScope4 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope3 = coroutineScope4;
                initializeSDK2 = initializeSDK4;
                obj5 = ((kotlin.Result) obj).getValue();
                if (kotlin.Result.m10804isFailureimpl(obj5)) {
                }
                initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                kotlin.ResultKt.throwOnFailure(obj5);
                com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params42 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) obj5);
                this.L$0 = coroutineScope3;
                this.L$1 = initializeSDK2;
                this.L$2 = obj5;
                this.L$3 = configuration2;
                this.label = 7;
                obj6 = initializeStateLoadCache.mo10359invokegIAlus(params42, this);
                if (obj6 == coroutine_suspended) {
                }
                com.unity3d.services.core.configuration.Configuration configuration52 = configuration2;
                obj7 = obj6;
                if (!kotlin.Result.m10804isFailureimpl(obj7)) {
                }
                break;
            case 6:
                configuration2 = (com.unity3d.services.core.configuration.Configuration) this.L$3;
                obj5 = this.L$2;
                initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                kotlin.ResultKt.throwOnFailure(obj5);
                com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params422 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params((com.unity3d.services.core.configuration.Configuration) obj5);
                this.L$0 = coroutineScope3;
                this.L$1 = initializeSDK2;
                this.L$2 = obj5;
                this.L$3 = configuration2;
                this.label = 7;
                obj6 = initializeStateLoadCache.mo10359invokegIAlus(params422, this);
                if (obj6 == coroutine_suspended) {
                }
                com.unity3d.services.core.configuration.Configuration configuration522 = configuration2;
                obj7 = obj6;
                if (!kotlin.Result.m10804isFailureimpl(obj7)) {
                }
                break;
            case 7:
                configuration2 = (com.unity3d.services.core.configuration.Configuration) this.L$3;
                obj5 = this.L$2;
                initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$1;
                coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj6 = ((kotlin.Result) obj).getValue();
                com.unity3d.services.core.configuration.Configuration configuration5222 = configuration2;
                obj7 = obj6;
                if (!kotlin.Result.m10804isFailureimpl(obj7)) {
                }
                break;
            case 8:
                obj7 = this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                ((kotlin.Result) obj).getValue();
                m10801exceptionOrNullimpl3 = kotlin.Result.m10801exceptionOrNullimpl(obj7);
                if (m10801exceptionOrNullimpl3 != null) {
                }
                break;
            case 9:
                java.lang.Object obj14 = this.L$1;
                com.unity3d.services.core.domain.task.InitializeSDK initializeSDK5 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj8 = ((kotlin.Result) obj).getValue();
                initializeSDK2 = initializeSDK5;
                obj5 = obj14;
                obj9 = obj8;
                if (kotlin.Result.m10804isFailureimpl(obj9)) {
                }
                kotlin.ResultKt.throwOnFailure(obj9);
                webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                initializeStateCreate = initializeSDK2.initializeStateCreate;
                kotlin.ResultKt.throwOnFailure(obj5);
                com.unity3d.services.core.domain.task.InitializeStateCreate.Params params62 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) obj5, webViewData);
                this.L$0 = initializeSDK2;
                this.L$1 = obj5;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 11;
                obj10 = initializeStateCreate.mo10359invokegIAlus(params62, this);
                if (obj10 == coroutine_suspended) {
                }
                break;
            case 10:
                obj9 = this.L$2;
                obj5 = this.L$1;
                initializeSDK2 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.ResultKt.throwOnFailure(obj9);
                webViewData = ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                initializeStateCreate = initializeSDK2.initializeStateCreate;
                kotlin.ResultKt.throwOnFailure(obj5);
                com.unity3d.services.core.domain.task.InitializeStateCreate.Params params622 = new com.unity3d.services.core.domain.task.InitializeStateCreate.Params((com.unity3d.services.core.configuration.Configuration) obj5, webViewData);
                this.L$0 = initializeSDK2;
                this.L$1 = obj5;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 11;
                obj10 = initializeStateCreate.mo10359invokegIAlus(params622, this);
                if (obj10 == coroutine_suspended) {
                }
                break;
            case 11:
                obj11 = this.L$1;
                initializeSDK3 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj10 = ((kotlin.Result) obj).getValue();
                if (kotlin.Result.m10804isFailureimpl(obj10)) {
                }
                initializeStateComplete = initializeSDK3.initializeStateComplete;
                kotlin.ResultKt.throwOnFailure(obj11);
                com.unity3d.services.core.domain.task.InitializeStateComplete.Params params72 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj11);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 13;
                obj12 = initializeStateComplete.mo10359invokegIAlus(params72, this);
                if (obj12 == coroutine_suspended) {
                }
                kotlin.ResultKt.throwOnFailure(obj12);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                }
                return kotlin.Result.m10797boximpl(m10798constructorimpl);
            case 12:
                obj11 = this.L$1;
                initializeSDK3 = (com.unity3d.services.core.domain.task.InitializeSDK) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                initializeStateComplete = initializeSDK3.initializeStateComplete;
                kotlin.ResultKt.throwOnFailure(obj11);
                com.unity3d.services.core.domain.task.InitializeStateComplete.Params params722 = new com.unity3d.services.core.domain.task.InitializeStateComplete.Params((com.unity3d.services.core.configuration.Configuration) obj11);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 13;
                obj12 = initializeStateComplete.mo10359invokegIAlus(params722, this);
                if (obj12 == coroutine_suspended) {
                }
                kotlin.ResultKt.throwOnFailure(obj12);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                }
                return kotlin.Result.m10797boximpl(m10798constructorimpl);
            case 13:
                kotlin.ResultKt.throwOnFailure(obj);
                obj12 = ((kotlin.Result) obj).getValue();
                kotlin.ResultKt.throwOnFailure(obj12);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
                if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                }
                return kotlin.Result.m10797boximpl(m10798constructorimpl);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 »\u00022\u00020\u0001:\u0004»\u0002¼\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\u0018¢\u0006\u0004\b$\u0010\"J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J-\u00100\u001a\u00020\u00182\u0006\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0018¢\u0006\u0004\b4\u0010\"J\u0017\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00182\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010S\u001a\u0002058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u0002058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\"\u0010Y\u001a\u00020X8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010v\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bv\u0010L\u001a\u0004\bw\u0010N\"\u0004\bx\u0010PR\"\u0010z\u001a\u00020y8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R2\u0010\u0088\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010%0\u0087\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0095\u0001\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010L\u001a\u0005\b\u0096\u0001\u0010N\"\u0005\b\u0097\u0001\u0010PR\u0016\u00102\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010¢\u0001\u001a\u00030¡\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010(\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b(\u0010¦\u0001R*\u0010¨\u0001\u001a\u00030§\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R,\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u0004\u0018\u0001058AX\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R#\u0010½\u0001\u001a\u0005\u0018\u00010¸\u00018AX\u0081\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010\u0098\u0001\u001a\u00030¾\u00018CX\u0083\u0084\u0002¢\u0006\u0007\n\u0005\b2\u0010º\u0001R \u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010¿\u00018CX\u0083\u0084\u0002¢\u0006\b\n\u0006\bÁ\u0001\u0010º\u0001R\u0019\u0010Ä\u0001\u001a\u00030Ã\u00018CX\u0083\u0084\u0002¢\u0006\b\n\u0006\bÄ\u0001\u0010º\u0001R,\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R,\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Ô\u0001\u001a\u00030Ó\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010Û\u0001\u001a\u00030Ú\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R*\u0010â\u0001\u001a\u00030á\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R*\u0010é\u0001\u001a\u00030è\u00018\u0001@\u0001X\u0081.¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R,\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u0017\u0010Á\u0001\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R&\u0010ø\u0001\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bø\u0001\u0010L\u001a\u0005\bù\u0001\u0010N\"\u0005\bú\u0001\u0010PR&\u0010û\u0001\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\bû\u0001\u0010L\u001a\u0005\bü\u0001\u0010N\"\u0005\bý\u0001\u0010PR*\u0010ÿ\u0001\u001a\u00030þ\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R&\u0010\u0085\u0002\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0085\u0002\u0010L\u001a\u0005\b\u0086\u0002\u0010N\"\u0005\b\u0087\u0002\u0010PR*\u0010\u0088\u0002\u001a\u00030¾\u00018\u0001@\u0001X\u0081.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R*\u0010\u008f\u0002\u001a\u00030\u008e\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u0096\u0002\u001a\u00030\u0095\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R*\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R*\u0010¤\u0002\u001a\u00030£\u00028\u0001@\u0001X\u0081.¢\u0006\u0018\n\u0006\b¤\u0002\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R*\u0010«\u0002\u001a\u00030ª\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b«\u0002\u0010¬\u0002\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R*\u0010²\u0002\u001a\u00030±\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002R&\u0010¸\u0002\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b¸\u0002\u0010L\u001a\u0005\b¹\u0002\u0010N\"\u0005\bº\u0002\u0010P"}, d2 = {"Lcom/datadog/android/core/internal/CoreFeature;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "appStartTimeProvider", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "executorServiceFactory", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "scheduledExecutorServiceFactory", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/time/AppStartTimeProvider;Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "buildFilePersistenceConfig", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "", "executorContext", "Ljava/util/concurrent/ExecutorService;", "createExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lokhttp3/Call$Factory;", "createOkHttpCallFactory", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/Call$Factory;", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "deleteLastFatalAnrSent$dd_sdk_android_core_release", "()V", "deleteLastViewEvent$dd_sdk_android_core_release", "drainAndShutdownExecutors", "Landroid/content/Context;", "p0", "Landroid/content/pm/PackageInfo;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "appContext", "sdkInstanceId", "Lcom/datadog/android/core/configuration/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/privacy/TrackingConsent;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "initialize", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/core/configuration/Configuration;Lcom/datadog/android/privacy/TrackingConsent;)V", "getHighSpeedVideoFpsRangesFor", "(Landroid/content/Context;)Ljava/lang/String;", "stop", "", "anrTimestamp", "writeLastFatalAnrSent$dd_sdk_android_core_release", "(J)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "writeLastViewEvent$dd_sdk_android_core_release", "([B)V", "Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "accountInfoProvider", "Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "getAccountInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "setAccountInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;)V", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "androidInfoProvider", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "getAndroidInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "setAndroidInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/AndroidInfoProvider;)V", "appBuildId", "Ljava/lang/String;", "getAppBuildId$dd_sdk_android_core_release", "()Ljava/lang/String;", "setAppBuildId$dd_sdk_android_core_release", "(Ljava/lang/String;)V", "getAppStartTimeNs$dd_sdk_android_core_release", "()J", "appStartTimeNs", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "getAppUptimeNs$dd_sdk_android_core_release", "appUptimeNs", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backpressureStrategy", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "getBackpressureStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BackPressureStrategy;", "setBackpressureStrategy$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "batchProcessingLevel", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "getBatchProcessingLevel$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "setBatchProcessingLevel$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BatchProcessingLevel;)V", "Lcom/datadog/android/core/configuration/BatchSize;", "batchSize", "Lcom/datadog/android/core/configuration/BatchSize;", "getBatchSize$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BatchSize;", "setBatchSize$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BatchSize;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/core/internal/CoreFeature$OkHttpCallFactory;", "callFactory", "Lcom/datadog/android/core/internal/CoreFeature$OkHttpCallFactory;", "getCallFactory$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/CoreFeature$OkHttpCallFactory;", "setCallFactory$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/CoreFeature$OkHttpCallFactory;)V", "clientToken", "getClientToken$dd_sdk_android_core_release", "setClientToken$dd_sdk_android_core_release", "Ljava/util/concurrent/ThreadPoolExecutor;", "contextExecutorService", "Ljava/util/concurrent/ThreadPoolExecutor;", "getContextExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setContextExecutorService$dd_sdk_android_core_release", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "setContextProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/ContextProvider;)V", "Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/lang/ref/WeakReference;", "getContextRef$dd_sdk_android_core_release", "()Ljava/lang/ref/WeakReference;", "setContextRef$dd_sdk_android_core_release", "(Ljava/lang/ref/WeakReference;)V", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "customUploadSchedulerStrategy", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "getCustomUploadSchedulerStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "setCustomUploadSchedulerStrategy$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;)V", "envName", "getEnvName$dd_sdk_android_core_release", "setEnvName$dd_sdk_android_core_release", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "setFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/api/InternalLogger;", "", "isMainProcess", "Z", "isMainProcess$dd_sdk_android_core_release", "()Z", "setMainProcess$dd_sdk_android_core_release", "(Z)V", "Lcom/lyft/kronos/KronosClock;", "kronosClock", "Lcom/lyft/kronos/KronosClock;", "getKronosClock$dd_sdk_android_core_release", "()Lcom/lyft/kronos/KronosClock;", "setKronosClock$dd_sdk_android_core_release", "(Lcom/lyft/kronos/KronosClock;)V", "getLastFatalAnrSent$dd_sdk_android_core_release", "()Ljava/lang/Long;", "lastFatalAnrSent", "Lcom/google/gson/JsonObject;", "lastViewEvent$delegate", "Lkotlin/Lazy;", "getLastViewEvent$dd_sdk_android_core_release", "()Lcom/google/gson/JsonObject;", "lastViewEvent", "Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/storage/RawBatchEvent;", "getInputSizeshNQ4ISI", "getOutputFormats", "Lokhttp3/OkHttpClient;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/security/Encryption;", "localDataEncryption", "Lcom/datadog/android/security/Encryption;", "getLocalDataEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "setLocalDataEncryption$dd_sdk_android_core_release", "(Lcom/datadog/android/security/Encryption;)V", "", "metricTelemetrySampleRateBypass", "Ljava/lang/Float;", "getMetricTelemetrySampleRateBypass$dd_sdk_android_core_release", "()Ljava/lang/Float;", "setMetricTelemetrySampleRateBypass$dd_sdk_android_core_release", "(Ljava/lang/Float;)V", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "ndkCrashHandler", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "getNdkCrashHandler$dd_sdk_android_core_release", "()Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "setNdkCrashHandler$dd_sdk_android_core_release", "(Lcom/datadog/android/ndk/internal/NdkCrashHandler;)V", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "getNetworkInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "setNetworkInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;)V", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "packageVersionProvider", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "getPackageVersionProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/AppVersionProvider;", "setPackageVersionProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/AppVersionProvider;)V", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "persistenceExecutorService", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "getPersistenceExecutorService$dd_sdk_android_core_release", "()Lcom/datadog/android/core/thread/FlushableExecutorService;", "setPersistenceExecutorService$dd_sdk_android_core_release", "(Lcom/datadog/android/core/thread/FlushableExecutorService;)V", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "persistenceStrategyFactory", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "getPersistenceStrategyFactory$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "setPersistenceStrategyFactory$dd_sdk_android_core_release", "(Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;)V", "getInputFormats", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "sdkVersion", "getSdkVersion$dd_sdk_android_core_release", "setSdkVersion$dd_sdk_android_core_release", "serviceName", "getServiceName$dd_sdk_android_core_release", "setServiceName$dd_sdk_android_core_release", "Lcom/datadog/android/DatadogSite;", com.datadog.trace.api.config.GeneralConfig.SITE, "Lcom/datadog/android/DatadogSite;", "getSite$dd_sdk_android_core_release", "()Lcom/datadog/android/DatadogSite;", "setSite$dd_sdk_android_core_release", "(Lcom/datadog/android/DatadogSite;)V", "sourceName", "getSourceName$dd_sdk_android_core_release", "setSourceName$dd_sdk_android_core_release", "storageDir", "Ljava/io/File;", "getStorageDir$dd_sdk_android_core_release", "()Ljava/io/File;", "setStorageDir$dd_sdk_android_core_release", "(Ljava/io/File;)V", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "getSystemInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "setSystemInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/SystemInfoProvider;)V", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/internal/time/TimeProvider;", "setTimeProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/internal/time/TimeProvider;)V", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "trackingConsentProvider", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "getTrackingConsentProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "setTrackingConsentProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;)V", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "uploadExecutorService", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getUploadExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "setUploadExecutorService$dd_sdk_android_core_release", "(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V", "Lcom/datadog/android/core/configuration/UploadFrequency;", "uploadFrequency", "Lcom/datadog/android/core/configuration/UploadFrequency;", "getUploadFrequency$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadFrequency;", "setUploadFrequency$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/UploadFrequency;)V", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "userInfoProvider", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "getUserInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "setUserInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;)V", "variant", "getVariant$dd_sdk_android_core_release", "setVariant$dd_sdk_android_core_release", "Companion", "OkHttpCallFactory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreFeature {
    public static final java.lang.String BUILD_ID_FILE_NAME = "datadog.buildId";
    public static final java.lang.String BUILD_ID_IS_MISSING_INFO_MESSAGE = "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
    public static final java.lang.String BUILD_ID_READ_ERROR = "Failed to read Build ID information, de-obfuscation may not work properly.";
    public static final java.lang.String DATADOG_STORAGE_DIR_NAME = "datadog-%s";
    public static final java.lang.String DEFAULT_APP_VERSION = "?";
    public static final java.lang.String DEFAULT_SDK_VERSION = "3.8.0";
    public static final java.lang.String DEFAULT_SOURCE_NAME = "android";
    public static final long DRAIN_WAIT_SECONDS = 10;
    public static final java.lang.String LAST_FATAL_ANR_SENT_FILE_NAME = "last_fatal_anr_sent";
    public static final java.lang.String LAST_RUM_VIEW_EVENT_FILE_NAME = "last_view_event";
    public static final long NTP_CACHE_EXPIRATION_MINUTES = 30;
    public static final long NTP_DELAY_BETWEEN_SYNCS_MINUTES = 5;
    public static final java.lang.String SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE = "Datadog SDK was initialized in a secondary process: although data will still be captured, nothing will be uploaded from this process. Make sure to also initialize the SDK from the main process of your application.";
    private static boolean disableKronosBackgroundSync;
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;
    private com.datadog.android.core.internal.account.MutableAccountInfoProvider accountInfoProvider;
    private com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider;
    private volatile java.lang.String appBuildId;
    public com.datadog.android.core.configuration.BackPressureStrategy backpressureStrategy;
    private com.datadog.android.core.configuration.BatchProcessingLevel batchProcessingLevel;
    private com.datadog.android.core.configuration.BatchSize batchSize;
    public com.datadog.android.core.internal.CoreFeature.OkHttpCallFactory callFactory;
    private volatile java.lang.String clientToken;
    public java.util.concurrent.ThreadPoolExecutor contextExecutorService;
    private com.datadog.android.core.internal.ContextProvider contextProvider;
    private java.lang.ref.WeakReference<android.content.Context> contextRef;
    private com.datadog.android.core.configuration.UploadSchedulerStrategy customUploadSchedulerStrategy;
    private volatile java.lang.String envName;
    private com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.core.internal.time.AppStartTimeProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.thread.FlushableExecutorService.Factory getHighSpeedVideoFpsRangesFor;
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;
    private final java.util.concurrent.atomic.AtomicBoolean initialized;
    private volatile boolean isMainProcess;
    private com.lyft.kronos.KronosClock kronosClock;

    /* renamed from: lastViewEvent$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy lastViewEvent;
    private com.datadog.android.security.Encryption localDataEncryption;
    private java.lang.Float metricTelemetrySampleRateBypass;
    private com.datadog.android.ndk.internal.NdkCrashHandler ndkCrashHandler;
    private com.datadog.android.core.internal.net.info.NetworkInfoProvider networkInfoProvider;
    private com.datadog.android.core.internal.system.AppVersionProvider packageVersionProvider;
    public com.datadog.android.core.thread.FlushableExecutorService persistenceExecutorService;
    private com.datadog.android.core.persistence.PersistenceStrategy.Factory persistenceStrategyFactory;
    private volatile java.lang.String sdkVersion;
    private volatile java.lang.String serviceName;
    private volatile com.datadog.android.DatadogSite site;
    private volatile java.lang.String sourceName;
    public java.io.File storageDir;
    private com.datadog.android.core.internal.system.SystemInfoProvider systemInfoProvider;
    private com.datadog.android.internal.time.TimeProvider timeProvider;
    private com.datadog.android.core.internal.privacy.ConsentProvider trackingConsentProvider;
    public java.util.concurrent.ScheduledThreadPoolExecutor uploadExecutorService;
    private com.datadog.android.core.configuration.UploadFrequency uploadFrequency;
    private com.datadog.android.core.internal.user.MutableUserInfoProvider userInfoProvider;
    private volatile java.lang.String variant;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.CoreFeature.Companion INSTANCE = new com.datadog.android.core.internal.CoreFeature.Companion(null);
    private static final com.datadog.android.core.thread.FlushableExecutorService.Factory DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY = new com.datadog.android.core.thread.FlushableExecutorService.Factory() { // from class: com.datadog.android.core.internal.CoreFeature$$ExternalSyntheticLambda1
        @Override // com.datadog.android.core.thread.FlushableExecutorService.Factory
        public final com.datadog.android.core.thread.FlushableExecutorService create(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, com.datadog.android.internal.time.TimeProvider timeProvider) {
            return com.datadog.android.core.internal.CoreFeature.m9995$r8$lambda$VH4LIxpoIyShl7KOjF7lLE2eho(internalLogger, str, backPressureStrategy, timeProvider);
        }
    };
    private static final com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY = new com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory() { // from class: com.datadog.android.core.internal.CoreFeature$$ExternalSyntheticLambda2
        @Override // com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory
        public final java.util.concurrent.ScheduledExecutorService create(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy) {
            return com.datadog.android.core.internal.CoreFeature.m9994$r8$lambda$SRgSZYOkXmGZDXPxtZRJdmzGy4(internalLogger, str, backPressureStrategy);
        }
    };
    private static final long NETWORK_TIMEOUT_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(45);
    private static final okhttp3.CipherSuite[] RESTRICTED_CIPHER_SUITES = {okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384};

    public CoreFeature(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.time.AppStartTimeProvider appStartTimeProvider, com.datadog.android.core.thread.FlushableExecutorService.Factory factory, com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory scheduledExecutorServiceFactory, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStartTimeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledExecutorServiceFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighSpeedVideoFpsRanges = appStartTimeProvider;
        this.getHighSpeedVideoFpsRangesFor = factory;
        this.getInputSizeshNQ4ISI = scheduledExecutorServiceFactory;
        this.getHighResolutionOutputSizeshNQ4ISI = buildSdkVersionProvider;
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: com.datadog.android.core.internal.CoreFeature$lazySharedOkHttpClient$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final okhttp3.OkHttpClient invoke() {
                okhttp3.ConnectionSpec.Builder tlsVersions = new okhttp3.ConnectionSpec.Builder(okhttp3.ConnectionSpec.RESTRICTED_TLS).tlsVersions(okhttp3.TlsVersion.TLS_1_2, okhttp3.TlsVersion.TLS_1_3);
                okhttp3.CipherSuite[] rESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release = com.datadog.android.core.internal.CoreFeature.INSTANCE.getRESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release();
                return new okhttp3.OkHttpClient.Builder().callTimeout(com.datadog.android.core.internal.CoreFeature.INSTANCE.getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release(), java.util.concurrent.TimeUnit.MILLISECONDS).writeTimeout(com.datadog.android.core.internal.CoreFeature.INSTANCE.getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release(), java.util.concurrent.TimeUnit.MILLISECONDS).protocols(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new okhttp3.Protocol[]{okhttp3.Protocol.HTTP_2, okhttp3.Protocol.HTTP_1_1})).connectionSpecs(kotlin.collections.CollectionsKt.listOf(tlsVersions.cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(rESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release, rESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release.length)).build())).dns(new com.datadog.android.core.internal.data.upload.RotatingDnsResolver(null, 0L, com.datadog.android.core.internal.CoreFeature.this.getTimeProvider(), 3, null)).build();
            }

            {
                super(0);
            }
        });
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.contextRef = new java.lang.ref.WeakReference<>(null);
        this.firstPartyHostHeaderTypeResolver = new com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver(kotlin.collections.MapsKt.emptyMap());
        this.networkInfoProvider = new com.datadog.android.core.internal.net.info.NoOpNetworkInfoProvider();
        this.systemInfoProvider = new com.datadog.android.core.internal.system.NoOpSystemInfoProvider();
        this.timeProvider = new com.datadog.android.internal.time.DefaultTimeProvider();
        this.trackingConsentProvider = new com.datadog.android.core.internal.privacy.NoOpConsentProvider();
        this.userInfoProvider = new com.datadog.android.core.internal.user.NoOpMutableUserInfoProvider();
        this.accountInfoProvider = new com.datadog.android.core.internal.account.NoOpMutableAccountInfoProvider();
        this.contextProvider = new com.datadog.android.core.internal.NoOpContextProvider();
        this.packageVersionProvider = new com.datadog.android.core.internal.system.NoOpAppVersionProvider();
        this.androidInfoProvider = new com.datadog.android.core.internal.system.NoOpAndroidInfoProvider();
        this.clientToken = "";
        this.serviceName = "";
        this.sourceName = DEFAULT_SOURCE_NAME;
        this.sdkVersion = "3.8.0";
        this.isMainProcess = true;
        this.envName = "";
        this.variant = "";
        this.batchSize = com.datadog.android.core.configuration.BatchSize.MEDIUM;
        this.uploadFrequency = com.datadog.android.core.configuration.UploadFrequency.AVERAGE;
        this.batchProcessingLevel = com.datadog.android.core.configuration.BatchProcessingLevel.MEDIUM;
        this.ndkCrashHandler = new com.datadog.android.ndk.internal.NoOpNdkCrashHandler();
        this.site = com.datadog.android.DatadogSite.US1;
        this.lastViewEvent = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.gson.JsonObject>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEvent$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.google.gson.JsonObject invoke() {
                com.google.gson.JsonObject access$readLastViewEvent = com.datadog.android.core.internal.CoreFeature.access$readLastViewEvent(com.datadog.android.core.internal.CoreFeature.this);
                if (access$readLastViewEvent != null) {
                    com.datadog.android.core.internal.CoreFeature.this.deleteLastViewEvent$dd_sdk_android_core_release();
                }
                return access$readLastViewEvent;
            }

            {
                super(0);
            }
        });
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFile$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.io.File invoke() {
                return new java.io.File(com.datadog.android.core.internal.CoreFeature.this.getStorageDir$dd_sdk_android_core_release(), com.datadog.android.core.internal.CoreFeature.LAST_RUM_VIEW_EVENT_FILE_NAME);
            }

            {
                super(0);
            }
        });
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter>() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFileWriter$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter invoke() {
                com.datadog.android.api.InternalLogger internalLogger2;
                com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.Companion companion = com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.INSTANCE;
                internalLogger2 = com.datadog.android.core.internal.CoreFeature.this.Camera2StreamConfigurationMap;
                return companion.create(internalLogger2, com.datadog.android.core.internal.CoreFeature.this.getLocalDataEncryption());
            }

            {
                super(0);
            }
        });
    }

    public /* synthetic */ CoreFeature(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.time.AppStartTimeProvider appStartTimeProvider, com.datadog.android.core.thread.FlushableExecutorService.Factory factory, com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory scheduledExecutorServiceFactory, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, appStartTimeProvider, factory, scheduledExecutorServiceFactory, (i & 16) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/core/internal/CoreFeature$OkHttpCallFactory;", "Lokhttp3/Call$Factory;", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "factory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "okhttpClient$delegate", "Lkotlin/Lazy;", "getOkhttpClient", "()Lokhttp3/OkHttpClient;", "okhttpClient"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class OkHttpCallFactory implements okhttp3.Call.Factory {

        /* renamed from: okhttpClient$delegate, reason: from kotlin metadata */
        private final kotlin.Lazy okhttpClient;

        public OkHttpCallFactory(kotlin.jvm.functions.Function0<? extends okhttp3.OkHttpClient> function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.okhttpClient = kotlin.LazyKt.lazy(function0);
        }

        public final okhttp3.OkHttpClient getOkhttpClient() {
            return (okhttp3.OkHttpClient) this.okhttpClient.getValue();
        }

        @Override // okhttp3.Call.Factory
        public final okhttp3.Call newCall(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return getOkhttpClient().newCall(request);
        }
    }

    /* renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getInitialized() {
        return this.initialized;
    }

    public final java.lang.ref.WeakReference<android.content.Context> getContextRef$dd_sdk_android_core_release() {
        return this.contextRef;
    }

    public final void setContextRef$dd_sdk_android_core_release(java.lang.ref.WeakReference<android.content.Context> weakReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
        this.contextRef = weakReference;
    }

    /* renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    public final void setFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release(com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultFirstPartyHostHeaderTypeResolver, "");
        this.firstPartyHostHeaderTypeResolver = defaultFirstPartyHostHeaderTypeResolver;
    }

    /* renamed from: getNetworkInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.net.info.NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    public final void setNetworkInfoProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.net.info.NetworkInfoProvider networkInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "");
        this.networkInfoProvider = networkInfoProvider;
    }

    /* renamed from: getSystemInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.system.SystemInfoProvider getSystemInfoProvider() {
        return this.systemInfoProvider;
    }

    public final void setSystemInfoProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.system.SystemInfoProvider systemInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInfoProvider, "");
        this.systemInfoProvider = systemInfoProvider;
    }

    /* renamed from: getTimeProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.internal.time.TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    public final void setTimeProvider$dd_sdk_android_core_release(com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.timeProvider = timeProvider;
    }

    /* renamed from: getTrackingConsentProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.privacy.ConsentProvider getTrackingConsentProvider() {
        return this.trackingConsentProvider;
    }

    public final void setTrackingConsentProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.privacy.ConsentProvider consentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentProvider, "");
        this.trackingConsentProvider = consentProvider;
    }

    /* renamed from: getUserInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.user.MutableUserInfoProvider getUserInfoProvider() {
        return this.userInfoProvider;
    }

    public final void setUserInfoProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.user.MutableUserInfoProvider mutableUserInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableUserInfoProvider, "");
        this.userInfoProvider = mutableUserInfoProvider;
    }

    /* renamed from: getAccountInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.account.MutableAccountInfoProvider getAccountInfoProvider() {
        return this.accountInfoProvider;
    }

    public final void setAccountInfoProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.account.MutableAccountInfoProvider mutableAccountInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableAccountInfoProvider, "");
        this.accountInfoProvider = mutableAccountInfoProvider;
    }

    /* renamed from: getContextProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    public final void setContextProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.ContextProvider contextProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextProvider, "");
        this.contextProvider = contextProvider;
    }

    /* renamed from: getPackageVersionProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.system.AppVersionProvider getPackageVersionProvider() {
        return this.packageVersionProvider;
    }

    public final void setPackageVersionProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.system.AppVersionProvider appVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersionProvider, "");
        this.packageVersionProvider = appVersionProvider;
    }

    /* renamed from: getAndroidInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.system.AndroidInfoProvider getAndroidInfoProvider() {
        return this.androidInfoProvider;
    }

    public final void setAndroidInfoProvider$dd_sdk_android_core_release(com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidInfoProvider, "");
        this.androidInfoProvider = androidInfoProvider;
    }

    public final com.datadog.android.core.internal.CoreFeature.OkHttpCallFactory getCallFactory$dd_sdk_android_core_release() {
        com.datadog.android.core.internal.CoreFeature.OkHttpCallFactory okHttpCallFactory = this.callFactory;
        if (okHttpCallFactory != null) {
            return okHttpCallFactory;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setCallFactory$dd_sdk_android_core_release(com.datadog.android.core.internal.CoreFeature.OkHttpCallFactory okHttpCallFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpCallFactory, "");
        this.callFactory = okHttpCallFactory;
    }

    /* renamed from: getKronosClock$dd_sdk_android_core_release, reason: from getter */
    public final com.lyft.kronos.KronosClock getKronosClock() {
        return this.kronosClock;
    }

    public final void setKronosClock$dd_sdk_android_core_release(com.lyft.kronos.KronosClock kronosClock) {
        this.kronosClock = kronosClock;
    }

    /* renamed from: getClientToken$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getClientToken() {
        return this.clientToken;
    }

    public final void setClientToken$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.clientToken = str;
    }

    /* renamed from: getServiceName$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getServiceName() {
        return this.serviceName;
    }

    public final void setServiceName$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.serviceName = str;
    }

    /* renamed from: getSourceName$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getSourceName() {
        return this.sourceName;
    }

    public final void setSourceName$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sourceName = str;
    }

    /* renamed from: getSdkVersion$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    public final void setSdkVersion$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sdkVersion = str;
    }

    /* renamed from: isMainProcess$dd_sdk_android_core_release, reason: from getter */
    public final boolean getIsMainProcess() {
        return this.isMainProcess;
    }

    public final void setMainProcess$dd_sdk_android_core_release(boolean z) {
        this.isMainProcess = z;
    }

    /* renamed from: getEnvName$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getEnvName() {
        return this.envName;
    }

    public final void setEnvName$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.envName = str;
    }

    /* renamed from: getVariant$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getVariant() {
        return this.variant;
    }

    public final void setVariant$dd_sdk_android_core_release(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.variant = str;
    }

    /* renamed from: getBatchSize$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.BatchSize getBatchSize() {
        return this.batchSize;
    }

    public final void setBatchSize$dd_sdk_android_core_release(com.datadog.android.core.configuration.BatchSize batchSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchSize, "");
        this.batchSize = batchSize;
    }

    /* renamed from: getUploadFrequency$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.UploadFrequency getUploadFrequency() {
        return this.uploadFrequency;
    }

    public final void setUploadFrequency$dd_sdk_android_core_release(com.datadog.android.core.configuration.UploadFrequency uploadFrequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadFrequency, "");
        this.uploadFrequency = uploadFrequency;
    }

    /* renamed from: getBatchProcessingLevel$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.BatchProcessingLevel getBatchProcessingLevel() {
        return this.batchProcessingLevel;
    }

    public final void setBatchProcessingLevel$dd_sdk_android_core_release(com.datadog.android.core.configuration.BatchProcessingLevel batchProcessingLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchProcessingLevel, "");
        this.batchProcessingLevel = batchProcessingLevel;
    }

    /* renamed from: getMetricTelemetrySampleRateBypass$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.Float getMetricTelemetrySampleRateBypass() {
        return this.metricTelemetrySampleRateBypass;
    }

    public final void setMetricTelemetrySampleRateBypass$dd_sdk_android_core_release(java.lang.Float f) {
        this.metricTelemetrySampleRateBypass = f;
    }

    /* renamed from: getNdkCrashHandler$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.ndk.internal.NdkCrashHandler getNdkCrashHandler() {
        return this.ndkCrashHandler;
    }

    public final void setNdkCrashHandler$dd_sdk_android_core_release(com.datadog.android.ndk.internal.NdkCrashHandler ndkCrashHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ndkCrashHandler, "");
        this.ndkCrashHandler = ndkCrashHandler;
    }

    /* renamed from: getSite$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.DatadogSite getSite() {
        return this.site;
    }

    public final void setSite$dd_sdk_android_core_release(com.datadog.android.DatadogSite datadogSite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSite, "");
        this.site = datadogSite;
    }

    /* renamed from: getAppBuildId$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getAppBuildId() {
        return this.appBuildId;
    }

    public final void setAppBuildId$dd_sdk_android_core_release(java.lang.String str) {
        this.appBuildId = str;
    }

    /* renamed from: getCustomUploadSchedulerStrategy$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.UploadSchedulerStrategy getCustomUploadSchedulerStrategy() {
        return this.customUploadSchedulerStrategy;
    }

    public final void setCustomUploadSchedulerStrategy$dd_sdk_android_core_release(com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy) {
        this.customUploadSchedulerStrategy = uploadSchedulerStrategy;
    }

    public final java.util.concurrent.ScheduledThreadPoolExecutor getUploadExecutorService$dd_sdk_android_core_release() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.uploadExecutorService;
        if (scheduledThreadPoolExecutor != null) {
            return scheduledThreadPoolExecutor;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setUploadExecutorService$dd_sdk_android_core_release(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledThreadPoolExecutor, "");
        this.uploadExecutorService = scheduledThreadPoolExecutor;
    }

    public final com.datadog.android.core.thread.FlushableExecutorService getPersistenceExecutorService$dd_sdk_android_core_release() {
        com.datadog.android.core.thread.FlushableExecutorService flushableExecutorService = this.persistenceExecutorService;
        if (flushableExecutorService != null) {
            return flushableExecutorService;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setPersistenceExecutorService$dd_sdk_android_core_release(com.datadog.android.core.thread.FlushableExecutorService flushableExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flushableExecutorService, "");
        this.persistenceExecutorService = flushableExecutorService;
    }

    public final java.util.concurrent.ThreadPoolExecutor getContextExecutorService$dd_sdk_android_core_release() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.contextExecutorService;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setContextExecutorService$dd_sdk_android_core_release(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        this.contextExecutorService = threadPoolExecutor;
    }

    public final com.datadog.android.core.configuration.BackPressureStrategy getBackpressureStrategy$dd_sdk_android_core_release() {
        com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy = this.backpressureStrategy;
        if (backPressureStrategy != null) {
            return backPressureStrategy;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setBackpressureStrategy$dd_sdk_android_core_release(com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        this.backpressureStrategy = backPressureStrategy;
    }

    /* renamed from: getLocalDataEncryption$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.security.Encryption getLocalDataEncryption() {
        return this.localDataEncryption;
    }

    public final void setLocalDataEncryption$dd_sdk_android_core_release(com.datadog.android.security.Encryption encryption) {
        this.localDataEncryption = encryption;
    }

    /* renamed from: getPersistenceStrategyFactory$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.persistence.PersistenceStrategy.Factory getPersistenceStrategyFactory() {
        return this.persistenceStrategyFactory;
    }

    public final void setPersistenceStrategyFactory$dd_sdk_android_core_release(com.datadog.android.core.persistence.PersistenceStrategy.Factory factory) {
        this.persistenceStrategyFactory = factory;
    }

    public final java.io.File getStorageDir$dd_sdk_android_core_release() {
        java.io.File file = this.storageDir;
        if (file != null) {
            return file;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setStorageDir$dd_sdk_android_core_release(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.storageDir = file;
    }

    public final long getAppStartTimeNs$dd_sdk_android_core_release() {
        return this.getHighSpeedVideoFpsRanges.getAppStartTimeNs();
    }

    public final long getAppUptimeNs$dd_sdk_android_core_release() {
        return this.getHighSpeedVideoFpsRanges.getAppUptimeNs();
    }

    public final com.google.gson.JsonObject getLastViewEvent$dd_sdk_android_core_release() {
        return (com.google.gson.JsonObject) this.lastViewEvent.getValue();
    }

    public final java.lang.Long getLastFatalAnrSent$dd_sdk_android_core_release() {
        java.lang.String readTextSafe;
        java.io.File file = new java.io.File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME);
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file, this.Camera2StreamConfigurationMap) || (readTextSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.readTextSafe(file, kotlin.text.Charsets.UTF_8, this.Camera2StreamConfigurationMap)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toLongOrNull(readTextSafe);
    }

    public final void initialize(final android.content.Context appContext, final java.lang.String sdkInstanceId, com.datadog.android.core.configuration.Configuration configuration, com.datadog.android.privacy.TrackingConsent consent) {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider broadcastReceiverNetworkInfoProvider;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "");
        if (this.initialized.get()) {
            return;
        }
        com.datadog.android.core.configuration.Configuration.Core coreConfig$dd_sdk_android_core_release = configuration.getCoreConfig$dd_sdk_android_core_release();
        this.batchSize = coreConfig$dd_sdk_android_core_release.getBatchSize();
        this.uploadFrequency = coreConfig$dd_sdk_android_core_release.getUploadFrequency();
        this.localDataEncryption = coreConfig$dd_sdk_android_core_release.getEncryption();
        this.persistenceStrategyFactory = coreConfig$dd_sdk_android_core_release.getPersistenceStrategyFactory();
        this.site = coreConfig$dd_sdk_android_core_release.getSite();
        setBackpressureStrategy$dd_sdk_android_core_release(coreConfig$dd_sdk_android_core_release.getBackpressureStrategy());
        this.customUploadSchedulerStrategy = coreConfig$dd_sdk_android_core_release.getUploadSchedulerStrategy();
        android.content.pm.PackageInfo Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(appContext);
        java.lang.Integer valueOf = Camera2StreamConfigurationMap != null ? java.lang.Integer.valueOf(Camera2StreamConfigurationMap.versionCode) : null;
        java.lang.String version$dd_sdk_android_core_release = configuration.getVersion$dd_sdk_android_core_release();
        if (version$dd_sdk_android_core_release == null) {
            version$dd_sdk_android_core_release = Camera2StreamConfigurationMap != null ? Camera2StreamConfigurationMap.versionName : null;
            if (version$dd_sdk_android_core_release == null) {
                version$dd_sdk_android_core_release = valueOf != null ? valueOf.toString() : null;
                if (version$dd_sdk_android_core_release == null) {
                    version$dd_sdk_android_core_release = DEFAULT_APP_VERSION;
                }
            }
        }
        this.packageVersionProvider = new com.datadog.android.core.internal.system.DefaultAppVersionProvider(version$dd_sdk_android_core_release, valueOf != null ? valueOf.intValue() : 0);
        this.clientToken = configuration.getClientToken$dd_sdk_android_core_release();
        java.lang.String service$dd_sdk_android_core_release = configuration.getService$dd_sdk_android_core_release();
        if (service$dd_sdk_android_core_release == null) {
            service$dd_sdk_android_core_release = appContext.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(service$dd_sdk_android_core_release, "");
        }
        this.serviceName = service$dd_sdk_android_core_release;
        this.envName = configuration.getEnv$dd_sdk_android_core_release();
        this.variant = configuration.getVariant$dd_sdk_android_core_release();
        this.appBuildId = getHighSpeedVideoFpsRangesFor(appContext);
        this.contextRef = new java.lang.ref.WeakReference<>(appContext);
        int myPid = android.os.Process.myPid();
        java.lang.Object systemService = appContext.getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcessInfo = null;
        } else {
            java.util.Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((android.app.ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
            }
            runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) obj;
        }
        this.isMainProcess = runningAppProcessInfo == null ? true : kotlin.jvm.internal.Intrinsics.areEqual(appContext.getPackageName(), runningAppProcessInfo.processName);
        if (!this.isMainProcess) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$resolveProcessInfo$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.CoreFeature.SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        setUploadExecutorService$dd_sdk_android_core_release(new com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor(1, "upload", this.Camera2StreamConfigurationMap, getBackpressureStrategy$dd_sdk_android_core_release()));
        setPersistenceExecutorService$dd_sdk_android_core_release(this.getHighSpeedVideoFpsRangesFor.create(this.Camera2StreamConfigurationMap, com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, getBackpressureStrategy$dd_sdk_android_core_release(), this.timeProvider));
        setContextExecutorService$dd_sdk_android_core_release(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new com.datadog.android.core.internal.thread.BackPressuredBlockingQueue(this.Camera2StreamConfigurationMap, "context", 1024, Integer.MAX_VALUE, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.core.internal.CoreFeature$setupExecutors$contextQueue$1
            public final void getHighResolutionOutputSizeshNQ4ISI() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: com.datadog.android.core.internal.CoreFeature$setupExecutors$contextQueue$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                getHighResolutionOutputSizeshNQ4ISI(obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            }
        }, null, this.timeProvider), new com.datadog.android.core.internal.thread.DatadogThreadFactory("context")));
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(getPersistenceExecutorService$dd_sdk_android_core_release(), "NTP Sync initialization", com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), new java.lang.Runnable() { // from class: com.datadog.android.core.internal.CoreFeature$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.CoreFeature.$r8$lambda$VLtB4TxIiuLp8IbvUPC6BtWHnug(com.datadog.android.core.internal.CoreFeature.this, appContext);
            }
        });
        final com.datadog.android.core.configuration.Configuration.Core coreConfig$dd_sdk_android_core_release2 = configuration.getCoreConfig$dd_sdk_android_core_release();
        setCallFactory$dd_sdk_android_core_release(new com.datadog.android.core.internal.CoreFeature.OkHttpCallFactory(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: com.datadog.android.core.internal.CoreFeature$setupOkHttpClient$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final okhttp3.OkHttpClient invoke() {
                com.datadog.android.api.InternalLogger internalLogger;
                okhttp3.OkHttpClient.Builder newBuilder = com.datadog.android.core.internal.CoreFeature.access$getLazySharedOkHttpClient(com.datadog.android.core.internal.CoreFeature.this).newBuilder();
                if (coreConfig$dd_sdk_android_core_release2.getNeedsClearTextHttp()) {
                    newBuilder.connectionSpecs(kotlin.collections.CollectionsKt.listOf(okhttp3.ConnectionSpec.CLEARTEXT));
                }
                internalLogger = com.datadog.android.core.internal.CoreFeature.this.Camera2StreamConfigurationMap;
                newBuilder.addInterceptor(new com.datadog.android.core.internal.data.upload.GzipRequestInterceptor(internalLogger));
                if (coreConfig$dd_sdk_android_core_release2.getProxy() != null) {
                    newBuilder.proxy(coreConfig$dd_sdk_android_core_release2.getProxy());
                    newBuilder.proxyAuthenticator(coreConfig$dd_sdk_android_core_release2.getProxyAuth());
                }
                return newBuilder.build();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }));
        this.firstPartyHostHeaderTypeResolver.addKnownHostsWithHeaderTypes$dd_sdk_android_core_release(configuration.getCoreConfig$dd_sdk_android_core_release().getFirstPartyHostsWithHeaderTypes());
        this.androidInfoProvider = new com.datadog.android.core.internal.system.DefaultAndroidInfoProvider(appContext);
        setStorageDir$dd_sdk_android_core_release((java.io.File) com.datadog.android.internal.utils.StrictModeExtKt.allowThreadDiskReads(new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.datadog.android.core.internal.CoreFeature$initialize$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.io.File invoke() {
                java.io.File cacheDir = appContext.getCacheDir();
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.CoreFeature.DATADOG_STORAGE_DIR_NAME, java.util.Arrays.copyOf(new java.lang.Object[]{sdkInstanceId}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return new java.io.File(cacheDir, format);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }));
        java.lang.Object obj2 = configuration.getAdditionalConfig$dd_sdk_android_core_release().get(com.datadog.android.Datadog.DD_NATIVE_SOURCE_TYPE);
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (this.isMainProcess) {
            java.io.File storageDir$dd_sdk_android_core_release = getStorageDir$dd_sdk_android_core_release();
            com.datadog.android.core.thread.FlushableExecutorService persistenceExecutorService$dd_sdk_android_core_release = getPersistenceExecutorService$dd_sdk_android_core_release();
            com.datadog.android.ndk.internal.NdkCrashLogDeserializer ndkCrashLogDeserializer = new com.datadog.android.ndk.internal.NdkCrashLogDeserializer(this.Camera2StreamConfigurationMap);
            com.datadog.android.api.InternalLogger internalLogger = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0<com.google.gson.JsonObject> function0 = new kotlin.jvm.functions.Function0<com.google.gson.JsonObject>() { // from class: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.google.gson.JsonObject invoke() {
                    return com.datadog.android.core.internal.CoreFeature.this.getLastViewEvent$dd_sdk_android_core_release();
                }

                {
                    super(0);
                }
            };
            if (str == null) {
                str = "ndk";
            }
            com.datadog.android.ndk.internal.DatadogNdkCrashHandler datadogNdkCrashHandler = new com.datadog.android.ndk.internal.DatadogNdkCrashHandler(storageDir$dd_sdk_android_core_release, persistenceExecutorService$dd_sdk_android_core_release, ndkCrashLogDeserializer, internalLogger, function0, str);
            this.ndkCrashHandler = datadogNdkCrashHandler;
            datadogNdkCrashHandler.prepareData();
        }
        this.trackingConsentProvider = new com.datadog.android.core.internal.privacy.TrackingConsentProvider(consent);
        com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider = new com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider(this.Camera2StreamConfigurationMap);
        this.systemInfoProvider = broadcastReceiverSystemInfoProvider;
        broadcastReceiverSystemInfoProvider.register(appContext);
        if (this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastN()) {
            broadcastReceiverNetworkInfoProvider = new com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider(null, this.Camera2StreamConfigurationMap, 1, null);
        } else {
            broadcastReceiverNetworkInfoProvider = new com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider(null, 1, null);
        }
        this.networkInfoProvider = broadcastReceiverNetworkInfoProvider;
        broadcastReceiverNetworkInfoProvider.register(appContext);
        this.userInfoProvider = new com.datadog.android.core.internal.user.DatadogUserInfoProvider();
        this.accountInfoProvider = new com.datadog.android.core.internal.account.DatadogAccountInfoProvider(this.Camera2StreamConfigurationMap);
        this.initialized.set(true);
    }

    public final void stop() {
        if (this.initialized.get()) {
            android.content.Context context = this.contextRef.get();
            if (context != null) {
                this.networkInfoProvider.unregister(context);
                this.systemInfoProvider.unregister(context);
            }
            this.contextRef.clear();
            this.trackingConsentProvider.unregisterAllCallbacks();
            this.clientToken = "";
            this.packageVersionProvider = new com.datadog.android.core.internal.system.NoOpAppVersionProvider();
            this.serviceName = "";
            this.sourceName = DEFAULT_SOURCE_NAME;
            this.sdkVersion = "3.8.0";
            this.isMainProcess = true;
            this.envName = "";
            this.variant = "";
            this.firstPartyHostHeaderTypeResolver = new com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver(kotlin.collections.MapsKt.emptyMap());
            this.networkInfoProvider = new com.datadog.android.core.internal.net.info.NoOpNetworkInfoProvider();
            this.systemInfoProvider = new com.datadog.android.core.internal.system.NoOpSystemInfoProvider();
            this.timeProvider = new com.datadog.android.internal.time.DefaultTimeProvider();
            this.trackingConsentProvider = new com.datadog.android.core.internal.privacy.NoOpConsentProvider();
            this.userInfoProvider = new com.datadog.android.core.internal.user.NoOpMutableUserInfoProvider();
            this.androidInfoProvider = new com.datadog.android.core.internal.system.NoOpAndroidInfoProvider();
            getUploadExecutorService$dd_sdk_android_core_release().shutdownNow();
            getContextExecutorService$dd_sdk_android_core_release().shutdownNow();
            getPersistenceExecutorService$dd_sdk_android_core_release().shutdownNow();
            try {
                try {
                    getUploadExecutorService$dd_sdk_android_core_release().awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
                    getContextExecutorService$dd_sdk_android_core_release().awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
                    getPersistenceExecutorService$dd_sdk_android_core_release().awaitTermination(1L, java.util.concurrent.TimeUnit.SECONDS);
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            } catch (java.lang.SecurityException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$shutDownExecutors$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Thread was unable to set its own interrupted state";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            try {
                com.lyft.kronos.KronosClock kronosClock = this.kronosClock;
                if (kronosClock != null) {
                    kronosClock.shutdown();
                }
            } catch (java.lang.IllegalStateException e2) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$stop$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Trying to shut down Kronos when it is already not running";
                    }
                }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            this.initialized.set(false);
            this.ndkCrashHandler = new com.datadog.android.ndk.internal.NoOpNdkCrashHandler();
            this.trackingConsentProvider = new com.datadog.android.core.internal.privacy.NoOpConsentProvider();
        }
    }

    public final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig buildFilePersistenceConfig() {
        return new com.datadog.android.core.internal.persistence.file.FilePersistenceConfig(this.batchSize.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null);
    }

    public final java.util.concurrent.ExecutorService createExecutorService(java.lang.String executorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorContext, "");
        return this.getHighSpeedVideoFpsRangesFor.create(this.Camera2StreamConfigurationMap, executorContext, getBackpressureStrategy$dd_sdk_android_core_release(), this.timeProvider);
    }

    public final java.util.concurrent.ScheduledExecutorService createScheduledExecutorService(java.lang.String executorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorContext, "");
        return this.getInputSizeshNQ4ISI.create(this.Camera2StreamConfigurationMap, executorContext, getBackpressureStrategy$dd_sdk_android_core_release());
    }

    public final okhttp3.Call.Factory createOkHttpCallFactory(final kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        return new okhttp3.Call.Factory(this, block) { // from class: com.datadog.android.core.internal.CoreFeature$createOkHttpCallFactory$1
            private final okhttp3.OkHttpClient getHighSpeedVideoSizes;

            {
                okhttp3.OkHttpClient.Builder newBuilder = com.datadog.android.core.internal.CoreFeature.access$getLazySharedOkHttpClient(this).newBuilder();
                block.invoke(newBuilder);
                this.getHighSpeedVideoSizes = newBuilder.build();
            }

            @Override // okhttp3.Call.Factory
            public final okhttp3.Call newCall(okhttp3.Request request) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                return this.getHighSpeedVideoSizes.newCall(request);
            }
        };
    }

    public final void drainAndShutdownExecutors() throws java.lang.UnsupportedOperationException, java.lang.InterruptedException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getContextExecutorService$dd_sdk_android_core_release().getQueue().drainTo(arrayList);
        getContextExecutorService$dd_sdk_android_core_release().shutdown();
        getContextExecutorService$dd_sdk_android_core_release().awaitTermination(10L, java.util.concurrent.TimeUnit.SECONDS);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = arrayList2;
        getPersistenceExecutorService$dd_sdk_android_core_release().drainTo(arrayList3);
        getUploadExecutorService$dd_sdk_android_core_release().getQueue().drainTo(arrayList3);
        getPersistenceExecutorService$dd_sdk_android_core_release().shutdown();
        getUploadExecutorService$dd_sdk_android_core_release().shutdown();
        getPersistenceExecutorService$dd_sdk_android_core_release().awaitTermination(10L, java.util.concurrent.TimeUnit.SECONDS);
        getUploadExecutorService$dd_sdk_android_core_release().awaitTermination(10L, java.util.concurrent.TimeUnit.SECONDS);
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((java.lang.Runnable) it2.next()).run();
        }
    }

    public final void writeLastFatalAnrSent$dd_sdk_android_core_release(long anrTimestamp) {
        com.datadog.android.core.internal.persistence.file.FileExtKt.writeTextSafe(new java.io.File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME), java.lang.String.valueOf(anrTimestamp), kotlin.text.Charsets.UTF_8, this.Camera2StreamConfigurationMap);
    }

    public final void deleteLastFatalAnrSent$dd_sdk_android_core_release() {
        java.io.File file = new java.io.File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME);
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file, this.Camera2StreamConfigurationMap)) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(file, this.Camera2StreamConfigurationMap);
        }
    }

    private final android.content.pm.PackageInfo Camera2StreamConfigurationMap(android.content.Context p0) {
        try {
            java.lang.String packageName = p0.getPackageName();
            android.content.pm.PackageManager packageManager = p0.getPackageManager();
            if (this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastTiramisu()) {
                return packageManager.getPackageInfo(packageName, android.content.pm.PackageManager.PackageInfoFlags.of(0L));
            }
            return packageManager.getPackageInfo(packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$getPackageInfo$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to read your application's version name";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context p0) {
        try {
            java.io.InputStream open = p0.getAssets().open(BUILD_ID_FILE_NAME);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
            try {
                java.lang.String obj = kotlin.text.StringsKt.trim(kotlin.io.TextStreamsKt.readText(bufferedReader)).toString();
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return obj;
            } finally {
            }
        } catch (java.io.FileNotFoundException unused) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.CoreFeature.BUILD_ID_IS_MISSING_INFO_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return null;
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.CoreFeature.BUILD_ID_READ_ERROR;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\"\u0010)\u001a\u00020(8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010."}, d2 = {"Lcom/datadog/android/core/internal/CoreFeature$Companion;", "", "<init>", "()V", "", "BUILD_ID_FILE_NAME", "Ljava/lang/String;", "BUILD_ID_IS_MISSING_INFO_MESSAGE", "BUILD_ID_READ_ERROR", "DATADOG_STORAGE_DIR_NAME", "DEFAULT_APP_VERSION", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "getDEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release", "()Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "getDEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "DEFAULT_SDK_VERSION", "DEFAULT_SOURCE_NAME", "", "DRAIN_WAIT_SECONDS", "J", "LAST_FATAL_ANR_SENT_FILE_NAME", "LAST_RUM_VIEW_EVENT_FILE_NAME", "NETWORK_TIMEOUT_MS", "getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release", "()J", "NTP_CACHE_EXPIRATION_MINUTES", "NTP_DELAY_BETWEEN_SYNCS_MINUTES", "", "Lokhttp3/CipherSuite;", "RESTRICTED_CIPHER_SUITES", "[Lokhttp3/CipherSuite;", "getRESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release", "()[Lokhttp3/CipherSuite;", "SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE", "", "disableKronosBackgroundSync", "Z", "getDisableKronosBackgroundSync$dd_sdk_android_core_release", "()Z", "setDisableKronosBackgroundSync$dd_sdk_android_core_release", "(Z)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.core.thread.FlushableExecutorService.Factory getDEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.CoreFeature.DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY;
        }

        public final com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory getDEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.CoreFeature.DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY;
        }

        public final long getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.CoreFeature.NETWORK_TIMEOUT_MS;
        }

        public final okhttp3.CipherSuite[] getRESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.CoreFeature.RESTRICTED_CIPHER_SUITES;
        }

        public final boolean getDisableKronosBackgroundSync$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.CoreFeature.disableKronosBackgroundSync;
        }

        public final void setDisableKronosBackgroundSync$dd_sdk_android_core_release(boolean z) {
            com.datadog.android.core.internal.CoreFeature.disableKronosBackgroundSync = z;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$SRgSZYO-kXmGZDXPxtZRJdmzGy4, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService m9994$r8$lambda$SRgSZYOkXmGZDXPxtZRJdmzGy4(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        return new com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor(1, str, internalLogger, backPressureStrategy);
    }

    /* renamed from: $r8$lambda$VH4LIxpoIyShl7-KOjF7lLE2eho, reason: not valid java name */
    public static /* synthetic */ com.datadog.android.core.thread.FlushableExecutorService m9995$r8$lambda$VH4LIxpoIyShl7KOjF7lLE2eho(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        return new com.datadog.android.core.internal.thread.BackPressureExecutorService(internalLogger, str, backPressureStrategy, timeProvider);
    }

    public static /* synthetic */ void $r8$lambda$VLtB4TxIiuLp8IbvUPC6BtWHnug(com.datadog.android.core.internal.CoreFeature coreFeature, android.content.Context context) {
        android.content.Context createDeviceProtectedStorageContext;
        if (coreFeature.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastN() && (createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext()) != null) {
            context = createDeviceProtectedStorageContext;
        }
        android.content.Context context2 = context;
        com.lyft.kronos.AndroidClockFactory androidClockFactory = com.lyft.kronos.AndroidClockFactory.INSTANCE;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.core.internal.time.DatadogNtpEndpoint[]{com.datadog.android.core.internal.time.DatadogNtpEndpoint.NTP_0, com.datadog.android.core.internal.time.DatadogNtpEndpoint.NTP_1, com.datadog.android.core.internal.time.DatadogNtpEndpoint.NTP_2, com.datadog.android.core.internal.time.DatadogNtpEndpoint.NTP_3});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.core.internal.time.DatadogNtpEndpoint) it.next()).getHost());
        }
        com.lyft.kronos.KronosClock createKronosClock$default = com.lyft.kronos.AndroidClockFactory.createKronosClock$default(context2, new com.datadog.android.core.internal.time.LoggingSyncListener(coreFeature.Camera2StreamConfigurationMap), arrayList, 0L, java.util.concurrent.TimeUnit.MINUTES.toMillis(5L), java.util.concurrent.TimeUnit.MINUTES.toMillis(30L), 0L, 72, null);
        if (!disableKronosBackgroundSync) {
            try {
                createKronosClock$default.syncInBackground();
            } catch (java.lang.IllegalStateException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(coreFeature.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.CoreFeature$initializeClockSync$2$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to launch a synchronize local time with an NTP server.";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
        coreFeature.timeProvider = new com.datadog.android.core.internal.time.KronosTimeProvider(createKronosClock$default, coreFeature.Camera2StreamConfigurationMap);
        coreFeature.kronosClock = createKronosClock$default;
    }

    public static final /* synthetic */ okhttp3.OkHttpClient access$getLazySharedOkHttpClient(com.datadog.android.core.internal.CoreFeature coreFeature) {
        return (okhttp3.OkHttpClient) coreFeature.getHighSpeedVideoSizesFor.getValue();
    }

    public static final /* synthetic */ com.google.gson.JsonObject access$readLastViewEvent(com.datadog.android.core.internal.CoreFeature coreFeature) {
        java.io.File lastViewEventFile$dd_sdk_android_core_release;
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe((java.io.File) coreFeature.getHighSpeedVideoSizes.getValue(), coreFeature.Camera2StreamConfigurationMap)) {
            lastViewEventFile$dd_sdk_android_core_release = com.datadog.android.ndk.internal.DatadogNdkCrashHandler.INSTANCE.getLastViewEventFile$dd_sdk_android_core_release(coreFeature.getStorageDir$dd_sdk_android_core_release());
            if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(lastViewEventFile$dd_sdk_android_core_release, coreFeature.Camera2StreamConfigurationMap)) {
                lastViewEventFile$dd_sdk_android_core_release = null;
            }
        } else {
            lastViewEventFile$dd_sdk_android_core_release = (java.io.File) coreFeature.getHighSpeedVideoSizes.getValue();
        }
        if (lastViewEventFile$dd_sdk_android_core_release == null) {
            return null;
        }
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData = com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter.INSTANCE.create(coreFeature.Camera2StreamConfigurationMap, coreFeature.localDataEncryption).readData(lastViewEventFile$dd_sdk_android_core_release);
        if (readData.isEmpty()) {
            return null;
        }
        return new com.datadog.android.core.internal.persistence.JsonObjectDeserializer(coreFeature.Camera2StreamConfigurationMap).deserialize(new java.lang.String(((com.datadog.android.api.storage.RawBatchEvent) kotlin.collections.CollectionsKt.last((java.util.List) readData)).getData(), kotlin.text.Charsets.UTF_8));
    }

    public final void deleteLastViewEvent$dd_sdk_android_core_release() {
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe((java.io.File) this.getHighSpeedVideoSizes.getValue(), this.Camera2StreamConfigurationMap)) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe((java.io.File) this.getHighSpeedVideoSizes.getValue(), this.Camera2StreamConfigurationMap);
            return;
        }
        java.io.File lastViewEventFile$dd_sdk_android_core_release = com.datadog.android.ndk.internal.DatadogNdkCrashHandler.INSTANCE.getLastViewEventFile$dd_sdk_android_core_release(getStorageDir$dd_sdk_android_core_release());
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(lastViewEventFile$dd_sdk_android_core_release, this.Camera2StreamConfigurationMap)) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(lastViewEventFile$dd_sdk_android_core_release, this.Camera2StreamConfigurationMap);
        }
    }

    public final void writeLastViewEvent$dd_sdk_android_core_release(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        ((com.datadog.android.core.internal.persistence.file.FileWriter) this.getOutputFormats.getValue()).writeData((java.io.File) this.getHighSpeedVideoSizes.getValue(), new com.datadog.android.api.storage.RawBatchEvent(data, null, 2, null), false);
    }
}

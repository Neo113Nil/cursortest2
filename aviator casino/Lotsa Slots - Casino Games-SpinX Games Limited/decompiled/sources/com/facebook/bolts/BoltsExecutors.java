package com.facebook.bolts;

/* compiled from: BoltsExecutors.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors;", "", "()V", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "Ljava/util/concurrent/ExecutorService;", "immediate", "Ljava/util/concurrent/Executor;", "scheduled", "Ljava/util/concurrent/ScheduledExecutorService;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ImmediateExecutor", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BoltsExecutors {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.bolts.BoltsExecutors.Companion INSTANCE = new com.facebook.bolts.BoltsExecutors.Companion(null);
    private static final com.facebook.bolts.BoltsExecutors INSTANCE = new com.facebook.bolts.BoltsExecutors();
    private final java.util.concurrent.ExecutorService background;
    private final java.util.concurrent.Executor immediate;
    private final java.util.concurrent.ScheduledExecutorService scheduled;

    @kotlin.jvm.JvmStatic
    public static final java.util.concurrent.ExecutorService background() {
        return INSTANCE.background();
    }

    private BoltsExecutors() {
        java.util.concurrent.ExecutorService newCachedThreadPool;
        if (INSTANCE.isAndroidRuntime()) {
            newCachedThreadPool = com.facebook.bolts.AndroidExecutors.INSTANCE.newCachedThreadPool();
        } else {
            newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        }
        this.background = newCachedThreadPool;
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = newSingleThreadScheduledExecutor;
        this.immediate = new com.facebook.bolts.BoltsExecutors.ImmediateExecutor();
    }

    /* compiled from: BoltsExecutors.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$ImmediateExecutor;", "Ljava/util/concurrent/Executor;", "()V", "executionDepth", "Ljava/lang/ThreadLocal;", "", "decrementDepth", "execute", "", com.ironsource.sdk.controller.f.b.g, "Ljava/lang/Runnable;", "incrementDepth", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class ImmediateExecutor implements java.util.concurrent.Executor {
        private static final int MAX_DEPTH = 15;
        private final java.lang.ThreadLocal<java.lang.Integer> executionDepth = new java.lang.ThreadLocal<>();

        private final int incrementDepth() {
            java.lang.Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.executionDepth.set(java.lang.Integer.valueOf(intValue));
            return intValue;
        }

        private final int decrementDepth() {
            java.lang.Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.executionDepth.remove();
            } else {
                this.executionDepth.set(java.lang.Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
            try {
                if (incrementDepth() <= 15) {
                    command.run();
                } else {
                    com.facebook.bolts.BoltsExecutors.INSTANCE.background().execute(command);
                }
            } finally {
                decrementDepth();
            }
        }
    }

    /* compiled from: BoltsExecutors.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$Companion;", "", "()V", "INSTANCE", "Lcom/facebook/bolts/BoltsExecutors;", "isAndroidRuntime", "", "()Z", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "Ljava/util/concurrent/ExecutorService;", "immediate", "Ljava/util/concurrent/Executor;", "immediate$facebook_bolts_release", "scheduled", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduled$facebook_bolts_release", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            java.lang.String property = java.lang.System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = property.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "android", false, 2, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.ExecutorService background() {
            return com.facebook.bolts.BoltsExecutors.INSTANCE.background;
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.ScheduledExecutorService scheduled$facebook_bolts_release() {
            return com.facebook.bolts.BoltsExecutors.INSTANCE.scheduled;
        }

        @kotlin.jvm.JvmStatic
        public final java.util.concurrent.Executor immediate$facebook_bolts_release() {
            return com.facebook.bolts.BoltsExecutors.INSTANCE.immediate;
        }
    }
}

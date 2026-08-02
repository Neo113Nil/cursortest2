package com.paypal.oslo.core.security.clipboard;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0017\u0010\"\u001a\u0004\u0018\u00010'8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010\u001e\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-"}, d2 = {"Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManagerImpl;", "Lcom/paypal/oslo/core/security/clipboard/SecureClipboardManager;", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "Lcom/paypal/oslo/core/security/clipboard/ClipboardOwnershipTracker;", "ownershipTracker", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/core/security/clipboard/ClipboardOwnershipTracker;)V", "", "label", "text", "", "isSensitive", "Lkotlin/time/Duration;", "clearAfter", "", "copyToClipboard-Wn2Vu4Y", "(Ljava/lang/String;Ljava/lang/String;ZJ)V", "copyToClipboard", "Landroid/content/ClipData;", "clipData", "copyToClipboard-SxA4cEA", "(Landroid/content/ClipData;ZJ)V", "clearSensitiveClipboard", "()V", "hasSensitiveClip", "()Z", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/security/clipboard/ClipboardOwnershipTracker;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/ClipboardManager;", "Lkotlin/Lazy;", "", "getOutputFormats", "Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureClipboardManagerImpl implements com.paypal.oslo.core.security.clipboard.SecureClipboardManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SecureClipboardManagerImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker clipboardOwnershipTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clipboardOwnershipTracker, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = clipboardOwnershipTracker;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl.m11690$r8$lambda$LYSQuKWTUIPvmQ6KyPAUL5G3NU(com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl.this);
            }
        });
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
    }

    @Override // com.paypal.oslo.core.security.clipboard.SecureClipboardManager
    /* renamed from: copyToClipboard-Wn2Vu4Y */
    public final void mo11685copyToClipboardWn2Vu4Y(java.lang.String label, java.lang.String text, boolean isSensitive, long clearAfter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        android.content.ClipData newPlainText = android.content.ClipData.newPlainText(label, text);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newPlainText);
        mo11684copyToClipboardSxA4cEA(newPlainText, isSensitive, clearAfter);
    }

    @Override // com.paypal.oslo.core.security.clipboard.SecureClipboardManager
    /* renamed from: copyToClipboard-SxA4cEA */
    public final void mo11684copyToClipboardSxA4cEA(android.content.ClipData clipData, boolean isSensitive, long clearAfter) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clipData, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges("new clipboard copy");
            if (isSensitive) {
                java.lang.String markOwnedAndGenerateToken = this.getHighSpeedVideoFpsRangesFor.markOwnedAndGenerateToken();
                android.content.ClipDescription description = clipData.getDescription();
                android.os.PersistableBundle extras = description.getExtras();
                if (extras == null) {
                    extras = new android.os.PersistableBundle();
                }
                extras.putString(com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker.OWNERSHIP_TOKEN_KEY, markOwnedAndGenerateToken);
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    extras.putBoolean("android.content.extra.IS_SENSITIVE", true);
                }
                description.setExtras(extras);
                if (kotlin.time.Duration.m23962isInfiniteimpl(clearAfter)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "scheduleAutoClear: skipped, timeout is infinite", null, null, 6, null);
                } else {
                    getHighSpeedVideoFpsRanges("reschedule with new timeout");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "scheduleAutoClear: scheduling auto-clear", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, kotlin.time.Duration.m23977toStringimpl(clearAfter))), null, 4, null);
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$scheduleAutoClear$1(clearAfter, this, null), 3, null);
                    this.getInputSizeshNQ4ISI = launch$default;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "Copied sensitive content to clipboard", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("clearAfter", kotlin.time.Duration.m23977toStringimpl(clearAfter))), null, 4, null);
            } else {
                this.getHighSpeedVideoFpsRangesFor.markCleared();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "Copied non-sensitive content to clipboard", null, null, 6, null);
            }
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.Camera2StreamConfigurationMap.getValue();
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipData);
            } else {
                com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl secureClipboardManagerImpl = this;
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.security.LoggerKt.log, "Clipboard operation skipped - clipboard service unavailable", null, null, 6, null);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.paypal.oslo.core.security.clipboard.SecureClipboardManager
    public final void clearSensitiveClipboard() {
        android.content.ClipDescription primaryClipDescription;
        android.os.PersistableBundle extras;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (!this.getHighSpeedVideoFpsRangesFor.isOwned()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "clearSensitiveClipboard: skipped, no owned clip", null, null, 6, null);
                return;
            }
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.Camera2StreamConfigurationMap.getValue();
            if (!this.getHighSpeedVideoFpsRangesFor.verifyToken((clipboardManager == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null || (extras = primaryClipDescription.getExtras()) == null) ? null : extras.getString(com.paypal.oslo.core.security.clipboard.ClipboardOwnershipTracker.OWNERSHIP_TOKEN_KEY))) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "clearSensitiveClipboard: ownership verification failed, clipboard was replaced", null, null, 6, null);
                this.getHighSpeedVideoFpsRangesFor.markCleared();
                getHighSpeedVideoFpsRanges("ownership verification failed");
                return;
            }
            getHighSpeedVideoFpsRanges("manual clear");
            android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) this.Camera2StreamConfigurationMap.getValue();
            if (clipboardManager2 == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.security.LoggerKt.log, "clearClipboard: skipped - clipboard service unavailable", null, null, 6, null);
            } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "clearClipboard: using clearPrimaryClip", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("apiLevel", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT))), null, 4, null);
                clipboardManager2.clearPrimaryClip();
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "clearClipboard: using empty clip fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("apiLevel", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT))), null, 4, null);
                clipboardManager2.setPrimaryClip(android.content.ClipData.newPlainText("", ""));
            }
            this.getHighSpeedVideoFpsRangesFor.markCleared();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "clearSensitiveClipboard: clipboard cleared successfully", null, null, 6, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.paypal.oslo.core.security.clipboard.SecureClipboardManager
    public final boolean hasSensitiveClip() {
        return this.getHighSpeedVideoFpsRangesFor.isOwned();
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0) {
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "cancelPendingAutoClear: cancelling pending auto-clear job", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", p0)), null, 4, null);
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            this.getInputSizeshNQ4ISI = null;
        }
    }

    /* renamed from: $r8$lambda$LYSQuKWTUIP-vmQ6KyPAUL5G3NU, reason: not valid java name */
    public static /* synthetic */ android.content.ClipboardManager m11690$r8$lambda$LYSQuKWTUIPvmQ6KyPAUL5G3NU(com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl secureClipboardManagerImpl) {
        java.lang.String str;
        java.lang.Class<?> cls;
        java.lang.Object systemService = secureClipboardManagerImpl.getHighResolutionOutputSizeshNQ4ISI.getSystemService("clipboard");
        if (!(systemService instanceof android.content.ClipboardManager)) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.security.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("service", "clipboard");
            if (systemService == null || (cls = systemService.getClass()) == null || (str = cls.getName()) == null) {
                str = "null";
            }
            pairArr[1] = kotlin.TuplesKt.to("returnedType", str);
            com.paypal.android.logger.Logger.e$default(logger, "Clipboard service unavailable - system returned null or wrong type", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            return null;
        }
        return (android.content.ClipboardManager) systemService;
    }
}

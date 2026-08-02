package com.miteksystems.misnap.controller;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0002\u008c\u0001\u0018\u0000 \u009b\u00012\u00020\u0001:\n\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001B>\b\u0000\u0012\u0007\u0010\u0098\u0001\u001a\u00020M\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010B\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020F\u0012\b\b\u0002\u0010L\u001a\u00020I¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\t\u0010\u0018J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0019H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u001aH\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0018\u0010\t\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010!2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0002J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020'H\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u0010\t\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,H\u0002J\b\u0010\u000e\u001a\u00020.H\u0002J\b\u0010\t\u001a\u00020.H\u0002J\"\u0010\t\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0006H\u0002J\u001a\u00101\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u0006\u00102\u001a\u00020\bJ\u0006\u00103\u001a\u00020\bJ\u001f\u00106\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b:\u00108J\u000f\u0010=\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u00108R\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\n N*\u0004\u0018\u00010M0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u0014\u001a\u00020\u00138@X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00190i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010eR\u0016\u0010t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010eR\u0016\u0010v\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010eR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010\u007f\u001a\u00060{j\u0002`|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0i8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010kR\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020.0i8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010kR\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u008b\u0001\u001a\u0011\u0012\f\u0012\n N*\u0004\u0018\u00010M0M0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001b\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u001b\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020.0\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 \u0001"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "forceFrameResult", "", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/miteksystems/misnap/core/Frame;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/miteksystems/misnap/controller/a/b0;", "result", "Lcom/miteksystems/misnap/controller/a/j;", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/controller/a/b;", "Lcom/miteksystems/misnap/controller/a/f;", "c", "Lcom/miteksystems/misnap/controller/a/o;", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "", "", "corners", "(Lcom/miteksystems/misnap/core/Frame;[[I)[[I", "Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceIqasResult;", "faceIqasResult", "", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Processed$DocumentIqasResult;", "iqaResults", "Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "Lcom/miteksystems/misnap/core/DocumentExtraction;", "Lcom/miteksystems/misnap/core/DocumentClassification;", "documentClassification", "", "orientation", "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "userAction", "Lcom/miteksystems/misnap/controller/a/q;", "exception", "Lcom/miteksystems/misnap/controller/a/r;", "error", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "useCaseResult", "isDeviceInMotion", "analyzeFrame", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "release", "shouldHandleDeviceMotionFeedback$controller_release", "(Lcom/miteksystems/misnap/controller/a/b0;Z)Z", "shouldHandleDeviceMotionFeedback", "shouldTrackFinalFrameDispatched$controller_release", "()Z", "shouldTrackFinalFrameDispatched", "willFocusBeforeFinalFrame$controller_release", "willFocusBeforeFinalFrame", "isImageQualityPriority$controller_release", "isImageQualityPriority", "Lcom/miteksystems/misnap/controller/a/a0;", "Lcom/miteksystems/misnap/controller/a/a0;", "getController$controller_release", "()Lcom/miteksystems/misnap/controller/a/a0;", "controller", "Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper;", "Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper;", "controllerNativeWrapper", "Lcom/miteksystems/misnap/controller/a/p;", "Lcom/miteksystems/misnap/controller/a/p;", "iadAdapter", "Lcom/miteksystems/misnap/controller/a/d;", "d", "Lcom/miteksystems/misnap/controller/a/d;", "motionDetector", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "e", "Landroid/content/Context;", "applicationContext", "Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "f", "Lcom/miteksystems/misnap/core/DevicePerformanceUtil$PerformanceTier;", "deviceTier", "g", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "getSettings$controller_release", "()Lcom/miteksystems/misnap/core/MiSnapSettings;", "h", com.visa.cbp.getEncExpo.warmup, "deviceOrientation", "i", "Lcom/miteksystems/misnap/core/UserAction;", "lastUserAction", "", "j", "J", "initialDelay", "k", "Z", "hasInitialDelayStarted", "l", "hasInitialDelayFinished", "Landroidx/lifecycle/MutableLiveData;", "m", "Landroidx/lifecycle/MutableLiveData;", "_feedbackResult", "Lcom/miteksystems/misnap/core/MibiData$Session;", "n", "Lcom/miteksystems/misnap/core/MibiData$Session;", "mibiDataSession", "o", "finalFrameDispatched", "p", "performMotionChecks", "q", "motionChecksDisableScheduled", "Landroid/os/Handler;", "r", "Landroid/os/Handler;", "motionChecksDisableHandler", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", lib.android.paypal.com.magnessdk.g.n2, "Ljava/lang/Runnable;", "disableMotionChecksRunnable", "t", "_frameResult", "u", "_errorResult", "Lkotlinx/coroutines/Job;", "v", "Lkotlinx/coroutines/Job;", "job", "Ljava/lang/ref/WeakReference;", "w", "Ljava/lang/ref/WeakReference;", "weakContext", "com/miteksystems/misnap/controller/MiSnapController$displayListener$1", "x", "Lcom/miteksystems/misnap/controller/MiSnapController$displayListener$1;", "displayListener", "Landroidx/lifecycle/LiveData;", "getFeedbackResult", "()Landroidx/lifecycle/LiveData;", "feedbackResult", "getFrameResult", "frameResult", "getErrorResult", "errorResult", "activityContext", "<init>", "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings;Lcom/miteksystems/misnap/controller/a/a0;Lcom/miteksystems/misnap/controller/internal/CompressionUtilNativeWrapper;Lcom/miteksystems/misnap/controller/a/p;Lcom/miteksystems/misnap/controller/a/d;)V", "Companion", androidx.compose.material3.internal.TextFieldImplKt.ContainerId, "ErrorResult", "FeedbackResult", "FrameResult", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class MiSnapController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.controller.MiSnapController.Companion INSTANCE = new com.miteksystems.misnap.controller.MiSnapController.Companion(null);
    private final androidx.view.MutableLiveData<com.miteksystems.misnap.controller.MiSnapController.ErrorResult> ArtificialStackFrames;
    private final com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper Camera2StreamConfigurationMap;
    private final com.miteksystems.misnap.controller.MiSnapController$displayListener$1 CoroutineDebuggingKt;
    private final java.lang.ref.WeakReference<android.content.Context> accessartificialFrame;
    private kotlinx.coroutines.Job coroutineBoundary;
    private final com.miteksystems.misnap.controller.a.p getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final com.miteksystems.misnap.controller.a.d getHighSpeedVideoFpsRangesFor;
    private final com.miteksystems.misnap.controller.a.a0 getHighSpeedVideoSizes;
    private com.miteksystems.misnap.core.UserAction getHighSpeedVideoSizesFor;
    private final long getInputFormats;
    private int getInputSizeshNQ4ISI;
    private final com.miteksystems.misnap.core.MiSnapSettings getOutputFormats;
    private final com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private final androidx.view.MutableLiveData<com.miteksystems.misnap.controller.MiSnapController.FeedbackResult> getOutputStallDuration;
    private com.miteksystems.misnap.core.MibiData.Session getOutputStallDurationlomOqCM;
    private final java.lang.Runnable getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private final androidx.view.MutableLiveData<com.miteksystems.misnap.controller.MiSnapController.FrameResult> isOutputSupportedForhNQ4ISI;
    private boolean toString;
    private final android.os.Handler unwrapAs;

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u00011BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JV\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult;", "", "Lcom/miteksystems/misnap/core/UserAction;", "userAction", "", "", "corners", "glareCorners", "", "warnings", "Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;", "metaData", "<init>", "(Lcom/miteksystems/misnap/core/UserAction;[[I[[ILjava/util/List;Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;)V", "component1", "()Lcom/miteksystems/misnap/core/UserAction;", "component2", "()[[I", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;", "copy", "(Lcom/miteksystems/misnap/core/UserAction;[[I[[ILjava/util/List;Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;)Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/miteksystems/misnap/core/UserAction;", "getUserAction", util.h.xy.cb.b.f1091, "[[I", "getCorners", "c", "getGlareCorners", "d", "Ljava/util/List;", "getWarnings", "e", "Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;", "getMetaData", "Metadata"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FeedbackResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.miteksystems.misnap.core.UserAction userAction;

        /* renamed from: b, reason: from kotlin metadata */
        private final int[][] corners;

        /* renamed from: c, reason: from kotlin metadata */
        private final int[][] glareCorners;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

        /* renamed from: e, reason: from kotlin metadata */
        private final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metaData;

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;", "", "", "luma", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/miteksystems/misnap/controller/MiSnapController$FeedbackResult$Metadata;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getLuma"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class Metadata {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.Integer luma;

            /* JADX WARN: Multi-variable type inference failed */
            public Metadata() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public Metadata(java.lang.Integer num) {
                this.luma = num;
            }

            public /* synthetic */ Metadata(java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(luma=");
                sb.append(this.luma);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.Integer num = this.luma;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final java.lang.Integer getLuma() {
                return this.luma;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.luma, ((com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata) other).luma);
            }

            public final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata copy(java.lang.Integer luma) {
                return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata(luma);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Integer getLuma() {
                return this.luma;
            }

            public static /* synthetic */ com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata copy$default(com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metadata, java.lang.Integer num, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    num = metadata.luma;
                }
                return metadata.copy(num);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeedbackResult(com.miteksystems.misnap.core.UserAction userAction, int[][] iArr, int[][] iArr2, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userAction = userAction;
            this.corners = iArr;
            this.glareCorners = iArr2;
            this.warnings = list;
            this.metaData = metadata;
        }

        public /* synthetic */ FeedbackResult(com.miteksystems.misnap.core.UserAction userAction, int[][] iArr, int[][] iArr2, java.util.List list, com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metadata, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userAction, (i & 2) != 0 ? new int[0][] : iArr, (i & 4) != 0 ? new int[0][] : iArr2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : metadata);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FeedbackResult(userAction=");
            sb.append(this.userAction);
            sb.append(", corners=");
            sb.append(java.util.Arrays.toString(this.corners));
            sb.append(", glareCorners=");
            sb.append(java.util.Arrays.toString(this.glareCorners));
            sb.append(", warnings=");
            sb.append(this.warnings);
            sb.append(", metaData=");
            sb.append(this.metaData);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.userAction.hashCode();
            int hashCode2 = java.util.Arrays.hashCode(this.corners);
            int hashCode3 = java.util.Arrays.hashCode(this.glareCorners);
            int hashCode4 = this.warnings.hashCode();
            com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metadata = this.metaData;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (metadata == null ? 0 : metadata.hashCode());
        }

        public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
            return this.warnings;
        }

        public final com.miteksystems.misnap.core.UserAction getUserAction() {
            return this.userAction;
        }

        public final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata getMetaData() {
            return this.metaData;
        }

        public final int[][] getGlareCorners() {
            return this.glareCorners;
        }

        public final int[][] getCorners() {
            return this.corners;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.controller.MiSnapController.FeedbackResult)) {
                return false;
            }
            com.miteksystems.misnap.controller.MiSnapController.FeedbackResult feedbackResult = (com.miteksystems.misnap.controller.MiSnapController.FeedbackResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userAction, feedbackResult.userAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.corners, feedbackResult.corners) && kotlin.jvm.internal.Intrinsics.areEqual(this.glareCorners, feedbackResult.glareCorners) && kotlin.jvm.internal.Intrinsics.areEqual(this.warnings, feedbackResult.warnings) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, feedbackResult.metaData);
        }

        public final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult copy(com.miteksystems.misnap.core.UserAction userAction, int[][] corners, int[][] glareCorners, java.util.List<? extends com.miteksystems.misnap.core.UserAction> warnings, com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metaData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corners, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glareCorners, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(warnings, "");
            return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(userAction, corners, glareCorners, warnings, metaData);
        }

        /* renamed from: component5, reason: from getter */
        public final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata getMetaData() {
            return this.metaData;
        }

        public final java.util.List<com.miteksystems.misnap.core.UserAction> component4() {
            return this.warnings;
        }

        /* renamed from: component3, reason: from getter */
        public final int[][] getGlareCorners() {
            return this.glareCorners;
        }

        /* renamed from: component2, reason: from getter */
        public final int[][] getCorners() {
            return this.corners;
        }

        /* renamed from: component1, reason: from getter */
        public final com.miteksystems.misnap.core.UserAction getUserAction() {
            return this.userAction;
        }

        public static /* synthetic */ com.miteksystems.misnap.controller.MiSnapController.FeedbackResult copy$default(com.miteksystems.misnap.controller.MiSnapController.FeedbackResult feedbackResult, com.miteksystems.misnap.core.UserAction userAction, int[][] iArr, int[][] iArr2, java.util.List list, com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata metadata, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAction = feedbackResult.userAction;
            }
            if ((i & 2) != 0) {
                iArr = feedbackResult.corners;
            }
            int[][] iArr3 = iArr;
            if ((i & 4) != 0) {
                iArr2 = feedbackResult.glareCorners;
            }
            int[][] iArr4 = iArr2;
            if ((i & 8) != 0) {
                list = feedbackResult.warnings;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                metadata = feedbackResult.metaData;
            }
            return feedbackResult.copy(userAction, iArr3, iArr4, list2, metadata);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.hardware.display.DisplayManager$DisplayListener, com.miteksystems.misnap.controller.MiSnapController$displayListener$1] */
    public MiSnapController(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.controller.a.a0 a0Var, com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper compressionUtilNativeWrapper, com.miteksystems.misnap.controller.a.p pVar, com.miteksystems.misnap.controller.a.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compressionUtilNativeWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "");
        this.getHighSpeedVideoSizes = a0Var;
        this.Camera2StreamConfigurationMap = compressionUtilNativeWrapper;
        this.getHighResolutionOutputSizeshNQ4ISI = pVar;
        this.getHighSpeedVideoFpsRangesFor = dVar;
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
        this.getOutputMinFrameDuration = com.miteksystems.misnap.core.DevicePerformanceUtil.getCurrentDevicePerformanceTier$default(com.miteksystems.misnap.core.DevicePerformanceUtil.INSTANCE, context, false, 2, null);
        this.getOutputFormats = miSnapSettings.m10906clone();
        this.getInputSizeshNQ4ISI = com.miteksystems.misnap.core.OrientationUtil.getDeviceCurrentBasicOrientation(context);
        this.getInputFormats = com.miteksystems.misnap.controller.AnalysisSettings.getInitialDelay(miSnapSettings.analysis, miSnapSettings.getUseCase());
        this.getOutputStallDuration = new androidx.view.MutableLiveData<>();
        this.getOutputStallDurationlomOqCM = com.miteksystems.misnap.core.MibiData.INSTANCE.bindSession();
        this.toString = true;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.unwrapAs = new android.os.Handler(myLooper == null ? android.os.Looper.getMainLooper() : myLooper);
        this.getValidOutputFormatsForInputhNQ4ISI = new java.lang.Runnable() { // from class: com.miteksystems.misnap.controller.MiSnapController$special$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                com.miteksystems.misnap.core.MibiData.Session session;
                com.miteksystems.misnap.controller.MiSnapController.this.toString = false;
                com.miteksystems.misnap.controller.MiSnapController.this.isOutputSupportedFor = false;
                session = com.miteksystems.misnap.controller.MiSnapController.this.getOutputStallDurationlomOqCM;
                session.addUxpEvent("MCMDD", new java.lang.String[0]);
            }
        };
        this.isOutputSupportedForhNQ4ISI = new androidx.view.MutableLiveData<>();
        androidx.view.MutableLiveData<com.miteksystems.misnap.controller.MiSnapController.ErrorResult> mutableLiveData = new androidx.view.MutableLiveData<>();
        this.ArtificialStackFrames = mutableLiveData;
        this.accessartificialFrame = new java.lang.ref.WeakReference<>(context);
        ?? r1 = new android.hardware.display.DisplayManager.DisplayListener() { // from class: com.miteksystems.misnap.controller.MiSnapController$displayListener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int displayId) {
                java.lang.ref.WeakReference weakReference;
                weakReference = com.miteksystems.misnap.controller.MiSnapController.this.accessartificialFrame;
                android.content.Context context2 = (android.content.Context) weakReference.get();
                if (context2 != null) {
                    com.miteksystems.misnap.controller.MiSnapController.this.getInputSizeshNQ4ISI = com.miteksystems.misnap.core.OrientationUtil.getDeviceCurrentBasicOrientation(context2);
                }
            }
        };
        this.CoroutineDebuggingKt = r1;
        if (!compressionUtilNativeWrapper.a()) {
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(mutableLiveData, getHighSpeedVideoSizes());
        }
        java.lang.Object systemService = context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) systemService;
        android.os.Looper myLooper2 = android.os.Looper.myLooper();
        displayManager.registerDisplayListener(r1, new android.os.Handler(myLooper2 == null ? android.os.Looper.getMainLooper() : myLooper2));
        java.lang.String name2 = com.miteksystems.misnap.controller.MiSnapController.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (com.miteksystems.misnap.core.MibiData.startSession(name2, miSnapSettings)) {
            this.getOutputStallDurationlomOqCM = com.miteksystems.misnap.core.MibiData.INSTANCE.bindSession();
            if (com.miteksystems.misnap.controller.AnalysisSettings.isAutoTrigger(miSnapSettings.analysis, miSnapSettings.getUseCase())) {
                com.miteksystems.misnap.core.MibiData.MetaData metaData = this.getOutputStallDurationlomOqCM.getMetaData();
                metaData.setAutoTries(metaData.getAutoTries() + 1);
            } else {
                com.miteksystems.misnap.core.MibiData.MetaData metaData2 = this.getOutputStallDurationlomOqCM.getMetaData();
                metaData2.setManualTries(metaData2.getManualTries() + 1);
            }
        }
        if (com.miteksystems.misnap.controller.AnalysisSettings.getMotionDetectorSensitivity(miSnapSettings.analysis, miSnapSettings.getUseCase()) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE && !willFocusBeforeFinalFrame$controller_release() && isImageQualityPriority$controller_release()) {
            dVar.e();
        }
        getHighSpeedVideoFpsRanges();
    }

    private final com.miteksystems.misnap.controller.MiSnapController.ErrorResult getHighSpeedVideoSizes() {
        com.miteksystems.misnap.controller.a.a0 a0Var = this.getHighSpeedVideoSizes;
        return a0Var instanceof com.miteksystems.misnap.controller.a.h ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentAnalysis(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure.LibraryLoad.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.a ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.BarcodeAnalysis(com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure.LibraryLoad.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.m ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.FaceAnalysis(com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure.InputFormat.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.e ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentAnalysis(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure.LibraryLoad.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.g ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentClassification(com.miteksystems.misnap.classifier.MiSnapDocumentClassifier.Result.Failure.LibraryLoad.INSTANCE) : new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentDetection(com.miteksystems.misnap.detector.MiSnapDocumentDetector.Result.Failure.LibraryLoad.INSTANCE);
    }

    public final void analyzeFrame(com.miteksystems.misnap.core.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        analyzeFrame$default(this, frame, false, 2, null);
    }

    public /* synthetic */ MiSnapController(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.controller.a.a0 a0Var, com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper compressionUtilNativeWrapper, com.miteksystems.misnap.controller.a.p pVar, com.miteksystems.misnap.controller.a.d dVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, miSnapSettings, a0Var, compressionUtilNativeWrapper, pVar, (i & 32) != 0 ? new com.miteksystems.misnap.controller.a.d(context, miSnapSettings) : dVar);
    }

    private static java.lang.String Camera2StreamConfigurationMap(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult documentIqasResult) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FFSSB: ");
        sb.append(documentIqasResult.getBrightness());
        sb.append(", FFSSS: ");
        sb.append(documentIqasResult.getSharpness());
        sb.append(", FFSFC: ");
        sb.append(documentIqasResult.getFourCornerConfidence());
        sb.append(", FFSSA: ");
        sb.append(documentIqasResult.getSkewAngle());
        sb.append(", FFSRA: ");
        sb.append(documentIqasResult.getRotationAngle());
        sb.append(", FFSHF: ");
        sb.append(documentIqasResult.getHorizontalFill());
        sb.append(", FFSPP: ");
        sb.append(documentIqasResult.getPadding());
        sb.append(", FFSGC: ");
        sb.append(documentIqasResult.getNoGlareConfidence());
        sb.append(", FFSBC: ");
        sb.append(documentIqasResult.getSolidBackgroundConfidence());
        sb.append(", FFSCC: ");
        sb.append(documentIqasResult.getContrastConfidence());
        sb.append(", FFSMC: ");
        sb.append(documentIqasResult.getMrzConfidence());
        sb.append(", FFSCO: ");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(documentIqasResult.getFourCorners(), ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1<android.graphics.Point, java.lang.CharSequence>() { // from class: com.miteksystems.misnap.controller.MiSnapController$formatDocumentIqaResultsForMiBi$1$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence invoke(android.graphics.Point point) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(point, "");
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
                sb2.append(point.x);
                sb2.append(", ");
                sb2.append(point.y);
                sb2.append(')');
                return sb2.toString();
            }
        }, 30, (java.lang.Object) null));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getHighSpeedVideoFpsRanges() {
        switch (com.miteksystems.misnap.controller.MiSnapController.WhenMappings.$EnumSwitchMapping$0[this.getOutputFormats.getUseCase().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                com.miteksystems.misnap.core.MibiData.Session session = this.getOutputStallDurationlomOqCM;
                java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputFormats);
                java.lang.String str = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                java.lang.String str2 = com.miteksystems.misnap.document.DocumentAnalysisSettings.getOrientation(this.getOutputFormats.analysis.document, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
                boolean shouldEnableEnhancedManual = com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableEnhancedManual(this.getOutputFormats.analysis.document);
                com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = this.getOutputFormats;
                session.setErrorSessionInfo(new com.miteksystems.misnap.core.MibiData.DocumentSessionInfo(highSpeedVideoSizes, null, null, null, java.lang.Boolean.valueOf(shouldEnableEnhancedManual), null, null, str, str2, null, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings.analysis, miSnapSettings.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), null, com.google.firebase.FirebaseError.ERROR_OPERATION_NOT_ALLOWED, null), new com.miteksystems.misnap.core.MibiData.SessionInfo[0]);
                break;
            case 5:
            case 6:
                com.miteksystems.misnap.core.MibiData.Session session2 = this.getOutputStallDurationlomOqCM;
                java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.getOutputFormats);
                java.lang.String str3 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                java.lang.String str4 = com.miteksystems.misnap.document.DocumentAnalysisSettings.getOrientation(this.getOutputFormats.analysis.document, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
                boolean shouldEnableEnhancedManual2 = com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableEnhancedManual(this.getOutputFormats.analysis.document);
                com.miteksystems.misnap.core.MiSnapSettings miSnapSettings2 = this.getOutputFormats;
                session2.setErrorSessionInfo(new com.miteksystems.misnap.core.MibiData.DocumentSessionInfo(highSpeedVideoSizes2, null, null, null, java.lang.Boolean.valueOf(shouldEnableEnhancedManual2), null, 0 == true ? 1 : 0, str3, str4, null, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings2.analysis, miSnapSettings2.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), null, com.google.firebase.FirebaseError.ERROR_OPERATION_NOT_ALLOWED, null), new com.miteksystems.misnap.core.MibiData.SessionInfo[0]);
                if (com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(this.getOutputFormats.analysis.document) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE) {
                    com.miteksystems.misnap.core.MibiData.Session session3 = this.getOutputStallDurationlomOqCM;
                    java.lang.String str5 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                    java.lang.String str6 = com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.getOrientation(this.getOutputFormats.analysis.barcode, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
                    com.miteksystems.misnap.core.MiSnapSettings miSnapSettings3 = this.getOutputFormats;
                    session3.setErrorSessionInfo(new com.miteksystems.misnap.core.MibiData.BarcodeSessionInfo(null, str5, str6, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings3.analysis, miSnapSettings3.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), 1, null), new com.miteksystems.misnap.core.MibiData.SessionInfo[0]);
                    break;
                }
                break;
            case 7:
                com.miteksystems.misnap.core.MibiData.Session session4 = this.getOutputStallDurationlomOqCM;
                java.lang.String str7 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                java.lang.String str8 = com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.getOrientation(this.getOutputFormats.analysis.barcode, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
                com.miteksystems.misnap.core.MiSnapSettings miSnapSettings4 = this.getOutputFormats;
                session4.setErrorSessionInfo(new com.miteksystems.misnap.core.MibiData.BarcodeSessionInfo(null, str7, str8, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings4.analysis, miSnapSettings4.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), 1, null), new com.miteksystems.misnap.core.MibiData.SessionInfo[0]);
                break;
            case 8:
                com.miteksystems.misnap.core.MibiData.Session session5 = this.getOutputStallDurationlomOqCM;
                boolean z = this.getOutputFormats.analysis.face.getTrigger() == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE;
                java.lang.String str9 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                com.miteksystems.misnap.core.MiSnapSettings miSnapSettings5 = this.getOutputFormats;
                session5.setErrorSessionInfo(new com.miteksystems.misnap.core.MibiData.FaceSessionInfo(null, java.lang.Boolean.valueOf(z), str9, null, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings5.analysis, miSnapSettings5.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), 9, null), new com.miteksystems.misnap.core.MibiData.SessionInfo[0]);
                break;
        }
    }

    public final void analyzeFrame(com.miteksystems.misnap.core.Frame frame, boolean forceFrameResult) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        cancel();
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$1(this, frame, forceFrameResult, null), 3, null);
        this.coroutineBoundary = launch$default;
    }

    private static java.lang.String Camera2StreamConfigurationMap(com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult) {
        java.lang.Object obj;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FSFBB: ");
            sb.append(faceIqasResult.getFaceBoundingBox().toShortString());
            sb.append(", FSFHF: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getHorizontalFill())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            sb.append(format);
            sb.append(", FSFPP: ");
            sb.append(faceIqasResult.getPadding());
            sb.append(", FSFPA: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format2 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getPitchAngle())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            sb.append(format2);
            sb.append(", FSFYA: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format3 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getYawAngle())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
            sb.append(format3);
            sb.append(", FSFRA: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format4 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getRollAngle())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "");
            sb.append(format4);
            sb.append(", FSFLE: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format5 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getLeftEyeOpenConfidence())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "");
            sb.append(format5);
            sb.append(", FSFRE: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format6 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getRightEyeOpenConfidence())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "");
            sb.append(format6);
            sb.append(", FSFSM: ");
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format7 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(faceIqasResult.getSmileConfidence())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format7, "");
            sb.append(format7);
            sb.append(", FSFLM: ");
            sb.append(faceIqasResult.getLuma());
            obj = kotlin.Result.m23436constructorimpl(sb.toString());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.String) (kotlin.Result.m23441isFailureimpl(obj) ? "" : obj);
    }

    private final com.miteksystems.misnap.controller.MiSnapController.FeedbackResult getHighResolutionOutputSizeshNQ4ISI(com.miteksystems.misnap.controller.a.b0 b0Var, com.miteksystems.misnap.core.Frame frame, boolean z) {
        java.lang.Integer luma;
        if (b0Var instanceof com.miteksystems.misnap.controller.a.j) {
            if (!z) {
                com.miteksystems.misnap.controller.a.j jVar = (com.miteksystems.misnap.controller.a.j) b0Var;
                return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(b0Var.getUserAction(), getHighSpeedVideoFpsRangesFor(frame, jVar.getFourCorners()), getHighSpeedVideoFpsRangesFor(frame, jVar.getGlareCorners()), jVar.h(), null, 16, null);
            }
            com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL hold_still = com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE;
            com.miteksystems.misnap.controller.a.j jVar2 = (com.miteksystems.misnap.controller.a.j) b0Var;
            int[][] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(frame, jVar2.getFourCorners());
            int[][] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(frame, jVar2.getGlareCorners());
            java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) jVar2.h());
            mutableList.add(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(hold_still, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, mutableList, null, 16, null);
        }
        if (b0Var instanceof com.miteksystems.misnap.controller.a.b) {
            return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(b0Var.getUserAction(), null, null, null, null, 30, null);
        }
        if (!(b0Var instanceof com.miteksystems.misnap.controller.a.f)) {
            if (!(b0Var instanceof com.miteksystems.misnap.controller.a.o)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.miteksystems.misnap.core.UserAction userAction = b0Var.getUserAction();
            com.miteksystems.misnap.controller.a.o oVar = (com.miteksystems.misnap.controller.a.o) b0Var;
            int[][] getHighSpeedVideoSizes = oVar.getGetHighSpeedVideoSizes();
            java.util.List<com.miteksystems.misnap.core.UserAction> e = oVar.e();
            com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult getHighResolutionOutputSizeshNQ4ISI = oVar.getGetHighResolutionOutputSizeshNQ4ISI();
            return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(userAction, getHighSpeedVideoSizes, null, e, (getHighResolutionOutputSizeshNQ4ISI == null || (luma = getHighResolutionOutputSizeshNQ4ISI.getLuma()) == null) ? null : new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult.Metadata(java.lang.Integer.valueOf(luma.intValue())), 4, null);
        }
        if (!z) {
            com.miteksystems.misnap.controller.a.f fVar = (com.miteksystems.misnap.controller.a.f) b0Var;
            return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(b0Var.getUserAction(), getHighSpeedVideoFpsRangesFor(frame, fVar.getDocumentControllerResult().getFourCorners()), getHighSpeedVideoFpsRangesFor(frame, fVar.getDocumentControllerResult().getGlareCorners()), fVar.getDocumentControllerResult().h(), null, 16, null);
        }
        com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL hold_still2 = com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE;
        com.miteksystems.misnap.controller.a.f fVar2 = (com.miteksystems.misnap.controller.a.f) b0Var;
        int[][] highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(frame, fVar2.getDocumentControllerResult().getFourCorners());
        int[][] highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(frame, fVar2.getDocumentControllerResult().getGlareCorners());
        java.util.List mutableList2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) fVar2.getDocumentControllerResult().h());
        mutableList2.add(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        return new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(hold_still2, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, mutableList2, null, 16, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0025, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0033, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002e, code lost:
    
        r0 = r0.getMrz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002c, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.miteksystems.misnap.core.DocumentExtraction Camera2StreamConfigurationMap(com.miteksystems.misnap.controller.a.j jVar) {
        com.miteksystems.misnap.core.DocumentExtraction extraction;
        com.miteksystems.misnap.core.Mrz mrz;
        com.miteksystems.misnap.core.DocumentData extractedData;
        com.miteksystems.misnap.core.Mrz mrz2;
        if (com.miteksystems.misnap.controller.a.w.a(jVar, this.getOutputFormats) && com.miteksystems.misnap.controller.a.w.a(jVar)) {
            com.miteksystems.misnap.core.DocumentExtraction extraction2 = jVar.getExtraction();
            if (extraction2 == null || (mrz2 = extraction2.getMrz()) == null || (mrz = com.miteksystems.misnap.controller.a.w.a(mrz2)) == null) {
                extraction = jVar.getExtraction();
            }
        } else {
            extraction = jVar.getExtraction();
        }
        com.miteksystems.misnap.core.DocumentExtraction extraction3 = jVar.getExtraction();
        if (extraction3 != null && (extractedData = extraction3.getExtractedData()) != null) {
            if (com.miteksystems.misnap.controller.a.w.a(extractedData, this.getOutputFormats)) {
                extractedData = com.miteksystems.misnap.controller.a.w.a(extractedData);
            }
        }
        com.miteksystems.misnap.core.DocumentExtraction extraction4 = jVar.getExtraction();
        extractedData = extraction4 != null ? extraction4.getExtractedData() : null;
        com.miteksystems.misnap.core.DocumentExtraction extraction5 = jVar.getExtraction();
        com.miteksystems.misnap.core.DocumentExtraction documentExtraction = new com.miteksystems.misnap.core.DocumentExtraction(mrz, extractedData, extraction5 != null ? extraction5.getExtractedDataCorners() : null);
        if (documentExtraction.getMrz() == null && documentExtraction.getExtractedData() == null && documentExtraction.getExtractedDataCorners() == null) {
            return null;
        }
        return documentExtraction;
    }

    private static java.lang.String getHighSpeedVideoSizes(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
        com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType docType = miSnapSettings.analysis.document.advanced.getDocType();
        switch (docType == null ? -1 : com.miteksystems.misnap.controller.MiSnapController.WhenMappings.$EnumSwitchMapping$1[docType.ordinal()]) {
            case 1:
                return "Check_Front";
            case 2:
                return "Check_Back";
            case 3:
            case 4:
            case 5:
                return "ID_Front";
            case 6:
            case 7:
                return "ID_Back";
            case 8:
                return "Passport";
            case 9:
                return "Generic";
            default:
                return "";
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(com.miteksystems.misnap.core.DocumentClassification documentClassification) {
        switch (com.miteksystems.misnap.controller.MiSnapController.WhenMappings.$EnumSwitchMapping$2[documentClassification.getDocumentType().ordinal()]) {
            case 1:
                return "Unknown";
            case 2:
                return "ID_Front";
            case 3:
                return "ID_Back";
            case 4:
                return "DL_Front";
            case 5:
                return "DL_Back";
            case 6:
                return "RP_Front";
            case 7:
                return "Passport";
            case 8:
                return "Passport_Card";
            case 9:
                return "Generic_Front";
            case 10:
                return "Generic_Back";
            case 11:
                return "Education_ID";
            case 12:
                return "Gift_Card";
            case 13:
                return "Health_Insurance";
            case 14:
                return "Library_Card";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoSizes(java.util.List<? extends com.miteksystems.misnap.core.UserAction> list) {
        if (list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.miteksystems.misnap.core.UserAction) it.next()).toString());
        }
        return arrayList;
    }

    private final void getHighSpeedVideoFpsRangesFor(com.miteksystems.misnap.controller.a.b0 b0Var, boolean z) {
        com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str;
        boolean z2;
        com.miteksystems.misnap.core.Barcode barcode;
        com.miteksystems.misnap.core.Barcode.Type type;
        com.miteksystems.misnap.core.Barcode.Type type2;
        boolean z3 = b0Var instanceof com.miteksystems.misnap.controller.a.j;
        if (z3) {
            com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult documentIqasResult = ((com.miteksystems.misnap.controller.a.j) b0Var).getDocumentIqasResult();
            if (documentIqasResult != null) {
                this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFS", Camera2StreamConfigurationMap(documentIqasResult));
            }
        } else if (b0Var instanceof com.miteksystems.misnap.controller.a.f) {
            com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult documentIqasResult2 = ((com.miteksystems.misnap.controller.a.f) b0Var).getDocumentControllerResult().getDocumentIqasResult();
            if (documentIqasResult2 != null) {
                this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFS", Camera2StreamConfigurationMap(documentIqasResult2));
            }
        } else if ((b0Var instanceof com.miteksystems.misnap.controller.a.o) && (getHighResolutionOutputSizeshNQ4ISI = ((com.miteksystems.misnap.controller.a.o) b0Var).getGetHighResolutionOutputSizeshNQ4ISI()) != null) {
            this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFS", Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI));
        }
        if (z) {
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = this.getOutputFormats;
            str = com.miteksystems.misnap.controller.AnalysisSettings.isAutoTrigger(miSnapSettings.analysis, miSnapSettings.getUseCase()) ? "ForcedAuto" : "Manual";
        } else {
            str = "Auto";
        }
        boolean a2 = com.miteksystems.misnap.controller.a.w.a(b0Var, this.getOutputFormats);
        this.getOutputStallDurationlomOqCM.setFinalSettings(this.getOutputFormats);
        java.lang.String str2 = null;
        r21 = null;
        java.lang.String str3 = null;
        str2 = null;
        str2 = null;
        if (z3) {
            com.miteksystems.misnap.core.MibiData.Session session = this.getOutputStallDurationlomOqCM;
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputFormats);
            com.miteksystems.misnap.controller.a.j jVar = (com.miteksystems.misnap.controller.a.j) b0Var;
            java.lang.String highSpeedVideoFpsRanges = jVar.getClassification() != null ? getHighSpeedVideoFpsRanges(jVar.getClassification()) : "";
            com.miteksystems.misnap.core.DocumentExtraction extraction = jVar.getExtraction();
            z2 = (extraction != null ? extraction.getMrz() : null) != null;
            boolean shouldEnableEnhancedManual = com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableEnhancedManual(this.getOutputFormats.analysis.document);
            int[][] fourCorners = jVar.getFourCorners();
            java.lang.String str4 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
            java.lang.String str5 = com.miteksystems.misnap.document.DocumentAnalysisSettings.getOrientation(this.getOutputFormats.analysis.document, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
            java.util.List<java.lang.String> highSpeedVideoSizes2 = getHighSpeedVideoSizes(jVar.h());
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings2 = this.getOutputFormats;
            session.addSessionInfo(new com.miteksystems.misnap.core.MibiData.DocumentSessionInfo(highSpeedVideoSizes, highSpeedVideoFpsRanges, java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(a2), java.lang.Boolean.valueOf(shouldEnableEnhancedManual), str, fourCorners, str4, str5, highSpeedVideoSizes2, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings2.analysis, miSnapSettings2.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), java.lang.Boolean.valueOf(!com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(this.getOutputFormats.analysis.document))));
            return;
        }
        if (b0Var instanceof com.miteksystems.misnap.controller.a.b) {
            com.miteksystems.misnap.core.MibiData.Session session2 = this.getOutputStallDurationlomOqCM;
            com.miteksystems.misnap.core.Barcode barcode2 = ((com.miteksystems.misnap.controller.a.b) b0Var).getBarcode();
            if (barcode2 != null && (type2 = barcode2.getType()) != null) {
                str3 = type2.getCom.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE java.lang.String();
            }
            java.lang.String str6 = str3;
            java.lang.String str7 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
            java.lang.String str8 = com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.getOrientation(this.getOutputFormats.analysis.barcode, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings3 = this.getOutputFormats;
            session2.addSessionInfo(new com.miteksystems.misnap.core.MibiData.BarcodeSessionInfo(str6, str7, str8, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings3.analysis, miSnapSettings3.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries())));
            return;
        }
        if (!(b0Var instanceof com.miteksystems.misnap.controller.a.f)) {
            if (b0Var instanceof com.miteksystems.misnap.controller.a.o) {
                com.miteksystems.misnap.core.MibiData.Session session3 = this.getOutputStallDurationlomOqCM;
                z2 = this.getOutputFormats.analysis.face.getTrigger() == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE;
                java.lang.String str9 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
                java.util.List<java.lang.String> highSpeedVideoSizes3 = getHighSpeedVideoSizes(((com.miteksystems.misnap.controller.a.o) b0Var).e());
                com.miteksystems.misnap.core.MiSnapSettings miSnapSettings4 = this.getOutputFormats;
                session3.addSessionInfo(new com.miteksystems.misnap.core.MibiData.FaceSessionInfo(str, java.lang.Boolean.valueOf(z2), str9, highSpeedVideoSizes3, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings4.analysis, miSnapSettings4.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries())));
                return;
            }
            return;
        }
        com.miteksystems.misnap.core.MibiData.Session session4 = this.getOutputStallDurationlomOqCM;
        java.lang.String highSpeedVideoSizes4 = getHighSpeedVideoSizes(this.getOutputFormats);
        com.miteksystems.misnap.controller.a.f fVar = (com.miteksystems.misnap.controller.a.f) b0Var;
        java.lang.String highSpeedVideoFpsRanges2 = fVar.getDocumentControllerResult().getClassification() != null ? getHighSpeedVideoFpsRanges(fVar.getDocumentControllerResult().getClassification()) : "";
        com.miteksystems.misnap.core.DocumentExtraction extraction2 = fVar.getDocumentControllerResult().getExtraction();
        z2 = (extraction2 != null ? extraction2.getMrz() : null) != null;
        boolean shouldEnableEnhancedManual2 = com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableEnhancedManual(this.getOutputFormats.analysis.document);
        int[][] fourCorners2 = fVar.getDocumentControllerResult().getFourCorners();
        java.lang.String str10 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
        java.lang.String str11 = com.miteksystems.misnap.document.DocumentAnalysisSettings.getOrientation(this.getOutputFormats.analysis.document, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
        java.util.List<java.lang.String> highSpeedVideoSizes5 = getHighSpeedVideoSizes(fVar.getDocumentControllerResult().h());
        com.miteksystems.misnap.core.MiSnapSettings miSnapSettings5 = this.getOutputFormats;
        session4.addSessionInfo(new com.miteksystems.misnap.core.MibiData.DocumentSessionInfo(highSpeedVideoSizes4, highSpeedVideoFpsRanges2, java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(a2), java.lang.Boolean.valueOf(shouldEnableEnhancedManual2), str, fourCorners2, str10, str11, highSpeedVideoSizes5, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings5.analysis, miSnapSettings5.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries()), java.lang.Boolean.valueOf(!com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(this.getOutputFormats.analysis.document))));
        com.miteksystems.misnap.core.MibiData.Session session5 = this.getOutputStallDurationlomOqCM;
        com.miteksystems.misnap.controller.a.b barcodeControllerResult = fVar.getBarcodeControllerResult();
        if (barcodeControllerResult != null && (barcode = barcodeControllerResult.getBarcode()) != null && (type = barcode.getType()) != null) {
            str2 = type.getCom.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE java.lang.String();
        }
        java.lang.String str12 = str2;
        java.lang.String str13 = this.getInputSizeshNQ4ISI == 2 ? "Landscape" : "Portrait";
        java.lang.String str14 = com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.getOrientation(this.getOutputFormats.analysis.barcode, this.getInputSizeshNQ4ISI) == 2 ? "Landscape" : "Portrait";
        com.miteksystems.misnap.core.MiSnapSettings miSnapSettings6 = this.getOutputFormats;
        session5.addSessionInfo(new com.miteksystems.misnap.core.MibiData.BarcodeSessionInfo(str12, str13, str14, java.lang.Integer.valueOf(com.miteksystems.misnap.controller.AnalysisSettings.getImageQuality(miSnapSettings6.analysis, miSnapSettings6.getUseCase())), java.lang.System.currentTimeMillis() - this.getOutputStallDurationlomOqCM.getMetaData().getSessionStartTime(), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getAutoTries()), java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM.getMetaData().getManualTries())));
    }

    private final int[][] getHighSpeedVideoFpsRangesFor(com.miteksystems.misnap.core.Frame frame, int[][] iArr) {
        boolean z = this.getInputSizeshNQ4ISI == 1;
        com.miteksystems.misnap.controller.a.k kVar = com.miteksystems.misnap.controller.a.k.f3989a;
        return kVar.a(iArr, kVar.a(kVar.a(frame.getRotationDegrees()), z), frame.getImageSize().getWidth(), frame.getImageSize().getHeight());
    }

    private final com.miteksystems.misnap.controller.MiSnapController.Container getHighSpeedVideoFpsRanges(com.miteksystems.misnap.core.Frame frame, com.miteksystems.misnap.controller.a.b0 b0Var) {
        boolean contains = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{256, 17, java.lang.Integer.valueOf(com.miteksystems.misnap.core.ColorSpace.RGBA.getValue())}).contains(java.lang.Integer.valueOf(frame.getImageFormat()));
        com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = this.getOutputFormats;
        boolean z = com.miteksystems.misnap.controller.AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings.analysis, miSnapSettings.getUseCase()) && frame.getImageFormat() != 17;
        if (!contains || z) {
            this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFE", new java.lang.String[0]);
            com.miteksystems.misnap.core.LiveDataUtil liveDataUtil = com.miteksystems.misnap.core.LiveDataUtil.INSTANCE;
            androidx.view.MutableLiveData<com.miteksystems.misnap.controller.MiSnapController.ErrorResult> mutableLiveData = this.ArtificialStackFrames;
            com.miteksystems.misnap.controller.a.a0 a0Var = this.getHighSpeedVideoSizes;
            liveDataUtil.updateValue(mutableLiveData, a0Var instanceof com.miteksystems.misnap.controller.a.h ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentAnalysis(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure.ImageFormat.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.a ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.BarcodeAnalysis(com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure.ImageFormat.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.m ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.FaceAnalysis(com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure.InputFormat.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.e ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentAnalysis(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure.ImageFormat.INSTANCE) : a0Var instanceof com.miteksystems.misnap.controller.a.g ? new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentClassification(com.miteksystems.misnap.classifier.MiSnapDocumentClassifier.Result.Failure.ImageFormat.INSTANCE) : new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentDetection(com.miteksystems.misnap.detector.MiSnapDocumentDetector.Result.Failure.ImageFormat.INSTANCE));
            return new com.miteksystems.misnap.controller.MiSnapController.Container(new byte[0], null);
        }
        this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFF", new java.lang.String[0]);
        try {
            com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper compressionUtilNativeWrapper = this.Camera2StreamConfigurationMap;
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings2 = this.getOutputFormats;
            android.content.Context context = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            com.miteksystems.misnap.controller.MiSnapController.Container a2 = compressionUtilNativeWrapper.a(frame, miSnapSettings2, b0Var, context);
            if (a2 != null) {
                return a2;
            }
            this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFE", new java.lang.String[0]);
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(this.ArtificialStackFrames, getHighSpeedVideoSizes());
            return new com.miteksystems.misnap.controller.MiSnapController.Container(new byte[0], null);
        } catch (java.lang.Exception unused) {
            this.getOutputStallDurationlomOqCM.addUxpEvent("SMCFE", new java.lang.String[0]);
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(this.ArtificialStackFrames, getHighSpeedVideoSizes());
            return new com.miteksystems.misnap.controller.MiSnapController.Container(new byte[0], null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u0014\u0010/\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u0014\u00100\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u001a¨\u00063"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$Companion;", "", "Landroid/content/Context;", "activityContext", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "Lcom/miteksystems/misnap/controller/a/a0;", "a", "", "i", "k", "j", "f", "g", "e", "c", util.h.xy.cb.b.f1091, "d", "l", "n", "m", "h", "Lcom/miteksystems/misnap/controller/MiSnapController;", "create", "", "MIBI_DOC_TYPE_CHECK_BACK", "Ljava/lang/String;", "MIBI_DOC_TYPE_CHECK_FRONT", "MIBI_DOC_TYPE_DL_BACK", "MIBI_DOC_TYPE_DL_FRONT", "MIBI_DOC_TYPE_EDUCATION_ID", "MIBI_DOC_TYPE_GENERIC", "MIBI_DOC_TYPE_GENERIC_BACK", "MIBI_DOC_TYPE_GENERIC_FRONT", "MIBI_DOC_TYPE_GIFT_CARD", "MIBI_DOC_TYPE_HEALTH_INSURANCE", "MIBI_DOC_TYPE_ID_BACK", "MIBI_DOC_TYPE_ID_FRONT", "MIBI_DOC_TYPE_LIBRARY_CARD", "MIBI_DOC_TYPE_PASSPORT", "MIBI_DOC_TYPE_PASSPORT_CARD", "MIBI_DOC_TYPE_RP_FRONT", "MIBI_DOC_TYPE_UNKNOWN", "", "MOTION_DETECTOR_IN_MOTION_MAX_TIME", "J", "TRIGGER_MODE_AUTO", "TRIGGER_MODE_FORCED_AUTO", "TRIGGER_MODE_MANUAL", "<init>", "()V", "controller_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ boolean access$isMrzDocumentUseCase(com.miteksystems.misnap.controller.MiSnapController.Companion companion, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            return miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT;
        }

        private static boolean Camera2StreamConfigurationMap(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            if (com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(miSnapSettings.analysis.document) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE) {
                return (miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK) && com.miteksystems.misnap.document.DocumentAnalysisSettings.getDocumentExtractionRequirement(miSnapSettings.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
            }
            return false;
        }

        private static boolean getHighResolutionOutputSizeshNQ4ISI(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            if (com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableDocumentClassification(miSnapSettings.analysis.document)) {
                return (miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT) && com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(miSnapSettings.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE;
            }
            return false;
        }

        private static boolean getHighSpeedVideoFpsRangesFor(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            if (com.miteksystems.misnap.document.DocumentAnalysisSettings.getDocumentExtractionRequirement(miSnapSettings.analysis.document) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE) {
                return (miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK) && com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(miSnapSettings.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE && !com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableDocumentClassification(miSnapSettings.analysis.document);
            }
            return false;
        }

        @kotlin.jvm.JvmStatic
        public final com.miteksystems.misnap.controller.MiSnapController create(android.content.Context activityContext, com.miteksystems.misnap.core.MiSnapSettings settings) {
            com.miteksystems.misnap.controller.a.a0 lVar;
            com.miteksystems.misnap.controller.a.a0 hVar;
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation orientation;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            if (settings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE && settings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE && Camera2StreamConfigurationMap(settings) && settings.analysis.barcode.getOrientation() == null) {
                com.miteksystems.misnap.core.MiSnapSettings m10906clone = settings.m10906clone();
                com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation orientation2 = settings.analysis.document.getOrientation();
                if (orientation2 == null) {
                    orientation2 = com.miteksystems.misnap.document.DocumentAnalysisSettings.m10924default(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.INSTANCE);
                }
                com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode barcode = m10906clone.analysis.barcode;
                int i = com.miteksystems.misnap.controller.MiSnapController.Companion.WhenMappings.$EnumSwitchMapping$0[orientation2.ordinal()];
                if (i == 1) {
                    orientation = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation.LANDSCAPE;
                } else if (i == 2) {
                    orientation = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation.PORTRAIT;
                } else {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    orientation = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Orientation.DEVICE;
                }
                barcode.setOrientation(orientation);
                settings = m10906clone;
            }
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = settings;
            if (miSnapSettings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE) {
                if (miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE) {
                    hVar = new com.miteksystems.misnap.controller.a.m(miSnapSettings.analysis.face, miSnapSettings.getLicense(), null, false, null, 28, null);
                } else if ((getHighSpeedVideoFpsRanges(miSnapSettings) && new com.miteksystems.misnap.core.MiSnapSettings(miSnapSettings.getUseCase(), miSnapSettings.getLicense()).analysis.document.advanced.getDocType() != miSnapSettings.analysis.document.advanced.getDocType()) || (getHighSpeedVideoFpsRanges(miSnapSettings) && !Camera2StreamConfigurationMap(miSnapSettings) && !getHighSpeedVideoFpsRangesFor(miSnapSettings) && !getHighResolutionOutputSizeshNQ4ISI(miSnapSettings) && ((miSnapSettings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT && miSnapSettings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK) || ((miSnapSettings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT && miSnapSettings.getUseCase() != com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK) || com.miteksystems.misnap.document.DocumentAnalysisSettings.getDocumentExtractionRequirement(miSnapSettings.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE || com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(miSnapSettings.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE)))) {
                    hVar = new com.miteksystems.misnap.controller.a.h(activityContext, miSnapSettings.analysis.document, miSnapSettings.getLicense(), false, null, 24, null);
                } else if (Camera2StreamConfigurationMap(miSnapSettings)) {
                    lVar = new com.miteksystems.misnap.controller.a.e(activityContext, miSnapSettings, miSnapSettings.getLicense());
                } else if (getHighResolutionOutputSizeshNQ4ISI(miSnapSettings)) {
                    lVar = new com.miteksystems.misnap.controller.a.g(activityContext, miSnapSettings.analysis, miSnapSettings.getLicense());
                } else {
                    if (!getHighSpeedVideoFpsRangesFor(miSnapSettings)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Passed combination of use-case:");
                        sb.append(miSnapSettings.getUseCase());
                        sb.append(", document extraction requirement:");
                        sb.append(miSnapSettings.analysis.document.getDocumentExtractionRequirement());
                        sb.append(", and barcode extraction requirement:");
                        sb.append(miSnapSettings.analysis.document.getBarcodeExtractionRequirement());
                        sb.append(" and document classification:");
                        sb.append(miSnapSettings.analysis.document.getEnableDocumentClassification());
                        sb.append(" is currently not supported.");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    lVar = new com.miteksystems.misnap.controller.a.l(activityContext, miSnapSettings.analysis, miSnapSettings.getLicense());
                }
                return new com.miteksystems.misnap.controller.MiSnapController(activityContext, miSnapSettings, hVar, new com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper(), com.miteksystems.misnap.controller.a.p.INSTANCE.a(activityContext, miSnapSettings), null, 32, null);
            }
            lVar = new com.miteksystems.misnap.controller.a.a(activityContext, miSnapSettings.analysis.barcode, miSnapSettings.getLicense());
            hVar = lVar;
            return new com.miteksystems.misnap.controller.MiSnapController(activityContext, miSnapSettings, hVar, new com.miteksystems.misnap.controller.internal.CompressionUtilNativeWrapper(), com.miteksystems.misnap.controller.a.p.INSTANCE.a(activityContext, miSnapSettings), null, 32, null);
        }

        private static boolean getHighSpeedVideoFpsRanges(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            return miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT || miSnapSettings.getUseCase() == com.miteksystems.misnap.core.MiSnapSettings.UseCase.GENERIC_DOCUMENT;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.values().length];
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.LANDSCAPE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.PORTRAIT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Orientation.DEVICE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final /* synthetic */ boolean access$isDocumentUseCase(com.miteksystems.misnap.controller.MiSnapController.Companion companion, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
            return getHighSpeedVideoFpsRanges(miSnapSettings);
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ java.lang.Object access$analyzeFrame(com.miteksystems.misnap.controller.MiSnapController miSnapController, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.miteksystems.misnap.core.Frame frame, boolean z, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3(miSnapController, frame, z, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$getIadProcessingErrorUxp(com.miteksystems.misnap.controller.MiSnapController miSnapController, com.miteksystems.misnap.controller.a.q qVar) {
        com.miteksystems.misnap.controller.a.t tVar = qVar.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String();
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.a.f4001a)) {
            return "IPCCE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.b.f4002a)) {
            return "IPISE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.c.f4003a)) {
            return "IPITE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.d.f4004a)) {
            return "IPIFE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.e.f4005a)) {
            return "IPJEE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.f.f4006a)) {
            return "IPNNE";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(tVar, com.miteksystems.misnap.controller.a.t.g.f4007a)) {
            return "IPUKE";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02cc, code lost:
    
        if (r5 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ce, code lost:
    
        if (r10 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02df, code lost:
    
        com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(r19.getOutputStallDuration, r19.getHighResolutionOutputSizeshNQ4ISI(r2, r20, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ea, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02dd, code lost:
    
        if (r22 == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$handleControllerResult(com.miteksystems.misnap.controller.MiSnapController miSnapController, com.miteksystems.misnap.core.Frame frame, com.miteksystems.misnap.controller.a.b0 b0Var, boolean z) {
        com.miteksystems.misnap.core.MibiData.Session session;
        java.lang.String str;
        com.miteksystems.misnap.controller.a.a0 a0Var = miSnapController.getHighSpeedVideoSizes;
        if (a0Var instanceof com.miteksystems.misnap.controller.a.h) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
            com.miteksystems.misnap.controller.a.j jVar = (com.miteksystems.misnap.controller.a.j) b0Var;
            if (miSnapController.shouldHandleDeviceMotionFeedback$controller_release(jVar, z)) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar, frame, true));
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(jVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !z) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar, frame, false));
                return;
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(jVar, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges = miSnapController.getHighSpeedVideoFpsRanges(frame, jVar);
            byte[] imageBytes = highSpeedVideoFpsRanges.getImageBytes();
            com.miteksystems.misnap.core.DocumentExtraction Camera2StreamConfigurationMap = miSnapController.Camera2StreamConfigurationMap(jVar);
            java.util.List<com.miteksystems.misnap.core.UserAction> h = jVar.h();
            android.content.Context context = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis(imageBytes, Camera2StreamConfigurationMap, null, null, h, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context), jVar.getLicenseExpired(), highSpeedVideoFpsRanges.getRts());
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, documentAnalysis);
            return;
        }
        if (a0Var instanceof com.miteksystems.misnap.controller.a.a) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
            com.miteksystems.misnap.controller.a.b bVar = (com.miteksystems.misnap.controller.a.b) b0Var;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !z) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(bVar, frame, false));
                return;
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(bVar, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges2 = miSnapController.getHighSpeedVideoFpsRanges(frame, bVar);
            byte[] imageBytes2 = highSpeedVideoFpsRanges2.getImageBytes();
            com.miteksystems.misnap.core.Barcode barcode = bVar.getBarcode();
            java.util.List listOf = !kotlin.jvm.internal.Intrinsics.areEqual(bVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) ? kotlin.collections.CollectionsKt.listOf(bVar.getUserAction()) : kotlin.collections.CollectionsKt.emptyList();
            android.content.Context context2 = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis barcodeAnalysis = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis(imageBytes2, barcode, listOf, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context2), bVar.getLicenseExpired(), highSpeedVideoFpsRanges2.getRts());
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, barcodeAnalysis);
            return;
        }
        byte[] bArr = null;
        bArr = null;
        bArr = null;
        if (a0Var instanceof com.miteksystems.misnap.controller.a.e) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
            com.miteksystems.misnap.controller.a.f fVar = (com.miteksystems.misnap.controller.a.f) b0Var;
            if (miSnapController.shouldHandleDeviceMotionFeedback$controller_release(fVar, z)) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(fVar, frame, true));
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(fVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !z) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(fVar, frame, false));
                return;
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(fVar, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges3 = miSnapController.getHighSpeedVideoFpsRanges(frame, fVar);
            byte[] imageBytes3 = highSpeedVideoFpsRanges3.getImageBytes();
            com.miteksystems.misnap.controller.a.b barcodeControllerResult = fVar.getBarcodeControllerResult();
            com.miteksystems.misnap.core.Barcode barcode2 = barcodeControllerResult != null ? barcodeControllerResult.getBarcode() : null;
            java.util.List<com.miteksystems.misnap.core.UserAction> h2 = (fVar.getBarcodeControllerResult() == null || kotlin.jvm.internal.Intrinsics.areEqual(fVar.getBarcodeControllerResult().getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) ? fVar.getDocumentControllerResult().h() : kotlin.collections.CollectionsKt.plus((java.util.Collection) fVar.getDocumentControllerResult().h(), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(fVar.getBarcodeControllerResult().getUserAction()));
            android.content.Context context3 = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis2 = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis(imageBytes3, null, null, barcode2, h2, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context3), fVar.getDocumentControllerResult().getLicenseExpired(), highSpeedVideoFpsRanges3.getRts());
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, documentAnalysis2);
            return;
        }
        if (a0Var instanceof com.miteksystems.misnap.controller.a.l) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
            com.miteksystems.misnap.controller.a.j jVar2 = (com.miteksystems.misnap.controller.a.j) b0Var;
            if (miSnapController.shouldHandleDeviceMotionFeedback$controller_release(jVar2, z)) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar2, frame, true));
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(jVar2.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !z) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar2, frame, false));
                return;
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(jVar2, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges4 = miSnapController.getHighSpeedVideoFpsRanges(frame, jVar2);
            byte[] imageBytes4 = highSpeedVideoFpsRanges4.getImageBytes();
            com.miteksystems.misnap.core.DocumentExtraction Camera2StreamConfigurationMap2 = miSnapController.Camera2StreamConfigurationMap(jVar2);
            java.util.List<com.miteksystems.misnap.core.UserAction> h3 = jVar2.h();
            android.content.Context context4 = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context4, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis3 = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis(imageBytes4, Camera2StreamConfigurationMap2, null, null, h3, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context4), jVar2.getLicenseExpired(), highSpeedVideoFpsRanges4.getRts());
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, documentAnalysis3);
            return;
        }
        if (a0Var instanceof com.miteksystems.misnap.controller.a.g) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
            com.miteksystems.misnap.controller.a.j jVar3 = (com.miteksystems.misnap.controller.a.j) b0Var;
            if (miSnapController.shouldHandleDeviceMotionFeedback$controller_release(jVar3, z)) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar3, frame, true));
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(jVar3.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !z) {
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(jVar3, frame, false));
                return;
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(jVar3, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges5 = miSnapController.getHighSpeedVideoFpsRanges(frame, jVar3);
            byte[] imageBytes5 = highSpeedVideoFpsRanges5.getImageBytes();
            com.miteksystems.misnap.core.DocumentExtraction Camera2StreamConfigurationMap3 = miSnapController.Camera2StreamConfigurationMap(jVar3);
            com.miteksystems.misnap.core.DocumentClassification classification = jVar3.getClassification();
            java.util.List<com.miteksystems.misnap.core.UserAction> h4 = jVar3.h();
            android.content.Context context5 = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context5, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis4 = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis(imageBytes5, Camera2StreamConfigurationMap3, classification, null, h4, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context5), jVar3.getLicenseExpired(), highSpeedVideoFpsRanges5.getRts());
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, documentAnalysis4);
            return;
        }
        if (!(a0Var instanceof com.miteksystems.misnap.controller.a.m)) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(b0Var, "");
        com.miteksystems.misnap.controller.a.o oVar = (com.miteksystems.misnap.controller.a.o) b0Var;
        com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = miSnapController.getOutputFormats;
        boolean shouldEnableAiBasedRts = com.miteksystems.misnap.controller.AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings.analysis, miSnapSettings.getUseCase());
        if (!shouldEnableAiBasedRts) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(oVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
            }
            miSnapController.getHighSpeedVideoFpsRangesFor(oVar, z);
            com.miteksystems.misnap.controller.MiSnapController.Container highSpeedVideoFpsRanges6 = miSnapController.getHighSpeedVideoFpsRanges(frame, oVar);
            if (shouldEnableAiBasedRts) {
                com.miteksystems.misnap.controller.a.s a2 = miSnapController.getHighResolutionOutputSizeshNQ4ISI.a(highSpeedVideoFpsRanges6.getImageBytes(), frame.getFrameInfos());
                if (a2 instanceof com.miteksystems.misnap.controller.a.s.a) {
                    com.miteksystems.misnap.controller.a.s.a aVar = (com.miteksystems.misnap.controller.a.s.a) a2;
                    str = "IPNRE";
                    if (kotlin.jvm.internal.Intrinsics.areEqual(aVar.getError(), com.miteksystems.misnap.controller.a.r.e.f3998a)) {
                        miSnapController.getOutputStallDurationlomOqCM.addUxpEvent("IPNRE", new java.lang.String[0]);
                        com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, miSnapController.getHighResolutionOutputSizeshNQ4ISI(oVar, frame, false));
                        return;
                    }
                    session = miSnapController.getOutputStallDurationlomOqCM;
                    com.miteksystems.misnap.controller.a.r error = aVar.getError();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.miteksystems.misnap.controller.a.r.c.f3996a)) {
                        str = "IPIPE";
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.miteksystems.misnap.controller.a.r.d.f3997a)) {
                        str = "IPPKE";
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.miteksystems.misnap.controller.a.r.b.f3995a)) {
                        str = "IPEXE";
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(error, com.miteksystems.misnap.controller.a.r.a.f3994a)) {
                        str = "IPEEE";
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(error, com.miteksystems.misnap.controller.a.r.e.f3998a)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else if (a2 instanceof com.miteksystems.misnap.controller.a.s.b) {
                    com.miteksystems.misnap.controller.a.s.b bVar2 = (com.miteksystems.misnap.controller.a.s.b) a2;
                    if (bVar2.getPayload().length == 0) {
                        session = miSnapController.getOutputStallDurationlomOqCM;
                        str = "IPREE";
                    } else {
                        bArr = bVar2.getPayload();
                    }
                }
                session.addUxpEvent(str, new java.lang.String[0]);
                com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.ArtificialStackFrames, com.miteksystems.misnap.controller.MiSnapController.ErrorResult.AiBasedRtsProcessingError.INSTANCE);
            }
            byte[] imageBytes6 = highSpeedVideoFpsRanges6.getImageBytes();
            java.util.List<com.miteksystems.misnap.core.UserAction> e = oVar.e();
            android.content.Context context6 = miSnapController.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context6, "");
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis faceAnalysis = new com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis(imageBytes6, e, com.miteksystems.misnap.core.MibiData.toMiSnapMibiData(context6), oVar.getGetHighSpeedVideoFpsRanges(), highSpeedVideoFpsRanges6.getRts(), bArr);
            if (miSnapController.getOutputMinFrameDurationlomOqCM && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                return;
            }
            miSnapController.getOutputMinFrameDurationlomOqCM = true;
            com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.isOutputSupportedForhNQ4ISI, faceAnalysis);
            return;
        }
        boolean camera2StreamConfigurationMap = miSnapController.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap();
        java.lang.Object[] objArr = z && camera2StreamConfigurationMap;
        if (kotlin.jvm.internal.Intrinsics.areEqual(oVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
        }
    }

    public static final /* synthetic */ void access$logUserActionInUxp(com.miteksystems.misnap.controller.MiSnapController miSnapController, com.miteksystems.misnap.core.UserAction userAction) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(miSnapController.getHighSpeedVideoSizesFor, userAction)) {
            return;
        }
        miSnapController.getHighSpeedVideoSizesFor = userAction;
        miSnapController.getOutputStallDurationlomOqCM.addUxpEvent("SMCUA", userAction.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean shouldHandleDeviceMotionFeedback$controller_release(com.miteksystems.misnap.controller.a.b0 useCaseResult, boolean forceFrameResult) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseResult, "");
        if (!forceFrameResult) {
            com.miteksystems.misnap.core.MiSnapSettings miSnapSettings = this.getOutputFormats;
            if (com.miteksystems.misnap.controller.AnalysisSettings.getMotionDetectorSensitivity(miSnapSettings.analysis, miSnapSettings.getUseCase()) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE && this.toString) {
                z = true;
                boolean z2 = !this.getHighSpeedVideoFpsRangesFor.c() && this.getHighSpeedVideoFpsRangesFor.a().getValue() == com.miteksystems.misnap.controller.a.d.c.MOVING;
                if (kotlin.jvm.internal.Intrinsics.areEqual(useCaseResult.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) || !z || !z2) {
                    if (this.isOutputSupportedFor) {
                        this.unwrapAs.removeCallbacksAndMessages(this.getValidOutputFormatsForInputhNQ4ISI);
                        this.isOutputSupportedFor = false;
                    }
                    return false;
                }
                if (!this.isOutputSupportedFor) {
                    this.unwrapAs.postDelayed(this.getValidOutputFormatsForInputhNQ4ISI, 3000L);
                    this.isOutputSupportedFor = true;
                }
                if (useCaseResult instanceof com.miteksystems.misnap.controller.a.j) {
                    com.miteksystems.misnap.core.MibiData.Session session = this.getOutputStallDurationlomOqCM;
                    java.lang.String[] strArr = new java.lang.String[1];
                    com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult documentIqasResult = ((com.miteksystems.misnap.controller.a.j) useCaseResult).getDocumentIqasResult();
                    strArr[0] = java.lang.String.valueOf(documentIqasResult != null ? java.lang.Integer.valueOf(documentIqasResult.getSharpness()) : null);
                    session.addUxpEvent("SMCDM", strArr);
                } else if (useCaseResult instanceof com.miteksystems.misnap.controller.a.f) {
                    com.miteksystems.misnap.core.MibiData.Session session2 = this.getOutputStallDurationlomOqCM;
                    java.lang.String[] strArr2 = new java.lang.String[1];
                    com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentIqasResult documentIqasResult2 = ((com.miteksystems.misnap.controller.a.f) useCaseResult).getDocumentControllerResult().getDocumentIqasResult();
                    strArr2[0] = java.lang.String.valueOf(documentIqasResult2 != null ? java.lang.Integer.valueOf(documentIqasResult2.getSharpness()) : null);
                    session2.addUxpEvent("SMCDM", strArr2);
                } else {
                    this.getOutputStallDurationlomOqCM.addUxpEvent("SMCDM", new java.lang.String[0]);
                }
                return true;
            }
        }
        z = false;
        if (this.getHighSpeedVideoFpsRangesFor.c()) {
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(useCaseResult.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
        }
        if (this.isOutputSupportedFor) {
        }
        return false;
    }

    public final /* synthetic */ boolean willFocusBeforeFinalFrame$controller_release() {
        if (!this.getOutputMinFrameDuration.isLowerThan(com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.MEDIUM) && com.miteksystems.misnap.controller.MiSnapController.Companion.access$isDocumentUseCase(INSTANCE, this.getOutputFormats)) {
            return com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(this.getOutputFormats.analysis.document);
        }
        return false;
    }

    public final /* synthetic */ boolean shouldTrackFinalFrameDispatched$controller_release() {
        if (!this.getOutputMinFrameDuration.isLowerThan(com.miteksystems.misnap.core.DevicePerformanceUtil.PerformanceTier.MEDIUM) && com.miteksystems.misnap.controller.MiSnapController.Companion.access$isDocumentUseCase(INSTANCE, this.getOutputFormats)) {
            return !com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(this.getOutputFormats.analysis.document);
        }
        return true;
    }

    public final void release() {
        cancel();
        com.miteksystems.misnap.core.internal.ContextHelper.INSTANCE.reset();
        this.getHighSpeedVideoSizes.a();
        android.content.Context context = this.accessartificialFrame.get();
        java.lang.Object systemService = context != null ? context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        ((android.hardware.display.DisplayManager) systemService).unregisterDisplayListener(this.CoroutineDebuggingKt);
        getHighSpeedVideoFpsRanges();
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getHighSpeedVideoFpsRangesFor.f();
        this.getHighResolutionOutputSizeshNQ4ISI.a();
        this.unwrapAs.removeCallbacksAndMessages(this.getValidOutputFormatsForInputhNQ4ISI);
        this.isOutputSupportedFor = false;
        this.toString = true;
        java.lang.String name2 = com.miteksystems.misnap.controller.MiSnapController.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        com.miteksystems.misnap.core.MibiData.releaseSession(name2);
    }

    public final /* synthetic */ boolean isImageQualityPriority$controller_release() {
        if (com.miteksystems.misnap.controller.MiSnapController.Companion.access$isMrzDocumentUseCase(INSTANCE, this.getOutputFormats)) {
            return !com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(this.getOutputFormats.analysis.document);
        }
        return true;
    }

    /* renamed from: getSettings$controller_release, reason: from getter */
    public final /* synthetic */ com.miteksystems.misnap.core.MiSnapSettings getGetOutputFormats() {
        return this.getOutputFormats;
    }

    public final androidx.view.LiveData<com.miteksystems.misnap.controller.MiSnapController.FrameResult> getFrameResult() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public final androidx.view.LiveData<com.miteksystems.misnap.controller.MiSnapController.FeedbackResult> getFeedbackResult() {
        return this.getOutputStallDuration;
    }

    public final androidx.view.LiveData<com.miteksystems.misnap.controller.MiSnapController.ErrorResult> getErrorResult() {
        return this.ArtificialStackFrames;
    }

    /* renamed from: getController$controller_release, reason: from getter */
    public final /* synthetic */ com.miteksystems.misnap.controller.a.a0 getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void cancel() {
        kotlinx.coroutines.Job job = this.coroutineBoundary;
        if (job != null && job.isActive()) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.coroutineBoundary = null;
    }

    @kotlin.jvm.JvmStatic
    public static final com.miteksystems.misnap.controller.MiSnapController create(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings) {
        return INSTANCE.create(context, miSnapSettings);
    }

    public static /* synthetic */ void analyzeFrame$default(com.miteksystems.misnap.controller.MiSnapController miSnapController, com.miteksystems.misnap.core.Frame frame, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        miSnapController.analyzeFrame(frame, z);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "", "", "imageBytes", "", "rts", "<init>", "([BLjava/lang/String;)V", "component1", "()[B", "component2", "()Ljava/lang/String;", "copy", "([BLjava/lang/String;)Lcom/miteksystems/misnap/controller/MiSnapController$Container;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getImageBytes", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getRts"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Container {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] imageBytes;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String rts;

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Container(imageBytes=");
            sb.append(java.util.Arrays.toString(this.imageBytes));
            sb.append(", rts=");
            sb.append(this.rts);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.imageBytes);
            java.lang.String str = this.rts;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.controller.MiSnapController.Container)) {
                return false;
            }
            com.miteksystems.misnap.controller.MiSnapController.Container container = (com.miteksystems.misnap.controller.MiSnapController.Container) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.imageBytes, container.imageBytes) && kotlin.jvm.internal.Intrinsics.areEqual(this.rts, container.rts);
        }

        public final com.miteksystems.misnap.controller.MiSnapController.Container copy(byte[] imageBytes, java.lang.String rts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
            return new com.miteksystems.misnap.controller.MiSnapController.Container(imageBytes, rts);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRts() {
            return this.rts;
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        public static /* synthetic */ com.miteksystems.misnap.controller.MiSnapController.Container copy$default(com.miteksystems.misnap.controller.MiSnapController.Container container, byte[] bArr, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bArr = container.imageBytes;
            }
            if ((i & 2) != 0) {
                str = container.rts;
            }
            return container.copy(bArr, str);
        }

        public Container(byte[] bArr, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.imageBytes = bArr;
            this.rts = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "", "<init>", "()V", "AiBasedRtsProcessingError", "BarcodeAnalysis", "BarcodeDetection", "DocumentAnalysis", "DocumentClassification", "DocumentDetection", "FaceAnalysis", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$AiBasedRtsProcessingError;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$BarcodeAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$BarcodeDetection;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentClassification;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentDetection;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$FaceAnalysis;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ErrorResult {
        public /* synthetic */ ErrorResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$AiBasedRtsProcessingError;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AiBasedRtsProcessingError extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            public static final com.miteksystems.misnap.controller.MiSnapController.ErrorResult.AiBasedRtsProcessingError INSTANCE = new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.AiBasedRtsProcessingError();

            private AiBasedRtsProcessingError() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$BarcodeAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer$Result$Failure;", "a", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer$Result$Failure;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
        public static final class BarcodeAnalysis extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            private final com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure getHighSpeedVideoFpsRanges;

            /* renamed from: getError, reason: from getter */
            public final com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure getGetHighSpeedVideoFpsRanges() {
                return this.getHighSpeedVideoFpsRanges;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BarcodeAnalysis(com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.getHighSpeedVideoFpsRanges = failure;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$BarcodeDetection;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector$Result$Failure;", "a", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector$Result$Failure;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
        public static final class BarcodeDetection extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            private final com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Failure getHighSpeedVideoSizes;

            /* renamed from: getError, reason: from getter */
            public final com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Failure getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoSizes;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BarcodeDetection(com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.getHighSpeedVideoSizes = failure;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Failure;)V", "a", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Failure;"}, k = 1, mv = {1, 8, 0})
        public static final class DocumentAnalysis extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure error;

            public final com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure getError() {
                return this.error;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentAnalysis(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.error = failure;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentClassification;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/classifier/MiSnapDocumentClassifier$Result$Failure;", "a", "Lcom/miteksystems/misnap/classifier/MiSnapDocumentClassifier$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/classifier/MiSnapDocumentClassifier$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/classifier/MiSnapDocumentClassifier$Result$Failure;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
        public static final class DocumentClassification extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            private final com.miteksystems.misnap.classifier.MiSnapDocumentClassifier.Result.Failure getHighSpeedVideoFpsRangesFor;

            /* renamed from: getError, reason: from getter */
            public final com.miteksystems.misnap.classifier.MiSnapDocumentClassifier.Result.Failure getGetHighSpeedVideoFpsRangesFor() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentClassification(com.miteksystems.misnap.classifier.MiSnapDocumentClassifier.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.getHighSpeedVideoFpsRangesFor = failure;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$DocumentDetection;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/detector/MiSnapDocumentDetector$Result$Failure;", "a", "Lcom/miteksystems/misnap/detector/MiSnapDocumentDetector$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/detector/MiSnapDocumentDetector$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/detector/MiSnapDocumentDetector$Result$Failure;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
        public static final class DocumentDetection extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            private final com.miteksystems.misnap.detector.MiSnapDocumentDetector.Result.Failure getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getError, reason: from getter */
            public final com.miteksystems.misnap.detector.MiSnapDocumentDetector.Result.Failure getGetHighResolutionOutputSizeshNQ4ISI() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DocumentDetection(com.miteksystems.misnap.detector.MiSnapDocumentDetector.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.getHighResolutionOutputSizeshNQ4ISI = failure;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult$FaceAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$ErrorResult;", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Failure;", "a", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Failure;", "getError", "()Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Failure;", "error", "<init>", "(Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Failure;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
        public static final class FaceAnalysis extends com.miteksystems.misnap.controller.MiSnapController.ErrorResult {
            private final com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getError, reason: from getter */
            public final com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure getGetHighResolutionOutputSizeshNQ4ISI() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FaceAnalysis(com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure failure) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                this.getHighResolutionOutputSizeshNQ4ISI = failure;
            }
        }

        private ErrorResult() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "", "<init>", "()V", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "toServerResult", "()Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "BarcodeAnalysis", "DocumentAnalysis", "FaceAnalysis", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$BarcodeAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$DocumentAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$FaceAnalysis;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FrameResult {

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$BarcodeAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "<init>", "([BLcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;)V", "a", "[B", "getFrame", "()[B", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/Barcode;", "getBarcode", "()Lcom/miteksystems/misnap/core/Barcode;", "c", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "d", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "e", "Z", "getLicenseExpired", "()Z", "f", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0})
        public static final class BarcodeAnalysis extends com.miteksystems.misnap.controller.MiSnapController.FrameResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] frame;

            /* renamed from: b, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.Barcode barcode;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

            /* renamed from: d, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

            /* renamed from: e, reason: from kotlin metadata */
            private final boolean licenseExpired;

            /* renamed from: f, reason: from kotlin metadata */
            private final java.lang.String rts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public BarcodeAnalysis(byte[] bArr, com.miteksystems.misnap.core.Barcode barcode, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
                this.frame = bArr;
                this.barcode = barcode;
                this.warnings = list;
                this.misnapMibiData = miSnapMibiData;
                this.licenseExpired = z;
                this.rts = str;
            }

            public /* synthetic */ BarcodeAnalysis(byte[] bArr, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(bArr, (i & 2) != 0 ? null : barcode, list, miSnapMibiData, z, (i & 32) != 0 ? null : str);
            }

            public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
                return this.warnings;
            }

            public final java.lang.String getRts() {
                return this.rts;
            }

            public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
                return this.misnapMibiData;
            }

            public final boolean getLicenseExpired() {
                return this.licenseExpired;
            }

            public final byte[] getFrame() {
                return this.frame;
            }

            public final com.miteksystems.misnap.core.Barcode getBarcode() {
                return this.barcode;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$DocumentAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/core/DocumentExtraction;", "extraction", "Lcom/miteksystems/misnap/core/DocumentClassification;", "classification", "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "<init>", "([BLcom/miteksystems/misnap/core/DocumentExtraction;Lcom/miteksystems/misnap/core/DocumentClassification;Lcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;)V", "a", "[B", "getFrame", "()[B", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/DocumentExtraction;", "getExtraction", "()Lcom/miteksystems/misnap/core/DocumentExtraction;", "c", "Lcom/miteksystems/misnap/core/DocumentClassification;", "getClassification", "()Lcom/miteksystems/misnap/core/DocumentClassification;", "d", "Lcom/miteksystems/misnap/core/Barcode;", "getBarcode", "()Lcom/miteksystems/misnap/core/Barcode;", "e", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "f", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "g", "Z", "getLicenseExpired", "()Z", "h", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0})
        public static final class DocumentAnalysis extends com.miteksystems.misnap.controller.MiSnapController.FrameResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] frame;

            /* renamed from: b, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.DocumentExtraction extraction;

            /* renamed from: c, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.DocumentClassification classification;

            /* renamed from: d, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.Barcode barcode;

            /* renamed from: e, reason: from kotlin metadata */
            private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

            /* renamed from: f, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

            /* renamed from: g, reason: from kotlin metadata */
            private final boolean licenseExpired;

            /* renamed from: h, reason: from kotlin metadata */
            private final java.lang.String rts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public DocumentAnalysis(byte[] bArr, com.miteksystems.misnap.core.DocumentExtraction documentExtraction, com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.Barcode barcode, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
                this.frame = bArr;
                this.extraction = documentExtraction;
                this.classification = documentClassification;
                this.barcode = barcode;
                this.warnings = list;
                this.misnapMibiData = miSnapMibiData;
                this.licenseExpired = z;
                this.rts = str;
            }

            public /* synthetic */ DocumentAnalysis(byte[] bArr, com.miteksystems.misnap.core.DocumentExtraction documentExtraction, com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(bArr, (i & 2) != 0 ? null : documentExtraction, (i & 4) != 0 ? null : documentClassification, (i & 8) != 0 ? null : barcode, list, miSnapMibiData, z, (i & 128) != 0 ? null : str);
            }

            public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
                return this.warnings;
            }

            public final java.lang.String getRts() {
                return this.rts;
            }

            public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
                return this.misnapMibiData;
            }

            public final boolean getLicenseExpired() {
                return this.licenseExpired;
            }

            public final byte[] getFrame() {
                return this.frame;
            }

            public final com.miteksystems.misnap.core.DocumentExtraction getExtraction() {
                return this.extraction;
            }

            public final com.miteksystems.misnap.core.DocumentClassification getClassification() {
                return this.classification;
            }

            public final com.miteksystems.misnap.core.Barcode getBarcode() {
                return this.barcode;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult$FaceAnalysis;", "Lcom/miteksystems/misnap/controller/MiSnapController$FrameResult;", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "aiBasedRts", "<init>", "([BLjava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;[B)V", "a", "[B", "getFrame", "()[B", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "c", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "d", "Z", "getLicenseExpired", "()Z", "e", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;", "f", "getAiBasedRts"}, k = 1, mv = {1, 8, 0})
        public static final class FaceAnalysis extends com.miteksystems.misnap.controller.MiSnapController.FrameResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] frame;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

            /* renamed from: c, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

            /* renamed from: d, reason: from kotlin metadata */
            private final boolean licenseExpired;

            /* renamed from: e, reason: from kotlin metadata */
            private final java.lang.String rts;

            /* renamed from: f, reason: from kotlin metadata */
            private final byte[] aiBasedRts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FaceAnalysis(byte[] bArr, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, byte[] bArr2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
                this.frame = bArr;
                this.warnings = list;
                this.misnapMibiData = miSnapMibiData;
                this.licenseExpired = z;
                this.rts = str;
                this.aiBasedRts = bArr2;
            }

            public /* synthetic */ FaceAnalysis(byte[] bArr, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, byte[] bArr2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(bArr, list, miSnapMibiData, z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bArr2);
            }

            public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
                return this.warnings;
            }

            public final java.lang.String getRts() {
                return this.rts;
            }

            public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
                return this.misnapMibiData;
            }

            public final boolean getLicenseExpired() {
                return this.licenseExpired;
            }

            public final byte[] getFrame() {
                return this.frame;
            }

            public final byte[] getAiBasedRts() {
                return this.aiBasedRts;
            }
        }

        public /* synthetic */ FrameResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult toServerResult() {
            if (this instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis) {
                com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis barcodeAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.BarcodeAnalysis) this;
                return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult(barcodeAnalysis.getFrame(), barcodeAnalysis.getBarcode(), barcodeAnalysis.getRts());
            }
            if (this instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis) {
                com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis documentAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.DocumentAnalysis) this;
                return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult(documentAnalysis.getFrame(), documentAnalysis.getBarcode(), documentAnalysis.getRts());
            }
            if (!(this instanceof com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis faceAnalysis = (com.miteksystems.misnap.controller.MiSnapController.FrameResult.FaceAnalysis) this;
            return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult(faceAnalysis.getFrame(), faceAnalysis.getRts(), faceAnalysis.getAiBasedRts());
        }

        private FrameResult() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.GENERIC_DOCUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.values().length];
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.CHECK_FRONT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.CHECK_BACK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.ID_FRONT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.ONE_LINE_MRZ.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.TD2.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.ID_BACK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.TD1.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.PASSPORT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Advanced.DocType.GENERIC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.miteksystems.misnap.core.DocumentClassification.Type.values().length];
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.ID_FRONT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.ID_BACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.DL_FRONT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.DL_BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.RP_FRONT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.PASSPORT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.PASSPORT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.GENERIC_FRONT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.GENERIC_BACK.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.EDUCATION_ID.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.GIFT_CARD.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.HEALTH_INSURANCE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.DocumentClassification.Type.LIBRARY_CARD.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}

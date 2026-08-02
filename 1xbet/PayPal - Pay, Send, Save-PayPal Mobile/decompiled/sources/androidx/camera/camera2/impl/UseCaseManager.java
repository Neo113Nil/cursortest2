package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002¦\u0001B©\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00103\u001a\u00020*2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020*2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b5\u00104J\u0015\u00107\u001a\u00020*2\u0006\u00106\u001a\u000201¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020*2\u0006\u00106\u001a\u000201¢\u0006\u0004\b9\u00108J\u0015\u0010:\u001a\u00020*2\u0006\u00106\u001a\u000201¢\u0006\u0004\b:\u00108J\u0015\u0010;\u001a\u00020*2\u0006\u00106\u001a\u000201¢\u0006\u0004\b;\u00108J\u0015\u0010=\u001a\u00020*2\u0006\u0010<\u001a\u00020(¢\u0006\u0004\b=\u0010,J\u0017\u0010?\u001a\u0004\u0018\u00010*2\u0006\u0010>\u001a\u00020(¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020*H\u0086@¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020*H\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\u00020*2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010\fH\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020*2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010\fH\u0002¢\u0006\u0004\bK\u0010JJ)\u0010R\u001a\u00020Q2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020(H\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010K\u001a\u00020*H\u0002¢\u0006\u0004\bK\u0010GJ\u0017\u0010V\u001a\u00020*2\u0006\u0010U\u001a\u00020TH\u0000¢\u0006\u0004\bV\u0010WJ\u0017\u0010F\u001a\u00020*2\u0006\u0010H\u001a\u00020QH\u0002¢\u0006\u0004\bF\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u0002010\f¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020(2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010\fH\u0002¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020(2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010\fH\u0002¢\u0006\u0004\b]\u0010\\J\u001d\u0010F\u001a\u00020(2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010\fH\u0002¢\u0006\u0004\bF\u0010\\J\u000f\u0010[\u001a\u00020*H\u0002¢\u0006\u0004\b[\u0010GJ\u000f\u0010]\u001a\u00020*H\u0002¢\u0006\u0004\b]\u0010GJ\u000f\u0010I\u001a\u00020^H\u0002¢\u0006\u0004\bI\u0010_J\u000f\u0010`\u001a\u00020*H\u0002¢\u0006\u0004\b`\u0010GR\u0014\u0010I\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010K\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010F\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010]\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010kR\u0014\u0010`\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010qR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u0014\u0010a\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010n\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010yR\u0014\u0010p\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010zR\u0014\u0010}\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R5\u0010\u0080\u0001\u001a\u0004\u0018\u00010~2\b\u0010\u007f\u001a\u0004\u0018\u00010~8A@AX\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0086\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010kR\u001b\u0010D\u001a\t\u0012\u0004\u0012\u0002010\u0086\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010kR\u0018\u0010\u0089\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b[\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u0019\u0010{\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b}\u0010\u008c\u0001R\u0019\u0010\u008e\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0088\u0001R\u001d\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0086\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010kR\u0017\u0010u\u001a\u00030\u0090\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0091\u0001R\u0017\u0010i\u001a\u00030\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010g\u001a\u00030\u0095\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0096\u0001R$\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020T0\u0097\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0098\u0001R\u001a\u0010s\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bI\u0010\u009a\u0001R\u0017\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018G¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¢\u0001\u001a\u0005\u0018\u00010\u009f\u00018G¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010¥\u0001R \u0010\u008f\u0001\u001a\r\u0012\b\u0012\u0006*\u00020\r0\r0\u0086\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010k"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseManager;", "", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/core/concurrent/CameraCoordinator;", "cameraCoordinator", "Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "builder", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "controls", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "camera2CameraControl", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "Ljavax/inject/Provider;", "Landroidx/camera/core/impl/CameraInternal;", "cameraInternal", "Landroidx/camera/camera2/impl/UseCaseThreads;", "useCaseThreads", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "encoderProfilesProvider", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "cameraGraphConfigProvider", "Landroid/content/Context;", "context", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "displayInfoManager", "<init>", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/core/concurrent/CameraCoordinator;Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/impl/LowLightBoostControl;Ljava/util/Set;Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/camera/camera2/adapter/CameraStateAdapter;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Landroidx/camera/core/impl/EncoderProfilesProvider;Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/core/CameraXConfig;Landroidx/camera/camera2/impl/CameraGraphConfigProvider;Landroid/content/Context;Landroidx/camera/camera2/impl/DisplayInfoManager;)V", "", "createImmediately", "", "setCameraGraphCreationMode$camera_camera2", "(Z)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig$camera_camera2", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "", "Landroidx/camera/core/UseCase;", "useCases", "attach", "(Ljava/util/List;)V", "detach", "useCase", "activate", "(Landroidx/camera/core/UseCase;)V", "deactivate", "update", "reset", "isPrimary", "setPrimary", "enabled", "setActiveResumeMode", "(Z)Lkotlin/Unit;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "()V", "p0", "getHighSpeedVideoSizes", "(Ljava/util/Set;)V", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "graphStateToCameraStateAdapter", "isExtensions", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "createUseCaseCameraConfig$camera_camera2", "(Landroidx/camera/camera2/adapter/SessionConfigAdapter;Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Z)Landroidx/camera/camera2/config/UseCaseCameraConfig;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "resumeDeferredComponentCreation$camera_camera2", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "(Landroidx/camera/camera2/config/UseCaseCameraConfig;)V", "getRunningUseCasesForTest", "()Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "(Ljava/util/Set;)Z", "getHighSpeedVideoFpsRangesFor", "", "()I", "getOutputFormats", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/camera2/pipe/CameraPipe;", "getInputSizeshNQ4ISI", "Landroidx/camera/core/concurrent/CameraCoordinator;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "a", "Landroidx/camera/camera2/adapter/ZslControl;", "ArtificialStackFrames", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "Ljava/util/Set;", "getInputFormats", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "getOutputSizes", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "getOutputSizeshNQ4ISI", "Ljavax/inject/Provider;", "getOutputMinFrameDuration", "_BOUNDARY", "getOutputStallDurationlomOqCM", "accessartificialFrame", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "getOutputStallDuration", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "coroutineBoundary", "Ljava/lang/Object;", "isOutputSupportedFor", "Landroidx/camera/core/impl/SessionProcessor;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "sessionProcessor", "Landroidx/camera/core/impl/SessionProcessor;", "getSessionProcessor$camera_camera2", "()Landroidx/camera/core/impl/SessionProcessor;", "setSessionProcessor$camera_camera2", "(Landroidx/camera/core/impl/SessionProcessor;)V", "", "getValidOutputFormatsForInputhNQ4ISI", "Z", "unwrapAs", "getARTIFICIAL_FRAME_PACKAGE_NAME", "isOutputSupportedForhNQ4ISI", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "CoroutineDebuggingKt", "coroutineCreation", "_CREATION", "Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/camera2/impl/MeteringRepeating;", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", util.h.xy.cb.b.f1091, "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination;", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "Landroidx/camera/camera2/internal/DynamicRangeResolver;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "Landroidx/camera/camera2/config/UseCaseCameraComponent;", "Landroidx/camera/camera2/config/UseCaseCameraComponent;", "Landroidx/camera/camera2/impl/UseCaseCamera;", "getCamera", "()Landroidx/camera/camera2/impl/UseCaseCamera;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/config/UseCaseGraphContext;", "getUseCaseGraphContext", "()Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "", "Lkotlinx/coroutines/Job;", "Ljava/util/List;", "RunningUseCasesChangeListener"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseCaseManager {

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.LowLightBoostControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.core.UseCase> toString;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private boolean coroutineCreation;

    /* renamed from: _BOUNDARY, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseThreads> getInputFormats;

    /* renamed from: _CREATION, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.core.UseCase> CoroutineDebuggingKt;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.adapter.ZslControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProvider getOutputMinFrameDurationlomOqCM;

    /* renamed from: b, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination ArtificialStackFrames;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final java.lang.Object isOutputSupportedFor;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.MeteringRepeating accessartificialFrame;

    /* renamed from: getARTIFICIAL_FRAME_PACKAGE_NAME, reason: from kotlin metadata */
    private boolean isOutputSupportedForhNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl> _CREATION;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean unwrapAs;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.core.UseCase> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile androidx.camera.camera2.config.UseCaseCameraComponent _BOUNDARY;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.UseCaseCameraComponent.Builder getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.interop.Camera2CameraControl getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.concurrent.CameraCoordinator Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraGraphConfigProvider getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.core.impl.CameraInfoInternal> getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe getHighSpeedVideoSizes;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.CameraStateAdapter getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.core.impl.CameraInternal> getOutputMinFrameDuration;
    private final androidx.camera.camera2.impl.CameraProperties getOutputStallDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.core.CameraXConfig getOutputSizes;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlinx.coroutines.Job> getARTIFICIAL_FRAME_PACKAGE_NAME;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private androidx.camera.camera2.config.UseCaseCameraConfig coroutineBoundary;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.CameraGraph.Config, androidx.camera.camera2.pipe.CameraGraph> b;
    private androidx.camera.core.impl.SessionProcessor sessionProcessor;

    /* renamed from: toString, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl> getHighSpeedVideoSizesFor;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final androidx.camera.camera2.internal.DynamicRangeResolver a;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "", "onRunningUseCasesChanged", "(Ljava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RunningUseCasesChangeListener {
        void onRunningUseCasesChanged(java.util.Set<? extends androidx.camera.core.UseCase> runningUseCases);
    }

    @javax.inject.Inject
    public UseCaseManager(androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.camera2.config.UseCaseCameraComponent.Builder builder, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl> set, androidx.camera.camera2.interop.Camera2CameraControl camera2CameraControl, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter, javax.inject.Provider<androidx.camera.core.impl.CameraInternal> provider, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, javax.inject.Provider<androidx.camera.core.impl.CameraInfoInternal> provider3, androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.camera2.impl.CameraGraphConfigProvider cameraGraphConfigProvider, android.content.Context context, androidx.camera.camera2.impl.DisplayInfoManager displayInfoManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zslControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowLightBoostControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2CameraControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStateAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderProfilesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphConfigProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayInfoManager, "");
        this.getHighSpeedVideoSizes = cameraPipe;
        this.Camera2StreamConfigurationMap = cameraCoordinator;
        this.getHighSpeedVideoFpsRanges = builder;
        this.getHighResolutionOutputSizeshNQ4ISI = zslControl;
        this.getHighSpeedVideoFpsRangesFor = lowLightBoostControl;
        this.getHighSpeedVideoSizesFor = set;
        this.getOutputFormats = camera2CameraControl;
        this.getInputSizeshNQ4ISI = cameraStateAdapter;
        this.getOutputMinFrameDuration = provider;
        this.getInputFormats = provider2;
        this.getOutputStallDurationlomOqCM = provider3;
        this.getOutputMinFrameDurationlomOqCM = encoderProfilesProvider;
        this.getOutputStallDuration = cameraProperties;
        this.getOutputSizes = cameraXConfig;
        this.getOutputSizeshNQ4ISI = cameraGraphConfigProvider;
        this.isOutputSupportedFor = new java.lang.Object();
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.LinkedHashSet();
        this.toString = new java.util.LinkedHashSet();
        this.isOutputSupportedForhNQ4ISI = true;
        this.coroutineCreation = true;
        this.CoroutineDebuggingKt = new java.util.LinkedHashSet();
        this.accessartificialFrame = new androidx.camera.camera2.impl.MeteringRepeating.Builder(cameraProperties, displayInfoManager).build();
        this.ArtificialStackFrames = new androidx.camera.camera2.adapter.SupportedSurfaceCombination(context, cameraProperties.getMetadata(), encoderProfilesProvider, androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY);
        this.a = new androidx.camera.camera2.internal.DynamicRangeResolver(cameraProperties.getMetadata());
        this.b = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.impl.UseCaseManager.m144$r8$lambda$igoGai8aYKmFGamYaqvkUAnVWM(androidx.camera.camera2.impl.UseCaseManager.this, (androidx.camera.camera2.pipe.CameraGraph.Config) obj);
            }
        };
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new java.util.ArrayList();
        java.util.Set<androidx.camera.camera2.impl.UseCaseCameraControl> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(set);
        mutableSet.add(camera2CameraControl);
        this._CREATION = mutableSet;
    }

    public final androidx.camera.core.impl.SessionProcessor getSessionProcessor$camera_camera2() {
        androidx.camera.core.impl.SessionProcessor sessionProcessor;
        synchronized (this.isOutputSupportedFor) {
            sessionProcessor = this.sessionProcessor;
        }
        return sessionProcessor;
    }

    public final void setSessionProcessor$camera_camera2(androidx.camera.core.impl.SessionProcessor sessionProcessor) {
        synchronized (this.isOutputSupportedFor) {
            this.sessionProcessor = sessionProcessor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final androidx.camera.camera2.impl.UseCaseCamera getCamera() {
        androidx.camera.camera2.config.UseCaseCameraComponent useCaseCameraComponent = this._BOUNDARY;
        if (useCaseCameraComponent != null) {
            return useCaseCameraComponent.getUseCaseCamera();
        }
        return null;
    }

    public final androidx.camera.camera2.config.UseCaseGraphContext getUseCaseGraphContext() {
        androidx.camera.camera2.config.UseCaseCameraComponent useCaseCameraComponent = this._BOUNDARY;
        if (useCaseCameraComponent != null) {
            return useCaseCameraComponent.getUseCaseGraphContext();
        }
        return null;
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean createImmediately) {
        synchronized (this.isOutputSupportedFor) {
            this.isOutputSupportedForhNQ4ISI = createImmediately;
            if (createImmediately) {
                this.coroutineBoundary = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final androidx.camera.camera2.pipe.CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        androidx.camera.camera2.pipe.CameraGraph.Config cameraGraphConfig;
        synchronized (this.isOutputSupportedFor) {
            androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig = this.coroutineBoundary;
            cameraGraphConfig = useCaseCameraConfig != null ? useCaseCameraConfig.getCameraGraphConfig() : null;
        }
        return cameraGraphConfig;
    }

    public final void attach(java.util.List<? extends androidx.camera.core.UseCase> useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        synchronized (this.isOutputSupportedFor) {
            if (useCases.isEmpty()) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return;
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(useCases);
                toString();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : useCases) {
                if (!this.getValidOutputFormatsForInputhNQ4ISI.contains((androidx.camera.core.UseCase) obj)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.UseCase) it.next()).onSessionStart();
            }
            if (this.getValidOutputFormatsForInputhNQ4ISI.addAll(useCases) && !getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.intersect(this.getValidOutputFormatsForInputhNQ4ISI, this.toString))) {
                getOutputFormats();
                this.getHighSpeedVideoFpsRangesFor.onSessionConfigChanged(kotlin.collections.CollectionsKt.toList(this.getValidOutputFormatsForInputhNQ4ISI));
                Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI);
            }
            if (!this.isOutputSupportedForhNQ4ISI) {
                this.CoroutineDebuggingKt.addAll(arrayList2);
            } else {
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((androidx.camera.core.UseCase) it2.next()).onCameraControlReady();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void detach(java.util.List<? extends androidx.camera.core.UseCase> useCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        synchronized (this.isOutputSupportedFor) {
            if (useCases.isEmpty()) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return;
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(useCases);
                toString();
            }
            this.toString.removeAll(useCases);
            for (androidx.camera.core.UseCase useCase : useCases) {
                if (this.getValidOutputFormatsForInputhNQ4ISI.contains(useCase)) {
                    useCase.onSessionStop();
                }
            }
            if (this.getValidOutputFormatsForInputhNQ4ISI.removeAll(useCases)) {
                if (getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.intersect(this.getValidOutputFormatsForInputhNQ4ISI, this.toString))) {
                    return;
                }
                if (this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setZslDisabledByUserCaseConfig(false);
                    this.getHighSpeedVideoFpsRangesFor.onSessionConfigChanged(kotlin.collections.CollectionsKt.emptyList());
                } else {
                    getOutputFormats();
                    this.getHighSpeedVideoFpsRangesFor.onSessionConfigChanged(kotlin.collections.CollectionsKt.toList(this.getValidOutputFormatsForInputhNQ4ISI));
                }
                Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI);
            }
            this.CoroutineDebuggingKt.removeAll(useCases);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void activate(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        synchronized (this.isOutputSupportedFor) {
            if (this.toString.add(useCase)) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void deactivate(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        synchronized (this.isOutputSupportedFor) {
            if (this.toString.remove(useCase)) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void update(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        synchronized (this.isOutputSupportedFor) {
            if (this.getValidOutputFormatsForInputhNQ4ISI.contains(useCase)) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void reset(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        synchronized (this.isOutputSupportedFor) {
            if (this.getValidOutputFormatsForInputhNQ4ISI.contains(useCase)) {
                Camera2StreamConfigurationMap(this.getValidOutputFormatsForInputhNQ4ISI);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void setPrimary(boolean isPrimary) {
        synchronized (this.isOutputSupportedFor) {
            this.coroutineCreation = isPrimary;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final kotlin.Unit setActiveResumeMode(boolean enabled) {
        kotlin.Unit unit;
        synchronized (this.isOutputSupportedFor) {
            this.unwrapAs = enabled;
            androidx.camera.camera2.impl.UseCaseCamera camera = getCamera();
            if (camera != null) {
                camera.setActiveResumeMode(enabled);
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        return unit;
    }

    public final java.lang.Object close(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.List list;
        synchronized (this.isOutputSupportedFor) {
            Camera2StreamConfigurationMap();
            this.accessartificialFrame.onUnbind();
            list = kotlin.collections.CollectionsKt.toList(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        }
        java.lang.Object joinAll = kotlinx.coroutines.AwaitKt.joinAll(list, continuation);
        return joinAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? joinAll : kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UseCaseManager<");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getValidOutputFormatsForInputhNQ4ISI.isEmpty()) {
            return;
        }
        java.util.Set<? extends androidx.camera.core.UseCase> intersect = kotlin.collections.CollectionsKt.intersect(this.getValidOutputFormatsForInputhNQ4ISI, this.toString);
        if (getHighResolutionOutputSizeshNQ4ISI(intersect)) {
            getHighSpeedVideoFpsRanges();
        } else if (intersect.contains(this.accessartificialFrame) && !getHighSpeedVideoFpsRangesFor(intersect)) {
            getHighSpeedVideoFpsRangesFor();
        } else {
            getHighSpeedVideoSizes(intersect);
        }
    }

    private final void getHighSpeedVideoSizes(java.util.Set<? extends androidx.camera.core.UseCase> p0) {
        androidx.camera.camera2.impl.UseCaseCamera camera = getCamera();
        if (camera != null) {
            camera.updateRepeatingRequestAsync(this.coroutineCreation, p0);
            for (androidx.camera.camera2.impl.UseCaseCameraControl useCaseCameraControl : this._CREATION) {
                if (useCaseCameraControl instanceof androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener) {
                    ((androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener) useCaseCameraControl).onRunningUseCasesChanged(p0);
                }
            }
        }
    }

    private final void Camera2StreamConfigurationMap(java.util.Set<? extends androidx.camera.core.UseCase> p0) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> implementationType;
        java.lang.Integer num;
        Camera2StreamConfigurationMap();
        java.util.List list = kotlin.collections.CollectionsKt.toList(p0);
        if (list.isEmpty()) {
            for (androidx.camera.camera2.impl.UseCaseCameraControl useCaseCameraControl : this._CREATION) {
                useCaseCameraControl.setRequestControl(null);
                useCaseCameraControl.reset();
            }
            return;
        }
        if (!this.isOutputSupportedForhNQ4ISI) {
            java.util.Iterator<androidx.camera.camera2.impl.UseCaseCameraControl> it = this._CREATION.iterator();
            while (it.hasNext()) {
                it.next().setRequestControl(null);
            }
        }
        androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = new androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter(this.getInputSizeshNQ4ISI);
        androidx.camera.core.impl.SessionProcessor sessionProcessor$camera_camera2 = getSessionProcessor$camera_camera2();
        boolean z = false;
        if (sessionProcessor$camera_camera2 != null && (implementationType = sessionProcessor$camera_camera2.getImplementationType()) != null && (num = (java.lang.Integer) implementationType.first) != null && num.intValue() == 1) {
            z = true;
        }
        androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter = new androidx.camera.camera2.adapter.SessionConfigAdapter(list, this.coroutineCreation);
        if (z) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            androidx.camera.core.impl.SessionProcessor sessionProcessor$camera_camera22 = getSessionProcessor$camera_camera2();
            kotlin.jvm.internal.Intrinsics.checkNotNull(sessionProcessor$camera_camera22);
            sessionProcessor$camera_camera22.initSession(this.getOutputStallDurationlomOqCM.get(), null);
        }
        androidx.camera.camera2.config.UseCaseCameraConfig createUseCaseCameraConfig$camera_camera2 = createUseCaseCameraConfig$camera_camera2(sessionConfigAdapter, graphStateToCameraStateAdapter, z);
        if (!this.isOutputSupportedForhNQ4ISI) {
            this.coroutineBoundary = createUseCaseCameraConfig$camera_camera2;
            this.Camera2StreamConfigurationMap.addPendingCameraInfo(this.getOutputStallDurationlomOqCM.get());
        } else {
            getHighResolutionOutputSizeshNQ4ISI(createUseCaseCameraConfig$camera_camera2);
        }
    }

    public static /* synthetic */ androidx.camera.camera2.config.UseCaseCameraConfig createUseCaseCameraConfig$camera_camera2$default(androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return useCaseManager.createUseCaseCameraConfig$camera_camera2(sessionConfigAdapter, graphStateToCameraStateAdapter, z);
    }

    public final androidx.camera.camera2.config.UseCaseCameraConfig createUseCaseCameraConfig$camera_camera2(androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, boolean isExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "");
        return androidx.camera.camera2.config.UseCaseCameraConfig.INSTANCE.create(sessionConfigAdapter, this.getOutputSizeshNQ4ISI, this.b, graphStateToCameraStateAdapter, getSessionProcessor$camera_camera2(), isExtensions);
    }

    private final void Camera2StreamConfigurationMap() {
        final kotlinx.coroutines.Job close;
        androidx.camera.camera2.impl.UseCaseCamera camera = getCamera();
        this._BOUNDARY = null;
        this.Camera2StreamConfigurationMap.removePendingCameraInfo(this.getOutputStallDurationlomOqCM.get());
        if (camera != null && (close = camera.close()) != null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.add(close);
            close.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.camera.camera2.impl.UseCaseManager.Camera2StreamConfigurationMap(androidx.camera.camera2.impl.UseCaseManager.this, close);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
        androidx.camera.core.impl.SessionProcessor sessionProcessor$camera_camera2 = getSessionProcessor$camera_camera2();
        if (sessionProcessor$camera_camera2 != null) {
            sessionProcessor$camera_camera2.deInitSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.camera.camera2.impl.UseCaseManager useCaseManager, kotlinx.coroutines.Job job) {
        synchronized (useCaseManager.isOutputSupportedFor) {
            useCaseManager.getARTIFICIAL_FRAME_PACKAGE_NAME.remove(job);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void resumeDeferredComponentCreation$camera_camera2(final androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        synchronized (this.isOutputSupportedFor) {
            androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig = this.coroutineBoundary;
            if (useCaseCameraConfig == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.config.UseCaseCameraConfig.copy$default(useCaseCameraConfig, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.camera2.impl.UseCaseManager.$r8$lambda$VpH9M1AGkIirqgAsBEVcikv2Vtc(androidx.camera.camera2.pipe.CameraGraph.this, (androidx.camera.camera2.pipe.CameraGraph.Config) obj);
                }
            }, null, null, null, null, 30, null));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.config.UseCaseCameraConfig p0) {
        this._BOUNDARY = this.getHighSpeedVideoFpsRanges.config(p0).build();
        androidx.camera.camera2.impl.UseCaseCamera camera = getCamera();
        if (camera == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        camera.start();
        java.util.Iterator<androidx.camera.camera2.impl.UseCaseCameraControl> it = this._CREATION.iterator();
        while (it.hasNext()) {
            it.next().setRequestControl(camera.getRequestControl());
        }
        camera.setActiveResumeMode(this.unwrapAs);
        getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.intersect(this.getValidOutputFormatsForInputhNQ4ISI, this.toString));
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            java.util.Objects.toString(this.CoroutineDebuggingKt);
        }
        java.util.Iterator<androidx.camera.core.UseCase> it2 = this.CoroutineDebuggingKt.iterator();
        while (it2.hasNext()) {
            it2.next().onCameraControlReady();
        }
        this.CoroutineDebuggingKt.clear();
    }

    public final java.util.Set<androidx.camera.core.UseCase> getRunningUseCasesForTest() {
        java.util.Set<androidx.camera.core.UseCase> intersect;
        synchronized (this.isOutputSupportedFor) {
            intersect = kotlin.collections.CollectionsKt.intersect(this.getValidOutputFormatsForInputhNQ4ISI, this.toString);
        }
        return intersect;
    }

    private final boolean getHighSpeedVideoFpsRanges(java.util.Set<? extends androidx.camera.core.UseCase> p0) {
        if (getHighResolutionOutputSizeshNQ4ISI(p0)) {
            getHighSpeedVideoFpsRanges();
            return true;
        }
        if (!p0.contains(this.accessartificialFrame) || getHighSpeedVideoFpsRangesFor(p0)) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getHighSpeedVideoFpsRangesFor(java.util.Set<? extends androidx.camera.core.UseCase> p0) {
        boolean z;
        int i;
        androidx.camera.core.impl.UseCaseConfig<?> currentConfig;
        java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> listOf;
        if (!this.getOutputSizes.isRepeatingStreamForced()) {
            return false;
        }
        java.util.Set<? extends androidx.camera.core.UseCase> set = p0;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) it.next();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(useCase, this.accessartificialFrame)) {
                    java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = useCase.getSessionConfig().getSurfaces();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
                    if (!surfaces.isEmpty()) {
                        java.util.Set<androidx.camera.core.UseCase> set2 = this.getValidOutputFormatsForInputhNQ4ISI;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : set2) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual((androidx.camera.core.UseCase) obj, this.accessartificialFrame)) {
                                arrayList.add(obj);
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            return false;
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
                            java.util.Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                validatingBuilder.add(((androidx.camera.core.UseCase) it2.next()).getSessionConfig());
                            }
                            androidx.camera.core.impl.SessionConfig build = validatingBuilder.build();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                            java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces2 = build.getRepeatingCaptureConfig().getSurfaces();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces2, "");
                            java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces3 = build.getSurfaces();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces3, "");
                            if (!surfaces3.isEmpty()) {
                                java.util.List<androidx.camera.core.impl.DeferrableSurface> list = surfaces3;
                                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                                    java.util.Iterator<T> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.core.impl.DeferrableSurface) it3.next()).getContainerClass(), android.media.MediaCodec.class)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                boolean isEmpty = surfaces2.isEmpty();
                                if (z || isEmpty) {
                                    if (this.accessartificialFrame.getAttachedSurfaceResolution() == null) {
                                        this.accessartificialFrame.setupSession();
                                    }
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    java.util.ArrayList<androidx.camera.core.UseCase> arrayList5 = arrayList3;
                                    for (androidx.camera.core.UseCase useCase2 : arrayList5) {
                                        android.util.Size attachedSurfaceResolution = useCase2.getAttachedSurfaceResolution();
                                        androidx.camera.core.impl.StreamSpec attachedStreamSpec = useCase2.getAttachedStreamSpec();
                                        if (attachedSurfaceResolution == null || attachedStreamSpec == null) {
                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                            }
                                            arrayList4.clear();
                                            if (!arrayList4.isEmpty()) {
                                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                                for (androidx.camera.core.UseCase useCase3 : arrayList5) {
                                                    java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces4 = useCase3.getSessionConfig().getSurfaces();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces4, "");
                                                    for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : surfaces4) {
                                                        androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination = this.ArtificialStackFrames;
                                                        int highSpeedVideoSizes = getHighSpeedVideoSizes();
                                                        int inputFormat = useCase3.getCurrentConfig().getInputFormat();
                                                        android.util.Size prescribedSize = deferrableSurface.getPrescribedSize();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(prescribedSize, "");
                                                        androidx.camera.core.impl.StreamUseCase streamUseCase = useCase3.getCurrentConfig().getStreamUseCase();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase, "");
                                                        arrayList6.add(supportedSurfaceCombination.transformSurfaceConfig(highSpeedVideoSizes, inputFormat, prescribedSize, streamUseCase));
                                                    }
                                                }
                                                androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination2 = this.ArtificialStackFrames;
                                                int highSpeedVideoSizes2 = getHighSpeedVideoSizes();
                                                java.util.Iterator<java.util.Map.Entry<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange>> it4 = this.a.resolveAndValidateDynamicRanges(arrayList4, kotlin.collections.CollectionsKt.listOf(this.accessartificialFrame.getCurrentConfig()), kotlin.collections.CollectionsKt.listOf(0)).entrySet().iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        i = 8;
                                                        break;
                                                    }
                                                    if (it4.next().getValue().getBitDepth() == 10) {
                                                        i = 10;
                                                        break;
                                                    }
                                                }
                                                boolean containsVideoCapture = androidx.camera.core.impl.utils.UseCaseUtil.containsVideoCapture(arrayList3);
                                                androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization$default = androidx.camera.core.impl.utils.UseCaseUtil.getVideoStabilization$default(arrayList3, null, 1, null);
                                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                                for (java.lang.Object obj2 : arrayList5) {
                                                    if (obj2 instanceof androidx.camera.core.ImageCapture) {
                                                        arrayList7.add(obj2);
                                                    }
                                                }
                                                androidx.camera.core.ImageCapture imageCapture = (androidx.camera.core.ImageCapture) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList7);
                                                androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings featureSettings = new androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings(highSpeedVideoSizes2, i, containsVideoCapture, videoStabilization$default, (imageCapture == null || (currentConfig = imageCapture.getCurrentConfig()) == null || currentConfig.getInputFormat() != 4101) ? false : true, false, false, false, null, false, 992, null);
                                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                                arrayList8.addAll(arrayList6);
                                                androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination3 = this.ArtificialStackFrames;
                                                int highSpeedVideoSizes3 = getHighSpeedVideoSizes();
                                                int imageFormat = this.accessartificialFrame.getImageFormat();
                                                android.util.Size attachedSurfaceResolution2 = this.accessartificialFrame.getAttachedSurfaceResolution();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(attachedSurfaceResolution2);
                                                androidx.camera.core.impl.StreamUseCase streamUseCase2 = this.accessartificialFrame.getCurrentConfig().getStreamUseCase();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase2, "");
                                                arrayList8.add(supportedSurfaceCombination3.transformSurfaceConfig(highSpeedVideoSizes3, imageFormat, attachedSurfaceResolution2, streamUseCase2));
                                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                boolean checkSupported$default = androidx.camera.camera2.adapter.SupportedSurfaceCombination.checkSupported$default(supportedSurfaceCombination2, featureSettings, arrayList8, null, null, null, 28, null);
                                                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                                    androidx.camera.camera2.impl.MeteringRepeating unused3 = this.accessartificialFrame;
                                                }
                                                if (checkSupported$default) {
                                                    return true;
                                                }
                                            }
                                        } else {
                                            androidx.camera.camera2.adapter.SupportedSurfaceCombination supportedSurfaceCombination4 = this.ArtificialStackFrames;
                                            int highSpeedVideoSizes4 = getHighSpeedVideoSizes();
                                            int inputFormat2 = useCase2.getCurrentConfig().getInputFormat();
                                            androidx.camera.core.impl.StreamUseCase streamUseCase3 = useCase2.getCurrentConfig().getStreamUseCase();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamUseCase3, "");
                                            androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig = supportedSurfaceCombination4.transformSurfaceConfig(highSpeedVideoSizes4, inputFormat2, attachedSurfaceResolution, streamUseCase3);
                                            int inputFormat3 = useCase2.getCurrentConfig().getInputFormat();
                                            androidx.camera.core.DynamicRange dynamicRange = attachedStreamSpec.getDynamicRange();
                                            if (useCase2 instanceof androidx.camera.core.streamsharing.StreamSharing) {
                                                androidx.camera.core.impl.UseCaseConfig<?> currentConfig2 = ((androidx.camera.core.streamsharing.StreamSharing) useCase2).getCurrentConfig();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(currentConfig2, "");
                                                listOf = ((androidx.camera.core.streamsharing.StreamSharingConfig) currentConfig2).getCaptureTypes();
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(listOf);
                                            } else {
                                                listOf = kotlin.collections.CollectionsKt.listOf(useCase2.getCurrentConfig().getCaptureType());
                                            }
                                            androidx.camera.core.impl.MutableOptionsBundle implementationOptions = attachedStreamSpec.getImplementationOptions();
                                            if (implementationOptions == null) {
                                                androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
                                                implementationOptions = create;
                                            }
                                            androidx.camera.core.impl.AttachedSurfaceInfo create2 = androidx.camera.core.impl.AttachedSurfaceInfo.create(transformSurfaceConfig, inputFormat3, attachedSurfaceResolution, dynamicRange, listOf, implementationOptions, attachedStreamSpec.getSessionType(), attachedStreamSpec.getExpectedFrameRateRange(), useCase2.getCurrentConfig().isStrictFrameRateRequired(), useCase2.getCurrentConfig().getCustomMaxFrameRate(attachedSurfaceResolution));
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
                                            arrayList4.add(create2);
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.util.Set<? extends androidx.camera.core.UseCase> p0) {
        return this.getOutputSizes.isRepeatingStreamForced() && !this.getValidOutputFormatsForInputhNQ4ISI.contains(this.accessartificialFrame) && getHighSpeedVideoFpsRangesFor(p0);
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.accessartificialFrame.bindToCamera(this.getOutputMinFrameDuration.get(), null, null, null);
        this.accessartificialFrame.setupSession();
        attach(kotlin.collections.CollectionsKt.listOf(this.accessartificialFrame));
        activate(this.accessartificialFrame);
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        deactivate(this.accessartificialFrame);
        detach(kotlin.collections.CollectionsKt.listOf(this.accessartificialFrame));
        this.accessartificialFrame.unbindFromCamera(this.getOutputMinFrameDuration.get());
    }

    private final int getHighSpeedVideoSizes() {
        synchronized (this.isOutputSupportedFor) {
            if (this.Camera2StreamConfigurationMap.getCameraOperatingMode() == 2) {
                return 1;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return 0;
        }
    }

    private final void getOutputFormats() {
        java.util.Set<androidx.camera.core.UseCase> set = this.getValidOutputFormatsForInputhNQ4ISI;
        boolean z = false;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.camera.core.UseCase) it.next()).getCurrentConfig().isZslDisabled(false)) {
                    z = true;
                    break;
                }
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setZslDisabledByUserCaseConfig(z);
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.CameraGraph $r8$lambda$VpH9M1AGkIirqgAsBEVcikv2Vtc(androidx.camera.camera2.pipe.CameraGraph cameraGraph, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return cameraGraph;
    }

    /* renamed from: $r8$lambda$igoGai8aYKmFGamYaqvk-UAnVWM, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.CameraGraph m144$r8$lambda$igoGai8aYKmFGamYaqvkUAnVWM(androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return useCaseManager.getHighSpeedVideoSizes.createCameraGraph(config);
    }
}

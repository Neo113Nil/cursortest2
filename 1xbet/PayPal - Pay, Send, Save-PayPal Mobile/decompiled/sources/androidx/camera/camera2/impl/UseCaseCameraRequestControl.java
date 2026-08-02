package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001EJA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\fJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\tH&¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0085\u0001\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\"2\b\b\u0002\u00101\u001a\u000200H&¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f0\tH&¢\u0006\u0004\b5\u0010!JC\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010<0\t0\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u000208H&¢\u0006\u0004\b=\u0010>JK\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000eH&¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0012H¦@¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\nH&¢\u0006\u0004\bC\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "values", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "type", "Landroidx/camera/core/impl/Config$OptionPriority;", "optionPriority", "Lkotlinx/coroutines/Deferred;", "", "setParametersAsync", "(Ljava/util/Map;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Landroidx/camera/core/impl/Config$OptionPriority;)Lkotlinx/coroutines/Deferred;", "submitParameters", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "removeParametersAsync", "(Ljava/util/List;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;)Lkotlinx/coroutines/Deferred;", "", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/core/impl/Config;", "config", "", "tags", "updateCamera2ConfigAsync", "(Landroidx/camera/core/impl/Config;Ljava/util/Map;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOnAsync", "()Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "setTorchOffAsync-MtizInI", "(I)Lkotlinx/coroutines/Deferred;", "setTorchOffAsync", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "", "timeLimitNs", "startFocusAndMeteringAsync-NxRnBj4", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;J)Lkotlinx/coroutines/Deferred;", "startFocusAndMeteringAsync", "cancelFocusAndMeteringAsync", "Landroidx/camera/core/impl/CaptureConfig;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "issueSingleCaptureAsync", "(Ljava/util/List;III)Ljava/util/List;", "update3aRegions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UseCaseCameraRequestControl {
    java.lang.Object awaitSurfaceSetup(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> cancelFocusAndMeteringAsync();

    void close();

    java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> issueSingleCaptureAsync(java.util.List<androidx.camera.core.impl.CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode);

    kotlinx.coroutines.Deferred<kotlin.Unit> removeParametersAsync(java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> keys, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type);

    kotlinx.coroutines.Deferred<kotlin.Unit> setParametersAsync(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority);

    /* renamed from: setTorchOffAsync-MtizInI */
    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo114setTorchOffAsyncMtizInI(int aeMode);

    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOnAsync();

    /* renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo115startFocusAndMeteringAsyncNxRnBj4(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, androidx.camera.camera2.pipe.Lock3ABehavior aeLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior afLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior awbLockBehavior, androidx.camera.camera2.pipe.AeMode afTriggerStartAeMode, long timeLimitNs);

    kotlinx.coroutines.Deferred<kotlin.Unit> submitParameters(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority);

    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> update3aRegions(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions);

    kotlinx.coroutines.Deferred<kotlin.Unit> updateCamera2ConfigAsync(androidx.camera.core.impl.Config config, java.util.Map<java.lang.String, ? extends java.lang.Object> tags);

    kotlinx.coroutines.Deferred<kotlin.Unit> updateRepeatingRequestAsync(boolean isPrimary, java.util.Collection<? extends androidx.camera.core.UseCase> runningUseCases);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SESSION_CONFIG", "DEFAULT", "CAMERA2_CAMERA_CONTROL"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Type {
        public static final androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type CAMERA2_CAMERA_CONTROL;
        public static final androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type DEFAULT;
        public static final androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type SESSION_CONFIG;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type[] getHighSpeedVideoSizes;

        private Type(java.lang.String str, int i) {
        }

        static {
            androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type = new androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type("SESSION_CONFIG", 0);
            SESSION_CONFIG = type;
            androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type2 = new androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type("DEFAULT", 1);
            DEFAULT = type2;
            androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type3 = new androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type("CAMERA2_CAMERA_CONTROL", 2);
            CAMERA2_CAMERA_CONTROL = type3;
            androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type[] typeArr = {type, type2, type3};
            getHighSpeedVideoSizes = typeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
        }

        public static androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type[] values() {
            return (androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type valueOf(java.lang.String str) {
            return (androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type) java.lang.Enum.valueOf(androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ kotlinx.coroutines.Deferred setParametersAsync$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.util.Map map, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setParametersAsync");
        }
        if ((i & 2) != 0) {
            type = androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.DEFAULT;
        }
        if ((i & 4) != 0) {
            optionPriority = androidx.camera.camera2.impl.UseCaseCameraKt.getDefaultOptionPriority();
        }
        return useCaseCameraRequestControl.setParametersAsync(map, type, optionPriority);
    }

    static /* synthetic */ kotlinx.coroutines.Deferred submitParameters$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.util.Map map, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitParameters");
        }
        if ((i & 2) != 0) {
            type = androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.DEFAULT;
        }
        if ((i & 4) != 0) {
            optionPriority = androidx.camera.camera2.impl.UseCaseCameraKt.getDefaultOptionPriority();
        }
        return useCaseCameraRequestControl.submitParameters(map, type, optionPriority);
    }

    static /* synthetic */ kotlinx.coroutines.Deferred removeParametersAsync$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.util.List list, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeParametersAsync");
        }
        if ((i & 2) != 0) {
            type = androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.DEFAULT;
        }
        return useCaseCameraRequestControl.removeParametersAsync(list, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ kotlinx.coroutines.Deferred updateCamera2ConfigAsync$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, androidx.camera.core.impl.Config config, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCamera2ConfigAsync");
        }
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return useCaseCameraRequestControl.updateCamera2ConfigAsync(config, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: startFocusAndMeteringAsync-NxRnBj4$default, reason: not valid java name */
    static /* synthetic */ kotlinx.coroutines.Deferred m137startFocusAndMeteringAsyncNxRnBj4$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.util.List list, java.util.List list2, java.util.List list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFocusAndMeteringAsync-NxRnBj4");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = null;
        }
        if ((i & 8) != 0) {
            lock3ABehavior = null;
        }
        if ((i & 16) != 0) {
            lock3ABehavior2 = null;
        }
        if ((i & 32) != 0) {
            lock3ABehavior3 = null;
        }
        if ((i & 64) != 0) {
            aeMode = null;
        }
        if ((i & 128) != 0) {
            j = androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return useCaseCameraRequestControl.mo115startFocusAndMeteringAsyncNxRnBj4(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ kotlinx.coroutines.Deferred update3aRegions$default(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update3aRegions");
        }
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = null;
        }
        return useCaseCameraRequestControl.update3aRegions(list, list2, list3);
    }
}

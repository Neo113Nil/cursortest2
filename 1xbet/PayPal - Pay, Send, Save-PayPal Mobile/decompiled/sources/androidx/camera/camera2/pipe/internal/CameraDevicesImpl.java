package androidx.camera.camera2.pipe.internal;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0097@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u000fJ!\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001f\u0018\u00010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b \u0010\u000fJ'\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001f\u0018\u00010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\"\u0010#J$\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b0\u0010.J'\u00105\u001a\b\u0012\u0004\u0012\u00020,022\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00108\u001a\u00020,2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020,022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010>\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraDevicesImpl;", "Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "<init>", "(Landroidx/camera/camera2/pipe/CameraBackends;)V", "", "Landroidx/camera/camera2/pipe/CameraId;", "findAll", "()Ljava/util/List;", "ids", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/CameraMetadata;", "getMetadata-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetadata", "awaitMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitMetadata", "Landroidx/camera/camera2/pipe/CameraBackendId;", "cameraBackendId", "Lkotlinx/coroutines/flow/Flow;", "cameraIdsFlow-SeavPBo", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "cameraIdsFlow", "getCameraIds-iAq86To", "getCameraIds", "awaitCameraIds-SeavPBo", "(Ljava/lang/String;)Ljava/util/List;", "awaitCameraIds", "", "getConcurrentCameraIds-iAq86To", "getConcurrentCameraIds", "awaitConcurrentCameraIds-SeavPBo", "(Ljava/lang/String;)Ljava/util/Set;", "awaitConcurrentCameraIds", "cameraId", "getCameraMetadata-_mltaTw", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraMetadata", "awaitCameraMetadata-FpsL5FU", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata", "", "prewarm-FpsL5FU", "(Ljava/lang/String;Ljava/lang/String;)V", "prewarm", "disconnect-FpsL5FU", "disconnect", "Lkotlinx/coroutines/Deferred;", "disconnectAsync-FpsL5FU", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/Deferred;", "disconnectAsync", "disconnectAll-SeavPBo", "(Ljava/lang/String;)V", "disconnectAll", "disconnectAllAsync-SeavPBo", "(Ljava/lang/String;)Lkotlinx/coroutines/Deferred;", "disconnectAllAsync", "p0", "Landroidx/camera/camera2/pipe/CameraBackend;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraBackend;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraBackends;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraDevicesImpl implements androidx.camera.camera2.pipe.CameraDevices {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraBackends getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CameraDevicesImpl(androidx.camera.camera2.pipe.CameraBackends cameraBackends) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackends, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraBackends;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "findAll() is not able to specify a specific CameraBackendId to query.", replaceWith = @kotlin.ReplaceWith(expression = "awaitCameraIds", imports = {}))
    public final java.util.List<androidx.camera.camera2.pipe.CameraId> findAll() {
        java.util.List<androidx.camera.camera2.pipe.CameraId> m280awaitCameraIdsSeavPBo$default = androidx.camera.camera2.pipe.CameraDevices.m280awaitCameraIdsSeavPBo$default(this, null, 1, null);
        return m280awaitCameraIdsSeavPBo$default == null ? kotlin.collections.CollectionsKt.emptyList() : m280awaitCameraIdsSeavPBo$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "ids() is not able to specify a specific CameraBackendId to query.", replaceWith = @kotlin.ReplaceWith(expression = "getCameraIds", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ids(kotlin.coroutines.Continuation<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> continuation) {
        androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1 cameraDevicesImpl$ids$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1) {
            cameraDevicesImpl$ids$1 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1) continuation;
            if ((cameraDevicesImpl$ids$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cameraDevicesImpl$ids$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cameraDevicesImpl$ids$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraDevicesImpl$ids$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    cameraDevicesImpl$ids$1.getHighSpeedVideoSizes = 1;
                    obj = androidx.camera.camera2.pipe.CameraDevices.m288getCameraIdsiAq86To$default(this, null, cameraDevicesImpl$ids$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list = (java.util.List) obj;
                return list != null ? kotlin.collections.CollectionsKt.emptyList() : list;
            }
        }
        cameraDevicesImpl$ids$1 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1(this, continuation);
        java.lang.Object obj2 = cameraDevicesImpl$ids$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraDevicesImpl$ids$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.util.List list2 = (java.util.List) obj2;
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "getMetadata() is not able to specify a specific CameraBackendId to query.", replaceWith = @kotlin.ReplaceWith(expression = "getCameraMetadata", imports = {}))
    /* renamed from: getMetadata-0r8Bogc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo304getMetadata0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation) {
        androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1 cameraDevicesImpl$getMetadata$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1) {
            cameraDevicesImpl$getMetadata$1 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1) continuation;
            if ((cameraDevicesImpl$getMetadata$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                cameraDevicesImpl$getMetadata$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1 cameraDevicesImpl$getMetadata$12 = cameraDevicesImpl$getMetadata$1;
                obj = cameraDevicesImpl$getMetadata$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraDevicesImpl$getMetadata$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    cameraDevicesImpl$getMetadata$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = androidx.camera.camera2.pipe.CameraDevices.m289getCameraMetadata_mltaTw$default(this, str, null, cameraDevicesImpl$getMetadata$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        }
        cameraDevicesImpl$getMetadata$1 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1(this, continuation);
        androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1 cameraDevicesImpl$getMetadata$122 = cameraDevicesImpl$getMetadata$1;
        obj = cameraDevicesImpl$getMetadata$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraDevicesImpl$getMetadata$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "awaitMetadata() is not able to specify a specific CameraBackendId to query.", replaceWith = @kotlin.ReplaceWith(expression = "awaitCameraMetadata", imports = {}))
    /* renamed from: awaitMetadata-EfqyGwQ */
    public final androidx.camera.camera2.pipe.CameraMetadata mo295awaitMetadataEfqyGwQ(java.lang.String camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        androidx.camera.camera2.pipe.CameraMetadata m281awaitCameraMetadataFpsL5FU$default = androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(this, camera, null, 2, null);
        if (m281awaitCameraMetadataFpsL5FU$default != null) {
            return m281awaitCameraMetadataFpsL5FU$default;
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: cameraIdsFlow-SeavPBo */
    public final kotlinx.coroutines.flow.Flow<java.util.List<androidx.camera.camera2.pipe.CameraId>> mo296cameraIdsFlowSeavPBo(java.lang.String cameraBackendId) {
        return getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).getCameraIds();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getCameraIds-iAq86To */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo301getCameraIdsiAq86To(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> continuation) {
        androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1 cameraDevicesImpl$getCameraIds$1;
        int i;
        androidx.camera.camera2.pipe.CameraBackend highResolutionOutputSizeshNQ4ISI;
        java.util.List list;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1) {
            cameraDevicesImpl$getCameraIds$1 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1) continuation;
            if ((cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str);
                    cameraDevicesImpl$getCameraIds$1.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
                    cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoSizes = 1;
                    obj = highResolutionOutputSizeshNQ4ISI.getCameraIds(cameraDevicesImpl$getCameraIds$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    highResolutionOutputSizeshNQ4ISI = (androidx.camera.camera2.pipe.CameraBackend) cameraDevicesImpl$getCameraIds$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (list == null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
                }
                return list;
            }
        }
        cameraDevicesImpl$getCameraIds$1 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1(this, continuation);
        java.lang.Object obj2 = cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraDevicesImpl$getCameraIds$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list == null) {
            androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
        }
        return list;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitCameraIds-SeavPBo */
    public final java.util.List<androidx.camera.camera2.pipe.CameraId> mo292awaitCameraIdsSeavPBo(java.lang.String cameraBackendId) {
        androidx.camera.camera2.pipe.CameraBackend highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cameraBackendId);
        java.util.List<androidx.camera.camera2.pipe.CameraId> awaitCameraIds = highResolutionOutputSizeshNQ4ISI.awaitCameraIds();
        if (awaitCameraIds == null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
        }
        return awaitCameraIds;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getConcurrentCameraIds-iAq86To */
    public final java.lang.Object mo303getConcurrentCameraIdsiAq86To(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<androidx.camera.camera2.pipe.CameraId>>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(str).getConcurrentCameraIds(continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitConcurrentCameraIds-SeavPBo */
    public final java.util.Set<java.util.Set<androidx.camera.camera2.pipe.CameraId>> mo294awaitConcurrentCameraIdsSeavPBo(java.lang.String cameraBackendId) {
        return getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).awaitConcurrentCameraIds();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getCameraMetadata-_mltaTw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo302getCameraMetadata_mltaTw(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation) {
        androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1 cameraDevicesImpl$getCameraMetadata$1;
        int i;
        androidx.camera.camera2.pipe.CameraBackend highResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1) {
            cameraDevicesImpl$getCameraMetadata$1 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1) continuation;
            if ((cameraDevicesImpl$getCameraMetadata$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cameraDevicesImpl$getCameraMetadata$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cameraDevicesImpl$getCameraMetadata$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraDevicesImpl$getCameraMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str2);
                    cameraDevicesImpl$getCameraMetadata$1.getHighSpeedVideoFpsRangesFor = str;
                    cameraDevicesImpl$getCameraMetadata$1.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
                    cameraDevicesImpl$getCameraMetadata$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = highResolutionOutputSizeshNQ4ISI.mo222getCameraMetadata0r8Bogc(str, cameraDevicesImpl$getCameraMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.camera2.pipe.CameraBackend cameraBackend = (androidx.camera.camera2.pipe.CameraBackend) cameraDevicesImpl$getCameraMetadata$1.Camera2StreamConfigurationMap;
                    java.lang.String str3 = (java.lang.String) cameraDevicesImpl$getCameraMetadata$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = cameraBackend;
                    str = str3;
                }
                cameraMetadata = (androidx.camera.camera2.pipe.CameraMetadata) obj;
                if (cameraMetadata == null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
                    androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
                }
                return cameraMetadata;
            }
        }
        cameraDevicesImpl$getCameraMetadata$1 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1(this, continuation);
        java.lang.Object obj2 = cameraDevicesImpl$getCameraMetadata$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraDevicesImpl$getCameraMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cameraMetadata = (androidx.camera.camera2.pipe.CameraMetadata) obj2;
        if (cameraMetadata == null) {
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
            androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
        }
        return cameraMetadata;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitCameraMetadata-FpsL5FU */
    public final androidx.camera.camera2.pipe.CameraMetadata mo293awaitCameraMetadataFpsL5FU(java.lang.String cameraId, java.lang.String cameraBackendId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        androidx.camera.camera2.pipe.CameraBackend highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cameraBackendId);
        androidx.camera.camera2.pipe.CameraMetadata mo219awaitCameraMetadataEfqyGwQ = highResolutionOutputSizeshNQ4ISI.mo219awaitCameraMetadataEfqyGwQ(cameraId);
        if (mo219awaitCameraMetadataEfqyGwQ == null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(cameraId);
            androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(highResolutionOutputSizeshNQ4ISI.mo223getIdQwmhuAM());
        }
        return mo219awaitCameraMetadataEfqyGwQ;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: prewarm-FpsL5FU */
    public final void mo305prewarmFpsL5FU(java.lang.String cameraId, java.lang.String cameraBackendId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).mo225prewarmEfqyGwQ(cameraId);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnect-FpsL5FU */
    public final void mo297disconnectFpsL5FU(java.lang.String cameraId, java.lang.String cameraBackendId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).mo220disconnectEfqyGwQ(cameraId);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAsync-FpsL5FU */
    public final kotlinx.coroutines.Deferred<kotlin.Unit> mo300disconnectAsyncFpsL5FU(java.lang.String cameraId, java.lang.String cameraBackendId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        return getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).mo221disconnectAsyncEfqyGwQ(cameraId);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAll-SeavPBo */
    public final void mo298disconnectAllSeavPBo(java.lang.String cameraBackendId) {
        getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).disconnectAll();
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAllAsync-SeavPBo */
    public final kotlinx.coroutines.Deferred<kotlin.Unit> mo299disconnectAllAsyncSeavPBo(java.lang.String cameraBackendId) {
        return getHighResolutionOutputSizeshNQ4ISI(cameraBackendId).disconnectAllAsync();
    }

    private final androidx.camera.camera2.pipe.CameraBackend getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        try {
            android.os.Trace.beginSection("getCameraBackend");
            if (p0 == null) {
                p0 = this.getHighResolutionOutputSizeshNQ4ISI.getDefault().mo223getIdQwmhuAM();
            }
            androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8 = this.getHighResolutionOutputSizeshNQ4ISI.mo239getSG3A4s8(p0);
            if (mo239getSG3A4s8 != null) {
                return mo239getSG3A4s8;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to load CameraBackend ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(p0));
            throw new java.lang.IllegalStateException(sb.toString().toString());
        } finally {
            android.os.Trace.endSection();
        }
    }
}

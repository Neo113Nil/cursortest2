package coil3.disk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DiskLruCache$launchCleanup$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.disk.DiskLruCache getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        boolean z2;
        boolean Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor.getOutputSizeshNQ4ISI;
            coil3.disk.DiskLruCache diskLruCache = this.getHighSpeedVideoFpsRangesFor;
            synchronized (obj2) {
                z = diskLruCache.getOutputFormats;
                if (z) {
                    z2 = diskLruCache.getHighSpeedVideoFpsRangesFor;
                    if (!z2) {
                        try {
                            coil3.disk.DiskLruCache.access$trimToSize(diskLruCache);
                        } catch (java.io.IOException unused) {
                            diskLruCache.toString = true;
                        }
                        try {
                            Camera2StreamConfigurationMap = diskLruCache.Camera2StreamConfigurationMap();
                            if (Camera2StreamConfigurationMap) {
                                diskLruCache.getOutputFormats();
                            }
                        } catch (java.io.IOException unused2) {
                            diskLruCache.unwrapAs = true;
                            diskLruCache.getOutputSizes = okio.Okio.buffer(okio.Okio.blackhole());
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((coil3.disk.DiskLruCache$launchCleanup$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.disk.DiskLruCache$launchCleanup$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$launchCleanup$1(coil3.disk.DiskLruCache diskLruCache, kotlin.coroutines.Continuation<? super coil3.disk.DiskLruCache$launchCleanup$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = diskLruCache;
    }
}

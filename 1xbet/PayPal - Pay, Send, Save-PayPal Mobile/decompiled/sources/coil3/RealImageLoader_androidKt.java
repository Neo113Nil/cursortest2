package coil3;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0002*\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/request/ImageRequest;", "request", "", "needsExecuteOnMainDispatcher", "(Lcoil3/request/ImageRequest;)Z", "Lkotlinx/coroutines/Deferred;", "Lcoil3/request/ImageResult;", "job", "Lcoil3/request/Disposable;", "getDisposable", "(Lcoil3/request/ImageRequest;Lkotlinx/coroutines/Deferred;)Lcoil3/request/Disposable;", "result", "Lcoil3/target/Target;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/EventListener;", "eventListener", "Lkotlin/Function0;", "", "setImage", "transition", "(Lcoil3/request/ImageResult;Lcoil3/target/Target;Lcoil3/EventListener;Lkotlin/jvm/functions/Function0;)V", "Lcoil3/ComponentRegistry$Builder;", "Lcoil3/RealImageLoader$Options;", "options", "addAndroidComponents", "(Lcoil3/ComponentRegistry$Builder;Lcoil3/RealImageLoader$Options;)Lcoil3/ComponentRegistry$Builder;", "getHighSpeedVideoFpsRangesFor", "(Lcoil3/RealImageLoader$Options;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealImageLoader_androidKt {
    public static final boolean needsExecuteOnMainDispatcher(coil3.view.ImageRequest imageRequest) {
        return (imageRequest.getTarget() instanceof coil3.target.ViewTarget) || (imageRequest.getSizeResolver() instanceof coil3.view.ViewSizeResolver) || coil3.view.ImageRequests_androidKt.getLifecycle(imageRequest) != null;
    }

    public static final coil3.view.Disposable getDisposable(coil3.view.ImageRequest imageRequest, kotlinx.coroutines.Deferred<? extends coil3.view.ImageResult> deferred) {
        if (imageRequest.getTarget() instanceof coil3.target.ViewTarget) {
            return coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(((coil3.target.ViewTarget) imageRequest.getTarget()).getView()).getDisposable(deferred);
        }
        return new coil3.view.OneShotDisposable(deferred);
    }

    public static final void transition(coil3.view.ImageResult imageResult, coil3.target.Target target, coil3.EventListener eventListener, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (!(target instanceof coil3.transition.TransitionTarget)) {
            function0.invoke();
            return;
        }
        coil3.transition.Transition create = coil3.view.ImageRequests_androidKt.getTransitionFactory(imageResult.getRequest()).create((coil3.transition.TransitionTarget) target, imageResult);
        if (create instanceof coil3.transition.NoneTransition) {
            function0.invoke();
            return;
        }
        eventListener.transitionStart(imageResult.getRequest(), create);
        create.transition();
        eventListener.transitionEnd(imageResult.getRequest(), create);
    }

    public static final coil3.ComponentRegistry.Builder addAndroidComponents(coil3.ComponentRegistry.Builder builder, coil3.RealImageLoader.Options options) {
        builder.add(new coil3.map.AndroidUriMapper(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.net.Uri.class));
        builder.add(new coil3.map.ResourceIntMapper(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class));
        builder.add(new coil3.key.AndroidResourceUriKeyer(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class));
        builder.add(new coil3.fetch.AssetUriFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class));
        builder.add(new coil3.fetch.ContentUriFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class));
        builder.add(new coil3.fetch.ResourceUriFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class));
        builder.add(new coil3.fetch.DrawableFetcher.Factory(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.graphics.drawable.Drawable.class));
        kotlinx.coroutines.sync.Semaphore Semaphore$default = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(coil3.ImageLoaders_androidKt.getBitmapFactoryMaxParallelism(options), 0, 2, null);
        if (getHighSpeedVideoFpsRangesFor(options)) {
            builder.add(new coil3.decode.StaticImageDecoder.Factory(Semaphore$default));
        }
        builder.add(new coil3.decode.BitmapFactoryDecoder.Factory(Semaphore$default, coil3.ImageLoaders_androidKt.getBitmapFactoryExifOrientationStrategy(options)));
        return builder;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(coil3.RealImageLoader.Options options) {
        return android.os.Build.VERSION.SDK_INT >= 29 && coil3.ImageLoaders_androidKt.getImageDecoderEnabled(options) && kotlin.jvm.internal.Intrinsics.areEqual(coil3.ImageLoaders_androidKt.getBitmapFactoryExifOrientationStrategy(options), coil3.graphics.ExifOrientationStrategy.RESPECT_PERFORMANCE);
    }
}

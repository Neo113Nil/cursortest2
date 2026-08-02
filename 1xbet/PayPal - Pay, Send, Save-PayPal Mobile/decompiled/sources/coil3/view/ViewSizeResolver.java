package coil3.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\"¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\"¢\u0006\u0004\b\n\u0010\tJ)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\"¢\u0006\u0004\b\b\u0010\u000fR\u0014\u0010\u0012\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/size/ViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil3/size/SizeResolver;", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil3/size/Dimension;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcoil3/size/Dimension;", "getHighSpeedVideoFpsRangesFor", "", "p0", "p1", "p2", "(III)Lcoil3/size/Dimension;", "getView", "()Landroid/view/View;", "view", "", "getSubtractPadding", "()Z", "subtractPadding"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ViewSizeResolver<T extends android.view.View> extends coil3.view.SizeResolver {
    default boolean getSubtractPadding() {
        return true;
    }

    T getView();

    private default coil3.view.Dimension getHighResolutionOutputSizeshNQ4ISI() {
        android.view.ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return getHighResolutionOutputSizeshNQ4ISI(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), getSubtractPadding() ? getView().getPaddingLeft() + getView().getPaddingRight() : 0);
    }

    private default coil3.view.Dimension getHighSpeedVideoFpsRangesFor() {
        android.view.ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return getHighResolutionOutputSizeshNQ4ISI(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), getSubtractPadding() ? getView().getPaddingTop() + getView().getPaddingBottom() : 0);
    }

    private static coil3.view.Dimension getHighResolutionOutputSizeshNQ4ISI(int p0, int p1, int p2) {
        if (p0 == -2) {
            return coil3.size.Dimension.Undefined.INSTANCE;
        }
        int i = p0 - p2;
        if (i > 0) {
            return coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i));
        }
        int i2 = p1 - p2;
        if (i2 > 0) {
            return coil3.size.Dimension.Pixels.m9801boximpl(coil3.view.DimensionKt.Dimension(i2));
        }
        return null;
    }

    static /* synthetic */ coil3.view.Size access$getSize(coil3.view.ViewSizeResolver viewSizeResolver) {
        coil3.view.Dimension highSpeedVideoFpsRangesFor;
        coil3.view.Dimension highResolutionOutputSizeshNQ4ISI = viewSizeResolver.getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null || (highSpeedVideoFpsRangesFor = viewSizeResolver.getHighSpeedVideoFpsRangesFor()) == null) {
            return null;
        }
        return new coil3.view.Size(highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor);
    }

    static /* synthetic */ void access$removePreDrawListenerSafe(coil3.view.ViewSizeResolver viewSizeResolver, android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [coil3.size.ViewSizeResolver$size$3$preDrawListener$1] */
    static /* synthetic */ <T extends android.view.View> java.lang.Object size$suspendImpl(final coil3.view.ViewSizeResolver<T> viewSizeResolver, kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
        coil3.view.Dimension highSpeedVideoFpsRangesFor;
        coil3.view.Dimension highResolutionOutputSizeshNQ4ISI = viewSizeResolver.getHighResolutionOutputSizeshNQ4ISI();
        coil3.view.Size size = null;
        if (highResolutionOutputSizeshNQ4ISI != null && (highSpeedVideoFpsRangesFor = viewSizeResolver.getHighSpeedVideoFpsRangesFor()) != null) {
            size = new coil3.view.Size(highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor);
        }
        if (size != null) {
            return size;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final android.view.ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
        final ?? r3 = new android.view.ViewTreeObserver.OnPreDrawListener(viewSizeResolver) { // from class: coil3.size.ViewSizeResolver$size$3$preDrawListener$1
            final /* synthetic */ coil3.view.ViewSizeResolver<T> getHighResolutionOutputSizeshNQ4ISI;
            private boolean getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.getHighResolutionOutputSizeshNQ4ISI = viewSizeResolver;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                coil3.view.Size access$getSize = coil3.view.ViewSizeResolver.access$getSize(this.getHighResolutionOutputSizeshNQ4ISI);
                if (access$getSize != null) {
                    coil3.view.ViewSizeResolver.access$removePreDrawListenerSafe(this.getHighResolutionOutputSizeshNQ4ISI, viewTreeObserver, this);
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor = true;
                        kotlinx.coroutines.CancellableContinuation<coil3.view.Size> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(access$getSize));
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) r3);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>(viewSizeResolver) { // from class: coil3.size.ViewSizeResolver$size$3$1
            final /* synthetic */ coil3.view.ViewSizeResolver<T> getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                coil3.view.ViewSizeResolver.access$removePreDrawListenerSafe(this.getHighSpeedVideoSizes, viewTreeObserver, r3);
                return kotlin.Unit.INSTANCE;
            }

            {
                this.getHighSpeedVideoSizes = viewSizeResolver;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // coil3.view.SizeResolver
    default java.lang.Object size(kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
        return size$suspendImpl(this, continuation);
    }
}

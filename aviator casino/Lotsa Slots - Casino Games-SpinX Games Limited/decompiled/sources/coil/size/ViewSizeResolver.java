package coil.size;

/* compiled from: ViewSizeResolver.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcoil/size/ViewSizeResolver;", "T", "Landroid/view/View;", "Lcoil/size/SizeResolver;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "getView", "()Landroid/view/View;", "subtractPadding", "", "getSubtractPadding", "()Z", "size", "Lcoil/size/Size;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSize", "getWidth", "Lcoil/size/Dimension;", "getHeight", "getDimension", "paramSize", "", "viewSize", "paddingSize", "removePreDrawListenerSafe", "", "Landroid/view/ViewTreeObserver;", "victim", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ViewSizeResolver<T extends android.view.View> extends coil.size.SizeResolver {
    boolean getSubtractPadding();

    T getView();

    @Override // coil.size.SizeResolver
    java.lang.Object size(kotlin.coroutines.Continuation<? super coil.size.Size> continuation);

    /* compiled from: ViewSizeResolver.kt */
    /* renamed from: coil.size.ViewSizeResolver$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getSubtractPadding(coil.size.ViewSizeResolver _this) {
            return true;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
        public static /* synthetic */ <T extends android.view.View> java.lang.Object size$suspendImpl(final coil.size.ViewSizeResolver<T> viewSizeResolver, kotlin.coroutines.Continuation<? super coil.size.Size> continuation) {
            coil.size.Size $private$getSize = $private$getSize(viewSizeResolver);
            if ($private$getSize != null) {
                return $private$getSize;
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final android.view.ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            final ?? r3 = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1
                private boolean isResumed;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    coil.size.Size $private$getSize2;
                    $private$getSize2 = coil.size.ViewSizeResolver.CC.$private$getSize(viewSizeResolver);
                    if ($private$getSize2 != null) {
                        coil.size.ViewSizeResolver.CC.$private$removePreDrawListenerSafe(viewSizeResolver, viewTreeObserver, this);
                        if (!this.isResumed) {
                            this.isResumed = true;
                            kotlinx.coroutines.CancellableContinuation<coil.size.Size> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl($private$getSize2));
                        }
                    }
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) r3);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: coil.size.ViewSizeResolver$size$3$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    coil.size.ViewSizeResolver.CC.$private$removePreDrawListenerSafe(viewSizeResolver, viewTreeObserver, r3);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        public static coil.size.Size $private$getSize(coil.size.ViewSizeResolver _this) {
            coil.size.Dimension $private$getHeight;
            coil.size.Dimension $private$getWidth = $private$getWidth(_this);
            if ($private$getWidth == null || ($private$getHeight = $private$getHeight(_this)) == null) {
                return null;
            }
            return new coil.size.Size($private$getWidth, $private$getHeight);
        }

        public static coil.size.Dimension $private$getWidth(coil.size.ViewSizeResolver _this) {
            android.view.ViewGroup.LayoutParams layoutParams = _this.getView().getLayoutParams();
            return $private$getDimension(_this, layoutParams != null ? layoutParams.width : -1, _this.getView().getWidth(), _this.getSubtractPadding() ? _this.getView().getPaddingLeft() + _this.getView().getPaddingRight() : 0);
        }

        public static coil.size.Dimension $private$getHeight(coil.size.ViewSizeResolver _this) {
            android.view.ViewGroup.LayoutParams layoutParams = _this.getView().getLayoutParams();
            return $private$getDimension(_this, layoutParams != null ? layoutParams.height : -1, _this.getView().getHeight(), _this.getSubtractPadding() ? _this.getView().getPaddingTop() + _this.getView().getPaddingBottom() : 0);
        }

        public static coil.size.Dimension $private$getDimension(coil.size.ViewSizeResolver _this, int i, int i2, int i3) {
            if (i == -2) {
                return coil.size.Dimension.Undefined.INSTANCE;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return coil.size.Dimensions.Dimension(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return coil.size.Dimensions.Dimension(i5);
            }
            return null;
        }

        public static void $private$removePreDrawListenerSafe(coil.size.ViewSizeResolver _this, android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                _this.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
    }

    /* compiled from: ViewSizeResolver.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T extends android.view.View> boolean getSubtractPadding(coil.size.ViewSizeResolver<T> viewSizeResolver) {
            return coil.size.ViewSizeResolver.CC.$default$getSubtractPadding(viewSizeResolver);
        }

        @java.lang.Deprecated
        public static <T extends android.view.View> java.lang.Object size(coil.size.ViewSizeResolver<T> viewSizeResolver, kotlin.coroutines.Continuation<? super coil.size.Size> continuation) {
            return coil.size.ViewSizeResolver.CC.size$suspendImpl(viewSizeResolver, continuation);
        }
    }
}

package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a/\u0010\t\u001a\u00020\b*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\u0006\u001a/\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\u0006\u001a<\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a<\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a,\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0086\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b \u0010\u001f\u001a\u001b\u0010$\u001a\u00020#*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a-\u0010)\u001a\u00020\u0003*\u00020\u00002\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b'H\u0086\b¢\u0006\u0004\b)\u0010\u0006\u001a9\u0010+\u001a\u00020\u0003\"\n\b\u0000\u0010*\u0018\u0001*\u00020&*\u00020\u00002\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b'H\u0086\b¢\u0006\u0004\b+\u0010\u0006\"*\u0010.\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8Ç\u0002@Ç\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\"*\u00102\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8Ç\u0002@Ç\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010/\"\u0004\b3\u00101\"*\u00104\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8Ç\u0002@Ç\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010/\"\u0004\b5\u00101\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\bA\u00107\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020\u00008G¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000C*\u00020\u00008G¢\u0006\u0006\u001a\u0004\bH\u0010F"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "action", "doOnNextLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "end", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "updatePaddingRelative", "(Landroid/view/View;IIII)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "updatePadding", io.ktor.http.ContentDisposition.Parameters.Size, "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/ExtensionFunctionType;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "getAllViews", "allViews"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewKt {
    public static final void doOnNextLayout(android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view2.removeOnLayoutChangeListener(this);
                function1.invoke(view2);
            }
        });
    }

    public static final void doOnLayout(android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            function1.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    kotlin.jvm.functions.Function1.this.invoke(view2);
                }
            });
        }
    }

    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        return androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(view);
            }
        });
    }

    public static final void doOnAttach(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    public static final void doOnDetach(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        if (!view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(android.view.View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(android.view.View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View view, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final void updatePaddingRelative(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(android.view.View view, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void updatePadding(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public static final void setPadding(android.view.View view, int i) {
        view.setPadding(i, i, i, i);
    }

    public static final java.lang.Runnable postDelayed(android.view.View view, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postDelayed(runnable, j);
        return runnable;
    }

    public static final java.lang.Runnable postOnAnimationDelayed(android.view.View view, long j, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View view, android.graphics.Bitmap.Config config, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final android.graphics.Bitmap drawToBitmap(android.view.View view, android.graphics.Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new java.lang.IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static final boolean isVisible(android.view.View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(android.view.View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final boolean isInvisible(android.view.View view) {
        return view.getVisibility() == 4;
    }

    public static final void setInvisible(android.view.View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    public static final boolean isGone(android.view.View view) {
        return view.getVisibility() == 8;
    }

    public static final void setGone(android.view.View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View view, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final int getMarginLeft(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginTop(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int getMarginRight(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginBottom(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginStart(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginEnd(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final kotlin.sequences.Sequence<android.view.ViewParent> getAncestors(android.view.View view) {
        return kotlin.sequences.SequencesKt.generateSequence(view.getParent(), androidx.core.view.ViewKt$ancestors$1.Camera2StreamConfigurationMap);
    }

    public static final kotlin.sequences.Sequence<android.view.View> getAllViews(android.view.View view) {
        return kotlin.sequences.SequencesKt.sequence(new androidx.core.view.ViewKt$allViews$1(view, null));
    }

    public static final void updateLayoutParams(android.view.View view, kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.Unit> function1) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}

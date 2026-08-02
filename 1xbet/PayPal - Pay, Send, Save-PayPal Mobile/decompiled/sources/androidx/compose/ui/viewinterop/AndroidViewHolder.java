package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ò\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001a¢\u0006\u0004\bC\u0010\u001cJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020$H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJG\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\u0006\u0010[\u001a\u000204H\u0016¢\u0006\u0004\b\\\u0010]J?\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010^J7\u0010a\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\n2\u0006\u0010[\u001a\u0002042\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020$H\u0016¢\u0006\u0004\bj\u0010LJ\u001f\u0010n\u001a\u00020l2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020l2\u0006\u0010p\u001a\u00020lH\u0002¢\u0006\u0004\bq\u0010rJ3\u0010w\u001a\u00020s*\u00020s2\u0006\u0010p\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\nH\u0002¢\u0006\u0004\bw\u0010xR\u0014\u0010q\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010yR\u0014\u0010{\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010zR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010|\u001a\u0004\b}\u0010\u0016R\u0014\u0010w\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR@\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00012\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00018\u0007@EX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R@\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00012\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00018\u0007@EX\u0087\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001\"\u0006\b\u008c\u0001\u0010\u0087\u0001R@\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00012\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00018\u0007@EX\u0087\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0083\u0001\u001a\u0006\b\u008e\u0001\u0010\u0085\u0001\"\u0006\b\u008f\u0001\u0010\u0087\u0001R4\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\u0010\u0081\u0001\u001a\u00030\u0090\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R9\u0010\u0098\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0097\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R4\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\u0010\u0081\u0001\u001a\u00030\u009e\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R9\u0010¥\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009e\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0097\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u0099\u0001\u001a\u0006\b¦\u0001\u0010\u009b\u0001\"\u0006\b§\u0001\u0010\u009d\u0001R8\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010¨\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R8\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010¯\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¸\u0001\u001a\u0002048\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010¼\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R1\u0010Â\u0001\u001a\u001b\u0012\u0007\u0012\u0005\u0018\u00010À\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0097\u0001j\u0005\u0018\u0001`Á\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b{\u0010\u0099\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010\u0083\u0001R\u001e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0080\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010\u0083\u0001R8\u0010Æ\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0097\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010\u0099\u0001\u001a\u0006\bÇ\u0001\u0010\u009b\u0001\"\u0006\bÈ\u0001\u0010\u009d\u0001R\u0016\u0010~\u001a\u0002048\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010·\u0001R\u0018\u0010Å\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010yR\u0018\u0010Ã\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010yR\u0018\u0010¶\u0001\u001a\u00030É\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ê\u0001\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010\u0089\u0001R\u0016\u0010Ì\u0001\u001a\u00020$8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010LR \u0010Î\u0001\u001a\u00030Í\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/Camera2StreamConfigurationMap;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", util.h.xy.cb.b.f1091, "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "rectangle", "immediate", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/graphics/Insets;", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getHighSpeedVideoSizes", "Landroid/view/View;", "getView", "getOutputSizes", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "update", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoFpsRanges", "Z", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "getOutputStallDuration", "[I", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/IntSize;", "isOutputSupportedFor", "J", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Landroidx/core/view/WindowInsetsCompat;", "getOutputFormats", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "getInputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "getInputFormats", "getOutputMinFrameDurationlomOqCM", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "Landroidx/core/view/NestedScrollingParentHelper;", "getOutputStallDurationlomOqCM", "Landroidx/core/view/NestedScrollingParentHelper;", "isValidOwnerScope", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class AndroidViewHolder extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent3, androidx.compose.runtime.ComposeNodeLifecycleCallback, androidx.compose.ui.node.OwnerScope, androidx.core.view.OnApplyWindowInsetsListener {
    private androidx.compose.ui.unit.Density density;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int[] getOutputSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.core.view.WindowInsetsCompat getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.node.Owner getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final int[] Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.core.view.NestedScrollingParentHelper getOutputStallDuration;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizesFor;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private androidx.view.LifecycleOwner lifecycleOwner;
    private androidx.compose.ui.Modifier modifier;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> onDensityChanged;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> onModifierChanged;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onRequestDisallowInterceptTouchEvent;
    private kotlin.jvm.functions.Function0<kotlin.Unit> release;
    private kotlin.jvm.functions.Function0<kotlin.Unit> reset;
    private androidx.view.SavedStateRegistryOwner savedStateRegistryOwner;
    private kotlin.jvm.functions.Function0<kotlin.Unit> update;
    private final android.view.View view;
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.viewinterop.AndroidViewHolder, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public AndroidViewHolder(android.content.Context context, androidx.compose.runtime.CompositionContext compositionContext, int i, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, android.view.View view, androidx.compose.ui.node.Owner owner) {
        super(context);
        androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1 androidViewHolder_androidKt$NoOpScrollConnection$1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = nestedScrollDispatcher;
        this.view = view;
        this.getHighSpeedVideoFpsRangesFor = owner;
        if (compositionContext != null) {
            androidx.compose.ui.platform.WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = this;
        androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(androidViewHolder, new androidx.core.view.WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat animation, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat bounds) {
                return androidx.compose.ui.viewinterop.AndroidViewHolder.access$insetBounds(androidx.compose.ui.viewinterop.AndroidViewHolder.this, bounds);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat insets, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> runningAnimations) {
                return androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighResolutionOutputSizeshNQ4ISI(insets);
            }
        });
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(androidViewHolder, this);
        this.update = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            public final void getHighSpeedVideoFpsRanges() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.reset = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            public final void getHighSpeedVideoFpsRanges() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.release = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            public final void getHighSpeedVideoFpsRangesFor() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.modifier = androidx.compose.ui.Modifier.INSTANCE;
        this.density = androidx.compose.ui.unit.DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.Camera2StreamConfigurationMap = new int[2];
        this.getHighSpeedVideoSizesFor = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        this.getInputFormats = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor() {
                boolean z;
                kotlin.jvm.functions.Function1 function1;
                z = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighSpeedVideoFpsRanges;
                if (z && androidx.compose.ui.viewinterop.AndroidViewHolder.this.isAttachedToWindow()) {
                    android.view.ViewParent parent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getView().getParent();
                    androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                    if (parent == androidViewHolder2) {
                        androidx.compose.ui.node.OwnerSnapshotObserver access$getSnapshotObserver = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getSnapshotObserver(androidViewHolder2);
                        androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder3 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                        function1 = androidx.compose.ui.viewinterop.AndroidViewHolder.Camera2StreamConfigurationMap;
                        access$getSnapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(androidViewHolder3, function1, androidx.compose.ui.viewinterop.AndroidViewHolder.this.getUpdate());
                    }
                }
            }

            {
                super(0);
            }
        };
        this.getOutputMinFrameDuration = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            public final void getHighSpeedVideoSizes() {
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutNode().invalidateLayer$ui();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        };
        this.getOutputSizes = new int[2];
        this.getOutputMinFrameDurationlomOqCM = Integer.MIN_VALUE;
        this.getOutputSizeshNQ4ISI = Integer.MIN_VALUE;
        this.getOutputStallDuration = new androidx.core.view.NestedScrollingParentHelper(this);
        final androidx.compose.ui.node.LayoutNode layoutNode = new androidx.compose.ui.node.LayoutNode(false, 0, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui(this);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidViewHolder_androidKt$NoOpScrollConnection$1 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.getHighSpeedVideoFpsRanges;
        final androidx.compose.ui.Modifier then = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.ui.draw.DrawModifierKt.drawBehind(androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(companion, androidViewHolder_androidKt$NoOpScrollConnection$1, nestedScrollDispatcher), true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                getHighResolutionOutputSizeshNQ4ISI(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }
        }), this), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                getHighSpeedVideoFpsRanges(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNode;
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder3 = this;
                androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder2.getView().getVisibility() != 8) {
                    androidViewHolder2.getOutputStallDurationlomOqCM = true;
                    androidx.compose.ui.node.Owner owner2 = layoutNode2.getOwner();
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder3, androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder2.getOutputStallDurationlomOqCM = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                getHighResolutionOutputSizeshNQ4ISI(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                androidx.compose.ui.node.Owner owner2;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                long j;
                androidx.core.view.WindowInsetsCompat windowInsetsCompat;
                int[] iArr4;
                int[] iArr5;
                long j2;
                androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$layoutAccordingTo(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode);
                owner2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighSpeedVideoFpsRangesFor;
                owner2.onInteropViewLayoutChange(androidx.compose.ui.viewinterop.AndroidViewHolder.this);
                iArr = androidx.compose.ui.viewinterop.AndroidViewHolder.this.Camera2StreamConfigurationMap;
                int i2 = iArr[0];
                iArr2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.Camera2StreamConfigurationMap;
                int i3 = iArr2[1];
                android.view.View view2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getView();
                iArr3 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.Camera2StreamConfigurationMap;
                view2.getLocationOnScreen(iArr3);
                j = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighSpeedVideoSizesFor;
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighSpeedVideoSizesFor = layoutCoordinates.mo7361getSizeYbymL2g();
                windowInsetsCompat = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getOutputFormats;
                if (windowInsetsCompat != null) {
                    iArr4 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.Camera2StreamConfigurationMap;
                    if (i2 == iArr4[0]) {
                        iArr5 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.Camera2StreamConfigurationMap;
                        if (i3 == iArr5[1]) {
                            j2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighSpeedVideoSizesFor;
                            if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(j, j2)) {
                                return;
                            }
                        }
                    }
                    android.view.WindowInsets windowInsets = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getHighResolutionOutputSizeshNQ4ISI(windowInsetsCompat).toWindowInsets();
                    if (windowInsets != null) {
                        androidx.compose.ui.viewinterop.AndroidViewHolder.this.getView().dispatchApplyWindowInsets(windowInsets);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }).then(new androidx.compose.ui.viewinterop.BringIntoViewElement(new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function1) {
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.getInputSizeshNQ4ISI = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, ? extends kotlin.Unit> function1) {
                getHighSpeedVideoFpsRanges(function1);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }));
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(then));
        this.onModifierChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            public final void Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier) {
                androidx.compose.ui.node.LayoutNode.this.setModifier(modifier.then(then));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier) {
                Camera2StreamConfigurationMap(modifier);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.unit.Density density) {
                androidx.compose.ui.node.LayoutNode.this.setDensity(density);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.Density density) {
                getHighSpeedVideoFpsRangesFor(density);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        };
        layoutNode.setOnAttach$ui(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.Owner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.Owner owner2) {
                getHighResolutionOutputSizeshNQ4ISI(owner2);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.Owner owner2) {
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode);
                }
                android.view.ViewParent parent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getView().getParent();
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                if (parent != androidViewHolder2) {
                    androidViewHolder2.addView(androidViewHolder2.getView());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        layoutNode.setOnDetach$ui(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.Owner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.Owner owner2) {
                getHighSpeedVideoSizes(owner2);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(androidx.compose.ui.node.Owner owner2) {
                if (androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled && androidx.compose.ui.viewinterop.AndroidViewHolder.this.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner2 instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(androidx.compose.ui.viewinterop.AndroidViewHolder.this);
                }
                androidx.compose.ui.viewinterop.AndroidViewHolder.this.removeAllViewsInLayout();
            }

            {
                super(1);
            }
        });
        layoutNode.setMeasurePolicy(new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                if (androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildCount() == 0) {
                    return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            getHighSpeedVideoSizes(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) != 0) {
                    androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j));
                }
                if (androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j) != 0) {
                    androidx.compose.ui.viewinterop.AndroidViewHolder.this.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j));
                }
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
                int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                android.view.ViewGroup.LayoutParams layoutParams = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                int access$obtainMeasureSpec = androidx.compose.ui.viewinterop.AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder2, m8556getMinWidthimpl, m8554getMaxWidthimpl, layoutParams.width);
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder3 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
                int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                android.view.ViewGroup.LayoutParams layoutParams2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder2.measure(access$obtainMeasureSpec, androidx.compose.ui.viewinterop.AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder3, m8555getMinHeightimpl, m8553getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredHeight();
                final androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder4 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                final androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNode;
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    public final void Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$layoutAccordingTo(androidx.compose.ui.viewinterop.AndroidViewHolder.this, layoutNode2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        Camera2StreamConfigurationMap(placementScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return getHighSpeedVideoFpsRanges(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return getHighSpeedVideoFpsRanges(i2);
            }

            private final int getHighSpeedVideoFpsRanges(int p0) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder3 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                android.view.ViewGroup.LayoutParams layoutParams = androidViewHolder3.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                androidViewHolder2.measure(makeMeasureSpec, androidx.compose.ui.viewinterop.AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder3, 0, p0, layoutParams.height));
                return androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return getHighSpeedVideoFpsRangesFor(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i2) {
                return getHighSpeedVideoFpsRangesFor(i2);
            }

            private final int getHighSpeedVideoFpsRangesFor(int p0) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder2 = androidx.compose.ui.viewinterop.AndroidViewHolder.this;
                android.view.ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams);
                androidViewHolder2.measure(androidx.compose.ui.viewinterop.AndroidViewHolder.access$obtainMeasureSpec(androidViewHolder2, 0, p0, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidx.compose.ui.viewinterop.AndroidViewHolder.this.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    public final android.view.View getView() {
        return this.view;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final android.view.View getView() {
        return this.view;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getUpdate() {
        return this.update;
    }

    protected final void setUpdate(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.update = function0;
        this.getHighSpeedVideoFpsRanges = true;
        this.getInputFormats.invoke();
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getReset() {
        return this.reset;
    }

    protected final void setReset(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.reset = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRelease() {
        return this.release;
    }

    protected final void setRelease(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.release = function0;
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(androidx.compose.ui.Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier, kotlin.Unit> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier, kotlin.Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity(androidx.compose.ui.unit.Density density) {
        if (density != this.density) {
            this.density = density;
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, kotlin.Unit> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, kotlin.Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final androidx.view.LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(androidx.view.LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            androidx.view.C0276ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final androidx.view.SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(widthMeasureSpec), android.view.View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.getOutputMinFrameDurationlomOqCM = widthMeasureSpec;
        this.getOutputSizeshNQ4ISI = heightMeasureSpec;
    }

    public final void remeasure() {
        int i;
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        if (i2 == Integer.MIN_VALUE || (i = this.getOutputSizeshNQ4ISI) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getInputFormats.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!isAttachedToWindow()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        this.getHighSpeedVideoFpsRangesFor.getSnapshotObserver().clear$ui(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate) {
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function1 = this.getInputSizeshNQ4ISI;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rectangle != null ? androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(rectangle) : null);
        return true;
    }

    public final void invalidateOrDefer() {
        if (this.getOutputStallDurationlomOqCM) {
            android.view.View view = this.view;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getOutputMinFrameDuration;
            view.postOnAnimation(new java.lang.Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.jvm.functions.Function0.this.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.getOutputSizes);
        int[] iArr = this.getOutputSizes;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        region.op(i, i2, i + width, this.getOutputSizes[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.getOutputStallDuration.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int axes, int type) {
        this.getOutputStallDuration.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View target, int type) {
        this.getOutputStallDuration.onStopNestedScroll(target, type);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.getHighSpeedVideoSizes;
            float access$toComposeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed);
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(access$toComposeOffset) << 32));
            float access$toComposeOffset2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed);
            long m7108dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m7108dispatchPostScrollDzOQY0M(m5744constructorimpl, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(access$toComposeOffset2) << 32)), androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
            consumed[0] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (m7108dispatchPostScrollDzOQY0M >> 32)));
            consumed[1] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (m7108dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.getHighSpeedVideoSizes;
            float access$toComposeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dxConsumed);
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dyConsumed)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(access$toComposeOffset) << 32));
            float access$toComposeOffset2 = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dxUnconsumed);
            nestedScrollDispatcher.m7108dispatchPostScrollDzOQY0M(m5744constructorimpl, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dyUnconsumed)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(access$toComposeOffset2) << 32)), androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = this.getHighSpeedVideoSizes;
            float access$toComposeOffset = androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dx);
            long m7110dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m7110dispatchPreScrollOzD1aCk(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeOffset(dy)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(access$toComposeOffset) << 32)), androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toNestedScrollSource(type));
            consumed[0] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (m7110dispatchPreScrollOzD1aCk >> 32)));
            consumed[1] = androidx.compose.ui.platform.NestedScrollInteropConnectionKt.composeToViewOffset(java.lang.Float.intBitsToFloat((int) (m7110dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getCoroutineScope(), null, null, new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1(consumed, this, androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getCoroutineScope(), null, null, new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1(this, androidx.compose.ui.unit.VelocityKt.Velocity(androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeVelocity(velocityX), androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt.access$toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View v, androidx.core.view.WindowInsetsCompat insets) {
        this.getOutputFormats = new androidx.core.view.WindowInsetsCompat(insets);
        return getHighResolutionOutputSizeshNQ4ISI(insets);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.core.view.WindowInsetsCompat getHighResolutionOutputSizeshNQ4ISI(androidx.core.view.WindowInsetsCompat p0) {
        if (p0.hasInsets()) {
            androidx.compose.ui.node.NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
            if (innerCoordinator$ui.isAttached()) {
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = innerCoordinator$ui;
                long m8746roundk4lQ0M = androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
                int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8746roundk4lQ0M);
                if (m8729getXimpl < 0) {
                    m8729getXimpl = 0;
                }
                int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8746roundk4lQ0M);
                if (m8730getYimpl < 0) {
                    m8730getYimpl = 0;
                }
                long mo7361getSizeYbymL2g = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo7361getSizeYbymL2g();
                int i = (int) (mo7361getSizeYbymL2g >> 32);
                int i2 = (int) (mo7361getSizeYbymL2g & 4294967295L);
                long mo7361getSizeYbymL2g2 = innerCoordinator$ui.mo7361getSizeYbymL2g();
                long m8746roundk4lQ0M2 = androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(innerCoordinator$ui.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g2 >> 32)) << 32))));
                int m8729getXimpl2 = i - androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8746roundk4lQ0M2);
                if (m8729getXimpl2 < 0) {
                    m8729getXimpl2 = 0;
                }
                int m8730getYimpl2 = i2 - androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8746roundk4lQ0M2);
                int i3 = m8730getYimpl2 < 0 ? 0 : m8730getYimpl2;
                if (m8729getXimpl != 0 || m8730getYimpl != 0 || m8729getXimpl2 != 0 || i3 != 0) {
                    return p0.inset(m8729getXimpl, m8730getYimpl, m8729getXimpl2, i3);
                }
            }
        }
        return p0;
    }

    private static androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor(androidx.core.graphics.Insets insets, int i, int i2, int i3, int i4) {
        int i5 = insets.left - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = insets.top - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = insets.right - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = insets.bottom - i4;
        return androidx.core.graphics.Insets.of(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static final /* synthetic */ androidx.compose.ui.node.OwnerSnapshotObserver access$getSnapshotObserver(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder) {
        if (!androidViewHolder.isAttachedToWindow()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return androidViewHolder.getHighSpeedVideoFpsRangesFor.getSnapshotObserver();
    }

    public static final /* synthetic */ androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat access$insetBounds(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        androidx.compose.ui.node.NodeCoordinator innerCoordinator$ui = androidViewHolder.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = innerCoordinator$ui;
            long m8746roundk4lQ0M = androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
            int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8746roundk4lQ0M);
            if (m8729getXimpl < 0) {
                m8729getXimpl = 0;
            }
            int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8746roundk4lQ0M);
            if (m8730getYimpl < 0) {
                m8730getYimpl = 0;
            }
            long mo7361getSizeYbymL2g = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo7361getSizeYbymL2g();
            int i = (int) (mo7361getSizeYbymL2g >> 32);
            int i2 = (int) (mo7361getSizeYbymL2g & 4294967295L);
            long mo7361getSizeYbymL2g2 = innerCoordinator$ui.mo7361getSizeYbymL2g();
            long m8746roundk4lQ0M2 = androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(innerCoordinator$ui.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g2 >> 32)) << 32))));
            int m8729getXimpl2 = i - androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8746roundk4lQ0M2);
            if (m8729getXimpl2 < 0) {
                m8729getXimpl2 = 0;
            }
            int m8730getYimpl2 = i2 - androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8746roundk4lQ0M2);
            int i3 = m8730getYimpl2 >= 0 ? m8730getYimpl2 : 0;
            if (m8729getXimpl != 0 || m8730getYimpl != 0 || m8729getXimpl2 != 0 || i3 != 0) {
                return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(getHighSpeedVideoFpsRangesFor(boundsCompat.getLowerBound(), m8729getXimpl, m8730getYimpl, m8729getXimpl2, i3), getHighSpeedVideoFpsRangesFor(boundsCompat.getUpperBound(), m8729getXimpl, m8730getYimpl, m8729getXimpl2, i3));
            }
        }
        return boundsCompat;
    }

    public static final /* synthetic */ int access$obtainMeasureSpec(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return android.view.View.MeasureSpec.makeMeasureSpec(kotlin.ranges.RangesKt.coerceIn(i3, i, i2), 1073741824);
        }
        if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return android.view.View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}

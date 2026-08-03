package com.facebook.login.widget;

/* compiled from: ToolTipPopup.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/facebook/login/widget/ToolTipPopup;", "", "text", "", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroid/view/View;", "(Ljava/lang/String;Landroid/view/View;)V", "anchorViewRef", "Ljava/lang/ref/WeakReference;", "context", "Landroid/content/Context;", "nuxDisplayTime", "", "popupContent", "Lcom/facebook/login/widget/ToolTipPopup$PopupContentView;", "popupWindow", "Landroid/widget/PopupWindow;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "style", "Lcom/facebook/login/widget/ToolTipPopup$Style;", "dismiss", "", "registerObserver", "setNuxDisplayTime", "displayTime", "setStyle", com.ironsource.C3232q2.v, "unregisterObserver", "updateArrows", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PopupContentView", "Style", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ToolTipPopup {
    public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000;
    private final java.lang.ref.WeakReference<android.view.View> anchorViewRef;
    private final android.content.Context context;
    private long nuxDisplayTime;
    private com.facebook.login.widget.ToolTipPopup.PopupContentView popupContent;
    private android.widget.PopupWindow popupWindow;
    private final android.view.ViewTreeObserver.OnScrollChangedListener scrollListener;
    private com.facebook.login.widget.ToolTipPopup.Style style;
    private final java.lang.String text;

    public ToolTipPopup(java.lang.String text, android.view.View anchor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.text = text;
        this.anchorViewRef = new java.lang.ref.WeakReference<>(anchor);
        android.content.Context context = anchor.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "anchor.context");
        this.context = context;
        this.style = com.facebook.login.widget.ToolTipPopup.Style.BLUE;
        this.nuxDisplayTime = DEFAULT_POPUP_DISPLAY_TIME;
        this.scrollListener = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.ToolTipPopup$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                com.facebook.login.widget.ToolTipPopup.m5254scrollListener$lambda1(com.facebook.login.widget.ToolTipPopup.this);
            }
        };
    }

    /* compiled from: ToolTipPopup.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/widget/ToolTipPopup$Style;", "", "(Ljava/lang/String;I)V", "BLUE", "BLACK", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Style {
        BLUE,
        BLACK;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.login.widget.ToolTipPopup.Style[] valuesCustom() {
            com.facebook.login.widget.ToolTipPopup.Style[] valuesCustom = values();
            return (com.facebook.login.widget.ToolTipPopup.Style[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scrollListener$lambda-1, reason: not valid java name */
    public static final void m5254scrollListener$lambda1(com.facebook.login.widget.ToolTipPopup this$0) {
        android.widget.PopupWindow popupWindow;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.widget.ToolTipPopup.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.anchorViewRef.get() == null || (popupWindow = this$0.popupWindow) == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                com.facebook.login.widget.ToolTipPopup.PopupContentView popupContentView = this$0.popupContent;
                if (popupContentView == null) {
                    return;
                }
                popupContentView.showBottomArrow();
                return;
            }
            com.facebook.login.widget.ToolTipPopup.PopupContentView popupContentView2 = this$0.popupContent;
            if (popupContentView2 == null) {
                return;
            }
            popupContentView2.showTopArrow();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.widget.ToolTipPopup.class);
        }
    }

    public final void setStyle(com.facebook.login.widget.ToolTipPopup.Style style) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "style");
            this.style = style;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void show() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.anchorViewRef.get() != null) {
                com.facebook.login.widget.ToolTipPopup.PopupContentView popupContentView = new com.facebook.login.widget.ToolTipPopup.PopupContentView(this, this.context);
                this.popupContent = popupContentView;
                android.view.View findViewById = popupContentView.findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_text_body);
                if (findViewById == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((android.widget.TextView) findViewById).setText(this.text);
                if (this.style == com.facebook.login.widget.ToolTipPopup.Style.BLUE) {
                    popupContentView.getBodyFrame().setBackgroundResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_background);
                    popupContentView.getBottomArrow().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_bottomnub);
                    popupContentView.getTopArrow().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_topnub);
                    popupContentView.getXOut().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_xout);
                } else {
                    popupContentView.getBodyFrame().setBackgroundResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_background);
                    popupContentView.getBottomArrow().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_bottomnub);
                    popupContentView.getTopArrow().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_topnub);
                    popupContentView.getXOut().setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_xout);
                }
                android.view.View decorView = ((android.app.Activity) this.context).getWindow().getDecorView();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                registerObserver();
                popupContentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(popupContentView, popupContentView.getMeasuredWidth(), popupContentView.getMeasuredHeight());
                this.popupWindow = popupWindow;
                popupWindow.showAsDropDown(this.anchorViewRef.get());
                updateArrows();
                if (this.nuxDisplayTime > 0) {
                    popupContentView.postDelayed(new java.lang.Runnable() { // from class: com.facebook.login.widget.ToolTipPopup$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facebook.login.widget.ToolTipPopup.m5255show$lambda2(com.facebook.login.widget.ToolTipPopup.this);
                        }
                    }, this.nuxDisplayTime);
                }
                popupWindow.setTouchable(true);
                popupContentView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.login.widget.ToolTipPopup$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.facebook.login.widget.ToolTipPopup.m5256show$lambda3(com.facebook.login.widget.ToolTipPopup.this, view);
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-2, reason: not valid java name */
    public static final void m5255show$lambda2(com.facebook.login.widget.ToolTipPopup this$0) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.widget.ToolTipPopup.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismiss();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.widget.ToolTipPopup.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-3, reason: not valid java name */
    public static final void m5256show$lambda3(com.facebook.login.widget.ToolTipPopup this$0, android.view.View view) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.widget.ToolTipPopup.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismiss();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.widget.ToolTipPopup.class);
        }
    }

    public final void setNuxDisplayTime(long displayTime) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.nuxDisplayTime = displayTime;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateArrows() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.widget.PopupWindow popupWindow = this.popupWindow;
            if (popupWindow != null && popupWindow.isShowing()) {
                if (popupWindow.isAboveAnchor()) {
                    com.facebook.login.widget.ToolTipPopup.PopupContentView popupContentView = this.popupContent;
                    if (popupContentView == null) {
                        return;
                    }
                    popupContentView.showBottomArrow();
                    return;
                }
                com.facebook.login.widget.ToolTipPopup.PopupContentView popupContentView2 = this.popupContent;
                if (popupContentView2 == null) {
                    return;
                }
                popupContentView2.showTopArrow();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismiss() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            android.widget.PopupWindow popupWindow = this.popupWindow;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void registerObserver() {
        android.view.ViewTreeObserver viewTreeObserver;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            android.view.View view = this.anchorViewRef.get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(this.scrollListener);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void unregisterObserver() {
        android.view.ViewTreeObserver viewTreeObserver;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.view.View view = this.anchorViewRef.get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.scrollListener);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: ToolTipPopup.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/widget/ToolTipPopup$PopupContentView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Lcom/facebook/login/widget/ToolTipPopup;Landroid/content/Context;)V", "bodyFrame", "Landroid/view/View;", "getBodyFrame", "()Landroid/view/View;", "bottomArrow", "Landroid/widget/ImageView;", "getBottomArrow", "()Landroid/widget/ImageView;", "topArrow", "getTopArrow", "xOut", "getXOut", "showBottomArrow", "", "showTopArrow", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class PopupContentView extends android.widget.FrameLayout {
        private final android.view.View bodyFrame;
        private final android.widget.ImageView bottomArrow;
        final /* synthetic */ com.facebook.login.widget.ToolTipPopup this$0;
        private final android.widget.ImageView topArrow;
        private final android.widget.ImageView xOut;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupContentView(com.facebook.login.widget.ToolTipPopup this$0, android.content.Context context) {
            super(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = this$0;
            android.view.LayoutInflater.from(context).inflate(com.facebook.login.R.layout.com_facebook_tooltip_bubble, this);
            android.view.View findViewById = findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_top_pointer);
            if (findViewById == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.topArrow = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            if (findViewById2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.bottomArrow = (android.widget.ImageView) findViewById2;
            android.view.View findViewById3 = findViewById(com.facebook.login.R.id.com_facebook_body_frame);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.bodyFrame = findViewById3;
            android.view.View findViewById4 = findViewById(com.facebook.login.R.id.com_facebook_button_xout);
            if (findViewById4 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.xOut = (android.widget.ImageView) findViewById4;
        }

        public final android.widget.ImageView getTopArrow() {
            return this.topArrow;
        }

        public final android.widget.ImageView getBottomArrow() {
            return this.bottomArrow;
        }

        public final android.view.View getBodyFrame() {
            return this.bodyFrame;
        }

        public final android.widget.ImageView getXOut() {
            return this.xOut;
        }

        public final void showTopArrow() {
            this.topArrow.setVisibility(0);
            this.bottomArrow.setVisibility(4);
        }

        public final void showBottomArrow() {
            this.topArrow.setVisibility(4);
            this.bottomArrow.setVisibility(0);
        }
    }
}

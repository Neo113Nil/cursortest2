package io.flutter.plugin.platform;

@androidx.annotation.Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private android.widget.FrameLayout container;
    private final android.view.View.OnFocusChangeListener focusChangeListener;
    private final android.content.Context outerContext;
    private io.flutter.plugin.platform.m rootView;
    private boolean startFocused;
    private final io.flutter.plugin.platform.p state;
    private int viewId;

    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.f fVar, io.flutter.plugin.platform.a aVar, int i2, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new io.flutter.plugin.platform.n(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i2;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.state = new io.flutter.plugin.platform.p();
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public io.flutter.plugin.platform.p detachState() {
        android.widget.FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public io.flutter.plugin.platform.f getView() {
        this.state.getClass();
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        io.flutter.plugin.platform.p pVar = this.state;
        if (pVar.f7793b == null) {
            pVar.f7793b = new io.flutter.plugin.platform.l(getContext());
        }
        if (this.state.f7792a == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            io.flutter.plugin.platform.p pVar2 = this.state;
            pVar2.f7792a = new io.flutter.plugin.platform.r(windowManager, pVar2.f7793b);
        }
        this.container = new android.widget.FrameLayout(getContext());
        new io.flutter.plugin.platform.o(getContext(), this.state.f7792a, this.outerContext);
        this.state.getClass();
        throw null;
    }

    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.a aVar, io.flutter.plugin.platform.p pVar, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new io.flutter.plugin.platform.n(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = pVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }
}

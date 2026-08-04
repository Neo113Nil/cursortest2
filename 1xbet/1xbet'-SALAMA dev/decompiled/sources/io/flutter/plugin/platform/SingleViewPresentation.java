package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0913a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private u rootView;
    private boolean startFocused;
    private final x state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, f fVar, C0913a c0913a, int i7, View.OnFocusChangeListener onFocusChangeListener) {
        super(new v(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0913a;
        this.viewId = i7;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        x xVar = new x();
        this.state = xVar;
        xVar.f14221a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public x detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        u uVar = this.rootView;
        if (uVar != null) {
            uVar.removeAllViews();
        }
        return this.state;
    }

    public f getView() {
        return this.state.f14221a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        x xVar = this.state;
        if (xVar.f14223c == null) {
            xVar.f14223c = new t(getContext());
        }
        if (this.state.f14222b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            x xVar2 = this.state;
            xVar2.f14222b = new D(windowManager, xVar2.f14223c);
        }
        this.container = new FrameLayout(getContext());
        w wVar = new w(getContext(), this.state.f14222b, this.outerContext);
        View view = this.state.f14221a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(wVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        u uVar = new u(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = uVar;
        uVar.addView(this.container);
        this.rootView.addView(this.state.f14223c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0913a c0913a, x xVar, View.OnFocusChangeListener onFocusChangeListener, boolean z4) {
        super(new v(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0913a;
        this.state = xVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z4;
    }
}

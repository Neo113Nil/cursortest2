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

/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C1045a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private t rootView;
    private boolean startFocused;
    private final w state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, g gVar, C1045a c1045a, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new u(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1045a;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        w wVar = new w();
        this.state = wVar;
        wVar.f9331a = gVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public w detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        t tVar = this.rootView;
        if (tVar != null) {
            tVar.removeAllViews();
        }
        return this.state;
    }

    public g getView() {
        return this.state.f9331a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        w wVar = this.state;
        if (wVar.f9333c == null) {
            wVar.f9333c = new s(getContext());
        }
        if (this.state.f9332b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            w wVar2 = this.state;
            wVar2.f9332b = new E(windowManager, wVar2.f9333c);
        }
        this.container = new FrameLayout(getContext());
        v vVar = new v(getContext(), this.state.f9332b, this.outerContext);
        View view = this.state.f9331a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(vVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        t tVar = new t(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = tVar;
        tVar.addView(this.container);
        this.rootView.addView(this.state.f9333c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C1045a c1045a, w wVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new u(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1045a;
        this.state = wVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}

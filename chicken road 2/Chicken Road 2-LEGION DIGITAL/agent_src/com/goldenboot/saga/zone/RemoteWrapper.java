package com.goldenboot.saga.zone;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.PluginInterpreter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class RemoteWrapper extends Dialog implements IconRing, GestureOrganizer, MotionDirector, AnchorEdge {
    private androidx.lifecycle.RemoteCallback _lifecycleRegistry;
    private final LayoutSynthesizer onBackPressedDispatcher$delegate;
    private final LayoutSynthesizer onBackPressedInput$delegate;
    private final PatternLatch savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteWrapper(Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void applyTask(RemoteWrapper remoteWrapper) {
        super.onBackPressed();
    }

    private final FadeSegment flushSample() {
        return (FadeSegment) this.onBackPressedInput$delegate.getValue();
    }

    public static final FadeSegment popBlueprint(RemoteWrapper remoteWrapper) {
        FadeSegment fadeSegment = new FadeSegment();
        remoteWrapper.getNavigationEventDispatcher().injectMetric(fadeSegment);
        return fadeSegment;
    }

    public static final PopupProcess updateTimer(final RemoteWrapper remoteWrapper) {
        return new PopupProcess(new Runnable() { // from class: com.goldenboot.saga.zone.ColumnRegistry
            @Override // java.lang.Runnable
            public final void run() {
                RemoteWrapper.applyTask(RemoteWrapper.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.RemoteCallback clipOrigin() {
        androidx.lifecycle.RemoteCallback remoteCallback = this._lifecycleRegistry;
        if (remoteCallback != null) {
            return remoteCallback;
        }
        androidx.lifecycle.RemoteCallback remoteCallback2 = new androidx.lifecycle.RemoteCallback(this);
        this._lifecycleRegistry = remoteCallback2;
        return remoteCallback2;
    }

    @Override // com.goldenboot.saga.zone.IconRing
    public androidx.lifecycle.PluginInterpreter getLifecycle() {
        return clipOrigin();
    }

    @Override // com.goldenboot.saga.zone.MotionDirector
    public BadgeSwitch getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.GestureOrganizer
    public final PopupProcess getOnBackPressedDispatcher() {
        return (PopupProcess) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // com.goldenboot.saga.zone.AnchorEdge
    public CompatInteractor getSavedStateRegistry() {
        return this.savedStateRegistryController.growPayload();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        PressExecutor.growPayload(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        FocusConductor.growPayload(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        CursorMaintainer.growPayload(decorView3, this);
        Window window4 = getWindow();
        Intrinsics.checkNotNull(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        HoverHerald.growPayload(decorView4, this);
    }

    @Override // android.app.Dialog
    @ReceiverAdministrator
    public void onBackPressed() {
        flushSample().peekRevision();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            PopupProcess onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.peekRevision(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.detachStream(bundle);
        clipOrigin().applyTask(PluginInterpreter.ActivityMutator.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "onSaveInstanceState(...)");
        this.savedStateRegistryController.releaseHeader(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        clipOrigin().applyTask(PluginInterpreter.ActivityMutator.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        clipOrigin().applyTask(PluginInterpreter.ActivityMutator.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteWrapper(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedStateRegistryController = PatternLatch.injectMetric.growPayload(this);
        this.onBackPressedInput$delegate = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.DimenSplitter
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                FadeSegment popBlueprint;
                popBlueprint = RemoteWrapper.popBlueprint(RemoteWrapper.this);
                return popBlueprint;
            }
        });
        this.onBackPressedDispatcher$delegate = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.SectionCheckpoint
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                PopupProcess updateTimer;
                updateTimer = RemoteWrapper.updateTimer(RemoteWrapper.this);
                return updateTimer;
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public /* synthetic */ RemoteWrapper(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}

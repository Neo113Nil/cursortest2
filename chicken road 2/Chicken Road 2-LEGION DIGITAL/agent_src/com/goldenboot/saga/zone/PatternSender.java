package com.goldenboot.saga.zone;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.EndpointList;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.goldenboot.saga.zone.ServerLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class PatternSender extends WidgetMaintainer implements ActionBarOverlayLayout.LayerUseCase {
    public static final Interpolator flattenPackage = new AccelerateInterpolator();
    public static final Interpolator injectConstraint = new DecelerateInterpolator();
    public ChannelNormalizer clipOrigin;
    public LayerUseCase connectJob;
    public boolean connectPatch;
    public TapRegulator decodePath;
    public ActionBarOverlayLayout detachStream;
    public boolean drawField;
    public boolean drawRequest;
    public boolean drawScope;
    public Context evictLayout;
    public boolean expandArgs;
    public ActionBarContextView flushSample;
    public Context growPayload;
    public boolean inflateAdapter;
    public Activity injectMetric;
    public ServerLogger peekRevision;
    public boolean purgeNode;
    public boolean reduceScope;
    public ActionBarContainer releaseHeader;
    public ServerLogger.ActivityMutator serializeOffset;
    public View updateTimer;
    public ArrayList applyTask = new ArrayList();
    public int popBlueprint = -1;
    public ArrayList notifyMessage = new ArrayList();
    public int attachConfig = 0;
    public boolean resetDelta = true;
    public boolean gatherAdapter = true;
    public final ToastSaver findTask = new ActivityMutator();
    public final ToastSaver mergeLocale = new BounceHandler();
    public final PinchSignal syncScope = new FeedbackFlow();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends CanvasConstructor {
        public ActivityMutator() {
        }

        @Override // com.goldenboot.saga.zone.ToastSaver
        public void growPayload(View view) {
            View view2;
            PatternSender patternSender = PatternSender.this;
            if (patternSender.resetDelta && (view2 = patternSender.updateTimer) != null) {
                view2.setTranslationY(0.0f);
                PatternSender.this.releaseHeader.setTranslationY(0.0f);
            }
            PatternSender.this.releaseHeader.setVisibility(8);
            PatternSender.this.releaseHeader.setTransitioning(false);
            PatternSender patternSender2 = PatternSender.this;
            patternSender2.decodePath = null;
            patternSender2.gatherAdapter();
            ActionBarOverlayLayout actionBarOverlayLayout = PatternSender.this.detachStream;
            if (actionBarOverlayLayout != null) {
                ItemFacilitator.appendKey(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler extends CanvasConstructor {
        public BounceHandler() {
        }

        @Override // com.goldenboot.saga.zone.ToastSaver
        public void growPayload(View view) {
            PatternSender patternSender = PatternSender.this;
            patternSender.decodePath = null;
            patternSender.releaseHeader.requestLayout();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class FeedbackFlow implements PinchSignal {
        public FeedbackFlow() {
        }

        @Override // com.goldenboot.saga.zone.PinchSignal
        public void evictLayout(View view) {
            ((View) PatternSender.this.releaseHeader.getParent()).invalidate();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class LayerUseCase extends ServerLogger implements EndpointList.ActivityMutator {
        public final androidx.appcompat.view.menu.EndpointList attachConfig;
        public final Context connectPatch;
        public WeakReference inflateAdapter;
        public ServerLogger.ActivityMutator resetDelta;

        public LayerUseCase(Context context, ServerLogger.ActivityMutator activityMutator) {
            this.connectPatch = context;
            this.resetDelta = activityMutator;
            androidx.appcompat.view.menu.EndpointList defaultShowAsAction = new androidx.appcompat.view.menu.EndpointList(context).setDefaultShowAsAction(1);
            this.attachConfig = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void applyTask() {
            if (PatternSender.this.connectJob != this) {
                return;
            }
            this.attachConfig.stopDispatchingItemsChanged();
            try {
                this.resetDelta.injectMetric(this, this.attachConfig);
            } finally {
                this.attachConfig.startDispatchingItemsChanged();
            }
        }

        public boolean attachConfig() {
            this.attachConfig.stopDispatchingItemsChanged();
            try {
                return this.resetDelta.detachStream(this, this.attachConfig);
            } finally {
                this.attachConfig.startDispatchingItemsChanged();
            }
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void connectJob(int i) {
            peekRevision(PatternSender.this.evictLayout.getResources().getString(i));
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void connectPatch(boolean z) {
            super.connectPatch(z);
            PatternSender.this.flushSample.setTitleOptional(z);
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public MenuInflater detachStream() {
            return new IconDiff(this.connectPatch);
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void drawField(View view) {
            PatternSender.this.flushSample.setCustomView(view);
            this.inflateAdapter = new WeakReference(view);
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void evictLayout() {
            PatternSender patternSender = PatternSender.this;
            if (patternSender.connectJob != this) {
                return;
            }
            if (PatternSender.drawRequest(patternSender.inflateAdapter, patternSender.purgeNode, false)) {
                this.resetDelta.growPayload(this);
            } else {
                PatternSender patternSender2 = PatternSender.this;
                patternSender2.peekRevision = this;
                patternSender2.serializeOffset = this.resetDelta;
            }
            this.resetDelta = null;
            PatternSender.this.purgeNode(false);
            PatternSender.this.flushSample.flushSample();
            PatternSender patternSender3 = PatternSender.this;
            patternSender3.detachStream.setHideOnContentScrollEnabled(patternSender3.expandArgs);
            PatternSender.this.connectJob = null;
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public CharSequence flushSample() {
            return PatternSender.this.flushSample.getTitle();
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public View growPayload() {
            WeakReference weakReference = this.inflateAdapter;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public Menu injectMetric() {
            return this.attachConfig;
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void notifyMessage(CharSequence charSequence) {
            PatternSender.this.flushSample.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.EndpointList endpointList, MenuItem menuItem) {
            ServerLogger.ActivityMutator activityMutator = this.resetDelta;
            if (activityMutator != null) {
                return activityMutator.evictLayout(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
        public void onMenuModeChange(androidx.appcompat.view.menu.EndpointList endpointList) {
            if (this.resetDelta == null) {
                return;
            }
            applyTask();
            PatternSender.this.flushSample.connectJob();
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void peekRevision(CharSequence charSequence) {
            PatternSender.this.flushSample.setSubtitle(charSequence);
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public boolean popBlueprint() {
            return PatternSender.this.flushSample.popBlueprint();
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public void reduceScope(int i) {
            notifyMessage(PatternSender.this.evictLayout.getResources().getString(i));
        }

        @Override // com.goldenboot.saga.zone.ServerLogger
        public CharSequence releaseHeader() {
            return PatternSender.this.flushSample.getSubtitle();
        }
    }

    public PatternSender(Activity activity, boolean z) {
        this.injectMetric = activity;
        View decorView = activity.getWindow().getDecorView();
        syncScope(decorView);
        if (z) {
            return;
        }
        this.updateTimer = decorView.findViewById(R.id.content);
    }

    public static boolean drawRequest(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public int applyTask() {
        return this.clipOrigin.inflateAdapter();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void attachConfig(boolean z) {
        TapRegulator tapRegulator;
        this.drawScope = z;
        if (z || (tapRegulator = this.decodePath) == null) {
            return;
        }
        tapRegulator.evictLayout();
    }

    public final void bindBody(boolean z) {
        if (drawRequest(this.inflateAdapter, this.purgeNode, this.drawRequest)) {
            if (this.gatherAdapter) {
                return;
            }
            this.gatherAdapter = true;
            drawScope(z);
            return;
        }
        if (this.gatherAdapter) {
            this.gatherAdapter = false;
            decodePath(z);
        }
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void connectJob(Configuration configuration) {
        filterPayload(KeyframeArray.growPayload(this.evictLayout).releaseHeader());
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void connectPatch(boolean z) {
        if (this.drawField) {
            return;
        }
        flattenPackage(z);
    }

    public void decodePath(boolean z) {
        View view;
        TapRegulator tapRegulator = this.decodePath;
        if (tapRegulator != null) {
            tapRegulator.evictLayout();
        }
        if (this.attachConfig != 0 || (!this.drawScope && !z)) {
            this.findTask.growPayload(null);
            return;
        }
        this.releaseHeader.setAlpha(1.0f);
        this.releaseHeader.setTransitioning(true);
        TapRegulator tapRegulator2 = new TapRegulator();
        float f = -this.releaseHeader.getHeight();
        if (z) {
            this.releaseHeader.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        PulseStack connectJob = ItemFacilitator.releaseHeader(this.releaseHeader).connectJob(f);
        connectJob.popBlueprint(this.syncScope);
        tapRegulator2.injectMetric(connectJob);
        if (this.resetDelta && (view = this.updateTimer) != null) {
            tapRegulator2.injectMetric(ItemFacilitator.releaseHeader(view).connectJob(f));
        }
        tapRegulator2.clipOrigin(flattenPackage);
        tapRegulator2.releaseHeader(250L);
        tapRegulator2.flushSample(this.findTask);
        this.decodePath = tapRegulator2;
        tapRegulator2.updateTimer();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void detachStream() {
        if (this.purgeNode) {
            return;
        }
        this.purgeNode = true;
        bindBody(true);
    }

    public void drawScope(boolean z) {
        View view;
        View view2;
        TapRegulator tapRegulator = this.decodePath;
        if (tapRegulator != null) {
            tapRegulator.evictLayout();
        }
        this.releaseHeader.setVisibility(0);
        if (this.attachConfig == 0 && (this.drawScope || z)) {
            this.releaseHeader.setTranslationY(0.0f);
            float f = -this.releaseHeader.getHeight();
            if (z) {
                this.releaseHeader.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.releaseHeader.setTranslationY(f);
            TapRegulator tapRegulator2 = new TapRegulator();
            PulseStack connectJob = ItemFacilitator.releaseHeader(this.releaseHeader).connectJob(0.0f);
            connectJob.popBlueprint(this.syncScope);
            tapRegulator2.injectMetric(connectJob);
            if (this.resetDelta && (view2 = this.updateTimer) != null) {
                view2.setTranslationY(f);
                tapRegulator2.injectMetric(ItemFacilitator.releaseHeader(this.updateTimer).connectJob(0.0f));
            }
            tapRegulator2.clipOrigin(injectConstraint);
            tapRegulator2.releaseHeader(250L);
            tapRegulator2.flushSample(this.mergeLocale);
            this.decodePath = tapRegulator2;
            tapRegulator2.updateTimer();
        } else {
            this.releaseHeader.setAlpha(1.0f);
            this.releaseHeader.setTranslationY(0.0f);
            if (this.resetDelta && (view = this.updateTimer) != null) {
                view.setTranslationY(0.0f);
            }
            this.mergeLocale.growPayload(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.detachStream;
        if (actionBarOverlayLayout != null) {
            ItemFacilitator.appendKey(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void evictLayout() {
        if (this.purgeNode) {
            this.purgeNode = false;
            bindBody(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChannelNormalizer expandArgs(View view) {
        if (view instanceof ChannelNormalizer) {
            return (ChannelNormalizer) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public final void filterPayload(boolean z) {
        this.connectPatch = z;
        if (z) {
            this.releaseHeader.setTabContainer(null);
            this.clipOrigin.applyTask(null);
        } else {
            this.clipOrigin.applyTask(null);
            this.releaseHeader.setTabContainer(null);
        }
        boolean z2 = false;
        boolean z3 = findTask() == 2;
        this.clipOrigin.gatherAdapter(!this.connectPatch && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.detachStream;
        if (!this.connectPatch && z3) {
            z2 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    public int findTask() {
        return this.clipOrigin.serializeOffset();
    }

    public void flattenPackage(boolean z) {
        injectConstraint(z ? 4 : 0, 4);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean flushSample() {
        ChannelNormalizer channelNormalizer = this.clipOrigin;
        if (channelNormalizer == null || !channelNormalizer.popBlueprint()) {
            return false;
        }
        this.clipOrigin.collapseActionView();
        return true;
    }

    public void gatherAdapter() {
        ServerLogger.ActivityMutator activityMutator = this.serializeOffset;
        if (activityMutator != null) {
            activityMutator.growPayload(this.peekRevision);
            this.peekRevision = null;
            this.serializeOffset = null;
        }
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public ServerLogger inflateAdapter(ServerLogger.ActivityMutator activityMutator) {
        LayerUseCase layerUseCase = this.connectJob;
        if (layerUseCase != null) {
            layerUseCase.evictLayout();
        }
        this.detachStream.setHideOnContentScrollEnabled(false);
        this.flushSample.drawField();
        LayerUseCase layerUseCase2 = new LayerUseCase(this.flushSample.getContext(), activityMutator);
        if (!layerUseCase2.attachConfig()) {
            return null;
        }
        this.connectJob = layerUseCase2;
        layerUseCase2.applyTask();
        this.flushSample.updateTimer(layerUseCase2);
        purgeNode(true);
        return layerUseCase2;
    }

    public void inflateEdge(boolean z) {
        if (z && !this.detachStream.attachConfig()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.expandArgs = z;
        this.detachStream.setHideOnContentScrollEnabled(z);
    }

    public void injectConstraint(int i, int i2) {
        int inflateAdapter = this.clipOrigin.inflateAdapter();
        if ((i2 & 4) != 0) {
            this.drawField = true;
        }
        this.clipOrigin.drawField((i & i2) | ((~i2) & inflateAdapter));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void injectMetric(boolean z) {
        this.resetDelta = z;
    }

    public final void mergeLocale() {
        if (this.drawRequest) {
            this.drawRequest = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.detachStream;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            bindBody(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void onWindowVisibilityChanged(int i) {
        this.attachConfig = i;
    }

    public final boolean packPackage() {
        return this.releaseHeader.isLaidOut();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public Context popBlueprint() {
        if (this.growPayload == null) {
            TypedValue typedValue = new TypedValue();
            this.evictLayout.getTheme().resolveAttribute(AlphaEncoder.releaseHeader, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.growPayload = new ContextThemeWrapper(this.evictLayout, i);
            } else {
                this.growPayload = this.evictLayout;
            }
        }
        return this.growPayload;
    }

    public void purgeNode(boolean z) {
        PulseStack clipOrigin;
        PulseStack pulseStack;
        if (z) {
            unlockMessage();
        } else {
            mergeLocale();
        }
        if (!packPackage()) {
            if (z) {
                this.clipOrigin.connectPatch(4);
                this.flushSample.setVisibility(0);
                return;
            } else {
                this.clipOrigin.connectPatch(0);
                this.flushSample.setVisibility(8);
                return;
            }
        }
        if (z) {
            clipOrigin = this.clipOrigin.reduceScope(4, 100L);
            pulseStack = this.flushSample.clipOrigin(0, 200L);
        } else {
            PulseStack reduceScope = this.clipOrigin.reduceScope(0, 200L);
            clipOrigin = this.flushSample.clipOrigin(8, 100L);
            pulseStack = reduceScope;
        }
        TapRegulator tapRegulator = new TapRegulator();
        tapRegulator.detachStream(clipOrigin, pulseStack);
        tapRegulator.updateTimer();
    }

    public void queryModel(boolean z) {
        this.clipOrigin.resetDelta(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void releaseHeader() {
        TapRegulator tapRegulator = this.decodePath;
        if (tapRegulator != null) {
            tapRegulator.evictLayout();
            this.decodePath = null;
        }
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void resetDelta(CharSequence charSequence) {
        this.clipOrigin.setWindowTitle(charSequence);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean serializeOffset(int i, KeyEvent keyEvent) {
        Menu injectMetric;
        LayerUseCase layerUseCase = this.connectJob;
        if (layerUseCase == null || (injectMetric = layerUseCase.injectMetric()) == null) {
            return false;
        }
        injectMetric.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return injectMetric.performShortcut(i, keyEvent, 0);
    }

    public void storeCharset(float f) {
        ItemFacilitator.refreshCounter(this.releaseHeader, f);
    }

    public final void syncScope(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(TileWork.notifyMessage);
        this.detachStream = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.clipOrigin = expandArgs(view.findViewById(TileWork.evictLayout));
        this.flushSample = (ActionBarContextView) view.findViewById(TileWork.clipOrigin);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(TileWork.injectMetric);
        this.releaseHeader = actionBarContainer;
        ChannelNormalizer channelNormalizer = this.clipOrigin;
        if (channelNormalizer == null || this.flushSample == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.evictLayout = channelNormalizer.getContext();
        boolean z = (this.clipOrigin.inflateAdapter() & 4) != 0;
        if (z) {
            this.drawField = true;
        }
        KeyframeArray growPayload = KeyframeArray.growPayload(this.evictLayout);
        queryModel(growPayload.evictLayout() || z);
        filterPayload(growPayload.releaseHeader());
        TypedArray obtainStyledAttributes = this.evictLayout.obtainStyledAttributes(null, TransitionSteward.evictLayout, AlphaEncoder.injectMetric, 0);
        if (obtainStyledAttributes.getBoolean(TransitionSteward.drawField, false)) {
            inflateEdge(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(TransitionSteward.applyTask, 0);
        if (dimensionPixelSize != 0) {
            storeCharset(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void unlockMessage() {
        if (this.drawRequest) {
            return;
        }
        this.drawRequest = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.detachStream;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        bindBody(false);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void updateTimer(boolean z) {
        if (z == this.reduceScope) {
            return;
        }
        this.reduceScope = z;
        if (this.notifyMessage.size() <= 0) {
            return;
        }
        TransitionMemento.evictLayout(this.notifyMessage.get(0));
        throw null;
    }

    public PatternSender(Dialog dialog) {
        syncScope(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.LayerUseCase
    public void growPayload() {
    }
}

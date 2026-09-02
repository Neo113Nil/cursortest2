package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.EndpointList;
import androidx.appcompat.view.menu.RestoreToggle;
import androidx.appcompat.widget.Toolbar;
import com.goldenboot.saga.zone.SpanGraph;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class WaveArranger extends WidgetMaintainer {
    public final Toolbar.PluginInterpreter applyTask;
    public boolean clipOrigin;
    public boolean detachStream;
    public final ChannelNormalizer evictLayout;
    public final Window.Callback growPayload;
    public final SpanGraph.ScopedMigration injectMetric;
    public boolean releaseHeader;
    public ArrayList flushSample = new ArrayList();
    public final Runnable updateTimer = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator implements Runnable {
        public ActivityMutator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WaveArranger.this.drawRequest();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler implements Toolbar.PluginInterpreter {
        public BounceHandler() {
        }

        @Override // androidx.appcompat.widget.Toolbar.PluginInterpreter
        public boolean onMenuItemClick(MenuItem menuItem) {
            return WaveArranger.this.growPayload.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class EndpointList implements SpanGraph.ScopedMigration {
        public EndpointList() {
        }

        @Override // com.goldenboot.saga.zone.SpanGraph.ScopedMigration
        public boolean evictLayout(int i) {
            if (i != 0) {
                return false;
            }
            WaveArranger waveArranger = WaveArranger.this;
            if (waveArranger.detachStream) {
                return false;
            }
            waveArranger.evictLayout.injectMetric();
            WaveArranger.this.detachStream = true;
            return false;
        }

        @Override // com.goldenboot.saga.zone.SpanGraph.ScopedMigration
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(WaveArranger.this.evictLayout.getContext());
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class FeedbackFlow implements RestoreToggle.ActivityMutator {
        public boolean reduceScope;

        public FeedbackFlow() {
        }

        @Override // androidx.appcompat.view.menu.RestoreToggle.ActivityMutator
        public boolean evictLayout(androidx.appcompat.view.menu.EndpointList endpointList) {
            WaveArranger.this.growPayload.onMenuOpened(108, endpointList);
            return true;
        }

        @Override // androidx.appcompat.view.menu.RestoreToggle.ActivityMutator
        public void onCloseMenu(androidx.appcompat.view.menu.EndpointList endpointList, boolean z) {
            if (this.reduceScope) {
                return;
            }
            this.reduceScope = true;
            WaveArranger.this.evictLayout.updateTimer();
            WaveArranger.this.growPayload.onPanelClosed(108, endpointList);
            this.reduceScope = false;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class LayerUseCase implements EndpointList.ActivityMutator {
        public LayerUseCase() {
        }

        @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.EndpointList endpointList, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
        public void onMenuModeChange(androidx.appcompat.view.menu.EndpointList endpointList) {
            if (WaveArranger.this.evictLayout.growPayload()) {
                WaveArranger.this.growPayload.onPanelClosed(108, endpointList);
            } else if (WaveArranger.this.growPayload.onPreparePanel(0, null, endpointList)) {
                WaveArranger.this.growPayload.onMenuOpened(108, endpointList);
            }
        }
    }

    public WaveArranger(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        BounceHandler bounceHandler = new BounceHandler();
        this.applyTask = bounceHandler;
        GroupBroadcaster.flushSample(toolbar);
        androidx.appcompat.widget.LayerUseCase layerUseCase = new androidx.appcompat.widget.LayerUseCase(toolbar, false);
        this.evictLayout = layerUseCase;
        this.growPayload = (Window.Callback) GroupBroadcaster.flushSample(callback);
        layerUseCase.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bounceHandler);
        layerUseCase.setWindowTitle(charSequence);
        this.injectMetric = new EndpointList();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public int applyTask() {
        return this.evictLayout.inflateAdapter();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean clipOrigin() {
        return this.evictLayout.clipOrigin();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void connectJob(Configuration configuration) {
        super.connectJob(configuration);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean drawField() {
        this.evictLayout.attachConfig().removeCallbacks(this.updateTimer);
        ItemFacilitator.cancelArchive(this.evictLayout.attachConfig(), this.updateTimer);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawRequest() {
        Menu purgeNode = purgeNode();
        androidx.appcompat.view.menu.EndpointList endpointList = purgeNode instanceof androidx.appcompat.view.menu.EndpointList ? (androidx.appcompat.view.menu.EndpointList) purgeNode : null;
        if (endpointList != null) {
            endpointList.stopDispatchingItemsChanged();
        }
        try {
            purgeNode.clear();
            if (this.growPayload.onCreatePanelMenu(0, purgeNode)) {
                if (!this.growPayload.onPreparePanel(0, null, purgeNode)) {
                }
                if (endpointList == null) {
                    endpointList.startDispatchingItemsChanged();
                    return;
                }
                return;
            }
            purgeNode.clear();
            if (endpointList == null) {
            }
        } catch (Throwable th) {
            if (endpointList != null) {
                endpointList.startDispatchingItemsChanged();
            }
            throw th;
        }
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean flushSample() {
        if (!this.evictLayout.popBlueprint()) {
            return false;
        }
        this.evictLayout.collapseActionView();
        return true;
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean notifyMessage() {
        return this.evictLayout.flushSample();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void peekRevision() {
        this.evictLayout.attachConfig().removeCallbacks(this.updateTimer);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public Context popBlueprint() {
        return this.evictLayout.getContext();
    }

    public final Menu purgeNode() {
        if (!this.releaseHeader) {
            this.evictLayout.notifyMessage(new FeedbackFlow(), new LayerUseCase());
            this.releaseHeader = true;
        }
        return this.evictLayout.connectJob();
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean reduceScope(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            notifyMessage();
        }
        return true;
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void resetDelta(CharSequence charSequence) {
        this.evictLayout.setWindowTitle(charSequence);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public boolean serializeOffset(int i, KeyEvent keyEvent) {
        Menu purgeNode = purgeNode();
        if (purgeNode == null) {
            return false;
        }
        purgeNode.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return purgeNode.performShortcut(i, keyEvent, 0);
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void updateTimer(boolean z) {
        if (z == this.clipOrigin) {
            return;
        }
        this.clipOrigin = z;
        if (this.flushSample.size() <= 0) {
            return;
        }
        TransitionMemento.evictLayout(this.flushSample.get(0));
        throw null;
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void attachConfig(boolean z) {
    }

    @Override // com.goldenboot.saga.zone.WidgetMaintainer
    public void connectPatch(boolean z) {
    }
}

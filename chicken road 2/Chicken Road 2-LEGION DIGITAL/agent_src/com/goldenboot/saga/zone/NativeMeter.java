package com.goldenboot.saga.zone;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.EndpointList;
import androidx.appcompat.widget.ActionBarContextView;
import com.goldenboot.saga.zone.ServerLogger;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class NativeMeter extends ServerLogger implements EndpointList.ActivityMutator {
    public ActionBarContextView attachConfig;
    public Context connectPatch;
    public boolean drawRequest;
    public androidx.appcompat.view.menu.EndpointList gatherAdapter;
    public WeakReference inflateAdapter;
    public boolean purgeNode;
    public ServerLogger.ActivityMutator resetDelta;

    public NativeMeter(Context context, ActionBarContextView actionBarContextView, ServerLogger.ActivityMutator activityMutator, boolean z) {
        this.connectPatch = context;
        this.attachConfig = actionBarContextView;
        this.resetDelta = activityMutator;
        androidx.appcompat.view.menu.EndpointList defaultShowAsAction = new androidx.appcompat.view.menu.EndpointList(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.gatherAdapter = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.drawRequest = z;
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void applyTask() {
        this.resetDelta.injectMetric(this, this.gatherAdapter);
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void connectJob(int i) {
        peekRevision(this.connectPatch.getString(i));
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void connectPatch(boolean z) {
        super.connectPatch(z);
        this.attachConfig.setTitleOptional(z);
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public MenuInflater detachStream() {
        return new IconDiff(this.attachConfig.getContext());
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void drawField(View view) {
        this.attachConfig.setCustomView(view);
        this.inflateAdapter = view != null ? new WeakReference(view) : null;
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void evictLayout() {
        if (this.purgeNode) {
            return;
        }
        this.purgeNode = true;
        this.resetDelta.growPayload(this);
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public CharSequence flushSample() {
        return this.attachConfig.getTitle();
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
        return this.gatherAdapter;
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void notifyMessage(CharSequence charSequence) {
        this.attachConfig.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.EndpointList endpointList, MenuItem menuItem) {
        return this.resetDelta.evictLayout(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.EndpointList.ActivityMutator
    public void onMenuModeChange(androidx.appcompat.view.menu.EndpointList endpointList) {
        applyTask();
        this.attachConfig.connectJob();
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void peekRevision(CharSequence charSequence) {
        this.attachConfig.setSubtitle(charSequence);
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public boolean popBlueprint() {
        return this.attachConfig.popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public void reduceScope(int i) {
        notifyMessage(this.connectPatch.getString(i));
    }

    @Override // com.goldenboot.saga.zone.ServerLogger
    public CharSequence releaseHeader() {
        return this.attachConfig.getSubtitle();
    }
}

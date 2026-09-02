package com.goldenboot.saga.zone;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010.R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b2\u0010&\"\u0004\b3\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b4\u0010&\"\u0004\b5\u0010.R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010$\u001a\u0004\b/\u0010&\"\u0004\b6\u0010.¨\u00067"}, d2 = {"Lcom/goldenboot/saga/zone/PointerHook;", "", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "onActionModeDestroy", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ChipSnapshot;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;Lcom/goldenboot/saga/zone/ElevationNode;)V", "Landroid/view/Menu;", "menu", "Lcom/goldenboot/saga/zone/RestoreBus;", "item", "callback", "growPayload", "(Landroid/view/Menu;Lcom/goldenboot/saga/zone/RestoreBus;Lcom/goldenboot/saga/zone/ElevationNode;)V", "Landroid/view/ActionMode;", "mode", "", "drawField", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "peekRevision", "Landroid/view/MenuItem;", "popBlueprint", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "connectJob", "()V", "inflateAdapter", "(Landroid/view/Menu;)V", "evictLayout", "(Landroid/view/Menu;Lcom/goldenboot/saga/zone/RestoreBus;)V", "Lcom/goldenboot/saga/zone/ElevationNode;", "injectMetric", "()Lcom/goldenboot/saga/zone/ElevationNode;", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "applyTask", "()Lcom/goldenboot/saga/zone/ChipSnapshot;", "resetDelta", "(Lcom/goldenboot/saga/zone/ChipSnapshot;)V", "releaseHeader", "reduceScope", "(Lcom/goldenboot/saga/zone/ElevationNode;)V", "detachStream", "flushSample", "connectPatch", "clipOrigin", "notifyMessage", "updateTimer", "attachConfig", "serializeOffset", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerHook {
    public static final int updateTimer = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private ElevationNode onSelectAllRequested;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private ElevationNode onPasteRequested;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final ElevationNode onActionModeDestroy;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private ElevationNode onAutofillRequested;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private ChipSnapshot rect;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private ElevationNode onCopyRequested;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private ElevationNode onCutRequested;

    public PointerHook() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void growPayload(Menu menu, RestoreBus item, ElevationNode callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            evictLayout(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    /* renamed from: applyTask, reason: from getter */
    public final ChipSnapshot getRect() {
        return this.rect;
    }

    public final void attachConfig(ElevationNode elevationNode) {
        this.onSelectAllRequested = elevationNode;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final ElevationNode getOnCutRequested() {
        return this.onCutRequested;
    }

    public final void connectJob() {
        ElevationNode elevationNode = this.onActionModeDestroy;
        if (elevationNode != null) {
            elevationNode.invoke();
        }
    }

    public final void connectPatch(ElevationNode elevationNode) {
        this.onPasteRequested = elevationNode;
    }

    /* renamed from: detachStream, reason: from getter */
    public final ElevationNode getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final boolean drawField(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            evictLayout(menu, RestoreBus.connectPatch);
        }
        if (this.onPasteRequested != null) {
            evictLayout(menu, RestoreBus.attachConfig);
        }
        if (this.onCutRequested != null) {
            evictLayout(menu, RestoreBus.resetDelta);
        }
        if (this.onSelectAllRequested != null) {
            evictLayout(menu, RestoreBus.inflateAdapter);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        evictLayout(menu, RestoreBus.purgeNode);
        return true;
    }

    public final void evictLayout(Menu menu, RestoreBus item) {
        menu.add(0, item.getId(), item.getOrder(), item.applyTask()).setShowAsAction(1);
    }

    /* renamed from: flushSample, reason: from getter */
    public final ElevationNode getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final void inflateAdapter(Menu menu) {
        growPayload(menu, RestoreBus.connectPatch, this.onCopyRequested);
        growPayload(menu, RestoreBus.attachConfig, this.onPasteRequested);
        growPayload(menu, RestoreBus.resetDelta, this.onCutRequested);
        growPayload(menu, RestoreBus.inflateAdapter, this.onSelectAllRequested);
        growPayload(menu, RestoreBus.purgeNode, this.onAutofillRequested);
    }

    /* renamed from: injectMetric, reason: from getter */
    public final ElevationNode getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final void notifyMessage(ElevationNode elevationNode) {
        this.onCutRequested = elevationNode;
    }

    public final boolean peekRevision(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        inflateAdapter(menu);
        return true;
    }

    public final boolean popBlueprint(ActionMode mode, MenuItem item) {
        Intrinsics.checkNotNull(item);
        int itemId = item.getItemId();
        if (itemId == RestoreBus.connectPatch.getId()) {
            ElevationNode elevationNode = this.onCopyRequested;
            if (elevationNode != null) {
                elevationNode.invoke();
            }
        } else if (itemId == RestoreBus.attachConfig.getId()) {
            ElevationNode elevationNode2 = this.onPasteRequested;
            if (elevationNode2 != null) {
                elevationNode2.invoke();
            }
        } else if (itemId == RestoreBus.resetDelta.getId()) {
            ElevationNode elevationNode3 = this.onCutRequested;
            if (elevationNode3 != null) {
                elevationNode3.invoke();
            }
        } else if (itemId == RestoreBus.inflateAdapter.getId()) {
            ElevationNode elevationNode4 = this.onSelectAllRequested;
            if (elevationNode4 != null) {
                elevationNode4.invoke();
            }
        } else {
            if (itemId != RestoreBus.purgeNode.getId()) {
                return false;
            }
            ElevationNode elevationNode5 = this.onAutofillRequested;
            if (elevationNode5 != null) {
                elevationNode5.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final void reduceScope(ElevationNode elevationNode) {
        this.onCopyRequested = elevationNode;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final ElevationNode getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final void resetDelta(ChipSnapshot chipSnapshot) {
        this.rect = chipSnapshot;
    }

    public final void serializeOffset(ElevationNode elevationNode) {
        this.onAutofillRequested = elevationNode;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final ElevationNode getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public PointerHook(ElevationNode elevationNode, ChipSnapshot chipSnapshot, ElevationNode elevationNode2, ElevationNode elevationNode3, ElevationNode elevationNode4, ElevationNode elevationNode5, ElevationNode elevationNode6) {
        this.onActionModeDestroy = elevationNode;
        this.rect = chipSnapshot;
        this.onCopyRequested = elevationNode2;
        this.onPasteRequested = elevationNode3;
        this.onCutRequested = elevationNode4;
        this.onSelectAllRequested = elevationNode5;
        this.onAutofillRequested = elevationNode6;
    }

    public /* synthetic */ PointerHook(ElevationNode elevationNode, ChipSnapshot chipSnapshot, ElevationNode elevationNode2, ElevationNode elevationNode3, ElevationNode elevationNode4, ElevationNode elevationNode5, ElevationNode elevationNode6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : elevationNode, (i & 2) != 0 ? ChipSnapshot.INSTANCE.evictLayout() : chipSnapshot, (i & 4) != 0 ? null : elevationNode2, (i & 8) != 0 ? null : elevationNode3, (i & 16) != 0 ? null : elevationNode4, (i & 32) != 0 ? null : elevationNode5, (i & 64) != 0 ? null : elevationNode6);
    }
}

package com.goldenboot.saga.zone;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.goldenboot.saga.zone.SlotMediator;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ObserverSaver {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends View.AccessibilityDelegate {
        public final ObserverSaver evictLayout;

        public ActivityMutator(ObserverSaver observerSaver) {
            this.evictLayout = observerSaver;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.evictLayout.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            FlexProcessor accessibilityNodeProvider = this.evictLayout.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.releaseHeader();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.evictLayout.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            SlotMediator connectPool = SlotMediator.connectPool(accessibilityNodeInfo);
            connectPool.measureEndpoint(ItemFacilitator.parseAsset(view));
            connectPool.loadItem(ItemFacilitator.unlockMessage(view));
            connectPool.flattenToken(ItemFacilitator.connectJob(view));
            connectPool.observeNode(ItemFacilitator.syncScope(view));
            this.evictLayout.onInitializeAccessibilityNodeInfo(view, connectPool);
            connectPool.releaseHeader(accessibilityNodeInfo.getText(), view);
            List<SlotMediator.ActivityMutator> actionList = ObserverSaver.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                connectPool.growPayload(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.evictLayout.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.evictLayout.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.evictLayout.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.evictLayout.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.evictLayout.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public ObserverSaver() {
        this(DEFAULT_DELEGATE);
    }

    public static List<SlotMediator.ActivityMutator> getActionList(View view) {
        List<SlotMediator.ActivityMutator> list = (List) view.getTag(CompatPropagator.inflateEdge);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean evictLayout(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] attachConfig = SlotMediator.attachConfig(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; attachConfig != null && i < attachConfig.length; i++) {
                if (clickableSpan.equals(attachConfig[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public FlexProcessor getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new FlexProcessor(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public final boolean growPayload(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(CompatPropagator.queryModel);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!evictLayout(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, SlotMediator slotMediator) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, slotMediator.flushHeader());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<SlotMediator.ActivityMutator> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            SlotMediator.ActivityMutator activityMutator = actionList.get(i2);
            if (activityMutator.growPayload() == i) {
                z = activityMutator.detachStream(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != CompatPropagator.evictLayout || bundle == null) ? z : growPayload(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public ObserverSaver(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new ActivityMutator(this);
    }
}

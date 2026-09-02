package com.goldenboot.saga.zone;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class SpacerHandler {
    public static DialogChannel evictLayout = new SingletonTranslator();
    public static ThreadLocal growPayload = new ThreadLocal();
    public static ArrayList injectMetric = new ArrayList();

    public static void detachStream(ViewGroup viewGroup, DialogChannel dialogChannel) {
        ArrayList arrayList = (ArrayList) growPayload().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((DialogChannel) obj).pause(viewGroup);
            }
        }
        if (dialogChannel != null) {
            dialogChannel.captureValues(viewGroup, true);
        }
        ScrollNode.evictLayout(viewGroup);
    }

    public static void evictLayout(ViewGroup viewGroup, DialogChannel dialogChannel) {
        if (injectMetric.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        injectMetric.add(viewGroup);
        if (dialogChannel == null) {
            dialogChannel = evictLayout;
        }
        DialogChannel mo3clone = dialogChannel.mo3clone();
        detachStream(viewGroup, mo3clone);
        ScrollNode.growPayload(viewGroup, null);
        injectMetric(viewGroup, mo3clone);
    }

    public static TouchStack growPayload() {
        TouchStack touchStack;
        WeakReference weakReference = (WeakReference) growPayload.get();
        if (weakReference != null && (touchStack = (TouchStack) weakReference.get()) != null) {
            return touchStack;
        }
        TouchStack touchStack2 = new TouchStack();
        growPayload.set(new WeakReference(touchStack2));
        return touchStack2;
    }

    public static void injectMetric(ViewGroup viewGroup, DialogChannel dialogChannel) {
        if (dialogChannel == null || viewGroup == null) {
            return;
        }
        ActivityMutator activityMutator = new ActivityMutator(dialogChannel, viewGroup);
        viewGroup.addOnAttachStateChangeListener(activityMutator);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(activityMutator);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class ActivityMutator implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public ViewGroup notifyMessage;
        public DialogChannel reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.SpacerHandler$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public class C0171ActivityMutator extends TileEmitter {
            public final /* synthetic */ TouchStack evictLayout;

            public C0171ActivityMutator(TouchStack touchStack) {
                this.evictLayout = touchStack;
            }

            @Override // com.goldenboot.saga.zone.TileEmitter, com.goldenboot.saga.zone.DialogChannel.RestoreToggle
            public void onTransitionEnd(DialogChannel dialogChannel) {
                ((ArrayList) this.evictLayout.get(ActivityMutator.this.notifyMessage)).remove(dialogChannel);
                dialogChannel.removeListener(this);
            }
        }

        public ActivityMutator(DialogChannel dialogChannel, ViewGroup viewGroup) {
            this.reduceScope = dialogChannel;
            this.notifyMessage = viewGroup;
        }

        public final void evictLayout() {
            this.notifyMessage.getViewTreeObserver().removeOnPreDrawListener(this);
            this.notifyMessage.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            evictLayout();
            if (!SpacerHandler.injectMetric.remove(this.notifyMessage)) {
                return true;
            }
            TouchStack growPayload = SpacerHandler.growPayload();
            ArrayList arrayList = (ArrayList) growPayload.get(this.notifyMessage);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                growPayload.put(this.notifyMessage, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.reduceScope);
            this.reduceScope.addListener(new C0171ActivityMutator(growPayload));
            int i = 0;
            this.reduceScope.captureValues(this.notifyMessage, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((DialogChannel) obj).resume(this.notifyMessage);
                }
            }
            this.reduceScope.playTransition(this.notifyMessage);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            evictLayout();
            SpacerHandler.injectMetric.remove(this.notifyMessage);
            ArrayList arrayList = (ArrayList) SpacerHandler.growPayload().get(this.notifyMessage);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((DialogChannel) obj).resume(this.notifyMessage);
                }
            }
            this.reduceScope.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}

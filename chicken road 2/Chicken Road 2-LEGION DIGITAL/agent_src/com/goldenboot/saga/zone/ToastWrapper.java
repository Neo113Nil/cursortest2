package com.goldenboot.saga.zone;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.goldenboot.saga.zone.DialogChannel;
import com.goldenboot.saga.zone.JoystickRecovery;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ToastWrapper extends DelegateFacilitator {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class ActivityMutator extends DialogChannel.StylusConverter {
        public final /* synthetic */ Rect evictLayout;

        public ActivityMutator(Rect rect) {
            this.evictLayout = rect;
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.StylusConverter
        public Rect evictLayout(DialogChannel dialogChannel) {
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class EndpointList extends DialogChannel.StylusConverter {
        public final /* synthetic */ Rect evictLayout;

        public EndpointList(Rect rect) {
            this.evictLayout = rect;
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.StylusConverter
        public Rect evictLayout(DialogChannel dialogChannel) {
            Rect rect = this.evictLayout;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class FeedbackFlow extends TileEmitter {
        public final /* synthetic */ ArrayList clipOrigin;
        public final /* synthetic */ ArrayList detachStream;
        public final /* synthetic */ Object evictLayout;
        public final /* synthetic */ ArrayList growPayload;
        public final /* synthetic */ Object injectMetric;
        public final /* synthetic */ Object releaseHeader;

        public FeedbackFlow(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.evictLayout = obj;
            this.growPayload = arrayList;
            this.injectMetric = obj2;
            this.detachStream = arrayList2;
            this.releaseHeader = obj3;
            this.clipOrigin = arrayList3;
        }

        @Override // com.goldenboot.saga.zone.TileEmitter, com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionEnd(DialogChannel dialogChannel) {
            dialogChannel.removeListener(this);
        }

        @Override // com.goldenboot.saga.zone.TileEmitter, com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionStart(DialogChannel dialogChannel) {
            Object obj = this.evictLayout;
            if (obj != null) {
                ToastWrapper.this.decodePath(obj, this.growPayload, null);
            }
            Object obj2 = this.injectMetric;
            if (obj2 != null) {
                ToastWrapper.this.decodePath(obj2, this.detachStream, null);
            }
            Object obj3 = this.releaseHeader;
            if (obj3 != null) {
                ToastWrapper.this.decodePath(obj3, this.clipOrigin, null);
            }
        }
    }

    public static /* synthetic */ void drawRequest(Runnable runnable, DialogChannel dialogChannel, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            dialogChannel.cancel();
            runnable2.run();
        }
    }

    public static boolean gatherAdapter(DialogChannel dialogChannel) {
        return (DelegateFacilitator.applyTask(dialogChannel.getTargetIds()) && DelegateFacilitator.applyTask(dialogChannel.getTargetNames()) && DelegateFacilitator.applyTask(dialogChannel.getTargetTypes())) ? false : true;
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public Object clipOrigin(Object obj) {
        if (obj != null) {
            return ((DialogChannel) obj).mo3clone();
        }
        return null;
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void connectPatch(androidx.fragment.app.LayerUseCase layerUseCase, Object obj, JoystickRecovery joystickRecovery, Runnable runnable) {
        drawScope(layerUseCase, obj, joystickRecovery, null, runnable);
    }

    public void decodePath(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        DialogChannel dialogChannel = (DialogChannel) obj;
        int i = 0;
        if (dialogChannel instanceof ResponseMutator) {
            ResponseMutator responseMutator = (ResponseMutator) dialogChannel;
            int mergeLocale = responseMutator.mergeLocale();
            while (i < mergeLocale) {
                decodePath(responseMutator.findTask(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (gatherAdapter(dialogChannel)) {
            return;
        }
        List<View> targets = dialogChannel.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                dialogChannel.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                dialogChannel.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public Object drawField(Object obj, Object obj2, Object obj3) {
        ResponseMutator responseMutator = new ResponseMutator();
        if (obj != null) {
            responseMutator.drawScope((DialogChannel) obj);
        }
        if (obj2 != null) {
            responseMutator.drawScope((DialogChannel) obj2);
        }
        if (obj3 != null) {
            responseMutator.drawScope((DialogChannel) obj3);
        }
        return responseMutator;
    }

    public void drawScope(androidx.fragment.app.LayerUseCase layerUseCase, Object obj, JoystickRecovery joystickRecovery, final Runnable runnable, final Runnable runnable2) {
        final DialogChannel dialogChannel = (DialogChannel) obj;
        joystickRecovery.growPayload(new JoystickRecovery.ActivityMutator() { // from class: com.goldenboot.saga.zone.LayoutSanitizer
            @Override // com.goldenboot.saga.zone.JoystickRecovery.ActivityMutator
            public final void onCancel() {
                ToastWrapper.drawRequest(runnable, dialogChannel, runnable2);
            }
        });
        dialogChannel.addListener(new LayerUseCase(runnable2));
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void evictLayout(Object obj, View view) {
        if (obj != null) {
            ((DialogChannel) obj).addTarget(view);
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void growPayload(Object obj, ArrayList arrayList) {
        DialogChannel dialogChannel = (DialogChannel) obj;
        if (dialogChannel == null) {
            return;
        }
        int i = 0;
        if (dialogChannel instanceof ResponseMutator) {
            ResponseMutator responseMutator = (ResponseMutator) dialogChannel;
            int mergeLocale = responseMutator.mergeLocale();
            while (i < mergeLocale) {
                growPayload(responseMutator.findTask(i), arrayList);
                i++;
            }
            return;
        }
        if (gatherAdapter(dialogChannel) || !DelegateFacilitator.applyTask(dialogChannel.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            dialogChannel.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void inflateAdapter(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ResponseMutator responseMutator = (ResponseMutator) obj;
        if (responseMutator != null) {
            responseMutator.getTargets().clear();
            responseMutator.getTargets().addAll(arrayList2);
            decodePath(responseMutator, arrayList, arrayList2);
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void injectMetric(ViewGroup viewGroup, Object obj) {
        SpacerHandler.evictLayout(viewGroup, (DialogChannel) obj);
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void notifyMessage(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            updateTimer(view, rect);
            ((DialogChannel) obj).setEpicenterCallback(new ActivityMutator(rect));
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void peekRevision(Object obj, View view, ArrayList arrayList) {
        ((DialogChannel) obj).addListener(new BounceHandler(view, arrayList));
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public Object popBlueprint(Object obj, Object obj2, Object obj3) {
        DialogChannel dialogChannel = (DialogChannel) obj;
        DialogChannel dialogChannel2 = (DialogChannel) obj2;
        DialogChannel dialogChannel3 = (DialogChannel) obj3;
        if (dialogChannel != null && dialogChannel2 != null) {
            dialogChannel = new ResponseMutator().drawScope(dialogChannel).drawScope(dialogChannel2).bindBody(1);
        } else if (dialogChannel == null) {
            dialogChannel = dialogChannel2 != null ? dialogChannel2 : null;
        }
        if (dialogChannel3 == null) {
            return dialogChannel;
        }
        ResponseMutator responseMutator = new ResponseMutator();
        if (dialogChannel != null) {
            responseMutator.drawScope(dialogChannel);
        }
        responseMutator.drawScope(dialogChannel3);
        return responseMutator;
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public Object purgeNode(Object obj) {
        if (obj == null) {
            return null;
        }
        ResponseMutator responseMutator = new ResponseMutator();
        responseMutator.drawScope((DialogChannel) obj);
        return responseMutator;
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void reduceScope(Object obj, Rect rect) {
        if (obj != null) {
            ((DialogChannel) obj).setEpicenterCallback(new EndpointList(rect));
        }
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public boolean releaseHeader(Object obj) {
        return obj instanceof DialogChannel;
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void resetDelta(Object obj, View view, ArrayList arrayList) {
        ResponseMutator responseMutator = (ResponseMutator) obj;
        List<View> targets = responseMutator.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            DelegateFacilitator.detachStream(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        growPayload(responseMutator, arrayList);
    }

    @Override // com.goldenboot.saga.zone.DelegateFacilitator
    public void serializeOffset(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((DialogChannel) obj).addListener(new FeedbackFlow(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class BounceHandler implements DialogChannel.RestoreToggle {
        public final /* synthetic */ View evictLayout;
        public final /* synthetic */ ArrayList growPayload;

        public BounceHandler(View view, ArrayList arrayList) {
            this.evictLayout = view;
            this.growPayload = arrayList;
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionEnd(DialogChannel dialogChannel) {
            dialogChannel.removeListener(this);
            this.evictLayout.setVisibility(8);
            int size = this.growPayload.size();
            for (int i = 0; i < size; i++) {
                ((View) this.growPayload.get(i)).setVisibility(0);
            }
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionStart(DialogChannel dialogChannel) {
            dialogChannel.removeListener(this);
            dialogChannel.addListener(this);
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionCancel(DialogChannel dialogChannel) {
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionPause(DialogChannel dialogChannel) {
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionResume(DialogChannel dialogChannel) {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public class LayerUseCase implements DialogChannel.RestoreToggle {
        public final /* synthetic */ Runnable evictLayout;

        public LayerUseCase(Runnable runnable) {
            this.evictLayout = runnable;
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionEnd(DialogChannel dialogChannel) {
            this.evictLayout.run();
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionCancel(DialogChannel dialogChannel) {
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionPause(DialogChannel dialogChannel) {
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionResume(DialogChannel dialogChannel) {
        }

        @Override // com.goldenboot.saga.zone.DialogChannel.RestoreToggle
        public void onTransitionStart(DialogChannel dialogChannel) {
        }
    }
}

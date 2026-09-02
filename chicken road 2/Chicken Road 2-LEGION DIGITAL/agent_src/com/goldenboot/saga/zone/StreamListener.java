package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.DpadNotifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@DpadNotifier.BounceHandler("composable")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/goldenboot/saga/zone/StreamListener;", "Lcom/goldenboot/saga/zone/DpadNotifier;", "Lcom/goldenboot/saga/zone/StreamListener$BounceHandler;", "<init>", "()V", "", "Lcom/goldenboot/saga/zone/StateMaintainer;", "entries", "Lcom/goldenboot/saga/zone/ColorStore;", "navOptions", "Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;", "navigatorExtras", "Lcom/goldenboot/saga/zone/DpadBuilder;", "releaseHeader", "(Ljava/util/List;Lcom/goldenboot/saga/zone/ColorStore;Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;)V", "connectJob", "()Lcom/goldenboot/saga/zone/StreamListener$BounceHandler;", "popUpTo", "", "savedState", "popBlueprint", "(Lcom/goldenboot/saga/zone/StateMaintainer;Z)V", "entry", "notifyMessage", "(Lcom/goldenboot/saga/zone/StateMaintainer;)V", "reduceScope", "Lcom/goldenboot/saga/zone/SlotDispatcher;", "injectMetric", "Lcom/goldenboot/saga/zone/SlotDispatcher;", "serializeOffset", "()Lcom/goldenboot/saga/zone/SlotDispatcher;", "isPop", "Lcom/goldenboot/saga/zone/AccentFactory;", "peekRevision", "()Lcom/goldenboot/saga/zone/AccentFactory;", "backStack", "detachStream", "ActivityMutator", "BounceHandler", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StreamListener extends DpadNotifier {

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public final SlotDispatcher isPop = StylusDetector.releaseHeader(Boolean.FALSE, null, 2, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends ListSwitch {
        public final BoxSteward findTask;
        public TouchRecord flattenPackage;
        public TouchRecord injectConstraint;
        public TouchRecord mergeLocale;
        public TouchRecord storeCharset;
        public TouchRecord syncScope;

        public BounceHandler(StreamListener streamListener, BoxSteward boxSteward) {
            super(streamListener);
            this.findTask = boxSteward;
        }

        public final TouchRecord attachCallback() {
            return this.mergeLocale;
        }

        public final void cancelArchive(TouchRecord touchRecord) {
            this.injectConstraint = touchRecord;
        }

        public final TouchRecord connectComponent() {
            return this.injectConstraint;
        }

        public final void formatPosition(TouchRecord touchRecord) {
            this.mergeLocale = touchRecord;
        }

        public final void groupArchive(TouchRecord touchRecord) {
            this.flattenPackage = touchRecord;
        }

        public final BoxSteward mapJob() {
            return this.findTask;
        }

        public final TouchRecord prepareTask() {
            return this.syncScope;
        }

        public final void resolveDelta(TouchRecord touchRecord) {
            this.storeCharset = touchRecord;
        }

        public final void resumeSignature(TouchRecord touchRecord) {
            this.syncScope = touchRecord;
        }

        public final TouchRecord startResource() {
            return this.storeCharset;
        }

        public final TouchRecord updateAction() {
            return this.flattenPackage;
        }
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    /* renamed from: connectJob, reason: merged with bridge method [inline-methods] */
    public BounceHandler evictLayout() {
        return new BounceHandler(this, MotionHerald.evictLayout.evictLayout());
    }

    public final void notifyMessage(StateMaintainer entry) {
        growPayload().applyTask(entry);
    }

    public final AccentFactory peekRevision() {
        return growPayload().growPayload();
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    public void popBlueprint(StateMaintainer popUpTo, boolean savedState) {
        growPayload().updateTimer(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }

    public final void reduceScope(StateMaintainer entry) {
        growPayload().releaseHeader(entry);
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    public void releaseHeader(List entries, ColorStore navOptions, DpadNotifier.ActivityMutator navigatorExtras) {
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            growPayload().drawField((StateMaintainer) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    /* renamed from: serializeOffset, reason: from getter */
    public final SlotDispatcher getIsPop() {
        return this.isPop;
    }
}

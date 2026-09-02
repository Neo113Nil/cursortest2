package com.goldenboot.saga.zone;

import android.os.Bundle;
import com.goldenboot.saga.zone.DpadNotifier;
import com.goldenboot.saga.zone.ListSwitch;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@DpadNotifier.BounceHandler("navigation")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/goldenboot/saga/zone/ClientPatch;", "Lcom/goldenboot/saga/zone/DpadNotifier;", "Lcom/goldenboot/saga/zone/BackgroundArranger;", "Lcom/goldenboot/saga/zone/ConsumerSupervisor;", "navigatorProvider", "<init>", "(Lcom/goldenboot/saga/zone/ConsumerSupervisor;)V", "connectJob", "()Lcom/goldenboot/saga/zone/BackgroundArranger;", "", "Lcom/goldenboot/saga/zone/StateMaintainer;", "entries", "Lcom/goldenboot/saga/zone/ColorStore;", "navOptions", "Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;", "navigatorExtras", "Lcom/goldenboot/saga/zone/DpadBuilder;", "releaseHeader", "(Ljava/util/List;Lcom/goldenboot/saga/zone/ColorStore;Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;)V", "entry", "peekRevision", "(Lcom/goldenboot/saga/zone/StateMaintainer;Lcom/goldenboot/saga/zone/ColorStore;Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;)V", "injectMetric", "Lcom/goldenboot/saga/zone/ConsumerSupervisor;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ClientPatch extends DpadNotifier {

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public final ConsumerSupervisor navigatorProvider;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        public final /* synthetic */ Ref.ObjectRef reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(Ref.ObjectRef objectRef) {
            super(1);
            this.reduceScope = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t = this.reduceScope.element;
            boolean z = true;
            if (t != 0 && ((Bundle) t).containsKey(key)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public ClientPatch(ConsumerSupervisor navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    /* renamed from: connectJob, reason: merged with bridge method [inline-methods] */
    public BackgroundArranger evictLayout() {
        return new BackgroundArranger(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.Bundle] */
    public final void peekRevision(StateMaintainer entry, ColorStore navOptions, DpadNotifier.ActivityMutator navigatorExtras) {
        ListSwitch releaseHeader = entry.releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        BackgroundArranger backgroundArranger = (BackgroundArranger) releaseHeader;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = entry.injectMetric();
        int groupArchive = backgroundArranger.groupArchive();
        String cancelArchive = backgroundArranger.cancelArchive();
        if (groupArchive == 0 && cancelArchive == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + backgroundArranger.expandArgs()).toString());
        }
        ListSwitch connectComponent = cancelArchive != null ? backgroundArranger.connectComponent(cancelArchive, false) : (ListSwitch) backgroundArranger.formatPosition().clipOrigin(groupArchive);
        if (connectComponent == null) {
            throw new IllegalArgumentException("navigation destination " + backgroundArranger.resumeSignature() + " is not a direct child of this NavGraph");
        }
        if (cancelArchive != null) {
            if (!Intrinsics.areEqual(cancelArchive, connectComponent.flattenPackage())) {
                ListSwitch.BounceHandler inflateEdge = connectComponent.inflateEdge(cancelArchive);
                Bundle clipOrigin = inflateEdge != null ? inflateEdge.clipOrigin() : null;
                if (clipOrigin != null && !clipOrigin.isEmpty()) {
                    ?? bundle = new Bundle();
                    bundle.putAll(clipOrigin);
                    T t = objectRef.element;
                    if (((Bundle) t) != null) {
                        bundle.putAll((Bundle) t);
                    }
                    objectRef.element = bundle;
                }
            }
            if (!connectComponent.drawScope().isEmpty()) {
                List evictLayout = AbstractPipe.evictLayout(connectComponent.drawScope(), new ActivityMutator(objectRef));
                if (!evictLayout.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + connectComponent + ". Missing required arguments [" + evictLayout + ']').toString());
                }
            }
        }
        this.navigatorProvider.releaseHeader(connectComponent.mergeLocale()).releaseHeader(DefaultBenchmark.releaseHeader(growPayload().evictLayout(connectComponent, connectComponent.serializeOffset((Bundle) objectRef.element))), navOptions, navigatorExtras);
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    public void releaseHeader(List entries, ColorStore navOptions, DpadNotifier.ActivityMutator navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            peekRevision((StateMaintainer) it.next(), navOptions, navigatorExtras);
        }
    }
}

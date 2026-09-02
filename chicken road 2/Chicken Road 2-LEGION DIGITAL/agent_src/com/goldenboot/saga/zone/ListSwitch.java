package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.goldenboot.saga.zone.GridEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ListSwitch {
    public static final ActivityMutator drawScope = new ActivityMutator(null);
    public static final Map expandArgs = new LinkedHashMap();
    public CharSequence attachConfig;
    public String connectPatch;
    public LayoutSynthesizer decodePath;
    public int drawRequest;
    public String gatherAdapter;
    public final SaveMigration inflateAdapter;
    public BackgroundArranger notifyMessage;
    public Map purgeNode;
    public final String reduceScope;
    public final List resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ListSwitch$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0131ActivityMutator extends Lambda implements TouchRecord {
            public static final C0131ActivityMutator reduceScope = new C0131ActivityMutator();

            public C0131ActivityMutator() {
                super(1);
            }

            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final ListSwitch invoke(ListSwitch it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.syncScope();
            }
        }

        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String evictLayout(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String growPayload(Context context, int i) {
            String valueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                  …tring()\n                }");
            return valueOf;
        }

        public final CompatCache injectMetric(ListSwitch listSwitch) {
            Intrinsics.checkNotNullParameter(listSwitch, "<this>");
            return PaddingStage.applyTask(listSwitch, C0131ActivityMutator.reduceScope);
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements Comparable {
        public final int attachConfig;
        public final boolean connectPatch;
        public final int inflateAdapter;
        public final Bundle notifyMessage;
        public final ListSwitch reduceScope;
        public final boolean resetDelta;

        public BounceHandler(ListSwitch destination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.reduceScope = destination;
            this.notifyMessage = bundle;
            this.connectPatch = z;
            this.attachConfig = i;
            this.resetDelta = z2;
            this.inflateAdapter = i2;
        }

        public final Bundle clipOrigin() {
            return this.notifyMessage;
        }

        @Override // java.lang.Comparable
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public int compareTo(BounceHandler other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.connectPatch;
            if (z && !other.connectPatch) {
                return 1;
            }
            if (!z && other.connectPatch) {
                return -1;
            }
            int i = this.attachConfig - other.attachConfig;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.notifyMessage;
            if (bundle != null && other.notifyMessage == null) {
                return 1;
            }
            if (bundle == null && other.notifyMessage != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.notifyMessage;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.resetDelta;
            if (z2 && !other.resetDelta) {
                return 1;
            }
            if (z2 || !other.resetDelta) {
                return this.inflateAdapter - other.inflateAdapter;
            }
            return -1;
        }

        public final boolean flushSample(Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.notifyMessage) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "matchingArgs.keySet()");
            for (String key : keySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                ScrollBuilder scrollBuilder = (ScrollBuilder) this.reduceScope.purgeNode.get(key);
                Object obj2 = null;
                SchedulerFactory evictLayout = scrollBuilder != null ? scrollBuilder.evictLayout() : null;
                if (evictLayout != null) {
                    Bundle bundle3 = this.notifyMessage;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj = evictLayout.evictLayout(bundle3, key);
                } else {
                    obj = null;
                }
                if (evictLayout != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj2 = evictLayout.evictLayout(bundle, key);
                }
                if (evictLayout != null && !evictLayout.popBlueprint(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        public final ListSwitch releaseHeader() {
            return this.reduceScope;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends Lambda implements ElevationNode {
        public final /* synthetic */ String reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndpointList(String str) {
            super(0);
            this.reduceScope = str;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final GridEvent invoke() {
            return new GridEvent.ActivityMutator().growPayload(this.reduceScope).evictLayout();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public final /* synthetic */ GridEvent reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(GridEvent gridEvent) {
            super(1);
            this.reduceScope = gridEvent;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.reduceScope.popBlueprint().contains(key));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements TouchRecord {
        public final /* synthetic */ Bundle reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(Bundle bundle) {
            super(1);
            this.reduceScope = bundle;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.reduceScope.containsKey(key));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends Lambda implements TouchRecord {
        public final /* synthetic */ GridEvent reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(GridEvent gridEvent) {
            super(1);
            this.reduceScope = gridEvent;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.reduceScope.popBlueprint().contains(key));
        }
    }

    public ListSwitch(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.reduceScope = navigatorName;
        this.resetDelta = new ArrayList();
        this.inflateAdapter = new SaveMigration(0, 1, null);
        this.purgeNode = new LinkedHashMap();
    }

    public static /* synthetic */ int[] inflateAdapter(ListSwitch listSwitch, ListSwitch listSwitch2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            listSwitch2 = null;
        }
        return listSwitch.notifyMessage(listSwitch2);
    }

    public final void applyTask(GridEvent navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List evictLayout = AbstractPipe.evictLayout(this.purgeNode, new FeedbackFlow(navDeepLink));
        if (evictLayout.isEmpty()) {
            this.resetDelta.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.drawScope() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + evictLayout).toString());
    }

    public final void bindBody(BackgroundArranger backgroundArranger) {
        this.notifyMessage = backgroundArranger;
    }

    public final void clipOrigin(String argumentName, ScrollBuilder argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.purgeNode.put(argumentName, argument);
    }

    public final void dispatchTimezone(String str) {
        if (str == null) {
            packPackage(0);
        } else {
            if (CachedPropagator.groupArchive(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String evictLayout = drawScope.evictLayout(str);
            List evictLayout2 = AbstractPipe.evictLayout(this.purgeNode, new StylusConverter(new GridEvent.ActivityMutator().growPayload(evictLayout).evictLayout()));
            if (!evictLayout2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + evictLayout2).toString());
            }
            this.decodePath = InternalPropagator.evictLayout(new EndpointList(evictLayout));
            packPackage(evictLayout.hashCode());
        }
        this.gatherAdapter = str;
    }

    public final Map drawScope() {
        return AttrConductor.resetDelta(this.purgeNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ListSwitch)) {
            ListSwitch listSwitch = (ListSwitch) obj;
            boolean areEqual = Intrinsics.areEqual(this.resetDelta, listSwitch.resetDelta);
            if (this.inflateAdapter.peekRevision() == listSwitch.inflateAdapter.peekRevision()) {
                Iterator it = PaddingStage.releaseHeader(StyleSnapshot.evictLayout(this.inflateAdapter)).iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.areEqual(this.inflateAdapter.clipOrigin(intValue), listSwitch.inflateAdapter.clipOrigin(intValue))) {
                    }
                }
                z = true;
                if (this.purgeNode.size() == listSwitch.purgeNode.size()) {
                    for (Map.Entry entry : ToolbarValidator.gatherAdapter(this.purgeNode)) {
                        if (listSwitch.purgeNode.containsKey(entry.getKey()) && Intrinsics.areEqual(listSwitch.purgeNode.get(entry.getKey()), entry.getValue())) {
                        }
                    }
                    z2 = true;
                    if (this.drawRequest != listSwitch.drawRequest && Intrinsics.areEqual(this.gatherAdapter, listSwitch.gatherAdapter) && areEqual && z && z2) {
                        return true;
                    }
                }
                z2 = false;
                if (this.drawRequest != listSwitch.drawRequest) {
                }
            }
            z = false;
            if (this.purgeNode.size() == listSwitch.purgeNode.size()) {
            }
            z2 = false;
            if (this.drawRequest != listSwitch.drawRequest) {
            }
        }
        return false;
    }

    public String expandArgs() {
        String str = this.connectPatch;
        return str == null ? String.valueOf(this.drawRequest) : str;
    }

    public BounceHandler filterPayload(StylusExecutor navDeepLinkRequest) {
        ListSwitch listSwitch;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.resetDelta.isEmpty()) {
            return null;
        }
        BounceHandler bounceHandler = null;
        for (GridEvent gridEvent : this.resetDelta) {
            Uri injectMetric = navDeepLinkRequest.injectMetric();
            Bundle reduceScope = injectMetric != null ? gridEvent.reduceScope(injectMetric, this.purgeNode) : null;
            int updateTimer = gridEvent.updateTimer(injectMetric);
            String evictLayout = navDeepLinkRequest.evictLayout();
            boolean z = evictLayout != null && Intrinsics.areEqual(evictLayout, gridEvent.applyTask());
            String growPayload = navDeepLinkRequest.growPayload();
            int purgeNode = growPayload != null ? gridEvent.purgeNode(growPayload) : -1;
            if (reduceScope != null || ((z || purgeNode > -1) && this.injectConstraint(gridEvent, injectMetric, this.purgeNode))) {
                listSwitch = this;
                BounceHandler bounceHandler2 = new BounceHandler(listSwitch, reduceScope, gridEvent.expandArgs(), updateTimer, z, purgeNode);
                if (bounceHandler == null || bounceHandler2.compareTo(bounceHandler) > 0) {
                    bounceHandler = bounceHandler2;
                }
            } else {
                listSwitch = this;
            }
            this = listSwitch;
        }
        return bounceHandler;
    }

    public final int findTask() {
        return this.drawRequest;
    }

    public final String flattenPackage() {
        return this.gatherAdapter;
    }

    public int hashCode() {
        int i = this.drawRequest * 31;
        String str = this.gatherAdapter;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        for (GridEvent gridEvent : this.resetDelta) {
            int i2 = hashCode * 31;
            String drawScope2 = gridEvent.drawScope();
            int hashCode2 = (i2 + (drawScope2 != null ? drawScope2.hashCode() : 0)) * 31;
            String applyTask = gridEvent.applyTask();
            int hashCode3 = (hashCode2 + (applyTask != null ? applyTask.hashCode() : 0)) * 31;
            String inflateAdapter = gridEvent.inflateAdapter();
            hashCode = hashCode3 + (inflateAdapter != null ? inflateAdapter.hashCode() : 0);
        }
        Iterator growPayload = StyleSnapshot.growPayload(this.inflateAdapter);
        if (growPayload.hasNext()) {
            TransitionMemento.evictLayout(growPayload.next());
            throw null;
        }
        for (String str2 : this.purgeNode.keySet()) {
            int hashCode4 = ((hashCode * 31) + str2.hashCode()) * 31;
            Object obj = this.purgeNode.get(str2);
            hashCode = hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public final BounceHandler inflateEdge(String route) {
        GridEvent gridEvent;
        Intrinsics.checkNotNullParameter(route, "route");
        LayoutSynthesizer layoutSynthesizer = this.decodePath;
        if (layoutSynthesizer == null || (gridEvent = (GridEvent) layoutSynthesizer.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(drawScope.evictLayout(route));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        Bundle reduceScope = gridEvent.reduceScope(parse, this.purgeNode);
        if (reduceScope == null) {
            return null;
        }
        return new BounceHandler(this, reduceScope, gridEvent.expandArgs(), gridEvent.updateTimer(parse), false, -1);
    }

    public final boolean injectConstraint(GridEvent gridEvent, Uri uri, Map map) {
        return AbstractPipe.evictLayout(map, new LayerUseCase(gridEvent.notifyMessage(uri, map))).isEmpty();
    }

    public final String mergeLocale() {
        return this.reduceScope;
    }

    public final int[] notifyMessage(ListSwitch listSwitch) {
        CursorMaker cursorMaker = new CursorMaker();
        while (true) {
            Intrinsics.checkNotNull(this);
            BackgroundArranger backgroundArranger = this.notifyMessage;
            if ((listSwitch != null ? listSwitch.notifyMessage : null) != null) {
                BackgroundArranger backgroundArranger2 = listSwitch.notifyMessage;
                Intrinsics.checkNotNull(backgroundArranger2);
                if (backgroundArranger2.prepareTask(this.drawRequest) == this) {
                    cursorMaker.addFirst(this);
                    break;
                }
            }
            if (backgroundArranger == null || backgroundArranger.groupArchive() != this.drawRequest) {
                cursorMaker.addFirst(this);
            }
            if (Intrinsics.areEqual(backgroundArranger, listSwitch) || backgroundArranger == null) {
                break;
            }
            this = backgroundArranger;
        }
        List appendEvent = CursorCollector.appendEvent(cursorMaker);
        ArrayList arrayList = new ArrayList(ContainerStage.gatherAdapter(appendEvent, 10));
        Iterator it = appendEvent.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ListSwitch) it.next()).drawRequest));
        }
        return CursorCollector.subscribeEvent(arrayList);
    }

    public final void packPackage(int i) {
        this.drawRequest = i;
        this.connectPatch = null;
    }

    public boolean parseAsset() {
        return true;
    }

    public final void queryModel(int i, DrawerSpawner action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (parseAsset()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.inflateAdapter.popBlueprint(i, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final Bundle serializeOffset(Bundle bundle) {
        if (bundle == null && this.purgeNode.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.purgeNode.entrySet()) {
            ((ScrollBuilder) entry.getValue()).releaseHeader((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.purgeNode.entrySet()) {
                String str = (String) entry2.getKey();
                ScrollBuilder scrollBuilder = (ScrollBuilder) entry2.getValue();
                if (!scrollBuilder.injectMetric() && !scrollBuilder.clipOrigin(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + scrollBuilder.evictLayout().growPayload() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final boolean storeCharset(String route, Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.gatherAdapter, route)) {
            return true;
        }
        BounceHandler inflateEdge = inflateEdge(route);
        if (Intrinsics.areEqual(this, inflateEdge != null ? inflateEdge.releaseHeader() : null)) {
            return inflateEdge.flushSample(bundle);
        }
        return false;
    }

    public final BackgroundArranger syncScope() {
        return this.notifyMessage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.connectPatch;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.drawRequest));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.gatherAdapter;
        if (str2 != null && !CachedPropagator.groupArchive(str2)) {
            sb.append(" route=");
            sb.append(this.gatherAdapter);
        }
        if (this.attachConfig != null) {
            sb.append(" label=");
            sb.append(this.attachConfig);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final void unlockMessage(CharSequence charSequence) {
        this.attachConfig = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListSwitch(DpadNotifier navigator) {
        this(ConsumerSupervisor.growPayload.evictLayout(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}

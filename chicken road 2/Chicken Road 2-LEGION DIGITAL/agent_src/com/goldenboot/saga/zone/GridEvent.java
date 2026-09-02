package com.goldenboot.saga.zone;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class GridEvent {
    public boolean applyTask;
    public final LayoutSynthesizer connectJob;
    public final LayoutSynthesizer drawField;
    public final String evictLayout;
    public final String growPayload;
    public final String injectMetric;
    public boolean notifyMessage;
    public final LayoutSynthesizer peekRevision;
    public final LayoutSynthesizer popBlueprint;
    public final LayoutSynthesizer reduceScope;
    public String releaseHeader;
    public String serializeOffset;
    public final LayoutSynthesizer updateTimer;
    public static final BounceHandler connectPatch = new BounceHandler(null);
    public static final Pattern attachConfig = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern resetDelta = Pattern.compile("\\{(.+?)\\}");
    public final List detachStream = new ArrayList();
    public final LayoutSynthesizer clipOrigin = InternalPropagator.evictLayout(new HoverThrottle());
    public final LayoutSynthesizer flushSample = InternalPropagator.evictLayout(new MorphDirector());

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final C0115ActivityMutator detachStream = new C0115ActivityMutator(null);
        public String evictLayout;
        public String growPayload;
        public String injectMetric;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.GridEvent$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0115ActivityMutator {
            public /* synthetic */ C0115ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0115ActivityMutator() {
            }
        }

        public final GridEvent evictLayout() {
            return new GridEvent(this.evictLayout, this.growPayload, this.injectMetric);
        }

        public final ActivityMutator growPayload(String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.evictLayout = uriPattern;
            return this;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public BounceHandler() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends Lambda implements ElevationNode {
        public EndpointList() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            AlarmFacilitator connectJob = GridEvent.this.connectJob();
            return (connectJob == null || (list = (List) connectJob.injectMetric()) == null) ? new ArrayList() : list;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow implements Comparable {
        public String notifyMessage;
        public String reduceScope;

        public FeedbackFlow(String mimeType) {
            List peekRevision;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List injectMetric = new BorderGovernor("/").injectMetric(mimeType, 0);
            if (!injectMetric.isEmpty()) {
                ListIterator listIterator = injectMetric.listIterator(injectMetric.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        peekRevision = CursorCollector.commitBounds(injectMetric, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            peekRevision = CursorBuilder.peekRevision();
            this.reduceScope = (String) peekRevision.get(0);
            this.notifyMessage = (String) peekRevision.get(1);
        }

        public final String clipOrigin() {
            return this.reduceScope;
        }

        @Override // java.lang.Comparable
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public int compareTo(FeedbackFlow other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.reduceScope, other.reduceScope) ? 2 : 0;
            return Intrinsics.areEqual(this.notifyMessage, other.notifyMessage) ? i + 1 : i;
        }

        public final String releaseHeader() {
            return this.notifyMessage;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class HeaderUtil extends Lambda implements ElevationNode {
        public HeaderUtil() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = GridEvent.this.serializeOffset;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class HoverThrottle extends Lambda implements ElevationNode {
        public HoverThrottle() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = GridEvent.this.releaseHeader;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase {
        public String evictLayout;
        public final List growPayload = new ArrayList();

        public final void detachStream(String str) {
            this.evictLayout = str;
        }

        public final void evictLayout(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.growPayload.add(name);
        }

        public final List growPayload() {
            return this.growPayload;
        }

        public final String injectMetric() {
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class MorphDirector extends Lambda implements ElevationNode {
        public MorphDirector() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((GridEvent.this.drawScope() == null || Uri.parse(GridEvent.this.drawScope()).getQuery() == null) ? false : true);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class PluginInterpreter extends Lambda implements ElevationNode {
        public PluginInterpreter() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            AlarmFacilitator connectJob = GridEvent.this.connectJob();
            if (connectJob != null) {
                return (String) connectJob.detachStream();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class RemoteCallback extends Lambda implements ElevationNode {
        public RemoteCallback() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return GridEvent.this.inflateEdge();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class RestoreToggle extends Lambda implements TouchRecord {
        public final /* synthetic */ Bundle reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RestoreToggle(Bundle bundle) {
            super(1);
            this.reduceScope = bundle;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            Intrinsics.checkNotNullParameter(argName, "argName");
            return Boolean.valueOf(!this.reduceScope.containsKey(argName));
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ScopedMigration extends Lambda implements ElevationNode {
        public ScopedMigration() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String serializeOffset = GridEvent.this.serializeOffset();
            if (serializeOffset != null) {
                return Pattern.compile(serializeOffset, 2);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends Lambda implements ElevationNode {
        public StylusConverter() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final AlarmFacilitator invoke() {
            return GridEvent.this.flattenPackage();
        }
    }

    public GridEvent(String str, String str2, String str3) {
        this.evictLayout = str;
        this.growPayload = str2;
        this.injectMetric = str3;
        BundleChannel bundleChannel = BundleChannel.connectPatch;
        this.updateTimer = InternalPropagator.growPayload(bundleChannel, new RemoteCallback());
        this.popBlueprint = InternalPropagator.growPayload(bundleChannel, new StylusConverter());
        this.drawField = InternalPropagator.growPayload(bundleChannel, new EndpointList());
        this.connectJob = InternalPropagator.growPayload(bundleChannel, new PluginInterpreter());
        this.peekRevision = InternalPropagator.evictLayout(new ScopedMigration());
        this.reduceScope = InternalPropagator.evictLayout(new HeaderUtil());
        filterPayload();
        storeCharset();
    }

    public final String applyTask() {
        return this.growPayload;
    }

    public final boolean attachConfig(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : decodePath().entrySet()) {
            String str = (String) entry.getKey();
            LayerUseCase layerUseCase = (LayerUseCase) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.applyTask && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                inputParams = DefaultBenchmark.releaseHeader(query);
            }
            Intrinsics.checkNotNullExpressionValue(inputParams, "inputParams");
            if (!injectConstraint(inputParams, layerUseCase, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final AlarmFacilitator connectJob() {
        return (AlarmFacilitator) this.popBlueprint.getValue();
    }

    public final boolean connectPatch(Matcher matcher, Bundle bundle, Map map) {
        List list = this.detachStream;
        ArrayList arrayList = new ArrayList(ContainerStage.gatherAdapter(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CursorBuilder.drawRequest();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i2));
            ScrollBuilder scrollBuilder = (ScrollBuilder) map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                mergeLocale(bundle, str, value, scrollBuilder);
                arrayList.add(DpadBuilder.evictLayout);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final Map decodePath() {
        return (Map) this.updateTimer.getValue();
    }

    public final List drawField() {
        return (List) this.drawField.getValue();
    }

    public final Pattern drawRequest() {
        return (Pattern) this.reduceScope.getValue();
    }

    public final String drawScope() {
        return this.evictLayout;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GridEvent)) {
            GridEvent gridEvent = (GridEvent) obj;
            if (Intrinsics.areEqual(this.evictLayout, gridEvent.evictLayout) && Intrinsics.areEqual(this.growPayload, gridEvent.growPayload) && Intrinsics.areEqual(this.injectMetric, gridEvent.injectMetric)) {
                return true;
            }
        }
        return false;
    }

    public final boolean expandArgs() {
        return this.notifyMessage;
    }

    public final void filterPayload() {
        if (this.evictLayout == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!attachConfig.matcher(this.evictLayout).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.evictLayout);
        matcher.find();
        boolean z = false;
        String substring = this.evictLayout.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        flushSample(substring, this.detachStream, sb);
        if (!CachedPropagator.unlockMessage(sb, ".*", false, 2, null) && !CachedPropagator.unlockMessage(sb, "([^/]+?)", false, 2, null)) {
            z = true;
        }
        this.notifyMessage = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "uriRegex.toString()");
        this.releaseHeader = HapticDecoder.expandArgs(sb2, ".*", "\\E.*\\Q", false, 4, null);
    }

    public final boolean findTask() {
        return ((Boolean) this.flushSample.getValue()).booleanValue();
    }

    public final AlarmFacilitator flattenPackage() {
        String str = this.evictLayout;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.evictLayout).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        flushSample(fragment, arrayList, sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "fragRegex.toString()");
        return PagerValidator.evictLayout(arrayList, sb2);
    }

    public final void flushSample(String str, List list, StringBuilder sb) {
        Matcher matcher = resetDelta.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final Pattern gatherAdapter() {
        return (Pattern) this.clipOrigin.getValue();
    }

    public int hashCode() {
        String str = this.evictLayout;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.growPayload;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.injectMetric;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String inflateAdapter() {
        return this.injectMetric;
    }

    public final Map inflateEdge() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (findTask()) {
            Uri parse = Uri.parse(this.evictLayout);
            for (String paramName : parse.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParams = parse.getQueryParameters(paramName);
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.evictLayout + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) CursorCollector.groupArchive(queryParams);
                if (queryParam == null) {
                    this.applyTask = true;
                    queryParam = paramName;
                }
                Matcher matcher = resetDelta.matcher(queryParam);
                LayerUseCase layerUseCase = new LayerUseCase();
                int i = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
                    layerUseCase.evictLayout(group);
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring = queryParam.substring(i, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i = matcher.end();
                }
                if (i < queryParam.length()) {
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "argRegex.toString()");
                layerUseCase.detachStream(HapticDecoder.expandArgs(sb2, ".*", "\\E.*\\Q", false, 4, null));
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, layerUseCase);
            }
        }
        return linkedHashMap;
    }

    public final boolean injectConstraint(List list, LayerUseCase layerUseCase, Bundle bundle, Map map) {
        Object obj;
        Bundle evictLayout = PaddingGenerator.evictLayout(new AlarmFacilitator[0]);
        Iterator it = layerUseCase.growPayload().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            ScrollBuilder scrollBuilder = (ScrollBuilder) map.get(str);
            SchedulerFactory evictLayout2 = scrollBuilder != null ? scrollBuilder.evictLayout() : null;
            if ((evictLayout2 instanceof CoreRunner) && !scrollBuilder.growPayload()) {
                evictLayout2.updateTimer(evictLayout, str, ((CoreRunner) evictLayout2).drawField());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String injectMetric = layerUseCase.injectMetric();
            Matcher matcher = injectMetric != null ? Pattern.compile(injectMetric, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List growPayload = layerUseCase.growPayload();
            ArrayList arrayList = new ArrayList(ContainerStage.gatherAdapter(growPayload, 10));
            int i = 0;
            for (Object obj2 : growPayload) {
                int i2 = i + 1;
                if (i < 0) {
                    CursorBuilder.drawRequest();
                }
                String str3 = (String) obj2;
                String group = matcher.group(i2);
                if (group == null) {
                    group = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                ScrollBuilder scrollBuilder2 = (ScrollBuilder) map.get(str3);
                try {
                    if (evictLayout.containsKey(str3)) {
                        obj = Boolean.valueOf(syncScope(evictLayout, str3, group, scrollBuilder2));
                    } else {
                        mergeLocale(evictLayout, str3, group, scrollBuilder2);
                        obj = DpadBuilder.evictLayout;
                    }
                } catch (IllegalArgumentException unused) {
                    obj = DpadBuilder.evictLayout;
                }
                arrayList.add(obj);
                i = i2;
            }
        }
        bundle.putAll(evictLayout);
        return true;
    }

    public final void mergeLocale(Bundle bundle, String str, String str2, ScrollBuilder scrollBuilder) {
        if (scrollBuilder != null) {
            scrollBuilder.evictLayout().detachStream(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    public final Bundle notifyMessage(Uri uri, Map arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri != null) {
            Pattern gatherAdapter = gatherAdapter();
            Matcher matcher = gatherAdapter != null ? gatherAdapter.matcher(uri.toString()) : null;
            if (matcher != null && matcher.matches()) {
                connectPatch(matcher, bundle, arguments);
                if (findTask()) {
                    attachConfig(uri, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    public final Pattern peekRevision() {
        return (Pattern) this.peekRevision.getValue();
    }

    public final List popBlueprint() {
        List list = this.detachStream;
        Collection values = decodePath().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ReceiverCollection.expandArgs(arrayList, ((LayerUseCase) it.next()).growPayload());
        }
        return CursorCollector.refreshCounter(CursorCollector.refreshCounter(list, arrayList), drawField());
    }

    public final int purgeNode(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.injectMetric == null) {
            return -1;
        }
        Pattern drawRequest = drawRequest();
        Intrinsics.checkNotNull(drawRequest);
        if (drawRequest.matcher(mimeType).matches()) {
            return new FeedbackFlow(this.injectMetric).compareTo(new FeedbackFlow(mimeType));
        }
        return -1;
    }

    public final Bundle reduceScope(Uri deepLink, Map arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern gatherAdapter = gatherAdapter();
        Matcher matcher = gatherAdapter != null ? gatherAdapter.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!connectPatch(matcher, bundle, arguments)) {
            return null;
        }
        if (findTask() && !attachConfig(deepLink, bundle, arguments)) {
            return null;
        }
        resetDelta(deepLink.getFragment(), bundle, arguments);
        if (AbstractPipe.evictLayout(arguments, new RestoreToggle(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final void resetDelta(String str, Bundle bundle, Map map) {
        Pattern peekRevision = peekRevision();
        Matcher matcher = peekRevision != null ? peekRevision.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List drawField = drawField();
            ArrayList arrayList = new ArrayList(ContainerStage.gatherAdapter(drawField, 10));
            int i = 0;
            for (Object obj : drawField) {
                int i2 = i + 1;
                if (i < 0) {
                    CursorBuilder.drawRequest();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i2));
                ScrollBuilder scrollBuilder = (ScrollBuilder) map.get(str2);
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    mergeLocale(bundle, str2, value, scrollBuilder);
                    arrayList.add(DpadBuilder.evictLayout);
                    i = i2;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    public final String serializeOffset() {
        return (String) this.connectJob.getValue();
    }

    public final void storeCharset() {
        if (this.injectMetric == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.injectMetric).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.injectMetric + " does not match to required \"type/subtype\" format").toString());
        }
        FeedbackFlow feedbackFlow = new FeedbackFlow(this.injectMetric);
        this.serializeOffset = HapticDecoder.expandArgs("^(" + feedbackFlow.clipOrigin() + "|[*]+)/(" + feedbackFlow.releaseHeader() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    public final boolean syncScope(Bundle bundle, String str, String str2, ScrollBuilder scrollBuilder) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (scrollBuilder == null) {
            return false;
        }
        SchedulerFactory evictLayout = scrollBuilder.evictLayout();
        evictLayout.releaseHeader(bundle, str, str2, evictLayout.evictLayout(bundle, str));
        return false;
    }

    public final int updateTimer(Uri uri) {
        if (uri == null || this.evictLayout == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.evictLayout).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
        return CursorCollector.resetValue(requestedPathSegments, uriPathSegments).size();
    }
}

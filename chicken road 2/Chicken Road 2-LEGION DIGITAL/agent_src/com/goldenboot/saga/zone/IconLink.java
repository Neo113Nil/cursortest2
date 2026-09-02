package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.WatcherDelta;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000~\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aJ\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042 \b\u0004\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00028\u00000\u001aH\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010#\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!\u001a\u001b\u0010$\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!\u001a:\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u0010(\u001a\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b)\u0010*\u001a<\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u0010(\u001a\u00020\u00042\u0014\b\u0004\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b+\u0010,\u001aD\u00100\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0014\b\u0004\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b0\u00101\u001a<\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u00103\u001a\u0002022\u0014\b\u0004\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b4\u00105\u001a<\u00108\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u00107\u001a\u0002062\u0014\b\u0004\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\b¢\u0006\u0004\b8\u00109\u001a:\u0010<\u001a\u00028\u0000\"\b\b\u0000\u0010&*\u00020%*\u00020'2\u0006\u0010;\u001a\u00020:2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b<\u0010=\u001aK\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00192\u0016\u0010>\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u0010@\u001a)\u0010D\u001a\u00020\t2\u0006\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020\u00022\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bD\u0010E\u001a\u001d\u0010F\u001a\u00020\t2\u0006\u0010A\u001a\u00020-2\u0006\u0010C\u001a\u00020\u0004¢\u0006\u0004\bF\u0010G\u001a$\u0010J\u001a\u00020\t2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020H0\u0012H\u0086\b¢\u0006\u0004\bJ\u0010K\u001a/\u0010P\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0000¢\u0006\u0004\bP\u0010Q\u001a/\u0010V\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\rH\u0000¢\u0006\u0004\bV\u0010Q\u001a\u000f\u0010W\u001a\u00020\tH\u0000¢\u0006\u0004\bW\u0010X\"\u0014\u0010[\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"", "Lcom/goldenboot/saga/zone/WatcherDelta$EndpointList;", "Lcom/goldenboot/saga/zone/MenuEdge;", "spanStyles", "Lcom/goldenboot/saga/zone/RailPropagator;", "paragraphStyles", "Lcom/goldenboot/saga/zone/WatcherDelta$ActivityMutator;", "notifyMessage", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lcom/goldenboot/saga/zone/WatcherDelta;", "defaultParagraphStyle", "mergeLocale", "(Lcom/goldenboot/saga/zone/WatcherDelta;Lcom/goldenboot/saga/zone/RailPropagator;)Ljava/util/List;", "", "start", "end", "drawScope", "(Lcom/goldenboot/saga/zone/WatcherDelta;II)Ljava/util/List;", "Lkotlin/Function1;", "", "predicate", "gatherAdapter", "(Lcom/goldenboot/saga/zone/WatcherDelta;IILcom/goldenboot/saga/zone/TouchRecord;)Ljava/util/List;", "syncScope", "(Lcom/goldenboot/saga/zone/WatcherDelta;II)Lcom/goldenboot/saga/zone/WatcherDelta;", "T", "Lkotlin/Function2;", "block", "findTask", "(Lcom/goldenboot/saga/zone/WatcherDelta;Lcom/goldenboot/saga/zone/RailPropagator;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/util/List;", "Lcom/goldenboot/saga/zone/BundleTask;", "localeList", "inflateEdge", "(Lcom/goldenboot/saga/zone/WatcherDelta;Lcom/goldenboot/saga/zone/BundleTask;)Lcom/goldenboot/saga/zone/WatcherDelta;", "injectConstraint", "peekRevision", "attachConfig", "", "R", "Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;", "style", "attachCallback", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Lcom/goldenboot/saga/zone/MenuEdge;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "mapJob", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Lcom/goldenboot/saga/zone/RailPropagator;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "", "tag", "annotation", "dispatchTimezone", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Ljava/lang/String;Ljava/lang/String;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/TypographyCompiler;", "ttsAnnotation", "unlockMessage", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Lcom/goldenboot/saga/zone/TypographyCompiler;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/RemoteHeap;", "urlAnnotation", "bindBody", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Lcom/goldenboot/saga/zone/RemoteHeap;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "Lcom/goldenboot/saga/zone/SpanSequence;", "link", "parseAsset", "(Lcom/goldenboot/saga/zone/WatcherDelta$BounceHandler;Lcom/goldenboot/saga/zone/SpanSequence;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "ranges", "drawRequest", "(Ljava/util/List;II)Ljava/util/List;", "text", "spanStyle", "paragraphStyle", "flushSample", "(Ljava/lang/String;Lcom/goldenboot/saga/zone/MenuEdge;Lcom/goldenboot/saga/zone/RailPropagator;)Lcom/goldenboot/saga/zone/WatcherDelta;", "clipOrigin", "(Ljava/lang/String;Lcom/goldenboot/saga/zone/RailPropagator;)Lcom/goldenboot/saga/zone/WatcherDelta;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "builder", "connectJob", "(Lcom/goldenboot/saga/zone/TouchRecord;)Lcom/goldenboot/saga/zone/WatcherDelta;", "baseStart", "baseEnd", "targetStart", "targetEnd", "connectPatch", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "expandArgs", "purgeNode", "()Lcom/goldenboot/saga/zone/WatcherDelta;", "evictLayout", "Lcom/goldenboot/saga/zone/WatcherDelta;", "EmptyAnnotatedString", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconLink {
    private static final WatcherDelta evictLayout = new WatcherDelta("", null, 2, 0 == true ? 1 : 0);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return SurfaceBroadcaster.detachStream(Integer.valueOf(((WatcherDelta.Range) t).getStart()), Integer.valueOf(((WatcherDelta.Range) t2).getStart()));
        }
    }

    public static final <R> R attachCallback(WatcherDelta.BounceHandler bounceHandler, SpanStyle spanStyle, TouchRecord touchRecord) {
        int expandArgs = bounceHandler.expandArgs(spanStyle);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(expandArgs);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final WatcherDelta attachConfig(WatcherDelta watcherDelta, final LocaleList localeList) {
        return AttrRelay.injectMetric(watcherDelta, new ConfigListener() { // from class: com.goldenboot.saga.zone.LayerOrganizer
            @Override // com.goldenboot.saga.zone.ConfigListener
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String inflateAdapter;
                inflateAdapter = IconLink.inflateAdapter(LocaleList.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return inflateAdapter;
            }
        });
    }

    @ReceiverAdministrator
    public static final <R> R bindBody(WatcherDelta.BounceHandler bounceHandler, UrlAnnotation urlAnnotation, TouchRecord touchRecord) {
        int mergeLocale = bounceHandler.mergeLocale(urlAnnotation);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(mergeLocale);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final WatcherDelta clipOrigin(String str, ParagraphStyle paragraphStyle) {
        return new WatcherDelta(str, CursorBuilder.peekRevision(), DefaultBenchmark.releaseHeader(new WatcherDelta.Range(paragraphStyle, 0, str.length())));
    }

    public static final WatcherDelta connectJob(TouchRecord touchRecord) {
        WatcherDelta.BounceHandler bounceHandler = new WatcherDelta.BounceHandler(0, 1, null);
        touchRecord.invoke(bounceHandler);
        return bounceHandler.syncScope();
    }

    public static final boolean connectPatch(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ List decodePath(WatcherDelta watcherDelta, int i, int i2, TouchRecord touchRecord, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            touchRecord = null;
        }
        return gatherAdapter(watcherDelta, i, i2, touchRecord);
    }

    public static final <R> R dispatchTimezone(WatcherDelta.BounceHandler bounceHandler, String str, String str2, TouchRecord touchRecord) {
        int decodePath = bounceHandler.decodePath(str, str2);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(decodePath);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<WatcherDelta.Range<T>> drawRequest(List<? extends WatcherDelta.Range<? extends T>> list, int i, int i2) {
        if (!(i <= i2)) {
            EmitterUpgrade.releaseHeader("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            WatcherDelta.Range<? extends T> range = list.get(i3);
            if (expandArgs(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new WatcherDelta.Range(range.updateTimer(), Math.max(i, range.getStart()) - i, Math.min(i2, range.getEnd()) - i, range.popBlueprint()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<WatcherDelta.Range<ParagraphStyle>> drawScope(WatcherDelta watcherDelta, int i, int i2) {
        List<WatcherDelta.Range<ParagraphStyle>> updateTimer;
        if (i == i2 || (updateTimer = watcherDelta.updateTimer()) == null) {
            return null;
        }
        if (i == 0 && i2 >= watcherDelta.getText().length()) {
            return updateTimer;
        }
        ArrayList arrayList = new ArrayList(updateTimer.size());
        int size = updateTimer.size();
        for (int i3 = 0; i3 < size; i3++) {
            WatcherDelta.Range<ParagraphStyle> range = updateTimer.get(i3);
            if (expandArgs(i, i2, range.getStart(), range.getEnd())) {
                ParagraphStyle updateTimer2 = range.updateTimer();
                int start = range.getStart();
                if (start < i) {
                    start = i;
                }
                if (start > i2) {
                    start = i2;
                }
                int i4 = start - i;
                int end = range.getEnd();
                if (end < i) {
                    end = i;
                }
                if (end > i2) {
                    end = i2;
                }
                arrayList.add(new WatcherDelta.Range(updateTimer2, i4, end - i));
            }
        }
        return arrayList;
    }

    public static final boolean expandArgs(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String filterPayload(LocaleList localeList, String str, int i, int i2) {
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return DpadMaintainer.clipOrigin(substring, localeList);
    }

    public static final <T> List<T> findTask(WatcherDelta watcherDelta, ParagraphStyle paragraphStyle, IconExporter iconExporter) {
        List<WatcherDelta.Range<ParagraphStyle>> mergeLocale = mergeLocale(watcherDelta, paragraphStyle);
        ArrayList arrayList = new ArrayList(mergeLocale.size());
        int size = mergeLocale.size();
        for (int i = 0; i < size; i++) {
            WatcherDelta.Range<ParagraphStyle> range = mergeLocale.get(i);
            arrayList.add(iconExporter.invoke(syncScope(watcherDelta, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flattenPackage(WatcherDelta.ActivityMutator activityMutator) {
        return !(activityMutator instanceof ParagraphStyle);
    }

    public static final WatcherDelta flushSample(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new WatcherDelta(str, DefaultBenchmark.releaseHeader(new WatcherDelta.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CursorBuilder.peekRevision() : DefaultBenchmark.releaseHeader(new WatcherDelta.Range(paragraphStyle, 0, str.length())));
    }

    private static final List<WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> gatherAdapter(WatcherDelta watcherDelta, int i, int i2, TouchRecord touchRecord) {
        List<WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> detachStream;
        if (i == i2 || (detachStream = watcherDelta.detachStream()) == null) {
            return null;
        }
        if (i != 0 || i2 < watcherDelta.getText().length()) {
            ArrayList arrayList = new ArrayList(detachStream.size());
            int size = detachStream.size();
            for (int i3 = 0; i3 < size; i3++) {
                WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range = detachStream.get(i3);
                if ((touchRecord != null ? ((Boolean) touchRecord.invoke(range.updateTimer())).booleanValue() : true) && expandArgs(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(new WatcherDelta.Range(range.updateTimer(), CellEntry.peekRevision(range.getStart(), i, i2) - i, CellEntry.peekRevision(range.getEnd(), i, i2) - i, range.popBlueprint()));
                }
            }
            return arrayList;
        }
        if (touchRecord == null) {
            return detachStream;
        }
        ArrayList arrayList2 = new ArrayList(detachStream.size());
        int size2 = detachStream.size();
        for (int i4 = 0; i4 < size2; i4++) {
            WatcherDelta.Range<? extends WatcherDelta.ActivityMutator> range2 = detachStream.get(i4);
            if (((Boolean) touchRecord.invoke(range2.updateTimer())).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String inflateAdapter(LocaleList localeList, String str, int i, int i2) {
        if (i == 0) {
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return DpadMaintainer.detachStream(substring, localeList);
        }
        String substring2 = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public static final WatcherDelta inflateEdge(WatcherDelta watcherDelta, final LocaleList localeList) {
        return AttrRelay.injectMetric(watcherDelta, new ConfigListener() { // from class: com.goldenboot.saga.zone.BadgeMapper
            @Override // com.goldenboot.saga.zone.ConfigListener
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String packPackage;
                packPackage = IconLink.packPackage(LocaleList.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return packPackage;
            }
        });
    }

    public static final WatcherDelta injectConstraint(WatcherDelta watcherDelta, final LocaleList localeList) {
        return AttrRelay.injectMetric(watcherDelta, new ConfigListener() { // from class: com.goldenboot.saga.zone.SchedulerRouter
            @Override // com.goldenboot.saga.zone.ConfigListener
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String filterPayload;
                filterPayload = IconLink.filterPayload(LocaleList.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return filterPayload;
            }
        });
    }

    public static final <R> R mapJob(WatcherDelta.BounceHandler bounceHandler, ParagraphStyle paragraphStyle, TouchRecord touchRecord) {
        int drawScope = bounceHandler.drawScope(paragraphStyle);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(drawScope);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final List<WatcherDelta.Range<ParagraphStyle>> mergeLocale(WatcherDelta watcherDelta, ParagraphStyle paragraphStyle) {
        List peekRevision;
        List<WatcherDelta.Range<ParagraphStyle>> updateTimer = watcherDelta.updateTimer();
        if (updateTimer == null || (peekRevision = CursorCollector.drawConfig(updateTimer, new ActivityMutator())) == null) {
            peekRevision = CursorBuilder.peekRevision();
        }
        ArrayList arrayList = new ArrayList();
        CursorMaker cursorMaker = new CursorMaker();
        int size = peekRevision.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            WatcherDelta.Range range = (WatcherDelta.Range) peekRevision.get(i2);
            WatcherDelta.Range clipOrigin = WatcherDelta.Range.clipOrigin(range, paragraphStyle.mergeLocale((ParagraphStyle) range.updateTimer()), 0, 0, null, 14, null);
            while (i < clipOrigin.getStart() && !cursorMaker.isEmpty()) {
                WatcherDelta.Range range2 = (WatcherDelta.Range) cursorMaker.last();
                if (clipOrigin.getStart() < range2.getEnd()) {
                    arrayList.add(new WatcherDelta.Range(range2.updateTimer(), i, clipOrigin.getStart()));
                    i = clipOrigin.getStart();
                } else {
                    arrayList.add(new WatcherDelta.Range(range2.updateTimer(), i, range2.getEnd()));
                    i = range2.getEnd();
                    while (!cursorMaker.isEmpty() && i == ((WatcherDelta.Range) cursorMaker.last()).getEnd()) {
                        cursorMaker.removeLast();
                    }
                }
            }
            if (i < clipOrigin.getStart()) {
                arrayList.add(new WatcherDelta.Range(paragraphStyle, i, clipOrigin.getStart()));
                i = clipOrigin.getStart();
            }
            WatcherDelta.Range range3 = (WatcherDelta.Range) cursorMaker.findTask();
            if (range3 == null) {
                cursorMaker.add(new WatcherDelta.Range(clipOrigin.updateTimer(), clipOrigin.getStart(), clipOrigin.getEnd()));
            } else if (range3.getStart() == clipOrigin.getStart() && range3.getEnd() == clipOrigin.getEnd()) {
                cursorMaker.removeLast();
                cursorMaker.add(new WatcherDelta.Range(((ParagraphStyle) range3.updateTimer()).mergeLocale((ParagraphStyle) clipOrigin.updateTimer()), clipOrigin.getStart(), clipOrigin.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new WatcherDelta.Range(range3.updateTimer(), range3.getStart(), range3.getEnd()));
                cursorMaker.removeLast();
                cursorMaker.add(new WatcherDelta.Range(clipOrigin.updateTimer(), clipOrigin.getStart(), clipOrigin.getEnd()));
            } else {
                if (range3.getEnd() < clipOrigin.getEnd()) {
                    throw new IllegalArgumentException();
                }
                cursorMaker.add(new WatcherDelta.Range(((ParagraphStyle) range3.updateTimer()).mergeLocale((ParagraphStyle) clipOrigin.updateTimer()), clipOrigin.getStart(), clipOrigin.getEnd()));
            }
        }
        while (i <= watcherDelta.getText().length() && !cursorMaker.isEmpty()) {
            WatcherDelta.Range range4 = (WatcherDelta.Range) cursorMaker.last();
            arrayList.add(new WatcherDelta.Range(range4.updateTimer(), i, range4.getEnd()));
            i = range4.getEnd();
            while (!cursorMaker.isEmpty() && i == ((WatcherDelta.Range) cursorMaker.last()).getEnd()) {
                cursorMaker.removeLast();
            }
        }
        if (i < watcherDelta.getText().length()) {
            arrayList.add(new WatcherDelta.Range(paragraphStyle, i, watcherDelta.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new WatcherDelta.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> notifyMessage(List<WatcherDelta.Range<SpanStyle>> list, List<WatcherDelta.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String packPackage(LocaleList localeList, String str, int i, int i2) {
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return DpadMaintainer.updateTimer(substring, localeList);
    }

    public static final <R> R parseAsset(WatcherDelta.BounceHandler bounceHandler, SpanSequence spanSequence, TouchRecord touchRecord) {
        int gatherAdapter = bounceHandler.gatherAdapter(spanSequence);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(gatherAdapter);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final WatcherDelta peekRevision(WatcherDelta watcherDelta, final LocaleList localeList) {
        return AttrRelay.injectMetric(watcherDelta, new ConfigListener() { // from class: com.goldenboot.saga.zone.ServerEvaluator
            @Override // com.goldenboot.saga.zone.ConfigListener
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String reduceScope;
                reduceScope = IconLink.reduceScope(LocaleList.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                return reduceScope;
            }
        });
    }

    public static final WatcherDelta purgeNode() {
        return evictLayout;
    }

    public static /* synthetic */ WatcherDelta queryModel(WatcherDelta watcherDelta, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.evictLayout();
        }
        return inflateEdge(watcherDelta, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reduceScope(LocaleList localeList, String str, int i, int i2) {
        if (i == 0) {
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return DpadMaintainer.growPayload(substring, localeList);
        }
        String substring2 = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    public static /* synthetic */ WatcherDelta resetDelta(WatcherDelta watcherDelta, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.evictLayout();
        }
        return attachConfig(watcherDelta, localeList);
    }

    public static /* synthetic */ WatcherDelta serializeOffset(WatcherDelta watcherDelta, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.evictLayout();
        }
        return peekRevision(watcherDelta, localeList);
    }

    public static /* synthetic */ WatcherDelta storeCharset(WatcherDelta watcherDelta, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.evictLayout();
        }
        return injectConstraint(watcherDelta, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatcherDelta syncScope(WatcherDelta watcherDelta, int i, int i2) {
        String str;
        if (i != i2) {
            str = watcherDelta.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        } else {
            str = "";
        }
        List<WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>> gatherAdapter = gatherAdapter(watcherDelta, i, i2, new TouchRecord() { // from class: com.goldenboot.saga.zone.ScopedSpawner
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                boolean flattenPackage;
                flattenPackage = IconLink.flattenPackage((WatcherDelta.ActivityMutator) obj);
                return Boolean.valueOf(flattenPackage);
            }
        });
        if (gatherAdapter == null) {
            gatherAdapter = CursorBuilder.peekRevision();
        }
        return new WatcherDelta(str, gatherAdapter);
    }

    public static final <R> R unlockMessage(WatcherDelta.BounceHandler bounceHandler, TypographyCompiler typographyCompiler, TouchRecord touchRecord) {
        int findTask = bounceHandler.findTask(typographyCompiler);
        try {
            return (R) touchRecord.invoke(bounceHandler);
        } finally {
            InlineMarker.finallyStart(1);
            bounceHandler.purgeNode(findTask);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ WatcherDelta updateTimer(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return flushSample(str, spanStyle, paragraphStyle);
    }
}

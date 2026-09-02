package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u001d\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aE\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a_\u0010\u001f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0010\b\u0002\u0010\u001d*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00028\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\u0012\u001aE\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010\u0019\u001ag\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b#\u0010$\u001aS\u0010'\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u00012\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b'\u0010(\u001aQ\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b)\u0010*\u001aS\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b+\u0010*\u001aQ\u0010,\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-\u001aW\u0010/\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u00100\u001aQ\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010*\u001aO\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u00102\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b3\u00104\u001ae\u00107\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u00105*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b7\u00108\u001aM\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u0010\u0019\u001ag\u0010A\u001a\u00020@\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020:2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020:\u0018\u00010\u0002¢\u0006\u0004\bA\u0010B\u001aK\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010C*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010\u0019\u001aQ\u0010E\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bE\u0010\u0012\u001aQ\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010F0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bG\u0010\u0019\u001a)\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020H*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bI\u0010J\u001a?\u0010K\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010\u0012\u001a\u007f\u0010P\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010N*\u00060Lj\u0002`M*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010O\u001a\u00028\u00012\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020:2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020:\u0018\u00010\u0002H\u0002¢\u0006\u0004\bP\u0010Q\u001a;\u0010S\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060Lj\u0002`M2\u0006\u0010R\u001a\u00028\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020:\u0018\u00010\u0002H\u0002¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020@H\u0001¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010U\u001a\u00020@H\u0001¢\u0006\u0004\bY\u0010Z¨\u0006["}, d2 = {"T", "", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "action", "connectJob", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)V", "serializeOffset", "Lkotlin/Function2;", "", "peekRevision", "(Ljava/util/List;Lcom/goldenboot/saga/zone/IconExporter;)V", "", "predicate", "growPayload", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)Z", "injectMetric", "applyTask", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Object;", "selector", "flattenPackage", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)I", "R", "transform", "inflateAdapter", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/util/List;", "", "drawScope", "", "C", "destination", "decodePath", "(Ljava/util/List;Ljava/util/Collection;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/util/Collection;", "resetDelta", "releaseHeader", "flushSample", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/util/List;", "initial", "operation", "drawField", "(Ljava/util/List;Ljava/lang/Object;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/lang/Object;", "purgeNode", "(Ljava/util/List;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/util/List;", "drawRequest", "findTask", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Comparable;", "defaultValue", "expandArgs", "(Ljava/util/List;Ljava/lang/Comparable;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Comparable;", "storeCharset", "S", "syncScope", "(Ljava/util/List;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/lang/Object;", "V", "other", "injectConstraint", "(Ljava/util/List;Ljava/util/List;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/util/List;", "gatherAdapter", "", "separator", "prefix", "postfix", "limit", "truncated", "", "connectPatch", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/String;", "K", "detachStream", "mergeLocale", "", "popBlueprint", "", "clipOrigin", "(Ljava/util/List;)Ljava/util/List;", "updateTimer", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "reduceScope", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lcom/goldenboot/saga/zone/TouchRecord;)Ljava/lang/Appendable;", "element", "evictLayout", "(Ljava/lang/Appendable;Ljava/lang/Object;Lcom/goldenboot/saga/zone/TouchRecord;)V", "message", "", "filterPayload", "(Ljava/lang/String;)Ljava/lang/Void;", "inflateEdge", "(Ljava/lang/String;)V", "ui-util"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WatcherRevision {
    public static final <T> T applyTask(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) touchRecord.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static /* synthetic */ String attachConfig(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, TouchRecord touchRecord, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            touchRecord = null;
        }
        CharSequence charSequence5 = charSequence4;
        TouchRecord touchRecord2 = touchRecord;
        return connectPatch(list, charSequence, charSequence2, charSequence3, i, charSequence5, touchRecord2);
    }

    public static final <T> List<T> clipOrigin(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> void connectJob(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            touchRecord.invoke(list.get(i));
        }
    }

    public static final <T> String connectPatch(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, TouchRecord touchRecord) {
        return ((StringBuilder) reduceScope(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, touchRecord)).toString();
    }

    public static final <T, R, C extends Collection<? super R>> C decodePath(List<? extends T> list, C c, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(touchRecord.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, K> List<T> detachStream(List<? extends T> list, TouchRecord touchRecord) {
        CustomStore customStore = new CustomStore(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (customStore.updateTimer(touchRecord.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> R drawField(List<? extends T> list, R r, IconExporter iconExporter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r = (R) iconExporter.invoke(r, list.get(i));
        }
        return r;
    }

    public static final <T, R> List<R> drawRequest(List<? extends T> list, IconExporter iconExporter) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = iconExporter.invoke(Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> T drawScope(List<? extends T> list, TouchRecord touchRecord) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) touchRecord.invoke(t);
        int reduceScope = CursorBuilder.reduceScope(list);
        int i = 1;
        if (1 <= reduceScope) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) touchRecord.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void evictLayout(Appendable appendable, T t, TouchRecord touchRecord) {
        if (touchRecord != null) {
            appendable.append((CharSequence) touchRecord.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R expandArgs(List<? extends T> list, R r, TouchRecord touchRecord) {
        if (list.isEmpty()) {
            return r;
        }
        R r2 = (R) touchRecord.invoke(list.get(0));
        int reduceScope = CursorBuilder.reduceScope(list);
        int i = 1;
        if (1 <= reduceScope) {
            while (true) {
                Comparable comparable = (Comparable) touchRecord.invoke(list.get(i));
                if (comparable.compareTo(r2) > 0) {
                    r2 = comparable;
                }
                if (i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return r2;
    }

    public static final Void filterPayload(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R findTask(List<? extends T> list, TouchRecord touchRecord) {
        if (list.isEmpty()) {
            return null;
        }
        R r = (R) touchRecord.invoke(list.get(0));
        int reduceScope = CursorBuilder.reduceScope(list);
        int i = 1;
        if (1 <= reduceScope) {
            while (true) {
                Comparable comparable = (Comparable) touchRecord.invoke(list.get(i));
                if (comparable.compareTo(r) > 0) {
                    r = comparable;
                }
                if (i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return r;
    }

    public static final <T> int flattenPackage(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((Number) touchRecord.invoke(list.get(i2))).intValue();
        }
        return i;
    }

    public static final <T, R> List<R> flushSample(List<? extends T> list, TouchRecord touchRecord, TouchRecord touchRecord2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) touchRecord.invoke(t)).booleanValue()) {
                arrayList.add(touchRecord2.invoke(t));
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> gatherAdapter(List<? extends T> list, TouchRecord touchRecord) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = touchRecord.invoke(list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T> boolean growPayload(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) touchRecord.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T, R> List<R> inflateAdapter(List<? extends T> list, TouchRecord touchRecord) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(touchRecord.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final void inflateEdge(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final <T, R, V> List<V> injectConstraint(List<? extends T> list, List<? extends R> list2, IconExporter iconExporter) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(iconExporter.invoke(list.get(i), list2.get(i)));
        }
        return arrayList;
    }

    public static final <T> boolean injectMetric(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) touchRecord.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, R extends Comparable<? super R>> T mergeLocale(List<? extends T> list, TouchRecord touchRecord) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) touchRecord.invoke(t);
        int reduceScope = CursorBuilder.reduceScope(list);
        int i = 1;
        if (1 <= reduceScope) {
            while (true) {
                T t2 = list.get(i);
                Comparable comparable2 = (Comparable) touchRecord.invoke(t2);
                if (comparable.compareTo(comparable2) > 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public static final <T> void peekRevision(List<? extends T> list, IconExporter iconExporter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iconExporter.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T, R> List<R> popBlueprint(List<? extends T> list, TouchRecord touchRecord) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ReceiverCollection.expandArgs(arrayList, (Iterable) touchRecord.invoke(list.get(i)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> purgeNode(List<? extends T> list, IconExporter iconExporter) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(iconExporter.invoke(Integer.valueOf(i), list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A reduceScope(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, TouchRecord touchRecord) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            evictLayout(a, t, touchRecord);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> List<T> releaseHeader(List<? extends T> list, TouchRecord touchRecord) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) touchRecord.invoke(t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> T resetDelta(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            T t = list.get(size);
            if (((Boolean) touchRecord.invoke(t)).booleanValue()) {
                return t;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final <T> void serializeOffset(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            touchRecord.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final <T, R> List<R> storeCharset(List<? extends T> list, IconExporter iconExporter) {
        if (list.size() <= 1) {
            return CursorBuilder.peekRevision();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int reduceScope = CursorBuilder.reduceScope(list);
        while (i < reduceScope) {
            i++;
            T t2 = list.get(i);
            arrayList.add(iconExporter.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }

    public static final <S, T extends S> S syncScope(List<? extends T> list, IconExporter iconExporter) {
        if (list.isEmpty()) {
            inflateEdge("Empty collection can't be reduced.");
        }
        S s = (S) CursorCollector.formatPosition(list);
        int reduceScope = CursorBuilder.reduceScope(list);
        int i = 1;
        if (1 <= reduceScope) {
            while (true) {
                s = (S) iconExporter.invoke(s, list.get(i));
                if (i == reduceScope) {
                    break;
                }
                i++;
            }
        }
        return s;
    }

    public static final <T> T updateTimer(List<? extends T> list, TouchRecord touchRecord) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (((Boolean) touchRecord.invoke(t)).booleanValue()) {
                return t;
            }
        }
        filterPayload("Collection contains no element matching the predicate.");
        throw new ShadowBroadcaster();
    }
}

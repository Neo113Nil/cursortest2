package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.BaseGuardian;
import com.goldenboot.saga.zone.BoxMaterializer;
import com.goldenboot.saga.zone.ContainerSource;
import com.goldenboot.saga.zone.FontWeight;
import com.goldenboot.saga.zone.LineHeightStyle;
import com.goldenboot.saga.zone.LocaleList;
import com.goldenboot.saga.zone.PatternInspector;
import com.goldenboot.saga.zone.PooledStatus;
import com.goldenboot.saga.zone.RuntimeHeap;
import com.goldenboot.saga.zone.Shadow;
import com.goldenboot.saga.zone.SpanSequence;
import com.goldenboot.saga.zone.StylusEvent;
import com.goldenboot.saga.zone.TextGeometricTransform;
import com.goldenboot.saga.zone.TextIndent;
import com.goldenboot.saga.zone.WatcherDelta;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0016\"&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\".\u0010!\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001f0\u001e\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a\".\u0010%\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001f\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u0012\u0004\b#\u0010$\" \u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001a\"&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u0012\u0004\b+\u0010$\" \u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001a\" \u00102\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001a\"&\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"&\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010\u001c\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010\u001a\u001a\u0004\b=\u0010\u001c\" \u0010A\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u001a\" \u0010D\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u001a\" \u0010G\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u001a\" \u0010J\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u001a\" \u0010M\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u001a\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u001a\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u001a\" \u0010W\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V\" \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010V\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010V\" \u0010`\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\u001a\" \u0010c\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\u001a\" \u0010f\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\u001a\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\b0\u0000*\u00020n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010s\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u0000*\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u0000*\u00020w8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u0000*\u00020z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020}8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f\"'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0083\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"'\u0010j\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u008c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/PaletteMap;", "T", "Original", "Saveable", "value", "saver", "Lcom/goldenboot/saga/zone/ItemStore;", "scope", "", "filterTimer", "(Ljava/lang/Object;Lcom/goldenboot/saga/zone/PaletteMap;Lcom/goldenboot/saga/zone/ItemStore;)Ljava/lang/Object;", "Result", "connectPool", "(Ljava/lang/Object;Lcom/goldenboot/saga/zone/PaletteMap;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "Lcom/goldenboot/saga/zone/HapticBarrier;", "transformCurrency", "(Lcom/goldenboot/saga/zone/IconExporter;Lcom/goldenboot/saga/zone/TouchRecord;)Lcom/goldenboot/saga/zone/HapticBarrier;", "popScope", "(Ljava/lang/Object;)Ljava/lang/Object;", "flushHeader", "Lcom/goldenboot/saga/zone/WatcherDelta;", "evictLayout", "Lcom/goldenboot/saga/zone/PaletteMap;", "prepareCount", "()Lcom/goldenboot/saga/zone/PaletteMap;", "AnnotatedStringSaver", "", "Lcom/goldenboot/saga/zone/WatcherDelta$EndpointList;", "growPayload", "AnnotationRangeListSaver", "injectMetric", "sortSnapshot", "()V", "AnnotationRangeSaver", "Lcom/goldenboot/saga/zone/CarouselExecutor;", "detachStream", "VerbatimTtsAnnotationSaver", "Lcom/goldenboot/saga/zone/RemoteHeap;", "releaseHeader", "prependOptions", "UrlAnnotationSaver", "Lcom/goldenboot/saga/zone/SpanSequence$BounceHandler;", "clipOrigin", "LinkSaver", "Lcom/goldenboot/saga/zone/SpanSequence$ActivityMutator;", "flushSample", "ClickableSaver", "Lcom/goldenboot/saga/zone/RailPropagator;", "updateTimer", "protectChannel", "ParagraphStyleSaver", "Lcom/goldenboot/saga/zone/MenuEdge;", "applyTask", "updateRule", "SpanStyleSaver", "Lcom/goldenboot/saga/zone/ProgressRecord;", "popBlueprint", "evictOrigin", "TextLinkStylesSaver", "Lcom/goldenboot/saga/zone/PatternInspector;", "drawField", "TextDecorationSaver", "Lcom/goldenboot/saga/zone/SnackbarTransformer;", "connectJob", "TextGeometricTransformSaver", "Lcom/goldenboot/saga/zone/PluginState;", "peekRevision", "TextIndentSaver", "Lcom/goldenboot/saga/zone/CardReducer;", "serializeOffset", "FontWeightSaver", "Lcom/goldenboot/saga/zone/BoxMaterializer;", "reduceScope", "BaselineShiftSaver", "Lcom/goldenboot/saga/zone/StylusEvent;", "notifyMessage", "TextRangeSaver", "Lcom/goldenboot/saga/zone/ColumnWriter;", "connectPatch", "ShadowSaver", "Lcom/goldenboot/saga/zone/ContainerSource;", "attachConfig", "Lcom/goldenboot/saga/zone/HapticBarrier;", "ColorSaver", "Lcom/goldenboot/saga/zone/PooledStatus;", "resetDelta", "TextUnitSaver", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "inflateAdapter", "OffsetSaver", "Lcom/goldenboot/saga/zone/BundleTask;", "purgeNode", "LocaleListSaver", "Lcom/goldenboot/saga/zone/BaseGuardian;", "drawRequest", "LocaleSaver", "Lcom/goldenboot/saga/zone/BundleBin;", "gatherAdapter", "LineHeightStyleSaver", "Lcom/goldenboot/saga/zone/PatternInspector$ActivityMutator;", "trimState", "(Lcom/goldenboot/saga/zone/PatternInspector$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Saver", "Lcom/goldenboot/saga/zone/SnackbarTransformer$ActivityMutator;", "escapeBounds", "(Lcom/goldenboot/saga/zone/SnackbarTransformer$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/PluginState$ActivityMutator;", "openJob", "(Lcom/goldenboot/saga/zone/PluginState$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/CardReducer$ActivityMutator;", "measureEndpoint", "(Lcom/goldenboot/saga/zone/CardReducer$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/BoxMaterializer$ActivityMutator;", "unwrapRecord", "(Lcom/goldenboot/saga/zone/BoxMaterializer$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/StylusEvent$ActivityMutator;", "queryDescriptor", "(Lcom/goldenboot/saga/zone/StylusEvent$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/ColumnWriter$ActivityMutator;", "observeNode", "(Lcom/goldenboot/saga/zone/ColumnWriter$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/ContainerSource$ActivityMutator;", "compressBody", "(Lcom/goldenboot/saga/zone/ContainerSource$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/PooledStatus$ActivityMutator;", "transformCount", "(Lcom/goldenboot/saga/zone/PooledStatus$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/RuntimeHeap$ActivityMutator;", "closeComponent", "(Lcom/goldenboot/saga/zone/RuntimeHeap$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/BundleTask$ActivityMutator;", "closeSource", "(Lcom/goldenboot/saga/zone/BundleTask$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/BaseGuardian$ActivityMutator;", "trimCallback", "(Lcom/goldenboot/saga/zone/BaseGuardian$ActivityMutator;)Lcom/goldenboot/saga/zone/PaletteMap;", "Lcom/goldenboot/saga/zone/BundleBin$BounceHandler;", "prependArchive", "(Lcom/goldenboot/saga/zone/BundleBin$BounceHandler;)Lcom/goldenboot/saga/zone/PaletteMap;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ElevationMaker {
    private static final PaletteMap evictLayout = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.SpacerBucket
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object connectComponent;
            connectComponent = ElevationMaker.connectComponent((ItemStore) obj, (WatcherDelta) obj2);
            return connectComponent;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.SlideSource
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            WatcherDelta startResource;
            startResource = ElevationMaker.startResource(obj);
            return startResource;
        }
    });
    private static final PaletteMap growPayload = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.SpringSteward
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object resumeSignature;
            resumeSignature = ElevationMaker.resumeSignature((ItemStore) obj, (List) obj2);
            return resumeSignature;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.NotificationAlerter
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            List formatPosition;
            formatPosition = ElevationMaker.formatPosition(obj);
            return formatPosition;
        }
    });
    private static final PaletteMap injectMetric = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.GlobalFormer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object groupArchive;
            groupArchive = ElevationMaker.groupArchive((ItemStore) obj, (WatcherDelta.Range) obj2);
            return groupArchive;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ContextInterpreter
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            WatcherDelta.Range cancelArchive;
            cancelArchive = ElevationMaker.cancelArchive(obj);
            return cancelArchive;
        }
    });
    private static final PaletteMap detachStream = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.FrameWrapper
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object acquireAsset;
            acquireAsset = ElevationMaker.acquireAsset((ItemStore) obj, (VerbatimTtsAnnotation) obj2);
            return acquireAsset;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ContentBenchmark
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            VerbatimTtsAnnotation flattenToken;
            flattenToken = ElevationMaker.flattenToken(obj);
            return flattenToken;
        }
    });
    private static final PaletteMap releaseHeader = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.CellParser
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object queryData;
            queryData = ElevationMaker.queryData((ItemStore) obj, (UrlAnnotation) obj2);
            return queryData;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.TranslatePlanner
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            UrlAnnotation syncPool;
            syncPool = ElevationMaker.syncPool(obj);
            return syncPool;
        }
    });
    private static final PaletteMap clipOrigin = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.CachedMonitor
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object handleFooter;
            handleFooter = ElevationMaker.handleFooter((ItemStore) obj, (SpanSequence.BounceHandler) obj2);
            return handleFooter;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.AttrPlanner
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            SpanSequence.BounceHandler purgeMetric;
            purgeMetric = ElevationMaker.purgeMetric(obj);
            return purgeMetric;
        }
    });
    private static final PaletteMap flushSample = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.WrapperComposer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object serializeTask;
            serializeTask = ElevationMaker.serializeTask((ItemStore) obj, (SpanSequence.ActivityMutator) obj2);
            return serializeTask;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.FontFormer
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            SpanSequence.ActivityMutator injectField;
            injectField = ElevationMaker.injectField(obj);
            return injectField;
        }
    });
    private static final PaletteMap updateTimer = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.SlotExporter
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object growCallback;
            growCallback = ElevationMaker.growCallback((ItemStore) obj, (ParagraphStyle) obj2);
            return growCallback;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.IndicatorResolver
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            ParagraphStyle drawConfig;
            drawConfig = ElevationMaker.drawConfig(obj);
            return drawConfig;
        }
    });
    private static final PaletteMap applyTask = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.TriggerTranslator
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object closePayload;
            closePayload = ElevationMaker.closePayload((ItemStore) obj, (SpanStyle) obj2);
            return closePayload;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.SpringModerator
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            SpanStyle expandScope;
            expandScope = ElevationMaker.expandScope(obj);
            return expandScope;
        }
    });
    private static final PaletteMap popBlueprint = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.SlideHandler
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object loadItem;
            loadItem = ElevationMaker.loadItem((ItemStore) obj, (ProgressRecord) obj2);
            return loadItem;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.VibrationBucket
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            ProgressRecord updateConstraint;
            updateConstraint = ElevationMaker.updateConstraint(obj);
            return updateConstraint;
        }
    });
    private static final PaletteMap drawField = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ListBinder
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object formatMessage;
            formatMessage = ElevationMaker.formatMessage((ItemStore) obj, (PatternInspector) obj2);
            return formatMessage;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ConfigSensor
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            PatternInspector executeRecord;
            executeRecord = ElevationMaker.executeRecord(obj);
            return executeRecord;
        }
    });
    private static final PaletteMap connectJob = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.RegionModerator
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object commitKey;
            commitKey = ElevationMaker.commitKey((ItemStore) obj, (TextGeometricTransform) obj2);
            return commitKey;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.AlphaBus
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            TextGeometricTransform subscribeEvent;
            subscribeEvent = ElevationMaker.subscribeEvent(obj);
            return subscribeEvent;
        }
    });
    private static final PaletteMap peekRevision = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ServiceRealizer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object appendEvent;
            appendEvent = ElevationMaker.appendEvent((ItemStore) obj, (TextIndent) obj2);
            return appendEvent;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.TouchMaterializer
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            TextIndent executeConfig;
            executeConfig = ElevationMaker.executeConfig(obj);
            return executeConfig;
        }
    });
    private static final PaletteMap serializeOffset = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.WorkerSupervisor
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object appendKey;
            appendKey = ElevationMaker.appendKey((ItemStore) obj, (FontWeight) obj2);
            return appendKey;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.DividerUpgrade
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            FontWeight computeTarget;
            computeTarget = ElevationMaker.computeTarget(obj);
            return computeTarget;
        }
    });
    private static final PaletteMap reduceScope = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ChannelInteractor
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object resolveDelta;
            resolveDelta = ElevationMaker.resolveDelta((ItemStore) obj, (BoxMaterializer) obj2);
            return resolveDelta;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.WaveFabricator
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            BoxMaterializer resetValue;
            resetValue = ElevationMaker.resetValue(obj);
            return resetValue;
        }
    });
    private static final PaletteMap notifyMessage = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ScrollPage
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object acquireArchive;
            acquireArchive = ElevationMaker.acquireArchive((ItemStore) obj, (StylusEvent) obj2);
            return acquireArchive;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.InterpolatorFormatter
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            StylusEvent offerHash;
            offerHash = ElevationMaker.offerHash(obj);
            return offerHash;
        }
    });
    private static final PaletteMap connectPatch = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ProducerTimer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object normalizeBundle;
            normalizeBundle = ElevationMaker.normalizeBundle((ItemStore) obj, (Shadow) obj2);
            return normalizeBundle;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.TapChain
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            Shadow commitBounds;
            commitBounds = ElevationMaker.commitBounds(obj);
            return commitBounds;
        }
    });
    private static final HapticBarrier<ContainerSource, Object> attachConfig = transformCurrency(ActivityMutator.reduceScope, BounceHandler.reduceScope);
    private static final HapticBarrier<PooledStatus, Object> resetDelta = transformCurrency(new IconExporter() { // from class: com.goldenboot.saga.zone.TimelineBucket
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object searchHolder;
            searchHolder = ElevationMaker.searchHolder((ItemStore) obj, (PooledStatus) obj2);
            return searchHolder;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.LifecycleValve
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            PooledStatus saveSnapshot;
            saveSnapshot = ElevationMaker.saveSnapshot(obj);
            return saveSnapshot;
        }
    });
    private static final HapticBarrier<RuntimeHeap, Object> inflateAdapter = transformCurrency(new IconExporter() { // from class: com.goldenboot.saga.zone.SlideMemento
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object validateOffset;
            validateOffset = ElevationMaker.validateOffset((ItemStore) obj, (RuntimeHeap) obj2);
            return validateOffset;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.ListCommand
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            RuntimeHeap peekDescriptor;
            peekDescriptor = ElevationMaker.peekDescriptor(obj);
            return peekDescriptor;
        }
    });
    private static final PaletteMap purgeNode = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.TooltipInitializer
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object removeCount;
            removeCount = ElevationMaker.removeCount((ItemStore) obj, (LocaleList) obj2);
            return removeCount;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.SubscriberDirector
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            LocaleList protectGauge;
            protectGauge = ElevationMaker.protectGauge(obj);
            return protectGauge;
        }
    });
    private static final PaletteMap drawRequest = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.EmbeddedInjector
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object refreshCounter;
            refreshCounter = ElevationMaker.refreshCounter((ItemStore) obj, (BaseGuardian) obj2);
            return refreshCounter;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.RestoreExtractor
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            BaseGuardian compressVersion;
            compressVersion = ElevationMaker.compressVersion(obj);
            return compressVersion;
        }
    });
    private static final PaletteMap gatherAdapter = MarginEncoder.releaseHeader(new IconExporter() { // from class: com.goldenboot.saga.zone.ParallelPort
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            Object locateSignal;
            locateSignal = ElevationMaker.locateSignal((ItemStore) obj, (LineHeightStyle) obj2);
            return locateSignal;
        }
    }, new TouchRecord() { // from class: com.goldenboot.saga.zone.InsetsScheduler
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            LineHeightStyle emitStrategy;
            emitStrategy = ElevationMaker.emitStrategy(obj);
            return emitStrategy;
        }
    });

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator implements IconExporter {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public final Object evictLayout(ItemStore itemStore, long j) {
            return j == 16 ? Boolean.FALSE : Integer.valueOf(BoxSaver.inflateAdapter(j));
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return evictLayout((ItemStore) obj, ((ContainerSource) obj2).getValue());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class BounceHandler implements TouchRecord {
        public static final BounceHandler reduceScope = new BounceHandler();

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ContainerSource invoke(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return ContainerSource.serializeOffset(ContainerSource.INSTANCE.purgeNode());
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ContainerSource.serializeOffset(BoxSaver.growPayload(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/goldenboot/saga/zone/ElevationMaker$FeedbackFlow", "Lcom/goldenboot/saga/zone/HapticBarrier;", "Lcom/goldenboot/saga/zone/ItemStore;", "value", "growPayload", "(Lcom/goldenboot/saga/zone/ItemStore;Ljava/lang/Object;)Ljava/lang/Object;", "evictLayout", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow<Original, Saveable> implements HapticBarrier<Original, Saveable> {
        final /* synthetic */ IconExporter evictLayout;
        final /* synthetic */ TouchRecord growPayload;

        public FeedbackFlow(IconExporter iconExporter, TouchRecord touchRecord) {
            this.evictLayout = iconExporter;
            this.growPayload = touchRecord;
        }

        @Override // com.goldenboot.saga.zone.HapticBarrier, com.goldenboot.saga.zone.PaletteMap
        public Original evictLayout(Saveable value) {
            return (Original) this.growPayload.invoke(value);
        }

        @Override // com.goldenboot.saga.zone.HapticBarrier, com.goldenboot.saga.zone.PaletteMap
        public Saveable growPayload(ItemStore itemStore, Original original) {
            return (Saveable) this.evictLayout.invoke(itemStore, original);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class LayerUseCase {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[DimenGraph.values().length];
            try {
                iArr[DimenGraph.reduceScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DimenGraph.notifyMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DimenGraph.connectPatch.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DimenGraph.attachConfig.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DimenGraph.resetDelta.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DimenGraph.inflateAdapter.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DimenGraph.purgeNode.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            evictLayout = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object acquireArchive(ItemStore itemStore, StylusEvent stylusEvent) {
        return CursorBuilder.flushSample(popScope(Integer.valueOf(StylusEvent.serializeOffset(stylusEvent.getPackedValue()))), popScope(Integer.valueOf(StylusEvent.applyTask(stylusEvent.getPackedValue()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireAsset(ItemStore itemStore, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return popScope(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object appendEvent(ItemStore itemStore, TextIndent textIndent) {
        PooledStatus injectMetric2 = PooledStatus.injectMetric(textIndent.getFirstLine());
        PooledStatus.Companion companion = PooledStatus.INSTANCE;
        return CursorBuilder.flushSample(filterTimer(injectMetric2, transformCount(companion), itemStore), filterTimer(PooledStatus.injectMetric(textIndent.getRestLine()), transformCount(companion), itemStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object appendKey(ItemStore itemStore, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatcherDelta.Range cancelArchive(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle paragraphStyle = null;
        r1 = null;
        SpanSequence.ActivityMutator activityMutator = null;
        r1 = null;
        SpanSequence.BounceHandler bounceHandler = null;
        r1 = null;
        UrlAnnotation urlAnnotation = null;
        r1 = null;
        VerbatimTtsAnnotation verbatimTtsAnnotation = null;
        r1 = null;
        SpanStyle spanStyle = null;
        paragraphStyle = null;
        DimenGraph dimenGraph = obj2 != null ? (DimenGraph) obj2 : null;
        Intrinsics.checkNotNull(dimenGraph);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.checkNotNull(num2);
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        Intrinsics.checkNotNull(str);
        switch (LayerUseCase.evictLayout[dimenGraph.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                PaletteMap paletteMap = updateTimer;
                if ((!Intrinsics.areEqual(obj6, Boolean.FALSE) || (paletteMap instanceof HapticBarrier)) && obj6 != null) {
                    paragraphStyle = (ParagraphStyle) paletteMap.evictLayout(obj6);
                }
                Intrinsics.checkNotNull(paragraphStyle);
                return new WatcherDelta.Range(paragraphStyle, intValue, intValue2, str);
            case 2:
                Object obj7 = list.get(1);
                PaletteMap paletteMap2 = applyTask;
                if ((!Intrinsics.areEqual(obj7, Boolean.FALSE) || (paletteMap2 instanceof HapticBarrier)) && obj7 != null) {
                    spanStyle = (SpanStyle) paletteMap2.evictLayout(obj7);
                }
                Intrinsics.checkNotNull(spanStyle);
                return new WatcherDelta.Range(spanStyle, intValue, intValue2, str);
            case 3:
                Object obj8 = list.get(1);
                PaletteMap paletteMap3 = detachStream;
                if ((!Intrinsics.areEqual(obj8, Boolean.FALSE) || (paletteMap3 instanceof HapticBarrier)) && obj8 != null) {
                    verbatimTtsAnnotation = (VerbatimTtsAnnotation) paletteMap3.evictLayout(obj8);
                }
                Intrinsics.checkNotNull(verbatimTtsAnnotation);
                return new WatcherDelta.Range(verbatimTtsAnnotation, intValue, intValue2, str);
            case 4:
                Object obj9 = list.get(1);
                PaletteMap paletteMap4 = releaseHeader;
                if ((!Intrinsics.areEqual(obj9, Boolean.FALSE) || (paletteMap4 instanceof HapticBarrier)) && obj9 != null) {
                    urlAnnotation = (UrlAnnotation) paletteMap4.evictLayout(obj9);
                }
                Intrinsics.checkNotNull(urlAnnotation);
                return new WatcherDelta.Range(urlAnnotation, intValue, intValue2, str);
            case 5:
                Object obj10 = list.get(1);
                PaletteMap paletteMap5 = clipOrigin;
                if ((!Intrinsics.areEqual(obj10, Boolean.FALSE) || (paletteMap5 instanceof HapticBarrier)) && obj10 != null) {
                    bounceHandler = (SpanSequence.BounceHandler) paletteMap5.evictLayout(obj10);
                }
                Intrinsics.checkNotNull(bounceHandler);
                return new WatcherDelta.Range(bounceHandler, intValue, intValue2, str);
            case 6:
                Object obj11 = list.get(1);
                PaletteMap paletteMap6 = flushSample;
                if ((!Intrinsics.areEqual(obj11, Boolean.FALSE) || (paletteMap6 instanceof HapticBarrier)) && obj11 != null) {
                    activityMutator = (SpanSequence.ActivityMutator) paletteMap6.evictLayout(obj11);
                }
                Intrinsics.checkNotNull(activityMutator);
                return new WatcherDelta.Range(activityMutator, intValue, intValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                Intrinsics.checkNotNull(str2);
                return new WatcherDelta.Range(PaletteNegotiator.evictLayout(PaletteNegotiator.growPayload(str2)), intValue, intValue2, str);
            default:
                throw new EndpointArchive();
        }
    }

    public static final PaletteMap closeComponent(RuntimeHeap.Companion companion) {
        return inflateAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object closePayload(ItemStore itemStore, SpanStyle spanStyle) {
        ContainerSource serializeOffset2 = ContainerSource.serializeOffset(spanStyle.peekRevision());
        ContainerSource.Companion companion = ContainerSource.INSTANCE;
        Object filterTimer = filterTimer(serializeOffset2, compressBody(companion), itemStore);
        PooledStatus injectMetric2 = PooledStatus.injectMetric(spanStyle.getFontSize());
        PooledStatus.Companion companion2 = PooledStatus.INSTANCE;
        return CursorBuilder.flushSample(filterTimer, filterTimer(injectMetric2, transformCount(companion2), itemStore), filterTimer(spanStyle.getFontWeight(), measureEndpoint(FontWeight.INSTANCE), itemStore), popScope(spanStyle.getFontStyle()), popScope(spanStyle.getFontSynthesis()), popScope(-1), popScope(spanStyle.getFontFeatureSettings()), filterTimer(PooledStatus.injectMetric(spanStyle.getLetterSpacing()), transformCount(companion2), itemStore), filterTimer(spanStyle.getBaselineShift(), unwrapRecord(BoxMaterializer.INSTANCE), itemStore), filterTimer(spanStyle.getTextGeometricTransform(), escapeBounds(TextGeometricTransform.INSTANCE), itemStore), filterTimer(spanStyle.getLocaleList(), closeSource(LocaleList.INSTANCE), itemStore), filterTimer(ContainerSource.serializeOffset(spanStyle.getBackground()), compressBody(companion), itemStore), filterTimer(spanStyle.getTextDecoration(), trimState(PatternInspector.INSTANCE), itemStore), filterTimer(spanStyle.getShadow(), observeNode(Shadow.INSTANCE), itemStore));
    }

    public static final PaletteMap closeSource(LocaleList.Companion companion) {
        return purgeNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow commitBounds(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        PaletteMap compressBody = compressBody(ContainerSource.INSTANCE);
        Boolean bool = Boolean.FALSE;
        ContainerSource containerSource = ((!Intrinsics.areEqual(obj2, bool) || (compressBody instanceof HapticBarrier)) && obj2 != null) ? (ContainerSource) compressBody.evictLayout(obj2) : null;
        Intrinsics.checkNotNull(containerSource);
        long value = containerSource.getValue();
        Object obj3 = list.get(1);
        PaletteMap closeComponent = closeComponent(RuntimeHeap.INSTANCE);
        RuntimeHeap runtimeHeap = ((!Intrinsics.areEqual(obj3, bool) || (closeComponent instanceof HapticBarrier)) && obj3 != null) ? (RuntimeHeap) closeComponent.evictLayout(obj3) : null;
        Intrinsics.checkNotNull(runtimeHeap);
        long packedValue = runtimeHeap.getPackedValue();
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        Intrinsics.checkNotNull(f);
        return new Shadow(value, packedValue, f.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object commitKey(ItemStore itemStore, TextGeometricTransform textGeometricTransform) {
        return CursorBuilder.flushSample(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }

    public static final PaletteMap compressBody(ContainerSource.Companion companion) {
        return attachConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseGuardian compressVersion(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return new BaseGuardian((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight computeTarget(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object connectComponent(ItemStore itemStore, WatcherDelta watcherDelta) {
        return CursorBuilder.flushSample(popScope(watcherDelta.getText()), filterTimer(watcherDelta.detachStream(), growPayload, itemStore));
    }

    public static final /* synthetic */ <T extends PaletteMap, Original, Saveable, Result> Result connectPool(Saveable saveable, T t) {
        if ((Intrinsics.areEqual(saveable, Boolean.FALSE) && !(t instanceof HapticBarrier)) || saveable == null) {
            return null;
        }
        Result result = (Result) t.evictLayout(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle drawConfig(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        DefaultRelay defaultRelay = null;
        LifecycleGenerator lifecycleGenerator = obj2 != null ? (LifecycleGenerator) obj2 : null;
        Intrinsics.checkNotNull(lifecycleGenerator);
        int value = lifecycleGenerator.getValue();
        Object obj3 = list.get(1);
        ModuleChain moduleChain = obj3 != null ? (ModuleChain) obj3 : null;
        Intrinsics.checkNotNull(moduleChain);
        int value2 = moduleChain.getValue();
        Object obj4 = list.get(2);
        PaletteMap transformCount = transformCount(PooledStatus.INSTANCE);
        Boolean bool = Boolean.FALSE;
        PooledStatus pooledStatus = ((!Intrinsics.areEqual(obj4, bool) || (transformCount instanceof HapticBarrier)) && obj4 != null) ? (PooledStatus) transformCount.evictLayout(obj4) : null;
        Intrinsics.checkNotNull(pooledStatus);
        long packedValue = pooledStatus.getPackedValue();
        Object obj5 = list.get(3);
        PaletteMap openJob = openJob(TextIndent.INSTANCE);
        TextIndent textIndent = ((!Intrinsics.areEqual(obj5, bool) || (openJob instanceof HapticBarrier)) && obj5 != null) ? (TextIndent) openJob.evictLayout(obj5) : null;
        Object obj6 = list.get(4);
        PaletteMap serializeOffset2 = HapticCoordinator.serializeOffset(PlatformParagraphStyle.INSTANCE);
        PlatformParagraphStyle platformParagraphStyle = ((!Intrinsics.areEqual(obj6, bool) || (serializeOffset2 instanceof HapticBarrier)) && obj6 != null) ? (PlatformParagraphStyle) serializeOffset2.evictLayout(obj6) : null;
        Object obj7 = list.get(5);
        PaletteMap prependArchive = prependArchive(LineHeightStyle.INSTANCE);
        LineHeightStyle lineHeightStyle = ((!Intrinsics.areEqual(obj7, bool) || (prependArchive instanceof HapticBarrier)) && obj7 != null) ? (LineHeightStyle) prependArchive.evictLayout(obj7) : null;
        Object obj8 = list.get(6);
        PaletteMap peekRevision2 = HapticCoordinator.peekRevision(AccentSerializer.INSTANCE);
        AccentSerializer accentSerializer = ((!Intrinsics.areEqual(obj8, bool) || (peekRevision2 instanceof HapticBarrier)) && obj8 != null) ? (AccentSerializer) peekRevision2.evictLayout(obj8) : null;
        Intrinsics.checkNotNull(accentSerializer);
        int mask = accentSerializer.getMask();
        Object obj9 = list.get(7);
        SingletonAssembler singletonAssembler = obj9 != null ? (SingletonAssembler) obj9 : null;
        Intrinsics.checkNotNull(singletonAssembler);
        int value3 = singletonAssembler.getValue();
        Object obj10 = list.get(8);
        PaletteMap reduceScope2 = HapticCoordinator.reduceScope(DefaultRelay.INSTANCE);
        if ((!Intrinsics.areEqual(obj10, bool) || (reduceScope2 instanceof HapticBarrier)) && obj10 != null) {
            defaultRelay = (DefaultRelay) reduceScope2.evictLayout(obj10);
        }
        return new ParagraphStyle(value, value2, packedValue, textIndent, platformParagraphStyle, lineHeightStyle, mask, value3, defaultRelay, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle emitStrategy(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        LineHeightStyle.ActivityMutator activityMutator = obj2 != null ? (LineHeightStyle.ActivityMutator) obj2 : null;
        Intrinsics.checkNotNull(activityMutator);
        float topRatio = activityMutator.getTopRatio();
        Object obj3 = list.get(1);
        LineHeightStyle.LayerUseCase layerUseCase = obj3 != null ? (LineHeightStyle.LayerUseCase) obj3 : null;
        Intrinsics.checkNotNull(layerUseCase);
        int value = layerUseCase.getValue();
        Object obj4 = list.get(2);
        LineHeightStyle.FeedbackFlow feedbackFlow = obj4 != null ? (LineHeightStyle.FeedbackFlow) obj4 : null;
        Intrinsics.checkNotNull(feedbackFlow);
        return new LineHeightStyle(topRatio, value, feedbackFlow.getValue(), null);
    }

    public static final PaletteMap escapeBounds(TextGeometricTransform.Companion companion) {
        return connectJob;
    }

    public static final PaletteMap evictOrigin() {
        return popBlueprint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent executeConfig(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        PooledStatus.Companion companion = PooledStatus.INSTANCE;
        PaletteMap transformCount = transformCount(companion);
        Boolean bool = Boolean.FALSE;
        PooledStatus pooledStatus = null;
        PooledStatus pooledStatus2 = ((!Intrinsics.areEqual(obj2, bool) || (transformCount instanceof HapticBarrier)) && obj2 != null) ? (PooledStatus) transformCount.evictLayout(obj2) : null;
        Intrinsics.checkNotNull(pooledStatus2);
        long packedValue = pooledStatus2.getPackedValue();
        Object obj3 = list.get(1);
        PaletteMap transformCount2 = transformCount(companion);
        if ((!Intrinsics.areEqual(obj3, bool) || (transformCount2 instanceof HapticBarrier)) && obj3 != null) {
            pooledStatus = (PooledStatus) transformCount2.evictLayout(obj3);
        }
        Intrinsics.checkNotNull(pooledStatus);
        return new TextIndent(packedValue, pooledStatus.getPackedValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PatternInspector executeRecord(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return new PatternInspector(((Integer) obj).intValue());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.goldenboot.saga.zone.MenuEdge, still in use, count: 2, list:
          (r1v1 com.goldenboot.saga.zone.MenuEdge) from 0x00d8: MOVE (r16v2 com.goldenboot.saga.zone.MenuEdge) = (r1v1 com.goldenboot.saga.zone.MenuEdge) (LINE:217)
          (r1v1 com.goldenboot.saga.zone.MenuEdge) from 0x00d0: MOVE (r16v7 com.goldenboot.saga.zone.MenuEdge) = (r1v1 com.goldenboot.saga.zone.MenuEdge) (LINE:209)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.goldenboot.saga.zone.SpanStyle expandScope(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.goldenboot.saga.zone.ElevationMaker.expandScope(java.lang.Object):com.goldenboot.saga.zone.MenuEdge");
    }

    public static final <T extends PaletteMap, Original, Saveable> Object filterTimer(Original original, T t, ItemStore itemStore) {
        Object growPayload2;
        return (original == null || (growPayload2 = t.growPayload(itemStore, original)) == null) ? Boolean.FALSE : growPayload2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation flattenToken(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.checkNotNull(str);
        return new VerbatimTtsAnnotation(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result flushHeader(Object obj) {
        if (obj == 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object formatMessage(ItemStore itemStore, PatternInspector patternInspector) {
        return Integer.valueOf(patternInspector.releaseHeader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List formatPosition(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            PaletteMap paletteMap = injectMetric;
            WatcherDelta.Range range = null;
            if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (paletteMap instanceof HapticBarrier)) && obj2 != null) {
                range = (WatcherDelta.Range) paletteMap.evictLayout(obj2);
            }
            Intrinsics.checkNotNull(range);
            arrayList.add(range);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object groupArchive(ItemStore itemStore, WatcherDelta.Range range) {
        DimenGraph dimenGraph;
        Object filterTimer;
        Object updateTimer2 = range.updateTimer();
        if (updateTimer2 instanceof ParagraphStyle) {
            dimenGraph = DimenGraph.reduceScope;
        } else if (updateTimer2 instanceof SpanStyle) {
            dimenGraph = DimenGraph.notifyMessage;
        } else if (updateTimer2 instanceof VerbatimTtsAnnotation) {
            dimenGraph = DimenGraph.connectPatch;
        } else if (updateTimer2 instanceof UrlAnnotation) {
            dimenGraph = DimenGraph.attachConfig;
        } else if (updateTimer2 instanceof SpanSequence.BounceHandler) {
            dimenGraph = DimenGraph.resetDelta;
        } else if (updateTimer2 instanceof SpanSequence.ActivityMutator) {
            dimenGraph = DimenGraph.inflateAdapter;
        } else {
            if (!(updateTimer2 instanceof PaletteNegotiator)) {
                throw new UnsupportedOperationException();
            }
            dimenGraph = DimenGraph.purgeNode;
        }
        switch (LayerUseCase.evictLayout[dimenGraph.ordinal()]) {
            case 1:
                Object updateTimer3 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                filterTimer = filterTimer((ParagraphStyle) updateTimer3, updateTimer, itemStore);
                break;
            case 2:
                Object updateTimer4 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                filterTimer = filterTimer((SpanStyle) updateTimer4, applyTask, itemStore);
                break;
            case 3:
                Object updateTimer5 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                filterTimer = filterTimer((VerbatimTtsAnnotation) updateTimer5, detachStream, itemStore);
                break;
            case 4:
                Object updateTimer6 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer6, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                filterTimer = filterTimer((UrlAnnotation) updateTimer6, releaseHeader, itemStore);
                break;
            case 5:
                Object updateTimer7 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                filterTimer = filterTimer((SpanSequence.BounceHandler) updateTimer7, clipOrigin, itemStore);
                break;
            case 6:
                Object updateTimer8 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer8, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                filterTimer = filterTimer((SpanSequence.ActivityMutator) updateTimer8, flushSample, itemStore);
                break;
            case 7:
                Object updateTimer9 = range.updateTimer();
                Intrinsics.checkNotNull(updateTimer9, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                filterTimer = popScope(((PaletteNegotiator) updateTimer9).updateTimer());
                break;
            default:
                throw new EndpointArchive();
        }
        return CursorBuilder.flushSample(popScope(dimenGraph), filterTimer, popScope(Integer.valueOf(range.getStart())), popScope(Integer.valueOf(range.getEnd())), popScope(range.popBlueprint()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object growCallback(ItemStore itemStore, ParagraphStyle paragraphStyle) {
        return CursorBuilder.flushSample(popScope(LifecycleGenerator.updateTimer(paragraphStyle.getTextAlign())), popScope(ModuleChain.flushSample(paragraphStyle.getTextDirection())), filterTimer(PooledStatus.injectMetric(paragraphStyle.getLineHeight()), transformCount(PooledStatus.INSTANCE), itemStore), filterTimer(paragraphStyle.getTextIndent(), openJob(TextIndent.INSTANCE), itemStore), filterTimer(paragraphStyle.getPlatformStyle(), HapticCoordinator.serializeOffset(PlatformParagraphStyle.INSTANCE), itemStore), filterTimer(paragraphStyle.getLineHeightStyle(), prependArchive(LineHeightStyle.INSTANCE), itemStore), filterTimer(AccentSerializer.releaseHeader(paragraphStyle.getLineBreak()), HapticCoordinator.peekRevision(AccentSerializer.INSTANCE), itemStore), popScope(SingletonAssembler.detachStream(paragraphStyle.getHyphens())), filterTimer(paragraphStyle.getTextMotion(), HapticCoordinator.reduceScope(DefaultRelay.INSTANCE), itemStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object handleFooter(ItemStore itemStore, SpanSequence.BounceHandler bounceHandler) {
        return CursorBuilder.flushSample(popScope(bounceHandler.getUrl()), filterTimer(bounceHandler.getStyles(), popBlueprint, itemStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanSequence.ActivityMutator injectField(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.checkNotNull(str);
        Object obj3 = list.get(1);
        PaletteMap paletteMap = popBlueprint;
        return new SpanSequence.ActivityMutator(str, ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (paletteMap instanceof HapticBarrier)) && obj3 != null) ? (ProgressRecord) paletteMap.evictLayout(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadItem(ItemStore itemStore, ProgressRecord progressRecord) {
        SpanStyle style = progressRecord.getStyle();
        PaletteMap paletteMap = applyTask;
        return CursorBuilder.flushSample(filterTimer(style, paletteMap, itemStore), filterTimer(progressRecord.getFocusedStyle(), paletteMap, itemStore), filterTimer(progressRecord.getHoveredStyle(), paletteMap, itemStore), filterTimer(progressRecord.getPressedStyle(), paletteMap, itemStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object locateSignal(ItemStore itemStore, LineHeightStyle lineHeightStyle) {
        return CursorBuilder.flushSample(popScope(LineHeightStyle.ActivityMutator.releaseHeader(lineHeightStyle.getAlignment())), popScope(LineHeightStyle.LayerUseCase.releaseHeader(lineHeightStyle.getTrim())), popScope(LineHeightStyle.FeedbackFlow.injectMetric(lineHeightStyle.getMode())));
    }

    public static final PaletteMap measureEndpoint(FontWeight.Companion companion) {
        return serializeOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object normalizeBundle(ItemStore itemStore, Shadow shadow) {
        return CursorBuilder.flushSample(filterTimer(ContainerSource.serializeOffset(shadow.getColor()), compressBody(ContainerSource.INSTANCE), itemStore), filterTimer(RuntimeHeap.detachStream(shadow.getOffset()), closeComponent(RuntimeHeap.INSTANCE), itemStore), popScope(Float.valueOf(shadow.getBlurRadius())));
    }

    public static final PaletteMap observeNode(Shadow.Companion companion) {
        return connectPatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StylusEvent offerHash(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num2);
        return StylusEvent.growPayload(ContextDelta.growPayload(intValue, num2.intValue()));
    }

    public static final PaletteMap openJob(TextIndent.Companion companion) {
        return peekRevision;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RuntimeHeap peekDescriptor(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return RuntimeHeap.detachStream(RuntimeHeap.INSTANCE.injectMetric());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3 != null ? (Float) obj3 : null);
        return RuntimeHeap.detachStream(RuntimeHeap.flushSample((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
    }

    public static final PaletteMap prepareCount() {
        return evictLayout;
    }

    public static final PaletteMap prependArchive(LineHeightStyle.Companion companion) {
        return gatherAdapter;
    }

    public static final PaletteMap protectChannel() {
        return updateTimer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList protectGauge(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            PaletteMap trimCallback = trimCallback(BaseGuardian.INSTANCE);
            BaseGuardian baseGuardian = null;
            if ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (trimCallback instanceof HapticBarrier)) && obj2 != null) {
                baseGuardian = (BaseGuardian) trimCallback.evictLayout(obj2);
            }
            Intrinsics.checkNotNull(baseGuardian);
            arrayList.add(baseGuardian);
        }
        return new LocaleList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanSequence.BounceHandler purgeMetric(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        ProgressRecord progressRecord = null;
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.checkNotNull(str);
        Object obj3 = list.get(1);
        PaletteMap paletteMap = popBlueprint;
        if ((!Intrinsics.areEqual(obj3, Boolean.FALSE) || (paletteMap instanceof HapticBarrier)) && obj3 != null) {
            progressRecord = (ProgressRecord) paletteMap.evictLayout(obj3);
        }
        return new SpanSequence.BounceHandler(str, progressRecord, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object queryData(ItemStore itemStore, UrlAnnotation urlAnnotation) {
        return popScope(urlAnnotation.getUrl());
    }

    public static final PaletteMap queryDescriptor(StylusEvent.Companion companion) {
        return notifyMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object refreshCounter(ItemStore itemStore, BaseGuardian baseGuardian) {
        return baseGuardian.releaseHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object removeCount(ItemStore itemStore, LocaleList localeList) {
        List<BaseGuardian> notifyMessage2 = localeList.notifyMessage();
        ArrayList arrayList = new ArrayList(notifyMessage2.size());
        int size = notifyMessage2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(filterTimer(notifyMessage2.get(i), trimCallback(BaseGuardian.INSTANCE), itemStore));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BoxMaterializer resetValue(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
        return BoxMaterializer.detachStream(BoxMaterializer.releaseHeader(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object resolveDelta(ItemStore itemStore, BoxMaterializer boxMaterializer) {
        return Float.valueOf(boxMaterializer.getMultiplier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object resumeSignature(ItemStore itemStore, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(filterTimer((WatcherDelta.Range) list.get(i), injectMetric, itemStore));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PooledStatus saveSnapshot(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return PooledStatus.injectMetric(PooledStatus.INSTANCE.growPayload());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        AlarmEmitter alarmEmitter = obj3 != null ? (AlarmEmitter) obj3 : null;
        Intrinsics.checkNotNull(alarmEmitter);
        return PooledStatus.injectMetric(FrameSaver.evictLayout(floatValue, alarmEmitter.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object searchHolder(ItemStore itemStore, PooledStatus pooledStatus) {
        return pooledStatus == null ? false : PooledStatus.popBlueprint(pooledStatus.getPackedValue(), PooledStatus.INSTANCE.growPayload()) ? Boolean.FALSE : CursorBuilder.flushSample(popScope(Float.valueOf(PooledStatus.serializeOffset(pooledStatus.getPackedValue()))), popScope(AlarmEmitter.detachStream(PooledStatus.peekRevision(pooledStatus.getPackedValue()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object serializeTask(ItemStore itemStore, SpanSequence.ActivityMutator activityMutator) {
        return CursorBuilder.flushSample(popScope(activityMutator.getTag()), filterTimer(activityMutator.getStyles(), popBlueprint, itemStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatcherDelta startResource(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(1);
        PaletteMap paletteMap = growPayload;
        List list2 = ((!Intrinsics.areEqual(obj2, Boolean.FALSE) || (paletteMap instanceof HapticBarrier)) && obj2 != null) ? (List) paletteMap.evictLayout(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.checkNotNull(str);
        return new WatcherDelta((List<? extends WatcherDelta.Range<? extends WatcherDelta.ActivityMutator>>) list2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform subscribeEvent(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation syncPool(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.checkNotNull(str);
        return new UrlAnnotation(str);
    }

    public static final PaletteMap transformCount(PooledStatus.Companion companion) {
        return resetDelta;
    }

    private static final <Original, Saveable> HapticBarrier<Original, Saveable> transformCurrency(IconExporter iconExporter, TouchRecord touchRecord) {
        return new FeedbackFlow(iconExporter, touchRecord);
    }

    public static final PaletteMap trimCallback(BaseGuardian.Companion companion) {
        return drawRequest;
    }

    public static final PaletteMap trimState(PatternInspector.Companion companion) {
        return drawField;
    }

    public static final PaletteMap unwrapRecord(BoxMaterializer.Companion companion) {
        return reduceScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressRecord updateConstraint(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        PaletteMap paletteMap = applyTask;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyle = null;
        SpanStyle spanStyle2 = ((!Intrinsics.areEqual(obj2, bool) || (paletteMap instanceof HapticBarrier)) && obj2 != null) ? (SpanStyle) paletteMap.evictLayout(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyle3 = ((!Intrinsics.areEqual(obj3, bool) || (paletteMap instanceof HapticBarrier)) && obj3 != null) ? (SpanStyle) paletteMap.evictLayout(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyle4 = ((!Intrinsics.areEqual(obj4, bool) || (paletteMap instanceof HapticBarrier)) && obj4 != null) ? (SpanStyle) paletteMap.evictLayout(obj4) : null;
        Object obj5 = list.get(3);
        if ((!Intrinsics.areEqual(obj5, bool) || (paletteMap instanceof HapticBarrier)) && obj5 != null) {
            spanStyle = (SpanStyle) paletteMap.evictLayout(obj5);
        }
        return new ProgressRecord(spanStyle2, spanStyle3, spanStyle4, spanStyle);
    }

    public static final PaletteMap updateRule() {
        return applyTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object validateOffset(ItemStore itemStore, RuntimeHeap runtimeHeap) {
        return runtimeHeap == null ? false : RuntimeHeap.connectJob(runtimeHeap.getPackedValue(), RuntimeHeap.INSTANCE.injectMetric()) ? Boolean.FALSE : CursorBuilder.flushSample(popScope(Float.valueOf(Float.intBitsToFloat((int) (runtimeHeap.getPackedValue() >> 32)))), popScope(Float.valueOf(Float.intBitsToFloat((int) (runtimeHeap.getPackedValue() & 4294967295L)))));
    }

    private static /* synthetic */ void prependOptions() {
    }

    private static /* synthetic */ void sortSnapshot() {
    }

    public static final <T> T popScope(T t) {
        return t;
    }
}

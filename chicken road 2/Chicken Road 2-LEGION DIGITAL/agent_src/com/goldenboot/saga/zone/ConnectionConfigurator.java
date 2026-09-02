package com.goldenboot.saga.zone;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001:\bghijklmnB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010G\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010M\u001a\u00020J8\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010\u0006R\u0014\u0010W\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bV\u0010\u0006R\u0014\u0010Y\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\u0006R\u0014\u0010[\u001a\u00020J8\u0000X\u0080T¢\u0006\u0006\n\u0004\bZ\u0010LR\u001a\u0010a\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b\u0005\u0010e¨\u0006o"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator;", "", "<init>", "()V", "", "growPayload", "I", "ALIGN_NORMAL", "injectMetric", "ALIGN_OPPOSITE", "detachStream", "ALIGN_CENTER", "releaseHeader", "ALIGN_LEFT", "clipOrigin", "ALIGN_RIGHT", "flushSample", "JUSTIFICATION_MODE_NONE", "updateTimer", "JUSTIFICATION_MODE_INTER_WORD", "applyTask", "HYPHENATION_FREQUENCY_NONE", "popBlueprint", "HYPHENATION_FREQUENCY_NORMAL", "drawField", "HYPHENATION_FREQUENCY_NORMAL_FAST", "connectJob", "HYPHENATION_FREQUENCY_FULL", "peekRevision", "HYPHENATION_FREQUENCY_FULL_FAST", "serializeOffset", "BREAK_STRATEGY_SIMPLE", "reduceScope", "BREAK_STRATEGY_HIGH_QUALITY", "notifyMessage", "BREAK_STRATEGY_BALANCED", "connectPatch", "LINE_BREAK_STYLE_NONE", "attachConfig", "LINE_BREAK_STYLE_LOOSE", "resetDelta", "LINE_BREAK_STYLE_NORMAL", "inflateAdapter", "LINE_BREAK_STYLE_STRICT", "purgeNode", "LINE_BREAK_WORD_STYLE_NONE", "drawRequest", "LINE_BREAK_WORD_STYLE_PHRASE", "gatherAdapter", "TEXT_DIRECTION_LTR", "decodePath", "TEXT_DIRECTION_RTL", "drawScope", "TEXT_DIRECTION_FIRST_STRONG_LTR", "expandArgs", "TEXT_DIRECTION_FIRST_STRONG_RTL", "findTask", "TEXT_DIRECTION_ANY_RTL_LTR", "mergeLocale", "TEXT_DIRECTION_LOCALE", "syncScope", "TEXT_GRANULARITY_CHARACTER", "flattenPackage", "TEXT_GRANULARITY_WORD", "injectConstraint", "DEFAULT_ALIGNMENT", "storeCharset", "DEFAULT_TEXT_DIRECTION", "", "filterPayload", "F", "DEFAULT_LINESPACING_MULTIPLIER", "inflateEdge", "DEFAULT_LINESPACING_EXTRA", "", "queryModel", "Z", "DEFAULT_INCLUDE_PADDING", "packPackage", "DEFAULT_MAX_LINES", "unlockMessage", "DEFAULT_BREAK_STRATEGY", "bindBody", "DEFAULT_LINE_BREAK_STYLE", "dispatchTimezone", "DEFAULT_LINE_BREAK_WORD_STYLE", "parseAsset", "DEFAULT_HYPHENATION_FREQUENCY", "mapJob", "DEFAULT_JUSTIFICATION_MODE", "attachCallback", "DEFAULT_FALLBACK_LINE_SPACING", "Landroid/text/Layout$Alignment;", "prepareTask", "Landroid/text/Layout$Alignment;", "evictLayout", "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", "updateAction", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "PluginInterpreter", "FeedbackFlow", "BounceHandler", "ActivityMutator", "LayerUseCase", "EndpointList", "StylusConverter", "ScopedMigration", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionConfigurator {

    /* renamed from: applyTask, reason: from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NONE = 0;

    /* renamed from: attachCallback, reason: from kotlin metadata */
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    public static final int LINE_BREAK_STYLE_LOOSE = 1;

    /* renamed from: bindBody, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    public static final int ALIGN_RIGHT = 4;

    /* renamed from: connectJob, reason: from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_FULL = 2;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NONE = 0;

    /* renamed from: decodePath, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_RTL = 1;

    /* renamed from: detachStream, reason: from kotlin metadata */
    public static final int ALIGN_CENTER = 2;

    /* renamed from: dispatchTimezone, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;

    /* renamed from: drawField, reason: from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;

    /* renamed from: drawScope, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;

    /* renamed from: expandArgs, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;

    /* renamed from: filterPayload, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;

    /* renamed from: findTask, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;

    /* renamed from: flattenPackage, reason: from kotlin metadata */
    public static final int TEXT_GRANULARITY_WORD = 1;

    /* renamed from: flushSample, reason: from kotlin metadata */
    public static final int JUSTIFICATION_MODE_NONE = 0;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_LTR = 0;

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final int ALIGN_NORMAL = 0;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    public static final int LINE_BREAK_STYLE_STRICT = 3;

    /* renamed from: inflateEdge, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;

    /* renamed from: injectConstraint, reason: from kotlin metadata */
    public static final int DEFAULT_ALIGNMENT = 0;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public static final int ALIGN_OPPOSITE = 1;

    /* renamed from: mapJob, reason: from kotlin metadata */
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_LOCALE = 5;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    public static final int BREAK_STRATEGY_BALANCED = 2;

    /* renamed from: packPackage, reason: from kotlin metadata */
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;

    /* renamed from: parseAsset, reason: from kotlin metadata */
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;

    /* renamed from: peekRevision, reason: from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;

    /* renamed from: queryModel, reason: from kotlin metadata */
    public static final boolean DEFAULT_INCLUDE_PADDING = false;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    public static final int ALIGN_LEFT = 3;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NORMAL = 2;

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    public static final int BREAK_STRATEGY_SIMPLE = 0;

    /* renamed from: storeCharset, reason: from kotlin metadata */
    public static final int DEFAULT_TEXT_DIRECTION = 2;

    /* renamed from: syncScope, reason: from kotlin metadata */
    public static final int TEXT_GRANULARITY_CHARACTER = 0;

    /* renamed from: unlockMessage, reason: from kotlin metadata */
    public static final int DEFAULT_BREAK_STRATEGY = 0;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final ConnectionConfigurator evictLayout = new ConnectionConfigurator();

    /* renamed from: prepareTask, reason: from kotlin metadata */
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: updateAction, reason: from kotlin metadata */
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public static final int connectComponent = 8;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$ActivityMutator;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface ActivityMutator {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$BounceHandler;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface BounceHandler {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$EndpointList;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface EndpointList {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$FeedbackFlow;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface FeedbackFlow {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$LayerUseCase;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface LayerUseCase {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$PluginInterpreter;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface PluginInterpreter {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$ScopedMigration;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface ScopedMigration {
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/goldenboot/saga/zone/ConnectionConfigurator$StylusConverter;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public @interface StylusConverter {
    }

    private ConnectionConfigurator() {
    }

    public final Layout.Alignment evictLayout() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    public final TextDirectionHeuristic growPayload() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}

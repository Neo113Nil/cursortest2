package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bc\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u001a\u0010T\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bR\u0010\u0006\u0012\u0004\bS\u0010\u0003R\u001a\u0010V\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bU\u0010\u0006\u0012\u0004\b\b\u0010\u0003R\u001a\u0010X\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bW\u0010\u0006\u0012\u0004\b\n\u0010\u0003R\u001a\u0010Z\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bY\u0010\u0006\u0012\u0004\b\u0005\u0010\u0003R\u0014\u0010\\\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\u0006R\u0014\u0010^\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\u0006R\u0014\u0010`\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010\u0006R\u0014\u0010b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010\u0006R\u0014\u0010d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010\u0006R\u0014\u0010f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010\u0006¨\u0006g"}, d2 = {"Lcom/goldenboot/saga/zone/BounceReporter;", "", "<init>", "()V", "", "growPayload", "Ljava/lang/String;", "DEFAULT", "injectMetric", "NEXUS_7", "detachStream", "NEXUS_7_2013", "releaseHeader", "NEXUS_5", "clipOrigin", "NEXUS_6", "flushSample", "NEXUS_9", "updateTimer", "NEXUS_10", "applyTask", "NEXUS_5X", "popBlueprint", "NEXUS_6P", "drawField", "PIXEL_C", "connectJob", "PIXEL", "peekRevision", "PIXEL_XL", "serializeOffset", "PIXEL_2", "reduceScope", "PIXEL_2_XL", "notifyMessage", "PIXEL_3", "connectPatch", "PIXEL_3_XL", "attachConfig", "PIXEL_3A", "resetDelta", "PIXEL_3A_XL", "inflateAdapter", "PIXEL_4", "purgeNode", "PIXEL_4_XL", "drawRequest", "PIXEL_4A", "gatherAdapter", "PIXEL_5", "decodePath", "PIXEL_6", "drawScope", "PIXEL_6_PRO", "expandArgs", "PIXEL_6A", "findTask", "PIXEL_7", "mergeLocale", "PIXEL_7_PRO", "syncScope", "PIXEL_7A", "flattenPackage", "PIXEL_8", "injectConstraint", "PIXEL_8_PRO", "storeCharset", "PIXEL_8A", "filterPayload", "PIXEL_9", "inflateEdge", "PIXEL_9_PRO", "queryModel", "PIXEL_9_PRO_FOLD", "packPackage", "PIXEL_9_PRO_XL", "unlockMessage", "PIXEL_FOLD", "bindBody", "PIXEL_TABLET", "dispatchTimezone", "AUTOMOTIVE_1024p", "parseAsset", "evictLayout", "WEAR_OS_LARGE_ROUND", "mapJob", "WEAR_OS_SMALL_ROUND", "attachCallback", "WEAR_OS_SQUARE", "prepareTask", "WEAR_OS_RECT", "updateAction", "PHONE", "connectComponent", "FOLDABLE", "startResource", "TABLET", "formatPosition", "DESKTOP", "resumeSignature", "TV_720p", "groupArchive", "TV_1080p", "ui-tooling-preview"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BounceReporter {

    /* renamed from: applyTask, reason: from kotlin metadata */
    public static final String NEXUS_5X = "id:Nexus 5X";

    /* renamed from: attachCallback, reason: from kotlin metadata */
    public static final String WEAR_OS_SQUARE = "id:wearos_square";

    /* renamed from: attachConfig, reason: from kotlin metadata */
    public static final String PIXEL_3A = "id:pixel_3a";

    /* renamed from: bindBody, reason: from kotlin metadata */
    public static final String PIXEL_TABLET = "id:pixel_tablet";
    public static final int cancelArchive = 0;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    public static final String NEXUS_6 = "id:Nexus 6";

    /* renamed from: connectComponent, reason: from kotlin metadata */
    public static final String FOLDABLE = "spec:width=673dp,height=841dp";

    /* renamed from: connectJob, reason: from kotlin metadata */
    public static final String PIXEL = "id:pixel";

    /* renamed from: connectPatch, reason: from kotlin metadata */
    public static final String PIXEL_3_XL = "id:pixel_3_xl";

    /* renamed from: decodePath, reason: from kotlin metadata */
    public static final String PIXEL_6 = "id:pixel_6";

    /* renamed from: detachStream, reason: from kotlin metadata */
    public static final String NEXUS_7_2013 = "id:Nexus 7 2013";

    /* renamed from: dispatchTimezone, reason: from kotlin metadata */
    public static final String AUTOMOTIVE_1024p = "id:automotive_1024p_landscape";

    /* renamed from: drawField, reason: from kotlin metadata */
    public static final String PIXEL_C = "id:pixel_c";

    /* renamed from: drawRequest, reason: from kotlin metadata */
    public static final String PIXEL_4A = "id:pixel_4a";

    /* renamed from: drawScope, reason: from kotlin metadata */
    public static final String PIXEL_6_PRO = "id:pixel_6_pro";
    public static final BounceReporter evictLayout = new BounceReporter();

    /* renamed from: expandArgs, reason: from kotlin metadata */
    public static final String PIXEL_6A = "id:pixel_6a";

    /* renamed from: filterPayload, reason: from kotlin metadata */
    public static final String PIXEL_9 = "id:pixel_9";

    /* renamed from: findTask, reason: from kotlin metadata */
    public static final String PIXEL_7 = "id:pixel_7";

    /* renamed from: flattenPackage, reason: from kotlin metadata */
    public static final String PIXEL_8 = "id:pixel_8";

    /* renamed from: flushSample, reason: from kotlin metadata */
    public static final String NEXUS_9 = "id:Nexus 9";

    /* renamed from: formatPosition, reason: from kotlin metadata */
    public static final String DESKTOP = "spec:width=1920dp,height=1080dp,dpi=160";

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    public static final String PIXEL_5 = "id:pixel_5";

    /* renamed from: groupArchive, reason: from kotlin metadata */
    public static final String TV_1080p = "spec:width=1920dp,height=1080dp";

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final String DEFAULT = "";

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    public static final String PIXEL_4 = "id:pixel_4";

    /* renamed from: inflateEdge, reason: from kotlin metadata */
    public static final String PIXEL_9_PRO = "id:pixel_9_pro";

    /* renamed from: injectConstraint, reason: from kotlin metadata */
    public static final String PIXEL_8_PRO = "id:pixel_8_pro";

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public static final String NEXUS_7 = "id:Nexus 7";

    /* renamed from: mapJob, reason: from kotlin metadata */
    public static final String WEAR_OS_SMALL_ROUND = "id:wearos_small_round";

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    public static final String PIXEL_7_PRO = "id:pixel_7_pro";

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    public static final String PIXEL_3 = "id:pixel_3";

    /* renamed from: packPackage, reason: from kotlin metadata */
    public static final String PIXEL_9_PRO_XL = "id:pixel_9_pro_xl";

    /* renamed from: parseAsset, reason: from kotlin metadata */
    public static final String WEAR_OS_LARGE_ROUND = "id:wearos_large_round";

    /* renamed from: peekRevision, reason: from kotlin metadata */
    public static final String PIXEL_XL = "id:pixel_xl";

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    public static final String NEXUS_6P = "id:Nexus 6P";

    /* renamed from: prepareTask, reason: from kotlin metadata */
    public static final String WEAR_OS_RECT = "id:wearos_rect";

    /* renamed from: purgeNode, reason: from kotlin metadata */
    public static final String PIXEL_4_XL = "id:pixel_4_xl";

    /* renamed from: queryModel, reason: from kotlin metadata */
    public static final String PIXEL_9_PRO_FOLD = "id:pixel_9_pro_fold";

    /* renamed from: reduceScope, reason: from kotlin metadata */
    public static final String PIXEL_2_XL = "id:pixel_2_xl";

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    public static final String NEXUS_5 = "id:Nexus 5";

    /* renamed from: resetDelta, reason: from kotlin metadata */
    public static final String PIXEL_3A_XL = "id:pixel_3a_xl";

    /* renamed from: resumeSignature, reason: from kotlin metadata */
    public static final String TV_720p = "spec:width=1280dp,height=720dp";

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    public static final String PIXEL_2 = "id:pixel_2";

    /* renamed from: startResource, reason: from kotlin metadata */
    public static final String TABLET = "spec:width=1280dp,height=800dp,dpi=240";

    /* renamed from: storeCharset, reason: from kotlin metadata */
    public static final String PIXEL_8A = "id:pixel_8a";

    /* renamed from: syncScope, reason: from kotlin metadata */
    public static final String PIXEL_7A = "id:pixel_7a";

    /* renamed from: unlockMessage, reason: from kotlin metadata */
    public static final String PIXEL_FOLD = "id:pixel_fold";

    /* renamed from: updateAction, reason: from kotlin metadata */
    public static final String PHONE = "spec:width=411dp,height=891dp";

    /* renamed from: updateTimer, reason: from kotlin metadata */
    public static final String NEXUS_10 = "name:Nexus 10";

    private BounceReporter() {
    }

    @ReceiverAdministrator
    public static /* synthetic */ void detachStream() {
    }

    @ReceiverAdministrator
    public static /* synthetic */ void evictLayout() {
    }

    @ReceiverAdministrator
    public static /* synthetic */ void growPayload() {
    }

    @ReceiverAdministrator
    public static /* synthetic */ void injectMetric() {
    }
}

package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0007\u0018\u0000 -2\u00020\u0001:\u000234B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b%\u00102R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b+\u0010\u001a¨\u00065"}, d2 = {"Lcom/goldenboot/saga/zone/CachedCreator;", "", "", "name", "Lcom/goldenboot/saga/zone/InsetsEdge;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lcom/goldenboot/saga/zone/WindowSupervisor;", "root", "Lcom/goldenboot/saga/zone/ContainerSource;", "tintColor", "Landroidx/compose/ui/graphics/FeedbackFlow;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLcom/goldenboot/saga/zone/WindowSupervisor;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "evictLayout", "Ljava/lang/String;", "updateTimer", "()Ljava/lang/String;", "growPayload", "F", "clipOrigin", "()F", "injectMetric", "releaseHeader", "detachStream", "peekRevision", "connectJob", "Lcom/goldenboot/saga/zone/WindowSupervisor;", "applyTask", "()Lcom/goldenboot/saga/zone/WindowSupervisor;", "flushSample", "J", "drawField", "()J", "I", "popBlueprint", "Z", "()Z", "ActivityMutator", "BounceHandler", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachedCreator {
    public static final int connectJob = 0;

    /* renamed from: drawField, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int peekRevision;
    private static final Object serializeOffset;

    /* renamed from: applyTask, reason: from kotlin metadata */
    private final boolean autoMirror;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final WindowSupervisor root;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final float viewportWidth;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final String name;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final long tintColor;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final float defaultWidth;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final float defaultHeight;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private final int genId;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final float viewportHeight;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final int tintBlendMode;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001QBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'J¡\u0001\u00109\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010-\u001a\u00020\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u0007¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010DR$\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u00160Ej\b\u0012\u0004\u0012\u00020\u0016`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0014\u0010P\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010O¨\u0006R"}, d2 = {"Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator;", "", "", "name", "Lcom/goldenboot/saga/zone/InsetsEdge;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lcom/goldenboot/saga/zone/ContainerSource;", "tintColor", "Landroidx/compose/ui/graphics/FeedbackFlow;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/goldenboot/saga/zone/DpadBuilder;", "updateTimer", "()V", "Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator$ActivityMutator;", "Lcom/goldenboot/saga/zone/WindowSupervisor;", "releaseHeader", "(Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator$ActivityMutator;)Lcom/goldenboot/saga/zone/WindowSupervisor;", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lcom/goldenboot/saga/zone/DrawerLoop;", "clipPathData", "evictLayout", "(Ljava/lang/String;FFFFFFFLjava/util/List;)Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator;", "flushSample", "()Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator;", "pathData", "Lcom/goldenboot/saga/zone/ChannelValidator;", "pathFillType", "Lcom/goldenboot/saga/zone/LayerTunnel;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lcom/goldenboot/saga/zone/ListMulticaster;", "strokeLineCap", "Lcom/goldenboot/saga/zone/RotateFacilitator;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "injectMetric", "(Ljava/util/List;ILjava/lang/String;Lcom/goldenboot/saga/zone/LayerTunnel;FLcom/goldenboot/saga/zone/LayerTunnel;FFIIFFFF)Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator;", "Lcom/goldenboot/saga/zone/CachedCreator;", "clipOrigin", "()Lcom/goldenboot/saga/zone/CachedCreator;", "Ljava/lang/String;", "growPayload", "F", "detachStream", "J", "I", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "applyTask", "Ljava/util/ArrayList;", "nodes", "popBlueprint", "Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator$ActivityMutator;", "root", "drawField", "isConsumed", "()Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator$ActivityMutator;", "currentGroup", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        public static final int connectJob = 8;

        /* renamed from: applyTask, reason: from kotlin metadata */
        private final ArrayList<C0091ActivityMutator> nodes;

        /* renamed from: clipOrigin, reason: from kotlin metadata */
        private final long tintColor;

        /* renamed from: detachStream, reason: from kotlin metadata */
        private final float viewportWidth;

        /* renamed from: drawField, reason: from kotlin metadata */
        private boolean isConsumed;

        /* renamed from: evictLayout, reason: from kotlin metadata */
        private final String name;

        /* renamed from: flushSample, reason: from kotlin metadata */
        private final int tintBlendMode;

        /* renamed from: growPayload, reason: from kotlin metadata */
        private final float defaultWidth;

        /* renamed from: injectMetric, reason: from kotlin metadata */
        private final float defaultHeight;

        /* renamed from: popBlueprint, reason: from kotlin metadata */
        private C0091ActivityMutator root;

        /* renamed from: releaseHeader, reason: from kotlin metadata */
        private final float viewportHeight;

        /* renamed from: updateTimer, reason: from kotlin metadata */
        private final boolean autoMirror;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010,\u001a\u0004\b\u001a\u0010-\"\u0004\b.\u0010/R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b\u0014\u0010-\"\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/goldenboot/saga/zone/CachedCreator$ActivityMutator$ActivityMutator;", "", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lcom/goldenboot/saga/zone/DrawerLoop;", "clipPathData", "", "Lcom/goldenboot/saga/zone/InsetsSet;", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "evictLayout", "Ljava/lang/String;", "injectMetric", "()Ljava/lang/String;", "peekRevision", "(Ljava/lang/String;)V", "growPayload", "F", "clipOrigin", "()F", "notifyMessage", "(F)V", "detachStream", "serializeOffset", "releaseHeader", "reduceScope", "flushSample", "connectPatch", "updateTimer", "attachConfig", "applyTask", "resetDelta", "popBlueprint", "inflateAdapter", "Ljava/util/List;", "()Ljava/util/List;", "connectJob", "(Ljava/util/List;)V", "drawField", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.CachedCreator$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0091ActivityMutator {

            /* renamed from: applyTask, reason: from kotlin metadata */
            private List<? extends DrawerLoop> clipPathData;

            /* renamed from: clipOrigin, reason: from kotlin metadata */
            private float scaleY;

            /* renamed from: detachStream, reason: from kotlin metadata */
            private float pivotY;

            /* renamed from: evictLayout, reason: from kotlin metadata */
            private String name;

            /* renamed from: flushSample, reason: from kotlin metadata */
            private float translationX;

            /* renamed from: growPayload, reason: from kotlin metadata */
            private float rotate;

            /* renamed from: injectMetric, reason: from kotlin metadata */
            private float pivotX;

            /* renamed from: popBlueprint, reason: from kotlin metadata */
            private List<InsetsSet> children;

            /* renamed from: releaseHeader, reason: from kotlin metadata */
            private float scaleX;

            /* renamed from: updateTimer, reason: from kotlin metadata */
            private float translationY;

            public C0091ActivityMutator() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            /* renamed from: applyTask, reason: from getter */
            public final float getTranslationX() {
                return this.translationX;
            }

            public final void attachConfig(float f) {
                this.scaleY = f;
            }

            /* renamed from: clipOrigin, reason: from getter */
            public final float getRotate() {
                return this.rotate;
            }

            public final void connectJob(List<? extends DrawerLoop> list) {
                this.clipPathData = list;
            }

            public final void connectPatch(float f) {
                this.scaleX = f;
            }

            /* renamed from: detachStream, reason: from getter */
            public final float getPivotX() {
                return this.pivotX;
            }

            public final void drawField(List<InsetsSet> list) {
                this.children = list;
            }

            public final List<InsetsSet> evictLayout() {
                return this.children;
            }

            /* renamed from: flushSample, reason: from getter */
            public final float getScaleX() {
                return this.scaleX;
            }

            public final List<DrawerLoop> growPayload() {
                return this.clipPathData;
            }

            public final void inflateAdapter(float f) {
                this.translationY = f;
            }

            /* renamed from: injectMetric, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final void notifyMessage(float f) {
                this.rotate = f;
            }

            public final void peekRevision(String str) {
                this.name = str;
            }

            /* renamed from: popBlueprint, reason: from getter */
            public final float getTranslationY() {
                return this.translationY;
            }

            public final void reduceScope(float f) {
                this.pivotY = f;
            }

            /* renamed from: releaseHeader, reason: from getter */
            public final float getPivotY() {
                return this.pivotY;
            }

            public final void resetDelta(float f) {
                this.translationX = f;
            }

            public final void serializeOffset(float f) {
                this.pivotX = f;
            }

            /* renamed from: updateTimer, reason: from getter */
            public final float getScaleY() {
                return this.scaleY;
            }

            public C0091ActivityMutator(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends DrawerLoop> list, List<InsetsSet> list2) {
                this.name = str;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ C0091ActivityMutator(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & ContentOperation.SpotShadowColor) != 0 ? 0.0f : f7, (i & ContentOperation.RotationX) != 0 ? SlideBeacon.updateTimer() : list, (i & ContentOperation.RotationY) != 0 ? new ArrayList() : list2);
            }
        }

        @ReceiverAdministrator
        public /* synthetic */ ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        private final C0091ActivityMutator applyTask() {
            Object updateTimer;
            updateTimer = PublisherController.updateTimer(this.nodes);
            return (C0091ActivityMutator) updateTimer;
        }

        public static /* synthetic */ ActivityMutator detachStream(ActivityMutator activityMutator, List list, int i, String str, LayerTunnel layerTunnel, float f, LayerTunnel layerTunnel2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            return activityMutator.injectMetric(list, (i4 & 2) != 0 ? SlideBeacon.injectMetric() : i, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? null : layerTunnel, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) == 0 ? layerTunnel2 : null, (i4 & 64) != 0 ? 1.0f : f2, (i4 & ContentOperation.SpotShadowColor) != 0 ? 0.0f : f3, (i4 & ContentOperation.RotationX) != 0 ? SlideBeacon.detachStream() : i2, (i4 & ContentOperation.RotationY) != 0 ? SlideBeacon.releaseHeader() : i3, (i4 & ContentOperation.RotationZ) != 0 ? 4.0f : f4, (i4 & ContentOperation.CameraDistance) != 0 ? 0.0f : f5, (i4 & ContentOperation.TransformOrigin) == 0 ? f6 : 1.0f, (i4 & ContentOperation.Shape) != 0 ? 0.0f : f7);
        }

        public static /* synthetic */ ActivityMutator growPayload(ActivityMutator activityMutator, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            if ((i & 8) != 0) {
                f3 = 0.0f;
            }
            if ((i & 16) != 0) {
                f4 = 1.0f;
            }
            if ((i & 32) != 0) {
                f5 = 1.0f;
            }
            if ((i & 64) != 0) {
                f6 = 0.0f;
            }
            if ((i & ContentOperation.SpotShadowColor) != 0) {
                f7 = 0.0f;
            }
            if ((i & ContentOperation.RotationX) != 0) {
                list = SlideBeacon.updateTimer();
            }
            float f8 = f7;
            List list2 = list;
            float f9 = f6;
            float f10 = f4;
            return activityMutator.evictLayout(str, f, f2, f3, f10, f5, f9, f8, list2);
        }

        private final WindowSupervisor releaseHeader(C0091ActivityMutator c0091ActivityMutator) {
            return new WindowSupervisor(c0091ActivityMutator.getName(), c0091ActivityMutator.getRotate(), c0091ActivityMutator.getPivotX(), c0091ActivityMutator.getPivotY(), c0091ActivityMutator.getScaleX(), c0091ActivityMutator.getScaleY(), c0091ActivityMutator.getTranslationX(), c0091ActivityMutator.getTranslationY(), c0091ActivityMutator.growPayload(), c0091ActivityMutator.evictLayout());
        }

        private final void updateTimer() {
            if (this.isConsumed) {
                PagerBridge.applyTask("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public final CachedCreator clipOrigin() {
            updateTimer();
            while (this.nodes.size() > 1) {
                flushSample();
            }
            CachedCreator cachedCreator = new CachedCreator(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, releaseHeader(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, ContentOperation.RotationY, null);
            this.isConsumed = true;
            return cachedCreator;
        }

        public final ActivityMutator evictLayout(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends DrawerLoop> clipPathData) {
            updateTimer();
            PublisherController.popBlueprint(this.nodes, new C0091ActivityMutator(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, clipPathData, null, ContentOperation.RotationY, null));
            return this;
        }

        public final ActivityMutator flushSample() {
            Object applyTask;
            updateTimer();
            applyTask = PublisherController.applyTask(this.nodes);
            applyTask().evictLayout().add(releaseHeader((C0091ActivityMutator) applyTask));
            return this;
        }

        public final ActivityMutator injectMetric(List<? extends DrawerLoop> pathData, int pathFillType, String name, LayerTunnel fill, float fillAlpha, LayerTunnel stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            updateTimer();
            applyTask().evictLayout().add(new FrameTrigger(name, pathData, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        public /* synthetic */ ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<C0091ActivityMutator> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            C0091ActivityMutator c0091ActivityMutator = new C0091ActivityMutator(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = c0091ActivityMutator;
            PublisherController.popBlueprint(arrayList, c0091ActivityMutator);
        }

        public /* synthetic */ ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? ContainerSource.INSTANCE.purgeNode() : j, (i2 & 64) != 0 ? androidx.compose.ui.graphics.FeedbackFlow.INSTANCE.expandArgs() : i, (i2 & ContentOperation.SpotShadowColor) != 0 ? false : z, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? ContainerSource.INSTANCE.purgeNode() : j, (i2 & 64) != 0 ? androidx.compose.ui.graphics.FeedbackFlow.INSTANCE.expandArgs() : i, (DefaultConstructorMarker) null);
        }

        private ActivityMutator(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/goldenboot/saga/zone/CachedCreator$BounceHandler;", "", "<init>", "()V", "", "evictLayout", "()I", "imageVectorCount", "I", "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.CachedCreator$BounceHandler, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int evictLayout() {
            int i;
            synchronized (CachedCreator.serializeOffset) {
                i = CachedCreator.peekRevision;
                CachedCreator.peekRevision = i + 1;
            }
            return i;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        serializeOffset = companion;
    }

    public /* synthetic */ CachedCreator(String str, float f, float f2, float f3, float f4, WindowSupervisor windowSupervisor, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, windowSupervisor, j, i, z, i2);
    }

    /* renamed from: applyTask, reason: from getter */
    public final WindowSupervisor getRoot() {
        return this.root;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final float getDefaultWidth() {
        return this.defaultWidth;
    }

    /* renamed from: connectJob, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    /* renamed from: detachStream, reason: from getter */
    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: drawField, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCreator)) {
            return false;
        }
        CachedCreator cachedCreator = (CachedCreator) other;
        return Intrinsics.areEqual(this.name, cachedCreator.name) && InsetsEdge.notifyMessage(this.defaultWidth, cachedCreator.defaultWidth) && InsetsEdge.notifyMessage(this.defaultHeight, cachedCreator.defaultHeight) && this.viewportWidth == cachedCreator.viewportWidth && this.viewportHeight == cachedCreator.viewportHeight && Intrinsics.areEqual(this.root, cachedCreator.root) && ContainerSource.drawScope(this.tintColor, cachedCreator.tintColor) && androidx.compose.ui.graphics.FeedbackFlow.filterPayload(this.tintBlendMode, cachedCreator.tintBlendMode) && this.autoMirror == cachedCreator.autoMirror;
    }

    /* renamed from: flushSample, reason: from getter */
    public final int getGenId() {
        return this.genId;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + InsetsEdge.attachConfig(this.defaultWidth)) * 31) + InsetsEdge.attachConfig(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + ContainerSource.unlockMessage(this.tintColor)) * 31) + androidx.compose.ui.graphics.FeedbackFlow.inflateEdge(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    /* renamed from: peekRevision, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    /* renamed from: popBlueprint, reason: from getter */
    public final int getTintBlendMode() {
        return this.tintBlendMode;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    /* renamed from: updateTimer, reason: from getter */
    public final String getName() {
        return this.name;
    }

    private CachedCreator(String str, float f, float f2, float f3, float f4, WindowSupervisor windowSupervisor, long j, int i, boolean z, int i2) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = windowSupervisor;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
        this.genId = i2;
    }

    public /* synthetic */ CachedCreator(String str, float f, float f2, float f3, float f4, WindowSupervisor windowSupervisor, long j, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, windowSupervisor, j, i, z, (i3 & ContentOperation.RotationY) != 0 ? INSTANCE.evictLayout() : i2, null);
    }
}

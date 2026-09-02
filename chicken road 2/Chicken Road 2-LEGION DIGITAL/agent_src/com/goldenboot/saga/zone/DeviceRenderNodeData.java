package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\bA\b\u0081\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00101J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u00101J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u00101J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u00101J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u00101J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u00101J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u00101J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u00101J\u0010\u0010>\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b@\u0010?J\u0010\u0010A\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bA\u00101J\u0012\u0010B\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bD\u0010*J\u0012\u0010E\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020#HÆ\u0003¢\u0006\u0004\bG\u0010*J¢\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010K\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bM\u0010*J\u001a\u0010O\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010Q\u001a\u0004\bR\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010S\u001a\u0004\bU\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010S\u001a\u0004\bV\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010S\u001a\u0004\bW\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010S\u001a\u0004\bX\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010S\u001a\u0004\bY\u0010*R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010Z\u001a\u0004\b[\u00101\"\u0004\b\\\u0010]R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010Z\u001a\u0004\b^\u00101\"\u0004\b_\u0010]R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010Z\u001a\u0004\b`\u00101\"\u0004\ba\u0010]R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010Z\u001a\u0004\bb\u00101\"\u0004\bc\u0010]R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010Z\u001a\u0004\bd\u00101\"\u0004\be\u0010]R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010S\u001a\u0004\bf\u0010*\"\u0004\bg\u0010hR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010S\u001a\u0004\bi\u0010*\"\u0004\bj\u0010hR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010Z\u001a\u0004\bk\u00101\"\u0004\bl\u0010]R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010Z\u001a\u0004\bm\u00101\"\u0004\bn\u0010]R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010Z\u001a\u0004\bo\u00101\"\u0004\bp\u0010]R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010Z\u001a\u0004\bq\u00101\"\u0004\br\u0010]R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010Z\u001a\u0004\bs\u00101\"\u0004\bt\u0010]R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010Z\u001a\u0004\bu\u00101\"\u0004\bv\u0010]R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010w\u001a\u0004\bx\u0010?\"\u0004\by\u0010zR\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010w\u001a\u0004\b{\u0010?\"\u0004\b|\u0010zR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010Z\u001a\u0004\b}\u00101\"\u0004\b~\u0010]R'\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b.\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010C\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b/\u0010S\u001a\u0005\b\u0083\u0001\u0010*\"\u0005\b\u0084\u0001\u0010hR(\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b0\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010F\"\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b2\u0010S\u001a\u0005\b\u0089\u0001\u0010*\"\u0005\b\u008a\u0001\u0010h¨\u0006\u008b\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/SnackbarEvaluator;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Lcom/goldenboot/saga/zone/FrameVersion;", "renderEffect", "Landroidx/compose/ui/graphics/FeedbackFlow;", "blendMode", "Landroidx/compose/ui/graphics/LayerUseCase;", "colorFilter", "Landroidx/compose/ui/graphics/EndpointList;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLcom/goldenboot/saga/zone/FrameVersion;ILandroidx/compose/ui/graphics/LayerUseCase;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "evictLayout", "()J", "connectJob", "()I", "purgeNode", "drawRequest", "gatherAdapter", "decodePath", "drawScope", "expandArgs", "()F", "findTask", "growPayload", "injectMetric", "detachStream", "releaseHeader", "clipOrigin", "flushSample", "updateTimer", "applyTask", "popBlueprint", "drawField", "peekRevision", "serializeOffset", "()Z", "reduceScope", "notifyMessage", "connectPatch", "()Lcom/goldenboot/saga/zone/FrameVersion;", "attachConfig", "resetDelta", "()Landroidx/compose/ui/graphics/LayerUseCase;", "inflateAdapter", "mergeLocale", "(JIIIIIIFFFFFIIFFFFFFZZFLcom/goldenboot/saga/zone/FrameVersion;ILandroidx/compose/ui/graphics/LayerUseCase;I)Lcom/goldenboot/saga/zone/SnackbarEvaluator;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "appendKey", "I", "mapJob", "resetValue", "connectComponent", "filterPayload", "computeTarget", "parseAsset", "F", "groupArchive", "closePayload", "(F)V", "cancelArchive", "expandScope", "serializeTask", "executeRecord", "injectField", "commitKey", "dispatchTimezone", "transformCurrency", "injectConstraint", "emitStrategy", "(I)V", "resolveDelta", "formatMessage", "resumeSignature", "commitBounds", "startResource", "drawConfig", "formatPosition", "normalizeBundle", "inflateEdge", "purgeMetric", "attachCallback", "validateOffset", "prepareTask", "peekDescriptor", "Z", "packPackage", "protectGauge", "(Z)V", "queryModel", "removeCount", "flattenPackage", "locateSignal", "Lcom/goldenboot/saga/zone/FrameVersion;", "updateAction", "growCallback", "(Lcom/goldenboot/saga/zone/FrameVersion;)V", "storeCharset", "handleFooter", "Landroidx/compose/ui/graphics/LayerUseCase;", "unlockMessage", "refreshCounter", "(Landroidx/compose/ui/graphics/LayerUseCase;)V", "bindBody", "compressVersion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.SnackbarEvaluator, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DeviceRenderNodeData {
    public static final int mergeLocale = 8;

    /* renamed from: applyTask, reason: from kotlin metadata and from toString */
    private float scaleY;

    /* renamed from: attachConfig, reason: from kotlin metadata and from toString */
    private float cameraDistance;

    /* renamed from: clipOrigin, reason: from kotlin metadata and from toString */
    private final int width;

    /* renamed from: connectJob, reason: from kotlin metadata and from toString */
    private float elevation;

    /* renamed from: connectPatch, reason: from kotlin metadata and from toString */
    private float rotationY;

    /* renamed from: decodePath, reason: from kotlin metadata and from toString */
    private FrameVersion renderEffect;

    /* renamed from: detachStream, reason: from kotlin metadata and from toString */
    private final int right;

    /* renamed from: drawField, reason: from kotlin metadata and from toString */
    private float translationY;

    /* renamed from: drawRequest, reason: from kotlin metadata and from toString */
    private boolean clipToBounds;

    /* renamed from: drawScope, reason: from kotlin metadata and from toString */
    private int blendMode;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final long uniqueId;

    /* renamed from: expandArgs, reason: from kotlin metadata and from toString */
    private androidx.compose.ui.graphics.LayerUseCase colorFilter;

    /* renamed from: findTask, reason: from kotlin metadata and from toString */
    private int compositingStrategy;

    /* renamed from: flushSample, reason: from kotlin metadata and from toString */
    private final int height;

    /* renamed from: gatherAdapter, reason: from kotlin metadata and from toString */
    private float alpha;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int left;

    /* renamed from: inflateAdapter, reason: from kotlin metadata and from toString */
    private float pivotY;

    /* renamed from: injectMetric, reason: from kotlin metadata and from toString */
    private final int top;

    /* renamed from: notifyMessage, reason: from kotlin metadata and from toString */
    private float rotationX;

    /* renamed from: peekRevision, reason: from kotlin metadata and from toString */
    private int ambientShadowColor;

    /* renamed from: popBlueprint, reason: from kotlin metadata and from toString */
    private float translationX;

    /* renamed from: purgeNode, reason: from kotlin metadata and from toString */
    private boolean clipToOutline;

    /* renamed from: reduceScope, reason: from kotlin metadata and from toString */
    private float rotationZ;

    /* renamed from: releaseHeader, reason: from kotlin metadata and from toString */
    private final int bottom;

    /* renamed from: resetDelta, reason: from kotlin metadata and from toString */
    private float pivotX;

    /* renamed from: serializeOffset, reason: from kotlin metadata and from toString */
    private int spotShadowColor;

    /* renamed from: updateTimer, reason: from kotlin metadata and from toString */
    private float scaleX;

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, FrameVersion frameVersion, int i9, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, frameVersion, i9, layerUseCase, i10);
    }

    public static /* synthetic */ DeviceRenderNodeData syncScope(DeviceRenderNodeData deviceRenderNodeData, long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, FrameVersion frameVersion, int i9, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i10, int i11, Object obj) {
        int i12;
        androidx.compose.ui.graphics.LayerUseCase layerUseCase2;
        long j2 = (i11 & 1) != 0 ? deviceRenderNodeData.uniqueId : j;
        int i13 = (i11 & 2) != 0 ? deviceRenderNodeData.left : i;
        int i14 = (i11 & 4) != 0 ? deviceRenderNodeData.top : i2;
        int i15 = (i11 & 8) != 0 ? deviceRenderNodeData.right : i3;
        int i16 = (i11 & 16) != 0 ? deviceRenderNodeData.bottom : i4;
        int i17 = (i11 & 32) != 0 ? deviceRenderNodeData.width : i5;
        int i18 = (i11 & 64) != 0 ? deviceRenderNodeData.height : i6;
        float f13 = (i11 & ContentOperation.SpotShadowColor) != 0 ? deviceRenderNodeData.scaleX : f;
        float f14 = (i11 & ContentOperation.RotationX) != 0 ? deviceRenderNodeData.scaleY : f2;
        float f15 = (i11 & ContentOperation.RotationY) != 0 ? deviceRenderNodeData.translationX : f3;
        float f16 = (i11 & ContentOperation.RotationZ) != 0 ? deviceRenderNodeData.translationY : f4;
        float f17 = (i11 & ContentOperation.CameraDistance) != 0 ? deviceRenderNodeData.elevation : f5;
        int i19 = (i11 & ContentOperation.TransformOrigin) != 0 ? deviceRenderNodeData.ambientShadowColor : i7;
        long j3 = j2;
        int i20 = (i11 & ContentOperation.Shape) != 0 ? deviceRenderNodeData.spotShadowColor : i8;
        float f18 = (i11 & ContentOperation.Clip) != 0 ? deviceRenderNodeData.rotationZ : f6;
        float f19 = (i11 & ContentOperation.CompositingStrategy) != 0 ? deviceRenderNodeData.rotationX : f7;
        float f20 = (i11 & 65536) != 0 ? deviceRenderNodeData.rotationY : f8;
        float f21 = (i11 & ContentOperation.RenderEffect) != 0 ? deviceRenderNodeData.cameraDistance : f9;
        float f22 = (i11 & ContentOperation.ColorFilter) != 0 ? deviceRenderNodeData.pivotX : f10;
        float f23 = (i11 & ContentOperation.BlendMode) != 0 ? deviceRenderNodeData.pivotY : f11;
        boolean z3 = (i11 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z;
        boolean z4 = (i11 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z2;
        float f24 = (i11 & 4194304) != 0 ? deviceRenderNodeData.alpha : f12;
        FrameVersion frameVersion2 = (i11 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : frameVersion;
        int i21 = (i11 & 16777216) != 0 ? deviceRenderNodeData.blendMode : i9;
        androidx.compose.ui.graphics.LayerUseCase layerUseCase3 = (i11 & 33554432) != 0 ? deviceRenderNodeData.colorFilter : layerUseCase;
        if ((i11 & 67108864) != 0) {
            layerUseCase2 = layerUseCase3;
            i12 = deviceRenderNodeData.compositingStrategy;
        } else {
            i12 = i10;
            layerUseCase2 = layerUseCase3;
        }
        return deviceRenderNodeData.mergeLocale(j3, i13, i14, i15, i16, i17, i18, f13, f14, f15, f16, f17, i19, i20, f18, f19, f20, f21, f22, f23, z3, z4, f24, frameVersion2, i21, layerUseCase2, i12);
    }

    /* renamed from: appendKey, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: applyTask, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: attachCallback, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: attachConfig, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    /* renamed from: bindBody, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: cancelArchive, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: clipOrigin, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void closePayload(float f) {
        this.scaleX = f;
    }

    public final void commitBounds(float f) {
        this.rotationZ = f;
    }

    public final void commitKey(float f) {
        this.translationY = f;
    }

    public final void compressVersion(int i) {
        this.compositingStrategy = i;
    }

    /* renamed from: computeTarget, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: connectComponent, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: connectJob, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: connectPatch, reason: from getter */
    public final FrameVersion getRenderEffect() {
        return this.renderEffect;
    }

    public final int decodePath() {
        return this.width;
    }

    /* renamed from: detachStream, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public final float dispatchTimezone() {
        return this.elevation;
    }

    public final void drawConfig(float f) {
        this.rotationX = f;
    }

    public final float drawField() {
        return this.pivotX;
    }

    public final int drawRequest() {
        return this.right;
    }

    /* renamed from: drawScope, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final void emitStrategy(int i) {
        this.ambientShadowColor = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && androidx.compose.ui.graphics.FeedbackFlow.filterPayload(this.blendMode, deviceRenderNodeData.blendMode) && Intrinsics.areEqual(this.colorFilter, deviceRenderNodeData.colorFilter) && androidx.compose.ui.graphics.EndpointList.flushSample(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final long evictLayout() {
        return this.uniqueId;
    }

    public final void executeRecord(float f) {
        this.translationX = f;
    }

    /* renamed from: expandArgs, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final void expandScope(float f) {
        this.scaleY = f;
    }

    /* renamed from: filterPayload, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final float findTask() {
        return this.scaleY;
    }

    /* renamed from: flattenPackage, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: flushSample, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void formatMessage(int i) {
        this.spotShadowColor = i;
    }

    public final float formatPosition() {
        return this.rotationY;
    }

    public final int gatherAdapter() {
        return this.bottom;
    }

    public final float groupArchive() {
        return this.scaleX;
    }

    public final void growCallback(FrameVersion frameVersion) {
        this.renderEffect = frameVersion;
    }

    /* renamed from: growPayload, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    public final void handleFooter(int i) {
        this.blendMode = i;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        FrameVersion frameVersion = this.renderEffect;
        int hashCode2 = (((hashCode + (frameVersion == null ? 0 : frameVersion.hashCode())) * 31) + androidx.compose.ui.graphics.FeedbackFlow.inflateEdge(this.blendMode)) * 31;
        androidx.compose.ui.graphics.LayerUseCase layerUseCase = this.colorFilter;
        return ((hashCode2 + (layerUseCase != null ? layerUseCase.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.EndpointList.updateTimer(this.compositingStrategy);
    }

    public final int inflateAdapter() {
        return this.compositingStrategy;
    }

    /* renamed from: inflateEdge, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: injectConstraint, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: injectField, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final float injectMetric() {
        return this.translationY;
    }

    public final void locateSignal(float f) {
        this.alpha = f;
    }

    public final int mapJob() {
        return this.left;
    }

    public final DeviceRenderNodeData mergeLocale(long uniqueId, int left, int top, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, FrameVersion renderEffect, int blendMode, androidx.compose.ui.graphics.LayerUseCase colorFilter, int compositingStrategy) {
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect, blendMode, colorFilter, compositingStrategy, null);
    }

    public final void normalizeBundle(float f) {
        this.rotationY = f;
    }

    public final float notifyMessage() {
        return this.alpha;
    }

    /* renamed from: packPackage, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final int parseAsset() {
        return this.height;
    }

    public final void peekDescriptor(float f) {
        this.pivotY = f;
    }

    /* renamed from: peekRevision, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    public final float popBlueprint() {
        return this.cameraDistance;
    }

    public final float prepareTask() {
        return this.pivotY;
    }

    public final void protectGauge(boolean z) {
        this.clipToOutline = z;
    }

    public final void purgeMetric(float f) {
        this.cameraDistance = f;
    }

    /* renamed from: purgeNode, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: queryModel, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean reduceScope() {
        return this.clipToBounds;
    }

    public final void refreshCounter(androidx.compose.ui.graphics.LayerUseCase layerUseCase) {
        this.colorFilter = layerUseCase;
    }

    public final int releaseHeader() {
        return this.ambientShadowColor;
    }

    public final void removeCount(boolean z) {
        this.clipToBounds = z;
    }

    /* renamed from: resetDelta, reason: from getter */
    public final androidx.compose.ui.graphics.LayerUseCase getColorFilter() {
        return this.colorFilter;
    }

    public final int resetValue() {
        return this.top;
    }

    public final int resolveDelta() {
        return this.spotShadowColor;
    }

    public final float resumeSignature() {
        return this.rotationZ;
    }

    public final boolean serializeOffset() {
        return this.clipToOutline;
    }

    public final float serializeTask() {
        return this.translationX;
    }

    /* renamed from: startResource, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    public final int storeCharset() {
        return this.blendMode;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", blendMode=" + ((Object) androidx.compose.ui.graphics.FeedbackFlow.queryModel(this.blendMode)) + ", colorFilter=" + this.colorFilter + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.EndpointList.applyTask(this.compositingStrategy)) + ')';
    }

    public final void transformCurrency(float f) {
        this.elevation = f;
    }

    public final androidx.compose.ui.graphics.LayerUseCase unlockMessage() {
        return this.colorFilter;
    }

    public final FrameVersion updateAction() {
        return this.renderEffect;
    }

    public final float updateTimer() {
        return this.rotationX;
    }

    public final void validateOffset(float f) {
        this.pivotX = f;
    }

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, FrameVersion frameVersion, int i9, androidx.compose.ui.graphics.LayerUseCase layerUseCase, int i10) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = frameVersion;
        this.blendMode = i9;
        this.colorFilter = layerUseCase;
        this.compositingStrategy = i10;
    }
}

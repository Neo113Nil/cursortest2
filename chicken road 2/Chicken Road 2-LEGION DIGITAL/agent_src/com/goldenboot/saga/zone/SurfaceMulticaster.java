package com.goldenboot.saga.zone;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.goldenboot.saga.zone.ContainerSource;
import com.goldenboot.saga.zone.ImageGateway;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002ª\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J;\u00101\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010M\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010VR\u0016\u0010Y\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010BR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010>R\u0016\u0010b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010f\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010a\u001a\u0004\bd\u0010\u0018\"\u0004\bF\u0010eR\u0016\u0010h\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0016\u0010j\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010aR\u001a\u0010m\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010>\u001a\u0004\bl\u0010@R*\u0010r\u001a\u00020n2\u0006\u0010o\u001a\u00020n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010]\u001a\u0004\bK\u0010q\"\u0004\b=\u0010\u0010R.\u0010x\u001a\u0004\u0018\u00010s2\b\u0010o\u001a\u0004\u0018\u00010s8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bO\u0010v\"\u0004\bR\u0010wR*\u0010\r\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010]\u001a\u0004\bz\u0010q\"\u0004\b{\u0010\u0010R-\u0010\u0082\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\bA\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010aR1\u0010\u008a\u0001\u001a\u00030\u0085\u00012\u0007\u0010o\u001a\u00030\u0085\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010>\u001a\u0005\b\u0087\u0001\u0010@\"\u0006\b\u0088\u0001\u0010\u0089\u0001R.\u0010\u008c\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010~\u001a\u0005\b^\u0010\u0080\u0001\"\u0005\bt\u0010\u0081\u0001R/\u0010\u008e\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u008d\u0001\u0010~\u001a\u0006\b\u008d\u0001\u0010\u0080\u0001\"\u0005\bg\u0010\u0081\u0001R/\u0010\u0090\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010~\u001a\u0005\b}\u0010\u0080\u0001\"\u0006\b\u0086\u0001\u0010\u0081\u0001R.\u0010\u0092\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010~\u001a\u0005\bp\u0010\u0080\u0001\"\u0005\bc\u0010\u0081\u0001R0\u0010\u0095\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010~\u001a\u0006\b\u0094\u0001\u0010\u0080\u0001\"\u0006\b\u0093\u0001\u0010\u0081\u0001R0\u0010\u0099\u0001\u001a\u00030\u0096\u00012\u0007\u0010o\u001a\u00030\u0096\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\bz\u0010>\u001a\u0005\b\u0097\u0001\u0010@\"\u0006\b\u0098\u0001\u0010\u0089\u0001R0\u0010\u009c\u0001\u001a\u00030\u0096\u00012\u0007\u0010o\u001a\u00030\u0096\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b5\u0010>\u001a\u0005\b\u009a\u0001\u0010@\"\u0006\b\u009b\u0001\u0010\u0089\u0001R/\u0010\u009d\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0004\b1\u0010~\u001a\u0006\b\u0083\u0001\u0010\u0080\u0001\"\u0006\b\u0091\u0001\u0010\u0081\u0001R-\u0010\u009e\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b?\u0010~\u001a\u0005\bi\u0010\u0080\u0001\"\u0005\bZ\u0010\u0081\u0001R-\u0010\u009f\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b!\u0010~\u001a\u0005\bk\u0010\u0080\u0001\"\u0005\b`\u0010\u0081\u0001R5\u0010¤\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010o\u001a\u0005\u0018\u00010 \u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\bd\u0010¡\u0001\u001a\u0005\b_\u0010¢\u0001\"\u0006\b\u008f\u0001\u0010£\u0001R\u001d\u0010¦\u0001\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010a\u001a\u0005\b¥\u0001\u0010\u0018R(\u0010§\u0001\u001a\u00020|2\u0006\u0010o\u001a\u00020|8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\by\u0010\u0080\u0001\"\u0006\b\u008b\u0001\u0010\u0081\u0001R&\u0010©\u0001\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b;\u0010\u0018\"\u0005\b¨\u0001\u0010e¨\u0006«\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/SurfaceMulticaster;", "Lcom/goldenboot/saga/zone/PaddingReducer;", "Lcom/goldenboot/saga/zone/SectionSensor;", "layerContainer", "", "ownerId", "Lcom/goldenboot/saga/zone/SessionConfigurator;", "canvasHolder", "Lcom/goldenboot/saga/zone/SlideDrain;", "canvasDrawScope", "<init>", "(Lcom/goldenboot/saga/zone/SectionSensor;JLcom/goldenboot/saga/zone/SessionConfigurator;Lcom/goldenboot/saga/zone/SlideDrain;)V", "Lcom/goldenboot/saga/zone/ImageGateway;", "compositingStrategy", "Lcom/goldenboot/saga/zone/DpadBuilder;", "connectComponent", "(I)V", "computeTarget", "()V", "Landroid/graphics/Paint;", "formatPosition", "()Landroid/graphics/Paint;", "", "resolveDelta", "()Z", "serializeTask", "resumeSignature", "appendKey", "", "x", "y", "Lcom/goldenboot/saga/zone/ScaleSaver;", "size", "queryModel", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "applyTask", "(Landroid/graphics/Outline;J)V", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "density", "Lcom/goldenboot/saga/zone/LabelCache;", "layoutDirection", "Lcom/goldenboot/saga/zone/BottomBarEvaluator;", "layer", "Lkotlin/Function1;", "Lcom/goldenboot/saga/zone/StepperAdministrator;", "block", "filterPayload", "(Lcom/goldenboot/saga/zone/BackgroundCollection;Lcom/goldenboot/saga/zone/LabelCache;Lcom/goldenboot/saga/zone/BottomBarEvaluator;Lcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/PulseCounter;", "canvas", "storeCharset", "(Lcom/goldenboot/saga/zone/PulseCounter;)V", "Landroid/graphics/Matrix;", "parseAsset", "()Landroid/graphics/Matrix;", "popBlueprint", "growPayload", "Lcom/goldenboot/saga/zone/SectionSensor;", "injectMetric", "J", "inflateEdge", "()J", "detachStream", "Lcom/goldenboot/saga/zone/SessionConfigurator;", "startResource", "()Lcom/goldenboot/saga/zone/SessionConfigurator;", "Lcom/goldenboot/saga/zone/PulseArranger;", "releaseHeader", "Lcom/goldenboot/saga/zone/PulseArranger;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "clipOrigin", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "flushSample", "Landroid/graphics/Rect;", "clipRect", "updateTimer", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "Landroid/graphics/Picture;", "picture", "Lcom/goldenboot/saga/zone/SlideDrain;", "pictureDrawScope", "drawField", "pictureCanvasHolder", "connectJob", "I", "peekRevision", "serializeOffset", "reduceScope", "Z", "clipBoundsInvalidated", "notifyMessage", "packPackage", "(Z)V", "isInvalidated", "connectPatch", "outlineIsProvided", "attachConfig", "clipToBounds", "resetDelta", "getLayerId", "layerId", "Landroidx/compose/ui/graphics/FeedbackFlow;", "value", "inflateAdapter", "()I", "blendMode", "Landroidx/compose/ui/graphics/LayerUseCase;", "purgeNode", "Landroidx/compose/ui/graphics/LayerUseCase;", "()Landroidx/compose/ui/graphics/LayerUseCase;", "(Landroidx/compose/ui/graphics/LayerUseCase;)V", "colorFilter", "drawRequest", "injectConstraint", "dispatchTimezone", "", "gatherAdapter", "F", "evictLayout", "()F", "(F)V", "alpha", "decodePath", "shouldManuallySetCenterPivot", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "drawScope", "bindBody", "unlockMessage", "(J)V", "pivotOffset", "expandArgs", "scaleX", "findTask", "scaleY", "mergeLocale", "translationX", "syncScope", "translationY", "flattenPackage", "locateSignal", "shadowElevation", "Lcom/goldenboot/saga/zone/ContainerSource;", "prepareTask", "cancelArchive", "ambientShadowColor", "groupArchive", "injectField", "spotShadowColor", "rotationX", "rotationY", "rotationZ", "Lcom/goldenboot/saga/zone/FrameVersion;", "Lcom/goldenboot/saga/zone/FrameVersion;", "()Lcom/goldenboot/saga/zone/FrameVersion;", "(Lcom/goldenboot/saga/zone/FrameVersion;)V", "renderEffect", "mapJob", "supportsSoftwareRendering", "cameraDistance", "resetValue", "clip", "BounceHandler", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceMulticaster implements PaddingReducer {

    /* renamed from: bindBody, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean dispatchTimezone = !ServerSynthesizer.evictLayout.evictLayout();
    private static final Canvas parseAsset = new ActivityMutator();

    /* renamed from: applyTask, reason: from kotlin metadata */
    private final Picture picture;

    /* renamed from: attachConfig, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final Resources resources;

    /* renamed from: connectJob, reason: from kotlin metadata */
    private int x;

    /* renamed from: connectPatch, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    /* renamed from: decodePath, reason: from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final SessionConfigurator canvasHolder;

    /* renamed from: drawField, reason: from kotlin metadata */
    private final SessionConfigurator pictureCanvasHolder;

    /* renamed from: drawRequest, reason: from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: drawScope, reason: from kotlin metadata */
    private long pivotOffset;

    /* renamed from: expandArgs, reason: from kotlin metadata */
    private float scaleX;

    /* renamed from: filterPayload, reason: from kotlin metadata */
    private float rotationX;

    /* renamed from: findTask, reason: from kotlin metadata */
    private float scaleY;

    /* renamed from: flattenPackage, reason: from kotlin metadata */
    private float shadowElevation;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final Rect clipRect;

    /* renamed from: gatherAdapter, reason: from kotlin metadata */
    private float alpha;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final SectionSensor layerContainer;

    /* renamed from: inflateAdapter, reason: from kotlin metadata */
    private int blendMode;

    /* renamed from: inflateEdge, reason: from kotlin metadata */
    private float rotationY;

    /* renamed from: injectConstraint, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final long ownerId;

    /* renamed from: mergeLocale, reason: from kotlin metadata */
    private float translationX;

    /* renamed from: notifyMessage, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: packPackage, reason: from kotlin metadata */
    private FrameVersion renderEffect;

    /* renamed from: peekRevision, reason: from kotlin metadata */
    private int y;

    /* renamed from: popBlueprint, reason: from kotlin metadata */
    private final SlideDrain pictureDrawScope;

    /* renamed from: purgeNode, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.LayerUseCase colorFilter;

    /* renamed from: queryModel, reason: from kotlin metadata */
    private float rotationZ;

    /* renamed from: reduceScope, reason: from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private final PulseArranger viewLayer;

    /* renamed from: resetDelta, reason: from kotlin metadata */
    private final long layerId;

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    private long size;

    /* renamed from: storeCharset, reason: from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: syncScope, reason: from kotlin metadata */
    private float translationY;

    /* renamed from: unlockMessage, reason: from kotlin metadata */
    private final boolean supportsSoftwareRendering;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private Paint layerPaint;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/goldenboot/saga/zone/SurfaceMulticaster$ActivityMutator", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator extends Canvas {
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/goldenboot/saga/zone/SurfaceMulticaster$BounceHandler;", "", "<init>", "()V", "", "mayRenderInSoftware", "Z", "evictLayout", "()Z", "Landroid/graphics/Canvas;", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "growPayload", "()Landroid/graphics/Canvas;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.SurfaceMulticaster$BounceHandler, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean evictLayout() {
            return SurfaceMulticaster.dispatchTimezone;
        }

        public final Canvas growPayload() {
            return SurfaceMulticaster.parseAsset;
        }

        private Companion() {
        }
    }

    public SurfaceMulticaster(SectionSensor sectionSensor, long j, SessionConfigurator sessionConfigurator, SlideDrain slideDrain) {
        this.layerContainer = sectionSensor;
        this.ownerId = j;
        this.canvasHolder = sessionConfigurator;
        PulseArranger pulseArranger = new PulseArranger(sectionSensor, sessionConfigurator, slideDrain);
        this.viewLayer = pulseArranger;
        this.resources = sectionSensor.getResources();
        this.clipRect = new Rect();
        boolean z = dispatchTimezone;
        this.picture = z ? new Picture() : null;
        this.pictureDrawScope = z ? new SlideDrain() : null;
        this.pictureCanvasHolder = z ? new SessionConfigurator() : null;
        sectionSensor.addView(pulseArranger);
        pulseArranger.setClipBounds(null);
        this.size = ScaleSaver.INSTANCE.evictLayout();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = androidx.compose.ui.graphics.FeedbackFlow.INSTANCE.mergeLocale();
        this.compositingStrategy = ImageGateway.INSTANCE.evictLayout();
        this.alpha = 1.0f;
        this.pivotOffset = RuntimeHeap.INSTANCE.releaseHeader();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        ContainerSource.Companion companion = ContainerSource.INSTANCE;
        this.ambientShadowColor = companion.evictLayout();
        this.spotShadowColor = companion.evictLayout();
        this.supportsSoftwareRendering = z;
    }

    private final void appendKey() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            PulseArranger pulseArranger = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            pulseArranger.setClipBounds(rect);
        }
    }

    private final void computeTarget() {
        if (resolveDelta()) {
            connectComponent(ImageGateway.INSTANCE.injectMetric());
        } else {
            connectComponent(getCompositingStrategy());
        }
    }

    private final void connectComponent(int compositingStrategy) {
        PulseArranger pulseArranger = this.viewLayer;
        ImageGateway.Companion companion = ImageGateway.INSTANCE;
        boolean z = true;
        if (ImageGateway.flushSample(compositingStrategy, companion.injectMetric())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (ImageGateway.flushSample(compositingStrategy, companion.growPayload())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        pulseArranger.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    private final Paint formatPosition() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean resolveDelta() {
        return ImageGateway.flushSample(getCompositingStrategy(), ImageGateway.INSTANCE.injectMetric()) || serializeTask();
    }

    private final void resumeSignature() {
        try {
            SessionConfigurator sessionConfigurator = this.canvasHolder;
            Canvas canvas = parseAsset;
            Canvas internalCanvas = sessionConfigurator.getAndroidCanvas().getInternalCanvas();
            sessionConfigurator.getAndroidCanvas().resumeSignature(canvas);
            StylusCustodian androidCanvas = sessionConfigurator.getAndroidCanvas();
            SectionSensor sectionSensor = this.layerContainer;
            PulseArranger pulseArranger = this.viewLayer;
            sectionSensor.evictLayout(androidCanvas, pulseArranger, pulseArranger.getDrawingTime());
            sessionConfigurator.getAndroidCanvas().resumeSignature(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean serializeTask() {
        return (androidx.compose.ui.graphics.FeedbackFlow.filterPayload(getBlendMode(), androidx.compose.ui.graphics.FeedbackFlow.INSTANCE.mergeLocale()) && getColorFilter() == null) ? false : true;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void applyTask(Outline outline, long outlineSize) {
        boolean releaseHeader = this.viewLayer.releaseHeader(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (releaseHeader) {
            return;
        }
        this.viewLayer.invalidate();
        resumeSignature();
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: attachConfig, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: bindBody, reason: from getter */
    public long getPivotOffset() {
        return this.pivotOffset;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void cancelArchive(long j) {
        this.ambientShadowColor = j;
        BannerCache.evictLayout.growPayload(this.viewLayer, BoxSaver.inflateAdapter(j));
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: clipOrigin, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void connectPatch(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: decodePath, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void detachStream(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void dispatchTimezone(int i) {
        this.compositingStrategy = i;
        computeTarget();
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void drawField(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: drawRequest */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void drawScope(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: evictLayout, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void expandArgs(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void filterPayload(BackgroundCollection density, LabelCache layoutDirection, BottomBarEvaluator layer, TouchRecord block) {
        Picture picture;
        SessionConfigurator sessionConfigurator;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.detachStream(density, layoutDirection, layer, block);
        if (!this.viewLayer.isAttachedToWindow()) {
            return;
        }
        this.viewLayer.setVisibility(4);
        this.viewLayer.setVisibility(0);
        resumeSignature();
        Picture picture2 = this.picture;
        if (picture2 == null) {
            return;
        }
        long j = this.size;
        Canvas beginRecording = picture2.beginRecording((int) (j >> 32), (int) (j & 4294967295L));
        try {
            SessionConfigurator sessionConfigurator2 = this.pictureCanvasHolder;
            if (sessionConfigurator2 != null) {
                Canvas internalCanvas = sessionConfigurator2.getAndroidCanvas().getInternalCanvas();
                sessionConfigurator2.getAndroidCanvas().resumeSignature(beginRecording);
                StylusCustodian androidCanvas = sessionConfigurator2.getAndroidCanvas();
                SlideDrain slideDrain = this.pictureDrawScope;
                if (slideDrain != null) {
                    long updateTimer = ProgressPatch.updateTimer(this.size);
                    BackgroundCollection density2 = slideDrain.getDrawContext().getDensity();
                    LabelCache layoutDirection2 = slideDrain.getDrawContext().getLayoutDirection();
                    PulseCounter applyTask = slideDrain.getDrawContext().applyTask();
                    sessionConfigurator = sessionConfigurator2;
                    canvas = internalCanvas;
                    long releaseHeader = slideDrain.getDrawContext().releaseHeader();
                    picture = picture2;
                    try {
                        BottomBarEvaluator graphicsLayer = slideDrain.getDrawContext().getGraphicsLayer();
                        WaveDrain drawContext = slideDrain.getDrawContext();
                        drawContext.injectMetric(density);
                        drawContext.growPayload(layoutDirection);
                        drawContext.evictLayout(androidCanvas);
                        drawContext.flushSample(updateTimer);
                        drawContext.detachStream(layer);
                        androidCanvas.reduceScope();
                        try {
                            block.invoke(slideDrain);
                            androidCanvas.queryModel();
                            WaveDrain drawContext2 = slideDrain.getDrawContext();
                            drawContext2.injectMetric(density2);
                            drawContext2.growPayload(layoutDirection2);
                            drawContext2.evictLayout(applyTask);
                            drawContext2.flushSample(releaseHeader);
                            drawContext2.detachStream(graphicsLayer);
                        } catch (Throwable th) {
                            androidCanvas.queryModel();
                            WaveDrain drawContext3 = slideDrain.getDrawContext();
                            drawContext3.injectMetric(density2);
                            drawContext3.growPayload(layoutDirection2);
                            drawContext3.evictLayout(applyTask);
                            drawContext3.flushSample(releaseHeader);
                            drawContext3.detachStream(graphicsLayer);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        picture.endRecording();
                        throw th;
                    }
                } else {
                    picture = picture2;
                    sessionConfigurator = sessionConfigurator2;
                    canvas = internalCanvas;
                }
                sessionConfigurator.getAndroidCanvas().resumeSignature(canvas);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } else {
                picture = picture2;
            }
            picture.endRecording();
        } catch (Throwable th3) {
            th = th3;
            picture = picture2;
        }
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: findTask, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void flattenPackage(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: flushSample, reason: from getter */
    public androidx.compose.ui.graphics.LayerUseCase getColorFilter() {
        return this.colorFilter;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: gatherAdapter, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public long getLayerId() {
        return this.layerId;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: groupArchive, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: growPayload */
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: inflateAdapter, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: inflateEdge, reason: from getter */
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: injectConstraint, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void injectField(long j) {
        this.spotShadowColor = j;
        BannerCache.evictLayout.injectMetric(this.viewLayer, BoxSaver.inflateAdapter(j));
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void injectMetric(int i) {
        this.blendMode = i;
        formatPosition().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.ActivityMutator.detachStream(i)));
        computeTarget();
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: locateSignal, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: mapJob, reason: from getter */
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void mergeLocale(FrameVersion frameVersion) {
        this.renderEffect = frameVersion;
        if (Build.VERSION.SDK_INT >= 31) {
            InputShard.evictLayout.evictLayout(this.viewLayer, frameVersion);
        }
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void notifyMessage(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: packPackage, reason: from getter */
    public boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public Matrix parseAsset() {
        return this.viewLayer.getMatrix();
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: peekRevision, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void popBlueprint() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: prepareTask, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void purgeNode(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void queryModel(int x, int y, long size) {
        if (ScaleSaver.updateTimer(this.size, size)) {
            int i = this.x;
            if (i != x) {
                this.viewLayer.offsetLeftAndRight(x - i);
            }
            int i2 = this.y;
            if (i2 != y) {
                this.viewLayer.offsetTopAndBottom(y - i2);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i3 = (int) (size >> 32);
            int i4 = (int) (4294967295L & size);
            this.viewLayer.layout(x, y, x + i3, y + i4);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i3 / 2.0f);
                this.viewLayer.setPivotY(i4 / 2.0f);
            }
        }
        this.x = x;
        this.y = y;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void reduceScope(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void releaseHeader(boolean z) {
        this.isInvalidated = z;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: resetDelta, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void resetValue(boolean z) {
        boolean z2 = false;
        this.clipToBounds = z && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        PulseArranger pulseArranger = this.viewLayer;
        if (z && this.outlineIsProvided) {
            z2 = true;
        }
        pulseArranger.setClipToOutline(z2);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    /* renamed from: serializeOffset, reason: from getter */
    public FrameVersion getRenderEffect() {
        return this.renderEffect;
    }

    /* renamed from: startResource, reason: from getter */
    public final SessionConfigurator getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void storeCharset(PulseCounter canvas) {
        appendKey();
        Canvas detachStream = EmitterHook.detachStream(canvas);
        if (detachStream.isHardwareAccelerated()) {
            SectionSensor sectionSensor = this.layerContainer;
            PulseArranger pulseArranger = this.viewLayer;
            sectionSensor.evictLayout(canvas, pulseArranger, pulseArranger.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                detachStream.drawPicture(picture);
            }
        }
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void syncScope(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void unlockMessage(long j) {
        this.pivotOffset = j;
        if ((StreamSyncer.evictLayout & j) == StreamSyncer.detachStream) {
            BannerCache.evictLayout.evictLayout(this.viewLayer);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
        this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // com.goldenboot.saga.zone.PaddingReducer
    public void updateTimer(androidx.compose.ui.graphics.LayerUseCase layerUseCase) {
        this.colorFilter = layerUseCase;
        formatPosition().setColorFilter(layerUseCase != null ? FontMemento.releaseHeader(layerUseCase) : null);
        computeTarget();
    }

    public /* synthetic */ SurfaceMulticaster(SectionSensor sectionSensor, long j, SessionConfigurator sessionConfigurator, SlideDrain slideDrain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sectionSensor, j, (i & 4) != 0 ? new SessionConfigurator() : sessionConfigurator, (i & 8) != 0 ? new SlideDrain() : slideDrain);
    }
}

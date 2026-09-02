package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u0014*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010 \u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u001eH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00140\u001eH\u0002¢\u0006\u0004\b+\u0010,J\u0015\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J9\u00103\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b3\u00104J3\u00106\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0000H\u0000¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010F\u001a\u0004\bG\u0010HR\"\u0010L\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010MR\u0017\u0010R\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u001c\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010BR\u0014\u0010V\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010BR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010e\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bf\u0010`R\u0011\u0010j\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010dR\u0011\u0010l\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bk\u0010`R\u0011\u0010n\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bm\u0010dR\u0011\u0010p\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bo\u0010dR\u0014\u0010r\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010`R\u0014\u0010t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010BR\u0011\u0010v\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bu\u0010HR\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010xR\u0011\u0010}\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b|\u0010BR\u0013\u0010\u007f\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b~\u0010<¨\u0006\u0080\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/PinchReceiver;", "", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "outerSemanticsNode", "", "mergingEnabled", "Lcom/goldenboot/saga/zone/ContentRepository;", "layoutNode", "Lcom/goldenboot/saga/zone/ItemNode;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;ZLcom/goldenboot/saga/zone/ContentRepository;Lcom/goldenboot/saga/zone/ItemNode;)V", "Lcom/goldenboot/saga/zone/PagerReducer;", "nodeCoordinates", "Lcom/goldenboot/saga/zone/ChipSnapshot;", "evictLayout", "(Lcom/goldenboot/saga/zone/PagerReducer;)Lcom/goldenboot/saga/zone/ChipSnapshot;", "", "unmergedChildren", "mergedConfig", "Lcom/goldenboot/saga/zone/DpadBuilder;", "bindBody", "(Ljava/util/List;Lcom/goldenboot/saga/zone/ItemNode;)V", "list", "includeDeactivatedNodes", "releaseHeader", "(Lcom/goldenboot/saga/zone/ContentRepository;Ljava/util/List;Z)V", "", "flushSample", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "popBlueprint", "(Ljava/util/List;Lcom/goldenboot/saga/zone/TouchRecord;)V", "Lcom/goldenboot/saga/zone/KeyboardReducer;", "applyTask", "()Lcom/goldenboot/saga/zone/KeyboardReducer;", "injectMetric", "(Ljava/util/List;)V", "Lcom/goldenboot/saga/zone/PointerInspector;", "role", "Lcom/goldenboot/saga/zone/ServerMerger;", "properties", "detachStream", "(Lcom/goldenboot/saga/zone/PointerInspector;Lcom/goldenboot/saga/zone/TouchRecord;)Lcom/goldenboot/saga/zone/PinchReceiver;", "Lcom/goldenboot/saga/zone/BottomBarActivator;", "alignmentLine", "", "drawField", "(Lcom/goldenboot/saga/zone/BottomBarActivator;)I", "includeFakeNodes", "parseAsset", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "notifyMessage", "(ZZZ)Ljava/util/List;", "Lcom/goldenboot/saga/zone/BridgeSerializer;", "clipOrigin", "()Lcom/goldenboot/saga/zone/BridgeSerializer;", "growPayload", "()Lcom/goldenboot/saga/zone/PinchReceiver;", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "gatherAdapter", "()Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "Z", "drawRequest", "()Z", "Lcom/goldenboot/saga/zone/ContentRepository;", "purgeNode", "()Lcom/goldenboot/saga/zone/ContentRepository;", "Lcom/goldenboot/saga/zone/ItemNode;", "storeCharset", "()Lcom/goldenboot/saga/zone/ItemNode;", "filterPayload", "dispatchTimezone", "(Z)V", "isFake", "Lcom/goldenboot/saga/zone/PinchReceiver;", "fakeNodeParent", "I", "resetDelta", "()I", "id", "inflateEdge", "isMergingSemanticsOfDescendants", "unlockMessage", "isUnmergedLeafNode", "Lcom/goldenboot/saga/zone/ItemEvent;", "inflateAdapter", "()Lcom/goldenboot/saga/zone/ItemEvent;", "layoutInfo", "Lcom/goldenboot/saga/zone/EndpointWriter;", "syncScope", "()Lcom/goldenboot/saga/zone/EndpointWriter;", "root", "injectConstraint", "()Lcom/goldenboot/saga/zone/ChipSnapshot;", "touchBoundsInRoot", "Lcom/goldenboot/saga/zone/ScaleSaver;", "flattenPackage", "()J", "size", "peekRevision", "boundsInRoot", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "drawScope", "positionInRoot", "serializeOffset", "boundsInWindow", "expandArgs", "positionInWindow", "findTask", "positionOnScreen", "connectJob", "boundsInParent", "packPackage", "isTransparent", "attachConfig", "config", "reduceScope", "()Ljava/util/List;", "children", "mergeLocale", "replacedChildren", "queryModel", "isRoot", "decodePath", "parent", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PinchReceiver {
    public static final int updateTimer = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private PinchReceiver fakeNodeParent;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final ItemNode unmergedConfig;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final RemoteCallback.LayerUseCase outerSemanticsNode;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final int id;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final boolean mergingEnabled;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final ContentRepository layoutNode;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private boolean isFake;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/ServerMerger;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ServerMerger;)V"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements TouchRecord {
        final /* synthetic */ PointerInspector reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityMutator(PointerInspector pointerInspector) {
            super(1);
            this.reduceScope = pointerInspector;
        }

        public final void evictLayout(ServerMerger serverMerger) {
            SetupCoordinator.injectAsset(serverMerger, this.reduceScope.getValue());
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((ServerMerger) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/ServerMerger;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/ServerMerger;)V"}, k = 3, mv = {2, 0, 0})
    public static final class BounceHandler extends Lambda implements TouchRecord {
        final /* synthetic */ String reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(String str) {
            super(1);
            this.reduceScope = str;
        }

        public final void evictLayout(ServerMerger serverMerger) {
            SetupCoordinator.unwrapKey(serverMerger, this.reduceScope);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            evictLayout((ServerMerger) obj);
            return DpadBuilder.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/goldenboot/saga/zone/PinchReceiver$FeedbackFlow", "Lcom/goldenboot/saga/zone/KeyboardReducer;", "Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "Lcom/goldenboot/saga/zone/ServerMerger;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "applyData", "(Lcom/goldenboot/saga/zone/ServerMerger;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeedbackFlow extends RemoteCallback.LayerUseCase implements KeyboardReducer {
        final /* synthetic */ TouchRecord flattenPackage;

        public FeedbackFlow(TouchRecord touchRecord) {
            this.flattenPackage = touchRecord;
        }

        @Override // com.goldenboot.saga.zone.KeyboardReducer
        public void applyData(ServerMerger serverMerger) {
            this.flattenPackage.invoke(serverMerger);
        }
    }

    public PinchReceiver(RemoteCallback.LayerUseCase layerUseCase, boolean z, ContentRepository contentRepository, ItemNode itemNode) {
        this.outerSemanticsNode = layerUseCase;
        this.mergingEnabled = z;
        this.layoutNode = contentRepository;
        this.unmergedConfig = itemNode;
        this.id = contentRepository.getSemanticsId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.goldenboot.saga.zone.KeyboardReducer] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    private final KeyboardReducer applyTask() {
        RemoteCallback.LayerUseCase layerUseCase;
        Object obj = null;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            MenuPage nodes = this.layoutNode.getNodes();
            int growPayload = AlphaScheduler.growPayload(8);
            if ((nodes.popBlueprint() & growPayload) != 0) {
                loop3: for (RemoteCallback.LayerUseCase head = nodes.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & growPayload) != 0) {
                        layerUseCase = head;
                        PluginScheduler pluginScheduler = null;
                        while (layerUseCase != null) {
                            if (layerUseCase instanceof KeyboardReducer) {
                                if (((KeyboardReducer) layerUseCase).drawConfig()) {
                                    obj = layerUseCase;
                                }
                            } else if ((layerUseCase.getKindSet() & growPayload) != 0 && (layerUseCase instanceof ItemMapper)) {
                                int i = 0;
                                for (RemoteCallback.LayerUseCase delegate = ((ItemMapper) layerUseCase).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & growPayload) != 0) {
                                        i++;
                                        if (i == 1) {
                                            layerUseCase = delegate;
                                        } else {
                                            if (pluginScheduler == null) {
                                                pluginScheduler = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                            }
                                            if (layerUseCase != null) {
                                                pluginScheduler.growPayload(layerUseCase);
                                                layerUseCase = null;
                                            }
                                            pluginScheduler.growPayload(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            layerUseCase = LayoutConstructor.serializeOffset(pluginScheduler);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                        break;
                    }
                }
            }
            return (KeyboardReducer) obj;
        }
        MenuPage nodes2 = this.layoutNode.getNodes();
        int growPayload2 = AlphaScheduler.growPayload(8);
        if ((nodes2.popBlueprint() & growPayload2) != 0) {
            layerUseCase = null;
            for (RemoteCallback.LayerUseCase head2 = nodes2.getHead(); head2 != null; head2 = head2.getChild()) {
                if ((head2.getKindSet() & growPayload2) != 0) {
                    ItemMapper itemMapper = head2;
                    ?? r7 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof KeyboardReducer) {
                            ?? r6 = (KeyboardReducer) itemMapper;
                            if (r6.drawConfig()) {
                                if (r6.savePool()) {
                                    return r6;
                                }
                                if (layerUseCase == null) {
                                    layerUseCase = r6;
                                }
                            }
                        } else if ((itemMapper.getKindSet() & growPayload2) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate2 = itemMapper.getDelegate();
                            int i2 = 0;
                            itemMapper = itemMapper;
                            r7 = r7;
                            while (delegate2 != null) {
                                if ((delegate2.getKindSet() & growPayload2) != 0) {
                                    i2++;
                                    r7 = r7;
                                    if (i2 == 1) {
                                        itemMapper = delegate2;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r7.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r7.growPayload(delegate2);
                                    }
                                }
                                delegate2 = delegate2.getChild();
                                itemMapper = itemMapper;
                                r7 = r7;
                            }
                            if (i2 == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r7);
                    }
                }
                if ((head2.getAggregateChildKindSet() & growPayload2) == 0) {
                    break;
                }
            }
            obj = layerUseCase;
        }
        return (KeyboardReducer) obj;
    }

    private final void bindBody(List<PinchReceiver> unmergedChildren, ItemNode mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        mapJob(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            PinchReceiver pinchReceiver = unmergedChildren.get(size2);
            if (!pinchReceiver.inflateEdge()) {
                mergedConfig.injectConstraint(pinchReceiver.unmergedConfig);
                pinchReceiver.bindBody(unmergedChildren, mergedConfig);
            }
        }
    }

    public static /* synthetic */ List connectPatch(PinchReceiver pinchReceiver, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !pinchReceiver.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return pinchReceiver.notifyMessage(z, z2, z3);
    }

    private final PinchReceiver detachStream(PointerInspector role, TouchRecord properties) {
        ItemNode itemNode = new ItemNode();
        itemNode.filterPayload(false);
        itemNode.storeCharset(false);
        properties.invoke(itemNode);
        PinchReceiver pinchReceiver = new PinchReceiver(new FeedbackFlow(properties), false, new ContentRepository(true, role != null ? PlatformResolver.popBlueprint(this) : PlatformResolver.flushSample(this)), itemNode);
        pinchReceiver.isFake = true;
        pinchReceiver.fakeNodeParent = this;
        return pinchReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.RemoteCallback$LayerUseCase] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.goldenboot.saga.zone.PluginScheduler] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final ChipSnapshot evictLayout(PagerReducer nodeCoordinates) {
        ItemMapper itemMapper;
        PinchReceiver decodePath = decodePath();
        if (decodePath == null) {
            return ChipSnapshot.INSTANCE.evictLayout();
        }
        MenuPage nodes = decodePath.layoutNode.getNodes();
        int growPayload = AlphaScheduler.growPayload(8);
        if ((nodes.popBlueprint() & growPayload) != 0) {
            loop0: for (RemoteCallback.LayerUseCase head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & growPayload) != 0) {
                    itemMapper = head;
                    ?? r6 = 0;
                    while (itemMapper != 0) {
                        if (itemMapper instanceof KeyboardReducer) {
                            if (itemMapper.drawConfig()) {
                                break loop0;
                            }
                        } else if ((itemMapper.getKindSet() & growPayload) != 0 && (itemMapper instanceof ItemMapper)) {
                            RemoteCallback.LayerUseCase delegate = itemMapper.getDelegate();
                            int i = 0;
                            itemMapper = itemMapper;
                            r6 = r6;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & growPayload) != 0) {
                                    i++;
                                    r6 = r6;
                                    if (i == 1) {
                                        itemMapper = delegate;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new PluginScheduler(new RemoteCallback.LayerUseCase[16], 0);
                                        }
                                        if (itemMapper != 0) {
                                            r6.growPayload(itemMapper);
                                            itemMapper = 0;
                                        }
                                        r6.growPayload(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                itemMapper = itemMapper;
                                r6 = r6;
                            }
                            if (i == 1) {
                            }
                        }
                        itemMapper = LayoutConstructor.serializeOffset(r6);
                    }
                }
                if ((head.getAggregateChildKindSet() & growPayload) == 0) {
                    break;
                }
            }
        }
        itemMapper = 0;
        KeyboardReducer keyboardReducer = (KeyboardReducer) itemMapper;
        BridgeSerializer notifyMessage = keyboardReducer != null ? LayoutConstructor.notifyMessage(keyboardReducer, AlphaScheduler.growPayload(8)) : null;
        return notifyMessage == null ? decodePath.evictLayout(nodeCoordinates) : PagerReducer.connectComponent(notifyMessage, nodeCoordinates, false, 2, null);
    }

    private final List<PinchReceiver> flushSample(List<PinchReceiver> unmergedChildren, List<PinchReceiver> list) {
        mapJob(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            PinchReceiver pinchReceiver = unmergedChildren.get(size2);
            if (pinchReceiver.inflateEdge()) {
                list.add(pinchReceiver);
            } else if (!pinchReceiver.unmergedConfig.getIsClearingSemantics()) {
                pinchReceiver.flushSample(unmergedChildren, list);
            }
        }
        return list;
    }

    private final boolean inflateEdge() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void injectMetric(List<PinchReceiver> unmergedChildren) {
        PointerInspector applyTask;
        applyTask = PlatformResolver.applyTask(this);
        if (applyTask != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(detachStream(applyTask, new ActivityMutator(applyTask)));
        }
        ItemNode itemNode = this.unmergedConfig;
        PatternAnnouncer patternAnnouncer = PatternAnnouncer.evictLayout;
        if (itemNode.applyTask(patternAnnouncer.detachStream()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) StyleRouter.evictLayout(this.unmergedConfig, patternAnnouncer.detachStream());
            String str = list != null ? (String) CursorCollector.groupArchive(list) : null;
            if (str != null) {
                unmergedChildren.add(0, detachStream(null, new BounceHandler(str)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List mapJob(PinchReceiver pinchReceiver, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return pinchReceiver.parseAsset(list, z, z2);
    }

    private final void popBlueprint(List<PinchReceiver> list, TouchRecord touchRecord) {
        mapJob(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            touchRecord.invoke(list.get(size2));
        }
    }

    private final void releaseHeader(ContentRepository contentRepository, List<PinchReceiver> list, boolean z) {
        PluginScheduler unwrapRecord = contentRepository.unwrapRecord();
        Object[] objArr = unwrapRecord.reduceScope;
        int reduceScope = unwrapRecord.reduceScope();
        for (int i = 0; i < reduceScope; i++) {
            ContentRepository contentRepository2 = (ContentRepository) objArr[i];
            if (contentRepository2.popBlueprint() && (z || !contentRepository2.getIsDeactivated())) {
                if (contentRepository2.getNodes().resetDelta(AlphaScheduler.growPayload(8))) {
                    list.add(PlatformResolver.evictLayout(contentRepository2, this.mergingEnabled));
                } else {
                    releaseHeader(contentRepository2, list, z);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List updateTimer(PinchReceiver pinchReceiver, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return pinchReceiver.flushSample(list, list2);
    }

    public final ItemNode attachConfig() {
        if (!inflateEdge()) {
            return this.unmergedConfig;
        }
        ItemNode notifyMessage = this.unmergedConfig.notifyMessage();
        bindBody(new ArrayList(), notifyMessage);
        return notifyMessage;
    }

    public final BridgeSerializer clipOrigin() {
        BridgeSerializer notifyMessage;
        if (!this.isFake) {
            KeyboardReducer applyTask = applyTask();
            return (applyTask == null || (notifyMessage = LayoutConstructor.notifyMessage(applyTask, AlphaScheduler.growPayload(8))) == null) ? this.layoutNode.purgeMetric() : notifyMessage;
        }
        PinchReceiver decodePath = decodePath();
        if (decodePath != null) {
            return decodePath.clipOrigin();
        }
        return null;
    }

    public final ChipSnapshot connectJob() {
        PagerReducer dispatchTimezone;
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null && (dispatchTimezone = clipOrigin.dispatchTimezone()) != null) {
                return evictLayout(dispatchTimezone);
            }
        }
        return ChipSnapshot.INSTANCE.evictLayout();
    }

    public final PinchReceiver decodePath() {
        ContentRepository contentRepository;
        PinchReceiver pinchReceiver = this.fakeNodeParent;
        if (pinchReceiver != null) {
            return pinchReceiver;
        }
        if (this.mergingEnabled) {
            contentRepository = this.layoutNode.acquireAsset();
            while (contentRepository != null) {
                ItemNode detachStream = contentRepository.detachStream();
                if (detachStream != null && detachStream.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                contentRepository = contentRepository.acquireAsset();
            }
        }
        contentRepository = null;
        if (contentRepository == null) {
            contentRepository = this.layoutNode.acquireAsset();
            while (true) {
                if (contentRepository == null) {
                    contentRepository = null;
                    break;
                }
                if (contentRepository.getNodes().resetDelta(AlphaScheduler.growPayload(8))) {
                    break;
                }
                contentRepository = contentRepository.acquireAsset();
            }
        }
        if (contentRepository == null) {
            return null;
        }
        return PlatformResolver.evictLayout(contentRepository, this.mergingEnabled);
    }

    public final void dispatchTimezone(boolean z) {
        this.isFake = z;
    }

    public final int drawField(BottomBarActivator alignmentLine) {
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            return clipOrigin.storeCharset(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: drawRequest, reason: from getter */
    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final long drawScope() {
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null) {
                return WatcherSensor.clipOrigin(clipOrigin);
            }
        }
        return RuntimeHeap.INSTANCE.releaseHeader();
    }

    public final long expandArgs() {
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null) {
                return WatcherSensor.flushSample(clipOrigin);
            }
        }
        return RuntimeHeap.INSTANCE.releaseHeader();
    }

    /* renamed from: filterPayload, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final long findTask() {
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null) {
                return WatcherSensor.updateTimer(clipOrigin);
            }
        }
        return RuntimeHeap.INSTANCE.releaseHeader();
    }

    public final long flattenPackage() {
        BridgeSerializer clipOrigin = clipOrigin();
        return clipOrigin != null ? clipOrigin.applyTask() : ScaleSaver.INSTANCE.evictLayout();
    }

    /* renamed from: gatherAdapter, reason: from getter */
    public final RemoteCallback.LayerUseCase getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    public final PinchReceiver growPayload() {
        return new PinchReceiver(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final ItemEvent inflateAdapter() {
        return this.layoutNode;
    }

    public final ChipSnapshot injectConstraint() {
        KeyboardReducer applyTask = applyTask();
        return applyTask == null ? this.layoutNode.purgeMetric().checkHolder() : DelegateWriter.injectMetric(applyTask.getNode(), DelegateWriter.evictLayout(this.unmergedConfig));
    }

    public final List<PinchReceiver> mergeLocale() {
        return connectPatch(this, false, true, false, 4, null);
    }

    public final List<PinchReceiver> notifyMessage(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return CursorBuilder.peekRevision();
        }
        ArrayList arrayList = new ArrayList();
        return inflateEdge() ? updateTimer(this, arrayList, null, 2, null) : parseAsset(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    public final boolean packPackage() {
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            return clipOrigin.processValue();
        }
        return false;
    }

    public final List<PinchReceiver> parseAsset(List<PinchReceiver> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return CursorBuilder.peekRevision();
        }
        releaseHeader(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            injectMetric(unmergedChildren);
        }
        return unmergedChildren;
    }

    public final ChipSnapshot peekRevision() {
        ChipSnapshot growPayload;
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null && (growPayload = WatcherSensor.growPayload(clipOrigin)) != null) {
                return growPayload;
            }
        }
        return ChipSnapshot.INSTANCE.evictLayout();
    }

    /* renamed from: purgeNode, reason: from getter */
    public final ContentRepository getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean queryModel() {
        return decodePath() == null;
    }

    public final List<PinchReceiver> reduceScope() {
        return connectPatch(this, false, false, false, 7, null);
    }

    /* renamed from: resetDelta, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final ChipSnapshot serializeOffset() {
        ChipSnapshot injectMetric;
        BridgeSerializer clipOrigin = clipOrigin();
        if (clipOrigin != null) {
            if (!clipOrigin.popBlueprint()) {
                clipOrigin = null;
            }
            if (clipOrigin != null && (injectMetric = WatcherSensor.injectMetric(clipOrigin)) != null) {
                return injectMetric;
            }
        }
        return ChipSnapshot.INSTANCE.evictLayout();
    }

    /* renamed from: storeCharset, reason: from getter */
    public final ItemNode getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public final EndpointWriter syncScope() {
        CarouselHelper owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    public final boolean unlockMessage() {
        if (this.isFake || !mergeLocale().isEmpty()) {
            return false;
        }
        ContentRepository acquireAsset = this.layoutNode.acquireAsset();
        while (true) {
            if (acquireAsset == null) {
                acquireAsset = null;
                break;
            }
            ItemNode detachStream = acquireAsset.detachStream();
            if (detachStream != null && detachStream.getIsMergingSemanticsOfDescendants()) {
                break;
            }
            acquireAsset = acquireAsset.acquireAsset();
        }
        return acquireAsset == null;
    }
}

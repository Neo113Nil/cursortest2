package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\ba\u0018\u0000 \u00112\u00020\u0001:\u0001,R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "connectPatch", "()Lcom/goldenboot/saga/zone/FlexMaterializer;", "notifyMessage", "(Lcom/goldenboot/saga/zone/FlexMaterializer;)V", "measurePolicy", "Lcom/goldenboot/saga/zone/LabelCache;", "getLayoutDirection", "()Lcom/goldenboot/saga/zone/LabelCache;", "growPayload", "(Lcom/goldenboot/saga/zone/LabelCache;)V", "layoutDirection", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "getDensity", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "injectMetric", "(Lcom/goldenboot/saga/zone/BackgroundCollection;)V", "density", "Landroidx/compose/ui/RemoteCallback;", "evictLayout", "()Landroidx/compose/ui/RemoteCallback;", "drawField", "(Landroidx/compose/ui/RemoteCallback;)V", "modifier", "Lcom/goldenboot/saga/zone/InitMerger;", "getViewConfiguration", "()Lcom/goldenboot/saga/zone/InitMerger;", "releaseHeader", "(Lcom/goldenboot/saga/zone/InitMerger;)V", "viewConfiguration", "Lcom/goldenboot/saga/zone/StateMediator;", "purgeNode", "()Lcom/goldenboot/saga/zone/StateMediator;", "updateTimer", "(Lcom/goldenboot/saga/zone/StateMediator;)V", "compositionLocalMap", "", "connectJob", "()I", "flushSample", "(I)V", "compositeKeyHash", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AlarmMulticaster {

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R)\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R)\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R)\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\u0006\u0010\u0014¨\u0006&"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster$ActivityMutator;", "", "<init>", "()V", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/AlarmMulticaster;", "growPayload", "Lcom/goldenboot/saga/zone/ElevationNode;", "evictLayout", "()Lcom/goldenboot/saga/zone/ElevationNode;", "Constructor", "injectMetric", "applyTask", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/RemoteCallback;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "detachStream", "Lcom/goldenboot/saga/zone/IconExporter;", "clipOrigin", "()Lcom/goldenboot/saga/zone/IconExporter;", "SetModifier", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "releaseHeader", "SetDensity", "Lcom/goldenboot/saga/zone/StateMediator;", "flushSample", "SetResolvedCompositionLocals", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "SetMeasurePolicy", "Lcom/goldenboot/saga/zone/LabelCache;", "updateTimer", "SetLayoutDirection", "Lcom/goldenboot/saga/zone/InitMerger;", "SetViewConfiguration", "", "popBlueprint", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        /* renamed from: growPayload, reason: from kotlin metadata */
        private static final ElevationNode Constructor = ContentRepository.INSTANCE.evictLayout();

        /* renamed from: injectMetric, reason: from kotlin metadata */
        private static final ElevationNode VirtualConstructor = PluginInterpreter.reduceScope;

        /* renamed from: detachStream, reason: from kotlin metadata */
        private static final IconExporter SetModifier = EndpointList.reduceScope;

        /* renamed from: releaseHeader, reason: from kotlin metadata */
        private static final IconExporter SetDensity = BounceHandler.reduceScope;

        /* renamed from: clipOrigin, reason: from kotlin metadata */
        private static final IconExporter SetResolvedCompositionLocals = StylusConverter.reduceScope;

        /* renamed from: flushSample, reason: from kotlin metadata */
        private static final IconExporter SetMeasurePolicy = LayerUseCase.reduceScope;

        /* renamed from: updateTimer, reason: from kotlin metadata */
        private static final IconExporter SetLayoutDirection = FeedbackFlow.reduceScope;

        /* renamed from: applyTask, reason: from kotlin metadata */
        private static final IconExporter SetViewConfiguration = ScopedMigration.reduceScope;

        /* renamed from: popBlueprint, reason: from kotlin metadata */
        private static final IconExporter SetCompositeKeyHash = C0077ActivityMutator.reduceScope;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;I)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0077ActivityMutator extends Lambda implements IconExporter {
            public static final C0077ActivityMutator reduceScope = new C0077ActivityMutator();

            public C0077ActivityMutator() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, int i) {
                alarmMulticaster.flushSample(i);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, ((Number) obj2).intValue());
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Lcom/goldenboot/saga/zone/BackgroundCollection;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$BounceHandler */
        public static final class BounceHandler extends Lambda implements IconExporter {
            public static final BounceHandler reduceScope = new BounceHandler();

            public BounceHandler() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, BackgroundCollection backgroundCollection) {
                alarmMulticaster.injectMetric(backgroundCollection);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (BackgroundCollection) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Landroidx/compose/ui/RemoteCallback;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Landroidx/compose/ui/RemoteCallback;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$EndpointList */
        public static final class EndpointList extends Lambda implements IconExporter {
            public static final EndpointList reduceScope = new EndpointList();

            public EndpointList() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, androidx.compose.ui.RemoteCallback remoteCallback) {
                alarmMulticaster.drawField(remoteCallback);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (androidx.compose.ui.RemoteCallback) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/LabelCache;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Lcom/goldenboot/saga/zone/LabelCache;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$FeedbackFlow */
        public static final class FeedbackFlow extends Lambda implements IconExporter {
            public static final FeedbackFlow reduceScope = new FeedbackFlow();

            public FeedbackFlow() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, LabelCache labelCache) {
                alarmMulticaster.growPayload(labelCache);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (LabelCache) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/FlexMaterializer;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Lcom/goldenboot/saga/zone/FlexMaterializer;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$LayerUseCase */
        public static final class LayerUseCase extends Lambda implements IconExporter {
            public static final LayerUseCase reduceScope = new LayerUseCase();

            public LayerUseCase() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, FlexMaterializer flexMaterializer) {
                alarmMulticaster.notifyMessage(flexMaterializer);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (FlexMaterializer) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/ContentRepository;", "evictLayout", "()Lcom/goldenboot/saga/zone/ContentRepository;"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$PluginInterpreter */
        public static final class PluginInterpreter extends Lambda implements ElevationNode {
            public static final PluginInterpreter reduceScope = new PluginInterpreter();

            public PluginInterpreter() {
                super(0);
            }

            @Override // com.goldenboot.saga.zone.ElevationNode
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final ContentRepository invoke() {
                return new ContentRepository(true, 0, 2, null);
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/InitMerger;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Lcom/goldenboot/saga/zone/InitMerger;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$ScopedMigration */
        public static final class ScopedMigration extends Lambda implements IconExporter {
            public static final ScopedMigration reduceScope = new ScopedMigration();

            public ScopedMigration() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, InitMerger initMerger) {
                alarmMulticaster.releaseHeader(initMerger);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (InitMerger) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/AlarmMulticaster;", "Lcom/goldenboot/saga/zone/StateMediator;", "it", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/AlarmMulticaster;Lcom/goldenboot/saga/zone/StateMediator;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: com.goldenboot.saga.zone.AlarmMulticaster$ActivityMutator$StylusConverter */
        public static final class StylusConverter extends Lambda implements IconExporter {
            public static final StylusConverter reduceScope = new StylusConverter();

            public StylusConverter() {
                super(2);
            }

            public final void evictLayout(AlarmMulticaster alarmMulticaster, StateMediator stateMediator) {
                alarmMulticaster.updateTimer(stateMediator);
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                evictLayout((AlarmMulticaster) obj, (StateMediator) obj2);
                return DpadBuilder.evictLayout;
            }
        }

        private Companion() {
        }

        public final ElevationNode applyTask() {
            return VirtualConstructor;
        }

        public final IconExporter clipOrigin() {
            return SetModifier;
        }

        public final IconExporter detachStream() {
            return SetLayoutDirection;
        }

        public final ElevationNode evictLayout() {
            return Constructor;
        }

        public final IconExporter flushSample() {
            return SetResolvedCompositionLocals;
        }

        public final IconExporter growPayload() {
            return SetCompositeKeyHash;
        }

        public final IconExporter injectMetric() {
            return SetDensity;
        }

        public final IconExporter releaseHeader() {
            return SetMeasurePolicy;
        }

        public final IconExporter updateTimer() {
            return SetViewConfiguration;
        }
    }

    /* renamed from: connectJob */
    int getCompositeKeyHash();

    /* renamed from: connectPatch */
    FlexMaterializer getMeasurePolicy();

    void drawField(androidx.compose.ui.RemoteCallback remoteCallback);

    /* renamed from: evictLayout */
    androidx.compose.ui.RemoteCallback get_modifier();

    void flushSample(int i);

    BackgroundCollection getDensity();

    LabelCache getLayoutDirection();

    InitMerger getViewConfiguration();

    void growPayload(LabelCache labelCache);

    void injectMetric(BackgroundCollection backgroundCollection);

    void notifyMessage(FlexMaterializer flexMaterializer);

    /* renamed from: purgeNode */
    StateMediator getCompositionLocalMap();

    void releaseHeader(InitMerger initMerger);

    void updateTimer(StateMediator stateMediator);
}

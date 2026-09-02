package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.RowFacilitator;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CachedTranslator implements ProducerManager {
    public final VibrationAggregator clipOrigin;
    public final FocusInitializer detachStream;
    public final CustomState evictLayout;
    public final RowFacilitator flushSample;
    public final LongPressArbitrator growPayload;
    public final ScaleRing injectMetric;
    public final ElevationNode releaseHeader;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends AnimBroadcaster {
        public /* synthetic */ Object attachConfig;
        public boolean connectPatch;
        public int inflateAdapter;
        public Object notifyMessage;
        public Object reduceScope;

        public ActivityMutator(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            this.attachConfig = obj;
            this.inflateAdapter |= Integer.MIN_VALUE;
            return CachedTranslator.this.evictLayout(null, this);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends AnimBroadcaster {
        public Object attachConfig;
        public Object connectPatch;
        public Object notifyMessage;
        public int purgeNode;
        public Object reduceScope;
        public /* synthetic */ Object resetDelta;

        public BounceHandler(ServiceRegulator serviceRegulator) {
            super(serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            this.resetDelta = obj;
            this.purgeNode |= Integer.MIN_VALUE;
            return CachedTranslator.this.growPayload(null, this);
        }
    }

    public CachedTranslator(CustomState fileSystem, LongPressArbitrator path, ScaleRing serializer, FocusInitializer coordinator, ElevationNode onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.evictLayout = fileSystem;
        this.growPayload = path;
        this.injectMetric = serializer;
        this.detachStream = coordinator;
        this.releaseHeader = onClose;
        this.clipOrigin = new VibrationAggregator(false);
        this.flushSample = StylusListener.growPayload(false, 1, null);
    }

    public final void clipOrigin() {
        if (this.clipOrigin.evictLayout()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // com.goldenboot.saga.zone.NavBarPipeline
    public void close() {
        this.clipOrigin.growPayload(true);
        this.releaseHeader.invoke();
    }

    @Override // com.goldenboot.saga.zone.ProducerManager
    public FocusInitializer detachStream() {
        return this.detachStream;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(5:43|44|45|46|(1:48)(1:49))|14|15|16|(2:(1:19)|20)(2:22|23)))|54|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.goldenboot.saga.zone.ConfigListener] */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // com.goldenboot.saga.zone.ProducerManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object evictLayout(ConfigListener configListener, ServiceRegulator serviceRegulator) {
        ActivityMutator activityMutator;
        int i;
        Throwable th;
        NavBarPipeline navBarPipeline;
        CachedTranslator cachedTranslator;
        ?? r9;
        Object obj;
        try {
            if (serviceRegulator instanceof ActivityMutator) {
                activityMutator = (ActivityMutator) serviceRegulator;
                int i2 = activityMutator.inflateAdapter;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    activityMutator.inflateAdapter = i2 - Integer.MIN_VALUE;
                    Object obj2 = activityMutator.attachConfig;
                    Object releaseHeader = RotateReceiver.releaseHeader();
                    i = activityMutator.inflateAdapter;
                    if (i != 0) {
                        ColumnForger.growPayload(obj2);
                        clipOrigin();
                        ?? growPayload = RowFacilitator.ActivityMutator.growPayload(this.flushSample, null, 1, null);
                        TrackballOrchestrator trackballOrchestrator = new TrackballOrchestrator(this.evictLayout, this.growPayload, this.injectMetric);
                        try {
                            Boolean evictLayout = WindowRevision.evictLayout(growPayload);
                            activityMutator.reduceScope = this;
                            activityMutator.notifyMessage = trackballOrchestrator;
                            activityMutator.connectPatch = growPayload;
                            activityMutator.inflateAdapter = 1;
                            Object invoke = configListener.invoke(trackballOrchestrator, evictLayout, activityMutator);
                            if (invoke == releaseHeader) {
                                return releaseHeader;
                            }
                            cachedTranslator = this;
                            r9 = growPayload == true ? 1 : 0;
                            obj = invoke;
                            navBarPipeline = trackballOrchestrator;
                        } catch (Throwable th2) {
                            th = th2;
                            navBarPipeline = trackballOrchestrator;
                            obj2 = growPayload;
                            navBarPipeline.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r9 = activityMutator.connectPatch;
                        navBarPipeline = (NavBarPipeline) activityMutator.notifyMessage;
                        cachedTranslator = (CachedTranslator) activityMutator.reduceScope;
                        try {
                            ColumnForger.growPayload(obj2);
                            obj = obj2;
                        } catch (Throwable th3) {
                            obj2 = r9;
                            this = cachedTranslator;
                            th = th3;
                            try {
                                navBarPipeline.close();
                                throw th;
                            } catch (Throwable th4) {
                                SubscriberDrain.evictLayout(th, th4);
                                throw th;
                            }
                        }
                    }
                    navBarPipeline.close();
                    th = null;
                    if (th != null) {
                        if (r9 != false) {
                            RowFacilitator.ActivityMutator.injectMetric(cachedTranslator.flushSample, null, 1, null);
                        }
                        return obj;
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        obj2 = r9;
                        this = cachedTranslator;
                        if (obj2 != null) {
                            RowFacilitator.ActivityMutator.injectMetric(this.flushSample, null, 1, null);
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            navBarPipeline.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        activityMutator = new ActivityMutator(serviceRegulator);
        Object obj22 = activityMutator.attachConfig;
        Object releaseHeader2 = RotateReceiver.releaseHeader();
        i = activityMutator.inflateAdapter;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(9:(2:3|(12:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(1:21)|22|23|24)(1:26))(2:37|38))(1:39))(2:68|(3:70|(1:72)|47)(2:73|74))|40|41|42|43|44|45|(6:48|14|15|16|17|(0)(0))|47))|40|41|42|43|44|45|(0)|47)|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1 A[Catch: all -> 0x00e1, IOException -> 0x00e4, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:19:0x00d1, B:21:0x00d9, B:22:0x00e7, B:26:0x00ef, B:33:0x00fd, B:36:0x00fa), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[Catch: all -> 0x00e1, IOException -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:19:0x00d1, B:21:0x00d9, B:22:0x00e7, B:26:0x00ef, B:33:0x00fd, B:36:0x00fa), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.goldenboot.saga.zone.CachedTranslator$BounceHandler, com.goldenboot.saga.zone.ServiceRegulator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.goldenboot.saga.zone.CustomState] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.goldenboot.saga.zone.LongPressArbitrator] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.goldenboot.saga.zone.RowFacilitator] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.goldenboot.saga.zone.CustomState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.goldenboot.saga.zone.RowFacilitator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.goldenboot.saga.zone.IconExporter] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.goldenboot.saga.zone.ProducerManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object growPayload(IconExporter iconExporter, ServiceRegulator serviceRegulator) {
        ?? r0;
        Object releaseHeader;
        int i;
        ?? r11;
        ?? r10;
        CachedTranslator cachedTranslator;
        ?? r2;
        LongPressArbitrator longPressArbitrator;
        LongPressArbitrator reduceScope;
        GroupBuffer groupBuffer;
        Throwable th;
        NavBarPipeline navBarPipeline;
        CachedTranslator cachedTranslator2;
        RowFacilitator rowFacilitator;
        LongPressArbitrator longPressArbitrator2;
        try {
            try {
                try {
                    try {
                        if (serviceRegulator instanceof BounceHandler) {
                            BounceHandler bounceHandler = (BounceHandler) serviceRegulator;
                            int i2 = bounceHandler.purgeNode;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                bounceHandler.purgeNode = i2 - Integer.MIN_VALUE;
                                r0 = bounceHandler;
                                Object obj = r0.resetDelta;
                                releaseHeader = RotateReceiver.releaseHeader();
                                i = r0.purgeNode;
                                if (i != 0) {
                                    ColumnForger.growPayload(obj);
                                    clipOrigin();
                                    LongPressArbitrator connectJob = this.growPayload.connectJob();
                                    if (connectJob == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    this.evictLayout.growPayload(connectJob, false);
                                    ?? r22 = this.flushSample;
                                    r0.reduceScope = this;
                                    r0.notifyMessage = iconExporter;
                                    r0.connectPatch = connectJob;
                                    r0.attachConfig = r22;
                                    r0.purgeNode = 1;
                                    if (r22.injectMetric(null, r0) != releaseHeader) {
                                        r2 = iconExporter;
                                        longPressArbitrator = connectJob;
                                        r11 = r22;
                                    }
                                    return releaseHeader;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    navBarPipeline = (NavBarPipeline) r0.attachConfig;
                                    LongPressArbitrator longPressArbitrator3 = (LongPressArbitrator) r0.connectPatch;
                                    rowFacilitator = (RowFacilitator) r0.notifyMessage;
                                    cachedTranslator2 = (CachedTranslator) r0.reduceScope;
                                    try {
                                        ColumnForger.growPayload(obj);
                                        longPressArbitrator2 = longPressArbitrator3;
                                        DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                                        try {
                                            navBarPipeline.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (cachedTranslator2.evictLayout.flushSample(longPressArbitrator2)) {
                                            cachedTranslator2.evictLayout.evictLayout(longPressArbitrator2, cachedTranslator2.growPayload);
                                        }
                                        DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                                        rowFacilitator.growPayload(null);
                                        return DpadBuilder.evictLayout;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            navBarPipeline.close();
                                        } catch (Throwable th4) {
                                            SubscriberDrain.evictLayout(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                RowFacilitator rowFacilitator2 = (RowFacilitator) r0.attachConfig;
                                longPressArbitrator = (LongPressArbitrator) r0.connectPatch;
                                IconExporter iconExporter2 = (IconExporter) r0.notifyMessage;
                                CachedTranslator cachedTranslator3 = (CachedTranslator) r0.reduceScope;
                                ColumnForger.growPayload(obj);
                                r11 = rowFacilitator2;
                                this = cachedTranslator3;
                                r2 = iconExporter2;
                                reduceScope = longPressArbitrator.reduceScope(this.growPayload.applyTask() + ".tmp");
                                this.evictLayout.clipOrigin(reduceScope, false);
                                groupBuffer = new GroupBuffer(this.evictLayout, reduceScope, this.injectMetric);
                                r0.reduceScope = this;
                                r0.notifyMessage = r11;
                                r0.connectPatch = reduceScope;
                                r0.attachConfig = groupBuffer;
                                r0.purgeNode = 2;
                                if (r2.invoke(groupBuffer, r0) != releaseHeader) {
                                    cachedTranslator2 = this;
                                    rowFacilitator = r11;
                                    navBarPipeline = groupBuffer;
                                    longPressArbitrator2 = reduceScope;
                                    DpadBuilder dpadBuilder3 = DpadBuilder.evictLayout;
                                    navBarPipeline.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return releaseHeader;
                            }
                        }
                        r0.reduceScope = this;
                        r0.notifyMessage = r11;
                        r0.connectPatch = reduceScope;
                        r0.attachConfig = groupBuffer;
                        r0.purgeNode = 2;
                        if (r2.invoke(groupBuffer, r0) != releaseHeader) {
                        }
                        return releaseHeader;
                    } catch (Throwable th5) {
                        th = th5;
                        navBarPipeline = groupBuffer;
                        navBarPipeline.close();
                        throw th;
                    }
                    this.evictLayout.clipOrigin(reduceScope, false);
                    groupBuffer = new GroupBuffer(this.evictLayout, reduceScope, this.injectMetric);
                } catch (IOException e) {
                    cachedTranslator = this;
                    e = e;
                    r10 = reduceScope;
                    r11 = r11;
                    if (!cachedTranslator.evictLayout.flushSample(r10)) {
                        throw e;
                    }
                    try {
                        cachedTranslator.evictLayout.releaseHeader(r10);
                        throw e;
                    } catch (IOException unused) {
                        throw e;
                    }
                }
                reduceScope = longPressArbitrator.reduceScope(this.growPayload.applyTask() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r11.growPayload(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (IOException e2) {
            e = e2;
            r11 = releaseHeader;
            cachedTranslator = r0;
            r10 = iconExporter;
        }
        r0 = new BounceHandler(serviceRegulator);
        Object obj2 = r0.resetDelta;
        releaseHeader = RotateReceiver.releaseHeader();
        i = r0.purgeNode;
    }
}

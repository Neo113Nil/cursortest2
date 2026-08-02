package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020#\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0005\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/miteksystems/misnap/controller/a/m;", "Lcom/miteksystems/misnap/controller/a/a0;", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/controller/a/b0;", "a", "(Lcom/miteksystems/misnap/core/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face;", "settings", "Lkotlin/Function0;", "", util.h.xy.cb.b.f1091, "Lkotlin/jvm/functions/Function0;", "currentTime", "", "c", "Z", "requireRawIqaResults", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer;", "d", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer;", "misnapFaceAnalyzer", "Lcom/miteksystems/misnap/controller/a/z;", "e", "Lcom/miteksystems/misnap/controller/a/z;", "trigger", "Lcom/miteksystems/misnap/controller/a/y;", "f", "Lcom/miteksystems/misnap/controller/a/y;", "timerState", "g", "J", "timerStart", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "<init>", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/miteksystems/misnap/face/MiSnapFaceAnalyzer;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class m implements com.miteksystems.misnap.controller.a.a0 {
    private final com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face Camera2StreamConfigurationMap;
    private final com.miteksystems.misnap.face.MiSnapFaceAnalyzer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function0<java.lang.Long> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.miteksystems.misnap.controller.a.z getHighSpeedVideoSizes;
    private com.miteksystems.misnap.controller.a.y getInputFormats;
    private long getInputSizeshNQ4ISI;

    public m(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face face, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Long> function0, boolean z, com.miteksystems.misnap.face.MiSnapFaceAnalyzer miSnapFaceAnalyzer) {
        com.miteksystems.misnap.controller.a.z uVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(face, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapFaceAnalyzer, "");
        this.Camera2StreamConfigurationMap = face;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = miSnapFaceAnalyzer;
        int i = com.miteksystems.misnap.controller.a.m.b.f3991a[com.miteksystems.misnap.face.FaceAnalysisSettings.requireTrigger(face).ordinal()];
        if (i == 1) {
            uVar = new com.miteksystems.misnap.controller.a.u();
        } else if (i == 2) {
            uVar = new com.miteksystems.misnap.controller.a.x();
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            uVar = new com.miteksystems.misnap.controller.a.v();
        }
        this.getHighSpeedVideoSizes = uVar;
        this.getInputFormats = com.miteksystems.misnap.controller.a.y.NONE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r2 != 3) goto L25;
     */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ java.lang.Object a(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation continuation) {
        com.miteksystems.misnap.core.UserAction userAction;
        com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed analyze = this.getHighResolutionOutputSizeshNQ4ISI.analyze(frame);
        if (!(analyze instanceof com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed)) {
            if (analyze instanceof com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure) {
                throw new com.miteksystems.misnap.controller.a.c(new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.FaceAnalysis((com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Failure) analyze));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed processed = analyze;
        java.util.List a2 = com.miteksystems.misnap.controller.a.n.a(com.miteksystems.misnap.face.FaceAnalysisSettings.getPrioritizedIqaChecks(this.Camera2StreamConfigurationMap.advanced), processed.getPassedFaceChecks());
        com.miteksystems.misnap.core.UserAction userAction2 = com.miteksystems.misnap.core.UserAction.NONE.INSTANCE;
        if (a2.isEmpty()) {
            int i = com.miteksystems.misnap.controller.a.m.b.b[this.getInputFormats.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    long longValue = this.getHighSpeedVideoFpsRanges.invoke().longValue();
                    long j = this.getInputSizeshNQ4ISI;
                    com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face face = this.Camera2StreamConfigurationMap;
                    if (longValue > j + com.miteksystems.misnap.face.FaceAnalysisSettings.getTriggerDelay(face.advanced, com.miteksystems.misnap.face.FaceAnalysisSettings.requireTrigger(face))) {
                        this.getInputFormats = com.miteksystems.misnap.controller.a.y.COMPLETE;
                    }
                }
                userAction2 = this.getHighSpeedVideoSizes.a(frame, processed);
            } else {
                this.getInputFormats = com.miteksystems.misnap.controller.a.y.RUNNING;
                this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.invoke().longValue();
            }
            userAction2 = com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.INSTANCE;
        } else {
            com.miteksystems.misnap.core.FaceIqaCheck faceIqaCheck = (com.miteksystems.misnap.core.FaceIqaCheck) kotlin.collections.CollectionsKt.firstOrNull(a2);
            if (faceIqaCheck == null || (userAction = com.miteksystems.misnap.controller.a.n.a(faceIqaCheck)) == null) {
                userAction = com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE;
            }
            userAction2 = userAction;
            this.getInputFormats = com.miteksystems.misnap.controller.a.y.NONE;
            this.getInputSizeshNQ4ISI = 0L;
            this.getHighSpeedVideoSizes.a();
        }
        com.miteksystems.misnap.core.UserAction userAction3 = userAction2;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
        java.util.Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.miteksystems.misnap.controller.a.n.a((com.miteksystems.misnap.core.FaceIqaCheck) it.next()));
        }
        return new com.miteksystems.misnap.controller.a.o(userAction3, this.getHighSpeedVideoFpsRangesFor ? processed.getFaceIqasResult() : null, arrayList, processed.getFaceBoundingBox(), processed.getLicenseExpired());
    }

    public /* synthetic */ m(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face face, java.lang.String str, kotlin.jvm.functions.Function0 function0, boolean z, com.miteksystems.misnap.face.MiSnapFaceAnalyzer miSnapFaceAnalyzer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(face, str, (i & 4) != 0 ? com.miteksystems.misnap.controller.a.m.a.getHighSpeedVideoFpsRangesFor : function0, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new com.miteksystems.misnap.face.MiSnapFaceAnalyzer(face, str) : miSnapFaceAnalyzer);
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.getHighResolutionOutputSizeshNQ4ISI.release();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {
        public static final com.miteksystems.misnap.controller.a.m.a getHighSpeedVideoFpsRangesFor = new com.miteksystems.misnap.controller.a.m.a();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }

        a() {
            super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3991a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3991a = iArr;
            int[] iArr2 = new int[com.miteksystems.misnap.controller.a.y.values().length];
            try {
                iArr2[com.miteksystems.misnap.controller.a.y.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.miteksystems.misnap.controller.a.y.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.miteksystems.misnap.controller.a.y.COMPLETE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }
}

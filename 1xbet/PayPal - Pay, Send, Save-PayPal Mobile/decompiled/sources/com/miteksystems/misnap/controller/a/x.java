package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0005\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\f\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002J\u0018\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u000bH\u0016R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/miteksystems/misnap/controller/a/x;", "Lcom/miteksystems/misnap/controller/a/z;", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed;", "misnapFaceAnalyzerResult", "Lcom/miteksystems/misnap/controller/a/x$a;", "a", "nextState", "Lcom/miteksystems/misnap/controller/a/x$b;", "Lcom/miteksystems/misnap/core/UserAction;", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "Lcom/miteksystems/misnap/controller/a/x$a;", "getCurrentFaceState", "()Lcom/miteksystems/misnap/controller/a/x$a;", "setCurrentFaceState", "(Lcom/miteksystems/misnap/controller/a/x$a;)V", "currentFaceState", "<init>", "()V", util.h.xy.cb.b.f1091, "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class x implements com.miteksystems.misnap.controller.a.z {
    private com.miteksystems.misnap.controller.a.x.a Camera2StreamConfigurationMap = com.miteksystems.misnap.controller.a.x.a.UNDEFINED;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/miteksystems/misnap/controller/a/x$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", util.h.xy.cb.b.f1091, "c"}, k = 1, mv = {1, 8, 0})
    public enum a {
        UNDEFINED,
        SMILING,
        NEUTRAL
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/miteksystems/misnap/controller/a/x$b;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0})
    enum b {
        STARTED_SMILING,
        STOPPED_SMILING,
        TO_SMILING,
        TO_NEUTRAL,
        TO_UNDEFINED
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public final /* synthetic */ com.miteksystems.misnap.core.UserAction a(com.miteksystems.misnap.core.Frame frame, com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed misnapFaceAnalyzerResult) {
        com.miteksystems.misnap.controller.a.x.b bVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(misnapFaceAnalyzerResult, "");
        com.miteksystems.misnap.controller.a.x.a aVar = misnapFaceAnalyzerResult.getPassedFaceChecks().contains(com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_SMILING) ? com.miteksystems.misnap.controller.a.x.a.SMILING : com.miteksystems.misnap.controller.a.x.a.NEUTRAL;
        com.miteksystems.misnap.controller.a.x.a aVar2 = this.Camera2StreamConfigurationMap;
        int[] iArr = com.miteksystems.misnap.controller.a.x.c.f4010a;
        int i = iArr[aVar2.ordinal()];
        if (i == 1) {
            int i2 = iArr[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bVar = com.miteksystems.misnap.controller.a.x.b.TO_SMILING;
                }
                bVar = com.miteksystems.misnap.controller.a.x.b.TO_NEUTRAL;
            }
            bVar = com.miteksystems.misnap.controller.a.x.b.TO_UNDEFINED;
        } else if (i == 2) {
            int i3 = iArr[aVar.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bVar = com.miteksystems.misnap.controller.a.x.b.STARTED_SMILING;
                }
                bVar = com.miteksystems.misnap.controller.a.x.b.TO_NEUTRAL;
            }
            bVar = com.miteksystems.misnap.controller.a.x.b.TO_UNDEFINED;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            int i4 = iArr[aVar.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    bVar = com.miteksystems.misnap.controller.a.x.b.TO_SMILING;
                } else {
                    bVar = com.miteksystems.misnap.controller.a.x.b.STOPPED_SMILING;
                }
            }
            bVar = com.miteksystems.misnap.controller.a.x.b.TO_UNDEFINED;
        }
        this.Camera2StreamConfigurationMap = aVar;
        int i5 = com.miteksystems.misnap.controller.a.x.c.b[bVar.ordinal()];
        return (i5 == 1 || i5 == 2) ? com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.INSTANCE : i5 != 3 ? com.miteksystems.misnap.core.UserAction.NONE.INSTANCE : com.miteksystems.misnap.core.UserAction.Face.SMILE.INSTANCE;
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public final /* synthetic */ void a() {
        this.Camera2StreamConfigurationMap = com.miteksystems.misnap.controller.a.x.a.UNDEFINED;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4010a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.miteksystems.misnap.controller.a.x.a.values().length];
            try {
                iArr[com.miteksystems.misnap.controller.a.x.a.UNDEFINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.controller.a.x.a.NEUTRAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.controller.a.x.a.SMILING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f4010a = iArr;
            int[] iArr2 = new int[com.miteksystems.misnap.controller.a.x.b.values().length];
            try {
                iArr2[com.miteksystems.misnap.controller.a.x.b.STARTED_SMILING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.miteksystems.misnap.controller.a.x.b.TO_SMILING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.miteksystems.misnap.controller.a.x.b.TO_NEUTRAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }
}

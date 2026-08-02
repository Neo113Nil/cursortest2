package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u001e\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u001a*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/miteksystems/misnap/core/FaceIqaCheck;", "Lcom/miteksystems/misnap/core/UserAction;", "a", "faceIqaCheck", "", "Lcom/miteksystems/misnap/face/MiSnapFaceAnalyzer$Result$Processed$FaceCheck;", "passedFaceIqaChecks", "", "rankedIqaChecks", "passedFaceChecks", util.h.xy.cb.b.f1091, "controller_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class n {
    public static final /* synthetic */ com.miteksystems.misnap.core.UserAction a(com.miteksystems.misnap.core.FaceIqaCheck faceIqaCheck) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceIqaCheck, "");
        switch (com.miteksystems.misnap.controller.a.n.a.f3992a[faceIqaCheck.ordinal()]) {
            case 1:
                return com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE;
            case 2:
                return com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE;
            case 3:
                return com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE;
            case 4:
                return com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE;
            case 5:
                return com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE;
            case 6:
                return com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final /* synthetic */ java.util.List a(java.util.List list, java.util.List list2) {
        com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck faceCheck;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            switch (com.miteksystems.misnap.controller.a.n.a.f3992a[((com.miteksystems.misnap.core.FaceIqaCheck) obj).ordinal()]) {
                case 1:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_FOUND;
                    break;
                case 2:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_SINGLE_FACE_DETECTED;
                    break;
                case 3:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MAX_ANGLE;
                    break;
                case 4:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MIN_FILL;
                    break;
                case 5:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_FACE_WITHIN_MIN_PADDING;
                    break;
                case 6:
                    faceCheck = com.miteksystems.misnap.face.MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_WITH_EYES_OPEN;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!list2.contains(faceCheck)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3992a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.FaceIqaCheck.values().length];
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.FACE_PRESENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.SINGLE_FACE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.GOOD_ANGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.FACE_CLOSE_ENOUGH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.FACE_WITHIN_BOUNDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.FaceIqaCheck.EYES_OPEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f3992a = iArr;
        }
    }
}

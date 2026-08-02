package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentIqaCheck;", "Lcom/miteksystems/misnap/core/UserAction;", "a", "(Lcom/miteksystems/misnap/core/DocumentIqaCheck;)Lcom/miteksystems/misnap/core/UserAction;"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class i {
    public static final /* synthetic */ com.miteksystems.misnap.core.UserAction a(com.miteksystems.misnap.core.DocumentIqaCheck documentIqaCheck) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentIqaCheck, "");
        switch (com.miteksystems.misnap.controller.a.i.a.f3988a[documentIqaCheck.ordinal()]) {
            case 1:
            case 12:
                return com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE;
            case 2:
                return com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE;
            case 3:
                return com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE;
            case 4:
                return com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE;
            case 5:
                return com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE;
            case 6:
                return com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE;
            case 7:
                return com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE;
            case 8:
                return com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE;
            case 9:
                return com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE;
            case 10:
                return com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE;
            case 11:
                return com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.util.List a(java.util.List list, java.util.List list2) {
        com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck documentCheck;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            switch (com.miteksystems.misnap.controller.a.i.a.f3988a[((com.miteksystems.misnap.core.DocumentIqaCheck) obj).ordinal()]) {
                case 1:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_FOUR_CORNER_CONFIDENCE;
                    if (!list2.contains(documentCheck)) {
                        arrayList.add(obj);
                    }
                case 2:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_SHARPNESS;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 3:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_BRIGHTNESS;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 4:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_BRIGHTNESS;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 5:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_PADDING;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 6:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_HORIZONTAL_FILL;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 7:
                    if (list2.contains(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_SKEW_ANGLE) && list2.contains(com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_ROTATION_ANGLE)) {
                    }
                    arrayList.add(obj);
                    break;
                case 8:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_BUSY_BACKGROUND;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 9:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_CONTRAST;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 10:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_CORRECT_DOCUMENT;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 11:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_GLARE;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                case 12:
                    documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_EXTRACTION_CONFIDENCE;
                    if (!list2.contains(documentCheck)) {
                    }
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ boolean a(com.miteksystems.misnap.core.DocumentIqaCheck documentIqaCheck, java.util.List list) {
        com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck documentCheck;
        int i = com.miteksystems.misnap.controller.a.i.a.f3988a[documentIqaCheck.ordinal()];
        if (i == 2) {
            documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_SHARPNESS;
        } else if (i == 3) {
            documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_BRIGHTNESS;
        } else if (i == 4) {
            documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_BRIGHTNESS;
        } else if (i == 11) {
            documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MAX_GLARE;
        } else {
            if (i != 12) {
                return false;
            }
            documentCheck = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck.IS_WITHIN_MIN_EXTRACTION_CONFIDENCE;
        }
        return list.contains(documentCheck);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3988a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.DocumentIqaCheck.values().length];
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.FOUR_CORNER_CONFIDENCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.SHARP_ENOUGH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.NOT_TOO_DARK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.NOT_TOO_BRIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.WITHIN_BOUNDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.CLOSE_ENOUGH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.GOOD_ANGLE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.PLAIN_BACKGROUND.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.GOOD_CONTRAST.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.CORRECT_DOCUMENT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.NO_GLARE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.miteksystems.misnap.core.DocumentIqaCheck.EXTRACTION_CONFIDENCE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            f3988a = iArr;
        }
    }
}

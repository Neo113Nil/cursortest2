package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/miteksystems/misnap/controller/a/h;", "Lcom/miteksystems/misnap/controller/a/a0;", "Landroid/content/Context;", "activityContext", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "settings", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "", "requireRawIqaResults", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer;", "analyzer", "<init>", "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;Ljava/lang/String;ZLcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer;)V", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/controller/a/b0;", "a", "(Lcom/miteksystems/misnap/core/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "()V", "getHighSpeedVideoSizes", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class h implements com.miteksystems.misnap.controller.a.a0 {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.miteksystems.misnap.document.MiSnapDocumentAnalyzer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document Camera2StreamConfigurationMap;

    public h(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document document, java.lang.String str, boolean z, com.miteksystems.misnap.document.MiSnapDocumentAnalyzer miSnapDocumentAnalyzer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapDocumentAnalyzer, "");
        this.Camera2StreamConfigurationMap = document;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = miSnapDocumentAnalyzer;
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ java.lang.Object a(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation continuation) {
        com.miteksystems.misnap.core.UserAction userAction;
        com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result analyze$default = com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.analyze$default(this.getHighSpeedVideoFpsRanges, frame, null, 2, null);
        if (analyze$default instanceof com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure) {
            throw new com.miteksystems.misnap.controller.a.c(new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.DocumentAnalysis((com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Failure) analyze$default));
        }
        if (!(analyze$default instanceof com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed processed = (com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed) analyze$default;
        java.util.List a2 = com.miteksystems.misnap.controller.a.i.a(com.miteksystems.misnap.document.DocumentAnalysisSettings.getPrioritizedIqaChecks(this.Camera2StreamConfigurationMap.advanced), processed.getPassedDocumentChecks());
        com.miteksystems.misnap.core.UserAction userAction2 = com.miteksystems.misnap.core.UserAction.NONE.INSTANCE;
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        if (!a2.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : a2) {
                if (!com.miteksystems.misnap.controller.a.i.a((com.miteksystems.misnap.core.DocumentIqaCheck) obj, processed.getSkippedDocumentChecks())) {
                    arrayList.add(obj);
                }
            }
            com.miteksystems.misnap.core.DocumentIqaCheck documentIqaCheck = (com.miteksystems.misnap.core.DocumentIqaCheck) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
            if (documentIqaCheck == null || (userAction = com.miteksystems.misnap.controller.a.i.a(documentIqaCheck)) == null) {
                userAction = com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE;
            }
            emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                emptyList.add(com.miteksystems.misnap.controller.a.i.a((com.miteksystems.misnap.core.DocumentIqaCheck) it.next()));
            }
            userAction2 = userAction;
        }
        if (com.miteksystems.misnap.document.DocumentAnalysisSettings.requireDocType(this.Camera2StreamConfigurationMap.advanced).isMrzDocument() && com.miteksystems.misnap.document.DocumentAnalysisSettings.getDocumentExtractionRequirement(this.Camera2StreamConfigurationMap) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED) {
            com.miteksystems.misnap.core.DocumentExtraction extraction = processed.getExtraction();
            if ((extraction != null ? extraction.getMrz() : null) == null && kotlin.jvm.internal.Intrinsics.areEqual(userAction2, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                userAction2 = com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE;
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(userAction2, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && emptyList.isEmpty()) {
            emptyList = kotlin.collections.CollectionsKt.listOf(userAction2);
        }
        if (com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldPrioritizeDocumentExtractionOverImageQuality(this.Camera2StreamConfigurationMap)) {
            com.miteksystems.misnap.core.DocumentExtraction extraction2 = processed.getExtraction();
            if ((extraction2 != null ? extraction2.getMrz() : null) != null) {
                userAction2 = com.miteksystems.misnap.core.UserAction.NONE.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(userAction2, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                userAction2 = com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(userAction2, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
        }
        java.util.List list = emptyList;
        if (kotlin.jvm.internal.Intrinsics.areEqual(userAction2, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && com.miteksystems.misnap.document.DocumentAnalysisSettings.requireTrigger(this.Camera2StreamConfigurationMap) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL && com.miteksystems.misnap.document.DocumentAnalysisSettings.shouldEnableEnhancedManual(this.Camera2StreamConfigurationMap)) {
            userAction2 = com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE;
        }
        return new com.miteksystems.misnap.controller.a.j(userAction2, this.getHighSpeedVideoSizes ? processed.getDocumentIqasResult() : null, list, processed.getFourCorners(), processed.getGlareCorners(), com.miteksystems.misnap.document.DocumentAnalysisSettings.getDocumentExtractionRequirement(this.Camera2StreamConfigurationMap) != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.NONE ? processed.getExtraction() : null, null, processed.getLicenseExpired(), 64, null);
    }

    public /* synthetic */ h(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document document, java.lang.String str, boolean z, com.miteksystems.misnap.document.MiSnapDocumentAnalyzer miSnapDocumentAnalyzer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, document, str, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new com.miteksystems.misnap.document.MiSnapDocumentAnalyzer(context, document, str) : miSnapDocumentAnalyzer);
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.getHighSpeedVideoFpsRanges.release();
    }
}

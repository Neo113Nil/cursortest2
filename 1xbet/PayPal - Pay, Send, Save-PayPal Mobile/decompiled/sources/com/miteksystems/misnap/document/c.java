package com.miteksystems.misnap.document;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001a\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u001e\u0010'"}, d2 = {"Lcom/miteksystems/misnap/document/c;", "", "", "Lcom/miteksystems/misnap/document/MiSnapDocumentAnalyzer$Result$Processed$DocumentCheck;", "passedDocumentChecks", "skippedDocumentChecks", "", "", "fourCorners", "glareCorners", "Lcom/miteksystems/misnap/core/Mrz;", "extractedData", "Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "extractedDataCorners", "<init>", "(Ljava/util/List;Ljava/util/List;[[I[[ILcom/miteksystems/misnap/core/Mrz;Lcom/miteksystems/misnap/core/ExtractedDataCorners;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", util.h.xy.cb.b.f1091, "f", "c", "[[I", "()[[I", "d", "Lcom/miteksystems/misnap/core/Mrz;", "()Lcom/miteksystems/misnap/core/Mrz;", "Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "()Lcom/miteksystems/misnap/core/ExtractedDataCorners;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.List<com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> passedDocumentChecks;

    /* renamed from: b, reason: from kotlin metadata */
    private final java.util.List<com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> skippedDocumentChecks;

    /* renamed from: c, reason: from kotlin metadata */
    private final int[][] fourCorners;

    /* renamed from: d, reason: from kotlin metadata */
    private final int[][] glareCorners;

    /* renamed from: e, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.Mrz extractedData;

    /* renamed from: f, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.ExtractedDataCorners extractedDataCorners;

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(java.util.List<? extends com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> list, java.util.List<? extends com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> list2, int[][] iArr, int[][] iArr2, com.miteksystems.misnap.core.Mrz mrz, com.miteksystems.misnap.core.ExtractedDataCorners extractedDataCorners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr2, "");
        this.passedDocumentChecks = list;
        this.skippedDocumentChecks = list2;
        this.fourCorners = iArr;
        this.glareCorners = iArr2;
        this.extractedData = mrz;
        this.extractedDataCorners = extractedDataCorners;
    }

    public /* synthetic */ c(java.util.List list, java.util.List list2, int[][] iArr, int[][] iArr2, com.miteksystems.misnap.core.Mrz mrz, com.miteksystems.misnap.core.ExtractedDataCorners extractedDataCorners, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? new int[0][] : iArr, (i & 8) != 0 ? new int[0][] : iArr2, (i & 16) != 0 ? null : mrz, (i & 32) != 0 ? null : extractedDataCorners);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IqaAnalyzerResult(passedDocumentChecks=");
        sb.append(this.passedDocumentChecks);
        sb.append(", skippedDocumentChecks=");
        sb.append(this.skippedDocumentChecks);
        sb.append(", fourCorners=");
        sb.append(java.util.Arrays.toString(this.fourCorners));
        sb.append(", glareCorners=");
        sb.append(java.util.Arrays.toString(this.glareCorners));
        sb.append(", extractedData=");
        sb.append(this.extractedData);
        sb.append(", extractedDataCorners=");
        sb.append(this.extractedDataCorners);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.passedDocumentChecks.hashCode();
        int hashCode2 = this.skippedDocumentChecks.hashCode();
        int hashCode3 = java.util.Arrays.hashCode(this.fourCorners);
        int hashCode4 = java.util.Arrays.hashCode(this.glareCorners);
        com.miteksystems.misnap.core.Mrz mrz = this.extractedData;
        int hashCode5 = mrz == null ? 0 : mrz.hashCode();
        com.miteksystems.misnap.core.ExtractedDataCorners extractedDataCorners = this.extractedDataCorners;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (extractedDataCorners != null ? extractedDataCorners.hashCode() : 0);
    }

    public final java.util.List<com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> f() {
        return this.skippedDocumentChecks;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.document.c)) {
            return false;
        }
        com.miteksystems.misnap.document.c cVar = (com.miteksystems.misnap.document.c) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passedDocumentChecks, cVar.passedDocumentChecks) && kotlin.jvm.internal.Intrinsics.areEqual(this.skippedDocumentChecks, cVar.skippedDocumentChecks) && kotlin.jvm.internal.Intrinsics.areEqual(this.fourCorners, cVar.fourCorners) && kotlin.jvm.internal.Intrinsics.areEqual(this.glareCorners, cVar.glareCorners) && kotlin.jvm.internal.Intrinsics.areEqual(this.extractedData, cVar.extractedData) && kotlin.jvm.internal.Intrinsics.areEqual(this.extractedDataCorners, cVar.extractedDataCorners);
    }

    public final java.util.List<com.miteksystems.misnap.document.MiSnapDocumentAnalyzer.Result.Processed.DocumentCheck> e() {
        return this.passedDocumentChecks;
    }

    /* renamed from: d, reason: from getter */
    public final int[][] getGlareCorners() {
        return this.glareCorners;
    }

    /* renamed from: c, reason: from getter */
    public final int[][] getFourCorners() {
        return this.fourCorners;
    }

    /* renamed from: b, reason: from getter */
    public final com.miteksystems.misnap.core.ExtractedDataCorners getExtractedDataCorners() {
        return this.extractedDataCorners;
    }

    /* renamed from: a, reason: from getter */
    public final com.miteksystems.misnap.core.Mrz getExtractedData() {
        return this.extractedData;
    }
}

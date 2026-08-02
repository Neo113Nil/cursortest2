package com.discover.mpos.sdk.cardreader.entrypoint.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "", "candidateList", "", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "(Ljava/util/List;)V", "candidates", "", "currentCandidate", "getCurrentCandidate$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "setCurrentCandidate$mpos_sdk_card_reader_offlineRegularRelease", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;)V", "iterator", "", "clear", "", "hasCandidate", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "isEmpty", io.ktor.http.LinkHeader.Rel.Next, "resetIterations", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.model.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CandidateList {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate> f3008a;
    public java.util.Iterator<com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate> b;
    public com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate c;

    public /* synthetic */ CandidateList() {
        this(kotlin.collections.CollectionsKt.emptyList());
    }

    public CandidateList(java.util.List<com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.f3008a = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) kotlin.collections.CollectionsKt.sortedWith(list, new com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList.a()));
    }

    public final void a() {
        b();
        this.f3008a.clear();
    }

    private void b() {
        this.b = null;
        this.c = null;
    }

    public final boolean a(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.f3008a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.text.StringsKt.startsWith$default(((com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate) next).getAdfName(), str, false, 2, (java.lang.Object) null)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CandidateList(candidates=");
        sb.append(this.f3008a);
        return sb.toString();
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", util.h.xy.cb.b.f1091, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.model.b$a */
    public static final class a<T> implements java.util.Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate) t).getPriority()), java.lang.Integer.valueOf(((com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate) t2).getPriority()));
        }
    }
}

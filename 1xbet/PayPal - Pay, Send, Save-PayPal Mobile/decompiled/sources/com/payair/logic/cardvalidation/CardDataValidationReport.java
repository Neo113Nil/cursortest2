package com.payair.logic.cardvalidation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/payair/logic/cardvalidation/CardDataValidationReport;", "", "Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "issuer", "Lcom/payair/logic/cardvalidation/CardValidationResult;", "panValidationResult", "expDateValidationResult", "cvvValidationResult", "chNameValidationResult", "<init>", "(Lcom/payair/logic/cardvalidation/IssuerCardSpecs;Lcom/payair/logic/cardvalidation/CardValidationResult;Lcom/payair/logic/cardvalidation/CardValidationResult;Lcom/payair/logic/cardvalidation/CardValidationResult;Lcom/payair/logic/cardvalidation/CardValidationResult;)V", "a", "Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "getIssuer", "()Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", util.h.xy.cb.b.f1091, "Lcom/payair/logic/cardvalidation/CardValidationResult;", "getPanValidationResult", "()Lcom/payair/logic/cardvalidation/CardValidationResult;", "c", "getExpDateValidationResult", "d", "getCvvValidationResult", "e", "getChNameValidationResult", "", "f", "Ljava/util/List;", "getAllResults", "()Ljava/util/List;", "allResults", "g", "getErrors", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "h", "getWarnings", "warnings", "Lcom/payair/logic/cardvalidation/ValidationResultType;", "getType", "()Lcom/payair/logic/cardvalidation/ValidationResultType;", "type", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardDataValidationReport {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final com.payair.logic.cardvalidation.IssuerCardSpecs issuer;

    /* renamed from: b, reason: from kotlin metadata */
    public final com.payair.logic.cardvalidation.CardValidationResult panValidationResult;

    /* renamed from: c, reason: from kotlin metadata */
    public final com.payair.logic.cardvalidation.CardValidationResult expDateValidationResult;

    /* renamed from: d, reason: from kotlin metadata */
    public final com.payair.logic.cardvalidation.CardValidationResult cvvValidationResult;

    /* renamed from: e, reason: from kotlin metadata */
    public final com.payair.logic.cardvalidation.CardValidationResult chNameValidationResult;

    /* renamed from: f, reason: from kotlin metadata */
    public final java.util.List allResults;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;

    public CardDataValidationReport(com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs, com.payair.logic.cardvalidation.CardValidationResult cardValidationResult, com.payair.logic.cardvalidation.CardValidationResult cardValidationResult2, com.payair.logic.cardvalidation.CardValidationResult cardValidationResult3, com.payair.logic.cardvalidation.CardValidationResult cardValidationResult4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerCardSpecs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidationResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidationResult2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidationResult3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardValidationResult4, "");
        this.issuer = issuerCardSpecs;
        this.panValidationResult = cardValidationResult;
        this.expDateValidationResult = cardValidationResult2;
        this.cvvValidationResult = cardValidationResult3;
        this.chNameValidationResult = cardValidationResult4;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.payair.logic.cardvalidation.CardValidationResult[]{cardValidationResult, cardValidationResult2, cardValidationResult3, cardValidationResult4});
        this.allResults = listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            if (((com.payair.logic.cardvalidation.CardValidationResult) obj).getType() == com.payair.logic.cardvalidation.ValidationResultType.ERROR) {
                arrayList.add(obj);
            }
        }
        this.g = arrayList;
        java.util.List list = this.allResults;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((com.payair.logic.cardvalidation.CardValidationResult) obj2).getType() == com.payair.logic.cardvalidation.ValidationResultType.WARNING) {
                arrayList2.add(obj2);
            }
        }
        this.h = arrayList2;
    }

    public final java.util.List<com.payair.logic.cardvalidation.CardValidationResult> getAllResults() {
        return this.allResults;
    }

    public final com.payair.logic.cardvalidation.CardValidationResult getChNameValidationResult() {
        return this.chNameValidationResult;
    }

    public final com.payair.logic.cardvalidation.CardValidationResult getCvvValidationResult() {
        return this.cvvValidationResult;
    }

    public final java.util.List<com.payair.logic.cardvalidation.CardValidationResult> getErrors() {
        return this.g;
    }

    public final com.payair.logic.cardvalidation.CardValidationResult getExpDateValidationResult() {
        return this.expDateValidationResult;
    }

    public final com.payair.logic.cardvalidation.IssuerCardSpecs getIssuer() {
        return this.issuer;
    }

    public final com.payair.logic.cardvalidation.CardValidationResult getPanValidationResult() {
        return this.panValidationResult;
    }

    public final com.payair.logic.cardvalidation.ValidationResultType getType() {
        return !this.g.isEmpty() ? com.payair.logic.cardvalidation.ValidationResultType.ERROR : !this.h.isEmpty() ? com.payair.logic.cardvalidation.ValidationResultType.WARNING : com.payair.logic.cardvalidation.ValidationResultType.CORRECT;
    }

    public final java.util.List<com.payair.logic.cardvalidation.CardValidationResult> getWarnings() {
        return this.h;
    }
}

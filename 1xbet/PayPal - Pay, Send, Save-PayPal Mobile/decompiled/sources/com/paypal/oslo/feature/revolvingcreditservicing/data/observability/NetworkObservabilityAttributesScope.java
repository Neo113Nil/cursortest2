package com.paypal.oslo.feature.revolvingcreditservicing.data.observability;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\u0007\u001a\u00020\u00062.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\t\u001a\u00020\u00062.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&¢\u0006\u0004\b\t\u0010\bJ?\u0010\n\u001a\u00020\u00062.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/observability/NetworkObservabilityAttributesScope;", "", "", "Lkotlin/Pair;", "", "pairs", "", "onSuccess", "([Lkotlin/Pair;)V", "onPartialError", "onError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "addCpi", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface NetworkObservabilityAttributesScope {
    void addCpi(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier);

    void onError(kotlin.Pair<java.lang.String, java.lang.String>... pairs);

    void onPartialError(kotlin.Pair<java.lang.String, java.lang.String>... pairs);

    void onSuccess(kotlin.Pair<java.lang.String, java.lang.String>... pairs);
}

package com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b\u0082\u0001\u0002\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionExternalDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CreditAcquisitionDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "getUrl", "()Ljava/lang/String;", "url", "getTrack", "track", "getPresent", "present", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/CBMCAcquisitionExternalDestination;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/navigation/PPCCUSAcquisitionExternalDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CreditAcquisitionExternalDestination extends com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionDestination {
    com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier getCreditProductIdentifier();

    java.lang.String getPresent();

    java.lang.String getTrack();

    java.lang.String getUrl();
}

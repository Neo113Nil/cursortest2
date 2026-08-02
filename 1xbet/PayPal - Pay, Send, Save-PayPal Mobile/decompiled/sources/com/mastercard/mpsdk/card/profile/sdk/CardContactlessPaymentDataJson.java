package com.mastercard.mpsdk.card.profile.sdk;

/* loaded from: classes4.dex */
class CardContactlessPaymentDataJson {

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    public java.lang.String aid;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    public com.mastercard.mpsdk.card.profile.sdk.CardAlternateContactlessPaymentDataJson alternateContactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cdol1RelatedDataLength")
    public int cdol1RelatedDataLength;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    public java.lang.String ciacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDeclineOnPpms")
    public java.lang.String ciacDeclineOnPpms;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvmModel")
    public java.lang.String cvmModel;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    public java.lang.String cvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    public java.lang.String gpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "iccPrivateKeyCrtComponents")
    public java.lang.String iccPrivateKeyCrtComponents;

    @com.payair.hce.setSelectionFromTop(valueOf = "isTransitSupported")
    public boolean isTransitSupported;

    @com.payair.hce.setSelectionFromTop(valueOf = "isUsAipMaskingSupported")
    public boolean isUsAipMaskingSupported;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    public java.lang.String issuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    public java.lang.String paymentFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinIvCvc3Track2")
    public java.lang.String pinIvCvc3Track2;

    @com.payair.hce.setSelectionFromTop(valueOf = "ppseFci")
    public java.lang.String ppseFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    public com.mastercard.mpsdk.card.profile.sdk.CardRecordsJson[] records;

    @com.payair.hce.setSelectionFromTop(valueOf = "track1ConstructionData")
    public com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson track1ConstructionData;

    @com.payair.hce.setSelectionFromTop(valueOf = "track2ConstructionData")
    public com.mastercard.mpsdk.card.profile.sdk.CardTrackConstructionDataJson track2ConstructionData;

    @com.payair.hce.setSelectionFromTop(valueOf = "umdGeneration")
    public java.lang.String umdGeneration;
}

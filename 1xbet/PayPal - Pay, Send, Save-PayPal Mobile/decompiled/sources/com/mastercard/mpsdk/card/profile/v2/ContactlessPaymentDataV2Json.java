package com.mastercard.mpsdk.card.profile.v2;

/* loaded from: classes4.dex */
public class ContactlessPaymentDataV2Json {

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    public java.lang.String aid;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    public com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cdol1RelatedDataLength")
    public java.lang.Integer cdol1RelatedDataLength;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvmModel")
    public java.lang.String cvmModel;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    public java.lang.String gpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "isTransitSupported")
    public java.lang.Boolean isTransitSupported;

    @com.payair.hce.setSelectionFromTop(valueOf = "isUsAipMaskingSupported")
    public java.lang.Boolean isUsAipMaskingSupported;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    public java.lang.String issuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    public java.lang.String paymentFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinIvCvc3Track2")
    public java.lang.String pinIvCvc3Track2;

    @com.payair.hce.setSelectionFromTop(valueOf = "ppseFci")
    public java.lang.String ppseFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "protectedIccPrivateKeyCrtComponents")
    public com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson protectedIccPrivateKeyCrtComponents;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    public com.mastercard.mpsdk.card.profile.RecordsJson[] records;

    @com.payair.hce.setSelectionFromTop(valueOf = "track1ConstructionData")
    public com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json track1ConstructionData;

    @com.payair.hce.setSelectionFromTop(valueOf = "track2ConstructionData")
    public com.mastercard.mpsdk.card.profile.v2.TrackConstructionDataV2Json track2ConstructionData;

    @com.payair.hce.setSelectionFromTop(valueOf = "umdGeneration")
    public java.lang.String umdGeneration;
}

package com.mastercard.mpsdk.card.profile.v1;

/* loaded from: classes4.dex */
public class ContactlessPaymentDataV1Json {

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    public java.lang.String aid;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    public com.mastercard.mpsdk.card.profile.AlternateContactlessPaymentDataJson alternateContactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cdol1RelatedDataLength")
    public java.lang.String cdol1RelatedDataLength;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    public java.lang.String ciacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDeclineOnPpms")
    public java.lang.String ciacDeclineOnPpms;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    public java.lang.String cvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    public java.lang.String gpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "iccPrivateKeyCrtComponents")
    public com.mastercard.mpsdk.card.profile.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponents;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    public java.lang.String issuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    public java.lang.String paymentFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinIvCvc3Track2")
    public java.lang.String pinIvCvc3Track2;

    @com.payair.hce.setSelectionFromTop(valueOf = "ppseFci")
    public java.lang.String ppseFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    public com.mastercard.mpsdk.card.profile.RecordsJson[] records;
}

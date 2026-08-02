package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public interface VisaPaymentSDK {
    com.visa.cbp.mpqr.facade.MpqrAmounts calculateAmountAndTip(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    com.visa.cbp.sdk.facade.EnrollDeviceDasRequest constructEnrollDeviceDasRequest(android.content.Context context, com.visa.cbp.sdk.facade.DasDeviceInfo dasDeviceInfo, java.lang.String str);

    com.visa.cbp.external.lcm.LcmTokenRequest constructLcmRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.LcmParams lcmParams) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException;

    com.visa.cbp.external.common.PaymentDataRequest constructPaymentDataRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException;

    com.visa.cbp.external.enp.ProvisionAckRequest constructProvisionAck(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.external.enp.ProvisionAckRequest constructProvisionAck(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, boolean z, java.lang.String str);

    com.visa.cbp.external.enp.RepersoTokenRequest constructRepersoTokenRequest(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    com.visa.cbp.external.aam.ReplenishAckRequest constructReplenishAcknowledgementRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.CryptoException;

    com.visa.cbp.external.aam.ReplenishRequest constructReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.CryptoException;

    com.visa.cbp.mpqr.facade.TokenPaymentRequest constructTokenPaymentRequest(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    com.visa.cbp.mpqr.facade.MerchantQR[] decodeMpqrCode(java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    void deleteAllTokensLocally(android.content.Context context);

    boolean deselectCard(android.content.Context context);

    void disableOfflinePayment(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.io.IOException, java.security.NoSuchAlgorithmException;

    void enableCustomTransit(android.content.Context context, boolean z) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void enableLogging(android.content.Context context, boolean z, boolean z2);

    void enableOfflinePayment(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException, java.security.InvalidAlgorithmParameterException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException, java.security.NoSuchProviderException;

    java.lang.String findMerchantTagValue(com.visa.cbp.mpqr.facade.MerchantQR[] merchantQRArr, java.lang.String str) throws com.visa.cbp.mpqr.facade.VisaPaymentMPQRException;

    java.lang.String generateConsumerDeviceQR(android.content.Context context, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    java.util.List<com.visa.cbp.sdk.facade.data.TokenData> getAllTokenData(android.content.Context context);

    com.visa.cbp.external.common.EnrollDeviceCerts getCerts(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.CryptoException, java.security.cert.CertificateEncodingException;

    com.visa.cbp.sdk.facade.data.CVMPriority getCvmPriorityList(android.content.Context context);

    com.visa.cbp.sdk.facade.data.CvmMode getCvmVerificationMode(android.content.Context context);

    java.lang.String getDeviceId(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.DeviceIDValidationException;

    com.visa.cbp.external.common.DeviceInfo getDeviceInfo(android.content.Context context, java.lang.String str);

    java.lang.String getEnrollPANTemplate(android.content.Context context);

    java.util.List<com.visa.cbp.sdk.facade.data.TokenKey> getListOfODATokensForReplenishment(android.content.Context context);

    java.util.List<com.visa.cbp.sdk.facade.data.TokenKey> getListOfTokensForReplenishment(android.content.Context context);

    int getMaxTvlRecords(android.content.Context context);

    long getODAExpirationTime(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    com.visa.cbp.sdk.facade.data.TokenKey getSelectedCard(android.content.Context context);

    byte[] getSignature(android.content.Context context, java.lang.String str);

    com.visa.cbp.sdk.facade.data.TokenData getTokenData(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.facade.data.TokenKey getTokenKeyForProvisionedToken(android.content.Context context, java.lang.String str);

    java.lang.String getTokenStatus(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    java.util.List<com.visa.cbp.sdk.facade.data.TvlEntry> getTvlLog(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.external.version.VisaSDKVersion getVersion(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void initTokenMigration(android.content.Context context, com.visa.cbp.sdk.facade.TokenMigrationService tokenMigrationService, android.app.Activity activity);

    boolean isCustomTransitSupported(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    boolean isCvmVerified(android.content.Context context);

    boolean isOfflinePaymentSupported(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    boolean isSessionAvailable();

    boolean isTokenReadyForReplenishment(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey);

    com.visa.cbp.sdk.facade.TokenRepersoStatus isTokenRepersoComplete(android.content.Context context, java.lang.String str);

    boolean isTokenRepersoComplete(android.content.Context context);

    void onBoardDevicePerso(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void onBoardDevicePerso(android.content.Context context, java.lang.String str) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    com.visa.cbp.sdk.facade.data.ApduResponse processCommandApdu(android.content.Context context, byte[] bArr, android.os.Bundle bundle, boolean z) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException;

    void processEnrollDeviceDasResponse(android.content.Context context, com.visa.cbp.sdk.facade.EnrollDeviceDasResponse enrollDeviceDasResponse);

    void processEnrollDeviceDasResponse(android.content.Context context, com.visa.cbp.sdk.facade.EnrollDeviceDasResponse enrollDeviceDasResponse, java.lang.String str);

    void processInAppTransactionComplete(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, boolean z) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException;

    void processInitiateRepersoResponse(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.enp.InitiateRepersoResponse initiateRepersoResponse) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void processODAReplenishResponse(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.ReplenishODAResponse replenishODAResponse) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void processRepersoTokenResponse(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException, java.security.KeyStoreException, java.security.cert.CertificateException, java.io.IOException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException;

    boolean processReplenishmentResponse(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.TokenInfo tokenInfo) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.CryptoException;

    boolean processTransactionComplete(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) throws com.visa.cbp.sdk.facade.exception.CryptoException;

    boolean processTransactionComplete(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback harmfulAppsCallback) throws com.visa.cbp.sdk.facade.exception.CryptoException;

    void reset(android.content.Context context);

    com.visa.cbp.sdk.reader.TapToEnroll retrievePanFromContactlessCard(android.content.Context context, android.app.Activity activity, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.security.PublicKey publicKey, com.visa.cbp.sdk.facade.RetrievePanCallback retrievePanCallback);

    boolean selectCard(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.CryptoException;

    boolean setCVMPriorityList(android.content.Context context, com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException;

    void setCheckStatusPeriod(android.content.Context context, long j);

    void setCvmVerificationMode(android.content.Context context, com.visa.cbp.sdk.facade.data.CvmMode cvmMode);

    void setCvmVerified(android.content.Context context, boolean z);

    void setMaxTvlRecords(android.content.Context context, int i);

    com.visa.cbp.sdk.facade.data.TokenKey storeProvisionedToken(android.content.Context context, com.visa.cbp.external.enp.ProvisionResponse provisionResponse, java.lang.String str) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException, com.visa.cbp.sdk.facade.exception.CryptoException, java.security.KeyStoreException, java.security.UnrecoverableKeyException, java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.io.IOException;

    boolean tokensExist(android.content.Context context);

    boolean updateCardMetaData(android.content.Context context, com.visa.cbp.external.common.CardMetadataUpdateResponse cardMetadataUpdateResponse);

    boolean updateTokenStatus(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus) throws com.visa.cbp.sdk.facade.exception.TokenInvalidException;
}

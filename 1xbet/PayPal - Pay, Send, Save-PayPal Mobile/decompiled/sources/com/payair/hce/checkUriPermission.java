package com.payair.hce;

/* loaded from: classes4.dex */
public interface checkUriPermission {
    byte[] getApplicationLifeCycleData();

    byte[] getCardLayoutDescription();

    java.lang.String[] getCardholderValidators();

    int getCvmResetTimeout();

    int getDualTapResetTimeout();

    com.payair.hce.enforceCallingUriPermission getMagstripeCvmIssuerOptions();

    com.payair.hce.createPackageContext getMchipCvmIssuerOptions();

    byte[] getSecurityWord();
}

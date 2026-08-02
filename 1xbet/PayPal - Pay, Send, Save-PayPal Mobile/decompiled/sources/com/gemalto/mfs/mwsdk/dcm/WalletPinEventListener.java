package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public interface WalletPinEventListener {
    void onError(com.gemalto.mfs.mwsdk.dcm.WalletPinErrorCode walletPinErrorCode, java.lang.String str);

    void onPinChanged();

    void onPinSet();

    void onPinVerified();
}

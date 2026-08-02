package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public abstract class AbstractWalletPinService {
    public abstract void onSetWalletPin(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier);

    public abstract void onVerifyWalletPin(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier);

    public abstract com.gemalto.mfs.mwsdk.dcm.WalletPinEventListener setupListener();
}

package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes3.dex */
public interface MasterCardTerminalInfo {
    com.gemalto.mfs.mwsdk.payment.engine.TwoTapSupported get2TapSupported();

    byte[] getCdol();

    com.gemalto.mfs.mwsdk.payment.engine.TerminalTechnology getTerminalTechnology();

    com.gemalto.mfs.mwsdk.payment.engine.TerminalType getTerminalType();

    com.gemalto.mfs.mwsdk.payment.engine.CdcvmSupported getcdcvmSupported();

    byte[] getpdol();
}

package com.daon.dmds.managers;

/* loaded from: classes7.dex */
public interface DMDSDefaultScanListener {
    void documentScanned(com.daon.dmds.models.DMDSResult dMDSResult);

    void documentScannedFailed(com.daon.dmds.models.DMDSError dMDSError, com.daon.dmds.models.DMDSResult dMDSResult);
}

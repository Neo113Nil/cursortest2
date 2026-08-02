package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public interface TokenSyncListener {
    void onCardDeleted(java.lang.String str);

    void onCompleted();

    void onError(com.gemalto.mfs.mwsdk.dcm.TokenSyncError tokenSyncError);

    void onProgressUpdate(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.TokenSyncStatus tokenSyncStatus, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState);

    void onStarted();
}

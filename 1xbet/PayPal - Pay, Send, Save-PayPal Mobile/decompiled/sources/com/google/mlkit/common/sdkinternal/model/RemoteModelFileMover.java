package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public interface RemoteModelFileMover {
    java.io.File getModelFileDestination() throws com.google.mlkit.common.MlKitException;

    java.io.File moveAllFilesFromPrivateTempToPrivateDestination(java.io.File file) throws com.google.mlkit.common.MlKitException;
}

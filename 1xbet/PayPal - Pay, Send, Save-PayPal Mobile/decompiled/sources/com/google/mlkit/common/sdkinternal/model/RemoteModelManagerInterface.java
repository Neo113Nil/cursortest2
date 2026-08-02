package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public interface RemoteModelManagerInterface<RemoteT extends com.google.mlkit.common.model.RemoteModel> {
    com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(RemoteT remotet);

    com.google.android.gms.tasks.Task<java.lang.Void> download(RemoteT remotet, com.google.mlkit.common.model.DownloadConditions downloadConditions);

    com.google.android.gms.tasks.Task<java.util.Set<RemoteT>> getDownloadedModels();

    com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(RemoteT remotet);
}

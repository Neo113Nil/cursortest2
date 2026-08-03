package com.google.android.gms.drive.events;

/* loaded from: classes3.dex */
public abstract class OpenFileCallback {
    public abstract void onContents(com.google.android.gms.drive.DriveContents driveContents);

    public abstract void onError(java.lang.Exception exc);

    public abstract void onProgress(long j, long j2);
}

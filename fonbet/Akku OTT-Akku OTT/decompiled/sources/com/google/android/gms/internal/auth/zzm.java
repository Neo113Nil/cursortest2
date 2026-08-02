package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.c;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public interface zzm extends IInterface {
    void zzb(Status status, @Nullable c cVar) throws RemoteException;
}

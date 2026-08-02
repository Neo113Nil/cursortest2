package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.zzb;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0869k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends zzb implements InterfaceC0869k {
        public static final /* synthetic */ int a = 0;
    }

    @NonNull
    Account zzb() throws RemoteException;
}

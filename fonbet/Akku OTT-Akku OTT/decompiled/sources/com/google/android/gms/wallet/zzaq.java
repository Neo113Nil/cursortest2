package com.google.android.gms.wallet;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.AbstractC0830d;

/* loaded from: classes4.dex */
public abstract class zzaq extends AbstractC0830d {
    public zzaq(h hVar) {
        super(Wallet.API, hVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d, com.google.android.gms.common.api.internal.InterfaceC0831e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzaq) obj);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    @VisibleForTesting
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract void doExecute(com.google.android.gms.internal.wallet.zzy zzyVar) throws RemoteException;
}

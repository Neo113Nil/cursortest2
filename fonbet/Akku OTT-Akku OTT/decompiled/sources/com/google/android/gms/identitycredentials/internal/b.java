package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* loaded from: classes4.dex */
public interface b extends IInterface {

    public static abstract class a extends zzb implements b {
        public static final /* synthetic */ int a = 0;

        /* renamed from: com.google.android.gms.identitycredentials.internal.b$a$a, reason: collision with other inner class name */
        public static class C0118a extends zza implements b {
            @Override // com.google.android.gms.identitycredentials.internal.b
            public final void w(@NonNull e eVar, @NonNull GetCredentialRequest getCredentialRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(obtainAndWriteInterfaceToken, eVar);
                zzc.zzb(obtainAndWriteInterfaceToken, getCredentialRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }
    }

    void w(@NonNull e eVar, @NonNull GetCredentialRequest getCredentialRequest) throws RemoteException;
}

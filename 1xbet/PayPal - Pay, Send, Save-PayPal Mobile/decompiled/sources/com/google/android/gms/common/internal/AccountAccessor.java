package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor) {
        if (iAccountAccessor != null) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return iAccountAccessor.zzb();
            } catch (android.os.RemoteException unused) {
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }
}

package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* loaded from: classes4.dex */
public final class zze extends AbstractC0866h<zzh> {
    private final Activity zze;

    @Nullable
    private zzd zzf;

    @Nullable
    private final String zzg;
    private final int zzh;

    public zze(Activity activity, Looper looper, C0863e c0863e, int i, h.a aVar, h.b bVar) {
        super((Context) activity, looper, 12, c0863e, aVar, bVar);
        Account account = c0863e.a;
        this.zzg = account != null ? account.name : null;
        this.zze = activity;
        this.zzh = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        super.disconnect();
        zzd zzdVar = this.zzf;
        if (zzdVar != null) {
            zzdVar.zzb = null;
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean requiresAccount() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(UserAddressRequest userAddressRequest, int i) {
        checkConnected();
        this.zzf = new zzd(i, this.zze);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzg)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzg, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.zzh);
            zzh zzhVar = (zzh) getService();
            zzd zzdVar = this.zzf;
            C0875q.g(zzdVar);
            zzhVar.zzc(zzdVar, userAddressRequest, bundle);
        } catch (RemoteException unused) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            zzd zzdVar2 = this.zzf;
            C0875q.g(zzdVar2);
            zzdVar2.zzc(1, bundle2);
        }
    }
}

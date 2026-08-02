package com.google.android.gms.wallet.button;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes4.dex */
public final class zzf {
    @Nullable
    public static final View zza(Context context, ButtonOptions buttonOptions) {
        zze zzeVar;
        DynamiteModule zzb = zzb(context);
        try {
            IBinder b = zzb.b("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (b == null) {
                zzeVar = null;
            } else {
                IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                zzeVar = queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zze(b);
            }
            if (zzeVar != null) {
                return (View) b.D(zzeVar.zzd(new b(new Context[]{zzb.a, context}), buttonOptions));
            }
        } catch (RemoteException | DynamiteModule.a unused) {
        }
        return null;
    }

    private static final DynamiteModule zzb(Context context) {
        try {
            return DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.a e) {
            throw new IllegalStateException(e);
        }
    }
}

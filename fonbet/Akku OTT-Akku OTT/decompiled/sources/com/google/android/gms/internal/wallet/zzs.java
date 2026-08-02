package com.google.android.gms.internal.wallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
final class zzs extends zzt {
    private final WeakReference zza;
    private final int zzb;

    public zzs(Activity activity, int i) {
        this.zza = new WeakReference(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzb(int i, @Nullable FullWallet fullWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        C0852b c0852b = new C0852b(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (c0852b.l()) {
            try {
                c0852b.n(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (c0852b.m()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", fullWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzd(int i, @Nullable MaskedWallet maskedWallet, Bundle bundle) {
        int i2;
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        C0852b c0852b = new C0852b(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT") : null);
        if (c0852b.l()) {
            try {
                c0852b.n(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (c0852b.m()) {
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", maskedWallet);
            i2 = -1;
        } else {
            int i3 = i == 408 ? 0 : 1;
            intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, i);
            i2 = i3;
        }
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i, boolean z, Bundle bundle) {
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_IS_USER_PREAUTHORIZED, z);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(-1);
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzh(int i, Bundle bundle) {
        C0875q.h(bundle, "Bundle should not be null");
        Activity activity = (Activity) this.zza.get();
        if (activity == null) {
            return;
        }
        C0852b c0852b = new C0852b(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
        if (c0852b.l()) {
            try {
                c0852b.n(activity, this.zzb);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        "Create Wallet Objects confirmation UI will not be shown connection result: ".concat(c0852b.toString());
        Intent intent = new Intent();
        intent.putExtra(WalletConstants.EXTRA_ERROR_CODE, WalletConstants.ERROR_CODE_UNKNOWN);
        PendingIntent createPendingResult = activity.createPendingResult(this.zzb, intent, 1073741824);
        if (createPendingResult == null) {
            return;
        }
        try {
            createPendingResult.send(1);
        } catch (PendingIntent.CanceledException unused2) {
        }
    }
}

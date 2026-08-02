package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public final class zzd extends zzf {
    private final int zza;

    @Nullable
    private Activity zzb;

    public zzd(int i, Activity activity) {
        this.zza = i;
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.identity.zzg
    public final void zzc(int i, Bundle bundle) {
        PendingIntent createPendingResult;
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = this.zzb;
            if (activity == null || (createPendingResult = activity.createPendingResult(this.zza, intent, 1073741824)) == null) {
                return;
            }
            try {
                createPendingResult.send(1);
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        C0852b c0852b = new C0852b(i, bundle != null ? (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT") : null);
        if (c0852b.l()) {
            try {
                Activity activity2 = this.zzb;
                C0875q.g(activity2);
                c0852b.n(activity2, this.zza);
                return;
            } catch (PendingIntent.CanceledException | IntentSender.SendIntentException unused2) {
                return;
            }
        }
        Activity activity3 = this.zzb;
        C0875q.g(activity3);
        PendingIntent createPendingResult2 = activity3.createPendingResult(this.zza, new Intent(), 1073741824);
        if (createPendingResult2 != null) {
            createPendingResult2.send(1);
        }
    }
}

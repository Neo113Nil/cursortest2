package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0831e;

/* loaded from: classes4.dex */
final class zzaw extends zzaj {
    private InterfaceC0831e<Status> zza;

    public zzaw(InterfaceC0831e<Status> interfaceC0831e) {
        this.zza = interfaceC0831e;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, String[] strArr) {
        if (this.zza == null) {
            new Exception();
            return;
        }
        if ((i < 0 || i > 1) && (i < 1000 || i >= 1006)) {
            i = 1;
        }
        if (i == 1) {
            i = 13;
        }
        this.zza.setResult(new Status(i, null, null, null));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, String[] strArr) {
        new Exception();
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, PendingIntent pendingIntent) {
        new Exception();
    }
}

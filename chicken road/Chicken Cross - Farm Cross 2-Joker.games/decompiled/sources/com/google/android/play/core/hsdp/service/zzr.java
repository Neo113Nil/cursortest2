package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.List;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
interface zzr {
    void zza();

    void zzb(String str);

    void zzc(String str);

    void zzd(List list, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener);

    void zze(String str, String str2, IBinder iBinder, int i, int i2, boolean z, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener);

    boolean zzf();

    boolean zzg(String str);
}

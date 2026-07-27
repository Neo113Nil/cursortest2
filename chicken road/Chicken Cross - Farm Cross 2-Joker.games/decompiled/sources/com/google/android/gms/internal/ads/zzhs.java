package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzhs extends zzj {
    long zzb(zzhw zzhwVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zziq zziqVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}

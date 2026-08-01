package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public abstract class HsdpPrewarmRequest {

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public static abstract class Builder {
        public abstract HsdpPrewarmRequest build();

        public abstract Builder setExtraQueryParams(Map<String, String> map);

        public abstract Builder setReferrer(String str);

        public abstract Builder setTargetAppPackageName(String str);

        public abstract Builder setWindowToken(IBinder iBinder);
    }

    public static Builder builder() {
        zzb zzbVar = new zzb();
        zzbVar.setExtraQueryParams(Collections.emptyMap());
        return zzbVar;
    }

    public abstract Map<String, String> extraQueryParams();

    public abstract String referrer();

    public abstract String targetAppPackageName();

    public abstract IBinder windowToken();
}

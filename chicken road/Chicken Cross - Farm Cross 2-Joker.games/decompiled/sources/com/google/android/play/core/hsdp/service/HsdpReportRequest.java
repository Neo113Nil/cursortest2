package com.google.android.play.core.hsdp.service;

import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public final class HsdpReportRequest {
    private final String zza;
    private final int zzb;
    private final int zzc;

    public HsdpReportRequest(String str, int i, int i2) {
        this.zza = (String) Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zzb = i;
        this.zzc = i2;
    }

    public int operation() {
        return this.zzb;
    }

    public int reportCode() {
        return this.zzc;
    }

    public String targetPackage() {
        return this.zza;
    }
}

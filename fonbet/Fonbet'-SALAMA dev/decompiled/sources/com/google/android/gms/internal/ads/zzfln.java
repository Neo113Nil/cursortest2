package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzfln extends zzflo {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfln(zzflg zzflgVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflgVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}

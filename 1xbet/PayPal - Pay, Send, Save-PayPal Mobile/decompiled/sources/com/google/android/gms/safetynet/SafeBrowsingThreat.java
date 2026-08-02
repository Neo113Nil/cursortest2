package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public class SafeBrowsingThreat {
    public static final int TYPE_POTENTIALLY_HARMFUL_APPLICATION = 4;
    public static final int TYPE_SOCIAL_ENGINEERING = 5;
    private int zza;

    public int getThreatType() {
        return this.zza;
    }

    public SafeBrowsingThreat(int i) {
        this.zza = i;
    }
}

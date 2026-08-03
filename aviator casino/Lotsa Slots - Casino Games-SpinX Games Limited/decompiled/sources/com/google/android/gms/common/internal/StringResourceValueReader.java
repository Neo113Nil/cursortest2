package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class StringResourceValueReader {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public StringResourceValueReader(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.res.Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }

    public java.lang.String getString(java.lang.String str) {
        java.lang.String str2 = this.zzb;
        android.content.res.Resources resources = this.zza;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}

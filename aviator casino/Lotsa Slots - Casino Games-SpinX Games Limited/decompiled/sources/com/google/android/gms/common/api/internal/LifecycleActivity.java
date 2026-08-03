package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final boolean zza() {
        return this.zza instanceof androidx.fragment.app.FragmentActivity;
    }

    public final boolean zzb() {
        return this.zza instanceof android.app.Activity;
    }

    public final android.app.Activity zzc() {
        return (android.app.Activity) this.zza;
    }

    public final androidx.fragment.app.FragmentActivity zzd() {
        return (androidx.fragment.app.FragmentActivity) this.zza;
    }

    @java.lang.Deprecated
    public LifecycleActivity(android.content.ContextWrapper contextWrapper) {
        throw new java.lang.UnsupportedOperationException();
    }
}

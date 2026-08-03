package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcmw extends android.content.MutableContextWrapper {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private android.content.Context zzc;

    public zzcmw(android.content.Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        android.app.Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
        }
    }

    public final void zza(android.content.Intent intent, int i) {
        if (this.zza == null) {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(intent.getData());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(valueOf);
        sb.append(" and requestCode: 236");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.zza.startActivityForResult(intent, 236);
    }

    public final android.app.Activity zzb() {
        return this.zza;
    }

    public final android.content.Context zzc() {
        return this.zzc;
    }
}

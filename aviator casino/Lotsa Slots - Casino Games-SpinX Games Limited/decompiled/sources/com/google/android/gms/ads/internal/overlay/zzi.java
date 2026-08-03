package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzi extends android.widget.RelativeLayout {
    final com.google.android.gms.ads.internal.util.zzat zza;
    boolean zzb;

    public zzi(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(context);
        com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context, str);
        this.zza = zzatVar;
        zzatVar.zzd(str2);
        zzatVar.zzc(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zza(motionEvent);
        return false;
    }
}

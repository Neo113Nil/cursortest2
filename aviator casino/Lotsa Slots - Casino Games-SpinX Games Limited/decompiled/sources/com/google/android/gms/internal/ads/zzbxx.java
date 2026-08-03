package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbxx extends com.google.android.gms.internal.ads.zzbyg {
    private final java.util.Map zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    public zzbxx(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        super(zzckuVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzckuVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
    }

    private final java.lang.String zzd(java.lang.String str) {
        java.util.Map map = this.zza;
        return android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str)) ? "" : (java.lang.String) map.get(str);
    }

    private final long zze(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str2);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        android.content.Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new com.google.android.gms.internal.ads.zzbhx(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        zzN.setTitle(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s5) : "Create calendar event");
        zzN.setMessage(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s6) : "Allow Ad to create a calendar event?");
        zzN.setPositiveButton(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s3) : com.google.common.net.HttpHeaders.ACCEPT, new com.google.android.gms.internal.ads.zzbxv(this));
        zzN.setNegativeButton(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s4) : "Decline", new com.google.android.gms.internal.ads.zzbxw(this));
        zzN.create().show();
    }

    final android.content.Intent zzb() {
        android.content.Intent data = new android.content.Intent("android.intent.action.EDIT").setData(android.provider.CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    final /* synthetic */ android.content.Context zzc() {
        return this.zzb;
    }
}

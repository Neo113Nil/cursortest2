package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrj extends zzbrs {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbrj(zzceb zzcebVar, Map map) {
        super(zzcebVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcebVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j3 = this.zze;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        if (!new zzbbg(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        P p7 = oVar.f1957c;
        AlertDialog.Builder builderJ = P.j(this.zzb);
        Resources resourcesZze = oVar.f1961g.zze();
        builderJ.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s5) : "Create calendar event");
        builderJ.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderJ.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : "Accept", new zzbrh(this));
        builderJ.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbri(this));
        builderJ.create().show();
    }
}

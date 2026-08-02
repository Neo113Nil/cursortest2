package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbrp extends zzbrs {
    private final Map zza;
    private final Context zzb;

    public zzbrp(zzceb zzcebVar, Map map) {
        super(zzcebVar, "storePicture");
        this.zza = map;
        this.zzb = zzcebVar.zzi();
    }

    public final void zzb() {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        if (!new zzbbg(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        P p7 = oVar.f1957c;
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zze = oVar.f1961g.zze();
        P p8 = oVar.f1957c;
        AlertDialog.Builder j = P.j(this.zzb);
        j.setTitle(zze != null ? zze.getString(R.string.s1) : "Save image");
        j.setMessage(zze != null ? zze.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        j.setPositiveButton(zze != null ? zze.getString(R.string.s3) : "Accept", new zzbrn(this, str, lastPathSegment));
        j.setNegativeButton(zze != null ? zze.getString(R.string.s4) : "Decline", new zzbro(this));
        j.create().show();
    }
}

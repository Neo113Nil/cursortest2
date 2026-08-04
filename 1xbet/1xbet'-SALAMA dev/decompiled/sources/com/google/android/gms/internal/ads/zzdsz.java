package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.K;
import I2.P;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p096n1.e;
import p097n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzdsz {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzdsz(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        zzbbp zzbbpVar = zzbby.zzjh;
        C0254t c0254t = C0254t.f2723d;
        this.zzc = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        this.zzd = ((Integer) c0254t.f2726c.zzb(zzbby.zzji)).intValue();
    }

    public final JSONObject zza() throws JSONException {
        String strF;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            K k7 = P.f3579l;
            jSONObject.put("name", c.a(context).r(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        P p5 = o.f1952C.f1957c;
        Drawable applicationIcon = null;
        try {
            strF = P.F(this.zza);
        } catch (RemoteException unused2) {
            strF = null;
        }
        jSONObject.put("adMobAppId", strF);
        if (this.zze.isEmpty()) {
            try {
                e eVarA = c.a(this.zza);
                String str2 = this.zzb.packageName;
                Context context2 = (Context) eVarA.f15314b;
                ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str2, 0);
                context2.getPackageManager().getApplicationLabel(applicationInfo);
                applicationIcon = context2.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}

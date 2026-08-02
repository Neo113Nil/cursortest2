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
import n1.C1450e;
import n3.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
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

    public final JSONObject zza() {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str2 = this.zzb.packageName;
            K k7 = P.f3579l;
            jSONObject.put("name", c.a(context).r(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        P p5 = o.f1952C.f1957c;
        Drawable drawable = null;
        try {
            str = P.F(this.zza);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.zze.isEmpty()) {
            try {
                C1450e a2 = c.a(this.zza);
                String str3 = this.zzb.packageName;
                Context context2 = (Context) a2.f15308b;
                ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str3, 0);
                context2.getPackageManager().getApplicationLabel(applicationInfo);
                drawable = context2.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap createBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = encodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}

package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzu extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private final android.widget.ImageButton zza;
    private final com.google.android.gms.ads.internal.overlay.zzah zzb;

    public zzu(android.content.Context context, com.google.android.gms.ads.internal.overlay.zzt zztVar, com.google.android.gms.ads.internal.overlay.zzah zzahVar) {
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zza);
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 0);
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzb);
        com.google.android.gms.ads.internal.client.zzay.zza();
        imageButton.setPadding(zzE, zzE2, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        com.google.android.gms.ads.internal.client.zzay.zza();
        int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        com.google.android.gms.ads.internal.client.zzay.zza();
        addView(imageButton, new android.widget.FrameLayout.LayoutParams(zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, zztVar.zzd + zztVar.zzc), 17));
        long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbO)).longValue();
        if (longValue <= 0) {
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzs zzsVar = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbP)).booleanValue() ? new com.google.android.gms.ads.internal.overlay.zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    private final void zzc() {
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbN);
        if (android.text.TextUtils.isEmpty(str) || com.unity3d.ads.BuildConfig.FLAVOR.equals(str)) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.graphics.drawable.Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = zzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = zzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        android.widget.ImageButton imageButton = this.zza;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(android.widget.ImageView.ScaleType.CENTER);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.google.android.gms.ads.internal.overlay.zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    public final void zza(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        android.widget.ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbO)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    final /* synthetic */ android.widget.ImageButton zzb() {
        return this.zza;
    }
}

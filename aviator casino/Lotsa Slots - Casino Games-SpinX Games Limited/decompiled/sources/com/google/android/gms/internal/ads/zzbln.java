package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbln extends android.widget.RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private android.graphics.drawable.AnimationDrawable zzb;

    public zzbln(android.content.Context context, com.google.android.gms.internal.ads.zzblm zzblmVar, android.widget.RelativeLayout.LayoutParams layoutParams) {
        super(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzblmVar);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzblmVar.zze());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (!android.text.TextUtils.isEmpty(zzblmVar.zzb())) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            textView.setText(zzblmVar.zzb());
            textView.setTextColor(zzblmVar.zzf());
            textView.setTextSize(zzblmVar.zzg());
            com.google.android.gms.ads.internal.client.zzay.zza();
            int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 4);
            com.google.android.gms.ads.internal.client.zzay.zza();
            textView.setPadding(zzE, 0, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        java.util.List zzd = zzblmVar.zzd();
        if (zzd != null && zzd.size() > 1) {
            this.zzb = new android.graphics.drawable.AnimationDrawable();
            java.util.Iterator it = zzd.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.internal.ads.zzblp) it.next()).zzb()), zzblmVar.zzh());
                } catch (java.lang.Exception e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzd.size() == 1) {
            try {
                imageView.setImageDrawable((android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.internal.ads.zzblp) zzd.get(0)).zzb()));
            } catch (java.lang.Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        android.graphics.drawable.AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

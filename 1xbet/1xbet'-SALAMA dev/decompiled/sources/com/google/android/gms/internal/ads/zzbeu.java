package com.google.android.gms.internal.ads;

import F2.C0252s;
import I2.J;
import J2.d;
import J2.j;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.D;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbeu extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbeu(Context context, zzbet zzbetVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        D.i(zzbetVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbetVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbetVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbetVar.zzg());
            textView.setTextColor(zzbetVar.zze());
            textView.setTextSize(zzbetVar.zzf());
            d dVar = C0252s.f2717f.f2718a;
            textView.setPadding(d.p(4, context), 0, d.m(context.getResources().getDisplayMetrics(), 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listZzi = zzbetVar.zzi();
        if (listZzi != null && listZzi.size() > 1) {
            this.zzb = new AnimationDrawable();
            Iterator it = listZzi.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((Drawable) p105o3.b.t0(((zzbew) it.next()).zzf()), zzbetVar.zzb());
                } catch (Exception e7) {
                    int i7 = J.f3546b;
                    j.e("Error while getting drawable.", e7);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (listZzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) p105o3.b.t0(((zzbew) listZzi.get(0)).zzf()));
            } catch (Exception e8) {
                int i8 = J.f3546b;
                j.e("Error while getting drawable.", e8);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}

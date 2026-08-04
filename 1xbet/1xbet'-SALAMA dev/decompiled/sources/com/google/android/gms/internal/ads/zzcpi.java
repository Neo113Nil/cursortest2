package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import J2.d;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcpi extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcpi(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcpi zza(Context context, View view, zzfaf zzfafVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcpi zzcpiVar = new zzcpi(context);
        if (!zzfafVar.zzu.isEmpty() && (resources = zzcpiVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfag zzfagVar = (zzfag) zzfafVar.zzu.get(0);
            float f7 = zzfagVar.zza;
            float f8 = displayMetrics.density;
            zzcpiVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f7 * f8), (int) (zzfagVar.zzb * f8)));
        }
        zzcpiVar.zzb = view;
        zzcpiVar.addView(view);
        o oVar = o.f1952C;
        zzbzn zzbznVar = oVar.f1954B;
        zzbzn.zzb(zzcpiVar, zzcpiVar);
        zzbzn zzbznVar2 = oVar.f1954B;
        zzbzn.zza(zzcpiVar, zzcpiVar);
        JSONObject jSONObject = zzfafVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcpiVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcpiVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcpiVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcpiVar.addView(relativeLayout);
        return zzcpiVar;
    }

    private final int zzb(double d7) {
        d dVar = C0252s.f2717f.f2718a;
        return d.p((int) d7, this.zza);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i7) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i7);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}

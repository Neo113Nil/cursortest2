package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcxx extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxx(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxx zza(Context context, View view, zzfld zzfldVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxx zzcxxVar = new zzcxx(context);
        List list = zzfldVar.zzu;
        if (!list.isEmpty() && (resources = zzcxxVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfle zzfleVar = (zzfle) list.get(0);
            zzcxxVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfleVar.zza * displayMetrics.density), (int) (zzfleVar.zzb * displayMetrics.density)));
        }
        zzcxxVar.zzb = view;
        zzcxxVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zzb(zzcxxVar, zzcxxVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zza(zzcxxVar, zzcxxVar);
        JSONObject jSONObject = zzfldVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxxVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxxVar.zzb(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxxVar.zzb(optJSONObject2, relativeLayout, 12);
        }
        zzcxxVar.addView(relativeLayout);
        return zzcxxVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzc, 0, zzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxf extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final android.content.Context zza;
    private android.view.View zzb;

    private zzcxf(android.content.Context context) {
        super(context);
        this.zza = context;
    }

    public static com.google.android.gms.internal.ads.zzcxf zza(android.content.Context context, android.view.View view, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        com.google.android.gms.internal.ads.zzcxf zzcxfVar = new com.google.android.gms.internal.ads.zzcxf(context);
        java.util.List list = zzfkfVar.zzu;
        if (!list.isEmpty() && (resources = zzcxfVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            com.google.android.gms.internal.ads.zzfkg zzfkgVar = (com.google.android.gms.internal.ads.zzfkg) list.get(0);
            zzcxfVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (zzfkgVar.zza * displayMetrics.density), (int) (zzfkgVar.zzb * displayMetrics.density)));
        }
        zzcxfVar.zzb = view;
        zzcxfVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zzb(zzcxfVar, zzcxfVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zza(zzcxfVar, zzcxfVar);
        org.json.JSONObject jSONObject = zzfkfVar.zzah;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(zzcxfVar.zza);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxfVar.zzb(optJSONObject, relativeLayout, 10);
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxfVar.zzb(optJSONObject2, relativeLayout, 12);
        }
        zzcxfVar.addView(relativeLayout);
        return zzcxfVar;
    }

    private final void zzb(org.json.JSONObject jSONObject, android.widget.RelativeLayout relativeLayout, int i) {
        android.widget.TextView textView = new android.widget.TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzc = zzc(jSONObject.optDouble(com.helpshift.proactive.InAppViewConstants.PADDING, 0.0d));
        textView.setPadding(0, zzc, 0, zzc);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
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

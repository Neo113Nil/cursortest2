package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class OutOfContextTestingActivity extends android.app.Activity {
    public static final java.lang.String AD_UNIT_KEY = "adUnit";
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.ads.internal.client.zzdt zzh = com.google.android.gms.ads.internal.client.zzay.zzb().zzh(this, new com.google.android.gms.internal.ads.zzbuy());
        if (zzh == null) {
            finish();
            return;
        }
        setContentView(com.google.android.gms.ads.R.layout.admob_empty_layout);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.google.android.gms.ads.R.id.layout);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzh.zze(stringExtra, com.google.android.gms.dynamic.ObjectWrapper.wrap(this), com.google.android.gms.dynamic.ObjectWrapper.wrap(linearLayout));
        } catch (android.os.RemoteException unused) {
            finish();
        }
    }
}

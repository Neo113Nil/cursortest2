package com.google.android.gms.ads;

import F2.B0;
import F2.C0223d;
import F2.C0247p;
import F2.C0252s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzbok;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0247p c0247p = C0252s.f2717f.f2719b;
        zzbok zzbokVar = new zzbok();
        c0247p.getClass();
        B0 b02 = (B0) new C0223d(this, zzbokVar).d(this, false);
        if (b02 == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            b02.zze(stringExtra, new BinderC1507b(this), new BinderC1507b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

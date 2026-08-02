package com.google.android.gms.ads;

import Q2.C0353d;
import Q2.C0375o;
import Q2.C0379q;
import Q2.InterfaceC0378p0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import game.betting133.sports1xbet.R;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0375o c0375o = C0379q.f.f5049b;
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        c0375o.getClass();
        InterfaceC0378p0 interfaceC0378p0 = (InterfaceC0378p0) new C0353d(this, binderC0610Ia).d(this, false);
        if (interfaceC0378p0 == null) {
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
            interfaceC0378p0.a2(stringExtra, new BinderC2361b(this), new BinderC2361b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

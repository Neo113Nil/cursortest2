package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.e1;
import com.applovin.impl.w2;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public abstract class d1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private e1 f4168a;
    private FrameLayout b;
    private ListView c;

    class a implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4169a;

        /* renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        class C0071a implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n2 f4170a;

            C0071a(n2 n2Var) {
                this.f4170a = n2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((r1) d1.this.f4168a.d().get(this.f4170a.a()), d1.this.f4168a.e());
            }
        }

        a(c cVar) {
            this.f4169a = cVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            if (n2Var.b() != e1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f4169a, new C0071a(n2Var));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(android.R.id.content);
        this.c = (ListView) findViewById(R.id.listView);
        j8.a(this.b, com.applovin.impl.sdk.l.E0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.f4168a;
        if (e1Var != null) {
            e1Var.a((w2.a) null);
            this.f4168a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        e1 e1Var = this.f4168a;
        if (e1Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((ListAdapter) e1Var);
        e1 e1Var2 = this.f4168a;
        if (e1Var2 != null && !e1Var2.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        e1 e1Var3 = this.f4168a;
        if (e1Var3 == null || !e1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(e1 e1Var, c cVar) {
        this.f4168a = e1Var;
        e1Var.a(new a(cVar));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public abstract class p1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private r1 f4370a;
    private com.applovin.impl.sdk.l b;
    private TextView c;
    private Button d;

    private void b() {
        z2 z2Var = new z2();
        z2Var.a(this.b.z().a(this.f4370a));
        String b = this.b.z().b(this.f4370a);
        if (b != null) {
            z2Var.a("\nBid Response Preview:\n");
            z2Var.a(b);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.c = textView;
        textView.setText(z2Var.toString());
        this.c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public void a(r1 r1Var, com.applovin.impl.sdk.l lVar) {
        this.f4370a = r1Var;
        this.b = lVar;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f4370a.d() + " - " + this.f4370a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        j8.a(findViewById(android.R.id.content), this.b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.p1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.this.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.b.z().a(this.f4370a, (Context) this, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.z().a(this.f4370a, (Context) this, true);
    }

    private boolean a() {
        return (this.f4370a == null || this.b == null) ? false : true;
    }
}

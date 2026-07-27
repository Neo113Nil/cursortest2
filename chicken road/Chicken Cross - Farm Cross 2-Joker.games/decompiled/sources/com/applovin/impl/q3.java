package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.d;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w2;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* loaded from: classes5.dex */
public abstract class q3 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private s3 f4386a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private com.applovin.impl.a e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            q3.this.a();
            q3 q3Var = q3.this;
            q3Var.b((Context) q3Var);
        }
    }

    class b implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f4388a;

        class a implements d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(q3.this.f4386a.u());
            }
        }

        /* renamed from: com.applovin.impl.q3$b$b, reason: collision with other inner class name */
        class C0081b implements d.b {
            C0081b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(q3.this.f4386a.d(), q3.this.f4386a.u());
            }
        }

        class c implements d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(q3.this.f4386a.d(), q3.this.f4386a.u());
            }
        }

        class d implements d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(q3.this.f4386a.f(), false, q3.this.f4386a.u());
            }
        }

        class e implements d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(q3.this.f4386a.k(), q3.this.f4386a.x(), q3.this.f4386a.u());
            }
        }

        class f implements d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(q3.this.f4386a.w(), q3.this.f4386a.u());
            }
        }

        class g implements d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(q3.this.f4386a.p(), true, q3.this.f4386a.u());
            }
        }

        class h implements d.b {
            h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(q3.this.f4386a.u().G().getTrackedAxonEvents(), q3.this.f4386a.u());
            }
        }

        class i implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v2 f4397a;

            i(v2 v2Var) {
                this.f4397a = v2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((e4) this.f4397a).r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.f4388a = cVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            int b = n2Var.b();
            if (b == s3.e.APP_INFO.ordinal()) {
                t7.a(v2Var.c(), v2Var.b(), q3.this);
                return;
            }
            if (b == s3.e.MAX.ordinal()) {
                if (q3.this.f4386a.a(v2Var)) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerUnifiedFlowActivity.class, this.f4388a, new a());
                    return;
                } else {
                    t7.a(v2Var.c(), v2Var.b(), q3.this);
                    return;
                }
            }
            if (b == s3.e.PRIVACY.ordinal()) {
                if (n2Var.a() != s3.d.CMP.ordinal()) {
                    if (n2Var.a() == s3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(q3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f4388a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(q3.this.f4386a.u().t0().j())) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerTcfInfoListActivity.class, this.f4388a, new C0081b());
                    return;
                } else {
                    t7.a(v2Var.c(), v2Var.b(), q3.this);
                    return;
                }
            }
            if (b != s3.e.ADS.ordinal()) {
                if (b == s3.e.EVENTS.ordinal()) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerAxonEventsListActivity.class, this.f4388a, new h());
                    return;
                } else {
                    if ((b == s3.e.INCOMPLETE_NETWORKS.ordinal() || b == s3.e.COMPLETED_NETWORKS.ordinal()) && (v2Var instanceof e4)) {
                        com.applovin.impl.d.a(q3.this, MaxDebuggerDetailActivity.class, this.f4388a, new i(v2Var));
                        return;
                    }
                    return;
                }
            }
            if (n2Var.a() == s3.b.AD_UNITS.ordinal()) {
                if (q3.this.f4386a.f().size() > 0) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerAdUnitsListActivity.class, this.f4388a, new d());
                    return;
                } else {
                    t7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", q3.this);
                    return;
                }
            }
            if (n2Var.a() == s3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (q3.this.f4386a.k().size() <= 0 && q3.this.f4386a.x().size() <= 0) {
                    t7.a("Complete Integrations", "Please complete integrations in order to access this.", q3.this);
                    return;
                } else if (q3.this.f4386a.u().u0().c()) {
                    t7.a("Restart Required", v2Var.b(), q3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f4388a, new e());
                    return;
                }
            }
            if (n2Var.a() != s3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (n2Var.a() == s3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(q3.this, MaxDebuggerAdUnitsListActivity.class, this.f4388a, new g());
                }
            } else if (!q3.this.f4386a.u().u0().c()) {
                q3.this.getSdk().u0().a();
                t7.a("Restart Required", v2Var.b(), q3.this);
            } else if (q3.this.f4386a.w().size() > 0) {
                com.applovin.impl.d.a(q3.this, MaxDebuggerTestModeNetworkActivity.class, this.f4388a, new f());
            } else {
                t7.a("Complete Integrations", "Please complete integrations in order to access this.", q3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.e = aVar;
        aVar.setColor(-3355444);
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.e);
        this.e.a();
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        s3 s3Var = this.f4386a;
        if (s3Var != null) {
            return s3Var.u();
        }
        return null;
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.f4386a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s3 s3Var = this.f4386a;
        if (s3Var != null) {
            s3Var.unregisterDataSetObserver(this.b);
            this.f4386a.a((w2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        s3 s3Var = this.f4386a;
        if (s3Var == null || !s3Var.z()) {
            return;
        }
        this.f4386a.c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        s3 s3Var = this.f4386a;
        if (s3Var == null || s3Var.z()) {
            return;
        }
        c();
    }

    public void setListAdapter(s3 s3Var, c cVar) {
        DataSetObserver dataSetObserver;
        s3 s3Var2 = this.f4386a;
        if (s3Var2 != null && (dataSetObserver = this.b) != null) {
            s3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f4386a = s3Var;
        this.b = new a();
        b((Context) this);
        this.f4386a.registerDataSetObserver(this.b);
        this.f4386a.a(new b(cVar));
    }

    private void b() {
        s3 s3Var = this.f4386a;
        if (s3Var == null) {
            return;
        }
        String q = s3Var.q();
        if (TextUtils.isEmpty(q)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", q);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        t7.a(this.f4386a.i(), this.f4386a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f4386a.h()) || this.f4386a.y()) {
            return;
        }
        this.f4386a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.q3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q3.this.a(context);
            }
        });
    }
}

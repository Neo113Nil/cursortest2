package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.g7;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class e7 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4183a;
    private w2 b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();

    class a extends w2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? e7.this.c() : e7.this.a();
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new a5("IAB TCF Parameters") : new a5("CMP CONFIGURATION");
        }
    }

    class b implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7 f4184a;
        final /* synthetic */ com.applovin.impl.sdk.l b;

        class a implements d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f4185a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.f4185a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f4185a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.e7$b$b, reason: collision with other inner class name */
        class C0072b implements d.b {
            C0072b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(e7.this.e, e7.this.f, e7.this.c, e7.this.d, e7.this.g, b.this.b);
            }
        }

        b(f7 f7Var, com.applovin.impl.sdk.l lVar) {
            this.f4184a = f7Var;
            this.b = lVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            String a2;
            String c;
            if (n2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (n2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(e7.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0072b());
                    return;
                } else {
                    t7.a(v2Var.c(), v2Var.b(), e7.this);
                    return;
                }
            }
            if (n2Var.a() == d.TC_STRING.ordinal()) {
                a2 = e5.x.a();
                c = this.f4184a.j();
            } else {
                a2 = e5.y.a();
                c = this.f4184a.c();
            }
            com.applovin.impl.d.a(e7.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(a2, c));
        }
    }

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4183a;
    }

    public void initialize(List<g7> list, com.applovin.impl.sdk.l lVar) {
        this.f4183a = lVar;
        f7 t0 = lVar.t0();
        a(list);
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(t0, lVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w2 w2Var = this.b;
        if (w2Var != null) {
            w2Var.a((w2.a) null);
        }
    }

    private void a(List list) {
        boolean b2 = this.f4183a.t0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g7 g7Var = (g7) it.next();
            if (g7Var.f() == g7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(g7Var.a())) {
                    a(g7Var, this.c);
                } else {
                    a(g7Var, this.e);
                }
            } else if (g7Var.f() != g7.a.ATP_NETWORK) {
                this.g.add(g7Var);
            } else if (!b2) {
                this.g.add(g7Var);
            } else if (Boolean.TRUE.equals(g7Var.a())) {
                a(g7Var, this.d);
            } else {
                a(g7Var, this.f);
            }
        }
    }

    private v2 b() {
        String a2 = e5.u.a();
        Integer e2 = this.f4183a.t0().e();
        v2.b a3 = StringUtils.isValidString(this.f4183a.t0().d()) ? v2.a(v2.c.RIGHT_DETAIL) : v2.a(v2.c.DETAIL).b("Unknown CMP SDK ID").a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a2 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(getColor(R.color.applovin_sdk_warningColor)).a(true);
        a3.d(a2);
        a3.c(e2 != null ? e2.toString() : "No value set");
        a3.c(e2 != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return a3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g = this.f4183a.t0().g();
        String j = this.f4183a.t0().j();
        String c2 = this.f4183a.t0().c();
        arrayList.add(a(e5.w.a(), g));
        arrayList.add(a(e5.x.a(), j, !i7.b(j)));
        arrayList.add(a(e5.y.a(), c2, false));
        return arrayList;
    }

    private void a(g7 g7Var, List list) {
        if (g7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (g7Var.d().equals(((g7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(g7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.e.size() + this.f.size();
        arrayList.add(b());
        arrayList.add(a(e5.v.a(), this.f4183a.t0().f()));
        arrayList.add(v2.a(v2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        arrayList.add(v2.a(v2.c.RIGHT_DETAIL).d("Configured CMP Networks").c(size > 0 ? "Missing " + size + " network(s)" : "").c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private v2 a(String str, Integer num) {
        return v2.a(v2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).a();
    }

    private v2 a(String str, String str2, boolean z) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        v2.b d2 = v2.a(v2.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        v2.b a2 = d2.c(str2).c(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(isValidString);
        if (isValidString) {
            a2.a(this);
        }
        return a2.a();
    }
}

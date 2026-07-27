package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class k7 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4272a;
    private List b;
    private w2 c;
    private List d;
    private ListView e;

    class a extends w2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        @Override // com.applovin.impl.w2
        protected v2 a() {
            return new v2.b(v2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return k7.this.d;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return this.e.size();
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return new a5("TEST MODE NETWORKS");
        }
    }

    class b implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f4273a;
        final /* synthetic */ com.applovin.impl.sdk.l b;

        b(List list, com.applovin.impl.sdk.l lVar) {
            this.f4273a = list;
            this.b = lVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            List u = ((i3) this.f4273a.get(n2Var.a())).u();
            if (u.equals(this.b.u0().b())) {
                this.b.u0().a((List) null);
            } else {
                this.b.u0().a(u);
            }
            k7.this.c.notifyDataSetChanged();
        }
    }

    class c extends e4 {
        final /* synthetic */ i3 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i3 i3Var, Context context, i3 i3Var2) {
            super(i3Var, context);
            this.p = i3Var2;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public int d() {
            if (this.p.u().equals(k7.this.f4272a.u0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public int e() {
            if (this.p.u().equals(k7.this.f4272a.u0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.v2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    public k7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4272a;
    }

    public void initialize(List<i3> list, com.applovin.impl.sdk.l lVar) {
        this.f4272a = lVar;
        this.b = list;
        this.d = a(list);
        a aVar = new a(this, list);
        this.c = aVar;
        aVar.a(new b(list, lVar));
        this.c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    @Override // com.applovin.impl.r3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i3 i3Var = (i3) it.next();
            arrayList.add(new c(i3Var, this, i3Var));
        }
        return arrayList;
    }
}

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
public abstract class j7 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4261a;
    private List b;
    private List c;
    private w2 d;
    private List e;
    private List f;
    private ListView g;

    class a extends w2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.w2
        protected v2 a() {
            return new v2.b(v2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return i == c.BIDDERS.ordinal() ? j7.this.e : j7.this.f;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return i == c.BIDDERS.ordinal() ? j7.this.e.size() : j7.this.f.size();
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return i == c.BIDDERS.ordinal() ? new a5("BIDDERS") : new a5("WATERFALL");
        }
    }

    class b extends e4 {
        final /* synthetic */ y2 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i3 i3Var, Context context, y2 y2Var) {
            super(i3Var, context);
            this.p = y2Var;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public int d() {
            if (j7.this.f4261a.u0().b() == null || !j7.this.f4261a.u0().b().equals(this.p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.e4, com.applovin.impl.v2
        public int e() {
            if (j7.this.f4261a.u0().b() == null || !j7.this.f4261a.u0().b().equals(this.p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.v2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.a(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public j7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4261a;
    }

    public void initialize(List<y2> list, List<y2> list2, final com.applovin.impl.sdk.l lVar) {
        this.f4261a = lVar;
        this.b = list;
        this.c = list2;
        this.e = a(list);
        this.f = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new w2.a() { // from class: com.applovin.impl.j7$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.w2.a
            public final void a(n2 n2Var, v2 v2Var) {
                j7.this.a(lVar, n2Var, v2Var);
            }
        });
        this.d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.r3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.e = a(this.b);
        this.f = a(this.c);
        this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.l lVar, n2 n2Var, v2 v2Var) {
        List b2 = a(n2Var).b();
        if (b2.equals(lVar.u0().b())) {
            lVar.u0().a((List) null);
        } else {
            lVar.u0().a(b2);
        }
        this.d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2 y2Var = (y2) it.next();
            arrayList.add(new b(y2Var.d(), this, y2Var));
        }
        return arrayList;
    }

    private y2 a(n2 n2Var) {
        if (n2Var.b() == c.BIDDERS.ordinal()) {
            return (y2) this.b.get(n2Var.a());
        }
        return (y2) this.c.get(n2Var.a());
    }
}

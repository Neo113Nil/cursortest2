package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.g7;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class c7 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4158a;
    private w2 b;

    class a extends w2 {
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.e = arrayList;
            this.f = arrayList2;
            this.g = z;
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e : this.f;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e.size() : this.f.size();
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new a5("TCF VENDORS (TC STRING)");
            }
            return new a5(this.g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private v2 a(String str, String str2) {
        return v2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4158a;
    }

    public void initialize(List<g7> list, com.applovin.impl.sdk.l lVar) {
        this.f4158a = lVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = q0.b().a(this);
        boolean b2 = lVar.t0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        for (g7 g7Var : list) {
            Boolean a3 = g7Var.a();
            if (a3 != null) {
                if (g7Var.f() == g7.a.TCF_VENDOR) {
                    arrayList.add(a(g7Var.b(), String.valueOf(a3)));
                } else if (g7Var.f() == g7.a.ATP_NETWORK) {
                    arrayList2.add(a(g7Var.b(), String.valueOf(a3)));
                }
            } else if (b2 && g7Var.f() == g7.a.ATP_NETWORK) {
                arrayList2.add(a(g7Var.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}

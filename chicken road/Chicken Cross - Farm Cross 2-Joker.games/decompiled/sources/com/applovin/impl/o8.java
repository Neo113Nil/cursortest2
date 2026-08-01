package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.v2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class o8 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private String f4363a;
    private com.applovin.impl.sdk.l b;
    private w2 c;

    class a extends w2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        @Override // com.applovin.impl.w2
        protected v2 a() {
            return new v2.b(v2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return this.e;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return this.e.size();
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return new a5("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(v2.a(v2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.l lVar) {
        this.f4363a = str;
        this.b = lVar;
        a aVar = new a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f4363a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.c);
    }
}

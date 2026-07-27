package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.autofill.HintConstants;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class p extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private n f4364a;
    private com.applovin.impl.sdk.l b;
    private w2 c;

    class a extends w2 {
        final /* synthetic */ n e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, n nVar) {
            super(context);
            this.e = nVar;
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return this.e.g().size();
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.e.g().get(i);
            arrayList.add(p.this.c(oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.this.a("AB Test Experiment Name", oVar.b()));
            }
            p8 d = oVar.d();
            p pVar = p.this;
            arrayList.add(pVar.a("Device ID Targeting", pVar.a(d.a())));
            p pVar2 = p.this;
            arrayList.add(pVar2.a("Device Type Targeting", pVar2.b(d.b())));
            if (d.c() != null) {
                arrayList.add(p.this.a(d.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            o oVar = (o) this.e.g().get(i);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() == null ? 0 : 1);
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return i == b.TARGETED_WATERFALL.ordinal() ? new a5("TARGETED WATERFALL FOR CURRENT DEVICE") : i == b.OTHER_WATERFALLS.ordinal() ? new a5("OTHER WATERFALLS") : new a5("");
        }
    }

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.b;
    }

    public void initialize(final n nVar, final com.applovin.impl.sdk.l lVar) {
        this.f4364a = nVar;
        this.b = lVar;
        a aVar = new a(this, nVar);
        this.c = aVar;
        aVar.a(new w2.a() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.w2.a
            public final void a(n2 n2Var, v2 v2Var) {
                p.this.a(lVar, nVar, n2Var, v2Var);
            }
        });
        this.c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f4364a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w2 w2Var = this.c;
        if (w2Var != null) {
            w2Var.a((w2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals(HintConstants.AUTOFILL_HINT_PHONE) ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v2 c(String str) {
        return v2.a(v2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.l lVar, final n nVar, final n2 n2Var, v2 v2Var) {
        if (n2Var.a() == 0) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(n.this, n2Var, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.p$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    p.a(n.this, n2Var, lVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, n2 n2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(n2Var.b()), null, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar, n2 n2Var, com.applovin.impl.sdk.l lVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(n2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v2 a(String str, String str2) {
        return v2.a(v2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v2 a(List list) {
        return v2.a(v2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}

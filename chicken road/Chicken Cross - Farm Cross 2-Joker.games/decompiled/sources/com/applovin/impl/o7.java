package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class o7 extends r3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f4358a;
    private w2 b;

    class a extends w2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.w2
        protected int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.w2
        protected List c(int i) {
            return i == d.SETTINGS.ordinal() ? o7.this.c() : o7.this.a();
        }

        @Override // com.applovin.impl.w2
        protected int d(int i) {
            return i == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.w2
        protected v2 e(int i) {
            return i == d.SETTINGS.ordinal() ? new a5("SETTINGS") : new a5("GDPR APPLICABILITY");
        }
    }

    class b implements w2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f4359a;

        b(com.applovin.impl.sdk.l lVar) {
            this.f4359a = lVar;
        }

        @Override // com.applovin.impl.w2.a
        public void a(n2 n2Var, v2 v2Var) {
            if (n2Var.b() == d.SETTINGS.ordinal()) {
                if (n2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f4359a.y().f() != null) {
                        q7.a(this.f4359a.y().f(), com.applovin.impl.sdk.l.p(), this.f4359a);
                        return;
                    } else {
                        t7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", o7.this);
                        return;
                    }
                }
                if (n2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f4359a.y().h() == null) {
                    return;
                }
                q7.a(this.f4359a.y().h(), com.applovin.impl.sdk.l.p(), this.f4359a);
            }
        }
    }

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private v2 d() {
        v2.b d2 = v2.a().d("Terms of Service URL");
        if (this.f4358a.y().h() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(getColor(R.color.applovin_sdk_checkmarkColor));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.r3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f4358a;
    }

    public void initialize(com.applovin.impl.sdk.l lVar) {
        this.f4358a = lVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(lVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.r3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
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

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f4358a.w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography d2 = this.f4358a.y().d();
        boolean z = t7.c(this.f4358a) && d2 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(v2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(d2, z));
        return arrayList;
    }

    private v2 b() {
        boolean z = this.f4358a.y().f() != null;
        return v2.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(getColor(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).a(true).a();
    }

    private v2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return v2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z).a();
    }

    private v2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return v2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN).b(z).a();
    }
}

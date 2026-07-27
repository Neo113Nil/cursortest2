package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.i5;
import com.applovin.impl.o3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes5.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f4301a;
    private Map b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private long k;
    private MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(c3 c3Var) {
        MaxAdapterParametersImpl a2 = a((o3) c3Var);
        a2.i = c3Var.U();
        a2.j = c3Var.E();
        a2.k = c3Var.D();
        return a2;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f4301a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.h;
    }

    static MaxAdapterParametersImpl a(i5 i5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a2 = a(i5Var);
        a2.f4301a = str;
        a2.l = maxAdFormat;
        return a2;
    }

    static MaxAdapterParametersImpl a(o3 o3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f4301a = o3Var.getAdUnitId();
        maxAdapterParametersImpl.e = o3Var.n();
        maxAdapterParametersImpl.f = o3Var.o();
        maxAdapterParametersImpl.g = o3Var.d();
        maxAdapterParametersImpl.b = o3Var.i();
        maxAdapterParametersImpl.c = o3Var.l();
        maxAdapterParametersImpl.d = o3Var.f();
        maxAdapterParametersImpl.h = o3Var.p();
        return maxAdapterParametersImpl;
    }
}

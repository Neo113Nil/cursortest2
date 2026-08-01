package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes5.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f4284a;

    public m0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f4284a = consentFlowUserGeography;
    }

    protected boolean a(Object obj) {
        return obj instanceof m0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (!m0Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a3 = m0Var.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = a();
        return (a2 == null ? 43 : a2.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f4284a;
    }
}

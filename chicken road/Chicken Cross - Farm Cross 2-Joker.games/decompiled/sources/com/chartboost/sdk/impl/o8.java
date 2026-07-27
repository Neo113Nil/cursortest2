package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* loaded from: classes4.dex */
public class o8 {

    /* renamed from: a, reason: collision with root package name */
    public final af f4925a;

    public o8(af afVar) {
        this.f4925a = afVar;
    }

    public DataUseConsent a(String str) {
        return (DataUseConsent) this.f4925a.a().get(str);
    }
}

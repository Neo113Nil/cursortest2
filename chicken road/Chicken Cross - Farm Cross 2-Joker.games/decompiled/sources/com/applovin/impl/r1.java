package com.applovin.impl;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes5.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f4408a;
    private String b;
    private c3 c;
    private com.applovin.impl.sdk.ad.b d;

    public r1(Object obj, long j) {
        this.f4408a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.d = bVar;
            this.b = bVar.getAdZone().d() != null ? this.d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            this.c = c3Var;
            this.b = c3Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof c3) {
            this.c = (c3) obj;
        }
    }

    public long b() {
        return this.f4408a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.d;
    }

    public String d() {
        String str = this.b;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public c3 e() {
        return this.c;
    }

    public String f() {
        if (this.d != null) {
            return "AppLovin";
        }
        c3 c3Var = this.c;
        return c3Var != null ? c3Var.getNetworkName() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.d;
        return bVar != null ? bVar : this.c;
    }
}

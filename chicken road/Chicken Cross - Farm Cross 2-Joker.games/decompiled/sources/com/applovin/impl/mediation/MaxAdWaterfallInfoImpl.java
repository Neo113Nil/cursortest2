package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.e3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final c3 f4300a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final e3 f;
    private final List g;
    private final String h;
    private final String i;

    public MaxAdWaterfallInfoImpl(c3 c3Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(c3Var, c3Var.X(), c3Var.Y(), j, list, c3Var.Q(), c3Var.W(), str, c3Var.T());
    }

    public String getEventId() {
        return this.i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f4300a;
    }

    public String getMCode() {
        return this.h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.g;
    }

    public e3 getRequestParameters() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public MaxAdWaterfallInfoImpl(c3 c3Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, e3 e3Var, List<String> list2, String str3, String str4) {
        this.f4300a = c3Var;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.d = list;
        this.f = e3Var;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }
}

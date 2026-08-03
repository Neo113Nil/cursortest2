package com.ironsource;

/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3321v2 {

    /* renamed from: com.ironsource.v2$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void a(com.ironsource.InterfaceC3321v2 interfaceC3321v2, java.util.List list, java.util.Map map, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2, com.ironsource.B b, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
            }
            interfaceC3321v2.a(list, map, str, c3232q2, jSONObject, jSONObject2, i, j, i2, str2, (i3 & 1024) != 0 ? null : b);
        }

        public static /* synthetic */ void a(com.ironsource.InterfaceC3321v2 interfaceC3321v2, int i, java.lang.String str, int i2, java.lang.String str2, long j, com.ironsource.B b, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionFailed");
            }
            interfaceC3321v2.a(i, str, i2, str2, j, (i3 & 32) != 0 ? null : b);
        }
    }

    void a(int i, java.lang.String str);

    void a(int i, java.lang.String str, int i2, java.lang.String str2, long j, com.ironsource.B b);

    void a(java.util.List<com.ironsource.C3232q2> list, java.util.Map<java.lang.String, com.ironsource.I> map, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2, com.ironsource.B b);
}

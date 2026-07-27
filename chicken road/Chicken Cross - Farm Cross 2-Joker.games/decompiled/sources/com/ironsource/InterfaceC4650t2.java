package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4650t2 {
    static /* synthetic */ void a(InterfaceC4650t2 interfaceC4650t2, List list, Map map, String str, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
        }
        interfaceC4650t2.a(list, map, str, c4561o2, jSONObject, jSONObject2, i, j, i2, str2, (i3 & 1024) != 0 ? null : b);
    }

    void a(int i, String str);

    void a(int i, String str, int i2, String str2, long j, B b);

    void a(List<C4561o2> list, Map<String, I> map, String str, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b);

    static /* synthetic */ void a(InterfaceC4650t2 interfaceC4650t2, int i, String str, int i2, String str2, long j, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionFailed");
        }
        interfaceC4650t2.a(i, str, i2, str2, j, (i3 & 32) != 0 ? null : b);
    }
}

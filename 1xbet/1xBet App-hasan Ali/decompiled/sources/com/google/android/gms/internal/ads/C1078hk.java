package com.google.android.gms.internal.ads;

import Q2.InterfaceC0383s0;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1078hk implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13782a;

    public /* synthetic */ C1078hk(int i) {
        this.f13782a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f13782a) {
            case 0:
                return ((JSONObject) obj).optJSONArray("flags");
            case 1:
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject.optString("key").equals("afma_video_player_type")) {
                        return optJSONObject.optString("value");
                    }
                }
                return null;
            case 2:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 3:
                return (Ih) Ih.class.cast((InterfaceC0383s0) obj);
            default:
                return ((Ih) obj).f9593n;
        }
    }
}

package com.startapp.sdk.internal;

import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ki implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f3964a;

    public ki(JSONArray jSONArray) {
        this.f3964a = jSONArray;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        try {
            return this.f3964a.getJSONObject(((Integer) obj).intValue());
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}

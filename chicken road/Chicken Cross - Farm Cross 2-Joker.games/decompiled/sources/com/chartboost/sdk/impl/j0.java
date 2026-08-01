package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f4816a = new ArrayList();

    @Override // com.chartboost.sdk.impl.a
    public JSONObject a(JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f4816a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((a) it.next()).a(response);
        }
        return response;
    }
}

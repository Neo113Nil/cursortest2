package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Pd {

    /* renamed from: a, reason: collision with root package name */
    private final String f7850a;
    private final Integer b;

    public Pd(JSONObject features, String nameKey, String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.f7850a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final Integer a() {
        return this.b;
    }

    public final String b() {
        return this.f7850a;
    }
}

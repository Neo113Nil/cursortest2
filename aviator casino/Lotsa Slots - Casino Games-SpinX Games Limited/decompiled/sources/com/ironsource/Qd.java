package com.ironsource;

/* loaded from: classes5.dex */
public final class Qd {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5940a;
    private final java.lang.Integer b;

    public Qd(org.json.JSONObject features, java.lang.String nameKey, java.lang.String amountKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.f5940a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.b = features.has(amountKey) ? java.lang.Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final java.lang.Integer a() {
        return this.b;
    }

    public final java.lang.String b() {
        return this.f5940a;
    }
}

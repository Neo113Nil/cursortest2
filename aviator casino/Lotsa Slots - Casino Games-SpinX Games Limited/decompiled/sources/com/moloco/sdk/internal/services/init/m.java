package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7301a = "InitService";

    public static final boolean a(com.moloco.sdk.internal.v.a<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.a() instanceof com.moloco.sdk.internal.services.init.j.b) {
            return a(((com.moloco.sdk.internal.services.init.j.b) aVar.a()).a());
        }
        return true;
    }

    public static final boolean a(int i) {
        io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
        return i == companion.getTooManyRequests().getValue() || i == companion.getRequestTimeout().getValue() || i < 400 || i >= 500;
    }
}

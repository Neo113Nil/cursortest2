package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class c {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> f7282a;
    public final java.lang.String b;

    public c(com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> sdkInitResult, java.lang.String fetchType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        this.f7282a = sdkInitResult;
        this.b = fetchType;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> a() {
        return this.f7282a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> d() {
        return this.f7282a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.init.c)) {
            return false;
        }
        com.moloco.sdk.internal.services.init.c cVar = (com.moloco.sdk.internal.services.init.c) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7282a, cVar.f7282a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.f7282a.hashCode() * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "FetchState(sdkInitResult=" + this.f7282a + ", fetchType=" + this.b + ')';
    }

    public final com.moloco.sdk.internal.services.init.c a(com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> sdkInitResult, java.lang.String fetchType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        return new com.moloco.sdk.internal.services.init.c(sdkInitResult, fetchType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.moloco.sdk.internal.services.init.c a(com.moloco.sdk.internal.services.init.c cVar, com.moloco.sdk.internal.v vVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            vVar = cVar.f7282a;
        }
        if ((i & 2) != 0) {
            str = cVar.b;
        }
        return cVar.a(vVar, str);
    }
}

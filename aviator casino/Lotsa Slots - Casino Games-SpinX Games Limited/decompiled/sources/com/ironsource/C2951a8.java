package com.ironsource;

/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2951a8 extends java.lang.Throwable {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.logger.IronSourceError f6136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2951a8(com.ironsource.mediationsdk.logger.IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6136a = error;
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a() {
        return this.f6136a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.ironsource.C2951a8.class, obj.getClass())) {
            return false;
        }
        com.ironsource.C2951a8 c2951a8 = (com.ironsource.C2951a8) obj;
        if (this.f6136a.getErrorCode() != c2951a8.f6136a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6136a.getErrorMessage(), c2951a8.f6136a.getErrorMessage());
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f6136a.getErrorCode()), this.f6136a.getErrorMessage());
    }
}

package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class j implements io.appmetrica.analytics.identifiers.impl.b {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.identifiers.impl.f f3873a;

    public j(io.appmetrica.analytics.identifiers.impl.f fVar) {
        this.f3873a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final io.appmetrica.analytics.identifiers.impl.c a(android.content.Context context) {
        io.appmetrica.analytics.identifiers.impl.c cVar;
        io.appmetrica.analytics.identifiers.impl.f fVar;
        try {
            try {
                try {
                    try {
                        io.appmetrica.analytics.identifiers.impl.m mVar = (io.appmetrica.analytics.identifiers.impl.m) ((io.appmetrica.analytics.identifiers.impl.o) this.f3873a.a(context));
                        cVar = new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK, new io.appmetrica.analytics.identifiers.impl.a("huawei", mVar.a(), java.lang.Boolean.valueOf(mVar.b())), null, 4);
                        fVar = this.f3873a;
                    } catch (io.appmetrica.analytics.identifiers.impl.g e2) {
                        java.lang.String message = e2.getMessage();
                        if (message == null) {
                            message = "unknown exception during binding huawei services";
                        }
                        cVar = new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                        fVar = this.f3873a;
                    }
                } finally {
                    fVar.b(context);
                }
                fVar.b(context);
            } catch (java.lang.Throwable th) {
                try {
                    this.f3873a.b(context);
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        return cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j() {
        this(new io.appmetrica.analytics.identifiers.impl.f(r1, io.appmetrica.analytics.identifiers.impl.i.f3872a, "huawei"));
        android.content.Intent intent;
        intent = io.appmetrica.analytics.identifiers.impl.k.f3874a;
    }
}

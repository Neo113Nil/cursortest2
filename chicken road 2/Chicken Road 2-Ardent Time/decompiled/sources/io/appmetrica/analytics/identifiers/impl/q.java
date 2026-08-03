package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class q implements io.appmetrica.analytics.identifiers.impl.b {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.identifiers.impl.f f3877a;

    public q(io.appmetrica.analytics.identifiers.impl.f fVar) {
        this.f3877a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final io.appmetrica.analytics.identifiers.impl.c a(android.content.Context context) {
        io.appmetrica.analytics.identifiers.impl.c cVar;
        try {
            try {
                try {
                    try {
                        io.appmetrica.analytics.identifiers.impl.c b2 = b(context);
                        try {
                            this.f3877a.b(context);
                            return b2;
                        } catch (java.lang.Throwable unused) {
                            return b2;
                        }
                    } catch (io.appmetrica.analytics.identifiers.impl.g e2) {
                        java.lang.String message = e2.getMessage();
                        if (message == null) {
                            message = "unknown exception while binding yandex adv_id service";
                        }
                        cVar = new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f3877a.b(context);
                        return cVar;
                    }
                } catch (io.appmetrica.analytics.identifiers.impl.l e3) {
                    java.lang.String message2 = e3.getMessage();
                    if (message2 == null) {
                        message2 = "No yandex adv_id service";
                    }
                    cVar = new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f3877a.b(context);
                    return cVar;
                } catch (java.lang.Throwable th) {
                    return new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                }
            } catch (java.lang.Throwable unused2) {
                return cVar;
            }
        } finally {
            try {
                this.f3877a.b(context);
            } catch (java.lang.Throwable unused3) {
            }
        }
    }

    public final io.appmetrica.analytics.identifiers.impl.c b(android.content.Context context) {
        io.appmetrica.analytics.identifiers.impl.s sVar = (io.appmetrica.analytics.identifiers.impl.s) ((io.appmetrica.analytics.identifiers.impl.u) this.f3877a.a(context));
        sVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f3879a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = android.os.Parcel.obtain();
            obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f3879a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z2 = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK, new io.appmetrica.analytics.identifiers.impl.a("yandex", readString, java.lang.Boolean.valueOf(z2)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q() {
        this(new io.appmetrica.analytics.identifiers.impl.f(r1, io.appmetrica.analytics.identifiers.impl.p.f3876a, "yandex"));
        android.content.Intent intent;
        intent = io.appmetrica.analytics.identifiers.impl.r.f3878a;
    }
}

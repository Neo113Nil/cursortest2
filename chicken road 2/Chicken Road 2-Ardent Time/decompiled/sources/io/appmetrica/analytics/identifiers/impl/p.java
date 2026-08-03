package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.identifiers.impl.p f3876a = new io.appmetrica.analytics.identifiers.impl.p();

    public p() {
        super(1);
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.os.IBinder iBinder = (android.os.IBinder) obj;
        int i2 = io.appmetrica.analytics.identifiers.impl.t.f3880a;
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof io.appmetrica.analytics.identifiers.impl.u)) ? new io.appmetrica.analytics.identifiers.impl.s(iBinder) : (io.appmetrica.analytics.identifiers.impl.u) queryLocalInterface;
    }
}

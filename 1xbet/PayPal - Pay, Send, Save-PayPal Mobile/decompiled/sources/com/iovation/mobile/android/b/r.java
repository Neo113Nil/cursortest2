package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    public r(com.iovation.mobile.android.b.t tVar) {
        super(1, tVar, com.iovation.mobile.android.b.t.class, "onLocationChanged", "onLocationChanged(Landroid/location/Location;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.location.Location location = (android.location.Location) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        com.iovation.mobile.android.b.t tVar = (com.iovation.mobile.android.b.t) this.receiver;
        if (location.getAccuracy() <= 100.0f) {
            tVar.a();
        }
        tVar.c = new com.iovation.mobile.android.b.m(location);
        return kotlin.Unit.INSTANCE;
    }
}

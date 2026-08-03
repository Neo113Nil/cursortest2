package com.ironsource;

/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3038f5<T> extends com.ironsource.Nc {

    /* renamed from: com.ironsource.f5$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$m(com.ironsource.InterfaceC3038f5 _this) {
            _this.l().a(_this);
            if (_this.k().exists()) {
                com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(_this.k());
            }
            try {
                _this.l().a(_this.k(), _this.d().value(), 5, 5);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                kotlin.jvm.functions.Function1<kotlin.Result<? extends T>, kotlin.Unit> i = _this.i();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                i.invoke(kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e))));
            }
        }
    }

    void b(com.ironsource.C3381y8 c3381y8);

    java.lang.String c();

    com.ironsource.W5 d();

    kotlin.jvm.functions.Function1<kotlin.Result<? extends T>, kotlin.Unit> i();

    boolean j();

    com.ironsource.C3381y8 k();

    com.ironsource.InterfaceC3380y7 l();

    void m();
}

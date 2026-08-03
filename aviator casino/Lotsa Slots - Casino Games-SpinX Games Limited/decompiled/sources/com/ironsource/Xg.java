package com.ironsource;

/* loaded from: classes5.dex */
public final class Xg implements com.ironsource.InterfaceC2965b4 {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] c = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.ironsource.Xg.class, "activity", "getActivity()Landroid/app/Activity;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f6084a;
    private final kotlin.properties.ReadWriteProperty b;

    public Xg(android.app.Activity activity, android.content.Context context) {
        this.f6084a = context;
        this.b = com.ironsource.C2986c7.a(activity);
    }

    @Override // com.ironsource.InterfaceC2965b4
    public void a(android.content.Context context) {
        this.f6084a = context;
    }

    @Override // com.ironsource.InterfaceC2965b4
    public android.content.Context b() {
        return this.f6084a;
    }

    @Override // com.ironsource.InterfaceC2965b4
    public android.app.Activity a() {
        return (android.app.Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.InterfaceC2965b4
    public void a(android.app.Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}

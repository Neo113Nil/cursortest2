package com.ironsource;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class ah implements Y3 {
    static final /* synthetic */ KProperty<Object>[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ah.class, "activity", "getActivity()Landroid/app/Activity;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private Context f8087a;
    private final ReadWriteProperty b;

    public ah(Activity activity, Context context) {
        this.f8087a = context;
        this.b = Z6.a(activity);
    }

    @Override // com.ironsource.Y3
    public void a(Context context) {
        this.f8087a = context;
    }

    @Override // com.ironsource.Y3
    public Context b() {
        return this.f8087a;
    }

    @Override // com.ironsource.Y3
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.Y3
    public void a(Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}

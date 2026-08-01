package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4720x0 f7668a;
    private final NetworkSettings b;
    private final Lazy c;

    static final class a extends Lambda implements Function0<BaseAdAdapter<?, ?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T0 f7669a;
        final /* synthetic */ I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T0 t0, I i) {
            super(0);
            this.f7669a = t0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f7669a.a(this.b.e(), this.b.a(), this.b.d());
        }
    }

    public I(T0 adTools, AbstractC4720x0 adUnitData, NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f7668a = adUnitData;
        this.b = providerSettings;
        this.c = LazyKt.lazy(new a(adTools, this));
    }

    public final IronSource.a a() {
        return this.f7668a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.c.getValue();
    }

    public final String c() {
        String providerName = this.b.getProviderName();
        Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final UUID d() {
        return this.f7668a.b().b();
    }

    public final NetworkSettings e() {
        return this.b;
    }
}

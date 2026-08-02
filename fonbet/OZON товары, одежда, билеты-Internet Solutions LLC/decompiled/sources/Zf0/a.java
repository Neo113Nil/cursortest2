package Zf0;

import Ld0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import ag0.C5021a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f35901a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f35902b;

    /* renamed from: Zf0.a$a, reason: collision with other inner class name */
    static final class C0679a extends AbstractC7737t implements Function0<AbToolBaseApi> {
        C0679a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbToolBaseApi invoke() {
            return (AbToolBaseApi) a.this.f35901a.d(AbToolBaseApi.class);
        }
    }

    public a(@NotNull c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f35901a = store;
        this.f35902b = k.b(new C0679a());
    }

    public final boolean b(@NotNull AbstractC8919b consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (consumer instanceof AbstractC8919b.a) {
            return true;
        }
        if (!(consumer instanceof AbstractC8919b.c)) {
            throw new o();
        }
        int i11 = C5021a.f36779b;
        FeatureDTO a11 = C5021a.a(((AbstractC8919b.c) consumer).getName());
        AbToolBaseApi abToolBaseApi = (AbToolBaseApi) this.f35902b.getValue();
        if (abToolBaseApi == null || a11 == null) {
            return false;
        }
        return abToolBaseApi.getBoolean(a11.getName(), a11.getServiceName(), AbToolNamespace.PLATFORM_MOBILE);
    }
}

package Fb0;

import Kb0.K;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l implements ComponentCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K f9275a;

    /* loaded from: classes3.dex */
    public static final class a extends zb0.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f9276a = "x-o3-sys-languages";

        /* renamed from: b, reason: collision with root package name */
        private final String f9277b;

        a(K k11) {
            k11.I().getValue().getClass();
            this.f9277b = Ub0.c.c();
        }

        @Override // zb0.e
        public final String getName() {
            return this.f9276a;
        }

        @Override // zb0.e
        public final String getValue() {
            return this.f9277b;
        }
    }

    l(K k11) {
        this.f9275a = k11;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        K k11 = this.f9275a;
        r0.c(C7714v.a0(new a(k11)), C7714v.a0(k11.t().e().getValue().f107498a));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}

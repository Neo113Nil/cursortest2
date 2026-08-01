package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4595q0;
import com.ironsource.E0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public class J2 extends AbstractC4595q0 {
    private final W8 i;
    private final WeakReference<M2> j;
    private final a k;
    private final K2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(C4577p0 tools, K2 adUnitData, M2 listener, W8 impressionDataListenerHolder) {
        super(tools, adUnitData, listener);
        String format;
        int b;
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(impressionDataListenerHolder, "impressionDataListenerHolder");
        this.i = impressionDataListenerHolder;
        this.j = new WeakReference<>(listener);
        this.k = new a();
        this.l = adUnitData;
        C4411fd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = A0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    private final ISBannerSize l() {
        return f().a(this.l.b().i());
    }

    public final void a(Bg bg, InterfaceC4756z0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (bg != null) {
            a(new D2(bg), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC4595q0
    public C4630s0 b() {
        return new Q2(this.l.b(), a(l()));
    }

    @Override // com.ironsource.AbstractC4595q0
    protected E a() {
        return new E() { // from class: com.ironsource.J2$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c, I i) {
                B a2;
                a2 = J2.a(J2.this, c, i);
                return a2;
            }
        };
    }

    private final class a extends AbstractC4595q0.a implements B2 {
        public a() {
            super();
        }

        @Override // com.ironsource.B2
        public void a(C4758z2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(J2.this.a(instance.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.g();
            }
        }

        @Override // com.ironsource.AbstractC4595q0.a, com.ironsource.F
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            LevelPlayAdInfo e = instance.e();
            J2.this.i.a(e);
            InterfaceC4756z0 i = J2.this.i();
            if (i != null) {
                i.a(e);
            }
        }

        @Override // com.ironsource.B2
        public void c(C4758z2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(J2.this.a(instance.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.h();
            }
        }

        @Override // com.ironsource.B2
        public void b(C4758z2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(J2.this.a(instance.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(J2 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C4758z2(new T0(this$0.f(), E0.b.PROVIDER), instanceData, adInstancePayload, this$0.k);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return ISBannerSize.BANNER;
    }
}

package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4401f3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Yb extends AbstractC4401f3<C4356cc, AdapterAdListener> implements P0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(List<? extends NetworkSettings> list, Pb configs, String str, C4515la publisherDataHolder, C4293aa c4293aa) {
        super(new Zb(str, list, configs), publisherDataHolder, c4293aa);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC4401f3
    protected void D() {
    }

    @Override // com.ironsource.AbstractC4401f3
    protected boolean E() {
        return false;
    }

    public final void J() {
        C4557ng c4557ng;
        int intValue;
        C4731xb c4731xb;
        IronLog.INTERNAL.verbose();
        try {
            C4356cc c4356cc = (C4356cc) this.f8185a.d();
            if (c4356cc != null) {
                Integer r = c4356cc.r();
                if (r == null) {
                    intValue = this.C.a(this.o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(r, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r.intValue();
                }
                E0 e0 = this.s;
                if (e0 != null && (c4731xb = e0.f) != null) {
                    c4731xb.a(intValue);
                }
                c4356cc.P();
                this.f8185a.a(null);
                this.f8185a.b(null);
            }
            this.i = null;
            a(AbstractC4401f3.f.NONE);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            E0 e02 = this.s;
            if (e02 == null || (c4557ng = e02.j) == null) {
                return;
            }
            c4557ng.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4401f3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4356cc a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i, String currentAuctionId, C4561o2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new C4356cc(this, new C4541n0(IronSource.a.NATIVE_AD, this.o.o(), i, this.g, currentAuctionId, this.e, this.f, providerSettings, this.o.n()), adapter, this.i, item, this);
    }

    @Override // com.ironsource.AbstractC4401f3
    protected K0 d() {
        return new C4403f5();
    }

    @Override // com.ironsource.AbstractC4401f3
    protected String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4401f3
    protected String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4401f3
    protected boolean s() {
        return false;
    }

    public final void a(C4411fd c4411fd) {
        String format;
        int b;
        IronLog.INTERNAL.verbose("placement = " + c4411fd);
        if (c4411fd == null || TextUtils.isEmpty(c4411fd.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4411fd == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = A0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4411fd, this.o.b())) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4411fd.c()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = A0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.i = c4411fd;
            x();
        } else {
            IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC4401f3
    protected JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Xb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC4401f3
    protected void a(AbstractC4419g3<?> abstractC4419g3, AdInfo adInfo) {
        if (abstractC4419g3 instanceof C4356cc) {
            C4356cc c4356cc = (C4356cc) abstractC4419g3;
            this.t.a(c4356cc.Q(), c4356cc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4401f3
    protected void a(IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4401f3, com.ironsource.D0
    public Map<String, Object> a(B0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        C4411fd c4411fd = this.i;
        if (c4411fd != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c4411fd.c());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}

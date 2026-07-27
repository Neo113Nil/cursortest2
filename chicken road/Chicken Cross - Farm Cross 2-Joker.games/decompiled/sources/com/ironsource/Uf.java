package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    public static final Uf f7953a = new Uf();

    private Uf() {
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1.a(context, c(context));
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1.b(context, c(context));
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C1.g(context);
    }

    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.d().f());
        concurrentHashMap.putAll(C4515la.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.g().G();
    }

    public final JSONObject a(boolean z) {
        JSONObject b = IronSourceUtils.b(z);
        Intrinsics.checkNotNullExpressionValue(b, "getMediationAdditionalData(isDemandOnlyMode)");
        return b;
    }

    public final JSONObject b() {
        JSONObject b = I6.a().b();
        Intrinsics.checkNotNullExpressionValue(b, "getProperties().toJSON()");
        return b;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.d().g();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Uf uf = f7953a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String a2 = uf.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(a2, uf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
        return jSONObject;
    }

    public final void a(InterfaceC4355cb interfaceC4355cb) {
        C4291a8.a().b(interfaceC4355cb);
    }

    public final LevelPlayAdSize b(String str, int i, int i2) {
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.f)) {
            if (Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    public final void a(InterfaceC4570ob interfaceC4570ob) {
        Ld.a().b(interfaceC4570ob);
    }

    public final void a(Aa aa) {
        C4686v2.a().b(aa);
    }

    public final int a() {
        return Ib.v.d().a().c();
    }

    public final String a(C4411fd c4411fd) {
        String c;
        return (c4411fd == null || (c = c4411fd.c()) == null) ? new String() : c;
    }

    public final String a(NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final ISBannerSize a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    public final com.ironsource.mediationsdk.o a(Activity activity, ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.o b = com.ironsource.mediationsdk.p.g().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().createBanner(activity, size)");
        return b;
    }

    public final void a(EnumC4707w5 event, JSONObject data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        C4412fe.i().a(new C4689v5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(Nf.b, str), TuplesKt.to("sdkVersion", str2)));
    }

    public final void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final String a(String key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null)) {
                    return key;
                }
                str = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null));
            } else {
                String str2 = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
                if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "_", false, 2, (Object) null)) {
                    return str2;
                }
                str = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str2, new String[]{"_"}, false, 0, 6, (Object) null));
            }
            return str;
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }
}

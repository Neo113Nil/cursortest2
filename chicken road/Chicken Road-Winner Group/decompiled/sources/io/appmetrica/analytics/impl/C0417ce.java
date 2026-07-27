package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417ce {

    /* renamed from: a, reason: collision with root package name */
    public static final C0417ce f7106a = new C0417ce();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f7107b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7108c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.13.0", "50142752");

    public final synchronized ExponentialBackoffDataHolder a(EnumC0365ae enumC0365ae) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = f7107b;
            obj = linkedHashMap.get(enumC0365ae);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Da(C0878ua.f8414H.z(), enumC0365ae), enumC0365ae.name());
                linkedHashMap.put(enumC0365ae, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(C0459e5 c0459e5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C0471eh c0471eh = new C0471eh(aESRSARequestBodyEncrypter);
        Fb fb = new Fb(c0459e5);
        return new NetworkTask(new BlockingExecutor(), new C0925w5(c0459e5.f7193a), new AllHostsExponentialBackoffPolicy(f7106a.a(EnumC0365ae.REPORT)), new C1013zh(c0459e5, c0471eh, fb, new FullUrlFormer(c0471eh, fb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c0459e5.i(), c0459e5.p(), c0459e5.u(), aESRSARequestBodyEncrypter), X0.a.z(new C0685mo()), f7108c);
    }
}

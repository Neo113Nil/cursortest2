package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4269zd {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7522a = new AtomicBoolean(false);
    public static final SignalsConfig b;
    public static final String c;
    public static final Lazy d;
    public static final Lazy e;
    public static Boolean f;
    public static final Function2 g;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class);
        b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = com.moloco.sdk.internal.ilrd.provider.a.k;
        }
        c = topic;
        d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.zd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC4269zd.d();
            }
        });
        e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.zd$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC4269zd.b());
            }
        });
        g = new Function2() { // from class: com.inmobi.media.zd$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC4269zd.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final Unit a(Bundle bundle, String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (bundle != null) {
            try {
                if (Intrinsics.areEqual(topic, c)) {
                    LinkedHashMap a2 = a(bundle);
                    if (a2 != null) {
                        C3770hi.f7146a.getClass();
                        C3770hi.a(a2);
                        String str = "Saved signals: " + a2;
                    }
                } else {
                    String str2 = "Event received on unsupported topic: " + topic;
                }
            } catch (Throwable unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean b() {
        try {
            Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicator");
            if (Intrinsics.areEqual(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).getReturnType(), cls) && Intrinsics.areEqual(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), Void.TYPE)) {
                return Intrinsics.areEqual(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", new Class[0]).getReturnType(), String.class);
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        String str;
        Boolean bool = f;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            String str2 = "Using cached value for isVersionInDenyList: " + booleanValue;
            return booleanValue;
        }
        try {
            Object obj = Class.forName("com.applovin.sdk.AppLovinSdk").getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
        } catch (Throwable unused) {
        }
        str = com.ironsource.Y1.f;
        List<String> incompatibleSdkVer = b.getPublisher().getAuto().getIncompatibleSdkVer();
        String str3 = "AppLovin SDK version: " + str + ", Deny list: " + incompatibleSdkVer;
        boolean z = Intrinsics.areEqual(str, com.ironsource.Y1.f) || incompatibleSdkVer.contains(str);
        f = Boolean.valueOf(z);
        return z;
    }

    public static final SignalCollector d() {
        return new SignalCollector(CollectionsKt.listOf(c));
    }

    public static void a() {
        if (b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) e.getValue()).booleanValue() && c.length() != 0 && f7522a.compareAndSet(false, true)) {
            ((SignalCollector) d.getValue()).setupAppLovinCommunicator(g);
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!f7522a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        String str = "Allowed keys: " + allowedKeys.keySet();
        Set<String> keySet = data.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNull(keySet);
        if (keySet.contains(FirebaseAnalytics.Param.AD_FORMAT) && (obj2 = data.get(FirebaseAnalytics.Param.AD_FORMAT)) != null) {
            linkedHashMap.put("auto_type", obj2);
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (keySet.contains(key)) {
                String name = value.getName();
                if (AbstractC3727g4.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}

package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3648d9 {

    /* renamed from: a, reason: collision with root package name */
    public static String f7066a;

    public static String a() {
        boolean booleanValue;
        Boolean bool = AbstractC3940ni.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3940ni.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (booleanValue) {
            Intrinsics.checkNotNullExpressionValue("d9", "TAG");
            return null;
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        J4 j42 = AbstractC4260z4.f7518a;
        if (CollectionsKt.contains(((RootConfig) j42.a(RootConfig.class)).getIPAddrTPSupport(), AbstractC3942nk.b)) {
            Intrinsics.checkNotNullExpressionValue("d9", "TAG");
            String str = "getting " + f7066a;
            return f7066a;
        }
        Intrinsics.checkNotNullExpressionValue("d9", "TAG");
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        String str2 = "TP not supported for IP address rootConfig.ipAddrTPSupport=" + ((RootConfig) j42.a(RootConfig.class)).getIPAddrTPSupport() + " SdkInfo.tpName=" + AbstractC3942nk.b;
        return null;
    }

    static {
        a(AbstractC3761ha.a());
        Intrinsics.checkNotNullExpressionValue("d9", "TAG");
        String str = "init " + AbstractC3761ha.a();
    }

    public static void a(String str) {
        boolean booleanValue;
        Boolean bool = AbstractC3940ni.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC3940ni.b = Boolean.valueOf(a2.f6510a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3940ni.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!booleanValue) {
            f7066a = str;
            AbstractC3761ha.a(str);
        } else {
            f7066a = null;
            AbstractC3761ha.a(null);
        }
    }
}

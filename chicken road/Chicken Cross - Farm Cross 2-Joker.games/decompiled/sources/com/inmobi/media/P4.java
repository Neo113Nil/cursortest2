package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6775a = "P4";

    public final C4170vn a(D2 configResponseObj, N4 configRequestContext) {
        Integer num;
        Intrinsics.checkNotNullParameter(configResponseObj, "configResponseObj");
        Intrinsics.checkNotNullParameter(configRequestContext, "configRequestContext");
        int b = configResponseObj.b();
        Config config = configRequestContext.b;
        if (b == 200) {
            try {
                Config a2 = configResponseObj.a();
                if (a2 == null) {
                    String tag = this.f6775a;
                    Intrinsics.checkNotNullExpressionValue(tag, "tag");
                    num = 3;
                } else if (a2.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.f6775a;
                    Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    b = num.intValue();
                } else {
                    if (a2 == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = a2;
                }
            } catch (IllegalArgumentException unused) {
                b = 2;
            }
        } else if (b != 304) {
            String tag3 = this.f6775a;
            Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            String str = "Config fetch failed with status code " + b;
            b += 1000;
        } else {
            String tag4 = this.f6775a;
            Intrinsics.checkNotNullExpressionValue(tag4, "tag");
            String str2 = "Config not modified " + configRequestContext.b.getType();
        }
        return new C4170vn(b, config);
    }
}

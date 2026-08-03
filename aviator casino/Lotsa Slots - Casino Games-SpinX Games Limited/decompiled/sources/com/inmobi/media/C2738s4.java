package com.inmobi.media;

/* renamed from: com.inmobi.media.s4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2738s4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5439a = "s4";

    public final com.inmobi.media.Al a(com.inmobi.media.C2448h2 configResponseObj, com.inmobi.media.C2687q4 configRequestContext) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configResponseObj, "configResponseObj");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configRequestContext, "configRequestContext");
        int b = configResponseObj.b();
        com.inmobi.media.core.config.models.Config config = configRequestContext.b;
        if (b == 200) {
            try {
                com.inmobi.media.core.config.models.Config a2 = configResponseObj.a();
                if (a2 == null) {
                    java.lang.String tag = this.f5439a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
                    num = 3;
                } else if (a2.isValid()) {
                    num = null;
                } else {
                    java.lang.String tag2 = this.f5439a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    b = num.intValue();
                } else {
                    if (a2 == null) {
                        throw new java.lang.IllegalArgumentException("Config object is null");
                    }
                    config = a2;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                b = 2;
            }
        } else if (b != 304) {
            java.lang.String tag3 = this.f5439a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            b += 1000;
        } else {
            java.lang.String tag4 = this.f5439a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag4, "tag");
            configRequestContext.b.getType();
        }
        return new com.inmobi.media.Al(b, config);
    }
}

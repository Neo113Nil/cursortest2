package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L4 implements com.inmobi.media.InterfaceC2846w4 {
    @Override // com.inmobi.media.InterfaceC2846w4
    public final void a(com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "access$getTAG$p(...)");
            com.inmobi.media.O4 o42 = com.inmobi.media.O4.f4868a;
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
            com.inmobi.media.O4.e = com.inmobi.media.AbstractC2293b6.a(((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getKA());
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "c_data_store");
                android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                int i = 1;
                if (context2 != null) {
                    com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context2, "c_data_store");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                    i = a3.f4815a.getInt("akv", 1);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                if (((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getVAK() != i) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                    a2.a("akv", ((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getVAK(), false);
                    o42.f();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}

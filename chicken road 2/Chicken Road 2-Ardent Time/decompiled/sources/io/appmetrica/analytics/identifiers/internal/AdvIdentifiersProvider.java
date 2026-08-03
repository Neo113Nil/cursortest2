package io.appmetrica.analytics.identifiers.internal;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3881a = 0;
    private static final io.appmetrica.analytics.identifiers.impl.d retriever = new io.appmetrica.analytics.identifiers.impl.d();

    public static android.os.Bundle requestIdentifiers(android.content.Context context, android.os.Bundle bundle) {
        io.appmetrica.analytics.identifiers.impl.c a2;
        io.appmetrica.analytics.identifiers.impl.b bVar = (io.appmetrica.analytics.identifiers.impl.b) retriever.f3864a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (bVar == null || (a2 = bVar.a(context)) == null) {
            return null;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        io.appmetrica.analytics.identifiers.impl.a aVar = a2.f3862b;
        if (aVar != null) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", aVar.f3858a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", aVar.f3859b);
            java.lang.Boolean bool = aVar.f3860c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", a2.f3861a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", a2.f3863c);
        return bundle2;
    }
}

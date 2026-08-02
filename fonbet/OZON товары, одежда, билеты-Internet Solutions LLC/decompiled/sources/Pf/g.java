package Pf;

import Pf.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes10.dex */
public final class g extends m {
    public g(String str, String str2, String str3) {
        super(str);
        Nf.b.d(str2);
        Nf.b.d(str3);
        b e11 = e();
        e11.c(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        e11.c("publicId", str2);
        e11.c("systemId", str3);
        if (O("publicId")) {
            e().c("pubSysKey", "PUBLIC");
        } else if (O("systemId")) {
            e().c("pubSysKey", "SYSTEM");
        }
    }

    private boolean O(String str) {
        return !Of.k.f(c(str));
    }

    @Override // Pf.n
    final void A(Of.b bVar, f.a aVar) {
        if (aVar.g() != f.a.EnumC0445a.html || O("publicId") || O("systemId")) {
            bVar.b("<!DOCTYPE");
        } else {
            bVar.b("<!doctype");
        }
        if (O(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
            bVar.b(" ").b(c(AppMeasurementSdk.ConditionalUserProperty.NAME));
        }
        if (O("pubSysKey")) {
            bVar.b(" ").b(c("pubSysKey"));
        }
        if (O("publicId")) {
            bVar.b(" \"").b(c("publicId")).a('\"');
        }
        if (O("systemId")) {
            bVar.b(" \"").b(c("systemId")).a('\"');
        }
        bVar.a('>');
    }

    @Override // Pf.n
    public final String w() {
        return "#doctype";
    }
}

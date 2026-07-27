package a4;

import L3.j;
import V2.e;
import java.util.Objects;
import java.util.logging.Logger;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0197c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0195a f3886a;

    static {
        Logger logger = Logger.getLogger(AbstractC0197c.class.getName());
        Q2.b bVar = Q2.b.f2476a;
        e a6 = e.a(bVar, "service.name");
        e a7 = e.a(bVar, "telemetry.sdk.language");
        e a8 = e.a(bVar, "telemetry.sdk.name");
        e a9 = e.a(bVar, "telemetry.sdk.version");
        C0195a a10 = a(Q2.a.f2475d, null);
        C0195a a11 = a(Q2.c.d(a6, "unknown_service:java"), null);
        j jVar = new j(1);
        jVar.e(a8, "opentelemetry");
        jVar.e(a7, "java");
        jVar.e(a9, "1.55.0");
        C0195a a12 = a(jVar.b(), null);
        if (a12 != a10) {
            j jVar2 = new j(1);
            jVar2.g(a11.f3885c);
            jVar2.g(a12.f3885c);
            String str = a11.f3884b;
            String str2 = a12.f3884b;
            if (str2 == null) {
                a11 = a(jVar2.b(), str);
            } else if (str == null) {
                a11 = a(jVar2.b(), str2);
            } else if (str2.equals(str)) {
                a11 = a(jVar2.b(), str);
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                a11 = a(jVar2.b(), null);
            }
        }
        f3886a = a11;
    }

    public static C0195a a(Q2.a aVar, String str) {
        Objects.requireNonNull(aVar, "attributes");
        aVar.forEach(new C0196b());
        return new C0195a(aVar, str);
    }
}

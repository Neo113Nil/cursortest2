package io.appmetrica.analytics.logger.common;

/* loaded from: classes.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.logger.common.impl.c f7268a;

    public BaseImportantLogger(java.lang.String str) {
        this.f7268a = new io.appmetrica.analytics.logger.common.impl.c(new io.appmetrica.analytics.logger.common.impl.d(str), new io.appmetrica.analytics.logger.common.impl.a(), new io.appmetrica.analytics.logger.common.impl.b());
    }

    public void info(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        io.appmetrica.analytics.logger.common.impl.c cVar = this.f7268a;
        cVar.f7275b.getClass();
        java.util.Iterator it = cVar.f7276c.a(io.appmetrica.analytics.logger.common.impl.a.a(str, str2, objArr)).iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            java.lang.String str4 = cVar.f7274a.f7277a;
            if (str3 == null) {
                str3 = "";
            }
            android.util.Log.println(4, str4, str3);
        }
    }
}

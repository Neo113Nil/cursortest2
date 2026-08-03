package io.appmetrica.analytics.logger.common;

/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile java.lang.String f7269d = "";

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7270a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f7271b = false;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.logger.common.impl.c f7272c;

    public BaseReleaseLogger(java.lang.String str, java.lang.String str2) {
        this.f7272c = new io.appmetrica.analytics.logger.common.impl.c(new io.appmetrica.analytics.logger.common.impl.d(str), new io.appmetrica.analytics.logger.common.impl.a(), new io.appmetrica.analytics.logger.common.impl.b());
        this.f7270a = str2;
    }

    public static void init(android.content.Context context) {
        f7269d = "[" + context.getPackageName() + "] : ";
    }

    public void error(java.lang.String str, java.lang.Object... objArr) {
        if (this.f7271b) {
            io.appmetrica.analytics.logger.common.impl.c cVar = this.f7272c;
            java.lang.String prefix = getPrefix();
            cVar.f7275b.getClass();
            java.util.Iterator it = cVar.f7276c.a(io.appmetrica.analytics.logger.common.impl.a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String str3 = cVar.f7274a.f7277a;
                if (str2 == null) {
                    str2 = "";
                }
                android.util.Log.println(6, str3, str2);
            }
        }
    }

    public java.lang.String getPrefix() {
        return f7269d + this.f7270a;
    }

    public void info(java.lang.String str, java.lang.Object... objArr) {
        if (this.f7271b) {
            io.appmetrica.analytics.logger.common.impl.c cVar = this.f7272c;
            java.lang.String prefix = getPrefix();
            cVar.f7275b.getClass();
            java.util.Iterator it = cVar.f7276c.a(io.appmetrica.analytics.logger.common.impl.a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String str3 = cVar.f7274a.f7277a;
                if (str2 == null) {
                    str2 = "";
                }
                android.util.Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z2) {
        this.f7271b = z2;
    }

    public void warning(java.lang.String str, java.lang.Object... objArr) {
        if (this.f7271b) {
            io.appmetrica.analytics.logger.common.impl.c cVar = this.f7272c;
            java.lang.String prefix = getPrefix();
            cVar.f7275b.getClass();
            java.util.Iterator it = cVar.f7276c.a(io.appmetrica.analytics.logger.common.impl.a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String str3 = cVar.f7274a.f7277a;
                if (str2 == null) {
                    str2 = "";
                }
                android.util.Log.println(5, str3, str2);
            }
        }
    }

    public void error(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (this.f7271b) {
            io.appmetrica.analytics.logger.common.impl.c cVar = this.f7272c;
            java.lang.String prefix = getPrefix();
            cVar.f7275b.getClass();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(android.util.Log.getStackTraceString(th));
            java.util.Iterator it = cVar.f7276c.a(io.appmetrica.analytics.logger.common.impl.a.a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                java.lang.String str3 = cVar.f7274a.f7277a;
                if (str2 == null) {
                    str2 = "";
                }
                android.util.Log.println(6, str3, str2);
            }
        }
    }
}

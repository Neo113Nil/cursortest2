package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f8789d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f8790a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f8791b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f8792c;

    public BaseReleaseLogger(String str, String str2) {
        this.f8792c = new c(new d(str), new a(), new b());
        this.f8790a = str2;
    }

    public static void init(Context context) {
        f8789d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f8791b) {
            c cVar = this.f8792c;
            String prefix = getPrefix();
            cVar.f8795b.getClass();
            Iterator it = cVar.f8796c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8794a.f8797a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f8789d + this.f8790a;
    }

    public void info(String str, Object... objArr) {
        if (this.f8791b) {
            c cVar = this.f8792c;
            String prefix = getPrefix();
            cVar.f8795b.getClass();
            Iterator it = cVar.f8796c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8794a.f8797a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z3) {
        this.f8791b = z3;
    }

    public void warning(String str, Object... objArr) {
        if (this.f8791b) {
            c cVar = this.f8792c;
            String prefix = getPrefix();
            cVar.f8795b.getClass();
            Iterator it = cVar.f8796c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8794a.f8797a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f8791b) {
            c cVar = this.f8792c;
            String prefix = getPrefix();
            cVar.f8795b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(Log.getStackTraceString(th));
            Iterator it = cVar.f8796c.a(a.a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f8794a.f8797a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}

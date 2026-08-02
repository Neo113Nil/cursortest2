package j3;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final l f17529a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f17530b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f17531c;

    static {
        new l(0, m.h1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new l(1, m.h1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f17529a = new l(2, m.h1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f17530b = new l(3, m.h1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    }

    public static synchronized void a(Context context) {
        synchronized (p.class) {
            if (f17531c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f17531c = context.getApplicationContext();
            }
        }
    }
}

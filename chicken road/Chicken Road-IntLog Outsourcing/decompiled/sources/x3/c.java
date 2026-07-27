package x3;

import L3.m;
import L3.n;
import V0.j;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f12310f = Logger.getLogger(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f12311a = new n(f12310f);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f12312b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final String f12313c;

    /* renamed from: d, reason: collision with root package name */
    public final h f12314d;

    /* renamed from: e, reason: collision with root package name */
    public final j f12315e;

    public c(m mVar, h hVar, D3.h hVar2, int i2, String str) {
        String str2;
        int i3 = mVar.f1517e.f1513b;
        if (i3 == 1) {
            str2 = "SPAN";
        } else if (i3 == 2) {
            str2 = "METRIC";
        } else if (i3 == 3) {
            str2 = "LOG";
        } else {
            if (i3 != 4) {
                throw null;
            }
            str2 = "PROFILE";
        }
        this.f12313c = str2.toLowerCase(Locale.ENGLISH);
        this.f12314d = hVar;
        this.f12315e = new j(i2, hVar2, mVar, str);
    }
}

package Lf;

import java.util.Date;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
final class f extends a implements g {

    /* renamed from: b, reason: collision with root package name */
    static final f f17054b = new f(0);

    @Override // Lf.a, Lf.g
    public final long X(Object obj, ISOChronology iSOChronology) {
        return ((Date) obj).getTime();
    }

    @Override // Lf.c
    public final Class<?> v() {
        return Date.class;
    }
}

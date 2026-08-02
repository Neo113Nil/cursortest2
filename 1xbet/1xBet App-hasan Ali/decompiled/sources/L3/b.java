package L3;

import F3.m;
import F3.p;
import F3.y;
import F3.z;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3033b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f3034a;

    public class a implements z {
        @Override // F3.z
        public final y a(m mVar, M3.a aVar) {
            if (aVar.f3616a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i) {
        this();
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        Time time;
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f3034a.getTimeZone();
            try {
                try {
                    time = new Time(this.f3034a.parse(I5).getTime());
                } catch (ParseException e3) {
                    throw new p("Failed parsing '" + I5 + "' as SQL Time; at path " + aVar.m(true), e3);
                }
            } finally {
                this.f3034a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            format = this.f3034a.format((Date) time);
        }
        bVar.E(format);
    }

    private b() {
        this.f3034a = new SimpleDateFormat("hh:mm:ss a");
    }
}

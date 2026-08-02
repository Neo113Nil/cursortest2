package L3;

import F3.m;
import F3.p;
import F3.y;
import F3.z;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final C0000a f3031b = new C0000a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f3032a;

    /* renamed from: L3.a$a, reason: collision with other inner class name */
    public class C0000a implements z {
        @Override // F3.z
        public final y a(m mVar, M3.a aVar) {
            if (aVar.f3616a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        Date date;
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f3032a.getTimeZone();
            try {
                try {
                    date = new Date(this.f3032a.parse(I5).getTime());
                } catch (ParseException e3) {
                    throw new p("Failed parsing '" + I5 + "' as SQL Date; at path " + aVar.m(true), e3);
                }
            } finally {
                this.f3032a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            format = this.f3032a.format((java.util.Date) date);
        }
        bVar.E(format);
    }

    private a() {
        this.f3032a = new SimpleDateFormat("MMM d, yyyy");
    }
}

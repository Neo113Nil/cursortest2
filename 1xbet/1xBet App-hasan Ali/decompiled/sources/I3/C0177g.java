package I3;

import a3.AbstractC0467k;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: I3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177g extends F3.y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0175e f2647c = new C0175e();

    /* renamed from: a, reason: collision with root package name */
    public final C0176f f2648a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2649b;

    public C0177g() {
        C0176f c0176f = C0176f.f2646a;
        ArrayList arrayList = new ArrayList();
        this.f2649b = arrayList;
        this.f2648a = c0176f;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (H3.j.f2331a >= 9) {
            arrayList.add(new SimpleDateFormat(AbstractC0467k.v("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        Date b3;
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        String I5 = aVar.I();
        synchronized (this.f2649b) {
            try {
                ArrayList arrayList = this.f2649b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            b3 = J3.a.b(I5, new ParsePosition(0));
                            break;
                        } catch (ParseException e3) {
                            StringBuilder w5 = AbstractC0467k.w("Failed parsing '", I5, "' as Date; at path ");
                            w5.append(aVar.m(true));
                            throw new F3.p(w5.toString(), e3);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b3 = dateFormat.parse(I5);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2648a.getClass();
        return b3;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f2649b.get(0);
        synchronized (this.f2649b) {
            format = dateFormat.format(date);
        }
        bVar.E(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f2649b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}

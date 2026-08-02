package I3;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class N extends F3.y {
    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.I(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Locale locale = (Locale) obj;
        bVar.E(locale == null ? null : locale.toString());
    }
}

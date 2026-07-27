package l1;

import j1.InterfaceC1058f;
import j1.InterfaceC1059g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements InterfaceC1058f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f9919a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f9919a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // j1.InterfaceC1053a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC1059g) obj2).b(f9919a.format((Date) obj));
    }
}

package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements eh1 {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f5042a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f5042a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // p000.InterfaceC0633qw
    /* JADX INFO: renamed from: a */
    public final void mo103a(Object obj, Object obj2) {
        ((fh1) obj2).mo1791b(f5042a.format((Date) obj));
    }
}

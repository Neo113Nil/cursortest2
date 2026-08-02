package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0358jg {

    /* JADX INFO: renamed from: a */
    public static final Charset f3919a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f3920b;

    static {
        Charset.forName("ISO-8859-1");
        f3920b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}

package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: ig */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0321ig {

    /* JADX INFO: renamed from: a */
    public static final Charset f3562a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f3562a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}

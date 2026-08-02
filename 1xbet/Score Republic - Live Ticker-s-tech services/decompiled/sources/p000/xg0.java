package p000;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public interface xg0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f8961a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    void mo1038b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

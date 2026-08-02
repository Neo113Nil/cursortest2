package okio;

import kotlin.jvm.JvmName;
import okio.C1193h;

@JvmName(name = "-Base64")
/* renamed from: okio.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1186a {
    public static final byte[] a;

    static {
        C1193h.Companion.getClass();
        a = C1193h.a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").a;
        C1193h.a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}

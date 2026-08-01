package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o {
    public static final i.a.AbstractC1530a a(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return e instanceof UnknownHostException ? i.a.AbstractC1530a.q.c : e instanceof SocketException ? i.a.AbstractC1530a.C1532i.c : e instanceof SSLHandshakeException ? i.a.AbstractC1530a.j.c : e instanceof IOException ? i.a.AbstractC1530a.f.c : e instanceof SecurityException ? i.a.AbstractC1530a.g.c : e instanceof p ? i.a.AbstractC1530a.m.c : e instanceof NumberFormatException ? i.a.AbstractC1530a.l.c : i.a.AbstractC1530a.r.c;
    }
}

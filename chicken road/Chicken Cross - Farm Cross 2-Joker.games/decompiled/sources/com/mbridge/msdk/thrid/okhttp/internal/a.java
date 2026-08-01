package com.mbridge.msdk.thrid.okhttp.internal;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.r;
import java.io.IOException;
import java.net.Socket;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* compiled from: Internal.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f9879a;

    public abstract int a(a0.a aVar);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar, c0 c0Var);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar);

    @Nullable
    public abstract IOException a(com.mbridge.msdk.thrid.okhttp.d dVar, @Nullable IOException iOException);

    public abstract Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar);

    public abstract void a(j jVar, SSLSocket sSLSocket, boolean z);

    public abstract void a(r.a aVar, String str);

    public abstract void a(r.a aVar, String str, String str2);

    public abstract boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2);

    public abstract boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);

    public abstract void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);
}

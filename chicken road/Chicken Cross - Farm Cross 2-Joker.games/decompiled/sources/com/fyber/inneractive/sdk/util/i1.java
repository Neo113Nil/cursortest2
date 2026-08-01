package com.fyber.inneractive.sdk.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.jvm.JvmStatic;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f5952a = new i1();
    private static final String b = IAlog.a(i1.class);
    private static final AtomicBoolean c = new AtomicBoolean(false);

    private i1() {
    }

    @JvmStatic
    public static final void a() throws Throwable {
        if (c.compareAndSet(false, true)) {
            IAlog.c(b + "SDK integration health check — Kotlin runtime %s", KotlinVersion.CURRENT.toString());
        }
    }

    private static /* synthetic */ void b() {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* renamed from: com.google.android.gms.internal.ads.du, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908du {

    /* renamed from: c, reason: collision with root package name */
    public static final C1091hx f13198c = new C1091hx("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f13199d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C0802bc f13200a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13201b;

    public C0908du(Context context) {
        if (AbstractC1131iu.a(context)) {
            this.f13200a = new C0802bc(context.getApplicationContext(), f13198c, f13199d);
        } else {
            this.f13200a = null;
        }
        this.f13201b = context.getPackageName();
    }

    public static void b(String str, Consumer consumer) {
        if ((str == null ? "" : str).trim().isEmpty()) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    public static boolean c(A0.J0 j02, String str, List list) {
        Stream stream;
        boolean anyMatch;
        stream = list.stream();
        anyMatch = stream.anyMatch(new C1623ts(1));
        if (anyMatch) {
            return true;
        }
        f13198c.a(str, new Object[0]);
        j02.x(new Zt(null, 8160));
        return false;
    }

    public final void a(C0775au c0775au, A0.J0 j02, int i) {
        C0802bc c0802bc = this.f13200a;
        if (c0802bc == null) {
            f13198c.a("error: %s", "Play Store not found.");
        } else if (c(j02, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(c0775au.f12728a, c0775au.f12729b))) {
            c0802bc.l(new RunnableC1043gu(c0802bc, new RunnableC1609te(this, c0775au, i, j02), 1));
        }
    }
}

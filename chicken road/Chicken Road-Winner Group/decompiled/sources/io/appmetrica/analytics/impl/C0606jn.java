package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606jn {

    /* renamed from: a, reason: collision with root package name */
    public final C0946x0 f7666a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f7667b;

    /* renamed from: c, reason: collision with root package name */
    public final C0712o f7668c;

    /* renamed from: d, reason: collision with root package name */
    public final C0398bl f7669d;

    /* renamed from: e, reason: collision with root package name */
    public final L5 f7670e;
    public final C0593ja f;

    public C0606jn(C0946x0 c0946x0, Io io2, C0712o c0712o, C0398bl c0398bl, L5 l5, C0593ja c0593ja) {
        this.f7666a = c0946x0;
        this.f7667b = io2;
        this.f7668c = c0712o;
        this.f7669d = c0398bl;
        this.f7670e = l5;
        this.f = c0593ja;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new A0.r(12));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0606jn(C0946x0 c0946x0, Io io2) {
        this(c0946x0, io2, C0587j4.l().a(), C0587j4.l().o(), C0587j4.l().h(), C0587j4.l().k());
    }
}

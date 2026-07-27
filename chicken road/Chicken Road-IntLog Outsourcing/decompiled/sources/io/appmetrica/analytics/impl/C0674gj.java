package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674gj implements InterfaceC0783l {

    /* renamed from: a, reason: collision with root package name */
    public C0515af f8284a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f8285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8286c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8287d;

    /* renamed from: e, reason: collision with root package name */
    public final C0648fj f8288e = new C0648fj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f8289f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f8289f = new WeakReference(activity);
            if (!this.f8287d) {
                if (this.f8284a == null) {
                    this.f8284a = new C0515af(C0662g7.a(activity).a());
                }
                C0515af c0515af = this.f8284a;
                kotlin.jvm.internal.i.b(c0515af);
                this.f8285b = c0515af.p();
                if (this.f8284a == null) {
                    this.f8284a = new C0515af(C0662g7.a(activity).a());
                }
                C0515af c0515af2 = this.f8284a;
                kotlin.jvm.internal.i.b(c0515af2);
                this.f8286c = c0515af2.t();
                this.f8287d = true;
            }
            if (this.f8285b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f8288e.getClass();
            ScreenInfo a6 = C0648fj.a(context);
            if (a6 == null || a6.equals(this.f8285b)) {
                return;
            }
            this.f8285b = a6;
            if (this.f8284a == null) {
                this.f8284a = new C0515af(C0662g7.a(context).a());
            }
            C0515af c0515af = this.f8284a;
            kotlin.jvm.internal.i.b(c0515af);
            c0515af.a(this.f8285b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.f8287d) {
                if (this.f8284a == null) {
                    this.f8284a = new C0515af(C0662g7.a(context).a());
                }
                C0515af c0515af = this.f8284a;
                kotlin.jvm.internal.i.b(c0515af);
                this.f8285b = c0515af.p();
                if (this.f8284a == null) {
                    this.f8284a = new C0515af(C0662g7.a(context).a());
                }
                C0515af c0515af2 = this.f8284a;
                kotlin.jvm.internal.i.b(c0515af2);
                this.f8286c = c0515af2.t();
                this.f8287d = true;
            }
            b((Context) this.f8289f.get());
            if (this.f8285b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f8286c) {
                        b(context);
                        this.f8286c = true;
                        if (this.f8284a == null) {
                            this.f8284a = new C0515af(C0662g7.a(context).a());
                        }
                        C0515af c0515af3 = this.f8284a;
                        kotlin.jvm.internal.i.b(c0515af3);
                        c0515af3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8285b;
    }

    public final void a(C0515af c0515af) {
        this.f8284a = c0515af;
    }
}

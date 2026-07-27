package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525gj implements InterfaceC0634l {

    /* renamed from: a, reason: collision with root package name */
    public C0366af f7383a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f7384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7385c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7386d;

    /* renamed from: e, reason: collision with root package name */
    public final C0499fj f7387e = new C0499fj();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f = new WeakReference(activity);
            if (!this.f7386d) {
                if (this.f7383a == null) {
                    this.f7383a = new C0366af(C0513g7.a(activity).a());
                }
                C0366af c0366af = this.f7383a;
                kotlin.jvm.internal.j.b(c0366af);
                this.f7384b = c0366af.p();
                if (this.f7383a == null) {
                    this.f7383a = new C0366af(C0513g7.a(activity).a());
                }
                C0366af c0366af2 = this.f7383a;
                kotlin.jvm.internal.j.b(c0366af2);
                this.f7385c = c0366af2.t();
                this.f7386d = true;
            }
            if (this.f7384b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f7387e.getClass();
            ScreenInfo a3 = C0499fj.a(context);
            if (a3 == null || a3.equals(this.f7384b)) {
                return;
            }
            this.f7384b = a3;
            if (this.f7383a == null) {
                this.f7383a = new C0366af(C0513g7.a(context).a());
            }
            C0366af c0366af = this.f7383a;
            kotlin.jvm.internal.j.b(c0366af);
            c0366af.a(this.f7384b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.f7386d) {
                if (this.f7383a == null) {
                    this.f7383a = new C0366af(C0513g7.a(context).a());
                }
                C0366af c0366af = this.f7383a;
                kotlin.jvm.internal.j.b(c0366af);
                this.f7384b = c0366af.p();
                if (this.f7383a == null) {
                    this.f7383a = new C0366af(C0513g7.a(context).a());
                }
                C0366af c0366af2 = this.f7383a;
                kotlin.jvm.internal.j.b(c0366af2);
                this.f7385c = c0366af2.t();
                this.f7386d = true;
            }
            b((Context) this.f.get());
            if (this.f7384b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f7385c) {
                        b(context);
                        this.f7385c = true;
                        if (this.f7383a == null) {
                            this.f7383a = new C0366af(C0513g7.a(context).a());
                        }
                        C0366af c0366af3 = this.f7383a;
                        kotlin.jvm.internal.j.b(c0366af3);
                        c0366af3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7384b;
    }

    public final void a(C0366af c0366af) {
        this.f7383a = c0366af;
    }
}

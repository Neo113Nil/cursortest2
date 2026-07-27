package io.appmetrica.analytics.impl;

import android.content.Context;
import d2.C0277g;
import d2.InterfaceC0273c;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599jg {

    /* renamed from: a, reason: collision with root package name */
    public final C0781qg f7624a;

    /* renamed from: b, reason: collision with root package name */
    public final Ga f7625b;

    /* renamed from: c, reason: collision with root package name */
    public final Bg f7626c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0273c f7627d = new C0277g(new C0522gg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0273c f7628e = new C0277g(new C0470eg(this));
    public final InterfaceC0273c f = new C0277g(new C0573ig(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7629g = new ArrayList();

    public C0599jg(C0781qg c0781qg, Ag ag, Ga ga, Bg bg) {
        this.f7624a = c0781qg;
        this.f7625b = ga;
        this.f7626c = bg;
    }

    public static final InterfaceC0393bg a(C0599jg c0599jg) {
        return (InterfaceC0393bg) ((C0277g) c0599jg.f7627d).a();
    }

    public static final void a(C0599jg c0599jg, C0832sg c0832sg, InterfaceC0393bg interfaceC0393bg) {
        boolean a3;
        c0599jg.f7629g.add(c0832sg);
        Bg bg = c0599jg.f7626c;
        if (c0832sg == null) {
            bg.getClass();
        } else {
            SafePackageManager safePackageManager = bg.f5767b;
            Context context = bg.f5766a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0832sg.f8311d.ordinal();
            if (ordinal == 1) {
                a3 = kotlin.jvm.internal.j.a(bg.f, installerPackageName);
            } else if (ordinal == 2) {
                a3 = kotlin.jvm.internal.j.a(bg.f5771g, installerPackageName);
            }
            if (a3) {
                c0599jg.a(c0832sg);
                return;
            }
        }
        interfaceC0393bg.a();
    }

    public final void a(C0832sg c0832sg) {
        C0781qg c0781qg = this.f7624a;
        synchronized (c0781qg) {
            c0781qg.f8161b = c0832sg;
            c0781qg.f8162c = true;
            c0781qg.f8163d.a(c0832sg);
            c0781qg.f8163d.d();
            c0781qg.a(c0781qg.f8161b);
        }
    }
}

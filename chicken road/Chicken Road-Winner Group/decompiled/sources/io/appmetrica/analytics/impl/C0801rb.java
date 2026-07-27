package io.appmetrica.analytics.impl;

import android.content.Context;
import e2.AbstractC0294i;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801rb {

    /* renamed from: a, reason: collision with root package name */
    public final C0715o2 f8217a = new C0715o2();

    /* renamed from: b, reason: collision with root package name */
    public final C0796r6 f8218b = new C0796r6();

    /* renamed from: c, reason: collision with root package name */
    public Bn f8219c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8220d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8221e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0362ab interfaceC0362ab) {
        if (this.f8221e) {
            return;
        }
        e2.m.W(this.f8218b.f8200a, new Ma[]{this.f8217a.a(context, appMetricaConfig, interfaceC0362ab)});
        this.f8221e = true;
    }

    public final synchronized void b() {
        if (this.f8220d) {
            return;
        }
        C0796r6 c0796r6 = this.f8218b;
        ArrayList arrayList = C0587j4.l().f7577i.f8097a;
        ArrayList arrayList2 = new ArrayList(AbstractC0294i.U(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0796r6.f8200a.addAll(arrayList2);
        this.f8220d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f8219c != null) {
                return;
            }
            X1 x12 = new X1(this.f8218b);
            this.f8219c = new Bn(x12);
            An an = new An();
            an.f5740a.add(x12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                an.f5740a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(an);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f8218b.f8200a.clear();
        this.f8220d = false;
        this.f8221e = false;
    }
}

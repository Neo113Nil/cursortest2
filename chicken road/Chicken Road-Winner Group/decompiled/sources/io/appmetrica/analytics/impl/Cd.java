package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5791a;

    /* renamed from: b, reason: collision with root package name */
    public final Ra f5792b;

    /* renamed from: c, reason: collision with root package name */
    public final E9 f5793c;

    /* renamed from: d, reason: collision with root package name */
    public final Ge f5794d;

    /* renamed from: e, reason: collision with root package name */
    public final C0814ro f5795e;
    public volatile IdentifiersResult f;

    public Cd(Context context, Ra ra) {
        this(context, ra, Dd.a(context), new Ge(context), new C0814ro());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0814ro c0814ro = this.f5795e;
            String str = identifiersResult.id;
            c0814ro.getClass();
            if (C0814ro.a(str)) {
                return identifiersResult;
            }
        }
        try {
            E9 e9 = this.f5793c;
            e9.f5904a.lock();
            e9.f5905b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0814ro c0814ro2 = this.f5795e;
            String str2 = identifiersResult.id;
            c0814ro2.getClass();
            if (C0814ro.a(str2)) {
                E9 e92 = this.f5793c;
                e92.f5905b.b();
                e92.f5904a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a3 = Qa.a(FileUtils.getFileFromSdkStorage(this.f5794d.f5988a, "uuid.dat"));
        this.f5795e.getClass();
        if (!C0814ro.a(a3)) {
            a3 = this.f5794d.a(this.f5792b.a(this.f5791a));
        }
        this.f5795e.getClass();
        if (C0814ro.a(a3)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a3, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        E9 e922 = this.f5793c;
        e922.f5905b.b();
        e922.f5904a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Cd(Context context, Ra ra, E9 e9, Ge ge, C0814ro c0814ro) {
        this.f5791a = context;
        this.f5792b = ra;
        this.f5793c = e9;
        this.f5794d = ge;
        this.f5795e = c0814ro;
        try {
            e9.a();
            ge.a();
            e9.b();
        } catch (Throwable unused) {
            this.f5793c.b();
        }
    }
}

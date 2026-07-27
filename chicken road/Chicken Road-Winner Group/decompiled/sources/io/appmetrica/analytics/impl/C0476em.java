package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476em extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final H3 f7262b;

    public C0476em(Context context, String str) {
        this(context, str, new SafePackageManager(), C0878ua.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0502fm load(S5 s5) {
        C0502fm c0502fm = (C0502fm) super.load(s5);
        C0605jm c0605jm = s5.f6552a;
        c0502fm.f7300d = c0605jm.f;
        c0502fm.f7301e = c0605jm.f7647g;
        C0451dm c0451dm = (C0451dm) s5.componentArguments;
        String str = c0451dm.f7164a;
        if (str != null) {
            c0502fm.f = str;
            c0502fm.f7302g = c0451dm.f7165b;
        }
        Map<String, String> map = c0451dm.f7166c;
        c0502fm.f7303h = map;
        c0502fm.f7304i = (C0999z3) this.f7262b.a(new C0999z3(map, Y7.f6854c));
        C0451dm c0451dm2 = (C0451dm) s5.componentArguments;
        c0502fm.f7306k = c0451dm2.f7167d;
        c0502fm.f7305j = c0451dm2.f7168e;
        C0605jm c0605jm2 = s5.f6552a;
        c0502fm.f7307l = c0605jm2.f7656p;
        c0502fm.f7308m = c0605jm2.f7658r;
        long j3 = c0605jm2.f7662v;
        if (c0502fm.f7309n == 0) {
            c0502fm.f7309n = j3;
        }
        return c0502fm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0502fm();
    }

    public C0476em(Context context, String str, SafePackageManager safePackageManager, H3 h3) {
        super(context, str, safePackageManager);
        this.f7262b = h3;
    }

    public final C0502fm a() {
        return new C0502fm();
    }
}

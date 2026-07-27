package io.appmetrica.analytics.impl;

import e2.AbstractC0292g;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867u implements InterfaceC0919w {

    /* renamed from: a, reason: collision with root package name */
    public final String f8377a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) AbstractC0292g.c0(X0.a.z(this.f8377a), C0587j4.l().m().f7328d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}

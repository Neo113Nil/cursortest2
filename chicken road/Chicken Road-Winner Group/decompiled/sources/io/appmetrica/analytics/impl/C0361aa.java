package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361aa {

    /* renamed from: a, reason: collision with root package name */
    public final Xl f6960a = new Xl();

    /* renamed from: b, reason: collision with root package name */
    public C0413ca f6961b = new C0413ca();

    public final synchronized void a(C0413ca c0413ca) {
        this.f6961b = c0413ca;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.j.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f6961b.f7100a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C0413ca c0413ca = this.f6961b;
                    IdentifierStatus identifierStatus = c0413ca.f7101b;
                    String str2 = c0413ca.f7102c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new T0.b();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f6960a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class L6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final J6 f7064a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7065b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f7066c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f7067d = new HashSet();

    public L6(J6 j6) {
        this.f7064a = j6;
        this.f7065b = ((K6) j6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC0860no.a(bool)) {
                if (this.f7065b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f7065b = Boolean.valueOf(equals);
            ((K6) this.f7064a).f7031a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f7065b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f7065b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z;
        if (!this.f7066c.contains(str)) {
            z = Boolean.TRUE.equals(this.f7065b);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f7065b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f7067d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!AbstractC0860no.a(bool)) {
                if (!this.f7067d.contains(str) && !this.f7066c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f7067d.add(str);
                this.f7066c.remove(str);
            } else {
                this.f7066c.add(str);
                this.f7067d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

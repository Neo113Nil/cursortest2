package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class L6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final J6 f6209a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f6210b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f6211c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6212d = new HashSet();

    public L6(J6 j6) {
        this.f6209a = j6;
        this.f6210b = ((K6) j6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!AbstractC0711no.a(bool)) {
                if (this.f6210b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f6210b = Boolean.valueOf(equals);
            ((K6) this.f6209a).f6178a.c(equals).b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f6210b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f6210b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(String str) {
        boolean z3;
        if (!this.f6211c.contains(str)) {
            z3 = Boolean.TRUE.equals(this.f6210b);
        }
        return z3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f6210b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f6212d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (!AbstractC0711no.a(bool)) {
                if (!this.f6212d.contains(str) && !this.f6211c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f6212d.add(str);
                this.f6211c.remove(str);
            } else {
                this.f6211c.add(str);
                this.f6212d.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

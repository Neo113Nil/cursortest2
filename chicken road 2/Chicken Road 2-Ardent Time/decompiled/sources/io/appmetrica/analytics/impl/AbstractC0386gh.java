package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0386gh implements io.appmetrica.analytics.impl.InterfaceC0412hh {

    /* renamed from: a, reason: collision with root package name */
    protected final io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController f5990a;

    public AbstractC0386gh(io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController dataSendingRestrictionController) {
        this.f5990a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0412hh
    public boolean a(java.lang.Boolean bool) {
        return ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool, java.lang.Boolean.TRUE)).booleanValue();
    }
}

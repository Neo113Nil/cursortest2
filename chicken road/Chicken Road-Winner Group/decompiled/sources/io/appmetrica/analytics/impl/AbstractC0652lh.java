package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652lh implements InterfaceC0678mh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f7814a;

    public AbstractC0652lh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f7814a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0678mh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}

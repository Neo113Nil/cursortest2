package io.appmetrica.analytics.impl;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(28)
/* loaded from: classes.dex */
public final class Ef implements io.appmetrica.analytics.impl.Cf {
    @Override // io.appmetrica.analytics.impl.Cf
    public java.lang.String a() {
        java.lang.String processName;
        processName = android.app.Application.getProcessName();
        return processName;
    }
}

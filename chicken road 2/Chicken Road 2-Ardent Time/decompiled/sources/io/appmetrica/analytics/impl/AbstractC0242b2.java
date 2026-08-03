package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0242b2 {
    public static final io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever a() {
        return io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.google.android.gms.appset.AppSet") ? new io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever() : new io.appmetrica.analytics.impl.U7();
    }
}

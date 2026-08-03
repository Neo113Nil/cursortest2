package io.appmetrica.analytics.appsetid.internal;

/* loaded from: classes.dex */
public interface AppSetIdListener {
    void onAppSetIdRetrieved(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope appSetIdScope);

    void onFailure(java.lang.Throwable th);
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U7 implements io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever {
    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public final void retrieveAppSetId(android.content.Context context, io.appmetrica.analytics.appsetid.internal.AppSetIdListener appSetIdListener) {
        appSetIdListener.onFailure(new java.lang.IllegalStateException("No App Set ID library"));
    }
}

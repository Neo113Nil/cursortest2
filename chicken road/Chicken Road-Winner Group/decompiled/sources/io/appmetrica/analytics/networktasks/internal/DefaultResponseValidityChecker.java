package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class DefaultResponseValidityChecker implements ResponseValidityChecker {
    @Override // io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker
    public boolean isResponseValid(int i3) {
        return (i3 == 400 || i3 == 500) ? false : true;
    }
}

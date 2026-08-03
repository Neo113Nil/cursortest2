package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class DefaultResponseValidityChecker implements io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker {
    @Override // io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker
    public boolean isResponseValid(int i2) {
        return (i2 == 400 || i2 == 500) ? false : true;
    }
}

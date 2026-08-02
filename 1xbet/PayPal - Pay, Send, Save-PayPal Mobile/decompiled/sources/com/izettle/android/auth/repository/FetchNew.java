package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/FetchNew;", "Lcom/izettle/android/auth/repository/GetStrategy;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FetchNew implements com.izettle.android.auth.repository.GetStrategy {
    private final java.lang.String token;

    public FetchNew(java.lang.String str) {
        this.token = str;
    }

    public final java.lang.String getToken() {
        return this.token;
    }
}

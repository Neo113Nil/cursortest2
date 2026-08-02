package com.paypal.oslo.app.network;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/network/NetworkLoggingLevelProvider;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getCurrentLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "shouldRedactHeaders", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NetworkLoggingLevelProvider {
    okhttp3.logging.HttpLoggingInterceptor.Level getCurrentLevel();

    boolean shouldRedactHeaders();
}

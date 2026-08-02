package com.paypal.oslo.app.launch;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSourceProvider;", "", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/app/launch/AppLaunchSource;", "getLaunchSource", "()Lkotlinx/coroutines/flow/StateFlow;", "launchSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppLaunchSourceProvider {
    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.app.launch.AppLaunchSource> getLaunchSource();
}

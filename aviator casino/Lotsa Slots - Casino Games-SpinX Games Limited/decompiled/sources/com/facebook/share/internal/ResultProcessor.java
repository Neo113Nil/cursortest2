package com.facebook.share.internal;

/* compiled from: ResultProcessor.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0014\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/share/internal/ResultProcessor;", "", "appCallback", "Lcom/facebook/FacebookCallback;", "(Lcom/facebook/FacebookCallback;)V", "onCancel", "", "appCall", "Lcom/facebook/internal/AppCall;", "onError", "error", "Lcom/facebook/FacebookException;", "onSuccess", "results", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ResultProcessor {
    private final com.facebook.FacebookCallback<?> appCallback;

    public abstract void onSuccess(com.facebook.internal.AppCall appCall, android.os.Bundle results);

    public ResultProcessor(com.facebook.FacebookCallback<?> facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(com.facebook.internal.AppCall appCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        com.facebook.FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback == null) {
            return;
        }
        facebookCallback.onCancel();
    }

    public void onError(com.facebook.internal.AppCall appCall, com.facebook.FacebookException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.facebook.FacebookCallback<?> facebookCallback = this.appCallback;
        if (facebookCallback == null) {
            return;
        }
        facebookCallback.onError(error);
    }
}

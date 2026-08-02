package io.flutter.plugins.googlesignin;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a(\u0010\u0007\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\b\u001a \u0010\n\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u001a(\u0010\u000b\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\f\u001a(\u0010\r\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u000f\u001a(\u0010\u0010\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\t\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"completeWithGetGetCredentialResult", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Lio/flutter/plugins/googlesignin/GetCredentialResult;", "result", "completeWithGetCredentialFailure", "Lio/flutter/plugins/googlesignin/GetCredentialFailure;", "failure", "completeWithUnitSuccess", "completeWithUnitError", "Lio/flutter/plugins/googlesignin/FlutterError;", "completeWithAuthorizationResult", "Lio/flutter/plugins/googlesignin/AuthorizeResult;", "Lio/flutter/plugins/googlesignin/PlatformAuthorizationResult;", "completeWithAuthorizeFailure", "Lio/flutter/plugins/googlesignin/AuthorizeFailure;", "google_sign_in_android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultUtilsKt {
    public static final void completeWithAuthorizationResult(Function1<? super Result<? extends AuthorizeResult>, Unit> callback, PlatformAuthorizationResult result) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(result, "result");
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(result)));
    }

    public static final void completeWithAuthorizeFailure(Function1<? super Result<? extends AuthorizeResult>, Unit> callback, AuthorizeFailure failure) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failure, "failure");
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(failure)));
    }

    public static final void completeWithGetCredentialFailure(Function1<? super Result<GetCredentialFailure>, Unit> callback, GetCredentialFailure failure) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failure, "failure");
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(failure)));
    }

    public static final void completeWithGetGetCredentialResult(Function1<? super Result<? extends GetCredentialResult>, Unit> callback, GetCredentialResult result) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(result, "result");
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(result)));
    }

    public static final void completeWithUnitError(Function1<? super Result<Unit>, Unit> callback, FlutterError failure) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failure, "failure");
        Result.Companion companion = Result.INSTANCE;
        callback.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(failure))));
    }

    public static final void completeWithUnitSuccess(Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Result.Companion companion = Result.INSTANCE;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.c(Unit.INSTANCE, callback);
    }
}

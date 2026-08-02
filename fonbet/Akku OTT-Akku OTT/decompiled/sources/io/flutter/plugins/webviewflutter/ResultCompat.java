package io.flutter.plugins.webviewflutter;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u0004\u0018\u00010\fR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/flutter/plugins/webviewflutter/ResultCompat;", ExifInterface.GPS_DIRECTION_TRUE, "", "result", "Lkotlin/Result;", "<init>", "(Ljava/lang/Object;)V", "getResult-d1pmJ48", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", Constants.EXCEPTION, "", "isSuccess", "", "()Z", "isFailure", "getOrNull", "exceptionOrNull", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultCompat<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    private final Object result;
    private final T value;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\tJ:\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\f\u0012\u0004\u0012\u00020\u00050\u000b\"\u0004\b\u0001\u0010\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/ResultCompat$Companion;", "", "<init>", "()V", FirebaseAnalytics.Param.SUCCESS, "", ExifInterface.GPS_DIRECTION_TRUE, "value", "callback", "(Ljava/lang/Object;Ljava/lang/Object;)V", "asCompatCallback", "Lkotlin/Function1;", "Lkotlin/Result;", "result", "Lio/flutter/plugins/webviewflutter/ResultCompat;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit asCompatCallback$lambda$0(Function1 function1, Result result) {
            function1.invoke(new ResultCompat(result.getValue()));
            return Unit.INSTANCE;
        }

        @JvmStatic
        public final <T> Function1<Result<? extends T>, Unit> asCompatCallback(Function1<? super ResultCompat<T>, Unit> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new androidx.work.impl.model.b(result, 1);
        }

        @JvmStatic
        public final <T> void success(T value, Object callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(callback, 1)).invoke(Result.m1715boximpl(Result.m1716constructorimpl(value)));
        }

        private Companion() {
        }
    }

    public ResultCompat(Object obj) {
        this.result = obj;
        this.value = Result.m1722isFailureimpl(obj) ? null : (T) obj;
        this.exception = Result.m1719exceptionOrNullimpl(obj);
        this.isSuccess = Result.m1723isSuccessimpl(obj);
        this.isFailure = Result.m1722isFailureimpl(obj);
    }

    @JvmStatic
    public static final <T> Function1<Result<? extends T>, Unit> asCompatCallback(Function1<? super ResultCompat<T>, Unit> function1) {
        return INSTANCE.asCompatCallback(function1);
    }

    @JvmStatic
    public static final <T> void success(T t, Object obj) {
        INSTANCE.success(t, obj);
    }

    /* renamed from: exceptionOrNull, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final T getOrNull() {
        return this.value;
    }

    /* renamed from: getResult-d1pmJ48, reason: not valid java name and from getter */
    public final Object getResult() {
        return this.result;
    }

    /* renamed from: isFailure, reason: from getter */
    public final boolean getIsFailure() {
        return this.isFailure;
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }
}

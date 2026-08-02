package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a1\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "tag", "Lkotlin/Function0;", "block", "", "logd", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "t", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "logi", "loge"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggerExtKt {
    public static final void logd(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().debug(str, function0.invoke());
    }

    public static final void logd(java.lang.String str, java.lang.Throwable th, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().debug(str, function0.invoke(), th);
    }

    public static final void logi(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().info(str, function0.invoke());
    }

    public static final void logi(java.lang.String str, java.lang.Throwable th, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().info(str, function0.invoke(), th);
    }

    public static final void loge(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().error(str, function0.invoke());
    }

    public static final void loge(java.lang.String str, java.lang.Throwable th, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.work.Logger.get().error(str, function0.invoke(), th);
    }
}

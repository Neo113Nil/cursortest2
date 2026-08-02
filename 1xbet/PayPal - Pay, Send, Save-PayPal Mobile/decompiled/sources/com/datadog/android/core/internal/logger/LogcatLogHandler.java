package com.datadog.android.core.internal.logger;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "", "", "tag", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "predicate", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "level", "canLog", "(I)Z", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "Lkotlin/jvm/functions/Function1;", "getPredicate$dd_sdk_android_core_release", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "getTag$dd_sdk_android_core_release", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogcatLogHandler {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> predicate;
    private final java.lang.String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public LogcatLogHandler(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.tag = str;
        this.predicate = function1;
    }

    /* renamed from: getTag$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    public /* synthetic */ LogcatLogHandler(java.lang.String str, com.datadog.android.core.internal.logger.LogcatLogHandler.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>() { // from class: com.datadog.android.core.internal.logger.LogcatLogHandler.1
            public final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI(int i2) {
                return java.lang.Boolean.TRUE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
                return getHighResolutionOutputSizeshNQ4ISI(num.intValue());
            }
        } : anonymousClass1);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> getPredicate$dd_sdk_android_core_release() {
        return this.predicate;
    }

    public final boolean canLog(int level) {
        return this.predicate.invoke(java.lang.Integer.valueOf(level)).booleanValue();
    }

    public final void log(int level, java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.predicate.invoke(java.lang.Integer.valueOf(level)).booleanValue();
    }
}

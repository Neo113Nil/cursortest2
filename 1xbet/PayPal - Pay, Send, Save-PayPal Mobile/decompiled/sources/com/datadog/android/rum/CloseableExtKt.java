package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0007\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/io/Closeable;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lkotlin/Function1;", "block", "useMonitored", "(Ljava/io/Closeable;Lcom/datadog/android/api/SdkCore;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloseableExtKt {
    public static /* synthetic */ java.lang.Object useMonitored$default(java.io.Closeable closeable, com.datadog.android.api.SdkCore sdkCore, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return useMonitored(closeable, sdkCore, function1);
    }

    public static final <T extends java.io.Closeable, R> R useMonitored(T t, com.datadog.android.api.SdkCore sdkCore, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            R invoke = function1.invoke(t);
            try {
                return invoke;
            } catch (java.lang.Throwable th) {
                return invoke;
            }
        } catch (java.lang.Throwable th2) {
            try {
                com.datadog.android.rum.internal.utils.CloasableErrorExtKt.handleClosableError(th2, sdkCore);
                throw th2;
            } finally {
                try {
                    t.close();
                } catch (java.lang.Throwable th3) {
                    com.datadog.android.rum.internal.utils.CloasableErrorExtKt.handleClosableError(th3, sdkCore);
                }
            }
        }
    }
}

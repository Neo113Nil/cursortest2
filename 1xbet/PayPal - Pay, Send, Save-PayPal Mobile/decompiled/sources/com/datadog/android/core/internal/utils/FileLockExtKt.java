package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Ljava/nio/channels/FileLock;", "Lkotlin/Function1;", "block", "use", "(Ljava/nio/channels/FileLock;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileLockExtKt {
    public static final /* synthetic */ <R> R use(java.nio.channels.FileLock fileLock, kotlin.jvm.functions.Function1<? super java.nio.channels.FileLock, ? extends R> function1) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            return function1.invoke(fileLock);
        } finally {
            fileLock.release();
        }
    }
}

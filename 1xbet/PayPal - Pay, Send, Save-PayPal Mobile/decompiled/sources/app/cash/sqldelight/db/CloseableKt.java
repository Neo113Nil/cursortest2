package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0006\u001a\u00028\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001\"\u0004\b\u0001\u0010\u0003*\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007*\n\u0010\b\"\u00020\u00002\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/io/Closeable;", "Lapp/cash/sqldelight/db/Camera2StreamConfigurationMap;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "use", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseableKt {
    public static final <T extends java.io.Closeable, R> R use(T t, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            R invoke = function1.invoke(t);
            kotlin.io.CloseableKt.closeFinally(t, null);
            return invoke;
        } finally {
        }
    }
}

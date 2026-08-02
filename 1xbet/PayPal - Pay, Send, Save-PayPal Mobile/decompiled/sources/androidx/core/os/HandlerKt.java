package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lkotlin/Function0;", "", "action", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/os/Handler;JLjava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;", "uptimeMillis", "postAtTime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HandlerKt {
    public static final java.lang.Runnable postDelayed(android.os.Handler handler, long j, java.lang.Object obj, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.core.os.HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new androidx.core.os.HandlerKt$postDelayed$runnable$1(function0);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
            return handlerKt$postDelayed$runnable$1;
        }
        androidx.core.os.HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ java.lang.Runnable postDelayed$default(android.os.Handler handler, long j, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        androidx.core.os.HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new androidx.core.os.HandlerKt$postDelayed$runnable$1(function0);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
            return handlerKt$postDelayed$runnable$1;
        }
        androidx.core.os.HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        return handlerKt$postDelayed$runnable$1;
    }

    public static final java.lang.Runnable postAtTime(android.os.Handler handler, long j, java.lang.Object obj, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.core.os.HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new androidx.core.os.HandlerKt$postAtTime$runnable$1(function0);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ java.lang.Runnable postAtTime$default(android.os.Handler handler, long j, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        androidx.core.os.HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new androidx.core.os.HandlerKt$postAtTime$runnable$1(function0);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }
}

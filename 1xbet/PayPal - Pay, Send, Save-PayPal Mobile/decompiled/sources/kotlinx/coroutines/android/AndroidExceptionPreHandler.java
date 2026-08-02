package kotlinx.coroutines.android;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "Ljava/lang/reflect/Method;", "preHandler", "()Ljava/lang/reflect/Method;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AndroidExceptionPreHandler extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
        this._preHandler = this;
    }

    private final java.lang.reflect.Method preHandler() {
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            return (java.lang.reflect.Method) obj;
        }
        java.lang.reflect.Method method = null;
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new java.lang.Class[0]);
            if (java.lang.reflect.Modifier.isPublic(declaredMethod.getModifiers())) {
                if (java.lang.reflect.Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.lang.reflect.Method preHandler = preHandler();
            java.lang.Object invoke = preHandler != null ? preHandler.invoke(null, new java.lang.Object[0]) : null;
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), exception);
            }
        }
    }
}

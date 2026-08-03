package A1;

/* loaded from: classes.dex */
public final class b extends k1.AbstractC0921a implements k1.g {
    private volatile java.lang.Object _preHandler;

    public b() {
        super(z1.C1066t.f8591a);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r4.getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(java.lang.Throwable th, k1.i iVar) {
        java.lang.reflect.Method method;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (26 > i2 || i2 >= 28) {
            return;
        }
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            method = (java.lang.reflect.Method) obj;
        } else {
            try {
                method = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                }
            } catch (java.lang.Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        java.lang.Object invoke = method != null ? method.invoke(null, null) : null;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
    }
}

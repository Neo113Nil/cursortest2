package rx.plugins;

/* loaded from: classes18.dex */
public abstract class RxJavaErrorHandler {
    protected static final java.lang.String ERROR_IN_RENDERING_SUFFIX = ".errorRendering";

    @java.lang.Deprecated
    public void handleError(java.lang.Throwable th) {
    }

    protected java.lang.String render(java.lang.Object obj) throws java.lang.InterruptedException {
        return null;
    }

    public final java.lang.String handleOnNextValueRendering(java.lang.Object obj) {
        try {
            return render(obj);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append(ERROR_IN_RENDERING_SUFFIX);
            return sb.toString();
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj.getClass().getName());
            sb2.append(ERROR_IN_RENDERING_SUFFIX);
            return sb2.toString();
        }
    }
}

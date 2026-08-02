package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/internal/NavContext;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "id", "", "getResourceName", "(I)Ljava/lang/String;", "getApplication", "()Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavContext {
    private final android.content.Context context;

    public NavContext(android.content.Context context) {
        this.context = context;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.String getResourceName(int id) {
        try {
            android.content.Context context = this.context;
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            java.lang.String resourceName = context.getResources().getResourceName(id);
            kotlin.jvm.internal.Intrinsics.checkNotNull(resourceName);
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(id);
        }
    }

    public final java.lang.Object getApplication() {
        android.content.Context context = this.context;
        android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof android.app.Application) {
            return (android.app.Application) applicationContext;
        }
        return null;
    }
}

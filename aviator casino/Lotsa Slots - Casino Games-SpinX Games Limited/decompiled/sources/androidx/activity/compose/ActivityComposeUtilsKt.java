package androidx.activity.compose;

/* compiled from: ActivityComposeUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"findOwner", "T", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object obj = context;
        while (obj instanceof android.content.ContextWrapper) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (obj instanceof java.lang.Object) {
                return (T) obj;
            }
            android.content.Context context2 = (T) ((android.content.ContextWrapper) obj).getBaseContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "innerContext.baseContext");
            obj = context2;
        }
        return null;
    }
}

package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroid/content/Context;", "context", "findOwner", "(Landroid/content/Context;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(android.content.Context context) {
        for (java.lang.Object obj = context; obj instanceof android.content.ContextWrapper; obj = (T) ((android.content.ContextWrapper) obj).getBaseContext()) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (obj instanceof java.lang.Object) {
                return (T) obj;
            }
        }
        return null;
    }
}

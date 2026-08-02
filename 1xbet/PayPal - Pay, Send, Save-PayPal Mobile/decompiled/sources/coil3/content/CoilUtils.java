package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcoil3/util/CoilUtils;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "dispose", "(Landroid/view/View;)V", "Lcoil3/request/ImageResult;", "result", "(Landroid/view/View;)Lcoil3/request/ImageResult;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoilUtils {
    public static final coil3.content.CoilUtils INSTANCE = new coil3.content.CoilUtils();

    private CoilUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final void dispose(android.view.View view) {
        coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(view).dispose();
    }

    @kotlin.jvm.JvmStatic
    public static final coil3.view.ImageResult result(android.view.View view) {
        return coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(view).getResult();
    }
}

package coil.transition;

/* compiled from: TransitionTarget.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcoil/transition/TransitionTarget;", "Lcoil/target/Target;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TransitionTarget extends coil.target.Target {
    android.graphics.drawable.Drawable getDrawable();

    android.view.View getView();

    /* compiled from: TransitionTarget.kt */
    /* renamed from: coil.transition.TransitionTarget$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: TransitionTarget.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onError(coil.transition.TransitionTarget transitionTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onError(transitionTarget, drawable);
        }

        @java.lang.Deprecated
        public static void onStart(coil.transition.TransitionTarget transitionTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onStart(transitionTarget, drawable);
        }

        @java.lang.Deprecated
        public static void onSuccess(coil.transition.TransitionTarget transitionTarget, android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onSuccess(transitionTarget, drawable);
        }
    }
}

package androidx.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0017J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/navigation/Navigation;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Landroidx/navigation/NavController;", "findNavController", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "Landroid/view/View;", "view", "(Landroid/view/View;)Landroidx/navigation/NavController;", "resId", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "args", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)Landroid/view/View$OnClickListener;", "controller", "", "setViewNavController", "(Landroid/view/View;Landroidx/navigation/NavController;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Navigation {
    public static final androidx.view.Navigation INSTANCE = new androidx.view.Navigation();

    private Navigation() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.NavController findNavController(android.app.Activity activity, int viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.view.View requireViewById = androidx.core.app.ActivityCompat.requireViewById(activity, viewId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireViewById, "");
        androidx.view.NavController navController = (androidx.view.NavController) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(requireViewById, new androidx.view.Navigation$$ExternalSyntheticLambda2()), new androidx.view.Navigation$$ExternalSyntheticLambda3()));
        if (navController != null) {
            return navController;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
        sb.append(activity);
        sb.append(" does not have a NavController set on ");
        sb.append(viewId);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static /* synthetic */ android.view.View.OnClickListener createNavigateOnClickListener$default(int i, android.os.Bundle bundle, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.View.OnClickListener createNavigateOnClickListener(final int resId, final android.os.Bundle args) {
        return new android.view.View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                androidx.view.Navigation.$r8$lambda$YhirqrWI_mxSVYsQfC2GAHhb6bA(resId, args, view);
            }
        };
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.View.OnClickListener createNavigateOnClickListener(final androidx.view.NavDirections directions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directions, "");
        return new android.view.View.OnClickListener() { // from class: androidx.navigation.Navigation$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                androidx.view.Navigation.$r8$lambda$XCba2wSudknK5k96lCzSt3VRK0w(androidx.view.NavDirections.this, view);
            }
        };
    }

    @kotlin.jvm.JvmStatic
    public static final void setViewNavController(android.view.View view, androidx.view.NavController controller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(androidx.view.C0281R.id.nav_controller_view_tag, controller);
    }

    public static /* synthetic */ android.view.View $r8$lambda$EvfKKPOuCV75juDOiHyhwPtIWl0(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }

    public static /* synthetic */ androidx.view.NavController $r8$lambda$JF2edSJwZ3fOQi7JDCgucLGpzWA(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag(androidx.view.C0281R.id.nav_controller_view_tag);
        if (tag instanceof java.lang.ref.WeakReference) {
            return (androidx.view.NavController) ((java.lang.ref.WeakReference) tag).get();
        }
        if (tag instanceof androidx.view.NavController) {
            return (androidx.view.NavController) tag;
        }
        return null;
    }

    public static /* synthetic */ void $r8$lambda$XCba2wSudknK5k96lCzSt3VRK0w(androidx.view.NavDirections navDirections, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(view);
        findNavController(view).navigate(navDirections);
    }

    public static /* synthetic */ void $r8$lambda$YhirqrWI_mxSVYsQfC2GAHhb6bA(int i, android.os.Bundle bundle, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(view);
        findNavController(view).navigate(i, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.NavController findNavController(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        androidx.view.NavController navController = (androidx.view.NavController) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.generateSequence(view, new androidx.view.Navigation$$ExternalSyntheticLambda2()), new androidx.view.Navigation$$ExternalSyntheticLambda3()));
        if (navController != null) {
            return navController;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
        sb.append(view);
        sb.append(" does not have a NavController set");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.View.OnClickListener createNavigateOnClickListener(int i) {
        return createNavigateOnClickListener$default(i, null, 2, null);
    }
}

package dagger.hilt.android;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u000bJ+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\r\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\u000e\u0010\u0010J+\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0015J+\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0018\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b\u0018\u0010\u001a"}, d2 = {"Ldagger/hilt/android/EntryPointAccessors;", "", "<init>", "()V", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "entryPoint", "fromApplication", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "fromActivity", "(Landroid/app/Activity;Ljava/lang/Class;)Ljava/lang/Object;", "(Landroid/app/Activity;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "fragment", "fromFragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;)Ljava/lang/Object;", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Landroid/view/View;", "view", "fromView", "(Landroid/view/View;Ljava/lang/Class;)Ljava/lang/Object;", "(Landroid/view/View;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EntryPointAccessors {
    public static final dagger.hilt.android.EntryPointAccessors INSTANCE = new dagger.hilt.android.EntryPointAccessors();

    private EntryPointAccessors() {
    }

    @kotlin.jvm.JvmStatic
    public static final <T> T fromApplication(android.content.Context context, java.lang.Class<T> entryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        return (T) dagger.hilt.EntryPoints.get(dagger.hilt.android.internal.Contexts.getApplication(context.getApplicationContext()), entryPoint);
    }

    public final /* synthetic */ <T> T fromApplication(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromApplication(context, java.lang.Object.class);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> T fromActivity(android.app.Activity activity, java.lang.Class<T> entryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        return (T) dagger.hilt.EntryPoints.get(activity, entryPoint);
    }

    public final /* synthetic */ <T> T fromActivity(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromActivity(activity, java.lang.Object.class);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> T fromFragment(androidx.fragment.app.Fragment fragment, java.lang.Class<T> entryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        return (T) dagger.hilt.EntryPoints.get(fragment, entryPoint);
    }

    public final /* synthetic */ <T> T fromFragment(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromFragment(fragment, java.lang.Object.class);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> T fromView(android.view.View view, java.lang.Class<T> entryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "");
        return (T) dagger.hilt.EntryPoints.get(view, entryPoint);
    }

    public final /* synthetic */ <T> T fromView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromView(view, java.lang.Object.class);
    }
}

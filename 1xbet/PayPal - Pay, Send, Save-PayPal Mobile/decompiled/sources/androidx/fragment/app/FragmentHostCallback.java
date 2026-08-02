package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rB+\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000fJ9\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00028\u0000H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J-\u0010.\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010-\u001a\u00020\u0007H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020&2\u0006\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u00106\u001a\u0002052\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u00108J1\u00107\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u00106\u001a\u0002052\u0006\u0010-\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b7\u0010;JS\u0010A\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u00106\u001a\u00020<2\u0006\u0010-\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u0001052\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010DR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020K8GX\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010T"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/FragmentContainer;", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroid/app/Activity;", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "", "onDump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "id", "Landroid/view/View;", "onFindViewById", "(I)Landroid/view/View;", "onGetHost", "()Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "()Landroid/view/LayoutInflater;", "onGetWindowAnimations", "()I", "", "onHasView", "()Z", "onHasWindowAnimations", "Landroidx/fragment/app/Fragment;", "fragment", "permissions", "requestCode", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "onShouldSaveFragmentState", "(Landroidx/fragment/app/Fragment;)Z", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "onShouldShowRequestPermissionRationale", "(Ljava/lang/String;)Z", "Landroid/content/Intent;", "intent", "onStartActivityFromFragment", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;I)V", "Landroid/os/Bundle;", "options", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "onStartIntentSenderFromFragment", "(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "onSupportInvalidateOptionsMenu", "()V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FragmentHostCallback<H> extends androidx.fragment.app.FragmentContainer {
    private final android.app.Activity activity;
    private final android.content.Context context;
    private final androidx.fragment.app.FragmentManager fragmentManager;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;
    private final android.os.Handler handler;

    @Override // androidx.fragment.app.FragmentContainer
    public android.view.View onFindViewById(int id) {
        return null;
    }

    public abstract H onGetHost();

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    public final android.app.Activity getActivity() {
        return this.activity;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final android.os.Handler getHandler() {
        return this.handler;
    }

    public FragmentHostCallback(android.app.Activity activity, android.content.Context context, android.os.Handler handler, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.fragmentManager = new androidx.fragment.app.FragmentManagerImpl();
    }

    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(android.content.Context context, android.os.Handler handler, int i) {
        this(context instanceof android.app.Activity ? (android.app.Activity) context : null, context, handler, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new android.os.Handler(), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "");
    }

    public android.view.LayoutInflater onGetLayoutInflater() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        return from;
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        onStartActivityFromFragment(fragment, intent, requestCode, null);
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int requestCode, android.os.Bundle options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (requestCode != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
        androidx.core.content.ContextCompat.startActivity(this.context, intent, options);
    }

    @kotlin.Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link StartIntentSenderForResult}. This method will still be called when Fragments\n      call the deprecated <code>startIntentSenderForResult()</code> method.")
    public void onStartIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intent, int requestCode, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, android.os.Bundle options) throws android.content.IntentSender.SendIntentException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (requestCode != -1) {
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        android.app.Activity activity = this.activity;
        if (activity == null) {
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
        }
        androidx.core.app.ActivityCompat.startIntentSenderForResult(activity, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* renamed from: onGetWindowAnimations, reason: from getter */
    public int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean onShouldShowRequestPermissionRationale(java.lang.String permission) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
        return false;
    }

    public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        return true;
    }

    @kotlin.Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link RequestMultiplePermissions}. This method will still be called when Fragments\n      call the deprecated <code>requestPermissions()</code> method.")
    public void onRequestPermissionsFromFragment(androidx.fragment.app.Fragment fragment, java.lang.String[] permissions, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "");
    }

    public void onDump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
    }
}

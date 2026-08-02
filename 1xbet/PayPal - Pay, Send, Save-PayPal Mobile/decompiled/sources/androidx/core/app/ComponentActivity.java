package androidx.core.app;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010!R.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "<init>", "()V", "Landroidx/core/app/ComponentActivity$ExtraData;", "extraData", "", "putExtraData", "(Landroidx/core/app/ComponentActivity$ExtraData;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "Landroid/view/KeyEvent;", "event", "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "shouldSkipDump", "Landroidx/collection/SimpleArrayMap;", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "getExtraDataMap$annotations", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "ExtraData"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements androidx.view.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private final androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> extraDataMap = new androidx.collection.SimpleArrayMap<>(0, 1, null);
    private final androidx.view.LifecycleRegistry lifecycleRegistry = new androidx.view.LifecycleRegistry(this);

    @kotlin.Deprecated(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class ExtraData {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData extraData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraData, "");
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.view.ReportFragment.INSTANCE.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        this.lifecycleRegistry.setCurrentState(androidx.lifecycle.Lifecycle.State.CREATED);
        super.onSaveInstanceState(outState);
    }

    @kotlin.Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> extraDataClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraDataClass, "");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    public androidx.view.Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        if (androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
        if (androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, event)) {
            return true;
        }
        return androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, event);
    }

    protected final boolean shouldDumpInternalState(java.lang.String[] args) {
        return !shouldSkipDump(args);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r4.equals("--dump-dumpable") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldSkipDump(java.lang.String[] args) {
        if (args != null && args.length != 0) {
            java.lang.String str = args[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (!str.equals("--translation") || android.os.Build.VERSION.SDK_INT < 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (!str.equals("--contentcapture") || android.os.Build.VERSION.SDK_INT < 29) {
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                    }
                    break;
            }
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

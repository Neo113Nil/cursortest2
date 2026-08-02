package androidx.view.compose.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/activity/compose/internal/BackHandlerCompat;", "", "Landroidx/navigationevent/NavigationEventInfo;", "info", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;)V", "Landroidx/activity/BackEventCompat;", "event", "", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "()V", "onBackCancelled", "Landroidx/navigationevent/NavigationEventInfo;", "getInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "Landroidx/navigationevent/NavigationEventHandler;", "navigationEventHandler", "Landroidx/navigationevent/NavigationEventHandler;", "getNavigationEventHandler", "()Landroidx/navigationevent/NavigationEventHandler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BackHandlerCompat {
    public static final int $stable = 8;
    private final androidx.view.NavigationEventInfo info;
    private final androidx.view.NavigationEventHandler<androidx.view.NavigationEventInfo> navigationEventHandler;
    private final androidx.view.OnBackPressedCallback onBackPressedCallback = new androidx.view.OnBackPressedCallback() { // from class: androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1
        {
            super(false);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackStarted(androidx.view.BackEventCompat backEvent) {
            androidx.view.compose.internal.BackHandlerCompat.this.onBackStarted(backEvent);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackProgressed(androidx.view.BackEventCompat backEvent) {
            androidx.view.compose.internal.BackHandlerCompat.this.onBackProgressed(backEvent);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            androidx.view.compose.internal.BackHandlerCompat.this.onBackCompleted();
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackCancelled() {
            androidx.view.compose.internal.BackHandlerCompat.this.onBackCancelled();
        }
    };

    public void onBackCancelled() {
    }

    public abstract void onBackCompleted();

    public void onBackProgressed(androidx.view.BackEventCompat event) {
    }

    public void onBackStarted(androidx.view.BackEventCompat event) {
    }

    public BackHandlerCompat(final androidx.view.NavigationEventInfo navigationEventInfo) {
        this.info = navigationEventInfo;
        this.navigationEventHandler = new androidx.view.NavigationEventHandler<androidx.view.NavigationEventInfo>(navigationEventInfo) { // from class: androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1
            @Override // androidx.view.NavigationEventHandler
            public final void onBackStarted(androidx.view.NavigationEvent event) {
                androidx.view.compose.internal.BackHandlerCompat.this.onBackStarted(new androidx.view.BackEventCompat(event));
            }

            @Override // androidx.view.NavigationEventHandler
            public final void onBackProgressed(androidx.view.NavigationEvent event) {
                androidx.view.compose.internal.BackHandlerCompat.this.onBackProgressed(new androidx.view.BackEventCompat(event));
            }

            @Override // androidx.view.NavigationEventHandler
            public final void onBackCompleted() {
                androidx.view.compose.internal.BackHandlerCompat.this.onBackCompleted();
            }

            @Override // androidx.view.NavigationEventHandler
            public final void onBackCancelled() {
                androidx.view.compose.internal.BackHandlerCompat.this.onBackCancelled();
            }
        };
    }

    public final androidx.view.NavigationEventInfo getInfo() {
        return this.info;
    }

    public boolean isBackEnabled() {
        return this.onBackPressedCallback.getIsEnabled() && this.navigationEventHandler.isBackEnabled();
    }

    public void setBackEnabled(boolean z) {
        this.onBackPressedCallback.setEnabled(z);
        this.navigationEventHandler.setBackEnabled(z);
    }

    public final androidx.view.OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final androidx.view.NavigationEventHandler<androidx.view.NavigationEventInfo> getNavigationEventHandler() {
        return this.navigationEventHandler;
    }
}

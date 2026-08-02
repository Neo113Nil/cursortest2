package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003"}, d2 = {"Landroidx/navigationevent/DirectNavigationEventInput;", "Landroidx/navigationevent/NavigationEventInput;", "<init>", "()V", "Landroidx/navigationevent/NavigationEvent;", "event", "", "backStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "backProgressed", "backCancelled", "backCompleted", "forwardStarted", "forwardProgressed", "forwardCancelled", "forwardCompleted"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DirectNavigationEventInput extends androidx.view.NavigationEventInput {
    public final void backStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        dispatchOnBackStarted(event);
    }

    public final void backProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        dispatchOnBackProgressed(event);
    }

    public final void backCancelled() {
        dispatchOnBackCancelled();
    }

    public final void backCompleted() {
        dispatchOnBackCompleted();
    }

    public final void forwardStarted(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        dispatchOnForwardStarted(event);
    }

    public final void forwardProgressed(androidx.view.NavigationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        dispatchOnForwardProgressed(event);
    }

    public final void forwardCancelled() {
        dispatchOnForwardCancelled();
    }

    public final void forwardCompleted() {
        dispatchOnForwardCompleted();
    }
}

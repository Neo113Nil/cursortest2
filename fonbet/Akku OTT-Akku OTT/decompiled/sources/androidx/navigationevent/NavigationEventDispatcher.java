package androidx.navigationevent;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.O;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\u00020\u0001:\u0002GFB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0007J%\u0010\u0010\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010\u0019J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010(R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u001c\u0010+\u001a\u00020*8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R*\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020*8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010,\u001a\u0004\b/\u0010-\"\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0000078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020C0>8F¢\u0006\u0006\u001a\u0004\bD\u0010A¨\u0006H"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcher;", "", "parent", "Landroidx/navigationevent/OnBackCompletedFallback;", "onBackCompletedFallback", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/OnBackCompletedFallback;)V", "()V", "(Landroidx/navigationevent/OnBackCompletedFallback;)V", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "", "checkInvariants", "Landroidx/navigationevent/NavigationEventHandler;", "handler", "", "priority", "addHandler", "(Landroidx/navigationevent/NavigationEventHandler;I)V", "removeHandler$navigationevent", "(Landroidx/navigationevent/NavigationEventHandler;)V", "removeHandler", "Landroidx/navigationevent/NavigationEventInput;", "input", "addInput", "(Landroidx/navigationevent/NavigationEventInput;)V", "(Landroidx/navigationevent/NavigationEventInput;I)V", "removeInput", "direction", "Landroidx/navigationevent/NavigationEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchOnStarted$navigationevent", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/NavigationEvent;)V", "dispatchOnStarted", "dispatchOnProgressed$navigationevent", "dispatchOnProgressed", "dispatchOnCompleted$navigationevent", "dispatchOnCompleted", "dispatchOnCancelled$navigationevent", "dispatchOnCancelled", "dispose", "Landroidx/navigationevent/NavigationEventDispatcher;", "Landroidx/navigationevent/OnBackCompletedFallback;", "", "isDisposed", "Z", "()Z", "value", "isEnabled", "setEnabled", "(Z)V", "Landroidx/navigationevent/NavigationEventProcessor;", "sharedProcessor", "Landroidx/navigationevent/NavigationEventProcessor;", "getSharedProcessor$navigationevent", "()Landroidx/navigationevent/NavigationEventProcessor;", "", "childDispatchers", "Ljava/util/Set;", "getChildDispatchers$navigationevent", "()Ljava/util/Set;", "handlers", "inputs", "Lkotlinx/coroutines/flow/O;", "Landroidx/navigationevent/NavigationEventTransitionState;", "getTransitionState", "()Lkotlinx/coroutines/flow/O;", "transitionState", "Landroidx/navigationevent/NavigationEventHistory;", "getHistory", "history", "Companion", "Priority", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationEventDispatcher {
    public static final int PRIORITY_DEFAULT = 1;
    public static final int PRIORITY_OVERLAY = 0;
    private final Set<NavigationEventDispatcher> childDispatchers;
    private final Set<NavigationEventHandler<?>> handlers;
    private final Set<NavigationEventInput> inputs;
    private boolean isDisposed;
    private boolean isEnabled;
    private final OnBackCompletedFallback onBackCompletedFallback;
    private NavigationEventDispatcher parent;
    private final NavigationEventProcessor sharedProcessor;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcher$Priority;", "", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Priority {
    }

    private NavigationEventDispatcher(NavigationEventDispatcher navigationEventDispatcher, OnBackCompletedFallback onBackCompletedFallback) {
        NavigationEventProcessor navigationEventProcessor;
        this.parent = navigationEventDispatcher;
        this.onBackCompletedFallback = onBackCompletedFallback;
        this.isEnabled = true;
        this.sharedProcessor = (navigationEventDispatcher == null || (navigationEventProcessor = navigationEventDispatcher.sharedProcessor) == null) ? new NavigationEventProcessor() : navigationEventProcessor;
        this.childDispatchers = new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
        NavigationEventDispatcher navigationEventDispatcher2 = this.parent;
        if (navigationEventDispatcher2 != null) {
            navigationEventDispatcher2.childDispatchers.add(this);
        }
    }

    public static /* synthetic */ void addHandler$default(NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        navigationEventDispatcher.addHandler(navigationEventHandler, i);
    }

    private final void checkInvariants() {
        if (isDisposed()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    private final boolean isDisposed() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || !navigationEventDispatcher.isDisposed()) {
            return this.isDisposed;
        }
        return true;
    }

    @JvmOverloads
    @MainThread
    public final void addHandler(NavigationEventHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        addHandler$default(this, handler, 0, 2, null);
    }

    @MainThread
    public final void addInput(NavigationEventInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (this.inputs.add(input)) {
            this.sharedProcessor.addInput(this, input, -1);
        }
    }

    public final void dispatchOnCancelled$navigationevent(NavigationEventInput input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCancelled(input, direction);
        }
    }

    public final void dispatchOnCompleted$navigationevent(NavigationEventInput input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCompleted(input, direction, this.onBackCompletedFallback);
        }
    }

    public final void dispatchOnProgressed$navigationevent(NavigationEventInput input, int direction, NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnProgressed(input, direction, event);
        }
    }

    public final void dispatchOnStarted$navigationevent(NavigationEventInput input, int direction, NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnStarted(input, direction, event);
        }
    }

    @MainThread
    public final void dispose() {
        Set<NavigationEventDispatcher> set;
        checkInvariants();
        this.isDisposed = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this);
        while (!arrayDeque.isEmpty()) {
            NavigationEventDispatcher navigationEventDispatcher = (NavigationEventDispatcher) arrayDeque.removeFirst();
            navigationEventDispatcher.isDisposed = true;
            CollectionsKt__MutableCollectionsKt.addAll(arrayDeque, navigationEventDispatcher.childDispatchers);
            Iterator it = CollectionsKt.toList(navigationEventDispatcher.inputs).iterator();
            while (it.hasNext()) {
                this.sharedProcessor.removeInput((NavigationEventInput) it.next());
            }
            navigationEventDispatcher.inputs.clear();
            Iterator it2 = CollectionsKt.toList(navigationEventDispatcher.handlers).iterator();
            while (it2.hasNext()) {
                ((NavigationEventHandler) it2.next()).remove();
            }
            navigationEventDispatcher.handlers.clear();
            navigationEventDispatcher.childDispatchers.clear();
            NavigationEventDispatcher navigationEventDispatcher2 = navigationEventDispatcher.parent;
            if (navigationEventDispatcher2 != null && (set = navigationEventDispatcher2.childDispatchers) != null) {
                set.remove(navigationEventDispatcher);
            }
            navigationEventDispatcher.parent = null;
        }
    }

    public final Set<NavigationEventDispatcher> getChildDispatchers$navigationevent() {
        return this.childDispatchers;
    }

    public final O<NavigationEventHistory> getHistory() {
        return this.sharedProcessor.getHistory();
    }

    /* renamed from: getSharedProcessor$navigationevent, reason: from getter */
    public final NavigationEventProcessor getSharedProcessor() {
        return this.sharedProcessor;
    }

    public final O<NavigationEventTransitionState> getTransitionState() {
        return this.sharedProcessor.getTransitionState();
    }

    public final boolean isEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isEnabled;
        }
        return false;
    }

    public final void removeHandler$navigationevent(NavigationEventHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.handlers.remove(handler)) {
            this.sharedProcessor.removeHandler(handler);
        }
    }

    @MainThread
    public final void removeInput(NavigationEventInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (this.inputs.remove(input)) {
            this.sharedProcessor.removeInput(input);
        }
    }

    public final void setEnabled(boolean z) {
        checkInvariants();
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        this.sharedProcessor.refreshEnabledHandlers();
    }

    @JvmOverloads
    @MainThread
    public final void addHandler(NavigationEventHandler<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        checkInvariants();
        if (this.handlers.add(handler)) {
            this.sharedProcessor.addHandler(this, handler, priority);
        }
    }

    @MainThread
    public final void addInput(NavigationEventInput input, int priority) {
        Intrinsics.checkNotNullParameter(input, "input");
        checkInvariants();
        if (priority != 1 && priority != 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(priority, "Unsupported priority value: ").toString());
        }
        if (this.inputs.add(input)) {
            this.sharedProcessor.addInput(this, input, priority);
        }
    }

    public NavigationEventDispatcher() {
        this(null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(OnBackCompletedFallback onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "onBackCompletedFallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(NavigationEventDispatcher parent) {
        this(parent, null);
        Intrinsics.checkNotNullParameter(parent, "parent");
    }
}

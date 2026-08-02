package androidx.navigationevent;

import androidx.core.app.NotificationCompat;
import androidx.navigationevent.NavigationEventTransitionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.G;
import kotlinx.coroutines.flow.I;
import kotlinx.coroutines.flow.O;
import kotlinx.coroutines.flow.P;
import kotlinx.coroutines.flow.Q;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\n0\tH\u0082\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u001d\u0010\u0016J%\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010'J'\u0010+\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000200038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00102R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000208038\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001e\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u001c\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0003R\u0018\u0010E\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010M¨\u0006P"}, d2 = {"Landroidx/navigationevent/NavigationEventProcessor;", "", "<init>", "()V", "", "direction", "Landroidx/navigationevent/NavigationEventHandler;", "resolveEnabledHandler", "(I)Landroidx/navigationevent/NavigationEventHandler;", "Lkotlin/Function1;", "", "predicate", "findHandler", "(Lkotlin/jvm/functions/Function1;)Landroidx/navigationevent/NavigationEventHandler;", "", "Landroidx/navigationevent/NavigationEventInfo;", "resolveCombinedBackInfo", "()Ljava/util/List;", "", "refreshEnabledHandlers", "handler", "updateEnabledHandlerInfo$navigationevent", "(Landroidx/navigationevent/NavigationEventHandler;)V", "updateEnabledHandlerInfo", "Landroidx/navigationevent/NavigationEventDispatcher;", "dispatcher", "priority", "addHandler", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventHandler;I)V", "removeHandler", "Landroidx/navigationevent/NavigationEventInput;", "input", "addInput", "(Landroidx/navigationevent/NavigationEventDispatcher;Landroidx/navigationevent/NavigationEventInput;I)V", "removeInput", "(Landroidx/navigationevent/NavigationEventInput;)V", "Landroidx/navigationevent/NavigationEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchOnStarted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/NavigationEvent;)V", "dispatchOnProgressed", "Landroidx/navigationevent/OnBackCompletedFallback;", "onBackCompletedFallback", "dispatchOnCompleted", "(Landroidx/navigationevent/NavigationEventInput;ILandroidx/navigationevent/OnBackCompletedFallback;)V", "dispatchOnCancelled", "(Landroidx/navigationevent/NavigationEventInput;I)V", "Lkotlinx/coroutines/flow/G;", "Landroidx/navigationevent/NavigationEventTransitionState;", "_transitionState", "Lkotlinx/coroutines/flow/G;", "Lkotlinx/coroutines/flow/O;", "transitionState", "Lkotlinx/coroutines/flow/O;", "getTransitionState", "()Lkotlinx/coroutines/flow/O;", "Landroidx/navigationevent/NavigationEventHistory;", "_history", "history", "getHistory", "Lkotlin/collections/ArrayDeque;", "overlayHandlers", "Lkotlin/collections/ArrayDeque;", "defaultHandlers", "inProgressHandler", "Landroidx/navigationevent/NavigationEventHandler;", "inProgressDirection", "I", "getInProgressDirection$annotations", "inProgressInput", "Landroidx/navigationevent/NavigationEventInput;", "", "unspecifiedInputs", "Ljava/util/Set;", "defaultInputs", "overlayInputs", "hasEnabledDefaultHandlers", "Z", "hasEnabledOverlayHandlers", "hasEnabledAnyHandlers", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationEventProcessor.kt\nandroidx/navigationevent/NavigationEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,626:1\n577#1:633\n577#1:636\n577#1:639\n1755#2,3:627\n1755#2,3:630\n295#2,2:634\n295#2,2:637\n295#2,2:640\n295#2,2:642\n*S KotlinDebug\n*F\n+ 1 NavigationEventProcessor.kt\nandroidx/navigationevent/NavigationEventProcessor\n*L\n555#1:633\n556#1:636\n557#1:639\n173#1:627,3\n174#1:630,3\n555#1:634,2\n556#1:637,2\n557#1:640,2\n577#1:642,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavigationEventProcessor {
    private final G<NavigationEventHistory> _history;
    private final G<NavigationEventTransitionState> _transitionState;
    private final ArrayDeque<NavigationEventHandler<?>> defaultHandlers;
    private final Set<NavigationEventInput> defaultInputs;
    private boolean hasEnabledAnyHandlers;
    private boolean hasEnabledDefaultHandlers;
    private boolean hasEnabledOverlayHandlers;
    private final O<NavigationEventHistory> history;
    private int inProgressDirection;
    private NavigationEventHandler<?> inProgressHandler;
    private NavigationEventInput inProgressInput;
    private final ArrayDeque<NavigationEventHandler<?>> overlayHandlers;
    private final Set<NavigationEventInput> overlayInputs;
    private final O<NavigationEventTransitionState> transitionState;
    private final Set<NavigationEventInput> unspecifiedInputs;

    public NavigationEventProcessor() {
        P a = Q.a(NavigationEventTransitionState.Idle.INSTANCE);
        this._transitionState = a;
        this.transitionState = new I(a);
        P a2 = Q.a(new NavigationEventHistory());
        this._history = a2;
        this.history = new I(a2);
        this.overlayHandlers = new ArrayDeque<>();
        this.defaultHandlers = new ArrayDeque<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    public static /* synthetic */ void addHandler$default(NavigationEventProcessor navigationEventProcessor, NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        navigationEventProcessor.addHandler(navigationEventDispatcher, navigationEventHandler, i);
    }

    public static /* synthetic */ void dispatchOnStarted$default(NavigationEventProcessor navigationEventProcessor, NavigationEventInput navigationEventInput, int i, NavigationEvent navigationEvent, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            navigationEvent = null;
        }
        navigationEventProcessor.dispatchOnStarted(navigationEventInput, i, navigationEvent);
    }

    private final NavigationEventHandler<?> findHandler(Function1<? super NavigationEventHandler<?>, Boolean> predicate) {
        NavigationEventHandler<?> navigationEventHandler;
        NavigationEventHandler<?> navigationEventHandler2;
        Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
        while (true) {
            navigationEventHandler = null;
            if (!it.hasNext()) {
                navigationEventHandler2 = null;
                break;
            }
            navigationEventHandler2 = it.next();
            if (predicate.invoke(navigationEventHandler2).booleanValue()) {
                break;
            }
        }
        NavigationEventHandler<?> navigationEventHandler3 = navigationEventHandler2;
        if (navigationEventHandler3 != null) {
            return navigationEventHandler3;
        }
        Iterator<NavigationEventHandler<?>> it2 = this.defaultHandlers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NavigationEventHandler<?> next = it2.next();
            if (predicate.invoke(next).booleanValue()) {
                navigationEventHandler = next;
                break;
            }
        }
        return navigationEventHandler;
    }

    private static /* synthetic */ void getInProgressDirection$annotations() {
    }

    private final List<NavigationEventInfo> resolveCombinedBackInfo() {
        ArrayList arrayList = new ArrayList();
        Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
        while (it.hasNext()) {
            NavigationEventHandler<?> next = it.next();
            if (next.isBackEnabled() && !next.getBackInfo().isEmpty()) {
                arrayList.addAll(next.getBackInfo());
            }
        }
        Iterator<NavigationEventHandler<?>> it2 = this.defaultHandlers.iterator();
        while (it2.hasNext()) {
            NavigationEventHandler<?> next2 = it2.next();
            if (next2.isBackEnabled() && !next2.getBackInfo().isEmpty()) {
                arrayList.addAll(next2.getBackInfo());
            }
        }
        return arrayList;
    }

    private final NavigationEventHandler<?> resolveEnabledHandler(int direction) {
        NavigationEventHandler<?> navigationEventHandler;
        NavigationEventHandler<?> navigationEventHandler2;
        NavigationEventHandler<?> navigationEventHandler3;
        NavigationEventHandler<?> navigationEventHandler4 = null;
        if (direction == -1) {
            Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    navigationEventHandler = null;
                    break;
                }
                navigationEventHandler = it.next();
                if (navigationEventHandler.isBackEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler5 = navigationEventHandler;
            if (navigationEventHandler5 != null) {
                return navigationEventHandler5;
            }
            Iterator<NavigationEventHandler<?>> it2 = this.defaultHandlers.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NavigationEventHandler<?> next = it2.next();
                if (next.isBackEnabled()) {
                    navigationEventHandler4 = next;
                    break;
                }
            }
            return navigationEventHandler4;
        }
        if (direction == 0) {
            Iterator<NavigationEventHandler<?>> it3 = this.overlayHandlers.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    navigationEventHandler2 = null;
                    break;
                }
                navigationEventHandler2 = it3.next();
                NavigationEventHandler<?> navigationEventHandler6 = navigationEventHandler2;
                if (navigationEventHandler6.isBackEnabled() || navigationEventHandler6.isForwardEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler7 = navigationEventHandler2;
            if (navigationEventHandler7 != null) {
                return navigationEventHandler7;
            }
            for (NavigationEventHandler<?> navigationEventHandler8 : this.defaultHandlers) {
                NavigationEventHandler<?> navigationEventHandler9 = navigationEventHandler8;
                if (navigationEventHandler9.isBackEnabled() || navigationEventHandler9.isForwardEnabled()) {
                    navigationEventHandler4 = navigationEventHandler8;
                    break;
                }
            }
            return navigationEventHandler4;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<NavigationEventHandler<?>> it4 = this.overlayHandlers.iterator();
        while (true) {
            if (!it4.hasNext()) {
                navigationEventHandler3 = null;
                break;
            }
            navigationEventHandler3 = it4.next();
            if (navigationEventHandler3.isForwardEnabled()) {
                break;
            }
        }
        NavigationEventHandler<?> navigationEventHandler10 = navigationEventHandler3;
        if (navigationEventHandler10 != null) {
            return navigationEventHandler10;
        }
        Iterator<NavigationEventHandler<?>> it5 = this.defaultHandlers.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            NavigationEventHandler<?> next2 = it5.next();
            if (next2.isForwardEnabled()) {
                navigationEventHandler4 = next2;
                break;
            }
        }
        return navigationEventHandler4;
    }

    public static /* synthetic */ NavigationEventHandler resolveEnabledHandler$default(NavigationEventProcessor navigationEventProcessor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return navigationEventProcessor.resolveEnabledHandler(i);
    }

    public final void addHandler(NavigationEventDispatcher dispatcher, NavigationEventHandler<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler.getDispatcher() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (priority == 0) {
            this.overlayHandlers.addFirst(handler);
        } else {
            if (priority != 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(priority, "Unsupported priority value: "));
            }
            this.defaultHandlers.addFirst(handler);
        }
        handler.setDispatcher$navigationevent(dispatcher);
        refreshEnabledHandlers();
    }

    public final void addInput(NavigationEventDispatcher dispatcher, NavigationEventInput input, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getDispatcher() == null) {
            (priority != 0 ? priority != 1 ? this.unspecifiedInputs : this.defaultInputs : this.overlayInputs).add(input);
            input.setDispatcher$navigationevent(dispatcher);
            input.doOnAdded$navigationevent(dispatcher);
            input.doOnHistoryChanged$navigationevent(this.history.getValue());
            input.doOnHasEnabledHandlersChanged$navigationevent(priority != 0 ? priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers : this.hasEnabledOverlayHandlers);
            return;
        }
        throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.getDispatcher() + '.').toString());
    }

    public final void dispatchOnCancelled(NavigationEventInput input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.areEqual(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandler = this.inProgressHandler;
            if (navigationEventHandler == null) {
                navigationEventHandler = resolveEnabledHandler(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && navigationEventHandler != null) {
                    navigationEventHandler.doOnForwardCancelled$navigationevent();
                }
            } else if (navigationEventHandler != null) {
                navigationEventHandler.doOnBackCancelled$navigationevent();
            }
            this._transitionState.setValue(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnCompleted(NavigationEventInput input, int direction, OnBackCompletedFallback onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.areEqual(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandler = this.inProgressHandler;
            if (navigationEventHandler == null) {
                navigationEventHandler = resolveEnabledHandler(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && navigationEventHandler != null) {
                    navigationEventHandler.doOnForwardCompleted$navigationevent();
                }
            } else if (navigationEventHandler != null) {
                navigationEventHandler.doOnBackCompleted$navigationevent();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.onBackCompletedFallback();
            }
            this._transitionState.setValue(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnProgressed(NavigationEventInput input, int direction, NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(input, this.inProgressInput) && direction == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandler = this.inProgressHandler;
            if (navigationEventHandler == null) {
                navigationEventHandler = resolveEnabledHandler(direction);
            }
            if (direction != -1) {
                if (direction == 1 && navigationEventHandler != null) {
                    navigationEventHandler.doOnForwardProgressed$navigationevent(event);
                }
            } else if (navigationEventHandler != null) {
                navigationEventHandler.doOnBackProgressed$navigationevent(event);
            }
            this._transitionState.setValue(new NavigationEventTransitionState.InProgress(event, direction));
        }
    }

    public final void dispatchOnStarted(NavigationEventInput input, int direction, NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        NavigationEventHandler<?> resolveEnabledHandler = resolveEnabledHandler(direction);
        this.inProgressHandler = resolveEnabledHandler;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && resolveEnabledHandler != null) {
                    resolveEnabledHandler.doOnForwardStarted$navigationevent(event);
                }
            } else if (resolveEnabledHandler != null) {
                resolveEnabledHandler.doOnBackStarted$navigationevent(event);
            }
            this._transitionState.setValue(new NavigationEventTransitionState.InProgress(event, direction));
        }
    }

    public final O<NavigationEventHistory> getHistory() {
        return this.history;
    }

    public final O<NavigationEventTransitionState> getTransitionState() {
        return this.transitionState;
    }

    public final void refreshEnabledHandlers() {
        boolean z;
        boolean z2;
        ArrayDeque<NavigationEventHandler<?>> arrayDeque = this.overlayHandlers;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            for (NavigationEventHandler<?> navigationEventHandler : arrayDeque) {
                if (navigationEventHandler.isBackEnabled() || navigationEventHandler.isForwardEnabled()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayDeque<NavigationEventHandler<?>> arrayDeque2 = this.defaultHandlers;
        if (arrayDeque2 == null || !arrayDeque2.isEmpty()) {
            for (NavigationEventHandler<?> navigationEventHandler2 : arrayDeque2) {
                if (navigationEventHandler2.isBackEnabled() || navigationEventHandler2.isForwardEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.hasEnabledOverlayHandlers != z;
        boolean z5 = this.hasEnabledDefaultHandlers != z2;
        boolean z6 = this.hasEnabledAnyHandlers != z3;
        if (z4) {
            Iterator<NavigationEventInput> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().doOnHasEnabledHandlersChanged$navigationevent(z);
            }
        }
        if (z5) {
            Iterator<NavigationEventInput> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().doOnHasEnabledHandlersChanged$navigationevent(z2);
            }
        }
        if (z6) {
            Iterator<NavigationEventInput> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().doOnHasEnabledHandlersChanged$navigationevent(z3);
            }
        }
        this.hasEnabledOverlayHandlers = z;
        this.hasEnabledDefaultHandlers = z2;
        this.hasEnabledAnyHandlers = z3;
        NavigationEventHandler<?> navigationEventHandler3 = this.inProgressHandler;
        if (navigationEventHandler3 == null) {
            navigationEventHandler3 = resolveEnabledHandler$default(this, 0, 1, null);
        }
        updateEnabledHandlerInfo$navigationevent(navigationEventHandler3);
    }

    public final void removeHandler(NavigationEventHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (Intrinsics.areEqual(handler, this.inProgressHandler)) {
            int i = this.inProgressDirection;
            if (i == -1) {
                handler.doOnBackCancelled$navigationevent();
            } else if (i == 1) {
                handler.doOnForwardCancelled$navigationevent();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.setDispatcher$navigationevent(null);
        refreshEnabledHandlers();
    }

    public final void removeInput(NavigationEventInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.overlayInputs.remove(input);
        this.defaultInputs.remove(input);
        this.unspecifiedInputs.remove(input);
        input.setDispatcher$navigationevent(null);
        input.doOnRemoved$navigationevent();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.navigationevent.NavigationEventInfo] */
    public final void updateEnabledHandlerInfo$navigationevent(NavigationEventHandler<?> handler) {
        NavigationEventHistory navigationEventHistory;
        NavigationEventHandler<?> navigationEventHandler = this.inProgressHandler;
        if (navigationEventHandler == null) {
            navigationEventHandler = resolveEnabledHandler$default(this, 0, 1, null);
        }
        if (Intrinsics.areEqual(navigationEventHandler, handler)) {
            if (navigationEventHandler == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(navigationEventHandler.getCurrentInfo(), resolveCombinedBackInfo(), navigationEventHandler.getForwardInfo());
            }
            if (Intrinsics.areEqual(this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<NavigationEventInput> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
            Iterator<NavigationEventInput> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().doOnHistoryChanged$navigationevent(navigationEventHistory);
            }
        }
    }
}

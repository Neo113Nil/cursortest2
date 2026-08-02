package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR*\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "Landroidx/lifecycle/AtomicReference;", "internalScopeRef", "Landroidx/lifecycle/AtomicReference;", "getInternalScopeRef", "()Landroidx/lifecycle/AtomicReference;", "setInternalScopeRef", "(Landroidx/lifecycle/AtomicReference;)V", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "currentStateFlow", "Event", "State"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Lifecycle {
    private androidx.view.AtomicReference<java.lang.Object> internalScopeRef = new androidx.view.AtomicReference<>(null);

    public abstract void addObserver(androidx.view.LifecycleObserver observer);

    /* renamed from: getCurrentState */
    public abstract androidx.lifecycle.Lifecycle.State getCamera2StreamConfigurationMap();

    public abstract void removeObserver(androidx.view.LifecycleObserver observer);

    public final androidx.view.AtomicReference<java.lang.Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public final void setInternalScopeRef(androidx.view.AtomicReference<java.lang.Object> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        this.internalScopeRef = atomicReference;
    }

    public kotlinx.coroutines.flow.StateFlow<androidx.lifecycle.Lifecycle.State> getCurrentStateFlow() {
        final kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getCamera2StreamConfigurationMap());
        addObserver(new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.view.Lifecycle.m9162$r8$lambda$DNZNkfFOuaL0WXhwA84q2dz864(kotlinx.coroutines.flow.MutableStateFlow.this, lifecycleOwner, event);
            }
        });
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Event {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.Lifecycle.Event.Companion INSTANCE;
        public static final androidx.lifecycle.Lifecycle.Event ON_ANY;
        public static final androidx.lifecycle.Lifecycle.Event ON_CREATE;
        public static final androidx.lifecycle.Lifecycle.Event ON_DESTROY;
        public static final androidx.lifecycle.Lifecycle.Event ON_PAUSE;
        public static final androidx.lifecycle.Lifecycle.Event ON_RESUME;
        public static final androidx.lifecycle.Lifecycle.Event ON_START;
        public static final androidx.lifecycle.Lifecycle.Event ON_STOP;

        private Event(java.lang.String str, int i) {
        }

        static {
            androidx.lifecycle.Lifecycle.Event event = new androidx.lifecycle.Lifecycle.Event("ON_CREATE", 0);
            ON_CREATE = event;
            androidx.lifecycle.Lifecycle.Event event2 = new androidx.lifecycle.Lifecycle.Event("ON_START", 1);
            ON_START = event2;
            androidx.lifecycle.Lifecycle.Event event3 = new androidx.lifecycle.Lifecycle.Event("ON_RESUME", 2);
            ON_RESUME = event3;
            androidx.lifecycle.Lifecycle.Event event4 = new androidx.lifecycle.Lifecycle.Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            androidx.lifecycle.Lifecycle.Event event5 = new androidx.lifecycle.Lifecycle.Event("ON_STOP", 4);
            ON_STOP = event5;
            androidx.lifecycle.Lifecycle.Event event6 = new androidx.lifecycle.Lifecycle.Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            androidx.lifecycle.Lifecycle.Event event7 = new androidx.lifecycle.Lifecycle.Event("ON_ANY", 6);
            ON_ANY = event7;
            androidx.lifecycle.Lifecycle.Event[] eventArr = {event, event2, event3, event4, event5, event6, event7};
            $VALUES = eventArr;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(eventArr);
            INSTANCE = new androidx.lifecycle.Lifecycle.Event.Companion(null);
        }

        public final androidx.lifecycle.Lifecycle.State getTargetState() {
            switch (androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return androidx.lifecycle.Lifecycle.State.CREATED;
                case 3:
                case 4:
                    return androidx.lifecycle.Lifecycle.State.STARTED;
                case 5:
                    return androidx.lifecycle.Lifecycle.State.RESUMED;
                case 6:
                    return androidx.lifecycle.Lifecycle.State.DESTROYED;
                case 7:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/Lifecycle$Event;", "downFrom", "(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;", "downTo", "upFrom", "upTo"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_STOP;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_START;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_CREATE;
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State state) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
                int i = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return androidx.lifecycle.Lifecycle.Event.ON_CREATE;
                }
                if (i == 2) {
                    return androidx.lifecycle.Lifecycle.Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return androidx.lifecycle.Lifecycle.Event.ON_RESUME;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.DESTROYED.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static androidx.lifecycle.Lifecycle.Event[] values() {
            return (androidx.lifecycle.Lifecycle.Event[]) $VALUES.clone();
        }

        public static androidx.lifecycle.Lifecycle.Event valueOf(java.lang.String str) {
            return (androidx.lifecycle.Lifecycle.Event) java.lang.Enum.valueOf(androidx.lifecycle.Lifecycle.Event.class, str);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.upTo(state);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.upFrom(state);
        }

        public static kotlin.enums.EnumEntries<androidx.lifecycle.Lifecycle.Event> getEntries() {
            return $ENTRIES;
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_ANY.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.downTo(state);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State state) {
            return INSTANCE.downFrom(state);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "<init>", "(Ljava/lang/String;I)V", "state", "", "isAtLeast", "(Landroidx/lifecycle/Lifecycle$State;)Z", "DESTROYED", "INITIALIZED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "STARTED", "RESUMED"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        public static final androidx.lifecycle.Lifecycle.State CREATED;
        public static final androidx.lifecycle.Lifecycle.State DESTROYED;
        public static final androidx.lifecycle.Lifecycle.State INITIALIZED;
        public static final androidx.lifecycle.Lifecycle.State RESUMED;
        public static final androidx.lifecycle.Lifecycle.State STARTED;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] getHighSpeedVideoFpsRangesFor;

        private State(java.lang.String str, int i) {
        }

        static {
            androidx.lifecycle.Lifecycle.State state = new androidx.lifecycle.Lifecycle.State("DESTROYED", 0);
            DESTROYED = state;
            androidx.lifecycle.Lifecycle.State state2 = new androidx.lifecycle.Lifecycle.State("INITIALIZED", 1);
            INITIALIZED = state2;
            androidx.lifecycle.Lifecycle.State state3 = new androidx.lifecycle.Lifecycle.State(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 2);
            CREATED = state3;
            androidx.lifecycle.Lifecycle.State state4 = new androidx.lifecycle.Lifecycle.State("STARTED", 3);
            STARTED = state4;
            androidx.lifecycle.Lifecycle.State state5 = new androidx.lifecycle.Lifecycle.State("RESUMED", 4);
            RESUMED = state5;
            androidx.lifecycle.Lifecycle.State[] stateArr = {state, state2, state3, state4, state5};
            getHighSpeedVideoFpsRangesFor = stateArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public final boolean isAtLeast(androidx.lifecycle.Lifecycle.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return compareTo(state) >= 0;
        }

        public static androidx.lifecycle.Lifecycle.State[] values() {
            return (androidx.lifecycle.Lifecycle.State[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.lifecycle.Lifecycle.State valueOf(java.lang.String str) {
            return (androidx.lifecycle.Lifecycle.State) java.lang.Enum.valueOf(androidx.lifecycle.Lifecycle.State.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.lifecycle.Lifecycle.State> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* renamed from: $r8$lambda$DNZNkfFOuaL0W-XhwA84q2dz864, reason: not valid java name */
    public static /* synthetic */ void m9162$r8$lambda$DNZNkfFOuaL0WXhwA84q2dz864(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        mutableStateFlow.setValue(event.getTargetState());
    }
}

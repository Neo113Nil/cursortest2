package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lcom/google/android/gms/maps/MapView;", "mapView", "<init>", "(Lcom/google/android/gms/maps/MapView;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "moveToBaseState", "()V", "moveToDestroyedState", "Landroidx/lifecycle/Lifecycle$State;", "targetState", "moveToLifecycleState", "(Landroidx/lifecycle/Lifecycle$State;)V", "moveDown", "moveUp", "invokeEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Lcom/google/android/gms/maps/MapView;", "currentLifecycleState", "Landroidx/lifecycle/Lifecycle$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
final class MapLifecycleEventObserver implements androidx.view.LifecycleEventObserver {
    private androidx.lifecycle.Lifecycle.State currentLifecycleState;
    private final com.google.android.gms.maps.MapView mapView;

    public MapLifecycleEventObserver(com.google.android.gms.maps.MapView mapView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapView, "");
        this.mapView = mapView;
        this.currentLifecycleState = androidx.lifecycle.Lifecycle.State.INITIALIZED;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (com.google.maps.android.compose.MapLifecycleEventObserver.WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            moveToBaseState();
        } else {
            moveToLifecycleState(event.getTargetState());
        }
    }

    public final void moveToBaseState() {
        if (this.currentLifecycleState.compareTo(androidx.lifecycle.Lifecycle.State.CREATED) > 0) {
            moveToLifecycleState(androidx.lifecycle.Lifecycle.State.CREATED);
        }
    }

    public final void moveToDestroyedState() {
        if (this.currentLifecycleState.compareTo(androidx.lifecycle.Lifecycle.State.INITIALIZED) > 0) {
            moveToLifecycleState(androidx.lifecycle.Lifecycle.State.DESTROYED);
        }
    }

    private final void moveToLifecycleState(androidx.lifecycle.Lifecycle.State targetState) {
        while (true) {
            androidx.lifecycle.Lifecycle.State state = this.currentLifecycleState;
            if (state == targetState) {
                return;
            }
            androidx.lifecycle.Lifecycle.State state2 = targetState;
            if (state.compareTo(state2) < 0) {
                moveUp();
            } else if (this.currentLifecycleState.compareTo(state2) > 0) {
                moveDown();
            }
        }
    }

    private final void moveDown() {
        androidx.lifecycle.Lifecycle.Event downFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.downFrom(this.currentLifecycleState);
        if (downFrom == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no event down from ");
            sb.append(this.currentLifecycleState);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        invokeEvent(downFrom);
    }

    private final void moveUp() {
        androidx.lifecycle.Lifecycle.Event upFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.upFrom(this.currentLifecycleState);
        if (upFrom == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no event up from ");
            sb.append(this.currentLifecycleState);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        invokeEvent(upFrom);
    }

    private final void invokeEvent(androidx.lifecycle.Lifecycle.Event event) {
        switch (com.google.maps.android.compose.MapLifecycleEventObserver.WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.mapView.onDestroy();
                break;
            case 2:
                this.mapView.onCreate(new android.os.Bundle());
                break;
            case 3:
                this.mapView.onStart();
                break;
            case 4:
                this.mapView.onResume();
                break;
            case 5:
                this.mapView.onPause();
                break;
            case 6:
                this.mapView.onStop();
                break;
            default:
                throw new java.lang.IllegalStateException("Unsupported lifecycle event: ".concat(java.lang.String.valueOf(event)).toString());
        }
        this.currentLifecycleState = event.getTargetState();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

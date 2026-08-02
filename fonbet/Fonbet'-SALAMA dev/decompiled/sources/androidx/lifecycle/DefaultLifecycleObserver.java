package androidx.lifecycle;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC0744s {
    default void onCreate(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }

    default void onDestroy(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }

    default void onPause(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }

    default void onResume(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }

    default void onStart(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }

    default void onStop(InterfaceC0745t interfaceC0745t) {
        t6.h.e(interfaceC0745t, "owner");
    }
}

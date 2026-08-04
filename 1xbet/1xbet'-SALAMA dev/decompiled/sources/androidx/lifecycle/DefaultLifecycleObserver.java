package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC0723s {
    default void onCreate(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }

    default void onDestroy(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }

    default void onPause(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }

    default void onResume(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }

    default void onStart(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }

    default void onStop(InterfaceC0724t interfaceC0724t) {
        t6.h.e(interfaceC0724t, "owner");
    }
}

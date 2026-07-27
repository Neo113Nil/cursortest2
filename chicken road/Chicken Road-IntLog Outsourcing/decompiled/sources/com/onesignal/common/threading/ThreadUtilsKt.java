package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.E;
import D4.S;
import D4.X;
import j4.a;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ThreadUtilsKt {
    public static final X launchOnDefault(InterfaceC1441l block) {
        i.e(block, "block");
        return ThreadingMode.INSTANCE.getUseBackgroundThreading() ? OneSignalDispatchers.INSTANCE.launchOnDefault(new ThreadUtilsKt$launchOnDefault$1(block, null)) : AbstractC0024y.n(S.f480a, E.f459a, 0, new ThreadUtilsKt$launchOnDefault$2(block, null), 2);
    }

    public static final X launchOnIO(InterfaceC1441l block) {
        i.e(block, "block");
        return ThreadingMode.INSTANCE.getUseBackgroundThreading() ? OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$launchOnIO$1(block, null)) : AbstractC0024y.n(S.f480a, E.f461c, 0, new ThreadUtilsKt$launchOnIO$2(block, null), 2);
    }

    public static final void runOnSerialIOIfBackgroundThreading(InterfaceC1430a block) {
        i.e(block, "block");
        if (ThreadingMode.INSTANCE.getUseBackgroundThreading()) {
            suspendifyOnSerialIO(new ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1(block, null));
        } else {
            block.invoke();
        }
    }

    public static final void suspendifyOnDefault(InterfaceC1441l block) {
        i.e(block, "block");
        suspendifyWithCompletion(false, block, null);
    }

    public static final void suspendifyOnIO(InterfaceC1441l block, InterfaceC1430a interfaceC1430a) {
        i.e(block, "block");
        suspendifyWithCompletion(true, block, interfaceC1430a);
    }

    public static /* synthetic */ void suspendifyOnIO$default(InterfaceC1441l interfaceC1441l, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        suspendifyOnIO(interfaceC1441l, interfaceC1430a);
    }

    public static final void suspendifyOnMain(InterfaceC1441l block) {
        i.e(block, "block");
        if (ThreadingMode.INSTANCE.getUseBackgroundThreading()) {
            OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$suspendifyOnMain$1(block, null));
        } else {
            new a(new ThreadUtilsKt$suspendifyOnMain$2(block)).start();
        }
    }

    public static final void suspendifyOnSerialIO(InterfaceC1441l block) {
        i.e(block, "block");
        OneSignalDispatchers.INSTANCE.launchOnSerialIO(new ThreadUtilsKt$suspendifyOnSerialIO$1(block, null));
    }

    public static final void suspendifyWithCompletion(boolean z, InterfaceC1441l block, InterfaceC1430a interfaceC1430a) {
        i.e(block, "block");
        if (!ThreadingMode.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0024y.n(S.f480a, z ? E.f461c : E.f459a, 0, new ThreadUtilsKt$suspendifyWithCompletion$3(block, interfaceC1430a, null), 2);
        } else if (z) {
            OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$suspendifyWithCompletion$1(block, interfaceC1430a, null));
        } else {
            OneSignalDispatchers.INSTANCE.launchOnDefault(new ThreadUtilsKt$suspendifyWithCompletion$2(block, interfaceC1430a, null));
        }
    }

    public static /* synthetic */ void suspendifyWithCompletion$default(boolean z, InterfaceC1441l interfaceC1441l, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            interfaceC1430a = null;
        }
        suspendifyWithCompletion(z, interfaceC1441l, interfaceC1430a);
    }

    public static final void suspendifyWithErrorHandling(boolean z, InterfaceC1441l block, InterfaceC1441l interfaceC1441l, InterfaceC1430a interfaceC1430a) {
        i.e(block, "block");
        if (!ThreadingMode.INSTANCE.getUseBackgroundThreading()) {
            AbstractC0024y.n(S.f480a, z ? E.f461c : E.f459a, 0, new ThreadUtilsKt$suspendifyWithErrorHandling$3(block, interfaceC1430a, interfaceC1441l, null), 2);
        } else if (z) {
            OneSignalDispatchers.INSTANCE.launchOnIO(new ThreadUtilsKt$suspendifyWithErrorHandling$1(block, interfaceC1430a, interfaceC1441l, null));
        } else {
            OneSignalDispatchers.INSTANCE.launchOnDefault(new ThreadUtilsKt$suspendifyWithErrorHandling$2(block, interfaceC1430a, interfaceC1441l, null));
        }
    }

    public static /* synthetic */ void suspendifyWithErrorHandling$default(boolean z, InterfaceC1441l interfaceC1441l, InterfaceC1441l interfaceC1441l2, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            interfaceC1441l2 = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC1430a = null;
        }
        suspendifyWithErrorHandling(z, interfaceC1441l, interfaceC1441l2, interfaceC1430a);
    }

    public static final void suspendifyOnIO(InterfaceC1441l block) {
        i.e(block, "block");
        suspendifyWithCompletion(true, block, null);
    }
}

package com.goldenboot.saga.zone;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface DividerWrapper extends SpacerRecovery {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    DelegateEmitter getReturnType();

    List getTypeParameters();

    MarginMux getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}

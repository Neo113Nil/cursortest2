package com.amplitude.core.platform.intercept;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface c {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    Object a(Continuation<? super com.amplitude.core.events.a> continuation);

    Object b(Continuation<? super Unit> continuation);
}

package com.amplitude.core.utilities;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface n {
    List<Object> a();

    Object b(Object obj, Continuation<? super String> continuation);

    Object c(ContinuationImpl continuationImpl);

    boolean e(String str);
}

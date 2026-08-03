package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public interface J {
    long a();

    long elapsedRealtime();

    @kotlin.Deprecated(message = "Use currentTime() instead", replaceWith = @kotlin.ReplaceWith(expression = "currentTime()", imports = {}))
    long invoke();
}

package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public abstract class y {
    public abstract java.lang.String a();

    public final java.lang.String toString() {
        java.lang.String a2 = a();
        return a2 != null ? a2.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}

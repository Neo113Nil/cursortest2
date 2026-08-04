package p077k6;

import p065i6.d;
import p065i6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14798a = new b();

    @Override // p065i6.d
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

package com.ironsource;

import android.os.Handler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.eg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4396eg {
    public static final InterfaceC4378dg a(final Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new InterfaceC4378dg() { // from class: com.ironsource.eg$$ExternalSyntheticLambda3
            @Override // com.ironsource.InterfaceC4378dg
            public final void a(Function0 function0) {
                C4396eg.a(handler, function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Handler this_asDispatcher, final Function0 it) {
        Intrinsics.checkNotNullParameter(this_asDispatcher, "$this_asDispatcher");
        Intrinsics.checkNotNullParameter(it, "it");
        this_asDispatcher.post(new Runnable() { // from class: com.ironsource.eg$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4396eg.a(Function0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final InterfaceC4378dg a(final com.ironsource.environment.thread.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new InterfaceC4378dg() { // from class: com.ironsource.eg$$ExternalSyntheticLambda1
            @Override // com.ironsource.InterfaceC4378dg
            public final void a(Function0 function0) {
                C4396eg.a(com.ironsource.environment.thread.b.this, function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.environment.thread.b this_asDispatcher, final Function0 it) {
        Intrinsics.checkNotNullParameter(this_asDispatcher, "$this_asDispatcher");
        Intrinsics.checkNotNullParameter(it, "it");
        this_asDispatcher.a(new Runnable() { // from class: com.ironsource.eg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4396eg.b(Function0.this);
            }
        });
    }
}

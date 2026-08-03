package com.inmobi.media;

/* renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2281ak extends android.content.BroadcastReceiver {
    public static final void a(android.content.Intent intent, android.content.Context context) {
        com.inmobi.media.AbstractC2335ck.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final android.content.Context context, final android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.ak$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2281ak.a(intent, context);
            }
        };
        android.content.Context context2 = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }
}

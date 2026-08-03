package com.inmobi.media;

/* renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2522k extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.y()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.C2682q.g, null, null, new com.inmobi.media.C2575m(null), 3, null);
            } else {
                com.inmobi.media.C2682q.a((java.lang.Float) null);
            }
        }
    }
}

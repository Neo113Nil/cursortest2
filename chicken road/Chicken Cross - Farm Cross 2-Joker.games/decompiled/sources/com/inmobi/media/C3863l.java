package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3863l extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            r rVar = r.f7338a;
            Y5.f6965a.getClass();
            if (Y5.y()) {
                BuildersKt__Builders_commonKt.launch$default(r.g, null, null, new C3921n(null), 3, null);
            } else {
                r.a((Float) null);
            }
        }
    }
}

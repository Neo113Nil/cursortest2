package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3566ac extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3566ac(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}

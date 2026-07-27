package com.inmobi.media;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3814j7 {

    /* renamed from: a, reason: collision with root package name */
    public final C3557a3 f7175a;

    public AbstractC3814j7(String b64feature) {
        Intrinsics.checkNotNullParameter(b64feature, "b64feature");
        C3557a3 c3557a3 = new C3557a3();
        this.f7175a = c3557a3;
        c3557a3.a(b64feature);
    }

    public final boolean a(boolean z) {
        BitSet bitSet = this.f7175a.f7003a;
        return bitSet != null ? bitSet.get(0) : z;
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Wy {

    /* renamed from: a, reason: collision with root package name */
    public static final C1419pB f12132a = C1419pB.a(new byte[0]);

    public static final C1419pB a(int i) {
        return C1419pB.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final C1419pB b(int i) {
        return C1419pB.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}

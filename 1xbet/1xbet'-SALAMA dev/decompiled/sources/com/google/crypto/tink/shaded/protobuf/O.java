package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f11725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f11726b;

    static {
        N n2 = null;
        try {
            n2 = (N) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f11725a = n2;
        f11726b = new N();
    }
}

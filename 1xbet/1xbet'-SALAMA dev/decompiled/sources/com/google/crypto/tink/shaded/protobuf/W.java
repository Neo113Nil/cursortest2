package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f11746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f11747b;

    static {
        V v6 = null;
        try {
            v6 = (V) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f11746a = v6;
        f11747b = new V();
    }
}

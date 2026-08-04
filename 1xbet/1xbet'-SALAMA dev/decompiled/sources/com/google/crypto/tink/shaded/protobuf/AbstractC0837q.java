package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0837q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0836p f11816a = new C0836p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0836p f11817b;

    static {
        C0836p c0836p = null;
        try {
            c0836p = (C0836p) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f11817b = c0836p;
    }
}

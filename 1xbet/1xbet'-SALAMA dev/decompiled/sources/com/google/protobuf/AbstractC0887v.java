package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0887v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0886u f12281a = new C0886u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0886u f12282b;

    static {
        C0886u c0886u = null;
        try {
            c0886u = (C0886u) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12282b = c0886u;
    }
}

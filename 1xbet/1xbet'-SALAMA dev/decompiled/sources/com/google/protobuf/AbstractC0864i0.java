package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0864i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0862h0 f12205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0862h0 f12206b;

    static {
        C0862h0 c0862h0 = null;
        try {
            c0862h0 = (C0862h0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12205a = c0862h0;
        f12206b = new C0862h0();
    }
}

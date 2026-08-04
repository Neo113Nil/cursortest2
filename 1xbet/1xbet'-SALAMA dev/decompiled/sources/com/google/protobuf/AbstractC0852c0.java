package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0852c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0850b0 f12179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0850b0 f12180b;

    static {
        C0850b0 c0850b0 = null;
        try {
            c0850b0 = (C0850b0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12179a = c0850b0;
        f12180b = new C0850b0();
    }
}

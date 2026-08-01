package com.mbridge.msdk.dycreator.error;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DyError.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f9230a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.f9230a = bVar.g();
            this.b = bVar.h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f9230a + AbstractJsonLexerKt.END_OBJ;
    }

    public a(int i, String str) {
        this.f9230a = i;
        this.b = str;
    }
}

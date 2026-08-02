package com.google.android.gms.internal.firebase_database;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes.dex */
final class zzjp extends ThreadLocal<CharsetEncoder> {
    zzjp() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ CharsetEncoder initialValue() {
        CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return newEncoder;
    }
}

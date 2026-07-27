package com.onesignal.common;

import java.util.Arrays;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class PIIHasher$hash$1 extends j implements InterfaceC1441l {
    public static final PIIHasher$hash$1 INSTANCE = new PIIHasher$hash$1();

    public PIIHasher$hash$1() {
        super(1);
    }

    public final CharSequence invoke(byte b6) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b6)}, 1));
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).byteValue());
    }
}

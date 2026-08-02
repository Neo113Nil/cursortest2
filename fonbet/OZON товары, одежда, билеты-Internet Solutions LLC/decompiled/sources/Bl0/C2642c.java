package Bl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Bl0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2642c extends AbstractC7737t implements Function1<Byte, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C2642c f3967b = new C2642c(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b11) {
        return V.e.b(new Object[]{Byte.valueOf(b11.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}

package Bl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2643d extends AbstractC7737t implements Function1<String, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C2643d f3968b = new C2643d(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it + '\'';
    }
}

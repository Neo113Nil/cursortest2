package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: kotlinx.serialization.json.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1178b {
    public static final int a;

    static {
        Object m1716constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            m1716constructorimpl = Result.m1716constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m1722isFailureimpl(m1716constructorimpl)) {
            m1716constructorimpl = null;
        }
        Integer num = (Integer) m1716constructorimpl;
        a = num != null ? num.intValue() : 2097152;
    }
}

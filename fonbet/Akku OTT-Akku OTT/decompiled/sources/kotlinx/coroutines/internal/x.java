package kotlinx.coroutines.internal;

import kotlin.jvm.JvmField;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class x {

    @JvmField
    public final String a;

    public x(String str) {
        this.a = str;
    }

    public final String toString() {
        return androidx.compose.runtime.t.b(Typography.greater, this.a, new StringBuilder("<"));
    }
}

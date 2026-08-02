package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public abstract class m {

    public static final class a extends m {
        public static final a a = new a();
    }

    public static final class b extends m {
        public static final b a = new b();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}

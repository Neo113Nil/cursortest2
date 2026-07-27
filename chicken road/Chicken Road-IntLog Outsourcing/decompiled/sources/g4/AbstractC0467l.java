package g4;

import java.util.Collection;

/* renamed from: g4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467l extends AbstractC0466k {
    public static int D0(Iterable iterable, int i2) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}

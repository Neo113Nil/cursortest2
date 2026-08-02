package androidx.core.util;

import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {
    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean isNull;
        isNull = Objects.isNull(obj);
        return isNull;
    }
}

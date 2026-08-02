package com.izettle.android.core.data.maybe;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/izettle/android/core/data/maybe/None;", "Lcom/izettle/android/core/data/maybe/Maybe;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class None extends com.izettle.android.core.data.maybe.Maybe {
    public static final com.izettle.android.core.data.maybe.None INSTANCE = new com.izettle.android.core.data.maybe.None();

    private None() {
        super(null);
    }

    public final java.lang.String toString() {
        return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
    }
}

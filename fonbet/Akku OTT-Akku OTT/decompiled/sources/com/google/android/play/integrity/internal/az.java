package com.google.android.play.integrity.internal;

/* loaded from: classes4.dex */
public final class az implements ay {
    private final Object a;

    private az(Object obj) {
        this.a = obj;
    }

    public static ay b(Object obj) {
        if (obj != null) {
            return new az(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        return this.a;
    }
}

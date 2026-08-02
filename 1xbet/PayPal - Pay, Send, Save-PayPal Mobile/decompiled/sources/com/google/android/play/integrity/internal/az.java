package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class az implements com.google.android.play.integrity.internal.ay {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Object f3853a;

    public static com.google.android.play.integrity.internal.ay b(java.lang.Object obj) {
        if (obj != null) {
            return new com.google.android.play.integrity.internal.az(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final java.lang.Object a() {
        return this.f3853a;
    }

    private az(java.lang.Object obj) {
        this.f3853a = obj;
    }
}

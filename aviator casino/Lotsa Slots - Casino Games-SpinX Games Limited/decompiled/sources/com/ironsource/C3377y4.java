package com.ironsource;

/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3377y4 implements com.ironsource.B4 {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.SharedPreferences f6847a;
    private final android.content.SharedPreferences.Editor b;

    public C3377y4(android.content.Context context, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f6847a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // com.ironsource.B4
    public java.lang.String a(java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.f6847a.getString(key, str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.B4
    public java.util.Map<java.lang.String, ?> allData() {
        java.util.Map<java.lang.String, ?> all = this.f6847a.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.B4
    public void b(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.b.putString(key, value).apply();
    }

    @Override // com.ironsource.B4
    public void a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.b.remove(key).apply();
    }
}

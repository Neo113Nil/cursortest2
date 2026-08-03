package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class o extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.platform.r f7789a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.plugin.platform.r f7790b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f7791c;

    public o(android.content.Context context, io.flutter.plugin.platform.r rVar, android.content.Context context2) {
        super(context);
        this.f7789a = rVar;
        this.f7791c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(android.app.AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f7791c.getSystemService(str);
            }
        }
        if (this.f7790b == null) {
            this.f7790b = this.f7789a;
        }
        return this.f7790b;
    }
}

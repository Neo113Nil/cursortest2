package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fk {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.AbstractC2551l1 f4712a;
    public final java.util.HashMap b;

    public Fk(com.inmobi.media.AbstractC2551l1 timeOutInformer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.f4712a = timeOutInformer;
        this.b = new java.util.HashMap();
    }

    public final boolean a(byte b, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
        if (this.b.containsKey(java.lang.Byte.valueOf(b))) {
            a(b);
        }
        try {
            java.util.Timer timer = new java.util.Timer("Fk");
            this.b.put(java.lang.Byte.valueOf(b), timer);
            timer.schedule(new com.inmobi.media.Ek(this, b), j);
            return true;
        } catch (java.lang.InternalError e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
            e.toString();
            return false;
        }
    }

    public final void b(final byte b) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.inmobi.media.Fk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Fk.a(com.inmobi.media.Fk.this, b);
            }
        });
    }

    public static final void a(com.inmobi.media.Fk fk, byte b) {
        fk.f4712a.a(b);
    }

    public final void a(byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Fk", "TAG");
        java.util.Timer timer = (java.util.Timer) this.b.get(java.lang.Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(java.lang.Byte.valueOf(b));
        }
    }
}

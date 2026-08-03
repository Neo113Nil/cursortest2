package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2867x f4916a;
    public final kotlin.Lazy b;

    public Qc(com.inmobi.media.C2867x adComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f4916a = adComponent;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Qc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Qc.a(com.inmobi.media.Qc.this);
            }
        });
    }

    public static final com.inmobi.media.Lc a(com.inmobi.media.Qc qc) {
        com.inmobi.media.C2867x c2867x = qc.f4916a;
        return new com.inmobi.media.Lc(c2867x.b, c2867x.f5538a.d);
    }
}

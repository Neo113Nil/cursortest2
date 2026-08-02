package Gd;

import kotlin.jvm.functions.Function1;

/* renamed from: Gd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3071a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3072b f10003a;

    public C3071a(C3072b c3072b) {
        this.f10003a = c3072b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(C3072b.g(this.f10003a, (Jd.q) obj));
    }
}

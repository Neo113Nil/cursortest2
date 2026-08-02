package Kd;

import Kd.f0;
import kotlin.jvm.functions.Function1;

/* renamed from: Kd.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3494A implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15842a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15843b;

    public C3494A(String str, String str2) {
        this.f15842a = str;
        this.f15843b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return X.p(this.f15842a, this.f15843b, (f0.a.C0302a) obj);
    }
}

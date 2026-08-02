package Kd;

import Kd.f0;
import kotlin.jvm.functions.Function1;

/* renamed from: Kd.C, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3496C implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15845a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15846b;

    public C3496C(String str, String str2) {
        this.f15845a = str;
        this.f15846b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return X.r(this.f15845a, this.f15846b, (f0.a.C0302a) obj);
    }
}

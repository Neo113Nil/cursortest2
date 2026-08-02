package F0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

/* loaded from: classes8.dex */
final /* synthetic */ class A extends C7735q implements Function2<D0.a, CharSequence, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f8167a = new A(2, D0.a.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(D0.a aVar, CharSequence charSequence) {
        return Boolean.valueOf(aVar.a(charSequence));
    }
}

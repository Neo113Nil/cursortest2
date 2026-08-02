package I1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class B extends AbstractC7737t implements Function2<Object, Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final B f11678b = new B(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}

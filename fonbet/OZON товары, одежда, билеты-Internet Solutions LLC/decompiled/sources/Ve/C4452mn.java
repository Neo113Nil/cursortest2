package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.mn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4452mn extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final String f31607a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4452mn(String field) {
        super("Required field is null at the response ".concat(field));
        Intrinsics.checkNotNullParameter(field, "field");
        this.f31607a = field;
    }
}

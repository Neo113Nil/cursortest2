package Pl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class k extends AbstractC7737t implements Function0<Za.a> {

    /* renamed from: b, reason: collision with root package name */
    public static final k f22696b = new k(0);

    @Override // kotlin.jvm.functions.Function0
    public final Za.a invoke() {
        El0.n nVar = e.f22651b;
        if (nVar != null) {
            return nVar.f8122h;
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }
}

package Pl0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
public final class j extends AbstractC7737t implements Function0<List<? extends Za.a>> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f22695b = new j(0);

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Za.a> invoke() {
        El0.n nVar = e.f22651b;
        if (nVar != null) {
            return nVar.f8123i;
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }
}

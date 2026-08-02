package Ve;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Sp extends Pm0.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29994a;

    public Sp(ArrayList parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f29994a = parameters;
    }

    public final HashSet a() {
        return new HashSet(this.f29994a);
    }
}

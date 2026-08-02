package Kd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f15871a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<j0> f15872b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15873c;

    /* renamed from: d, reason: collision with root package name */
    private final Y f15874d;

    public Y(j0 j0Var, @NotNull List<j0> parametersInfo, String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f15871a = j0Var;
        this.f15872b = parametersInfo;
        this.f15873c = str;
        Y y11 = null;
        if (str != null) {
            j0 a11 = j0Var != null ? j0Var.a() : null;
            List<j0> list = parametersInfo;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (j0 j0Var2 : list) {
                arrayList.add(j0Var2 != null ? j0Var2.a() : null);
            }
            y11 = new Y(a11, arrayList, null);
        }
        this.f15874d = y11;
    }

    public final String a() {
        return this.f15873c;
    }

    @NotNull
    public final List<j0> b() {
        return this.f15872b;
    }

    public final j0 c() {
        return this.f15871a;
    }

    public final Y d() {
        return this.f15874d;
    }

    public Y() {
        this(null, kotlin.collections.K.f71697a, null);
    }
}

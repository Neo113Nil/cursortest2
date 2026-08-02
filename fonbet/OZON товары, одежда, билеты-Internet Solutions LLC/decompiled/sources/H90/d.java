package H90;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final d f10721f = new d("", "", "", "", false);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10722g = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10724b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f10725c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f10726d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10727e;

    public d(@NotNull String deleteFeatures, @NotNull String deleteSwitches, @NotNull String editFeatures, @NotNull String json, boolean z11) {
        Intrinsics.checkNotNullParameter(deleteFeatures, "deleteFeatures");
        Intrinsics.checkNotNullParameter(deleteSwitches, "deleteSwitches");
        Intrinsics.checkNotNullParameter(editFeatures, "editFeatures");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f10723a = deleteFeatures;
        this.f10724b = deleteSwitches;
        this.f10725c = editFeatures;
        this.f10726d = json;
        this.f10727e = z11;
    }

    @NotNull
    public final String b() {
        return this.f10723a;
    }

    @NotNull
    public final String c() {
        return this.f10724b;
    }

    @NotNull
    public final String d() {
        return this.f10725c;
    }

    public final boolean e() {
        return this.f10727e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f10723a, dVar.f10723a) && Intrinsics.d(this.f10724b, dVar.f10724b) && Intrinsics.d(this.f10725c, dVar.f10725c) && Intrinsics.d(this.f10726d, dVar.f10726d) && this.f10727e == dVar.f10727e;
    }

    @NotNull
    public final String f() {
        return this.f10726d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10727e) + g.a(g.a(g.a(this.f10723a.hashCode() * 31, 31, this.f10724b), 31, this.f10725c), 31, this.f10726d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TestingFeaturesV2UIState(deleteFeatures=");
        sb2.append(this.f10723a);
        sb2.append(", deleteSwitches=");
        sb2.append(this.f10724b);
        sb2.append(", editFeatures=");
        sb2.append(this.f10725c);
        sb2.append(", json=");
        sb2.append(this.f10726d);
        sb2.append(", hasChanges=");
        return Pk0.a.a(")", sb2, this.f10727e);
    }
}

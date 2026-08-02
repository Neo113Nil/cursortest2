package B1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2556z implements W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2173a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2174b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<AbstractC2531a, Integer> f2175c;

    C2556z(Map map, int i11, int i12) {
        this.f2173a = i11;
        this.f2174b = i12;
        this.f2175c = map;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f2174b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f2173a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f2175c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
    }
}

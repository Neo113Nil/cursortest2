package B1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2535d implements W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2104b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<AbstractC2531a, Integer> f2105c;

    C2535d(Map map, int i11, int i12) {
        this.f2103a = i11;
        this.f2104b = i12;
        this.f2105c = map;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f2104b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f2103a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f2105c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
    }
}

package Oe;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3705y<K, V> extends D<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3704x f20321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705y() {
        super(0);
        Z kSerializer = Z.f20279a;
        Pe.m vSerializer = Pe.m.f22295a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        Me.f keyDesc = kSerializer.b();
        Me.f valueDesc = vSerializer.b();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f20321c = new C3704x(keyDesc, valueDesc);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return this.f20321c;
    }

    @Override // Oe.AbstractC3682a
    public final Iterator d(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // Oe.AbstractC3682a
    public final int e(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }
}

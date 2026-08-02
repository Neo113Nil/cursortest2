package Oc0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.api.MtsApi;
import ud0.EnumC10041a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final MtsApi f20185a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20186b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20187c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final EnumC10041a f20188d;

    public a() {
        this(0);
    }

    public static a a(a aVar, MtsApi mtsApi, boolean z11, boolean z12, EnumC10041a connectionType, int i11) {
        if ((i11 & 1) != 0) {
            mtsApi = aVar.f20185a;
        }
        if ((i11 & 2) != 0) {
            z11 = aVar.f20186b;
        }
        if ((i11 & 4) != 0) {
            z12 = aVar.f20187c;
        }
        if ((i11 & 8) != 0) {
            connectionType = aVar.f20188d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        return new a(mtsApi, z11, z12, connectionType);
    }

    @NotNull
    public final EnumC10041a b() {
        return this.f20188d;
    }

    public final boolean c() {
        return this.f20186b;
    }

    public final MtsApi d() {
        return this.f20185a;
    }

    public final boolean e() {
        return this.f20187c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f20185a, aVar.f20185a) && this.f20186b == aVar.f20186b && this.f20187c == aVar.f20187c && this.f20188d == aVar.f20188d;
    }

    public final int hashCode() {
        MtsApi mtsApi = this.f20185a;
        return this.f20188d.hashCode() + C3532b.a(C3532b.a((mtsApi == null ? 0 : mtsApi.hashCode()) * 31, 31, this.f20186b), 31, this.f20187c);
    }

    @NotNull
    public final String toString() {
        return "MobileIdContainer(mtsApi=" + this.f20185a + ", forceMobileIdOverCellular=" + this.f20186b + ", willForceMobileIdOverCellular=" + this.f20187c + ", connectionType=" + this.f20188d + ")";
    }

    public a(MtsApi mtsApi, boolean z11, boolean z12, @NotNull EnumC10041a connectionType) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        this.f20185a = mtsApi;
        this.f20186b = z11;
        this.f20187c = z12;
        this.f20188d = connectionType;
    }

    public /* synthetic */ a(int i11) {
        this(null, false, false, EnumC10041a.Unknown);
    }
}

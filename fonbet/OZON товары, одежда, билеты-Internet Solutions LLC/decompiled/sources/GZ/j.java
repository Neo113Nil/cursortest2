package GZ;

import android.net.Uri;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f9868a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f9869b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f9870c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f9871d;

    public j(@NotNull Uri deeplink, @NotNull Uri originLink, @NotNull Map<String, ? extends Object> properties, @NotNull c deeplinkSourceType) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(originLink, "originLink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        this.f9868a = deeplink;
        this.f9869b = originLink;
        this.f9870c = properties;
        this.f9871d = deeplinkSourceType;
    }

    public static j a(j jVar, Uri deeplink) {
        Uri originLink = jVar.f9869b;
        Map<String, Object> properties = jVar.f9870c;
        c deeplinkSourceType = jVar.f9871d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(originLink, "originLink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        return new j(deeplink, originLink, properties, deeplinkSourceType);
    }

    @NotNull
    public final Uri b() {
        return this.f9868a;
    }

    @NotNull
    public final c c() {
        return this.f9871d;
    }

    @NotNull
    public final Uri d() {
        return this.f9869b;
    }

    @NotNull
    public final Map<String, Object> e() {
        return this.f9870c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f9868a, jVar.f9868a) && Intrinsics.d(this.f9869b, jVar.f9869b) && Intrinsics.d(this.f9870c, jVar.f9870c) && this.f9871d == jVar.f9871d;
    }

    public final int hashCode() {
        return this.f9871d.hashCode() + D40.c.a(this.f9870c, (this.f9869b.hashCode() + (this.f9868a.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "Route(deeplink=" + this.f9868a + ", originLink=" + this.f9869b + ", properties=" + this.f9870c + ", deeplinkSourceType=" + this.f9871d + ")";
    }

    public /* synthetic */ j(Uri uri, Uri uri2) {
        this(uri, uri2, U.c(), c.INTERNAL);
    }
}

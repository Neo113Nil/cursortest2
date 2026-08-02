package Hi0;

import gf0.AbstractC6729a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rj0.InterfaceC9287a;

/* loaded from: classes3.dex */
public final class a implements InterfaceC9287a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f11067a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f11068b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Di0.a f11069c;

    public a(@NotNull String text, @NotNull String testTag, @NotNull Di0.a destination) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f11067a = text;
        this.f11068b = testTag;
        this.f11069c = destination;
    }

    @Override // rj0.InterfaceC9287a
    @NotNull
    public final String a() {
        return this.f11068b;
    }

    @NotNull
    public final AbstractC6729a b() {
        return this.f11069c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f11067a.equals(aVar.f11067a)) {
            return this.f11068b.equals(aVar.f11068b) && Intrinsics.d(this.f11069c.e(), aVar.f11069c.e());
        }
        return false;
    }

    @Override // rj0.InterfaceC9287a
    @NotNull
    public final String getText() {
        return this.f11067a;
    }

    public final int hashCode() {
        String str = this.f11067a;
        return (this.f11069c.e().hashCode() * 31) + (str.hashCode() * 31) + (str.hashCode() * 31);
    }
}

package Ld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f16797a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f16798b;

    public m(@NotNull n deserializationComponentsForJava, @NotNull q deserializedDescriptorResolver) {
        Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f16797a = deserializationComponentsForJava;
        this.f16798b = deserializedDescriptorResolver;
    }

    @NotNull
    public final n a() {
        return this.f16797a;
    }

    @NotNull
    public final q b() {
        return this.f16798b;
    }
}

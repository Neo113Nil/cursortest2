package a10;

import Sc.InterfaceC4008j;
import android.util.LruCache;
import di0.C6201a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4914b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f36190a = Sc.k.b(a.f36191b);

    /* renamed from: a10.b$a */
    static final class a extends AbstractC7737t implements Function0<LruCache<String, C6201a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f36191b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final LruCache<String, C6201a> invoke() {
            return new LruCache<>(5);
        }
    }

    public final C6201a a(@NotNull String redirectKey) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        return (C6201a) ((LruCache) this.f36190a.getValue()).remove(redirectKey);
    }

    public final void b(@NotNull String redirectKey, @NotNull C6201a trace) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        Intrinsics.checkNotNullParameter(trace, "trace");
        ((LruCache) this.f36190a.getValue()).put(redirectKey, trace);
    }
}

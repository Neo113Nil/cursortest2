package androidx.compose.ui;

import B3.D;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f40321a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f40322b;

    /* renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0743a extends AbstractC7737t implements Function2<String, e.b, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0743a f40323b = new C0743a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, e.b bVar) {
            String str2 = str;
            e.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public a(@NotNull e eVar, @NotNull e eVar2) {
        this.f40321a = eVar;
        this.f40322b = eVar2;
    }

    @NotNull
    public final e a() {
        return this.f40322b;
    }

    @NotNull
    public final e b() {
        return this.f40321a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f40321a, aVar.f40321a) && Intrinsics.d(this.f40322b, aVar.f40322b);
    }

    public final int hashCode() {
        return (this.f40322b.hashCode() * 31) + this.f40321a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.e
    public final <R> R t(R r11, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        return (R) this.f40322b.t(this.f40321a.t(r11, function2), function2);
    }

    @NotNull
    public final String toString() {
        return D.c(new StringBuilder("["), (String) t("", C0743a.f40323b), ']');
    }

    @Override // androidx.compose.ui.e
    public final boolean w(@NotNull Function1<? super e.b, Boolean> function1) {
        return this.f40321a.w(function1) && this.f40322b.w(function1);
    }
}

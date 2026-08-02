package I1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C<Boolean> f11787a = new C<>(a.f11789b, "TestTagsAsResourceId", false);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11788b = 0;

    static final class a extends AbstractC7737t implements Function2<Boolean, Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11789b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }

    @NotNull
    public static C a() {
        return f11787a;
    }
}

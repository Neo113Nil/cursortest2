package androidx.compose.foundation.layout;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f39306a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Clip;
        public static final a ExpandIndicator;
        public static final a ExpandOrCollapseIndicator;
        public static final a Visible;

        static {
            a aVar = new a("Visible", 0);
            Visible = aVar;
            a aVar2 = new a("Clip", 1);
            Clip = aVar2;
            a aVar3 = new a("ExpandIndicator", 2);
            ExpandIndicator = aVar3;
            a aVar4 = new a("ExpandOrCollapseIndicator", 3);
            ExpandOrCollapseIndicator = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39307a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39307a = iArr;
        }
    }

    public C(a aVar) {
        this.f39306a = aVar;
    }

    public final void a(@NotNull D d11, @NotNull ArrayList arrayList) {
        int i11 = b.f39307a[this.f39306a.ordinal()];
    }

    @NotNull
    public final D b() {
        return new D(this.f39306a);
    }
}

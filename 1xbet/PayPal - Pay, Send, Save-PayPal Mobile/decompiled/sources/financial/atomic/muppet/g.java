package financial.atomic.muppet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfinancial/atomic/muppet/g;", "", "<init>", "()V", util.h.xy.cb.b.f1091, "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final financial.atomic.muppet.g.a f6869a = new financial.atomic.muppet.g.a(0);

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final financial.atomic.muppet.g.b b;
        public static final financial.atomic.muppet.g.b c;
        public static final financial.atomic.muppet.g.b d;
        private static final /* synthetic */ financial.atomic.muppet.g.b[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
        private final int getHighSpeedVideoFpsRanges;

        static {
            financial.atomic.muppet.g.b bVar = new financial.atomic.muppet.g.b("ERROR", 0, 1);
            b = bVar;
            financial.atomic.muppet.g.b bVar2 = new financial.atomic.muppet.g.b("DEBUG", 1, 2);
            c = bVar2;
            financial.atomic.muppet.g.b bVar3 = new financial.atomic.muppet.g.b("VERBOSE", 2, 3);
            d = bVar3;
            financial.atomic.muppet.g.b[] bVarArr = {bVar, bVar2, bVar3};
            getHighSpeedVideoFpsRangesFor = bVarArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bVarArr);
        }

        private b(java.lang.String str, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = i2;
        }

        public static financial.atomic.muppet.g.b valueOf(java.lang.String str) {
            return (financial.atomic.muppet.g.b) java.lang.Enum.valueOf(financial.atomic.muppet.g.b.class, str);
        }

        public static financial.atomic.muppet.g.b[] values() {
            return (financial.atomic.muppet.g.b[]) getHighSpeedVideoFpsRangesFor.clone();
        }
    }
}

package Mm0;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ONE_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class c {
    public static final c CACHE_DISABLED;
    public static final c FOUR_DAYS;
    public static final c ONE_DAY;
    public static final c THREE_DAYS;
    public static final c TWENTY_SECONDS;
    public static final c TWO_DAYS;

    /* renamed from: final, reason: not valid java name */
    private static final /* synthetic */ c[] f0final;

    /* renamed from: transient, reason: not valid java name */
    private final long f1transient;

    static {
        c cVar = new c("CACHE_DISABLED", 0, 0L);
        CACHE_DISABLED = cVar;
        c cVar2 = new c("TWENTY_SECONDS", 1, TimeUnit.SECONDS.toMillis(20L));
        TWENTY_SECONDS = cVar2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        c cVar3 = new c("ONE_DAY", 2, timeUnit.toMillis(1L));
        ONE_DAY = cVar3;
        c cVar4 = new c("TWO_DAYS", 3, timeUnit.toMillis(2L));
        TWO_DAYS = cVar4;
        c cVar5 = new c("THREE_DAYS", 4, timeUnit.toMillis(3L));
        THREE_DAYS = cVar5;
        c cVar6 = new c("FOUR_DAYS", 5, timeUnit.toMillis(4L));
        FOUR_DAYS = cVar6;
        f0final = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i11, long j11) {
        this.f1transient = j11;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f0final.clone();
    }

    public final long a() {
        return this.f1transient;
    }
}

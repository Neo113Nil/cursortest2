package com.payair.logic.cardvalidation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b "}, d2 = {"Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "", "", "isSupported", "()Z", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getCvvLength$core_release", "()Lkotlin/ranges/IntRange;", "cvvLength", util.h.xy.cb.b.f1091, "getPanLength$core_release", "panLength", "", "", "c", "Ljava/util/List;", "getPanPrefixes$core_release", "()Ljava/util/List;", "panPrefixes", "d", "Z", "getLuhn$core_release", "luhn", "Companion", "AMEX", "MAESTRO", "MAESTRO_UK", "MASTERCARD", "MASTERCARD_NEW", "VISA", "UNKNOWN"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IssuerCardSpecs {
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs AMEX;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs.Companion INSTANCE;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs MAESTRO;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs MAESTRO_UK;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs MASTERCARD;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs MASTERCARD_NEW;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs UNKNOWN;
    public static final com.payair.logic.cardvalidation.IssuerCardSpecs VISA;
    public static final java.util.List e;
    public static final /* synthetic */ com.payair.logic.cardvalidation.IssuerCardSpecs[] f;
    public static final /* synthetic */ kotlin.enums.EnumEntries g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final kotlin.ranges.IntRange cvvLength;

    /* renamed from: b, reason: from kotlin metadata */
    public final kotlin.ranges.IntRange panLength;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.util.List panPrefixes;

    /* renamed from: d, reason: from kotlin metadata */
    public final boolean luhn;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/payair/logic/cardvalidation/IssuerCardSpecs$Companion;", "", "", "pan", "Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "getIssuer", "(Ljava/lang/String;)Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "", "supported", "Ljava/util/List;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final com.payair.logic.cardvalidation.IssuerCardSpecs getIssuer(java.lang.String pan) {
            com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pan, "");
            com.payair.logic.cardvalidation.IssuerCardSpecs[] values = com.payair.logic.cardvalidation.IssuerCardSpecs.values();
            int length = values.length;
            int i = 0;
            loop0: while (true) {
                issuerCardSpecs = null;
                if (i >= length) {
                    break;
                }
                com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs2 = values[i];
                java.util.List<java.lang.String> panPrefixes$core_release = issuerCardSpecs2.getPanPrefixes$core_release();
                if (!(panPrefixes$core_release instanceof java.util.Collection) || !panPrefixes$core_release.isEmpty()) {
                    java.util.Iterator<T> it = panPrefixes$core_release.iterator();
                    while (it.hasNext()) {
                        if (kotlin.text.StringsKt.startsWith$default(pan, (java.lang.String) it.next(), false, 2, (java.lang.Object) null)) {
                            issuerCardSpecs = issuerCardSpecs2;
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return issuerCardSpecs == null ? com.payair.logic.cardvalidation.IssuerCardSpecs.UNKNOWN : issuerCardSpecs;
        }
    }

    static {
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs = new com.payair.logic.cardvalidation.IssuerCardSpecs("AMEX", 0, new kotlin.ranges.IntRange(4, 4), new kotlin.ranges.IntRange(15, 15), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"34", "37"}), true);
        AMEX = issuerCardSpecs;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs2 = new com.payair.logic.cardvalidation.IssuerCardSpecs("MAESTRO", 1, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(12, 19), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"5018", "5020", "5038", "5893", "6304", "6759", "6761", "6762", "6763", "0604", "6390"}), true);
        MAESTRO = issuerCardSpecs2;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs3 = new com.payair.logic.cardvalidation.IssuerCardSpecs("MAESTRO_UK", 2, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(12, 19), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"6759", "676770", "676774"}), true);
        MAESTRO_UK = issuerCardSpecs3;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs4 = new com.payair.logic.cardvalidation.IssuerCardSpecs("MASTERCARD", 3, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(16, 16), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"51", "52", "53", "54", "55"}), true);
        MASTERCARD = issuerCardSpecs4;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs5 = new com.payair.logic.cardvalidation.IssuerCardSpecs("MASTERCARD_NEW", 4, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(16, 19), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720"}), true);
        MASTERCARD_NEW = issuerCardSpecs5;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs6 = new com.payair.logic.cardvalidation.IssuerCardSpecs("VISA", 5, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(16, 16), kotlin.collections.CollectionsKt.listOf("4"), true);
        VISA = issuerCardSpecs6;
        com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs7 = new com.payair.logic.cardvalidation.IssuerCardSpecs("UNKNOWN", 6, new kotlin.ranges.IntRange(3, 3), new kotlin.ranges.IntRange(8, 19), kotlin.collections.CollectionsKt.emptyList(), false);
        UNKNOWN = issuerCardSpecs7;
        com.payair.logic.cardvalidation.IssuerCardSpecs[] issuerCardSpecsArr = {issuerCardSpecs, issuerCardSpecs2, issuerCardSpecs3, issuerCardSpecs4, issuerCardSpecs5, issuerCardSpecs6, issuerCardSpecs7};
        f = issuerCardSpecsArr;
        g = kotlin.enums.EnumEntriesKt.enumEntries(issuerCardSpecsArr);
        INSTANCE = new com.payair.logic.cardvalidation.IssuerCardSpecs.Companion(null);
        e = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.payair.logic.cardvalidation.IssuerCardSpecs[]{issuerCardSpecs6, issuerCardSpecs2, issuerCardSpecs3, issuerCardSpecs4, issuerCardSpecs5});
    }

    public IssuerCardSpecs(java.lang.String str, int i, kotlin.ranges.IntRange intRange, kotlin.ranges.IntRange intRange2, java.util.List list, boolean z) {
        this.cvvLength = intRange;
        this.panLength = intRange2;
        this.panPrefixes = list;
        this.luhn = z;
    }

    /* renamed from: getCvvLength$core_release, reason: from getter */
    public final kotlin.ranges.IntRange getCvvLength() {
        return this.cvvLength;
    }

    /* renamed from: getLuhn$core_release, reason: from getter */
    public final boolean getLuhn() {
        return this.luhn;
    }

    /* renamed from: getPanLength$core_release, reason: from getter */
    public final kotlin.ranges.IntRange getPanLength() {
        return this.panLength;
    }

    public final java.util.List<java.lang.String> getPanPrefixes$core_release() {
        return this.panPrefixes;
    }

    public final boolean isSupported() {
        return e.contains(this);
    }

    public static com.payair.logic.cardvalidation.IssuerCardSpecs[] values() {
        return (com.payair.logic.cardvalidation.IssuerCardSpecs[]) f.clone();
    }

    public static com.payair.logic.cardvalidation.IssuerCardSpecs valueOf(java.lang.String str) {
        return (com.payair.logic.cardvalidation.IssuerCardSpecs) java.lang.Enum.valueOf(com.payair.logic.cardvalidation.IssuerCardSpecs.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.cardvalidation.IssuerCardSpecs> getEntries() {
        return g;
    }
}

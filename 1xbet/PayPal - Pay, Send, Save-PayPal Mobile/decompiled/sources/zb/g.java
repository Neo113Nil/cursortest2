package zb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class g {
    public static final zb.g A;
    public static final zb.g B;
    public static final zb.g C;
    public static final zb.g D;
    public static final zb.g E;
    public static final zb.g F;
    public static final zb.g G;
    public static final zb.g H;
    public static final zb.g I;
    public static final zb.g J;
    public static final zb.g K;
    public static final zb.g L;
    public static final zb.g M;
    public static final zb.g N;
    public static final zb.g O;
    public static final zb.g P;
    public static final zb.g Q;
    public static final zb.g R;
    public static final zb.g S;
    public static final zb.g T;
    public static final zb.g U;
    public static final zb.g V;
    public static final zb.g W;
    public static final zb.g X;
    public static final zb.g Y;
    public static final zb.g Z;

    /* renamed from: a, reason: collision with root package name */
    public static final zb.g f7095a;
    public static final /* synthetic */ zb.g[] a0;
    public static final zb.g b;
    public static final zb.g c;
    public static final zb.g d;
    public static final zb.g e;
    public static final zb.g f;
    public static final zb.g g;
    public static final zb.g h;
    public static final zb.g i;
    public static final zb.g j;
    public static final zb.g k;
    public static final zb.g l;
    public static final zb.g m;
    public static final zb.g n;

    /* renamed from: o, reason: collision with root package name */
    public static final zb.g f7096o;
    public static final zb.g p;
    public static final zb.g q;
    public static final zb.g r;
    public static final zb.g s;
    public static final zb.g t;
    public static final zb.g u;
    public static final zb.g v;
    public static final zb.g w;
    public static final zb.g x;
    public static final zb.g y;
    public static final zb.g z;
    public final java.lang.String b0;
    public final zb.g.b c0;
    public final int d0;
    public final zb.g.a e0;

    public enum a {
        Mandatory,
        Optional
    }

    public enum b {
        Numeric,
        CompressedNumeric,
        AlphanumericSpecial,
        Alphanumeric,
        Binary,
        Var,
        Unknown
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.b0;
    }

    public final common.emv.util.Tag a() {
        return new common.emv.util.Tag(this.d0);
    }

    public static zb.g[] values() {
        return (zb.g[]) a0.clone();
    }

    public static zb.g valueOf(java.lang.String str) {
        return (zb.g) java.lang.Enum.valueOf(zb.g.class, str);
    }

    public static zb.g a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        zb.g[] values = values();
        for (int i2 = 0; i2 < 52; i2++) {
            zb.g gVar = values[i2];
            if (gVar.b0.equals(str)) {
                return gVar;
            }
        }
        return null;
    }

    public g(java.lang.String str, int i2, java.lang.String str2, zb.g.b bVar, zb.g.a aVar) {
        this.b0 = str2;
        this.d0 = java.lang.Integer.parseInt(str2, 16);
        this.c0 = bVar;
        this.e0 = aVar;
    }

    public g(java.lang.String str, int i2, java.lang.String str2, zb.g.b bVar) {
        this.b0 = str2;
        this.d0 = java.lang.Integer.parseInt(str2, 16);
        this.c0 = bVar;
        this.e0 = zb.g.a.Mandatory;
    }

    static {
        zb.g.b bVar = zb.g.b.Numeric;
        zb.g gVar = new zb.g("TRX_AMOUNT", 0, "9F02", bVar);
        f7095a = gVar;
        zb.g gVar2 = new zb.g("TRX_AMOUNT_OTHER", 1, "9F03", bVar);
        b = gVar2;
        zb.g gVar3 = new zb.g("TRX_DATE", 2, "9A", bVar);
        c = gVar3;
        zb.g gVar4 = new zb.g("TRX_TIME", 3, "9F21", bVar);
        d = gVar4;
        zb.g gVar5 = new zb.g("TRX_TYPE", 4, "9C", bVar);
        e = gVar5;
        zb.g.b bVar2 = zb.g.b.Binary;
        zb.g gVar6 = new zb.g("TRX_UNPREDICTABLE_NUMBER", 5, "9F37", bVar2);
        f = gVar6;
        zb.g gVar7 = new zb.g("TRX_CURRENCY_CODE", 6, "5F2A", bVar);
        g = gVar7;
        zb.g gVar8 = new zb.g("TRX_CURRENCY_EXPONENT", 7, "5F36", bVar);
        h = gVar8;
        zb.g gVar9 = new zb.g("POI_INFORMATION", 8, "8B", bVar2);
        i = gVar9;
        zb.g gVar10 = new zb.g("TRX_AUTHORISATION_RESPONSE_CODE", 9, "8A", zb.g.b.Alphanumeric);
        j = gVar10;
        zb.g gVar11 = new zb.g("TRX_ISSUER_AUTHENTICATION_DATA", 10, "91", bVar2);
        k = gVar11;
        zb.g gVar12 = new zb.g("TRX_ISSUER_SCRIPT_TEMPLATE_1", 11, "71", bVar2);
        l = gVar12;
        zb.g gVar13 = new zb.g("TRX_ISSUER_SCRIPT_TEMPLATE_2", 12, "72", bVar2);
        m = gVar13;
        zb.g.b bVar3 = zb.g.b.Var;
        zb.g gVar14 = new zb.g("FCI_TEMPLATE", 13, "6F", bVar3);
        n = gVar14;
        zb.g gVar15 = new zb.g("DF_NAME", 14, "84", bVar2);
        f7096o = gVar15;
        zb.g gVar16 = new zb.g("FCI_PROPRIETARY_TEMPLATE", 15, "A5", bVar3);
        p = gVar16;
        zb.g gVar17 = new zb.g("FCI_ISSUER_DISCRETIONARY_DATA", 16, "BF0C", bVar3);
        q = gVar17;
        zb.g gVar18 = new zb.g("DE_TEMPLATE", 17, "61", bVar3);
        r = gVar18;
        zb.g gVar19 = new zb.g("ADF_NAME", 18, "4F", bVar2);
        s = gVar19;
        zb.g.b bVar4 = zb.g.b.AlphanumericSpecial;
        zb.g.a aVar = zb.g.a.Optional;
        zb.g gVar20 = new zb.g("APP_LABEL", 19, "50", bVar4, aVar);
        t = gVar20;
        zb.g gVar21 = new zb.g("APP_PRIORITY", 20, "87", bVar2, aVar);
        u = gVar21;
        zb.g gVar22 = new zb.g("KERNEL_IDENTIFIER", 21, "9F2A", bVar2, aVar);
        v = gVar22;
        zb.g gVar23 = new zb.g("EXTENDED_SELECTION", 22, "9F29", bVar2, aVar);
        w = gVar23;
        zb.g gVar24 = new zb.g("PDOL", 23, "9F38", bVar2);
        x = gVar24;
        zb.g gVar25 = new zb.g("VISA_PROP_TAG", 24, my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F66_TERMINAL_TRANSACTION_QUALIFIERS_TTQ, bVar2);
        y = gVar25;
        zb.g gVar26 = new zb.g("TERM_AID_VALUES_SUPPORTED", 25, "DF7F", bVar2);
        z = gVar26;
        zb.g gVar27 = new zb.g("TERM_COUNTRY_CODE", 26, "9F1A", bVar);
        A = gVar27;
        zb.g gVar28 = new zb.g("TERM_MERCHANT_CATEGORY_CODE", 27, "9F15", bVar);
        B = gVar28;
        zb.g gVar29 = new zb.g("TERM_MERCHANT_NAME_AND_LOCATION", 28, "9F4E", bVar4);
        C = gVar29;
        zb.g gVar30 = new zb.g("TERM_TERMINAL_CAPABILITIES", 29, "9F33", bVar2);
        D = gVar30;
        zb.g gVar31 = new zb.g("TERM_TRANSACTION_SEQ_COUNTER", 30, "9F41", bVar);
        E = gVar31;
        zb.g gVar32 = new zb.g("CONTACTLESS_POS_IMPLEMENTATION_OPTIONS", 31, "DFCA06", bVar2);
        F = gVar32;
        zb.g gVar33 = new zb.g("CONTACTLESS_KERNEL_CAPABILITIES", 32, "DFCA05", bVar2);
        G = gVar33;
        zb.g gVar34 = new zb.g("ISSUER_IDENTIFICATION_NUMBER", 33, androidx.room.RoomMasterTable.DEFAULT_ID, bVar2, aVar);
        H = gVar34;
        zb.g gVar35 = new zb.g("APP_SELECTION_INDICATOR", 34, "DFCB01", bVar2);
        I = gVar35;
        zb.g gVar36 = new zb.g("VISA_RISK_PARAMETERS_CHECKING_CAPABILITIES", 35, "DFC301", bVar2);
        J = gVar36;
        zb.g gVar37 = new zb.g("VISA_TERM_CATEGORIES_SUPPORTED_LIST", 36, "9F3E", bVar2, aVar);
        K = gVar37;
        zb.g gVar38 = new zb.g("VISA_TERM_CATEGORY", 37, "0001", bVar2, aVar);
        L = gVar38;
        zb.g gVar39 = new zb.g("VISA_SDOL", 38, "9F3F", bVar2, aVar);
        M = gVar39;
        zb.g gVar40 = new zb.g("AMEX_CONTACTLESS_READER_CAPABILITIES", 39, "9F6D", bVar2);
        N = gVar40;
        zb.g gVar41 = new zb.g("AMEX_ENHANCED_CONTACTLESS_READER_CAPABILITIES", 40, "9F6E", bVar2);
        O = gVar41;
        zb.g gVar42 = new zb.g("AMEX_UNABLE_TO_GO_ONLINE", 41, "DFC401", bVar2);
        P = gVar42;
        zb.g gVar43 = new zb.g("UPI_CARD_ADDITIONAL_FUNCTION_INDICATOR", 42, "DF61", bVar2);
        Q = gVar43;
        zb.g gVar44 = new zb.g("MC_TRANSACTION_CATEGORY_CODE", 43, "9F53", bVar2);
        R = gVar44;
        zb.g gVar45 = new zb.g("MC_MERCHANT_CUSTOM_DATA", 44, "9F7C", bVar2);
        S = gVar45;
        zb.g gVar46 = new zb.g(com.zettle.sdk.commons.network.JsonKt.KEY_ACCOUNT_TYPE, 45, "5F57", bVar2);
        T = gVar46;
        zb.g gVar47 = new zb.g("ERROR_INDICATION", 46, "DF8115", bVar2);
        U = gVar47;
        zb.g gVar48 = new zb.g("DISCRETIONARY_DATA", 47, "FF8106", bVar2);
        V = gVar48;
        zb.g gVar49 = new zb.g("OUTCOME_PARAMETER_SET", 48, "DF8129", bVar2);
        W = gVar49;
        zb.g gVar50 = new zb.g("SELECTED_COMBINATION", 49, "DF812E", bVar2);
        X = gVar50;
        zb.g gVar51 = new zb.g("STATUS_BYTES", 50, "DF812F", bVar2);
        Y = gVar51;
        zb.g gVar52 = new zb.g("KERNEL_IDENTIFIER_TERMINAL", 51, "96", zb.g.b.Binary);
        Z = gVar52;
        a0 = new zb.g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25, gVar26, gVar27, gVar28, gVar29, gVar30, gVar31, gVar32, gVar33, gVar34, gVar35, gVar36, gVar37, gVar38, gVar39, gVar40, gVar41, gVar42, gVar43, gVar44, gVar45, gVar46, gVar47, gVar48, gVar49, gVar50, gVar51, gVar52};
    }
}

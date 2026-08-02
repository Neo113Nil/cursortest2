package P60;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AMINA;
    public static final a APP_RUID;
    public static final a AVOSEND;
    public static final a DEPORTATION_CHECK_PATENT;
    public static final a KORONA_PAY;
    public static final a KWIKPAY;
    public static final a MIGRANT_CENTER_PATENT_WORK_DEPORTATION_CHECK;
    public static final a MIGRANT_ONLINE;
    public static final a MIGRANT_SERVICE_WORK_AND_HOUSING_IN_RF;
    public static final a PAYSEND;
    private final String packageName;

    static {
        a aVar = new a("AMINA", 0, "ru.mos.amina.app");
        AMINA = aVar;
        a aVar2 = new a("MIGRANT_SERVICE_WORK_AND_HOUSING_IN_RF", 1, "mmc63.ru");
        MIGRANT_SERVICE_WORK_AND_HOUSING_IN_RF = aVar2;
        a aVar3 = new a("MIGRANT_CENTER_PATENT_WORK_DEPORTATION_CHECK", 2, "mmcmig.ru");
        MIGRANT_CENTER_PATENT_WORK_DEPORTATION_CHECK = aVar3;
        a aVar4 = new a("DEPORTATION_CHECK_PATENT", 3, "migdeport.ru");
        DEPORTATION_CHECK_PATENT = aVar4;
        a aVar5 = new a("MIGRANT_ONLINE", 4, "informer.irsvlg.ru");
        MIGRANT_ONLINE = aVar5;
        a aVar6 = new a("APP_RUID", 5, "ru.gosuslugi.migrant");
        APP_RUID = aVar6;
        a aVar7 = new a("KORONA_PAY", 6, "ru.tsk.ftc.bender.qpay");
        KORONA_PAY = aVar7;
        a aVar8 = new a("PAYSEND", 7, "com.paysend.app");
        PAYSEND = aVar8;
        a aVar9 = new a("KWIKPAY", 8, "com.kwikpay.transfers");
        KWIKPAY = aVar9;
        a aVar10 = new a("AVOSEND", 9, "com.paysett.app");
        AVOSEND = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a(String str, int i11, String str2) {
        this.packageName = str2;
    }

    @NotNull
    public static Xc.a<a> a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.packageName;
    }
}

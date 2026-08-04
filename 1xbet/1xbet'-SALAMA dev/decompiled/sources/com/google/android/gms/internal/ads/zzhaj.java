package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class zzhaj {
    public static final zzhaj zza;
    public static final zzhaj zzb;
    public static final zzhaj zzc;
    public static final zzhaj zzd;
    public static final zzhaj zze;
    public static final zzhaj zzf;
    public static final zzhaj zzg;
    public static final zzhaj zzh;
    public static final zzhaj zzi;
    public static final zzhaj zzj;
    public static final zzhaj zzk;
    public static final zzhaj zzl;
    public static final zzhaj zzm;
    public static final zzhaj zzn;
    public static final zzhaj zzo;
    public static final zzhaj zzp;
    public static final zzhaj zzq;
    public static final zzhaj zzr;
    private static final /* synthetic */ zzhaj[] zzs;
    private final zzhak zzt;

    static {
        zzhaj zzhajVar = new zzhaj("DOUBLE", 0, zzhak.DOUBLE, 1);
        zza = zzhajVar;
        zzhaj zzhajVar2 = new zzhaj("FLOAT", 1, zzhak.FLOAT, 5);
        zzb = zzhajVar2;
        zzhak zzhakVar = zzhak.LONG;
        zzhaj zzhajVar3 = new zzhaj("INT64", 2, zzhakVar, 0);
        zzc = zzhajVar3;
        zzhaj zzhajVar4 = new zzhaj("UINT64", 3, zzhakVar, 0);
        zzd = zzhajVar4;
        zzhak zzhakVar2 = zzhak.INT;
        zzhaj zzhajVar5 = new zzhaj("INT32", 4, zzhakVar2, 0);
        zze = zzhajVar5;
        zzhaj zzhajVar6 = new zzhaj("FIXED64", 5, zzhakVar, 1);
        zzf = zzhajVar6;
        zzhaj zzhajVar7 = new zzhaj("FIXED32", 6, zzhakVar2, 5);
        zzg = zzhajVar7;
        zzhaj zzhajVar8 = new zzhaj("BOOL", 7, zzhak.BOOLEAN, 0);
        zzh = zzhajVar8;
        zzhaj zzhajVar9 = new zzhaj("STRING", 8, zzhak.STRING, 2);
        zzi = zzhajVar9;
        zzhak zzhakVar3 = zzhak.MESSAGE;
        zzhaj zzhajVar10 = new zzhaj("GROUP", 9, zzhakVar3, 3);
        zzj = zzhajVar10;
        zzhaj zzhajVar11 = new zzhaj("MESSAGE", 10, zzhakVar3, 2);
        zzk = zzhajVar11;
        zzhaj zzhajVar12 = new zzhaj("BYTES", 11, zzhak.BYTE_STRING, 2);
        zzl = zzhajVar12;
        zzhaj zzhajVar13 = new zzhaj("UINT32", 12, zzhakVar2, 0);
        zzm = zzhajVar13;
        zzhaj zzhajVar14 = new zzhaj("ENUM", 13, zzhak.ENUM, 0);
        zzn = zzhajVar14;
        zzhaj zzhajVar15 = new zzhaj("SFIXED32", 14, zzhakVar2, 5);
        zzo = zzhajVar15;
        zzhaj zzhajVar16 = new zzhaj("SFIXED64", 15, zzhakVar, 1);
        zzp = zzhajVar16;
        zzhaj zzhajVar17 = new zzhaj("SINT32", 16, zzhakVar2, 0);
        zzq = zzhajVar17;
        zzhaj zzhajVar18 = new zzhaj("SINT64", 17, zzhakVar, 0);
        zzr = zzhajVar18;
        zzs = new zzhaj[]{zzhajVar, zzhajVar2, zzhajVar3, zzhajVar4, zzhajVar5, zzhajVar6, zzhajVar7, zzhajVar8, zzhajVar9, zzhajVar10, zzhajVar11, zzhajVar12, zzhajVar13, zzhajVar14, zzhajVar15, zzhajVar16, zzhajVar17, zzhajVar18};
    }

    private zzhaj(String str, int i7, zzhak zzhakVar, int i8) {
        super(str, i7);
        this.zzt = zzhakVar;
    }

    public static zzhaj[] values() {
        return (zzhaj[]) zzs.clone();
    }

    public final zzhak zza() {
        return this.zzt;
    }
}

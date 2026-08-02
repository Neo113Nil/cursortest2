package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzgxx {
    public static final zzgxx zza;
    public static final zzgxx zzb;
    public static final zzgxx zzc;
    public static final zzgxx zzd;
    public static final zzgxx zze;
    public static final zzgxx zzf;
    public static final zzgxx zzg;
    public static final zzgxx zzh;
    public static final zzgxx zzi;
    public static final zzgxx zzj;
    private static final /* synthetic */ zzgxx[] zzk;
    private final Class zzl;

    static {
        zzgxx zzgxxVar = new zzgxx("VOID", 0, Void.class, Void.class, null);
        zza = zzgxxVar;
        Class cls = Integer.TYPE;
        zzgxx zzgxxVar2 = new zzgxx("INT", 1, cls, Integer.class, 0);
        zzb = zzgxxVar2;
        zzgxx zzgxxVar3 = new zzgxx("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgxxVar3;
        zzgxx zzgxxVar4 = new zzgxx("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgxxVar4;
        zzgxx zzgxxVar5 = new zzgxx("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgxxVar5;
        zzgxx zzgxxVar6 = new zzgxx("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgxxVar6;
        zzgxx zzgxxVar7 = new zzgxx("STRING", 6, String.class, String.class, "");
        zzg = zzgxxVar7;
        zzgxx zzgxxVar8 = new zzgxx("BYTE_STRING", 7, zzgvy.class, zzgvy.class, zzgvy.zzb);
        zzh = zzgxxVar8;
        zzgxx zzgxxVar9 = new zzgxx("ENUM", 8, cls, Integer.class, null);
        zzi = zzgxxVar9;
        zzgxx zzgxxVar10 = new zzgxx("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgxxVar10;
        zzk = new zzgxx[]{zzgxxVar, zzgxxVar2, zzgxxVar3, zzgxxVar4, zzgxxVar5, zzgxxVar6, zzgxxVar7, zzgxxVar8, zzgxxVar9, zzgxxVar10};
    }

    private zzgxx(String str, int i7, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgxx[] values() {
        return (zzgxx[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

package V70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HIGH;
    public static final a LOW;
    public static final a MEDIUM;
    private final int bitRate;
    private final int sampleRate;

    static {
        a aVar = new a("LOW", 0, 64000, 22050);
        LOW = aVar;
        a aVar2 = new a("MEDIUM", 1, 128000, 44100);
        MEDIUM = aVar2;
        a aVar3 = new a("HIGH", 2, 256000, 48000);
        HIGH = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a(String str, int i11, int i12, int i13) {
        this.bitRate = i12;
        this.sampleRate = i13;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.bitRate;
    }

    public final int b() {
        return this.sampleRate;
    }
}

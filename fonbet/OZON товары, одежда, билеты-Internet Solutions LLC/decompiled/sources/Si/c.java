package Si;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Images;
    public static final c ImagesAndVideos;
    public static final c None;
    public static final c Videos;

    static {
        c cVar = new c("None", 0);
        None = cVar;
        c cVar2 = new c("Images", 1);
        Images = cVar2;
        c cVar3 = new c("Videos", 2);
        Videos = cVar3;
        c cVar4 = new c("ImagesAndVideos", 3);
        ImagesAndVideos = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}

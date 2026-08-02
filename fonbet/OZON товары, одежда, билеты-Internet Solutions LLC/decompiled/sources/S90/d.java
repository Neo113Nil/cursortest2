package S90;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d MOB_NATIVE_NOTIFICATION_PERMISSION;
    public static final d MOB_NATIVE_ONBOARDING;
    public static final d MOB_ONBOARDING_TEXT;

    static {
        d dVar = new d("MOB_NATIVE_NOTIFICATION_PERMISSION", 0);
        MOB_NATIVE_NOTIFICATION_PERMISSION = dVar;
        d dVar2 = new d("MOB_ONBOARDING_TEXT", 1);
        MOB_ONBOARDING_TEXT = dVar2;
        d dVar3 = new d("MOB_NATIVE_ONBOARDING", 2);
        MOB_NATIVE_ONBOARDING = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}

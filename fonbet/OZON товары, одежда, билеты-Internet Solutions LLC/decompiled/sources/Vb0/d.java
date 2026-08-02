package Vb0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ANTIBOT;
    public static final d CAPTCHA;
    public static final d FINTECH_RECOVERY;
    public static final d JS_CHALLENGE;
    public static final d OZON_ID_AUTH;

    @NotNull
    private final String value;

    static {
        d dVar = new d("CAPTCHA", 0, "Captcha");
        CAPTCHA = dVar;
        d dVar2 = new d("JS_CHALLENGE", 1, "JsChallenge");
        JS_CHALLENGE = dVar2;
        d dVar3 = new d("ANTIBOT", 2, "Antibot");
        ANTIBOT = dVar3;
        d dVar4 = new d("OZON_ID_AUTH", 3, "OzonIdAuth");
        OZON_ID_AUTH = dVar4;
        d dVar5 = new d("FINTECH_RECOVERY", 4, "FintechRecovery");
        FINTECH_RECOVERY = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d(String str, int i11, String str2) {
        this.value = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}

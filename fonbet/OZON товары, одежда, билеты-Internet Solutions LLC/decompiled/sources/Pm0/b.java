package Pm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    public static final b None;
    public static final b RequestAudioFocus;
    public static final b Timer;

    /* renamed from: transient, reason: not valid java name */
    private static final /* synthetic */ b[] f9transient;

    static {
        b bVar = new b("None", 0);
        None = bVar;
        b bVar2 = new b("RequestAudioFocus", 1);
        RequestAudioFocus = bVar2;
        b bVar3 = new b("Timer", 2);
        Timer = bVar3;
        f9transient = new b[]{bVar, bVar2, bVar3};
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f9transient.clone();
    }
}

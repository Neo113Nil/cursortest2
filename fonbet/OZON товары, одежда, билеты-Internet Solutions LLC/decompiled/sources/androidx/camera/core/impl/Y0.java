package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Y0 {
    private static final /* synthetic */ Y0[] $VALUES;
    public static final Y0 REALTIME;
    public static final Y0 UPTIME;

    static {
        Y0 y02 = new Y0("UPTIME", 0);
        UPTIME = y02;
        Y0 y03 = new Y0("REALTIME", 1);
        REALTIME = y03;
        $VALUES = new Y0[]{y02, y03};
    }

    private Y0() {
        throw null;
    }

    public static Y0 valueOf(String str) {
        return (Y0) Enum.valueOf(Y0.class, str);
    }

    public static Y0[] values() {
        return (Y0[]) $VALUES.clone();
    }
}

package a5;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0200b {

    /* renamed from: b, reason: collision with root package name */
    public static final E f3916b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0200b f3917c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0200b f3918d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0200b f3919e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0200b f3920f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0200b f3921g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0200b f3922h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0200b[] f3923i;

    /* renamed from: a, reason: collision with root package name */
    public final int f3924a;

    static {
        EnumC0200b enumC0200b = new EnumC0200b("NO_ERROR", 0, 0);
        f3917c = enumC0200b;
        EnumC0200b enumC0200b2 = new EnumC0200b("PROTOCOL_ERROR", 1, 1);
        f3918d = enumC0200b2;
        EnumC0200b enumC0200b3 = new EnumC0200b("INTERNAL_ERROR", 2, 2);
        f3919e = enumC0200b3;
        EnumC0200b enumC0200b4 = new EnumC0200b("FLOW_CONTROL_ERROR", 3, 3);
        f3920f = enumC0200b4;
        EnumC0200b enumC0200b5 = new EnumC0200b("SETTINGS_TIMEOUT", 4, 4);
        EnumC0200b enumC0200b6 = new EnumC0200b("STREAM_CLOSED", 5, 5);
        EnumC0200b enumC0200b7 = new EnumC0200b("FRAME_SIZE_ERROR", 6, 6);
        EnumC0200b enumC0200b8 = new EnumC0200b("REFUSED_STREAM", 7, 7);
        f3921g = enumC0200b8;
        EnumC0200b enumC0200b9 = new EnumC0200b("CANCEL", 8, 8);
        f3922h = enumC0200b9;
        EnumC0200b[] enumC0200bArr = {enumC0200b, enumC0200b2, enumC0200b3, enumC0200b4, enumC0200b5, enumC0200b6, enumC0200b7, enumC0200b8, enumC0200b9, new EnumC0200b("COMPRESSION_ERROR", 9, 9), new EnumC0200b("CONNECT_ERROR", 10, 10), new EnumC0200b("ENHANCE_YOUR_CALM", 11, 11), new EnumC0200b("INADEQUATE_SECURITY", 12, 12), new EnumC0200b("HTTP_1_1_REQUIRED", 13, 13)};
        f3923i = enumC0200bArr;
        AbstractC1477a.n(enumC0200bArr);
        f3916b = new E();
    }

    public EnumC0200b(String str, int i2, int i3) {
        this.f3924a = i3;
    }

    public static EnumC0200b valueOf(String str) {
        return (EnumC0200b) Enum.valueOf(EnumC0200b.class, str);
    }

    public static EnumC0200b[] values() {
        return (EnumC0200b[]) f3923i.clone();
    }
}

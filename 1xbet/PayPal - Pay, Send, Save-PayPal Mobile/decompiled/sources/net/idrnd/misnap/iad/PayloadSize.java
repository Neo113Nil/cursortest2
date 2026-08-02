package net.idrnd.misnap.iad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lnet/idrnd/misnap/iad/PayloadSize;", "", "Normal", "Small"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class PayloadSize {
    public static final net.idrnd.misnap.iad.PayloadSize Normal;
    public static final net.idrnd.misnap.iad.PayloadSize Small;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ net.idrnd.misnap.iad.PayloadSize[] f7020a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        net.idrnd.misnap.iad.PayloadSize payloadSize = new net.idrnd.misnap.iad.PayloadSize("Normal", 0);
        Normal = payloadSize;
        net.idrnd.misnap.iad.PayloadSize payloadSize2 = new net.idrnd.misnap.iad.PayloadSize("Small", 1);
        Small = payloadSize2;
        net.idrnd.misnap.iad.PayloadSize[] payloadSizeArr = {payloadSize, payloadSize2};
        f7020a = payloadSizeArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(payloadSizeArr);
    }

    public PayloadSize(java.lang.String str, int i) {
    }

    public static net.idrnd.misnap.iad.PayloadSize[] values() {
        return (net.idrnd.misnap.iad.PayloadSize[]) f7020a.clone();
    }

    public static net.idrnd.misnap.iad.PayloadSize valueOf(java.lang.String str) {
        return (net.idrnd.misnap.iad.PayloadSize) java.lang.Enum.valueOf(net.idrnd.misnap.iad.PayloadSize.class, str);
    }

    public static kotlin.enums.EnumEntries<net.idrnd.misnap.iad.PayloadSize> getEntries() {
        return b;
    }
}

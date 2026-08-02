package net.idrnd.misnap.iad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lnet/idrnd/misnap/iad/ReadyToCapture;", "", "Yes", "No"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class ReadyToCapture {
    public static final net.idrnd.misnap.iad.ReadyToCapture No;
    public static final net.idrnd.misnap.iad.ReadyToCapture Yes;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ net.idrnd.misnap.iad.ReadyToCapture[] f7024a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        net.idrnd.misnap.iad.ReadyToCapture readyToCapture = new net.idrnd.misnap.iad.ReadyToCapture("Yes", 0);
        Yes = readyToCapture;
        net.idrnd.misnap.iad.ReadyToCapture readyToCapture2 = new net.idrnd.misnap.iad.ReadyToCapture("No", 1);
        No = readyToCapture2;
        net.idrnd.misnap.iad.ReadyToCapture[] readyToCaptureArr = {readyToCapture, readyToCapture2};
        f7024a = readyToCaptureArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(readyToCaptureArr);
    }

    public ReadyToCapture(java.lang.String str, int i) {
    }

    public static net.idrnd.misnap.iad.ReadyToCapture[] values() {
        return (net.idrnd.misnap.iad.ReadyToCapture[]) f7024a.clone();
    }

    public static net.idrnd.misnap.iad.ReadyToCapture valueOf(java.lang.String str) {
        return (net.idrnd.misnap.iad.ReadyToCapture) java.lang.Enum.valueOf(net.idrnd.misnap.iad.ReadyToCapture.class, str);
    }

    public static kotlin.enums.EnumEntries<net.idrnd.misnap.iad.ReadyToCapture> getEntries() {
        return b;
    }
}

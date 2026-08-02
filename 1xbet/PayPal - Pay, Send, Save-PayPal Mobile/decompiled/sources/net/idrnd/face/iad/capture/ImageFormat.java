package net.idrnd.face.iad.capture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lnet/idrnd/face/iad/capture/ImageFormat;", "", "JPEG", "PNG", "RGB_888", "ARGB_8888", "YUV_420_888"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class ImageFormat {
    public static final net.idrnd.face.iad.capture.ImageFormat ARGB_8888;
    public static final net.idrnd.face.iad.capture.ImageFormat JPEG;
    public static final net.idrnd.face.iad.capture.ImageFormat PNG;
    public static final net.idrnd.face.iad.capture.ImageFormat RGB_888;
    public static final net.idrnd.face.iad.capture.ImageFormat YUV_420_888;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ net.idrnd.face.iad.capture.ImageFormat[] f6949a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        net.idrnd.face.iad.capture.ImageFormat imageFormat = new net.idrnd.face.iad.capture.ImageFormat("JPEG", 0);
        JPEG = imageFormat;
        net.idrnd.face.iad.capture.ImageFormat imageFormat2 = new net.idrnd.face.iad.capture.ImageFormat("PNG", 1);
        PNG = imageFormat2;
        net.idrnd.face.iad.capture.ImageFormat imageFormat3 = new net.idrnd.face.iad.capture.ImageFormat("RGB_888", 2);
        RGB_888 = imageFormat3;
        net.idrnd.face.iad.capture.ImageFormat imageFormat4 = new net.idrnd.face.iad.capture.ImageFormat("ARGB_8888", 3);
        ARGB_8888 = imageFormat4;
        net.idrnd.face.iad.capture.ImageFormat imageFormat5 = new net.idrnd.face.iad.capture.ImageFormat("YUV_420_888", 4);
        YUV_420_888 = imageFormat5;
        net.idrnd.face.iad.capture.ImageFormat[] imageFormatArr = {imageFormat, imageFormat2, imageFormat3, imageFormat4, imageFormat5};
        f6949a = imageFormatArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(imageFormatArr);
    }

    public ImageFormat(java.lang.String str, int i) {
    }

    public static net.idrnd.face.iad.capture.ImageFormat[] values() {
        return (net.idrnd.face.iad.capture.ImageFormat[]) f6949a.clone();
    }

    public static net.idrnd.face.iad.capture.ImageFormat valueOf(java.lang.String str) {
        return (net.idrnd.face.iad.capture.ImageFormat) java.lang.Enum.valueOf(net.idrnd.face.iad.capture.ImageFormat.class, str);
    }

    public static kotlin.enums.EnumEntries<net.idrnd.face.iad.capture.ImageFormat> getEntries() {
        return b;
    }
}

package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "<init>", "(Ljava/lang/String;I)V", "Cursor", "SelectionStart", "SelectionEnd"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Handle {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ androidx.compose.foundation.text.Handle[] getHighSpeedVideoSizes;
    public static final androidx.compose.foundation.text.Handle Cursor = new androidx.compose.foundation.text.Handle("Cursor", 0);
    public static final androidx.compose.foundation.text.Handle SelectionStart = new androidx.compose.foundation.text.Handle("SelectionStart", 1);
    public static final androidx.compose.foundation.text.Handle SelectionEnd = new androidx.compose.foundation.text.Handle("SelectionEnd", 2);

    private Handle(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.Handle[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap2);
    }

    public static androidx.compose.foundation.text.Handle[] values() {
        return (androidx.compose.foundation.text.Handle[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.foundation.text.Handle valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.Handle) java.lang.Enum.valueOf(androidx.compose.foundation.text.Handle.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.Handle> getEntries() {
        return Camera2StreamConfigurationMap;
    }

    private static final /* synthetic */ androidx.compose.foundation.text.Handle[] Camera2StreamConfigurationMap() {
        return new androidx.compose.foundation.text.Handle[]{Cursor, SelectionStart, SelectionEnd};
    }
}
